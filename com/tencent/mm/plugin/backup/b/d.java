package com.tencent.mm.plugin.backup.b;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.mm.compatible.util.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

public abstract class d extends a
{
  private static String TAG = "MicroMsg.BackupModel";
  private static boolean eIJ = false;
  private static int jqS = 0;
  private static byte[] jqT = "key".getBytes();
  private static SharedPreferences jqV;
  public String jqO = "id";
  public String jqP = "hello";
  public String jqQ = "ok";
  public e jqR;
  public byte[] jqU;

  public static void aSA()
  {
    ab.i(TAG, "holdReset");
    eIJ = true;
  }

  public static boolean aSB()
  {
    return eIJ;
  }

  public static void aSC()
  {
    jqT = "key".getBytes();
    jqS = 0;
    jqV = null;
    eIJ = false;
  }

  public static int aSx()
  {
    return jqS;
  }

  public static byte[] aSy()
  {
    return jqT;
  }

  public static SharedPreferences aSz()
  {
    if (jqV == null)
      jqV = ah.getContext().getSharedPreferences("BACKUP_CONFIG", h.Mu());
    return jqV;
  }

  public static void ao(byte[] paramArrayOfByte)
  {
    jqT = paramArrayOfByte;
  }

  public static void rk(int paramInt)
  {
    jqS = paramInt;
  }

  public final e aSu()
  {
    if (this.jqR == null)
      this.jqR = new e();
    return this.jqR;
  }

  public abstract void aSv();

  public abstract void aSw();

  public abstract void m(Object[] paramArrayOfObject);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.b.d
 * JD-Core Version:    0.6.2
 */