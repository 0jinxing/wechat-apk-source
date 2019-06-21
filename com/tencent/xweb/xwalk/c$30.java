package com.tencent.xweb.xwalk;

import android.app.AlertDialog.Builder;
import android.view.View;
import android.view.View.OnLongClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class c$30
  implements View.OnLongClickListener
{
  c$30(c paramc)
  {
  }

  public final boolean onLongClick(View paramView)
  {
    AppMethodBeat.i(85152);
    new AlertDialog.Builder(this.ARk.AMr).setTitle("提示").setMessage("清空保存页面文件").setPositiveButton("确定", new c.30.2(this)).setNegativeButton("取消", new c.30.1(this)).show();
    AppMethodBeat.o(85152);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.xwalk.c.30
 * JD-Core Version:    0.6.2
 */