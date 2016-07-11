package ness.tomerbu.edu.fragmentsdemo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.

            switch (position) {
                case 0:
                    return new DateFragment();
                case 1:
                    return new ColorFragment();
                case 2:
                    return new TimePickerFragment();
                case 3:
                    return new DateFragment();
                case 4:
                    return new ColorFragment();
                case 5:
                    return new TimePickerFragment();
                case 6:
                    return new DateFragment();
                case 7:
                    return new ColorFragment();
                case 8:
                    return new TimePickerFragment();
            }
            return null;
            
        }

        @Override
        public int getCount() {
            // Show 9 total pages.
            return 9;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "Date";
                case 1:
                    return "Color";
                case 2:
                    return "Time";
                case 3:
                    return "Date";
                case 4:
                    return "Color";
                case 5:
                    return "Time";
                case 6:
                    return "Date";
                case 7:
                    return "Color";
                case 8:
                    return "Time";
            }
            return null;
        }
    }