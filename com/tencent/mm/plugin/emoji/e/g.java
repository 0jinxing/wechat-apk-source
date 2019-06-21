package com.tencent.mm.plugin.emoji.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.a.c;
import com.tencent.mm.at.a.a.c.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.plugin.emoji.h.b;
import com.tencent.mm.plugin.emoji.model.EmojiLogic;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class g
{
  private static final c kTQ;

  static
  {
    AppMethodBeat.i(52883);
    c.a locala = new c.a();
    locala.ePF = true;
    locala.fHe = 1;
    locala.ePZ = false;
    kTQ = locala.ahG();
    AppMethodBeat.o(52883);
  }

  public static c a(String paramString, int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(52878);
    if (!bo.isNullOrNil(paramString))
    {
      c.a locala = new c.a();
      locala.ePH = true;
      locala.ePJ = paramString;
      locala.ePO = paramInt;
      locala.ePN = paramInt;
      locala.eQd = paramArrayOfObject;
      paramString = locala.ahG();
      AppMethodBeat.o(52878);
    }
    while (true)
    {
      return paramString;
      ab.w("MicroMsg.emoji.EmojiImageLoaderManager", "get emoji loader options failed. path is null.");
      paramString = null;
      AppMethodBeat.o(52878);
    }
  }

  public static c bjM()
  {
    AppMethodBeat.i(52874);
    Object localObject = new c.a();
    ((c.a)localObject).ePF = true;
    ((c.a)localObject).ePH = false;
    ((c.a)localObject).fHe = 3;
    localObject = ((c.a)localObject).ahG();
    AppMethodBeat.o(52874);
    return localObject;
  }

  public static c dH(String paramString1, String paramString2)
  {
    AppMethodBeat.i(52871);
    paramString1 = h(paramString1, paramString2, new Object[0]);
    AppMethodBeat.o(52871);
    return paramString1;
  }

  public static c dI(String paramString1, String paramString2)
  {
    AppMethodBeat.i(52879);
    paramString2 = EmojiLogic.K(b.Yb(), paramString1, paramString2);
    if (!bo.isNullOrNil(paramString2))
    {
      paramString1 = new c.a();
      paramString1.ePF = true;
      paramString1.ePH = true;
      paramString1.ePJ = paramString2;
      paramString1.eQf = true;
      paramString1 = paramString1.ahG();
      AppMethodBeat.o(52879);
    }
    while (true)
    {
      return paramString1;
      ab.w("MicroMsg.emoji.EmojiImageLoaderManager", "get emoji loader options failed. path is null.");
      paramString1 = null;
      AppMethodBeat.o(52879);
    }
  }

  public static c dJ(String paramString1, String paramString2)
  {
    AppMethodBeat.i(52880);
    paramString1 = EmojiLogic.K(b.Yb(), paramString1, paramString2);
    if (!bo.isNullOrNil(paramString1))
    {
      paramString2 = new c.a();
      paramString2.ePF = true;
      paramString2.ePH = true;
      paramString2.ePJ = paramString1;
      paramString2.eQf = false;
      paramString1 = paramString2.ahG();
      AppMethodBeat.o(52880);
    }
    while (true)
    {
      return paramString1;
      ab.w("MicroMsg.emoji.EmojiImageLoaderManager", "get emoji loader options failed. path is null.");
      paramString1 = null;
      AppMethodBeat.o(52880);
    }
  }

  public static c h(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(52872);
    paramString2 = EmojiLogic.K(b.Yb(), paramString1, paramString2);
    if (!bo.isNullOrNil(paramString2))
    {
      paramString1 = new c.a();
      paramString1.ePF = true;
      paramString1.ePH = true;
      paramString1.ePJ = paramString2;
      paramString1.eQd = paramArrayOfObject;
      paramString1 = paramString1.ahG();
      AppMethodBeat.o(52872);
    }
    while (true)
    {
      return paramString1;
      ab.w("MicroMsg.emoji.EmojiImageLoaderManager", "get emoji loader options failed. path is null.");
      paramString1 = null;
      AppMethodBeat.o(52872);
    }
  }

  public static c j(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(52875);
    String str = com.tencent.mm.kernel.g.RP().eJM;
    paramString2 = EmojiLogic.K(b.Yb(), paramString1, paramString2);
    if (!bo.isNullOrNil(paramString2))
    {
      paramString1 = new c.a();
      paramString1.ePF = true;
      paramString1.ePH = true;
      paramString1.ePJ = paramString2;
      paramString1.ePK = str;
      paramString1.eQd = paramArrayOfObject;
      paramString1 = paramString1.ahG();
      AppMethodBeat.o(52875);
    }
    while (true)
    {
      return paramString1;
      ab.w("MicroMsg.emoji.EmojiImageLoaderManager", "get emoji loader options failed. path is null.");
      paramString1 = null;
      AppMethodBeat.o(52875);
    }
  }

  public static c k(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(52881);
    paramString1 = EmojiLogic.K(b.Yb(), paramString1, paramString2);
    if (!bo.isNullOrNil(paramString1))
    {
      paramString2 = new c.a();
      paramString2.ePF = false;
      paramString2.ePH = true;
      paramString2.ePJ = paramString1;
      paramString2.eQd = paramArrayOfObject;
      paramString1 = paramString2.ahG();
      AppMethodBeat.o(52881);
    }
    while (true)
    {
      return paramString1;
      ab.w("MicroMsg.emoji.EmojiImageLoaderManager", "get emoji loader options failed. path is null.");
      paramString1 = null;
      AppMethodBeat.o(52881);
    }
  }

  public static c l(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(52882);
    paramString2 = EmojiLogic.K(b.Yb(), paramString1, paramString2);
    if (!bo.isNullOrNil(paramString2))
    {
      paramString1 = new c.a();
      paramString1.ePF = true;
      paramString1.ePH = true;
      paramString1.ePJ = paramString2;
      paramString1.eQd = paramArrayOfObject;
      paramString1 = paramString1.ahG();
      AppMethodBeat.o(52882);
    }
    while (true)
    {
      return paramString1;
      ab.w("MicroMsg.emoji.EmojiImageLoaderManager", "get emoji loader options failed. path is null.");
      paramString1 = null;
      AppMethodBeat.o(52882);
    }
  }

  public static c q(String paramString, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(52876);
    if (!bo.isNullOrNil(paramString))
    {
      c.a locala = new c.a();
      locala.ePH = true;
      locala.ePJ = paramString;
      locala.eQd = paramArrayOfObject;
      paramString = locala.ahG();
      AppMethodBeat.o(52876);
    }
    while (true)
    {
      return paramString;
      ab.w("MicroMsg.emoji.EmojiImageLoaderManager", "get emoji loader options failed. path is null.");
      paramString = null;
      AppMethodBeat.o(52876);
    }
  }

  public static c r(String paramString, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(52877);
    if (!bo.isNullOrNil(paramString))
    {
      c.a locala = new c.a();
      locala.ePH = true;
      locala.ePJ = paramString;
      locala.eQb = false;
      locala.eQd = paramArrayOfObject;
      paramString = locala.ahG();
      AppMethodBeat.o(52877);
    }
    while (true)
    {
      return paramString;
      ab.w("MicroMsg.emoji.EmojiImageLoaderManager", "get emoji loader options failed. path is null.");
      paramString = null;
      AppMethodBeat.o(52877);
    }
  }

  public static c u(String paramString1, String paramString2, int paramInt)
  {
    AppMethodBeat.i(52873);
    paramString1 = EmojiLogic.K(b.Yb(), paramString1, paramString2);
    if (!bo.isNullOrNil(paramString1))
    {
      paramString2 = new c.a();
      paramString2.ePF = true;
      paramString2.ePH = true;
      paramString2.ePJ = paramString1;
      paramString2.ePO = paramInt;
      paramString2.ePN = paramInt;
      paramString1 = paramString2.ahG();
      AppMethodBeat.o(52873);
    }
    while (true)
    {
      return paramString1;
      ab.w("MicroMsg.emoji.EmojiImageLoaderManager", "get emoji loader options failed. path is null.");
      paramString1 = null;
      AppMethodBeat.o(52873);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.e.g
 * JD-Core Version:    0.6.2
 */