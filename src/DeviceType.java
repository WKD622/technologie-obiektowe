public enum DeviceType {
    android,
    blackberyy,
    ios,
    windows_phone;

    @Override
    public String toString() {
        switch (this) {
            case windows_phone:
                return "Windows Phone";
            case ios:
                return "iOS";
            case blackberyy:
                return "Blackberry";
            case android:
                return "Android";
            default:
                return "Other";
        }
    }
}
