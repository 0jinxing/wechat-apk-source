package com.tencent.mm.pluginsdk.ui.tools;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.m.b;
import com.tencent.mm.m.e;
import com.tencent.mm.m.g;
import com.tencent.mm.pluginsdk.ui.c.a;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.t;
import com.tencent.mm.ui.q;
import java.io.File;
import java.util.ArrayList;

final class NewFileExplorerUI$a$4
  implements View.OnClickListener
{
  NewFileExplorerUI$a$4(NewFileExplorerUI.a parama)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(28184);
    int i = ((Integer)paramView.getTag()).intValue();
    File localFile = this.vve.vue[i];
    CheckBox localCheckBox = (CheckBox)paramView.findViewById(2131824075);
    if (NewFileExplorerUI.a.a(this.vve).contains(localFile))
    {
      NewFileExplorerUI.a.a(this.vve).remove(localFile);
      localCheckBox.setChecked(false);
    }
    while (true)
    {
      NewFileExplorerUI.h(this.vve.vva);
      AppMethodBeat.o(28184);
      while (true)
      {
        return;
        if (NewFileExplorerUI.a.a(this.vve).size() >= 9)
        {
          t.makeText(this.vve.vva.mController.ylL, this.vve.vva.getString(2131299800, new Object[] { Integer.valueOf(9) }), 0).show();
          localCheckBox.setChecked(false);
          AppMethodBeat.o(28184);
        }
        else
        {
          long l = Math.max(bo.getInt(g.Nu().getValue("InputLimitFileSize"), 104857600), 104857600);
          if (localFile.length() >= l)
          {
            t.makeText(this.vve.vva.mController.ylL, this.vve.vva.getString(2131299799, new Object[] { bo.ga(l) }), 0).show();
            localCheckBox.setChecked(false);
            AppMethodBeat.o(28184);
          }
          else
          {
            if (!NewFileExplorerUI.a.aI(localFile.getName()))
              break;
            paramView = a.ajK(localFile.getPath());
            paramView.mSize = b.Nd();
            if (paramView.aAa() != 1)
              break;
            t.makeText(this.vve.vva.mController.ylL, this.vve.vva.getString(2131304272, new Object[] { bo.ga(b.Nd()) }), 0).show();
            localCheckBox.setChecked(false);
            AppMethodBeat.o(28184);
          }
        }
      }
      localCheckBox.setChecked(true);
      NewFileExplorerUI.a.a(this.vve).add(localFile);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.NewFileExplorerUI.a.4
 * JD-Core Version:    0.6.2
 */