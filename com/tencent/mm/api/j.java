package com.tencent.mm.api;

import android.content.Intent;
import com.tencent.mm.kernel.c.a;
import com.tencent.mm.protocal.protobuf.but;
import com.tencent.mm.protocal.protobuf.buv;
import java.util.ArrayList;

public abstract interface j extends a
{
  public abstract void a(Intent paramIntent, but parambut, int paramInt);

  public abstract void a(Intent paramIntent, buv parambuv, int paramInt);

  public abstract boolean cJ(String paramString);

  public abstract ArrayList<String> cK(String paramString);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.api.j
 * JD-Core Version:    0.6.2
 */