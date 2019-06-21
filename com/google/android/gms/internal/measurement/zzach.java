package com.google.android.gms.internal.measurement;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class zzach
{
  public static final int[] zzbti = new int[0];
  private static final int zzbxi = 11;
  private static final int zzbxj = 12;
  private static final int zzbxk = 16;
  private static final int zzbxl = 26;
  public static final long[] zzbxm = new long[0];
  private static final float[] zzbxn = new float[0];
  private static final double[] zzbxo = new double[0];
  private static final boolean[] zzbxp = new boolean[0];
  public static final String[] zzbxq = new String[0];
  private static final byte[][] zzbxr = new byte[0][];
  public static final byte[] zzbxs = new byte[0];

  public static final int zzb(zzabv paramzzabv, int paramInt)
  {
    AppMethodBeat.i(3521);
    int i = 1;
    int j = paramzzabv.getPosition();
    paramzzabv.zzak(paramInt);
    while (paramzzabv.zzuw() == paramInt)
    {
      paramzzabv.zzak(paramInt);
      i++;
    }
    paramzzabv.zzd(j, paramInt);
    AppMethodBeat.o(3521);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzach
 * JD-Core Version:    0.6.2
 */