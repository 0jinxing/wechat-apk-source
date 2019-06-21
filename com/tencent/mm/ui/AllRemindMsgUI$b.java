package com.tencent.mm.ui;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.f.h;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.e.j;
import java.util.LinkedList;

final class AllRemindMsgUI$b extends RecyclerView.a
{
  AllRemindMsgUI$b(AllRemindMsgUI paramAllRemindMsgUI)
  {
  }

  public final RecyclerView.v a(ViewGroup paramViewGroup, int paramInt)
  {
    AppMethodBeat.i(29118);
    paramViewGroup = LayoutInflater.from(paramViewGroup.getContext()).inflate(2130970505, paramViewGroup, false);
    paramViewGroup = new AllRemindMsgUI.c(this.yex, paramViewGroup);
    AppMethodBeat.o(29118);
    return paramViewGroup;
  }

  public final void a(RecyclerView.v paramv, int paramInt)
  {
    AppMethodBeat.i(29119);
    AllRemindMsgUI.d locald = (AllRemindMsgUI.d)AllRemindMsgUI.d(this.yex).get(paramInt);
    ((AllRemindMsgUI.c)paramv).apJ.setTag(locald);
    ((AllRemindMsgUI.c)paramv).jXx.setText(j.b(this.yex.mController.ylL, locald.nickname, ((AllRemindMsgUI.c)paramv).jXx.getTextSize()));
    ((AllRemindMsgUI.c)paramv).gne.setText(j.b(this.yex.mController.ylL, locald.title, ((AllRemindMsgUI.c)paramv).gne.getTextSize()));
    long l = System.currentTimeMillis();
    if (locald.timestamp - l < 60000L)
    {
      ((AllRemindMsgUI.c)paramv).yeA.setText(this.yex.mController.ylL.getString(2131299949, new Object[] { Integer.valueOf(1) }));
      if (locald.cuu != 2)
        break label394;
      ((AllRemindMsgUI.c)paramv).gvq.setImageDrawable(this.yex.mController.ylL.getResources().getDrawable(2130837704));
      AppMethodBeat.o(29119);
    }
    while (true)
    {
      return;
      if (locald.timestamp - l < 3600000L)
      {
        ((AllRemindMsgUI.c)paramv).yeA.setText(this.yex.mController.ylL.getString(2131299949, new Object[] { Long.valueOf((locald.timestamp - l) / 60000L) }));
        break;
      }
      if (locald.timestamp - l < 10800000L)
      {
        ((AllRemindMsgUI.c)paramv).yeA.setText(this.yex.mController.ylL.getString(2131299948, new Object[] { Long.valueOf((locald.timestamp - l) / 3600000L), Long.valueOf((locald.timestamp - l - (locald.timestamp - l) / 3600000L * 3600000L) / 60000L) }));
        break;
      }
      ((AllRemindMsgUI.c)paramv).yeA.setText(h.c(this.yex.mController.ylL, locald.timestamp, true));
      break;
      label394: a.b.b(((AllRemindMsgUI.c)paramv).gvq, locald.username);
      AppMethodBeat.o(29119);
    }
  }

  public final int getItemCount()
  {
    AppMethodBeat.i(29120);
    int i;
    if (AllRemindMsgUI.d(this.yex) == null)
    {
      i = 0;
      AppMethodBeat.o(29120);
    }
    while (true)
    {
      return i;
      i = AllRemindMsgUI.d(this.yex).size();
      AppMethodBeat.o(29120);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.AllRemindMsgUI.b
 * JD-Core Version:    0.6.2
 */