package com.tencent.mm.ui.tools;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.g;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.sdk.platformtools.ah;

final class CropImageNewUI$22
  implements Runnable
{
  CropImageNewUI$22(CropImageNewUI paramCropImageNewUI)
  {
  }

  public final void run()
  {
    boolean bool = false;
    AppMethodBeat.i(34836);
    if (CropImageNewUI.e(this.zBc) == null)
    {
      AppMethodBeat.o(34836);
      return;
    }
    if (this.zBc.getIntent().getBooleanExtra("CropImage_DirectlyIntoFilter", false))
    {
      localObject1 = this.zBc.getSharedPreferences(ah.doA(), 0).edit();
      if (CropImageNewUI.e(this.zBc).findViewById(2131823173).getVisibility() == 0)
        bool = true;
      ((SharedPreferences.Editor)localObject1).putBoolean("CropImage_Filter_Show", bool);
      ((SharedPreferences.Editor)localObject1).commit();
    }
    Object localObject2 = this.zBc.getIntent().getStringExtra("CropImage_OutputPath");
    Object localObject1 = localObject2;
    if (localObject2 == null)
      localObject1 = e.euR + g.x(new StringBuilder().append(CropImageNewUI.o(this.zBc)).append(System.currentTimeMillis()).toString().getBytes()) + "_fiter.jpg";
    localObject2 = new Intent();
    ((Intent)localObject2).putExtra("CropImage_Compress_Img", true);
    if (CropImageNewUI.e(this.zBc) != null)
      ((Intent)localObject2).putExtra("CropImage_filterId", CropImageNewUI.e(this.zBc).getFilterId());
    if (CropImageNewUI.e(this.zBc).getFilterId() == 0)
    {
      ((Intent)localObject2).putExtra("CropImage_OutputPath", CropImageNewUI.o(this.zBc));
      this.zBc.setResult(-1, (Intent)localObject2);
    }
    while (true)
    {
      this.zBc.finish();
      AppMethodBeat.o(34836);
      break;
      if (CropImageNewUI.a(this.zBc, CropImageNewUI.e(this.zBc).getFilterBmp(), (String)localObject1))
      {
        ((Intent)localObject2).putExtra("CropImage_OutputPath", (String)localObject1);
        this.zBc.setResult(-1, (Intent)localObject2);
      }
      else
      {
        this.zBc.setResult(-1);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.CropImageNewUI.22
 * JD-Core Version:    0.6.2
 */