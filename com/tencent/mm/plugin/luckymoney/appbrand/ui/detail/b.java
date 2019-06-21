package com.tencent.mm.plugin.luckymoney.appbrand.ui.detail;

import android.content.Intent;
import com.tencent.mm.protocal.protobuf.ash;
import com.tencent.mm.protocal.protobuf.bhk;
import com.tencent.mm.protocal.protobuf.bon;
import java.util.List;

public abstract interface b extends com.tencent.mm.plugin.luckymoney.appbrand.ui.b
{
  public abstract void a(bhk parambhk);

  public abstract void a(bon parambon);

  public abstract void ae(Intent paramIntent);

  public abstract void cj(List<ash> paramList);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.appbrand.ui.detail.b
 * JD-Core Version:    0.6.2
 */