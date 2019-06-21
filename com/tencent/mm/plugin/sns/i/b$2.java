package com.tencent.mm.plugin.sns.i;

import android.os.Process;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.t;
import com.tencent.mm.modelsns.d;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.aj;
import com.tencent.mm.plugin.sns.storage.l;
import com.tencent.mm.plugin.sns.storage.m;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.protocal.protobuf.aao;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashSet;

public final class b$2
  implements Runnable
{
  public b$2(b paramb, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(36845);
    if (!g.RN().QY())
    {
      ab.w("MicroMsg.SnsBrowseInfoHelper", "account not init.");
      AppMethodBeat.o(36845);
      return;
    }
    int i = Process.myTid();
    ab.i("MicroMsg.SnsBrowseInfoHelper", "summersns report tid[%d] osTid[%d], prior[%d][%d]", new Object[] { Long.valueOf(Thread.currentThread().getId()), Integer.valueOf(i), Integer.valueOf(Thread.currentThread().getPriority()), Integer.valueOf(Process.getThreadPriority(i)) });
    long l = System.currentTimeMillis();
    b localb = this.qSN;
    i = this.qSO;
    Object localObject;
    if (i != -1)
    {
      localObject = aj.CZ(i);
      if (localObject != null)
      {
        localObject = i.j((n)localObject);
        localb.qRf = ((String)localObject);
        aao localaao = af.cnJ().YX("@__weixintimtline").cqL();
        if ((localaao.wfM == 0L) || (i.jW(localaao.wfM).compareTo((String)localObject) <= 0))
          break label2865;
        localb.kZ(true);
      }
    }
    while (true)
    {
      i = t.Zo();
      localObject = new d();
      ((d)localObject).l("20BrowseTime", localb.qQQ + ",");
      ((d)localObject).l("21BrowseFeedCount", localb.qQR + ",");
      ((d)localObject).l("22CommentOrLikeFeedCount", localb.qQS + ",");
      ((d)localObject).l("23ClickFeedCount", localb.qQT + ",");
      ((d)localObject).l("24ClickAlbumCount", localb.qQU + ",");
      ((d)localObject).l("25PostFeedCount", localb.qQV + ",");
      ((d)localObject).l("26ExposeFeedCount", localb.qSm.size() + ",");
      ((d)localObject).l("27FavFeedCount", localb.qSn.size() + ",");
      ((d)localObject).l("28BlackListFriendCount", localb.qQY + ",");
      ((d)localObject).l("29OutsiderFriendCount", localb.qQZ + ",");
      ((d)localObject).l("30BrowseNewFeedCount", localb.qRa + ",");
      ((d)localObject).l("31HasNewSnsMsgWhenEntrance", localb.qRb + ",");
      ((d)localObject).l("32HasNewChatMsgWhenExit", localb.qRc + ",");
      ((d)localObject).l("33StartBrowseSnsObjectId", localb.qRd + ",");
      ((d)localObject).l("34EndBrowseSnsObjectId", localb.qRe + ",");
      ((d)localObject).l("35NextBrowseSnsObjectId", localb.qRf + ",");
      ((d)localObject).l("36HasNewFeedInServer", localb.qRg + ",");
      ((d)localObject).l("37BrowseBrandUrlFeedCount", localb.qRh + ",");
      ((d)localObject).l("38BrowseNotBrandUrlFeedCount", localb.qRi + ",");
      ((d)localObject).l("39BrowseTextFeedCount", localb.qRj + ",");
      ((d)localObject).l("40BrowseImageFeedCount", localb.qRk + ",");
      ((d)localObject).l("41BrowseSightFeedCount", localb.qRl + ",");
      ((d)localObject).l("42BrowseAdFeedCount", localb.qRm + ",");
      ((d)localObject).l("43BrowseMusicFeedCount", localb.qRn + ",");
      ((d)localObject).l("44contactCount", i + ",");
      ((d)localObject).l("BrowseVideoFeedCount45", localb.qRo + ",");
      ((d)localObject).l("ClickBrandUrlFeedCount46", localb.qRp + ",");
      ((d)localObject).l("ClickNotBrandUrlFeedCount47", localb.qRq + ",");
      ((d)localObject).l("ClickImageFeedCount48", localb.qRr + ",");
      ((d)localObject).l("ClickSightFeedCount49", localb.qRs + ",");
      ((d)localObject).l("ClickMusicFeedCount50", localb.qRt + ",");
      ((d)localObject).l("ClickVideoFeedCount51", localb.qRu + ",");
      ((d)localObject).l("BrowseOtherFeedCount52", localb.qRv + ",");
      ((d)localObject).l("BrowserStreamVideoFeedCount53", localb.qRw + ",");
      ((d)localObject).l("ClickStreamVideoCount54", localb.qRx + ",");
      ((d)localObject).l("ClickAdFeed55", localb.qRy + ",");
      ((d)localObject).l("56BackGroundTime", localb.qRz + ",");
      ((d)localObject).l("57BrowseTimeLineTime", localb.qRB + ",");
      ((d)localObject).l("58BrowseMyAlbumTime", localb.qRD + ",");
      ((d)localObject).l("59BrowseOtherAlbumTime", localb.qRF + ",");
      ((d)localObject).l("60BrowseMessageListTime", localb.qRH + ",");
      ((d)localObject).l("61ClickNewPostTime", localb.qRJ + ",");
      ((d)localObject).l("62BrowseFullScreenImageTime", localb.qRL + ",");
      ((d)localObject).l("63BrowseFullScreenSightTime", localb.qRN + ",");
      ((d)localObject).l("64BrowseMPArticleTime", localb.qRP + ",");
      ((d)localObject).l("65BrowseExternalArticleTime", localb.qRR + ",");
      ((d)localObject).l("66BrowseFullScreenAdImageTime", localb.qRT + ",");
      ((d)localObject).l("67BrowseAdSightTime", "0,");
      ((d)localObject).l("68BrowseAdDetailTime", localb.qRV + ",");
      ((d)localObject).l("69BrowseFullScreenAdSightTime", localb.qRX + ",");
      ((d)localObject).l("70BrowseFullScreenAdLongVideoTime", localb.qRZ + ",");
      ((d)localObject).l("71BrowseForwardAdLongVideoTime", localb.qSb + ",");
      ((d)localObject).l("72StartBrowseTime", localb.qSM + ",");
      ((d)localObject).l("73ClickFeedIdList", b.f(localb.qSl) + ",");
      ((d)localObject).l("74ExposeFeedIdList", b.f(localb.qSm) + ",");
      ((d)localObject).l("75FavFeedIdList", b.f(localb.qSn) + ",");
      ((d)localObject).l("76ClickAlbumUserList", b.f(localb.qSt) + ",");
      ((d)localObject).l("77ForwardFeedIdList", b.f(localb.qSo) + ",");
      ((d)localObject).l("78ClickAvatarFeedIdList", b.f(localb.qSp) + ",");
      ((d)localObject).l("79ClickNickNameFeedIdList", b.f(localb.qSq) + ",");
      ((d)localObject).l("80ForwardToSingleChatFeedIdList", b.f(localb.qSr) + ",");
      ((d)localObject).l("81ForwardToChatRoomFeedIdList", b.f(localb.qSs) + ",");
      ((d)localObject).l("82FeedUpdateNotification", localb.edf + ",");
      ((d)localObject).l("83abandon", ",");
      ((d)localObject).l("84abandon", ",");
      ((d)localObject).l("85LastestUnReadFeedId", localb.qSd + ",");
      ((d)localObject).l("86UnReadMsgCount", localb.qSe + ",");
      ((d)localObject).l("87BrowseAdCanvasPageTime", localb.qSg + ",");
      ((d)localObject).l("88BrowseForwardAdCanvasTime", localb.qSi + ",");
      ((d)localObject).l("90EnterObjectId", localb.qSf);
      ab.v("MicroMsg.SnsBrowseInfoHelper", "report logbuffer(12076): " + ((d)localObject).Fk());
      h.pYm.e(12076, new Object[] { localObject });
      com.tencent.mm.sdk.b.a.xxA.d(localb.ecA);
      localb.qQQ = 0L;
      localb.qQR = 0;
      localb.qQS = 0;
      localb.qQT = 0;
      localb.qQU = 0;
      localb.qQV = 0;
      localb.qQW = 0;
      localb.qQX = 0;
      localb.qQY = 0;
      localb.qQZ = 0;
      localb.qRa = 0;
      localb.qRb = 0;
      localb.qRc = 0;
      localb.qRd = "";
      localb.qRe = "";
      localb.qRf = "";
      localb.qRg = 0;
      localb.qRh = 0;
      localb.qRi = 0;
      localb.qRj = 0;
      localb.qRk = 0;
      localb.qRl = 0;
      localb.qRm = 0;
      localb.qRn = 0;
      localb.jLU = 0;
      localb.qRo = 0;
      localb.qRp = 0;
      localb.qRq = 0;
      localb.qRr = 0;
      localb.qRs = 0;
      localb.qRt = 0;
      localb.qRu = 0;
      localb.qRv = 0;
      localb.qRw = 0;
      localb.qRx = 0;
      localb.qRy = 0;
      localb.qRz = 0L;
      localb.qRA = 0L;
      localb.qRB = 0L;
      localb.qRC = 0L;
      localb.qRD = 0L;
      localb.qRE = 0L;
      localb.qRF = 0L;
      localb.qRG = 0L;
      localb.qRH = 0L;
      localb.qRI = 0L;
      localb.qRJ = 0L;
      localb.qRK = 0L;
      localb.qRL = 0L;
      localb.qRM = 0L;
      localb.qRN = 0L;
      localb.qRO = 0L;
      localb.qRP = 0L;
      localb.qRQ = 0L;
      localb.qRR = 0L;
      localb.qRS = 0L;
      localb.qRT = 0L;
      localb.qRU = 0L;
      localb.qRV = 0L;
      localb.qRW = 0L;
      localb.qRX = 0L;
      localb.qRY = 0L;
      localb.qRZ = 0L;
      localb.qSa = 0L;
      localb.qSb = 0L;
      localb.qSc = 0L;
      localb.qSl.clear();
      localb.qSm.clear();
      localb.qSn.clear();
      localb.qSo.clear();
      localb.qSp.clear();
      localb.qSq.clear();
      localb.qSr.clear();
      localb.qSs.clear();
      localb.edf = 0;
      localb.qSd = "";
      localb.qSe = 0;
      ab.i("MicroMsg.SnsBrowseInfoHelper", "summersns report take[%d]ms", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
      AppMethodBeat.o(36845);
      break;
      label2865: localb.kZ(false);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.i.b.2
 * JD-Core Version:    0.6.2
 */