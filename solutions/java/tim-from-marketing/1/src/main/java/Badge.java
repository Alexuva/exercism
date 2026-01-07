class Badge {
    public String print(Integer id, String name, String department) {
        String departmentText = department == null ? " - OWNER" : " - " + department.toUpperCase();
        String idText = id == null ? "" : "[" + id + "] - ";
        return idText + name + departmentText;
    };

}
