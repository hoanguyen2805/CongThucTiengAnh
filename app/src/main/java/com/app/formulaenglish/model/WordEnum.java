package com.app.formulaenglish.model;

public enum WordEnum {
    SENTENCE_0(1, "Danh từ",
            "Các loại danh từ, danh từ đếm được và không đếm được, danh từ số ít..",
            new String[]{"Các loại danh từ", "Danh từ đếm được và danh từ không đếm được", "Danh từ số ít và danh từ số nhiều", "500 danh từ bất quy tắc"},
            null,
            new String[]{"danhtu_cacloaidanhtu", "danhtu_demduoc", "danhtu_danhtusoit", "danhtu_batquytac"}),

    SENTENCE_1(1, "Động từ",
            "Động từ khuyết thiếu, nội động từ và ngoại động từ",
            new String[]{"Động từ khuyết thiếu", "Nội động từ và ngoại động từ"},
            null,
            new String[]{"dongtu_khuyetthieu", "dongtu_noidongtu"}),

    SENTENCE_2(1, "Tính từ",
            "Vị trí tính từ, tính từ tận cùng bằng -ing và -ed, tính từ ghép, kép..",
            new String[]{"Vị trí tính từ", "Tính từ tận cùng bằng -ing và -ed", "Tính từ kép/ghép", "528 tính từ thường gặp"},
            null,
            new String[]{"tinhtu_vitri", "tinhtu_tancung", "tinhtu_ghep", "tinhtu_thuonggap"}),

    SENTENCE_3(1, "Trạng từ",
            "Vị trí trạng từ, các loại trạng từ, phân loại trạng từ, 250 trạng từ thường gặp",
            new String[]{"Vị trí trạng từ", "Các loại trạng từ", "Phân loại trạng từ", "250 trạng từ thường gặp"},
            null,
            new String[]{"trangtu_vitri", "trangtu_cacloai", "trangtu_phanloai", "trangtu_thuonggap"}),

    SENTENCE_4(0, "Quy tắc trọng tâm",
            "",
            null,
            "quytactrongam",
            null),

    SENTENCE_5(0, "Cách phát âm -s/es",
            "",
            null,
            "cachphatam",
            null),

    SENTENCE_6(0, "Cách phát âm -ed",
            "",
            null,
            "cachphatamed",
            null),

    SENTENCE_7(0, "Vị trí của danh-động-trạng từ",
            "",
            null,
            "vitridanhtu",
            null);


    private int type;
    private String title;
    private String description;
    private String[] childSentence;
    private String fileName;
    private String[] fileNameChild;

    WordEnum(int type, String title, String description, String[] childSentence, String fileName, String[] fileNameChild) {
        this.type = type;
        this.title = title;
        this.description = description;
        this.childSentence = childSentence;
        this.fileName = fileName;
        this.fileNameChild = fileNameChild;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getType() {
        return type;
    }

    public String[] getChildSentence() {
        return childSentence;
    }

    public String getFileName() {
        return fileName;
    }

    public String[] getFileNameChild() {
        return fileNameChild;
    }
}
