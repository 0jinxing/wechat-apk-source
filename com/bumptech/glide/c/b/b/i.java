package com.bumptech.glide.c.b.b;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build.VERSION;
import android.text.format.Formatter;
import android.util.Log;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class i
{
  public final int aDj;
  public final int aDk;
  public final int aDl;
  private final Context context;

  public i(i.a parama)
  {
    AppMethodBeat.i(91993);
    this.context = parama.context;
    int i;
    Object localObject;
    float f1;
    label88: int j;
    int m;
    if (a(parama.aDn))
    {
      i = parama.aDt / 2;
      this.aDl = i;
      localObject = parama.aDn;
      f1 = parama.aDr;
      float f2 = parama.aDs;
      i = ((ActivityManager)localObject).getMemoryClass();
      bool = a((ActivityManager)localObject);
      float f3 = i * 1024 * 1024;
      if (!bool)
        break label319;
      f1 = f2;
      j = Math.round(f1 * f3);
      int k = parama.aDo.mY() * parama.aDo.mZ() * 4;
      i = Math.round(k * parama.aDq);
      k = Math.round(k * parama.aDp);
      m = j - this.aDl;
      if (k + i > m)
        break label322;
      this.aDk = k;
      this.aDj = i;
      label175: if (Log.isLoggable("MemorySizeCalculator", 3))
      {
        localObject = new StringBuilder("Calculation complete, Calculated memory cache size: ").append(df(this.aDk)).append(", pool size: ").append(df(this.aDj)).append(", byte array size: ").append(df(this.aDl)).append(", memory class limited? ");
        if (k + i <= j)
          break label368;
      }
    }
    label319: label322: label368: for (boolean bool = true; ; bool = false)
    {
      ((StringBuilder)localObject).append(bool).append(", max size: ").append(df(j)).append(", memoryClass: ").append(parama.aDn.getMemoryClass()).append(", isLowMemoryDevice: ").append(a(parama.aDn));
      AppMethodBeat.o(91993);
      return;
      i = parama.aDt;
      break;
      break label88;
      f1 = m / (parama.aDq + parama.aDp);
      this.aDk = Math.round(parama.aDp * f1);
      this.aDj = Math.round(f1 * parama.aDq);
      break label175;
    }
  }

  @TargetApi(19)
  static boolean a(ActivityManager paramActivityManager)
  {
    AppMethodBeat.i(91995);
    boolean bool;
    if (Build.VERSION.SDK_INT >= 19)
    {
      bool = paramActivityManager.isLowRamDevice();
      AppMethodBeat.o(91995);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(91995);
    }
  }

  private String df(int paramInt)
  {
    AppMethodBeat.i(91994);
    String str = Formatter.formatFileSize(this.context, paramInt);
    AppMethodBeat.o(91994);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.b.b.i
 * JD-Core Version:    0.6.2
 */