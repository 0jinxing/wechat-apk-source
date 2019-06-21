package com.tencent.mm.ui.chatting;

import android.content.Intent;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.model.app.am;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.pluginsdk.model.app.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.Sort3rdAppUI;
import com.tencent.mm.ui.base.h;
import java.util.List;

final class ChattingSendDataToDeviceUI$3
  implements AdapterView.OnItemClickListener
{
  ChattingSendDataToDeviceUI$3(ChattingSendDataToDeviceUI paramChattingSendDataToDeviceUI)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(30764);
    ab.i("MicroMsg.ChattingSendDataToDeviceUI", "onItemClick(%d).", new Object[] { Integer.valueOf(paramInt) });
    if (paramInt == paramAdapterView.getAdapter().getCount() - 1)
    {
      paramAdapterView = new Intent(this.yKQ, Sort3rdAppUI.class);
      paramAdapterView.addFlags(67108864);
      paramAdapterView.putExtra("KFlag", ChattingSendDataToDeviceUI.h(this.yKQ));
      this.yKQ.startActivity(paramAdapterView);
      AppMethodBeat.o(30764);
    }
    while (true)
    {
      return;
      if ((this.yKQ.yGE) && (paramInt == paramAdapterView.getAdapter().getCount() - 2))
      {
        if ((this.yKQ.filePath == null) || (this.yKQ.eov == null))
        {
          h.bQ(this.yKQ.getBaseContext(), this.yKQ.getString(2131298926));
          AppMethodBeat.o(30764);
        }
        else
        {
          com.tencent.mm.pluginsdk.ui.tools.a.a(this.yKQ, this.yKQ.filePath, this.yKQ.eov.toLowerCase(), 1);
          AppMethodBeat.o(30764);
        }
      }
      else if ((paramInt >= 0) && (paramInt < paramAdapterView.getAdapter().getCount() - 1))
      {
        paramAdapterView = (f)ChattingSendDataToDeviceUI.i(this.yKQ).get(paramInt);
        if (!g.a(this.yKQ.getBaseContext(), paramAdapterView))
        {
          h.bQ(this.yKQ.getBaseContext(), this.yKQ.getString(2131298234));
          paramAdapterView.field_status = 4;
          am.bYJ().a(paramAdapterView, new String[0]);
          ChattingSendDataToDeviceUI.j(this.yKQ);
          AppMethodBeat.o(30764);
        }
        else
        {
          com.tencent.mm.ce.a.post(new ChattingSendDataToDeviceUI.3.1(this, paramAdapterView));
        }
      }
      else
      {
        AppMethodBeat.o(30764);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI.3
 * JD-Core Version:    0.6.2
 */