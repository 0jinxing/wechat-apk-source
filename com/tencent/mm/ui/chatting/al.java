package com.tencent.mm.ui.chatting;

import android.app.Activity;
import android.os.HandlerThread;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.al.b;
import com.tencent.mm.al.f;
import com.tencent.mm.at.d;
import com.tencent.mm.g.a.pe;
import com.tencent.mm.g.a.pe.a;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bf;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.modelvideo.u;
import com.tencent.mm.modelvideo.y.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.chatting.gallery.ImageGalleryUI;
import java.lang.ref.WeakReference;

public final class al extends com.tencent.mm.sdk.b.c<pe>
{
  private WeakReference<Activity> gWO;
  private al.a yMa;

  public al(al.a parama, Activity paramActivity)
  {
    super(0);
    AppMethodBeat.i(30994);
    this.yMa = null;
    this.yMa = parama;
    this.gWO = new WeakReference(paramActivity);
    this.xxI = pe.class.getName().hashCode();
    AppMethodBeat.o(30994);
  }

  private boolean a(pe parampe)
  {
    AppMethodBeat.i(30995);
    Activity localActivity = (Activity)this.gWO.get();
    long l;
    String str;
    Object localObject;
    if ((this.yMa != null) && (parampe != null) && ((parampe instanceof pe)) && (localActivity != null))
    {
      l = parampe.cLt.cvx;
      str = parampe.cLt.cLu;
      localObject = parampe.cLt.cLv;
      if ((localObject != null) && (((cy)localObject).field_msgId > 0L))
        break label577;
    }
    label405: label577: for (parampe = parampe.cLt.cLv; ; parampe = (pe)localObject)
    {
      if (parampe == null)
      {
        ab.e("MicroMsg.RevokeMsgListener", "in callback msgInfo null");
        AppMethodBeat.o(30995);
        return false;
      }
      switch (parampe.getType())
      {
      default:
      case 3:
      case 43:
      case 62:
      }
      while (true)
      {
        AppMethodBeat.o(30995);
        break;
        switch (al.3.yMc[this.yMa.ordinal()])
        {
        default:
          break;
        case 1:
          if ((parampe != null) && (parampe.field_msgId > 0L))
            localObject = com.tencent.mm.al.c.a("downimg", parampe.field_createTime, parampe.field_talker, parampe.field_msgId);
          try
          {
            f.afx().rO((String)localObject);
            ab.i("MicroMsg.RevokeMsgListener", "[oneliang][revokeMsgImage] cancel result:%s", new Object[] { Boolean.TRUE });
            aw.Rg().cancel(109);
            parampe = com.tencent.mm.ui.chatting.gallery.e.d(parampe);
            com.tencent.mm.at.o.ahm().x(parampe.fDy, l);
            if ((localActivity == null) || (!(localActivity instanceof ImageGalleryUI)))
              continue;
            parampe = (ImageGalleryUI)localActivity;
            ab.i("MicroMsg.RevokeMsgListener", "[oneliang][revokeMsgImage] image gallery ui,msg id is:%s,downloadingImageMsgId: %s", new Object[] { Long.valueOf(l), Long.valueOf(parampe.cvx) });
            if (l != parampe.cvx)
              continue;
            h.a(localActivity, str, "", false, new al.1(this, localActivity));
          }
          catch (Exception parampe)
          {
            while (true)
              ab.printErrStackTrace("MicroMsg.RevokeMsgListener", parampe, "[oneliang][revokeMsgImage] cancel failure:%s", new Object[] { parampe.getMessage() });
          }
          localObject = this.yMa;
          boolean bool;
          if (Looper.myLooper() == aw.RS().oAl.getLooper())
          {
            bool = true;
            ab.v("MicroMsg.RevokeMsgListener", "ashutest::revoke msg, type %s, isWorkerThread %B", new Object[] { localObject, Boolean.valueOf(bool) });
          }
          switch (al.3.yMc[this.yMa.ordinal()])
          {
          default:
            break;
          case 2:
            aY(parampe);
            if ((localActivity instanceof ImageGalleryUI))
            {
              localObject = (ImageGalleryUI)localActivity;
              if ((((ImageGalleryUI)localObject).yTG != null) && (com.tencent.mm.ui.chatting.gallery.c.f(parampe)) && (parampe.field_msgId == ((ImageGalleryUI)localObject).yTG.dFO().field_msgId));
              for (int i = 1; i != 0; i = 0)
              {
                ((ImageGalleryUI)localObject).Pc(((ImageGalleryUI)localObject).getCurrentItem());
                h.a(localActivity, str, "", false, new al.2(this, localActivity));
                break;
                bool = false;
                break label405;
              }
            }
            break;
          case 3:
            aY(parampe);
          }
          break;
        }
      }
    }
  }

  private static void aY(bi parambi)
  {
    AppMethodBeat.i(30996);
    Object localObject = u.ut(parambi.field_imgPath);
    if (localObject != null)
      localObject = com.tencent.mm.al.c.a("downvideo", ((s)localObject).createTime, ((s)localObject).getUser(), ((s)localObject).getFileName());
    while (true)
    {
      try
      {
        f.afx().rO((String)localObject);
        ab.i("MicroMsg.RevokeMsgListener", "ashutest::[oneliang][revokeMsgVideo] cancel result:%s", new Object[] { Boolean.TRUE });
        com.tencent.mm.modelvideo.o.alq().alH();
        bf.m(parambi);
        AppMethodBeat.o(30996);
        return;
      }
      catch (Exception parambi)
      {
        ab.printErrStackTrace("MicroMsg.RevokeMsgListener", parambi, "[oneliang][revokeMsgVideo] chatting item video,cancel failure:%s", new Object[] { parambi.getMessage() });
      }
      AppMethodBeat.o(30996);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.al
 * JD-Core Version:    0.6.2
 */