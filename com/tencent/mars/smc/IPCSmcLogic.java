package com.tencent.mars.smc;

import com.tencent.mm.plugin.report.e;
import java.util.ArrayList;

public class IPCSmcLogic
{
  private static void reportGroupIDKey(int[] paramArrayOfInt1, int[] paramArrayOfInt2, int[] paramArrayOfInt3, int paramInt, boolean paramBoolean)
  {
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; i < paramInt; i++)
      localArrayList.add(new IDKey(paramArrayOfInt1[i], paramArrayOfInt2[i], paramArrayOfInt3[i]));
    e.pXa.b(localArrayList, paramBoolean);
  }

  private static void reportIDKey(long paramLong1, long paramLong2, long paramLong3, boolean paramBoolean)
  {
    e.pXa.a(paramLong1, paramLong2, paramLong3, paramBoolean);
  }

  private static void reportKV(long paramLong, String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    e.pXa.a((int)paramLong, paramString, paramBoolean2, paramBoolean1);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mars.smc.IPCSmcLogic
 * JD-Core Version:    0.6.2
 */