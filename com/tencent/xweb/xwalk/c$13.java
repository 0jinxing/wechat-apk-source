package com.tencent.xweb.xwalk;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.xwalk.a.f;
import java.util.HashMap;

final class c$13
  implements View.OnClickListener
{
  c$13(c paramc)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(85134);
    paramView = new f();
    HashMap localHashMap = new HashMap();
    localHashMap.put("UpdaterCheckType", "1");
    paramView.a(this.ARk.AMr, localHashMap);
    Toast.makeText(this.ARk.AMr, "开始检测插件更新", 0).show();
    AppMethodBeat.o(85134);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.xwalk.c.13
 * JD-Core Version:    0.6.2
 */