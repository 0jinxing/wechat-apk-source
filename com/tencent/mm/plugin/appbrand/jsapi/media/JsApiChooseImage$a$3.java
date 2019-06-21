package com.tencent.mm.plugin.appbrand.jsapi.media;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;

final class JsApiChooseImage$a$3
  implements Runnable
{
  JsApiChooseImage$a$3(JsApiChooseImage.a parama, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(131138);
    Intent localIntent = new Intent();
    if (!this.hPb.hOX.hOU);
    for (boolean bool = true; ; bool = false)
    {
      localIntent.putExtra("key_send_raw_image", bool);
      localIntent.putExtra("max_select_count", this.hPb.hOX.count);
      localIntent.putExtra("query_source_type", this.hPb.hOZ);
      localIntent.putExtra("isPreviewPhoto", true);
      localIntent.putExtra("max_select_count", 1);
      ArrayList localArrayList = new ArrayList(1);
      localArrayList.add(this.val$filePath);
      localIntent.putStringArrayListExtra("preview_image_list", localArrayList);
      localIntent.putExtra("preview_image", true);
      localIntent.addFlags(67108864);
      JsApiChooseImage.a.a(this.hPb, "gallery", ".ui.GalleryEntryUI", localIntent);
      AppMethodBeat.o(131138);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseImage.a.3
 * JD-Core Version:    0.6.2
 */