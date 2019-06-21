package com.tencent.mm.roomsdk.a.c;

import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.mm.ui.base.p;

public abstract class a
{
  protected p tipDialog;
  protected boolean xuX = true;
  protected com.tencent.mm.roomsdk.a.b.a xuY;
  protected com.tencent.mm.roomsdk.a.b.a xuZ;
  protected com.tencent.mm.roomsdk.a.b.a xva;

  public static b pa(boolean paramBoolean)
  {
    return new b(paramBoolean);
  }

  public static c pb(boolean paramBoolean)
  {
    return new c(paramBoolean);
  }

  public abstract void a(Context paramContext, String paramString, boolean paramBoolean, DialogInterface.OnCancelListener paramOnCancelListener);

  public final a b(com.tencent.mm.roomsdk.a.b.a parama)
  {
    this.xuY = parama;
    return this;
  }

  public final a c(com.tencent.mm.roomsdk.a.b.a parama)
  {
    this.xuZ = parama;
    return this;
  }

  public abstract void cancel();

  public final a d(com.tencent.mm.roomsdk.a.b.a parama)
  {
    this.xva = parama;
    return this;
  }

  public final boolean dmW()
  {
    return this.xuX;
  }

  public abstract void dmX();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.roomsdk.a.c.a
 * JD-Core Version:    0.6.2
 */