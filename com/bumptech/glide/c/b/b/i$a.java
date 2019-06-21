package com.bumptech.glide.c.b.b;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class i$a
{
  static final int aDm;
  ActivityManager aDn;
  i.c aDo;
  float aDp;
  float aDq;
  float aDr;
  float aDs;
  int aDt;
  final Context context;

  static
  {
    if (Build.VERSION.SDK_INT < 26);
    for (int i = 4; ; i = 1)
    {
      aDm = i;
      return;
    }
  }

  public i$a(Context paramContext)
  {
    AppMethodBeat.i(91992);
    this.aDp = 2.0F;
    this.aDq = aDm;
    this.aDr = 0.4F;
    this.aDs = 0.33F;
    this.aDt = 4194304;
    this.context = paramContext;
    this.aDn = ((ActivityManager)paramContext.getSystemService("activity"));
    this.aDo = new i.b(paramContext.getResources().getDisplayMetrics());
    if ((Build.VERSION.SDK_INT >= 26) && (i.a(this.aDn)))
      this.aDq = 0.0F;
    AppMethodBeat.o(91992);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.b.b.i.a
 * JD-Core Version:    0.6.2
 */