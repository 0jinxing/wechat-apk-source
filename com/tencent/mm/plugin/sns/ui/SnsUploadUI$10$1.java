package com.tencent.mm.plugin.sns.ui;

import android.content.ClipData;
import android.content.ClipData.Item;
import android.view.DragEvent;
import android.view.View;
import android.view.View.OnDragListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.tools.o;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import java.util.ArrayList;

final class SnsUploadUI$10$1
  implements View.OnDragListener
{
  SnsUploadUI$10$1(SnsUploadUI.10 param10)
  {
  }

  public final boolean onDrag(View paramView, DragEvent paramDragEvent)
  {
    boolean bool = true;
    AppMethodBeat.i(39748);
    int i = paramDragEvent.getAction();
    switch (i)
    {
    default:
      ab.e("MicroMsg.SnsUploadUI", "Unknown action type received by OnDragListener.");
      bool = false;
    case 1:
    case 2:
    case 4:
    case 5:
    case 3:
    }
    while (true)
    {
      AppMethodBeat.o(39748);
      while (true)
      {
        return bool;
        ab.i("MicroMsg.SnsUploadUI", "ACTION: [%s]", new Object[] { Integer.valueOf(i) });
        bool = true;
        break;
        ab.i("MicroMsg.SnsUploadUI", "ACTION_DROP");
        paramDragEvent = paramDragEvent.getClipData();
        if (paramDragEvent == null)
          break label329;
        int j = paramDragEvent.getItemCount();
        paramView = new ArrayList();
        i = 0;
        if (i < j)
        {
          Object localObject = paramDragEvent.getItemAt(i);
          if (localObject == null)
            ab.e("MicroMsg.SnsUploadUI", "item == null");
          while (true)
          {
            i++;
            break;
            if (((ClipData.Item)localObject).getIntent() != null)
            {
              this.rCR.rCO.startActivity(((ClipData.Item)localObject).getIntent());
            }
            else if (((ClipData.Item)localObject).getUri() != null)
            {
              localObject = new o(this.rCR.rCO.mController.ylL, ((ClipData.Item)localObject).getUri());
              if ((((o)localObject).fileType != 0) && (((o)localObject).filePath != null));
              switch (((o)localObject).fileType)
              {
              default:
                break;
              case 3:
                paramView.add(((o)localObject).filePath);
                continue;
                ab.e("MicroMsg.SnsUploadUI", "get file path failed");
              }
            }
          }
        }
        if (paramView.size() >= 0)
          break label304;
        ab.e("MicroMsg.SnsUploadUI", "no image file available");
        AppMethodBeat.o(39748);
      }
      label304: ((ag)SnsUploadUI.d(this.rCR.rCO)).d(paramView, 0, false);
      bool = true;
      continue;
      label329: bool = true;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsUploadUI.10.1
 * JD-Core Version:    0.6.2
 */