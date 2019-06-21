package com.tencent.mm.pluginsdk.ui.tools;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.applet.q.a;

final class NewFileExplorerUI$6
  implements q.a
{
  NewFileExplorerUI$6(NewFileExplorerUI paramNewFileExplorerUI)
  {
  }

  public final void a(boolean paramBoolean, String paramString, int paramInt)
  {
    AppMethodBeat.i(28180);
    this.vva.aqX();
    if (paramBoolean)
    {
      Intent localIntent = new Intent();
      localIntent.putStringArrayListExtra("selected_file_lst", NewFileExplorerUI.b(this.vva).dlu());
      localIntent.putStringArrayListExtra("key_select_video_list", NewFileExplorerUI.b(this.vva).dlw());
      localIntent.putStringArrayListExtra("CropImage_OutputPath_List", NewFileExplorerUI.b(this.vva).dlv());
      localIntent.putExtra("GalleryUI_ToUser", NewFileExplorerUI.f(this.vva));
      localIntent.putExtra("with_text_content", paramString);
      this.vva.setResult(-1, localIntent);
      this.vva.finish();
    }
    AppMethodBeat.o(28180);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.NewFileExplorerUI.6
 * JD-Core Version:    0.6.2
 */