package com.tencent.mm.plugin.avatar;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.b.f;
import com.tencent.mm.kernel.b.g;
import com.tencent.mm.plugin.report.e;
import com.tencent.mm.vfs.FileSystem;
import com.tencent.mm.vfs.FileSystemManager;
import com.tencent.mm.vfs.FileSystemManager.a;
import com.tencent.mm.vfs.MigrationFileSystem;
import com.tencent.mm.vfs.QuotaFileSystem;
import com.tencent.mm.vfs.RawFileSystem;
import com.tencent.mm.vfs.a;
import java.util.Map;

public class PluginAvatar extends f
  implements b
{
  public void configure(g paramg)
  {
    AppMethodBeat.i(79058);
    if (paramg.SG())
    {
      paramg = new a((byte)0);
      Object localObject = new MigrationFileSystem(new RawFileSystem("${data}/MicroMsg/${account}/avatar", (byte)0), new FileSystem[] { new RawFileSystem("${storage}/tencent/MicroMsg/${account}/avatar") });
      ((MigrationFileSystem)localObject).a("avatarMigration", paramg);
      localObject = new QuotaFileSystem((FileSystem)localObject);
      ((QuotaFileSystem)localObject).a("avatarQuota", paramg);
      FileSystemManager.dMv().dMx().a("avatar", (FileSystem)localObject).iq("${data}/MicroMsg/${account}/avatar", "avatar").ri(false);
    }
    AppMethodBeat.o(79058);
  }

  public void execute(g paramg)
  {
    AppMethodBeat.i(79059);
    if (paramg.SG())
      pin(c.aSm());
    AppMethodBeat.o(79059);
  }

  static final class a
    implements a
  {
    private static void dy(int paramInt1, int paramInt2)
    {
      AppMethodBeat.i(79056);
      e.pXa.a(857L, paramInt1, paramInt2, false);
      AppMethodBeat.o(79056);
    }

    public final void b(String paramString, int paramInt, Map<String, Object> paramMap)
    {
      AppMethodBeat.i(79057);
      if (paramInt == 4)
      {
        dy(1, 1);
        AppMethodBeat.o(79057);
      }
      while (true)
      {
        return;
        if (paramInt == 5)
        {
          dy(2, 1);
          AppMethodBeat.o(79057);
        }
        else if (paramInt == 1)
        {
          if (!paramString.equals("avatarQuota"))
            break label284;
          dy(0, 1);
          AppMethodBeat.o(79057);
        }
        else
        {
          if (paramInt != 3)
            break label213;
          if (!paramString.equals("avatarQuota"))
            break;
          dy(6, 1);
          AppMethodBeat.o(79057);
        }
      }
      Integer localInteger;
      if (paramString.equals("avatarMigration"))
      {
        dy(3, 1);
        paramString = (Integer)paramMap.get("filesCopied");
        localInteger = (Integer)paramMap.get("filesFailed");
        paramMap = (Long)paramMap.get("sizeCopied");
        if (paramString == null)
          break label292;
      }
      label284: label292: for (paramInt = paramString.intValue() + 0; ; paramInt = 0)
      {
        int i = paramInt;
        if (localInteger != null)
          i = paramInt + localInteger.intValue();
        if (i > 0)
        {
          dy(7, 1);
          dy(13, i);
        }
        if (paramMap != null)
          dy(15, (int)paramMap.longValue());
        AppMethodBeat.o(79057);
        break;
        label213: if (((paramInt == 2) || (paramInt == 6)) && (paramString.equals("avatarQuota")))
        {
          paramString = (Integer)paramMap.get("fileCount");
          paramMap = (Long)paramMap.get("totalSize");
          if (paramString != null)
            dy(9, paramString.intValue());
          if (paramMap != null)
            dy(11, (int)paramMap.longValue());
        }
        AppMethodBeat.o(79057);
        break;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.avatar.PluginAvatar
 * JD-Core Version:    0.6.2
 */