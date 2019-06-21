package com.tencent.soter.core.d;

import android.content.Context;
import android.util.Base64;
import com.tencent.soter.core.c.d;
import com.tencent.soter.core.c.f;
import com.tencent.soter.core.c.i;
import com.tencent.soter.soterserver.SoterSessionResult;
import java.security.Signature;

public abstract class b
{
  protected static i cp(byte[] paramArrayOfByte)
  {
    Object localObject1 = null;
    if (paramArrayOfByte == null)
      d.e("Soter.SoterCoreBase", "soter: raw data is null", new Object[0]);
    while (true)
    {
      return localObject1;
      if (paramArrayOfByte.length < 4)
        d.e("Soter.SoterCoreBase", "soter: raw data length smaller than RAW_LENGTH_PREFIX", new Object[0]);
      Object localObject2 = new byte[4];
      System.arraycopy(paramArrayOfByte, 0, localObject2, 0, 4);
      int i = 0;
      int j = 0;
      while (i < 4)
      {
        j += ((localObject2[i] & 0xFF) << i * 8);
        i++;
      }
      d.d("Soter.SoterCoreBase", "soter: parsed raw length: ".concat(String.valueOf(j)), new Object[0]);
      if (j > 1048576)
      {
        d.e("Soter.SoterCoreBase", "soter: too large json result!", new Object[0]);
      }
      else
      {
        localObject2 = new byte[j];
        if (paramArrayOfByte.length < j + 4)
        {
          d.e("Soter.SoterCoreBase", "length not correct 2", new Object[0]);
        }
        else
        {
          System.arraycopy(paramArrayOfByte, 4, localObject2, 0, j);
          localObject1 = new String((byte[])localObject2);
          d.d("Soter.SoterCoreBase", "soter: to convert json: ".concat(String.valueOf(localObject1)), new Object[0]);
          localObject2 = new i((String)localObject1, "");
          i = paramArrayOfByte.length - (j + 4);
          d.d("Soter.SoterCoreBase", "soter: signature length: ".concat(String.valueOf(i)), new Object[0]);
          localObject1 = localObject2;
          if (i != 0)
          {
            localObject1 = new byte[i];
            System.arraycopy(paramArrayOfByte, j + 4, localObject1, 0, i);
            ((i)localObject2).signature = Base64.encodeToString((byte[])localObject1, 2);
            localObject1 = localObject2;
          }
        }
      }
    }
  }

  public abstract f atZ(String paramString);

  public abstract boolean aua(String paramString);

  public abstract boolean aub(String paramString);

  public abstract i auc(String paramString);

  public abstract Signature aud(String paramString);

  public abstract f cn(String paramString, boolean paramBoolean);

  public abstract boolean dQN();

  public abstract f dQO();

  public abstract f dQP();

  public abstract boolean dQQ();

  public abstract boolean dQR();

  public abstract i dQS();

  public abstract SoterSessionResult iC(String paramString1, String paramString2);

  public abstract boolean iV(Context paramContext);

  public abstract byte[] nB(long paramLong);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.soter.core.d.b
 * JD-Core Version:    0.6.2
 */