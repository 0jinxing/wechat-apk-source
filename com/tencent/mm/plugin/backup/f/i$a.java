package com.tencent.mm.plugin.backup.f;

import com.tencent.mm.plugin.backup.i.u;
import com.tencent.mm.protocal.protobuf.gu;
import java.util.LinkedList;

public final class i$a
{
  int cyQ;
  String filePath;
  gu jvB;
  LinkedList<u> jvC;
  boolean jvD = true;
  String jvE;
  boolean jvF;
  u jvy;

  public i$a(String paramString1, gu paramgu, LinkedList<u> paramLinkedList, int paramInt, boolean paramBoolean1, String paramString2, boolean paramBoolean2)
  {
    this.filePath = paramString1;
    this.jvB = paramgu;
    this.jvC = paramLinkedList;
    this.cyQ = paramInt;
    this.jvD = paramBoolean1;
    this.jvE = paramString2;
    this.jvF = paramBoolean2;
    this.jvy = null;
  }

  public i$a(String paramString, gu paramgu, LinkedList<u> paramLinkedList, int paramInt, boolean paramBoolean1, boolean paramBoolean2, u paramu)
  {
    this.filePath = paramString;
    this.jvB = paramgu;
    this.jvC = paramLinkedList;
    this.cyQ = paramInt;
    this.jvD = paramBoolean1;
    this.jvF = paramBoolean2;
    this.jvy = paramu;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.f.i.a
 * JD-Core Version:    0.6.2
 */