package com.tencent.xweb.xwalk;

import android.app.AlertDialog.Builder;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class c$1
  implements View.OnClickListener
{
  c$1(c paramc)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(85122);
    new AlertDialog.Builder(this.ARk.AMr).setTitle("保存页面").setMessage("确定保存页面？").setPositiveButton("确定", new c.1.2(this)).setNegativeButton("取消", new c.1.1(this)).show();
    AppMethodBeat.o(85122);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.xwalk.c.1
 * JD-Core Version:    0.6.2
 */