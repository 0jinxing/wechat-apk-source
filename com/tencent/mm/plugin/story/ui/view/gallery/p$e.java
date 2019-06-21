package com.tencent.mm.plugin.story.ui.view.gallery;

import a.k.m;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.ar;
import com.tencent.mm.plugin.story.g.b;
import com.tencent.mm.plugin.story.g.b.a;
import com.tencent.mm.plugin.story.g.c;
import com.tencent.mm.plugin.story.g.h;
import com.tencent.mm.plugin.story.model.d.i;
import com.tencent.mm.plugin.story.model.k;
import com.tencent.mm.pluginsdk.ui.h.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Map;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/story/ui/view/gallery/StoryVideoViewMgr$videoViewCallback$1", "Lcom/tencent/mm/pluginsdk/ui/IMMVideoView$IMMVideoViewCallback;", "onError", "", "sessionId", "", "mediaId", "errorMsg", "what", "", "extra", "onGetVideoSize", "width", "height", "onPrepared", "onVideoEnded", "onVideoFirstFrameDraw", "onVideoPause", "onVideoPlay", "onVideoWaiting", "onVideoWaitingEnd", "plugin-story_release"})
public final class p$e
  implements h.b
{
  public final void c(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(110979);
    ab.i(this.srl.TAG, "videoViewCallback onError: " + paramString1 + ", meidiaId:" + paramString2 + ", errorMsg:" + paramString3 + ", what:" + paramInt1 + ", extra:" + paramInt2);
    AppMethodBeat.o(110979);
  }

  public final void cp(String paramString1, String paramString2)
  {
    AppMethodBeat.i(110980);
    ab.i(this.srl.TAG, "videoViewCallback onPrepared: " + paramString1 + ", meidiaId:" + paramString2);
    AppMethodBeat.o(110980);
  }

  public final void cq(String paramString1, String paramString2)
  {
    AppMethodBeat.i(110981);
    ab.i(this.srl.TAG, "videoViewCallback onVideoEnded: " + paramString1 + ", meidiaId:" + paramString2);
    paramString1 = h.scu;
    paramString1 = h.cAs();
    paramString1.bQ(paramString1.FO() + 1L);
    paramString1 = this.srl.srb;
    if (paramString1 != null)
    {
      paramString2 = b.sbw;
      long l = paramString1.rUJ;
      if (b.aiG())
      {
        ab.v("MicroMsg.StoryBrowseDetailIDKeyStat", "onVideoEnd ".concat(String.valueOf(l)));
        if (b.sbi.containsKey(Long.valueOf(l)))
        {
          paramString1 = (b.a)b.sbi.get(Long.valueOf(l));
          if (paramString1 != null)
          {
            paramString1.eTf = true;
            AppMethodBeat.o(110981);
          }
        }
      }
    }
    while (true)
    {
      return;
      AppMethodBeat.o(110981);
      continue;
      AppMethodBeat.o(110981);
    }
  }

  public final void cr(String paramString1, String paramString2)
  {
    AppMethodBeat.i(110983);
    ab.i(this.srl.TAG, "videoViewCallback onVideoPause: " + paramString1 + ", meidiaId:" + paramString2);
    AppMethodBeat.o(110983);
  }

  public final void cs(String paramString1, String paramString2)
  {
    AppMethodBeat.i(110984);
    String str = this.srl.TAG;
    StringBuilder localStringBuilder = new StringBuilder("videoViewCallback onVideoPlay: ").append(paramString1).append(' ');
    Object localObject = this.srl.sqW;
    long l1;
    label280: long l2;
    if (localObject != null)
    {
      localObject = ((StoryVideoView)localObject).getSessionId();
      ab.i(str, (String)localObject + ", " + this.srl.sqZ + ", meidiaId:" + paramString2 + ", isVideoPause:" + this.srl.sqY);
      if ((m.I(paramString1, this.srl.sqZ, false)) && (this.srl.sqY))
      {
        paramString1 = this.srl.sqW;
        if ((paramString1 != null) && (!paramString1.sqC))
          this.srl.r(null);
      }
      paramString2 = this.srl.srb;
      if (paramString2 == null)
        break label958;
      paramString1 = c.sbQ;
      c.lm(paramString2.rUJ);
      paramString1 = b.sbw;
      l1 = paramString2.rUJ;
      if (b.aiG())
      {
        localObject = new StringBuilder("onVideoPlay storyId ").append(l1).append(" lastStoryId ").append(b.sbh).append(" contains:").append(b.sbi.containsKey(Long.valueOf(l1))).append(" result");
        paramString1 = (b.a)b.sbi.get(Long.valueOf(l1));
        if (paramString1 == null)
          break label462;
        paramString1 = Long.valueOf(paramString1.sbz);
        ab.v("MicroMsg.StoryBrowseDetailIDKeyStat", paramString1);
        if ((l1 == b.sbh) && (b.sbi.containsKey(Long.valueOf(l1))))
        {
          paramString1 = (b.a)b.sbi.get(Long.valueOf(l1));
          if ((paramString1 != null) && (!paramString1.rmk) && (paramString1.sbz <= 0L) && (paramString1.sby > 0L))
          {
            paramString1.isWaiting = false;
            l2 = bo.gb(paramString1.sby);
            paramString1.sbz = bo.anU();
            if (l2 <= 120000L)
              break label467;
            ab.w("MicroMsg.StoryBrowseDetailIDKeyStat", "onPlayCostTime  storyId " + l1 + " onPlayCostTime:" + l2);
          }
        }
      }
      label429: n.sqi.lA(paramString2.rUJ);
      paramString1 = k.rTc;
      k.aao(paramString2.username);
      AppMethodBeat.o(110984);
    }
    while (true)
    {
      return;
      localObject = null;
      break;
      label462: paramString1 = null;
      break label280;
      label467: ab.i("MicroMsg.StoryBrowseDetailIDKeyStat", "onPlayCostTime  storyId " + l1 + " onPlayCostTime:" + l2);
      b.l(b.lhy, 31L, l2);
      b.l(b.lhy, 30L, 1L);
      if (l2 <= 400L)
      {
        b.l(b.lhy, 90L, 1L);
        label541: if (l2 > 400L)
          break label725;
        b.l(b.lhy, 50L, 1L);
        label560: if (l1 != b.sbk)
          break label846;
        if (!b.sbo)
          break label848;
        b.l(b.lhy, 40L, 1L);
        b.l(b.lhy, 42L, l2);
      }
      while (true)
        if (l2 <= 1000L)
        {
          if (b.sbo)
          {
            b.l(b.lhy, 44L, 1L);
            break;
            if (l2 <= 800L)
            {
              b.l(b.lhy, 91L, 1L);
              break label541;
            }
            if (l2 <= 1600L)
            {
              b.l(b.lhy, 92L, 1L);
              break label541;
            }
            if (l2 <= 3200L)
            {
              b.l(b.lhy, 93L, 1L);
              break label541;
            }
            if (l2 <= 5000L)
            {
              b.l(b.lhy, 94L, 1L);
              break label541;
            }
            b.l(b.lhy, 95L, 1L);
            break label541;
            label725: if (l2 <= 800L)
            {
              b.l(b.lhy, 51L, 1L);
              break label560;
            }
            if (l2 <= 1000L)
            {
              b.l(b.lhy, 52L, 1L);
              break label560;
            }
            if (l2 <= 2000L)
            {
              b.l(b.lhy, 53L, 1L);
              break label560;
            }
            if (l2 <= 3000L)
            {
              b.l(b.lhy, 54L, 1L);
              break label560;
            }
            if (l2 <= 4000L)
            {
              b.l(b.lhy, 55L, 1L);
              break label560;
            }
            b.l(b.lhy, 56L, 1L);
            break label560;
            label846: break;
            label848: b.l(b.lhy, 41L, 1L);
            b.l(b.lhy, 43L, l2);
            continue;
          }
          b.l(b.lhy, 45L, 1L);
          break;
        }
      if (l2 <= 2000L)
      {
        if (b.sbo)
        {
          b.l(b.lhy, 46L, 1L);
          break label429;
        }
        b.l(b.lhy, 47L, 1L);
        break label429;
      }
      if (b.sbo)
      {
        b.l(b.lhy, 48L, 1L);
        break label429;
      }
      b.l(b.lhy, 49L, 1L);
      break label429;
      label958: AppMethodBeat.o(110984);
    }
  }

  public final void ct(String paramString1, String paramString2)
  {
    AppMethodBeat.i(110985);
    ab.i(this.srl.TAG, "videoViewCallback onVideoWaiting: " + paramString1 + ", meidiaId:" + paramString2);
    paramString1 = this.srl.srb;
    if (paramString1 != null)
    {
      paramString2 = c.sbQ;
      c.ll(paramString1.rUJ);
      paramString2 = b.sbw;
      long l = paramString1.rUJ;
      if ((b.aiG()) && (b.sbi.containsKey(Long.valueOf(l))))
      {
        paramString1 = (b.a)b.sbi.get(Long.valueOf(l));
        if ((paramString1 != null) && (!paramString1.rmk) && (paramString1.sbA))
        {
          paramString1.isWaiting = true;
          AppMethodBeat.o(110985);
        }
      }
    }
    while (true)
    {
      return;
      AppMethodBeat.o(110985);
      continue;
      AppMethodBeat.o(110985);
    }
  }

  public final void cu(String paramString1, String paramString2)
  {
    AppMethodBeat.i(110986);
    String str = this.srl.TAG;
    StringBuilder localStringBuilder = new StringBuilder("videoViewCallback onVideoWaitingEnd: ").append(paramString1).append(' ');
    Object localObject = this.srl.sqW;
    if (localObject != null)
    {
      localObject = ((StoryVideoView)localObject).getSessionId();
      ab.i(str, (String)localObject + ", " + this.srl.sqZ + ", meidiaId:" + paramString2 + ", isVideoPause:" + this.srl.sqY);
      if ((m.I(paramString1, this.srl.sqZ, false)) && (this.srl.sqY))
      {
        paramString1 = this.srl.sqW;
        if (paramString1 == null)
          break label174;
        if (!paramString1.sqC)
          this.srl.r(null);
      }
      AppMethodBeat.o(110986);
    }
    while (true)
    {
      return;
      localObject = null;
      break;
      label174: AppMethodBeat.o(110986);
    }
  }

  public final void d(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(110982);
    ab.i(this.srl.TAG, "videoViewCallback onGetVideoSize: " + paramString1 + ", " + this.srl.sqZ + ", meidiaId:" + paramString2);
    AppMethodBeat.o(110982);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.gallery.p.e
 * JD-Core Version:    0.6.2
 */