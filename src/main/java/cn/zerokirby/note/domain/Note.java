package cn.zerokirby.note.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Note {

    private int noteId; // 笔记ID
    private String title; // 标题
    private long time; // 修改时间
    private String content; //内容

}
