package com.tencent.mm.plugin.backup.bakoldlogic.b;

import com.tencent.mm.plugin.backup.i.u;
import com.tencent.mm.protocal.protobuf.gu;
import com.tencent.mm.storage.emotion.EmojiInfo;
import java.util.LinkedList;

public final class i$a
{
  int cyQ;
  EmojiInfo exP;
  String filePath;
  gu jvB;
  LinkedList<u> jvC;
  boolean jvD = true;
  String jvE;
  boolean jvF;
  u jvy;

  public i$a(String paramString1, gu paramgu, LinkedList<u> paramLinkedList, int paramInt, String paramString2)
  {
    this.filePath = paramString1;
    this.jvB = paramgu;
    this.jvC = paramLinkedList;
    this.cyQ = paramInt;
    this.jvD = false;
    this.jvE = paramString2;
    this.jvF = false;
    this.jvy = null;
  }

  public i$a(String paramString, gu paramgu, LinkedList<u> paramLinkedList, int paramInt, boolean paramBoolean, u paramu)
  {
    this.filePath = paramString;
    this.jvB = paramgu;
    this.jvC = paramLinkedList;
    this.cyQ = paramInt;
    this.jvD = false;
    this.jvF = paramBoolean;
    this.jvy = paramu;
  }

  public i$a(String paramString, gu paramgu, LinkedList<u> paramLinkedList, EmojiInfo paramEmojiInfo)
  {
    this.filePath = paramString;
    this.jvB = paramgu;
    this.jvC = paramLinkedList;
    this.cyQ = 5;
    this.jvD = false;
    this.jvF = false;
    this.jvy = null;
    this.exP = paramEmojiInfo;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.bakoldlogic.b.i.a
 * JD-Core Version:    0.6.2
 */