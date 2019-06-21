package com.tencent.mm.plugin.websearch.api;

import android.os.Bundle;
import com.tencent.mm.ai.m;
import com.tencent.mm.protocal.protobuf.cmg;
import java.util.LinkedList;

public abstract class a extends m
{
  protected int Lp;
  protected String cIz;
  protected int gOW;
  protected int tZt;
  protected String tZu;
  protected Bundle tZv;

  public final void HN(int paramInt)
  {
    this.tZt = paramInt;
  }

  public abstract String abH();

  public abstract int abI();

  public void ax(LinkedList<cmg> paramLinkedList)
  {
  }

  public final String bAk()
  {
    return this.tZu;
  }

  public final int cUO()
  {
    return this.tZt;
  }

  public final boolean cUP()
  {
    if (this.Lp == 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final Bundle cUQ()
  {
    return this.tZv;
  }

  public final String cUR()
  {
    return this.cIz;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.api.a
 * JD-Core Version:    0.6.2
 */