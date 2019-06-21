package com.tencent.mm.view.a;

import android.content.Context;
import android.widget.BaseAdapter;

public abstract class a extends BaseAdapter
  implements g
{
  public int Aab;
  public com.tencent.mm.view.f.a Aal;
  public int Abd;
  public int Abe;
  public String Abf;
  public int Abg;
  public int emW;
  public Context mContext;
  public int njC;
  public int zZZ;

  public a(Context paramContext, com.tencent.mm.view.f.a parama)
  {
    this.mContext = paramContext;
    this.Aal = parama;
  }

  public final void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
  {
    this.zZZ = paramInt1;
    this.emW = paramInt2;
    this.Abd = paramInt3;
    this.Aab = paramInt4;
    this.Abe = paramInt5;
    this.Abg = paramInt6;
    this.njC = paramInt7;
  }

  public boolean ui(int paramInt)
  {
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.view.a.a
 * JD-Core Version:    0.6.2
 */