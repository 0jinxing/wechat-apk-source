package com.tencent.mm.ui.tools;

import android.content.ContentResolver;
import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.i.e;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.File;

final class AddFavoriteUI$a
  implements Runnable
{
  private Uri mUri;
  private AddFavoriteUI.b zAy;

  public AddFavoriteUI$a(AddFavoriteUI paramAddFavoriteUI, Uri paramUri, AddFavoriteUI.b paramb)
  {
    this.mUri = paramUri;
    this.zAy = paramb;
  }

  public final void run()
  {
    AppMethodBeat.i(34758);
    this.zAx.filePath = AddFavoriteUI.a(this.zAx, this.mUri);
    if ((bo.isNullOrNil(this.zAx.filePath)) || (!new File(this.zAx.filePath).exists()))
      if (AddFavoriteUI.ase(this.zAx.getContentResolver().getType(this.mUri)) != 2)
        break label121;
    label121: for (this.zAx.filePath = e.a(this.zAx.getContentResolver(), this.mUri, 1); ; this.zAx.filePath = e.a(this.zAx.getContentResolver(), this.mUri))
    {
      if (this.zAy != null)
        this.zAy.dJx();
      AppMethodBeat.o(34758);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.AddFavoriteUI.a
 * JD-Core Version:    0.6.2
 */