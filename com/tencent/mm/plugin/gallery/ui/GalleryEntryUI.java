package com.tencent.mm.plugin.gallery.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.gallery.model.e;
import com.tencent.mm.plugin.gallery.model.l;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.a;
import java.util.ArrayList;

@a(7)
public final class GalleryEntryUI extends AppCompatActivity
{
  private boolean iIq = false;
  private boolean mInit = false;
  private int mPB;
  private int mQk;

  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(21456);
    String str;
    if (paramIntent == null)
    {
      str = "";
      ab.i("MicroMsg.GalleryEntryUI", "on activity result, requestCode %d resultCode %d, data:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), str });
      this.iIq = true;
      switch (paramInt2)
      {
      default:
      case 0:
      case -1:
      case 1:
      }
    }
    while (true)
    {
      label76: if (this.iIq)
        finish();
      AppMethodBeat.o(21456);
      while (true)
      {
        return;
        str = paramIntent.toString();
        break;
        ab.d("MicroMsg.GalleryEntryUI", "user choose canceld");
        setResult(0);
        break label76;
        if (paramIntent != null)
          break label131;
        AppMethodBeat.o(21456);
      }
      label131: setResult(-1, paramIntent);
      continue;
      setResult(1);
    }
  }

  public final void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(21452);
    ab.i("MicroMsg.GalleryEntryUI", "on create");
    super.onCreate(paramBundle);
    ab.i("MicroMsg.GalleryEntryUI", "checktask onCreate:%s#0x%x task:%s", new Object[] { getClass().getSimpleName(), Integer.valueOf(hashCode()), bo.gU(this) });
    e.initialize();
    this.mPB = getIntent().getIntExtra("query_source_type", 3);
    this.mQk = getIntent().getIntExtra("query_media_type", 1);
    ab.i("MicroMsg.GalleryEntryUI", "query souce: " + this.mPB + ", queryType: " + this.mQk);
    e.bBZ().wq(this.mQk);
    e.bBZ().hOZ = this.mPB;
    AppMethodBeat.o(21452);
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(21457);
    super.onDestroy();
    ab.i("MicroMsg.GalleryEntryUI", "onDestroy %B", new Object[] { Boolean.valueOf(this.iIq) });
    e.release(this.iIq);
    ab.i("MicroMsg.GalleryEntryUI", "checktask onDestroy:%s#0x%x task:%s ", new Object[] { getClass().getSimpleName(), Integer.valueOf(hashCode()), bo.gU(this) });
    AppMethodBeat.o(21457);
  }

  public final void onNewIntent(Intent paramIntent)
  {
    AppMethodBeat.i(21455);
    super.onNewIntent(paramIntent);
    ab.d("MicroMsg.GalleryEntryUI", "on new intent, #0x%x", new Object[] { Integer.valueOf(hashCode()) });
    AppMethodBeat.o(21455);
  }

  protected final void onRestoreInstanceState(Bundle paramBundle)
  {
    AppMethodBeat.i(21453);
    ab.d("MicroMsg.GalleryEntryUI", "onRestoreInstanceState");
    super.onRestoreInstanceState(paramBundle);
    this.mInit = true;
    AppMethodBeat.o(21453);
  }

  public final void onResume()
  {
    AppMethodBeat.i(21454);
    ab.i("MicroMsg.GalleryEntryUI", "on resume, init %B", new Object[] { Boolean.valueOf(this.mInit) });
    super.onResume();
    Object localObject;
    if (!this.mInit)
    {
      ab.e("MicroMsg.GalleryEntryUI", "doRedirect %s", new Object[] { bo.dpG() });
      localObject = getIntent();
      if (!((Intent)localObject).getBooleanExtra("preview_image", false))
        break label235;
      ab.d("MicroMsg.GalleryEntryUI", "jump to preview ui directly");
      ArrayList localArrayList = ((Intent)localObject).getStringArrayListExtra("preview_image_list");
      Intent localIntent = new Intent(this, ImagePreviewUI.class);
      localIntent.addFlags(67108864);
      localIntent.putExtra("max_select_count", ((Intent)localObject).getIntExtra("max_select_count", 9));
      localIntent.putExtra("query_source_type", this.mPB);
      localIntent.putExtra("isPreviewPhoto", ((Intent)localObject).getBooleanExtra("isPreviewPhoto", false));
      localIntent.putExtra("preview_image", ((Intent)localObject).getBooleanExtra("preview_image", false));
      localObject = getIntent().getStringExtra("GalleryUI_FromUser");
      String str = getIntent().getStringExtra("GalleryUI_ToUser");
      if (!bo.isNullOrNil((String)localObject))
        localIntent.putExtra("GalleryUI_FromUser", (String)localObject);
      if (!bo.isNullOrNil(str))
        localIntent.putExtra("GalleryUI_ToUser", str);
      localIntent.putStringArrayListExtra("preview_image_list", localArrayList);
      startActivityForResult(localIntent, 1);
    }
    while (true)
    {
      this.mInit = true;
      AppMethodBeat.o(21454);
      return;
      label235: ((Intent)localObject).setClass(this, AlbumPreviewUI.class);
      ((Intent)localObject).addFlags(67108864);
      ((Intent)localObject).putExtra("key_edit_text_color", getIntent().getStringExtra("key_edit_text_color"));
      ((Intent)localObject).putExtra("send_btn_string", getIntent().getStringExtra("send_btn_string"));
      ((Intent)localObject).putExtra("max_select_count", getIntent().getIntExtra("max_select_count", 9));
      ((Intent)localObject).putExtra("GalleryUI_FromUser", getIntent().getStringExtra("GalleryUI_FromUser"));
      ((Intent)localObject).putExtra("GalleryUI_ToUser", getIntent().getStringExtra("GalleryUI_ToUser"));
      ((Intent)localObject).putExtra("key_send_raw_image", getIntent().getBooleanExtra("key_send_raw_image", false));
      ((Intent)localObject).putExtra("GalleryUI_SkipVideoSizeLimit", getIntent().getBooleanExtra("GalleryUI_SkipVideoSizeLimit", false));
      startActivityForResult((Intent)localObject, 0);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.ui.GalleryEntryUI
 * JD-Core Version:    0.6.2
 */