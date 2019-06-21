package com.tencent.mm.plugin.sns.model;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.sdk.platformtools.ak;

public final class ab
{
  public static boolean nLD;
  public static char[] qKm;
  private ak handler;
  public boolean qKj;
  public long qKk;
  private int qKl;

  static
  {
    int i = 0;
    nLD = false;
    qKm = new char[36];
    int j = 48;
    while (j <= 57)
    {
      qKm[i] = ((char)(char)j);
      j++;
      i++;
    }
    j = 97;
    while (j <= 122)
    {
      qKm[i] = ((char)(char)j);
      j++;
      i++;
    }
  }

  public ab()
  {
    AppMethodBeat.i(36369);
    this.qKj = false;
    this.qKk = 0L;
    this.qKl = 0;
    this.handler = new ab.1(this, Looper.getMainLooper());
    AppMethodBeat.o(36369);
  }

  public static void b(PInt paramPInt1, PInt paramPInt2)
  {
    if (paramPInt2.value + 1 >= 36)
      paramPInt2.value = 0;
    for (paramPInt1.value = ((paramPInt1.value + 1) % 36); ; paramPInt2.value = ((paramPInt2.value + 1) % 36))
      return;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.ab
 * JD-Core Version:    0.6.2
 */