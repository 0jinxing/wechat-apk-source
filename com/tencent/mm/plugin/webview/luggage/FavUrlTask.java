package com.tencent.mm.plugin.webview.luggage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.a.cg;
import com.tencent.mm.g.a.cg.a;
import com.tencent.mm.g.a.cg.b;
import com.tencent.mm.g.a.cl;
import com.tencent.mm.g.a.cl.a;
import com.tencent.mm.g.a.cl.b;
import com.tencent.mm.g.a.gh;
import com.tencent.mm.g.a.ng;
import com.tencent.mm.g.a.ng.b;
import com.tencent.mm.g.a.sc;
import com.tencent.mm.g.a.sc.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.v;
import com.tencent.mm.model.v.b;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.fav.a.ad;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public class FavUrlTask extends MainProcessTask
{
  public static final Parcelable.Creator<FavUrlTask> CREATOR;
  public int actionType;
  public boolean csN;
  public Bundle mqu;
  public int ret;
  public int type;
  public boolean uhJ;
  public boolean uhK;

  static
  {
    AppMethodBeat.i(5978);
    CREATOR = new Parcelable.Creator()
    {
    };
    AppMethodBeat.o(5978);
  }

  public FavUrlTask()
  {
  }

  private FavUrlTask(Parcel paramParcel)
  {
    AppMethodBeat.i(5977);
    g(paramParcel);
    AppMethodBeat.o(5977);
  }

  public final void asP()
  {
    AppMethodBeat.i(5974);
    switch (this.actionType)
    {
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      AppMethodBeat.o(5974);
      while (true)
      {
        return;
        Object localObject1;
        int i;
        Object localObject2;
        boolean bool;
        if (this.mqu != null)
        {
          long l = this.mqu.getLong("msg_id", -9223372036854775808L);
          localObject1 = this.mqu.getString("sns_local_id");
          i = this.mqu.getInt("news_svr_id", 0);
          localObject2 = this.mqu.getString("news_svr_tweetid");
          localObject3 = new cl();
          if (-9223372036854775808L == l)
            break label362;
          ((cl)localObject3).cvA.cvE = this.mqu.getInt("message_index", 0);
          bool = ((ad)g.K(ad.class)).a((cl)localObject3, l);
          label153: if (!bool)
            break label518;
          Object localObject4 = bo.nullAsNil(this.mqu.getString("prePublishId"));
          localObject2 = v.nW((String)localObject4);
          localObject1 = v.Zp().y((String)localObject2, true);
          ((v.b)localObject1).j("sendAppMsgScene", Integer.valueOf(2));
          ((v.b)localObject1).j("preChatName", this.mqu.getString("preChatName"));
          ((v.b)localObject1).j("preMsgIndex", Integer.valueOf(this.mqu.getInt("preMsgIndex")));
          ((v.b)localObject1).j("prePublishId", localObject4);
          ((v.b)localObject1).j("preUsername", this.mqu.getString("preUsername"));
          ((v.b)localObject1).j("getA8KeyScene", this.mqu.getString("getA8KeyScene"));
          ((v.b)localObject1).j("referUrl", this.mqu.getString("referUrl"));
          localObject4 = this.mqu.getBundle("jsapiargs");
          if (localObject4 != null)
            ((v.b)localObject1).j("adExtStr", ((Bundle)localObject4).getString("key_snsad_statextstr"));
          ((cl)localObject3).cvA.cvF = ((String)localObject2);
          a.xxA.m((b)localObject3);
        }
        while (true)
        {
          this.ret = ((cl)localObject3).cvB.ret;
          AppMethodBeat.o(5974);
          break;
          label362: if (!bo.isNullOrNil((String)localObject1))
          {
            localObject2 = new sc();
            ((sc)localObject2).cNZ.cOc = ((String)localObject1);
            ((sc)localObject2).cNZ.cOd = ((cl)localObject3);
            ((sc)localObject2).cNZ.url = this.mqu.getString("rawUrl");
            a.xxA.m((b)localObject2);
            bool = ((sc)localObject2).cOa.cvi;
            break label153;
          }
          if (i != 0)
          {
            localObject1 = new ng();
            ((ng)localObject1).cJw.opType = 3;
            ((ng)localObject1).cJw.cJy = ((cl)localObject3);
            ((ng)localObject1).cJw.cJz = i;
            ((ng)localObject1).cJw.cJA = ((String)localObject2);
            a.xxA.m((b)localObject1);
            bool = ((ng)localObject1).cJx.cvi;
            break label153;
          }
          this.uhJ = true;
          AppMethodBeat.o(5974);
          break;
          label518: if (((cl)localObject3).cvA.cvG == 0)
            ((cl)localObject3).cvA.cvG = 2131299630;
          a.xxA.m((b)localObject3);
        }
        localObject3 = new gh();
        ((gh)localObject3).cAH.type = 35;
        a.xxA.m((b)localObject3);
        AppMethodBeat.o(5974);
        continue;
        this.uhK = d.afj("favorite");
        AppMethodBeat.o(5974);
      }
      Object localObject3 = new cg();
      ((cg)localObject3).cvt.cvv = this.mqu.getLong("fav_local_id", -1L);
      a.xxA.m((b)localObject3);
      ab.i("MicroMsg.FavUrlTask", "do del fav web url, local id %d, result %B", new Object[] { Long.valueOf(((cg)localObject3).cvt.cvv), Boolean.valueOf(((cg)localObject3).cvu.cvi) });
      this.csN = ((cg)localObject3).cvu.cvi;
    }
  }

  public final void g(Parcel paramParcel)
  {
    boolean bool1 = true;
    AppMethodBeat.i(5975);
    this.actionType = paramParcel.readInt();
    this.mqu = paramParcel.readBundle();
    if (paramParcel.readByte() == 1)
    {
      bool2 = true;
      this.uhJ = bool2;
      if (paramParcel.readByte() != 1)
        break label97;
      bool2 = true;
      label49: this.csN = bool2;
      this.ret = paramParcel.readInt();
      this.type = paramParcel.readInt();
      if (paramParcel.readByte() != 1)
        break label102;
    }
    label97: label102: for (boolean bool2 = bool1; ; bool2 = false)
    {
      this.uhK = bool2;
      AppMethodBeat.o(5975);
      return;
      bool2 = false;
      break;
      bool2 = false;
      break label49;
    }
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 1;
    AppMethodBeat.i(5976);
    paramParcel.writeInt(this.actionType);
    paramParcel.writeBundle(this.mqu);
    if (this.uhJ)
    {
      paramInt = 1;
      paramParcel.writeByte((byte)paramInt);
      if (!this.csN)
        break label97;
      paramInt = 1;
      label48: paramParcel.writeByte((byte)paramInt);
      paramParcel.writeInt(this.ret);
      paramParcel.writeInt(this.type);
      if (!this.uhK)
        break label102;
    }
    label97: label102: for (paramInt = i; ; paramInt = 0)
    {
      paramParcel.writeByte((byte)paramInt);
      AppMethodBeat.o(5976);
      return;
      paramInt = 0;
      break;
      paramInt = 0;
      break label48;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.FavUrlTask
 * JD-Core Version:    0.6.2
 */