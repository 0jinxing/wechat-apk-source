package com.tencent.mm.plugin.clean.ui.newui;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.clean.c.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.k;
import com.tencent.mm.vfs.e;

final class b$3
  implements AdapterView.OnItemClickListener
{
  b$3(b paramb)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(18849);
    ab.i("MicroMsg.CleanChattingDetailAdapter", "Click Item position=%d", new Object[] { Integer.valueOf(paramInt) });
    paramView = this.kyI.tz(paramInt);
    paramAdapterView = new Intent();
    switch (paramView.type)
    {
    case 2:
    default:
    case 3:
    case 1:
    case 4:
    }
    while (true)
    {
      AppMethodBeat.o(18849);
      while (true)
      {
        return;
        paramAdapterView.setAction("android.intent.action.VIEW");
        k.a(b.a(this.kyI), paramAdapterView, e.asY(paramView.filePath), "video/*");
        try
        {
          b.a(this.kyI).startActivity(Intent.createChooser(paramAdapterView, b.a(this.kyI).getString(2131304276)));
          AppMethodBeat.o(18849);
        }
        catch (Exception paramAdapterView)
        {
          AppMethodBeat.o(18849);
        }
        continue;
        paramAdapterView.putExtra("key_title", b.a(this.kyI).getString(2131298301));
        paramAdapterView.putExtra("show_menu", false);
        paramAdapterView.putExtra("key_image_path", paramView.filePath);
        d.f(b.a(this.kyI), ".ui.tools.ShowImageUI", paramAdapterView);
        AppMethodBeat.o(18849);
      }
      paramAdapterView.putExtra("app_msg_id", paramView.cuQ);
      d.f(b.a(this.kyI), ".ui.chatting.AppAttachDownloadUI", paramAdapterView);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.clean.ui.newui.b.3
 * JD-Core Version:    0.6.2
 */