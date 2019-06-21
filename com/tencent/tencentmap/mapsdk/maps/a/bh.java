package com.tencent.tencentmap.mapsdk.maps.a;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bh
{
  private Context a;
  private int b;
  private boolean c;
  private String d;
  private String e;
  private String f;
  private boolean g;
  private int h;

  public bh(Context paramContext, int paramInt, String paramString1, String paramString2)
  {
    AppMethodBeat.i(98563);
    this.d = "";
    this.e = "";
    this.f = "0M100WJ33N1CQ08O";
    this.g = false;
    this.h = -1;
    this.a = paramContext.getApplicationContext();
    this.b = paramInt;
    this.c = true;
    this.d = paramString1;
    this.e = paramString2;
    AppMethodBeat.o(98563);
  }

  public final Context a()
  {
    return this.a;
  }

  public final String b()
  {
    return this.e;
  }

  public final String c()
  {
    return this.d;
  }

  public final boolean d()
  {
    return this.c;
  }

  public final int e()
  {
    return this.b;
  }

  public final boolean f()
  {
    return this.g;
  }

  public final int g()
  {
    return this.h;
  }

  public final String h()
  {
    return this.f;
  }

  public final String toString()
  {
    AppMethodBeat.i(98564);
    Object localObject = new StringBuilder("[");
    ((StringBuilder)localObject).append("appid:" + this.b);
    ((StringBuilder)localObject).append(",uuid:" + this.d);
    ((StringBuilder)localObject).append(",channelid:" + this.e);
    ((StringBuilder)localObject).append(",isSDKMode:" + this.c);
    ((StringBuilder)localObject).append(",isTest:" + this.g);
    ((StringBuilder)localObject).append(",testAppid:" + this.h);
    ((StringBuilder)localObject).append("]");
    localObject = ((StringBuilder)localObject).toString();
    AppMethodBeat.o(98564);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.bh
 * JD-Core Version:    0.6.2
 */