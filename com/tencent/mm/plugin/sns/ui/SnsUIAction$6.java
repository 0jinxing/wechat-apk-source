package com.tencent.mm.plugin.sns.ui;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipData.Item;
import android.content.Intent;
import android.view.DragEvent;
import android.view.View;
import android.view.View.OnDragListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.tools.o;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;

final class SnsUIAction$6
  implements Runnable
{
  SnsUIAction$6(SnsUIAction paramSnsUIAction)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(39643);
    View.OnDragListener local1 = new View.OnDragListener()
    {
      public final boolean onDrag(View paramAnonymousView, DragEvent paramAnonymousDragEvent)
      {
        int i = 0;
        boolean bool1 = true;
        boolean bool2 = true;
        AppMethodBeat.i(39642);
        int j = paramAnonymousDragEvent.getAction();
        boolean bool3;
        switch (j)
        {
        default:
          ab.e("MicroMsg.SnsActivity", "Unknown action type received by OnDragListener.");
          bool3 = false;
        case 1:
        case 2:
        case 4:
        case 5:
        case 3:
        }
        while (true)
        {
          AppMethodBeat.o(39642);
          while (true)
          {
            return bool3;
            ab.i("MicroMsg.SnsActivity", "ACTION: [%s]", new Object[] { Integer.valueOf(j) });
            bool3 = bool2;
            break;
            ab.i("MicroMsg.SnsActivity", "ACTION_DROP");
            paramAnonymousDragEvent = paramAnonymousDragEvent.getClipData();
            bool3 = bool2;
            if (paramAnonymousDragEvent == null)
              break;
            j = paramAnonymousDragEvent.getItemCount();
            paramAnonymousView = new ArrayList();
            if (i < j)
            {
              Object localObject = paramAnonymousDragEvent.getItemAt(i);
              if (localObject == null)
                ab.e("MicroMsg.SnsActivity", "item == null");
              while (true)
              {
                i++;
                break;
                if (((ClipData.Item)localObject).getIntent() != null)
                {
                  SnsUIAction.a(SnsUIAction.6.this.rCe).startActivity(((ClipData.Item)localObject).getIntent());
                }
                else if (((ClipData.Item)localObject).getUri() != null)
                {
                  localObject = new o(SnsUIAction.a(SnsUIAction.6.this.rCe), ((ClipData.Item)localObject).getUri());
                  if ((((o)localObject).fileType != 0) && (((o)localObject).filePath != null));
                  switch (((o)localObject).fileType)
                  {
                  default:
                    break;
                  case 3:
                    paramAnonymousView.add(((o)localObject).filePath);
                    continue;
                    ab.e("MicroMsg.SnsActivity", "get file path failed");
                  }
                }
              }
            }
            if (paramAnonymousView.size() >= 0)
              break label316;
            ab.e("MicroMsg.SnsActivity", "no image file available");
            AppMethodBeat.o(39642);
            bool3 = bool1;
          }
          label316: paramAnonymousDragEvent = new Intent(SnsUIAction.a(SnsUIAction.6.this.rCe), SnsUploadUI.class);
          paramAnonymousDragEvent.putExtra("KSnsPostManu", true);
          paramAnonymousDragEvent.putExtra("KTouchCameraTime", bo.anT());
          paramAnonymousDragEvent.putStringArrayListExtra("sns_kemdia_path_list", paramAnonymousView);
          paramAnonymousDragEvent.setAction("android.intent.action.SEND");
          paramAnonymousDragEvent.addCategory("android.intent.category.DEFAULT");
          paramAnonymousDragEvent.addFlags(268435456);
          paramAnonymousDragEvent.putExtra("android.intent.extra.TEXT", "");
          paramAnonymousDragEvent.putExtra("Ksnsupload_empty_img", true);
          if (SnsUIAction.b(SnsUIAction.6.this.rCe))
            paramAnonymousDragEvent.putExtra("Ksnsupload_source", 11);
          paramAnonymousDragEvent.setType("image/*");
          SnsUIAction.a(SnsUIAction.6.this.rCe).startActivity(paramAnonymousDragEvent);
          bool3 = bool2;
        }
      }
    };
    if (this.rCe.qQt != null)
      this.rCe.qQt.setOnDragListener(local1);
    AppMethodBeat.o(39643);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsUIAction.6
 * JD-Core Version:    0.6.2
 */