package com.tencent.mm.plugin.appbrand.jsapi.share;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.p;
import com.tencent.mm.af.f;
import com.tencent.mm.af.j.a;
import com.tencent.mm.af.j.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.w;
import com.tencent.mm.compatible.util.q;
import com.tencent.mm.g.a.qb;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ag;
import com.tencent.mm.model.t;
import com.tencent.mm.model.v;
import com.tencent.mm.model.v.b;
import com.tencent.mm.modelappbrand.a.b;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.chatroom.a.c;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.cwl;
import com.tencent.mm.protocal.protobuf.cwm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.vfs.e;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class SendAppMessageTask extends MainProcessTask
{
  public static final Parcelable.Creator<SendAppMessageTask> CREATOR;
  public String appId;
  public int axy;
  public int cBc;
  public String cOv;
  public String cacheKey;
  public String cst;
  public String description;
  public int duk;
  public String fhu;
  public int fmr;
  public boolean hIs;
  public String hWD;
  public String hWE;
  public String hWF;
  public String hWG;
  public int hWH;
  public int hWI;
  public int hWJ;
  public String hWK;
  public String hWL;
  public String hWM;
  public boolean hWN;
  public boolean hWO;
  public String hWP;
  public String hWQ;
  public String hWR;
  public String hWS;
  public String hWT;
  public ArrayList<ShareInfo> hWU;
  public String hiv;
  public Runnable hww;
  public String iconUrl;
  public String nickname;
  public String path;
  public int scene;
  public String title;
  public String toUser;
  public int type;
  public String url;
  public String userName;
  public int version;
  public boolean withShareTicket;

  static
  {
    AppMethodBeat.i(131473);
    CREATOR = new SendAppMessageTask.2();
    AppMethodBeat.o(131473);
  }

  public SendAppMessageTask()
  {
    AppMethodBeat.i(131462);
    this.hWH = 1;
    this.duk = j.a.fgj.ordinal();
    this.scene = 1000;
    AppMethodBeat.o(131462);
  }

  protected SendAppMessageTask(Parcel paramParcel)
  {
    AppMethodBeat.i(131470);
    this.hWH = 1;
    this.duk = j.a.fgj.ordinal();
    this.scene = 1000;
    g(paramParcel);
    AppMethodBeat.o(131470);
  }

  private void a(j.b paramb, byte[] paramArrayOfByte, String paramString, StringBuilder paramStringBuilder, int paramInt)
  {
    AppMethodBeat.i(131467);
    ((com.tencent.mm.plugin.appbrand.compat.a.a)g.K(com.tencent.mm.plugin.appbrand.compat.a.a.class)).a(paramb, this.appId, this.title, paramString, paramArrayOfByte);
    if (!bo.isNullOrNil(this.hWD))
    {
      paramb = new qb();
      paramb.cMq.cMr = paramString;
      paramb.cMq.content = this.hWD;
      paramb.cMq.type = t.nK(paramString);
      paramb.cMq.flags = 0;
      com.tencent.mm.sdk.b.a.xxA.m(paramb);
    }
    int i = 1;
    if (paramString.toLowerCase().endsWith("@chatroom"))
    {
      paramb = ((c)g.K(c.class)).XV().oe(paramString);
      if (paramb == null)
        break label203;
    }
    label203: for (i = paramb.size(); ; i = 0)
    {
      a(this.appId, paramInt, this.cst, this.hWK, paramString, this.title, this.path, this.hWL, this.hWM, i, paramStringBuilder.toString(), this.hWP, this.fmr, this.hWE, this.axy);
      AppMethodBeat.o(131467);
      return;
    }
  }

  private void a(j.b paramb, byte[] paramArrayOfByte, StringBuilder paramStringBuilder, int paramInt, boolean paramBoolean, String paramString)
  {
    AppMethodBeat.i(131466);
    b.a locala = new b.a();
    locala.fsI = 1118;
    locala.uri = "/cgi-bin/mmbiz-bin/wxaapp/getshareinfo";
    cwl localcwl = new cwl();
    localcwl.csB = this.appId;
    LinkedList localLinkedList = new LinkedList(bo.P(this.toUser.split(",")));
    localcwl.xse = localLinkedList;
    localcwl.xsg = paramString;
    localcwl.xsf = paramBoolean;
    locala.fsJ = localcwl;
    locala.fsK = new cwm();
    w.a(locala.acD(), new SendAppMessageTask.1(this, localLinkedList, paramb, paramInt, paramArrayOfByte, paramStringBuilder));
    AppMethodBeat.o(131466);
  }

  private static void a(String paramString1, int paramInt1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, int paramInt2, String paramString9, String paramString10, int paramInt3, String paramString11, int paramInt4)
  {
    AppMethodBeat.i(131465);
    if (bo.isNullOrNil(paramString1))
    {
      ab.e("MicroMsg.SendAppMessageTask", "appId is Null!");
      AppMethodBeat.o(131465);
    }
    while (true)
    {
      return;
      Object localObject1 = "";
      try
      {
        localObject2 = q.encode(bo.nullAsNil(paramString6), "UTF-8");
        localObject1 = localObject2;
        localObject2 = "";
      }
      catch (UnsupportedEncodingException paramString11)
      {
        try
        {
          str = q.encode(bo.nullAsNil(paramString7), "UTF-8");
          localObject2 = str;
        }
        catch (UnsupportedEncodingException paramString11)
        {
          try
          {
            paramString10 = q.encode(bo.nullAsNil(paramString10), "UTF-8");
          }
          catch (UnsupportedEncodingException paramString11)
          {
            try
            {
              paramString11 = q.encode(bo.nullAsNil(paramString11), "UTF-8");
            }
            catch (UnsupportedEncodingException paramString11)
            {
              try
              {
                while (true)
                {
                  Object localObject2;
                  String str = q.encode(bo.nullAsNil(paramString5), "UTF-8");
                  paramString5 = str;
                  paramInt3 += 1000;
                  ab.d("MicroMsg.SendAppMessageTask", "stev report(%s), appId %s, scene %s, sceneNote %s, sessionId %s, currentPath %s, currentTitle %s,shareTitle %s, sharePath %s, shareActionId %s, destinationUserCount %s, destinationUserName %s, appServiceType %s, thumbIconUrl %s, appVersion %d", new Object[] { Integer.valueOf(14077), paramString1, Integer.valueOf(paramInt1), paramString2, paramString3, paramString7, paramString8, paramString5, paramString6, paramString9, Integer.valueOf(paramInt2), paramString4, Integer.valueOf(paramInt3), paramString11, Integer.valueOf(paramInt4) });
                  h.pYm.e(14077, new Object[] { paramString1, Integer.valueOf(paramInt1), paramString2, paramString3, localObject2, paramString8, paramString5, localObject1, paramString9, "", Integer.valueOf(paramInt2), paramString4, paramString10, Integer.valueOf(paramInt3), paramString11, Integer.valueOf(paramInt4) });
                  AppMethodBeat.o(131465);
                  break;
                  localUnsupportedEncodingException1 = localUnsupportedEncodingException1;
                  ab.e("MicroMsg.SendAppMessageTask", "encode share page path error!");
                  continue;
                  localUnsupportedEncodingException2 = localUnsupportedEncodingException2;
                  ab.e("MicroMsg.SendAppMessageTask", "encode current page path error!");
                  continue;
                  paramString10 = paramString10;
                  ab.e("MicroMsg.SendAppMessageTask", "encode current html url error!");
                  paramString10 = "";
                  continue;
                  paramString11 = paramString11;
                  ab.e("MicroMsg.SendAppMessageTask", "encode thumb Icon url error!");
                  paramString11 = "";
                }
              }
              catch (UnsupportedEncodingException localUnsupportedEncodingException3)
              {
                while (true)
                  ab.e("MicroMsg.SendAppMessageTask", "encode shareTitle error!");
              }
            }
          }
        }
      }
    }
  }

  public final void asP()
  {
    AppMethodBeat.i(131463);
    ab.i("MicroMsg.SendAppMessageTask", "username = %s, thumbIconUrl = %s", new Object[] { this.userName, this.hWE });
    Object localObject1 = new byte[0];
    Object localObject2;
    if ((!bo.isNullOrNil(this.hWE)) && ((this.hWE.startsWith("http://")) || (this.hWE.startsWith("https://"))))
      localObject2 = b.abR().a(this.hWE, null);
    while (true)
    {
      Object localObject3;
      label187: Object localObject4;
      if ((localObject2 != null) && (!((Bitmap)localObject2).isRecycled()))
      {
        ab.i("MicroMsg.SendAppMessageTask", "thumb image is not null ");
        localObject1 = Bitmap.createBitmap(((Bitmap)localObject2).getWidth(), ((Bitmap)localObject2).getHeight(), Bitmap.Config.ARGB_8888);
        localObject3 = new Canvas((Bitmap)localObject1);
        ((Canvas)localObject3).drawColor(-1);
        ((Canvas)localObject3).drawBitmap((Bitmap)localObject2, 0.0F, 0.0F, null);
        localObject2 = new ByteArrayOutputStream();
        ((Bitmap)localObject1).compress(Bitmap.CompressFormat.JPEG, 100, (OutputStream)localObject2);
        localObject2 = ((ByteArrayOutputStream)localObject2).toByteArray();
        ab.i("MicroMsg.SendAppMessageTask", "bitmap recycle %s", new Object[] { localObject1 });
        ((Bitmap)localObject1).recycle();
        ab.i("MicroMsg.SendAppMessageTask", "doSendMessage, appId : %s, title = %s, description = %s ,username = %s ,path = %s, thumbIconUrl = %s", new Object[] { this.appId, this.title, this.description, this.userName, this.path, this.hWE });
        localObject1 = v.nW("wxapp_" + this.appId + this.path);
        v.Zp().y((String)localObject1, true).j("prePublishId", "wxapp_" + this.appId + this.path);
        localObject1 = new j.b();
        ((j.b)localObject1).title = this.title;
        ((j.b)localObject1).description = this.description;
        ((j.b)localObject1).fiP = this.userName;
        ((j.b)localObject1).fiO = this.path;
        ((j.b)localObject1).fiQ = this.appId;
        ((j.b)localObject1).fiZ = this.cBc;
        ((j.b)localObject1).fja = this.version;
        ((j.b)localObject1).fiS = this.hiv;
        ((j.b)localObject1).fiR = this.type;
        ((j.b)localObject1).fiY = this.hWI;
        ((j.b)localObject1).url = this.url;
        ((j.b)localObject1).fjb = this.iconUrl;
        ((j.b)localObject1).cMm = ("wxapp_" + this.appId + this.path);
        ((j.b)localObject1).cMg = this.userName;
        ((j.b)localObject1).cMh = this.nickname;
        localObject4 = new com.tencent.mm.af.a();
        ((com.tencent.mm.af.a)localObject4).feY = this.hWN;
        ((com.tencent.mm.af.a)localObject4).feZ = this.cacheKey;
        ((com.tencent.mm.af.a)localObject4).ffa = this.fmr;
        ((com.tencent.mm.af.a)localObject4).ffb = this.hWO;
        ((com.tencent.mm.af.a)localObject4).ffk = this.cOv;
        ((com.tencent.mm.af.a)localObject4).ffl = this.hWE;
        ((com.tencent.mm.af.a)localObject4).ffm = bo.isNullOrNil(this.hWE);
        ((j.b)localObject1).a((f)localObject4);
        localObject3 = new StringBuilder("1_");
        ((StringBuilder)localObject3).append(this.appId);
        ((StringBuilder)localObject3).append("_");
        g.RN();
        ((StringBuilder)localObject3).append(p.getString(com.tencent.mm.kernel.a.QF()));
        ((StringBuilder)localObject3).append("_");
        ((StringBuilder)localObject3).append(bo.anT());
        ((StringBuilder)localObject3).append("_");
        ((StringBuilder)localObject3).append(this.hWJ);
        ((j.b)localObject1).fiU = ((StringBuilder)localObject3).toString();
        if (1 != this.hWH)
          break label821;
        ((j.b)localObject1).type = 33;
        label646: ab.i("MicroMsg.SendAppMessageTask", "doSendMessage isUpdateMsg:%b, withShareTicket:%b", new Object[] { Boolean.valueOf(this.hWO), Boolean.valueOf(this.withShareTicket) });
        if ((!this.hWO) || (!this.withShareTicket))
          break label909;
        a((j.b)localObject1, (byte[])localObject2, (StringBuilder)localObject3, this.scene, this.hWO, this.fhu);
        AppMethodBeat.o(131463);
      }
      while (true)
      {
        return;
        if (bo.isNullOrNil(this.hWF))
          break label1011;
        localObject2 = d.aml(this.hWF);
        if (this.hIs)
        {
          boolean bool = e.deleteFile(this.hWF);
          ab.v("MicroMsg.SendAppMessageTask", "decode thumb icon bitmap by path(%s), and deleted(%s) file.", new Object[] { this.hWF, Boolean.valueOf(bool) });
          break;
        }
        ab.v("MicroMsg.SendAppMessageTask", "decode thumb icon bitmap by path(%s)", new Object[] { this.hWF });
        break;
        ab.e("MicroMsg.SendAppMessageTask", "thumb image is null");
        localObject2 = localObject1;
        break label187;
        label821: if (2 == this.hWH)
        {
          ((j.b)localObject1).type = 44;
          ((j.b)localObject1).fiW = this.duk;
          ((j.b)localObject1).fiX = this.hWG;
          break label646;
        }
        if (this.hWH != 3)
          break label646;
        ((j.b)localObject1).type = 46;
        ((j.b)localObject1).appId = this.hWQ;
        ((j.b)localObject1).appName = this.hWR;
        ((j.b)localObject1).cMg = this.hWS;
        ((j.b)localObject1).cMh = null;
        ((com.tencent.mm.af.a)localObject4).appThumbUrl = this.hWT;
        break label646;
        label909: if (this.withShareTicket)
        {
          a((j.b)localObject1, (byte[])localObject2, (StringBuilder)localObject3, this.scene, this.hWO, this.fhu);
          AppMethodBeat.o(131463);
        }
        else
        {
          localObject4 = new LinkedList(bo.P(this.toUser.split(","))).iterator();
          while (((Iterator)localObject4).hasNext())
            a((j.b)localObject1, (byte[])localObject2, (String)((Iterator)localObject4).next(), (StringBuilder)localObject3, this.scene);
          AppMethodBeat.o(131463);
        }
      }
      label1011: localObject2 = null;
    }
  }

  public final void asQ()
  {
    AppMethodBeat.i(131464);
    if (this.hww != null)
      this.hww.run();
    AppMethodBeat.o(131464);
  }

  public int describeContents()
  {
    return 0;
  }

  public final void g(Parcel paramParcel)
  {
    boolean bool1 = true;
    AppMethodBeat.i(131468);
    this.appId = paramParcel.readString();
    this.userName = paramParcel.readString();
    this.title = paramParcel.readString();
    this.description = paramParcel.readString();
    this.hWD = paramParcel.readString();
    this.toUser = paramParcel.readString();
    this.url = paramParcel.readString();
    this.path = paramParcel.readString();
    this.type = paramParcel.readInt();
    this.hWE = paramParcel.readString();
    this.iconUrl = paramParcel.readString();
    this.hWF = paramParcel.readString();
    if (paramParcel.readInt() == 1)
    {
      bool2 = true;
      this.hIs = bool2;
      this.cBc = paramParcel.readInt();
      this.hiv = paramParcel.readString();
      this.version = paramParcel.readInt();
      this.nickname = paramParcel.readString();
      this.hWJ = paramParcel.readInt();
      this.scene = paramParcel.readInt();
      this.cst = paramParcel.readString();
      this.hWK = paramParcel.readString();
      this.hWL = paramParcel.readString();
      this.hWM = paramParcel.readString();
      if (paramParcel.readByte() != 1)
        break label381;
      bool2 = true;
      label209: this.withShareTicket = bool2;
      if (paramParcel.readInt() != 1)
        break label386;
      bool2 = true;
      label224: this.hWN = bool2;
      if (paramParcel.readInt() != 1)
        break label391;
    }
    label386: label391: for (boolean bool2 = bool1; ; bool2 = false)
    {
      this.hWO = bool2;
      this.fhu = paramParcel.readString();
      this.cacheKey = paramParcel.readString();
      this.fmr = paramParcel.readInt();
      this.hWP = paramParcel.readString();
      this.hWU = paramParcel.readArrayList(SendAppMessageTask.class.getClassLoader());
      this.cOv = paramParcel.readString();
      this.axy = paramParcel.readInt();
      this.duk = paramParcel.readInt();
      this.hWG = paramParcel.readString();
      this.hWI = paramParcel.readInt();
      this.hWH = paramParcel.readInt();
      this.hWQ = paramParcel.readString();
      this.hWR = paramParcel.readString();
      this.hWS = paramParcel.readString();
      this.hWT = paramParcel.readString();
      AppMethodBeat.o(131468);
      return;
      bool2 = false;
      break;
      label381: bool2 = false;
      break label209;
      bool2 = false;
      break label224;
    }
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 1;
    AppMethodBeat.i(131469);
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeString(this.appId);
    paramParcel.writeString(this.userName);
    paramParcel.writeString(this.title);
    paramParcel.writeString(this.description);
    paramParcel.writeString(this.hWD);
    paramParcel.writeString(this.toUser);
    paramParcel.writeString(this.url);
    paramParcel.writeString(this.path);
    paramParcel.writeInt(this.type);
    paramParcel.writeString(this.hWE);
    paramParcel.writeString(this.iconUrl);
    paramParcel.writeString(this.hWF);
    if (this.hIs)
    {
      paramInt = 1;
      paramParcel.writeInt(paramInt);
      paramParcel.writeInt(this.cBc);
      paramParcel.writeString(this.hiv);
      paramParcel.writeInt(this.version);
      paramParcel.writeString(this.nickname);
      paramParcel.writeInt(this.hWJ);
      paramParcel.writeInt(this.scene);
      paramParcel.writeString(this.cst);
      paramParcel.writeString(this.hWK);
      paramParcel.writeString(this.hWL);
      paramParcel.writeString(this.hWM);
      if (!this.withShareTicket)
        break label379;
      paramInt = 1;
      label213: paramParcel.writeByte((byte)paramInt);
      if (!this.hWN)
        break label384;
      paramInt = 1;
      label228: paramParcel.writeInt(paramInt);
      if (!this.hWO)
        break label389;
    }
    label384: label389: for (paramInt = i; ; paramInt = 0)
    {
      paramParcel.writeInt(paramInt);
      paramParcel.writeString(this.fhu);
      paramParcel.writeString(this.cacheKey);
      paramParcel.writeInt(this.fmr);
      paramParcel.writeString(this.hWP);
      paramParcel.writeList(this.hWU);
      paramParcel.writeString(this.cOv);
      paramParcel.writeInt(this.axy);
      paramParcel.writeInt(this.duk);
      paramParcel.writeString(this.hWG);
      paramParcel.writeInt(this.hWI);
      paramParcel.writeInt(this.hWH);
      paramParcel.writeString(this.hWQ);
      paramParcel.writeString(this.hWR);
      paramParcel.writeString(this.hWS);
      paramParcel.writeString(this.hWT);
      AppMethodBeat.o(131469);
      return;
      paramInt = 0;
      break;
      label379: paramInt = 0;
      break label213;
      paramInt = 0;
      break label228;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.share.SendAppMessageTask
 * JD-Core Version:    0.6.2
 */