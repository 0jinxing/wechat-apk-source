package com.tencent.mm.view;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.emojicapture.api.c;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel.a;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.view.a.f;

final class SmileyGrid$1
  implements AdapterView.OnItemClickListener
{
  SmileyGrid$1(SmileyGrid paramSmileyGrid)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    boolean bool1 = true;
    boolean bool2 = true;
    AppMethodBeat.i(62898);
    switch (SmileyGrid.a(this.Aaf))
    {
    case 21:
    case 22:
    case 24:
    default:
    case 23:
    case 25:
    case 26:
    case 20:
    }
    label194: label355: label500: 
    do
    {
      AppMethodBeat.o(62898);
      while (true)
      {
        return;
        if ((SmileyGrid.a(this.Aaf) == 25) && (paramInt == 0) && (this.Aaf.jiy == 0) && (com.tencent.mm.view.f.a.QM(SmileyGrid.b(this.Aaf))))
        {
          SmileyGrid.c(this.Aaf);
          AppMethodBeat.o(62898);
        }
        else
        {
          paramAdapterView = (EmojiInfo)this.Aaf.Ei.getItem(paramInt);
          if (paramAdapterView != null)
            if (SmileyGrid.a(this.Aaf) != 25)
              break label194;
          while (true)
          {
            com.tencent.mm.emoji.c.a.OZ().a(bool2, paramInt, paramAdapterView.field_md5, paramAdapterView.field_groupId, paramAdapterView.field_designerID, paramAdapterView.field_activityid);
            SmileyGrid.a(this.Aaf, paramAdapterView);
            AppMethodBeat.o(62898);
            break;
            bool2 = false;
          }
          if ((paramInt == 0) && (this.Aaf.jiy == 0) && (com.tencent.mm.view.f.a.QL(SmileyGrid.b(this.Aaf))))
          {
            if (!((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().OT())
              break;
            c.h(this.Aaf.getContext(), null, com.tencent.mm.view.f.a.QK(SmileyGrid.b(this.Aaf)));
            AppMethodBeat.o(62898);
            continue;
          }
          paramAdapterView = (EmojiInfo)this.Aaf.Ei.getItem(paramInt);
          if (paramAdapterView != null)
            if (SmileyGrid.a(this.Aaf) != 25)
              break label355;
          for (bool2 = bool1; ; bool2 = false)
          {
            com.tencent.mm.emoji.c.a.OZ().a(bool2, paramInt, paramAdapterView.field_md5, paramAdapterView.field_groupId, paramAdapterView.field_designerID, paramAdapterView.field_activityid);
            SmileyGrid.b(this.Aaf, paramAdapterView);
            AppMethodBeat.o(62898);
            break;
          }
          if (((paramAdapterView.getAdapter() instanceof f)) && (((f)paramAdapterView.getAdapter()).QD(paramInt)))
          {
            if (SmileyGrid.d(this.Aaf) != null)
              SmileyGrid.d(this.Aaf).aRg();
            AppMethodBeat.o(62898);
          }
          else if (paramInt == this.Aaf.Ei.getCount() - 1)
          {
            if (SmileyGrid.d(this.Aaf) != null)
              SmileyGrid.d(this.Aaf).aRg();
            AppMethodBeat.o(62898);
          }
          else
          {
            if (this.Aaf.jiy * (this.Aaf.Aaa - 1) + paramInt < SmileyGrid.e(this.Aaf))
              break label500;
            AppMethodBeat.o(62898);
          }
        }
      }
      paramInt = this.Aaf.jiy * (this.Aaf.Aaa - 1) + paramInt;
      paramAdapterView = com.tencent.mm.cb.e.dqK().qL(paramInt);
      ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getProvider().bZ(paramAdapterView, paramInt);
    }
    while (SmileyGrid.d(this.Aaf) == null);
    if (SmileyGrid.f(this.Aaf));
    for (paramAdapterView = com.tencent.mm.cb.e.dqK().qK(paramInt); ; paramAdapterView = com.tencent.mm.cb.e.dqK().getText(paramInt))
    {
      SmileyGrid.d(this.Aaf).append(paramAdapterView);
      h.pYm.e(13470, new Object[] { paramAdapterView.replaceAll(",", " "), Integer.valueOf(SmileyGrid.b(this.Aaf)), Integer.valueOf(0) });
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.view.SmileyGrid.1
 * JD-Core Version:    0.6.2
 */