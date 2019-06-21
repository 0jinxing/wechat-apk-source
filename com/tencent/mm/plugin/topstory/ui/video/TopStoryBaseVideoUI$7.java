package com.tencent.mm.plugin.topstory.ui.video;

import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.m;
import com.tencent.mm.g.a.im;
import com.tencent.mm.plugin.topstory.a.c.i;
import com.tencent.mm.protocal.protobuf.chr;
import com.tencent.mm.protocal.protobuf.chs;
import com.tencent.mm.protocal.protobuf.chw;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.t;
import com.tencent.mm.ui.q;
import org.json.JSONException;
import org.json.JSONObject;

final class TopStoryBaseVideoUI$7
  implements com.tencent.mm.ai.f
{
  TopStoryBaseVideoUI$7(TopStoryBaseVideoUI paramTopStoryBaseVideoUI)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, final m paramm)
  {
    AppMethodBeat.i(1726);
    paramm = (i)paramm;
    Object localObject = (chr)paramm.ehh.fsG.fsP;
    boolean bool;
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      ab.w("MicroMsg.TopStory.TopStoryBaseVideoUI", "NetSceneTopStorySetComment response, errType:%s, errCode:%s, errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
      t.makeText(this.sEv.mController.ylL, this.sEv.getString(2131304103), 0).show();
      if (paramm.sAX != null)
      {
        paramString = paramm.sAX;
        if (paramm.sAX.xhh)
          break label178;
        bool = true;
        paramString.xhh = bool;
        ab.i("MicroMsg.TopStory.TopStoryBaseVideoUI", "setCmtListener onSceneEnd error, thumb:" + paramm.sAX.xhh);
      }
    }
    while (true)
    {
      this.sEv.runOnUiThread(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(1725);
          h localh = TopStoryBaseVideoUI.7.this.sEv.cGa().b(paramm.sAX);
          if (localh != null)
            if ((localh instanceof com.tencent.mm.plugin.topstory.ui.video.list.h))
            {
              localh.cGz();
              AppMethodBeat.o(1725);
            }
          while (true)
          {
            return;
            if ((localh instanceof com.tencent.mm.plugin.topstory.ui.video.fs.g))
              ((com.tencent.mm.plugin.topstory.ui.video.fs.f)localh.cGA().getControlBar()).h(paramm.sAX);
            AppMethodBeat.o(1725);
          }
        }
      });
      AppMethodBeat.o(1726);
      return;
      label178: bool = false;
      break;
      JSONObject localJSONObject = new JSONObject();
      try
      {
        localJSONObject.put("docId", ((chr)localObject).wUo);
        localJSONObject.put("opType", "LIKE");
        if (((chr)localObject).nbk == 4)
        {
          bool = true;
          label228: localJSONObject.put("isLike", bool);
          if (paramm.sAX != null)
          {
            paramString = paramm.sAX;
            if (((chr)localObject).nbk != 4)
              break label485;
          }
        }
        label485: for (bool = true; ; bool = false)
        {
          paramString.xhh = bool;
          ab.i("MicroMsg.TopStory.TopStoryBaseVideoUI", "setCmtListener onSceneEnd succ, thumb:" + paramm.sAX.xhh);
          if (((chr)localObject).nbk != 4)
            break label491;
          localObject = this.sEv.cGa().b(paramm.sAX);
          if ((TopStoryBaseVideoUI.c(this.sEv).sFv == null) || (TopStoryBaseVideoUI.c(this.sEv).sFv.xgS == null) || (!TopStoryBaseVideoUI.c(this.sEv).sFv.xgS.equals(paramm.sAX.xgS)) || ((!(localObject instanceof com.tencent.mm.plugin.topstory.ui.video.list.h)) && (!(localObject instanceof com.tencent.mm.plugin.topstory.ui.video.fs.g))))
            break label566;
          paramString = ((h)localObject).getWowView();
          if (paramString != null)
          {
            this.sEv.a(paramm.sAX, paramString, true);
            if ((localObject instanceof com.tencent.mm.plugin.topstory.ui.video.fs.g))
              ((h)localObject).cGA().getControlBar().show();
          }
          paramString = new im();
          paramString.cDD.cDE = localJSONObject.toString();
          paramString.cDD.cDF = "";
          a.xxA.m(paramString);
          break;
          bool = false;
          break label228;
        }
        label491: if (paramm.cFw().xgy)
          com.tencent.mm.ui.base.h.b(this.sEv, this.sEv.getString(2131304111), "", true);
        while (true)
        {
          this.sEv.a(paramm.sAX, null, false);
          break;
          t.makeText(this.sEv.mController.ylL, 2131306045, 0).show();
        }
      }
      catch (JSONException paramString)
      {
        while (true)
        {
          continue;
          label566: paramString = null;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI.7
 * JD-Core Version:    0.6.2
 */