package com.tencent.mm.plugin.clean.ui.fileindexui;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.clean.c.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.k;
import com.tencent.mm.vfs.e;

final class b$4
  implements AdapterView.OnItemClickListener
{
  b$4(b paramb)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(18749);
    ab.i("MicroMsg.CleanChattingDetailAdapter", "Click Item position=%d, count=%d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(this.kxq.getCount()) });
    if ((paramInt < 0) || (paramInt >= this.kxq.getCount()))
    {
      AppMethodBeat.o(18749);
      return;
    }
    paramAdapterView = this.kxq.tv(paramInt);
    paramView = new Intent();
    switch (paramAdapterView.type)
    {
    case 2:
    default:
    case 3:
    case 1:
    case 4:
    }
    while (true)
    {
      while (true)
      {
        AppMethodBeat.o(18749);
        break;
        paramView.setAction("android.intent.action.VIEW");
        k.a(b.e(this.kxq), paramView, e.asY(paramAdapterView.filePath), "video/*");
        try
        {
          b.e(this.kxq).startActivity(Intent.createChooser(paramView, b.e(this.kxq).getString(2131304276)));
          AppMethodBeat.o(18749);
        }
        catch (Exception paramAdapterView)
        {
          AppMethodBeat.o(18749);
        }
      }
      break;
      paramView.putExtra("key_title", b.e(this.kxq).getString(2131298301));
      paramView.putExtra("show_menu", false);
      if (e.ct(paramAdapterView.filePath));
      for (paramAdapterView = paramAdapterView.filePath; ; paramAdapterView = paramAdapterView.thumbPath)
      {
        paramView.putExtra("key_image_path", paramAdapterView);
        d.f(b.e(this.kxq), ".ui.tools.ShowImageUI", paramView);
        AppMethodBeat.o(18749);
        break;
      }
      paramView.putExtra("app_msg_id", paramAdapterView.cuQ);
      d.f(b.e(this.kxq), ".ui.chatting.AppAttachDownloadUI", paramView);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.clean.ui.fileindexui.b.4
 * JD-Core Version:    0.6.2
 */