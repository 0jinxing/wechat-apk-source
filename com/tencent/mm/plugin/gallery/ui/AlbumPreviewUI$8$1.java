package com.tencent.mm.plugin.gallery.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.k;
import com.tencent.mm.plugin.gallery.model.l;
import com.tencent.mm.plugin.mmsight.SightParams;
import com.tencent.mm.pluginsdk.ui.tools.n;
import com.tencent.mm.r.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import java.io.File;

final class AlbumPreviewUI$8$1
  implements View.OnClickListener
{
  AlbumPreviewUI$8$1(AlbumPreviewUI.8 param8)
  {
  }

  private void bCD()
  {
    AppMethodBeat.i(21400);
    String str1 = this.mPT.mPO.getIntent().getStringExtra("to_user");
    String str2 = this.mPT.mPO.getIntent().getStringExtra("file_name");
    String str3 = this.mPT.mPO.getIntent().getStringExtra("video_path");
    String str4 = this.mPT.mPO.getIntent().getStringExtra("video_full_path");
    String str5 = this.mPT.mPO.getIntent().getStringExtra("video_thumb_path");
    try
    {
      Intent localIntent = new android/content/Intent;
      localIntent.<init>();
      localIntent.setClassName(this.mPT.mPO.mController.ylL.getPackageName(), "com.tencent.mm.plugin.sysvideo.ui.video.VideoRecorderUI");
      localIntent.putExtra("VideoRecorder_ToUser", str1);
      localIntent.putExtra("VideoRecorder_FileName", str2);
      localIntent.putExtra("VideoRecorder_VideoPath", str3);
      localIntent.putExtra("VideoRecorder_VideoFullPath", str4);
      localIntent.putExtra("VideoRecorder_VideoThumbPath", str5);
      ab.d("MicroMsg.AlbumPreviewUI", "try to record video, dump intent:\n%s", new Object[] { localIntent });
      this.mPT.mPO.startActivityForResult(localIntent, 4371);
      AppMethodBeat.o(21400);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.w("MicroMsg.AlbumPreviewUI", localException.toString());
        if ((!a.bI(this.mPT.mPO.mController.ylL)) && (!a.bH(this.mPT.mPO.mController.ylL)))
          com.tencent.mm.compatible.j.b.s(this.mPT.mPO.mController.ylL);
        AppMethodBeat.o(21400);
      }
    }
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(21401);
    ab.d("MicroMsg.AlbumPreviewUI", "on click open camera, valid click times[%d]", new Object[] { Integer.valueOf(AlbumPreviewUI.I(this.mPT.mPO)) });
    if (AlbumPreviewUI.J(this.mPT.mPO))
    {
      ab.w("MicroMsg.AlbumPreviewUI", "click open camera, but camera is opening");
      AppMethodBeat.o(21401);
    }
    while (true)
    {
      return;
      AlbumPreviewUI.K(this.mPT.mPO);
      AlbumPreviewUI.L(this.mPT.mPO);
      if ((com.tencent.mm.plugin.gallery.model.e.bBZ().mOu == 2) || (com.tencent.mm.plugin.gallery.model.e.bBZ().hOZ == 13))
      {
        if (this.mPT.mPO.getIntent().getBooleanExtra("record_video_force_sys_camera", false))
        {
          int i = this.mPT.mPO.getIntent().getIntExtra("record_video_quality", 0);
          int j = this.mPT.mPO.getIntent().getIntExtra("record_video_time_limit", 0);
          paramView = this.mPT.mPO.getIntent().getStringExtra("video_full_path");
          n.a(this.mPT.mPO.mController.ylL, paramView, 4372, j, i, false);
          AppMethodBeat.o(21401);
        }
        else if (this.mPT.mPO.getIntent().getBooleanExtra("record_video_is_sight_capture", false))
        {
          if ((SightParams)this.mPT.mPO.getIntent().getParcelableExtra("KEY_SIGHT_PARAMS") == null)
            ab.e("MicroMsg.AlbumPreviewUI", "takeMMSight, sightParams == null");
          if (com.tencent.mm.plugin.gallery.model.e.bBZ().hOZ != 13)
          {
            n.a(this.mPT.mPO.mController.ylL, 4375, this.mPT.mPO.getIntent(), 3, 1);
            AppMethodBeat.o(21401);
          }
          else
          {
            n.a(this.mPT.mPO.mController.ylL, 4375, this.mPT.mPO.getIntent(), 4, 1);
            AppMethodBeat.o(21401);
          }
        }
        else if (com.tencent.mm.compatible.e.q.etn.erY == 2)
        {
          bCD();
          AppMethodBeat.o(21401);
        }
        else if ((com.tencent.mm.compatible.e.q.etn.erY == 1) && (!a.bI(this.mPT.mPO.mController.ylL)) && (!a.bH(this.mPT.mPO.mController.ylL)))
        {
          com.tencent.mm.compatible.j.b.s(this.mPT.mPO.mController.ylL);
          AppMethodBeat.o(21401);
        }
        else
        {
          bCD();
          AppMethodBeat.o(21401);
        }
      }
      else if ((com.tencent.mm.plugin.gallery.model.e.bBZ().mOu == 1) || (com.tencent.mm.plugin.gallery.model.e.bBZ().mOu == 3))
      {
        paramView = new File(com.tencent.mm.compatible.util.e.euR);
        if ((!paramView.exists()) && (!paramView.mkdir()))
        {
          Toast.makeText(this.mPT.mPO.mController.ylL, this.mPT.mPO.getString(2131298250), 1).show();
          AppMethodBeat.o(21401);
        }
        else
        {
          boolean bool = com.tencent.mm.pluginsdk.permission.b.a(this.mPT.mPO.mController.ylL, "android.permission.CAMERA", 16, "", "");
          ab.i("MicroMsg.AlbumPreviewUI", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bo.dpG(), this.mPT.mPO.mController.ylL });
          if (!bool)
            AppMethodBeat.o(21401);
          else
            AlbumPreviewUI.M(this.mPT.mPO);
        }
      }
      else
      {
        AppMethodBeat.o(21401);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI.8.1
 * JD-Core Version:    0.6.2
 */