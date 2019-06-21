package com.tencent.mm.plugin.shake.ui;

import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.a;
import com.tencent.mm.at.a.a.c;
import com.tencent.mm.at.a.a.c.a;
import com.tencent.mm.at.o;
import com.tencent.mm.plugin.shake.b.f;
import com.tencent.mm.plugin.shake.b.g;
import com.tencent.mm.plugin.shake.b.m;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.List;

public final class e
{
  public static void a(ImageView paramImageView, String paramString, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(24908);
    if (paramImageView == null)
      AppMethodBeat.o(24908);
    while (true)
    {
      return;
      paramImageView.setImageBitmap(null);
      if (!bo.isNullOrNil(paramString))
      {
        Object localObject = new c.a();
        ((c.a)localObject).ePJ = m.sw(paramString);
        ((c.a)localObject).ePH = true;
        ((c.a)localObject).ePZ = true;
        ((c.a)localObject).eQf = paramBoolean;
        if (paramInt != 0)
          ((c.a)localObject).ePV = paramInt;
        localObject = ((c.a)localObject).ahG();
        o.ahp().a(paramString, paramImageView, (c)localObject);
      }
      AppMethodBeat.o(24908);
    }
  }

  public static String ckT()
  {
    AppMethodBeat.i(24909);
    Object localObject1 = m.cjT().cjK();
    Object localObject2 = new StringBuilder();
    localObject1 = ((List)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      ((StringBuilder)localObject2).append(((f)((Iterator)localObject1).next()).field_reserved1);
      ((StringBuilder)localObject2).append("|");
    }
    localObject2 = ((StringBuilder)localObject2).toString();
    AppMethodBeat.o(24909);
    return localObject2;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.ui.e
 * JD-Core Version:    0.6.2
 */