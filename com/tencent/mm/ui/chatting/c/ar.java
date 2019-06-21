package com.tencent.mm.ui.chatting.c;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.HandlerThread;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.r;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.modelvideo.u;
import com.tencent.mm.plugin.mmsight.SightCaptureResult;
import com.tencent.mm.plugin.sight.decode.a.b;
import com.tencent.mm.pluginsdk.model.j;
import com.tencent.mm.protocal.protobuf.baa;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMFragment;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.c.b.aa;
import com.tencent.mm.ui.chatting.c.b.ai;
import com.tencent.mm.ui.chatting.gallery.ImageGalleryUI;
import com.tencent.mm.ui.transmit.MsgRetransmitUI;
import java.util.ArrayList;

@com.tencent.mm.ui.chatting.c.a.a(dFp=ai.class)
public class ar extends a
  implements ai
{
  private long yTb;
  private SparseBooleanArray yTc;

  public ar()
  {
    AppMethodBeat.i(31851);
    this.yTb = -1L;
    this.yTc = new SparseBooleanArray();
    AppMethodBeat.o(31851);
  }

  private void aX(Intent paramIntent)
  {
    AppMethodBeat.i(31859);
    com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.ChattingUI.VideoComponent", "sendVideoFromCustomRecord");
    if (paramIntent == null)
    {
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.ChattingUI.VideoComponent", "data == null");
      AppMethodBeat.o(31859);
    }
    while (true)
    {
      return;
      Object localObject = paramIntent.getStringExtra("VideoRecorder_ToUser");
      String str = paramIntent.getStringExtra("VideoRecorder_FileName");
      int i = paramIntent.getIntExtra("VideoRecorder_VideoLength", 0);
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.ChattingUI.VideoComponent", "fileName " + str + " length " + i + " user " + (String)localObject);
      if ((bo.isNullOrNil((String)localObject)) || (bo.isNullOrNil(str)) || (i < 0))
      {
        AppMethodBeat.o(31859);
      }
      else if ((((String)localObject).equals("medianote")) && ((r.YD() & 0x4000) == 0))
      {
        paramIntent = new s();
        paramIntent.fileName = str;
        paramIntent.fXd = i;
        paramIntent.cIS = ((String)localObject);
        paramIntent.fWW = ((String)g.RP().Ry().get(2, ""));
        paramIntent.createTime = bo.anT();
        paramIntent.fXb = bo.anT();
        paramIntent.fWY = i;
        paramIntent.fVG = i;
        o.all();
        i = com.tencent.mm.modelvideo.t.uj(com.tencent.mm.modelvideo.t.uh(str));
        if (i <= 0)
        {
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.VideoLogic", "get Video size failed :".concat(String.valueOf(str)));
          AppMethodBeat.o(31859);
        }
        else
        {
          paramIntent.frO = i;
          o.all();
          localObject = com.tencent.mm.modelvideo.t.ui(str);
          i = com.tencent.mm.modelvideo.t.uj((String)localObject);
          if (i <= 0)
          {
            com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.VideoLogic", "get Thumb size failed :" + (String)localObject + " size:" + i);
            AppMethodBeat.o(31859);
          }
          else
          {
            paramIntent.fXa = i;
            com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.VideoLogic", "init record file:" + str + " thumbsize:" + paramIntent.fXa + " videosize:" + paramIntent.frO);
            paramIntent.status = 199;
            localObject = new bi();
            ((bi)localObject).ju(paramIntent.getUser());
            ((bi)localObject).setType(43);
            ((bi)localObject).hO(1);
            ((bi)localObject).jv(str);
            ((bi)localObject).setStatus(2);
            ((bi)localObject).eJ(bf.oC(paramIntent.getUser()));
            paramIntent.fXe = ((int)bf.l((bi)localObject));
            o.all().b(paramIntent);
            AppMethodBeat.o(31859);
          }
        }
      }
      else
      {
        u.c(str, i, (String)localObject, null);
        u.uo(str);
        this.cgL.qp(true);
        AppMethodBeat.o(31859);
      }
    }
  }

  private void aj(Intent paramIntent)
  {
    AppMethodBeat.i(31858);
    com.tencent.mm.modelvideo.c localc = new com.tencent.mm.modelvideo.c();
    localc.a(this.cgL.yTx.getContext(), paramIntent, new ar.6(this));
    com.tencent.mm.ui.chatting.d.a locala = this.cgL;
    paramIntent = this.cgL.yTx.getContext();
    this.cgL.yTx.getMMResources().getString(2131297061);
    locala.c(paramIntent, this.cgL.yTx.getMMResources().getString(2131297086), new ar.7(this, localc));
    AppMethodBeat.o(31858);
  }

  private void ap(ArrayList<String> paramArrayList)
  {
    AppMethodBeat.i(31856);
    com.tencent.mm.sdk.platformtools.ab.v("MicroMsg.ChattingUI.VideoComponent", "send video path: %s", new Object[] { paramArrayList.toString() });
    paramArrayList = new j(this.cgL.yTx.getContext(), paramArrayList, null, this.cgL.getTalkerUserName(), 2, new ar.3(this));
    com.tencent.mm.ui.chatting.d.a locala = this.cgL;
    Activity localActivity = this.cgL.yTx.getContext();
    this.cgL.yTx.getMMResources().getString(2131297061);
    locala.c(localActivity, this.cgL.yTx.getMMResources().getString(2131297086), new ar.4(this, paramArrayList));
    d.post(paramArrayList, "ChattingUI_importMultiVideo");
    AppMethodBeat.o(31856);
  }

  private void eC(String paramString, int paramInt)
  {
    AppMethodBeat.i(31852);
    aw.RS().aa(new ar.1(this, paramString, paramInt));
    AppMethodBeat.o(31852);
  }

  public final boolean a(MenuItem paramMenuItem, bi parambi)
  {
    AppMethodBeat.i(31853);
    boolean bool;
    switch (paramMenuItem.getItemId())
    {
    default:
    case 106:
    case 107:
      while (true)
      {
        bool = false;
        AppMethodBeat.o(31853);
        return bool;
        paramMenuItem = o.all().uf(parambi.field_imgPath);
        if (paramMenuItem != null)
          if (paramMenuItem.status == 199)
          {
            o.all();
            parambi = com.tencent.mm.modelvideo.t.uh(parambi.field_imgPath);
            if (paramMenuItem != null)
            {
              i = 0;
              if (com.tencent.mm.model.t.kH(paramMenuItem.getUser()))
                i = com.tencent.mm.model.n.mA(paramMenuItem.getUser());
              com.tencent.mm.plugin.report.service.h.pYm.a(106L, 215L, 1L, false);
              com.tencent.mm.plugin.report.service.h.pYm.e(12084, new Object[] { Integer.valueOf(paramMenuItem.frO), Integer.valueOf(paramMenuItem.fXd * 1000), Integer.valueOf(0), Integer.valueOf(2), paramMenuItem.getUser(), Integer.valueOf(i), s.ue(paramMenuItem.alw()), Long.valueOf(paramMenuItem.createTime) });
            }
            paramMenuItem = u.uu(parambi);
            if (bo.isNullOrNil(paramMenuItem))
              Toast.makeText(this.cgL.yTx.getContext(), this.cgL.yTx.getMMResources().getString(2131304256), 1).show();
          }
        while (true)
        {
          bool = true;
          AppMethodBeat.o(31853);
          break;
          Toast.makeText(this.cgL.yTx.getContext(), this.cgL.yTx.getMMResources().getString(2131304257, new Object[] { paramMenuItem }), 1).show();
          com.tencent.mm.pluginsdk.ui.tools.n.a(paramMenuItem, this.cgL.yTx.getContext());
          continue;
          eC(paramMenuItem.getFileName(), 6);
          paramMenuItem = new Intent(this.cgL.yTx.getContext(), ImageGalleryUI.class);
          paramMenuItem.putExtra("img_gallery_msg_id", parambi.field_msgId);
          paramMenuItem.putExtra("img_gallery_msg_svr_id", parambi.field_msgSvrId);
          paramMenuItem.putExtra("img_gallery_talker", parambi.field_talker);
          paramMenuItem.putExtra("img_gallery_chatroom_name", parambi.field_talker);
          paramMenuItem.putExtra("img_gallery_enter_video_opcode", u.e(parambi.field_msgId, 2));
          i.a(this.cgL, parambi, paramMenuItem);
          this.cgL.yTx.startActivity(paramMenuItem);
          this.cgL.yTx.overridePendingTransition(0, 0);
          continue;
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.ChattingUI.VideoComponent", "save video but videoInfo is null!");
        }
        aw.ZK();
        if (!com.tencent.mm.model.c.isSDCardAvailable())
        {
          com.tencent.mm.ui.base.t.hO(this.cgL.yTx.getContext());
        }
        else
        {
          s locals = u.ut(parambi.field_imgPath);
          if (locals != null)
          {
            localObject = locals.alv();
            paramMenuItem = (MenuItem)localObject;
            if (!com.tencent.mm.vfs.e.ct((String)localObject))
            {
              o.all();
              paramMenuItem = com.tencent.mm.modelvideo.t.uh(parambi.field_imgPath);
            }
            if (parambi.dtH())
            {
              com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ChattingUI.VideoComponent", "video is clean!!!");
              com.tencent.mm.ui.base.h.a(this.cgL.yTx.getContext(), this.cgL.yTx.getContext().getString(2131304241), this.cgL.yTx.getContext().getString(2131297061), new ar.2(this));
            }
            else if (i.e(parambi, paramMenuItem))
            {
              com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ChattingUI.VideoComponent", "video is expired");
              eC(locals.getFileName(), 3);
              paramMenuItem = new Intent(this.cgL.yTx.getContext(), ImageGalleryUI.class);
              paramMenuItem.putExtra("img_gallery_msg_id", parambi.field_msgId);
              paramMenuItem.putExtra("img_gallery_msg_svr_id", parambi.field_msgSvrId);
              paramMenuItem.putExtra("img_gallery_talker", parambi.field_talker);
              paramMenuItem.putExtra("img_gallery_chatroom_name", parambi.field_talker);
              paramMenuItem.putExtra("img_gallery_enter_video_opcode", u.e(parambi.field_msgId, 1));
              i.a(this.cgL, parambi, paramMenuItem);
              this.cgL.yTx.startActivity(paramMenuItem);
              this.cgL.yTx.overridePendingTransition(0, 0);
              if (locals.aly())
              {
                com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ChattingUI.VideoComponent", "start complete online video");
                u.uA(parambi.field_imgPath);
              }
              else
              {
                com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ChattingUI.VideoComponent", "start complete offline video");
                u.up(parambi.field_imgPath);
              }
            }
            else
            {
              if ((parambi.bws()) || (parambi.bwt()))
              {
                paramMenuItem = new Intent(this.cgL.yTx.getContext(), MsgRetransmitUI.class);
                paramMenuItem.putExtra("Retr_length", locals.fXd);
                paramMenuItem.putExtra("Retr_File_Name", parambi.field_imgPath);
                paramMenuItem.putExtra("Retr_video_isexport", locals.fXh);
                paramMenuItem.putExtra("Retr_Msg_Id", parambi.field_msgId);
                paramMenuItem.putExtra("Retr_From", "chattingui");
                com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.ChattingUI.VideoComponent", "dkvideo msg.getType():" + parambi.getType());
                if (parambi.bwt())
                  paramMenuItem.putExtra("Retr_Msg_Type", 11);
                while (true)
                {
                  this.cgL.yTx.startActivity(paramMenuItem);
                  break;
                  paramMenuItem.putExtra("Retr_Msg_Type", 1);
                }
              }
              com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.ChattingUI.VideoComponent", "retranmist video unknow status.");
            }
          }
          else
          {
            com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.ChattingUI.VideoComponent", "retransmit video but videoInfo is null!");
          }
        }
      }
    case 130:
    }
    Object localObject = paramMenuItem.getIntent();
    int i = 0;
    int j = 0;
    paramMenuItem = new int[2];
    if (localObject == null)
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.ChattingUI.VideoComponent", "[LONGCLICK_MENU_MUTE_PLAY] intent is null!");
    while (true)
    {
      localObject = new Intent(this.cgL.yTx.getContext(), ImageGalleryUI.class);
      ((Intent)localObject).putExtra("img_gallery_msg_id", parambi.field_msgId);
      ((Intent)localObject).putExtra("img_gallery_msg_svr_id", parambi.field_msgSvrId);
      ((Intent)localObject).putExtra("img_gallery_talker", parambi.field_talker);
      ((Intent)localObject).putExtra("img_gallery_chatroom_name", parambi.field_talker);
      ((Intent)localObject).putExtra("img_gallery_left", paramMenuItem[0]);
      ((Intent)localObject).putExtra("img_gallery_top", paramMenuItem[1]);
      ((Intent)localObject).putExtra("img_gallery_width", i);
      ((Intent)localObject).putExtra("img_gallery_height", j);
      ((Intent)localObject).putExtra("img_gallery_enter_video_opcode", u.e(parambi.field_msgId, 3));
      i.a(this.cgL, parambi, (Intent)localObject);
      this.cgL.yTx.startActivity((Intent)localObject);
      this.cgL.yTx.overridePendingTransition(0, 0);
      bool = true;
      AppMethodBeat.o(31853);
      break;
      i = ((Intent)localObject).getIntExtra("img_gallery_width", 0);
      j = ((Intent)localObject).getIntExtra("img_gallery_height", 0);
      paramMenuItem[0] = ((Intent)localObject).getIntExtra("img_gallery_left", 0);
      paramMenuItem[1] = ((Intent)localObject).getIntExtra("img_gallery_top", 0);
    }
  }

  public final void aW(Intent paramIntent)
  {
    AppMethodBeat.i(31855);
    if (paramIntent == null)
      AppMethodBeat.o(31855);
    while (true)
    {
      return;
      paramIntent = paramIntent.getStringArrayListExtra("key_select_video_list");
      if ((paramIntent != null) && (paramIntent.size() > 0))
      {
        if (!com.tencent.mm.network.ab.ch(this.cgL.yTx.getContext()))
        {
          ap(paramIntent);
          AppMethodBeat.o(31855);
        }
        else
        {
          ap(paramIntent);
          AppMethodBeat.o(31855);
        }
      }
      else
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.ChattingUI.VideoComponent", "send video list is null or nil");
        AppMethodBeat.o(31855);
      }
    }
  }

  public final void ai(Intent paramIntent)
  {
    AppMethodBeat.i(31857);
    com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.ChattingUI.VideoComponent", "sendVideo");
    if (!com.tencent.mm.network.ab.ch(this.cgL.yTx.getContext()))
    {
      com.tencent.mm.ui.base.h.a(this.cgL.yTx.getContext(), 2131304250, 2131297061, new ar.5(this, paramIntent), null);
      AppMethodBeat.o(31857);
    }
    while (true)
    {
      return;
      aj(paramIntent);
      AppMethodBeat.o(31857);
    }
  }

  public final void dxA()
  {
    AppMethodBeat.i(31861);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ChattingUI.VideoComponent", "[onChattingResume]");
    com.tencent.mm.ui.chatting.c.b.h localh = (com.tencent.mm.ui.chatting.c.b.h)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.h.class);
    o.all().a(localh.dCX(), aw.RS().oAl.getLooper());
    AppMethodBeat.o(31861);
  }

  public final void dxB()
  {
    AppMethodBeat.i(31862);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ChattingUI.VideoComponent", "[onChattingPause]");
    com.tencent.mm.ui.chatting.c.b.h localh = (com.tencent.mm.ui.chatting.c.b.h)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.h.class);
    o.all().a(localh.dCX());
    AppMethodBeat.o(31862);
  }

  public final void dxC()
  {
    AppMethodBeat.i(31863);
    b.WY();
    this.yTc.clear();
    AppMethodBeat.o(31863);
  }

  public final boolean e(bi parambi, boolean paramBoolean)
  {
    AppMethodBeat.i(31854);
    boolean bool;
    if (parambi.bws())
    {
      o.all();
      bool = paramBoolean;
      if (!com.tencent.mm.vfs.e.ct(com.tencent.mm.modelvideo.t.uh(parambi.field_imgPath)))
        bool = false;
    }
    while (true)
    {
      AppMethodBeat.o(31854);
      return bool;
      bool = paramBoolean;
      if (parambi.bwt())
      {
        o.all();
        bool = paramBoolean;
        if (!com.tencent.mm.vfs.e.ct(com.tencent.mm.modelvideo.t.uh(parambi.field_imgPath)))
          bool = false;
      }
    }
  }

  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(31860);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    switch (paramInt1)
    {
    default:
    case 208:
    case 215:
    case 216:
    case 218:
    case 226:
    }
    while (true)
    {
      AppMethodBeat.o(31860);
      while (true)
      {
        return;
        ai(paramIntent);
        AppMethodBeat.o(31860);
        continue;
        ai(paramIntent);
        AppMethodBeat.o(31860);
        continue;
        aX(paramIntent);
        AppMethodBeat.o(31860);
        continue;
        if (paramIntent != null)
        {
          if (paramIntent.getBooleanExtra("from_record", false))
          {
            aX(paramIntent);
            AppMethodBeat.o(31860);
          }
          else
          {
            ai(paramIntent);
          }
        }
        else
        {
          AppMethodBeat.o(31860);
          continue;
          if (paramIntent == null)
          {
            com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.ChattingUI.VideoComponent", "[dealWithRequestCode] REQUEST_SIGHT_CAPTURE! null == data");
            AppMethodBeat.o(31860);
          }
          else
          {
            paramIntent = (SightCaptureResult)paramIntent.getParcelableExtra("key_req_result");
            if (paramIntent == null)
            {
              com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.ChattingUI.VideoComponent", "[dealWithRequestCode] REQUEST_SIGHT_CAPTURE! null == captureResult");
              AppMethodBeat.o(31860);
            }
            else
            {
              if (paramIntent.osA)
                break;
              com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ChattingUI.VideoComponent", "video path %s thumb path ", new Object[] { paramIntent.osC, paramIntent.osD });
              o.all();
              String str = com.tencent.mm.modelvideo.t.uh(paramIntent.osE);
              if (!paramIntent.osC.equals(str))
              {
                com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ChattingUI.VideoComponent", "filepath not videopath and move it %s %s", new Object[] { paramIntent.osC, str });
                com.tencent.mm.vfs.e.aQ(paramIntent.osC, str);
              }
              str = paramIntent.osE;
              paramInt1 = paramIntent.osG;
              Object localObject = this.cgL.getTalkerUserName();
              baa localbaa = paramIntent.osH;
              s locals = new s();
              locals.fileName = str;
              locals.fXd = paramInt1;
              locals.cIS = ((String)localObject);
              locals.fWW = ((String)g.RP().Ry().get(2, ""));
              locals.createTime = bo.anT();
              locals.fXb = bo.anT();
              locals.fXn = localbaa;
              locals.fXh = 0;
              locals.fXk = 1;
              o.all();
              paramInt1 = com.tencent.mm.modelvideo.t.uj(com.tencent.mm.modelvideo.t.uh(str));
              boolean bool;
              if (paramInt1 <= 0)
              {
                com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.VideoLogic", "get Video size failed :".concat(String.valueOf(str)));
                bool = false;
              }
              while (true)
              {
                if (!bool)
                  break label676;
                u.uo(paramIntent.osE);
                AppMethodBeat.o(31860);
                break;
                locals.frO = paramInt1;
                o.all();
                localObject = com.tencent.mm.modelvideo.t.ui(str);
                paramInt1 = com.tencent.mm.modelvideo.t.uj((String)localObject);
                if (paramInt1 <= 0)
                {
                  com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.VideoLogic", "get Thumb size failed :" + (String)localObject + " size:" + paramInt1);
                  bool = false;
                }
                else
                {
                  locals.fXa = paramInt1;
                  com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.VideoLogic", "prepareMMSightRecord file:" + str + " thumbsize:" + locals.fXa + " videosize:" + locals.frO);
                  locals.status = 102;
                  localObject = new bi();
                  ((bi)localObject).ju(locals.getUser());
                  ((bi)localObject).setType(43);
                  ((bi)localObject).hO(1);
                  ((bi)localObject).jv(str);
                  ((bi)localObject).setStatus(1);
                  ((bi)localObject).eJ(bf.oC(locals.getUser()));
                  locals.fXe = ((int)bf.l((bi)localObject));
                  bool = o.all().b(locals);
                }
              }
              label676: com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.ChattingUI.VideoComponent", "prepareMMSightRecord failed");
              AppMethodBeat.o(31860);
            }
          }
        }
      }
      ((aa)this.cgL.aF(aa.class)).a(paramIntent);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.ar
 * JD-Core Version:    0.6.2
 */