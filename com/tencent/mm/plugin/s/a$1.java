package com.tencent.mm.plugin.s;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.x;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.h;
import com.tencent.mm.pluginsdk.model.app.i;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.dl;
import com.tencent.mm.protocal.protobuf.dm;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ah;
import java.util.LinkedList;
import java.util.List;

final class a$1
  implements com.tencent.mm.plugin.s.a.a
{
  a$1(a parama)
  {
  }

  public final f Uq(String paramString)
  {
    AppMethodBeat.i(79114);
    paramString = a.bYJ().aiJ(paramString);
    AppMethodBeat.o(79114);
    return paramString;
  }

  public final f Ur(String paramString)
  {
    AppMethodBeat.i(79115);
    a.bYI();
    if ((paramString == null) || (paramString.length() == 0))
    {
      AppMethodBeat.o(79115);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      Object localObject1 = new LinkedList();
      ((List)localObject1).add(paramString);
      localObject1 = new com.tencent.mm.pluginsdk.model.app.ab((List)localObject1);
      Object localObject2 = new b.a();
      ((b.a)localObject2).fsJ = new dl();
      ((b.a)localObject2).fsK = new dm();
      ((b.a)localObject2).uri = "/cgi-bin/micromsg-bin/appcenter";
      ((b.a)localObject2).fsI = 452;
      ((b.a)localObject2).fsL = 0;
      ((b.a)localObject2).fsM = 0;
      localObject2 = ((b.a)localObject2).acD();
      dl localdl = (dl)((b)localObject2).fsG.fsP;
      Object localObject3 = ((com.tencent.mm.pluginsdk.model.app.ab)localObject1).dhj();
      if (localObject3 != null)
        localdl.ReqBuf = new SKBuiltinBuffer_t().setBuffer((byte[])localObject3);
      localdl.jCt = 7;
      localObject3 = x.c((b)localObject2);
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.AppInfoService", "call getAppInfoList cgi result, errType = %d, errCode = %d", new Object[] { Integer.valueOf(((com.tencent.mm.ai.a.a)localObject3).errType), Integer.valueOf(((com.tencent.mm.ai.a.a)localObject3).errCode) });
      if ((((com.tencent.mm.ai.a.a)localObject3).errType != 0) || (((com.tencent.mm.ai.a.a)localObject3).errCode != 0))
      {
        AppMethodBeat.o(79115);
        paramString = null;
      }
      else
      {
        ((com.tencent.mm.pluginsdk.model.app.ab)localObject1).bG(aa.a(((dm)((com.tencent.mm.ai.a.a)localObject3).fsy).vFq));
        ((com.tencent.mm.pluginsdk.model.app.ab)localObject1).a(0, ((com.tencent.mm.ai.a.a)localObject3).errType, ((com.tencent.mm.ai.a.a)localObject3).errCode, ((com.tencent.mm.ai.a.a)localObject3).aIm, (q)localObject2, new byte[0]);
        localObject1 = com.tencent.mm.plugin.s.a.a.a.bYQ();
        if (localObject1 == null)
        {
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.AppInfoService", "getISubCorePluginBase() == null");
          AppMethodBeat.o(79115);
          paramString = null;
        }
        else
        {
          paramString = ((com.tencent.mm.plugin.s.a.a)localObject1).Uq(paramString);
          AppMethodBeat.o(79115);
        }
      }
    }
  }

  public final void Us(String paramString)
  {
    AppMethodBeat.i(79120);
    a.bYI().aiH(paramString);
    AppMethodBeat.o(79120);
  }

  public final Bitmap a(String paramString, int paramInt, float paramFloat)
  {
    Object localObject = null;
    AppMethodBeat.i(79118);
    a.bYJ();
    if ((paramString == null) || (paramString.length() == 0))
    {
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.AppInfoStorage", "getIcon : invalid argument");
      AppMethodBeat.o(79118);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      if (paramString.equals("wx7fa037cc7dfabad5"))
      {
        paramString = BitmapFactory.decodeResource(ah.getContext().getResources(), 2130837788);
        AppMethodBeat.o(79118);
      }
      else
      {
        paramString = i.dY(paramString, paramInt);
        if (!com.tencent.mm.a.e.ct(paramString))
        {
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.AppInfoStorage", "icon does not exist, iconPath = " + paramString + ", iconType = " + paramInt);
          AppMethodBeat.o(79118);
          paramString = localObject;
        }
        else
        {
          paramString = BackwardSupportUtil.b.i(paramString, paramFloat);
          AppMethodBeat.o(79118);
        }
      }
    }
  }

  public final void ah(LinkedList<String> paramLinkedList)
  {
    AppMethodBeat.i(79125);
    a.bYI().aC(paramLinkedList);
    AppMethodBeat.o(79125);
  }

  public final Cursor bYN()
  {
    AppMethodBeat.i(79116);
    Cursor localCursor = a.bYJ().rawQuery("select * from AppInfo where status = 5 order by modifyTime asc", new String[0]);
    if (localCursor == null)
    {
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.AppInfoStorage", "getAppByStatus : cursor is null");
      localCursor = null;
      AppMethodBeat.o(79116);
    }
    while (true)
    {
      return localCursor;
      AppMethodBeat.o(79116);
    }
  }

  public final i bYO()
  {
    AppMethodBeat.i(79124);
    i locali = a.bYJ();
    AppMethodBeat.o(79124);
    return locali;
  }

  public final Cursor bYP()
  {
    AppMethodBeat.i(79127);
    i locali = a.bYJ();
    Object localObject = new StringBuilder(256);
    ((StringBuilder)localObject).append("select * from AppInfo");
    ((StringBuilder)localObject).append(" where ");
    ((StringBuilder)localObject).append("serviceAppType > 0");
    localObject = locali.rawQuery(((StringBuilder)localObject).toString(), new String[0]);
    if (localObject == null)
    {
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.AppInfoStorage", "getAllServices : cursor is null");
      localObject = null;
      AppMethodBeat.o(79127);
    }
    while (true)
    {
      return localObject;
      com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.AppInfoStorage", "getAllServices count = %d", new Object[] { Integer.valueOf(((Cursor)localObject).getCount()) });
      AppMethodBeat.o(79127);
    }
  }

  public final void c(f paramf)
  {
    AppMethodBeat.i(79121);
    i locali = a.bYJ();
    if ((paramf != null) && (paramf.field_status != 5))
    {
      paramf.field_status = 3;
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.AppInfoStorage", "setBlack package name = %s", new Object[] { paramf.field_packageName });
      locali.a(paramf, new String[0]);
    }
    AppMethodBeat.o(79121);
  }

  public final void cN(String paramString, int paramInt)
  {
    AppMethodBeat.i(79119);
    a.bYH().dW(paramString, paramInt);
    AppMethodBeat.o(79119);
  }

  public final void d(f paramf)
  {
    AppMethodBeat.i(79122);
    i locali = a.bYJ();
    if ((paramf == null) || (paramf.field_status != 3))
      AppMethodBeat.o(79122);
    while (true)
    {
      return;
      paramf.field_status = 4;
      locali.a(paramf, new String[0]);
      AppMethodBeat.o(79122);
    }
  }

  public final void e(f paramf)
  {
    AppMethodBeat.i(79123);
    a.bYJ().a(paramf, new String[0]);
    AppMethodBeat.o(79123);
  }

  public final Cursor eQ(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(79126);
    Cursor localCursor = a.bYJ().eQ(paramInt1, paramInt2);
    AppMethodBeat.o(79126);
    return localCursor;
  }

  public final Cursor x(int[] paramArrayOfInt)
  {
    AppMethodBeat.i(79117);
    i locali = a.bYJ();
    String str = "select * from AppInfo where ";
    for (int i = 0; i <= 0; i++)
      str = str + " status = " + paramArrayOfInt[0];
    paramArrayOfInt = locali.rawQuery(str + " order by status desc, modifyTime asc", new String[0]);
    if (paramArrayOfInt == null)
    {
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.AppInfoStorage", "getAppByStatus : cursor is null");
      paramArrayOfInt = null;
      AppMethodBeat.o(79117);
    }
    while (true)
    {
      return paramArrayOfInt;
      AppMethodBeat.o(79117);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.s.a.1
 * JD-Core Version:    0.6.2
 */