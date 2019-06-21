package com.tencent.mm.plugin.webview.ui.tools;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem;
import com.tencent.mm.plugin.webview.model.ak;
import com.tencent.mm.plugin.webview.model.ap;
import com.tencent.mm.plugin.webview.modeltools.g;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class OpenFileChooserUI$4
  implements Runnable
{
  OpenFileChooserUI$4(OpenFileChooserUI paramOpenFileChooserUI, Intent paramIntent, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(7445);
    Object localObject1 = this.val$data.getStringArrayListExtra("CropImage_OutputPath_List");
    boolean bool1 = this.val$data.getBooleanExtra("isTakePhoto", false);
    boolean bool2 = this.val$data.getBooleanExtra("CropImage_Compress_Img", true);
    Object localObject2 = new ArrayList();
    Iterator localIterator = ((List)localObject1).iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      WebViewJSSDKFileItem localWebViewJSSDKFileItem = WebViewJSSDKFileItem.aeu(str);
      localObject1 = localWebViewJSSDKFileItem.czD;
      localWebViewJSSDKFileItem.hes = bool2;
      g.cYF().b(localWebViewJSSDKFileItem);
      ab.i("MicroMsg.OpenFileChooserUI", "now filepath is : %s, local id is : %s", new Object[] { str, localObject1 });
      ((ArrayList)localObject2).add(localObject1);
    }
    localObject2 = ap.ab((ArrayList)localObject2);
    ab.i("MicroMsg.OpenFileChooserUI", "after parse to json data : %s", new Object[] { localObject2 });
    localObject1 = new Intent();
    ((Intent)localObject1).putExtra("key_pick_local_pic_callback_local_ids", (String)localObject2);
    if (bool1);
    for (localObject2 = "camera"; ; localObject2 = "album")
    {
      ((Intent)localObject1).putExtra("key_pick_local_pic_source_type", (String)localObject2);
      ((Intent)localObject1).putExtra("key_pick_local_media_show_memory_warning", OpenFileChooserUI.a(this.usf));
      this.usf.setResult(this.val$resultCode, (Intent)localObject1);
      this.usf.finish();
      AppMethodBeat.o(7445);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.OpenFileChooserUI.4
 * JD-Core Version:    0.6.2
 */