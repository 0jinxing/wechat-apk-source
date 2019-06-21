package com.tencent.mm.plugin.emojicapture.model.a;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.loader.j.b;
import com.tencent.mm.plugin.emojicapture.model.c.a.a;
import com.tencent.mm.plugin.emojicapture.model.c.g;
import com.tencent.mm.plugin.emojicapture.model.c.h;
import com.tencent.mm.plugin.emojicapture.model.c.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.File;
import java.util.Iterator;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/emojicapture/model/capture/EmojiStickerResHelper;", "Lcom/tencent/mm/plugin/emojicapture/api/IEmojiStickerRes;", "()V", "assetsRoot", "", "getAssetsRoot", "()Ljava/lang/String;", "compressConfigFile", "getCompressConfigFile", "configFile", "getConfigFile", "configFilePath", "getConfigFilePath", "itemConfigFile", "getItemConfigFile", "localRoot", "getLocalRoot", "localStickerRes", "getLocalStickerRes", "localStickerTmp", "getLocalStickerTmp", "tempConfigPath", "getTempConfigPath", "typePrefix", "getTypePrefix", "versionFile", "getVersionFile", "zipFile", "getZipFile", "checkAssetsVersion", "", "checkResUpdate", "", "copyResFromAssets", "getItemConfig", "Lcom/tencent/mm/plugin/emojicapture/model/xml/ResourceFileConfig;", "subType", "", "getItemConfigTemp", "itemConfigFilePath", "itemConfigTempFilePath", "itemDirPath", "unCompressFromTemp", "unCompressItem", "fromFolder", "toFolder", "unCompressSubType", "plugin-emojicapture_release"})
public final class e
  implements com.tencent.mm.plugin.emojicapture.api.a
{
  private static final String lhV = "assets:///sticker/";
  private static final String lhW;
  static final String lhX;
  static final String lhY;
  private static final String lhZ = "compress.zip";
  private static final String lia = "version.txt";
  static final String lic = "59_";
  private static final String lid = "EmoticonLensConfigFile.xml";
  private static final String lie;
  private static final String lif;
  private static final String lig = "EmoticonLensResouceCompreConfigFile.xml";
  private static final String lih = "EmoticonLensResouceAllFileConfigFile.xml";
  public static final e lii;

  static
  {
    AppMethodBeat.i(2651);
    lii = new e();
    lhV = "assets:///sticker/";
    lhW = b.eSk + "sticker/";
    lhX = lhW + "res/";
    lhY = lhW + "compress/";
    lhZ = "compress.zip";
    lia = "version.txt";
    lic = "59_";
    lid = "EmoticonLensConfigFile.xml";
    lie = lhX + "59_0/" + lid;
    lif = lhY + "59_0/" + lid;
    lig = "EmoticonLensResouceCompreConfigFile.xml";
    lih = "EmoticonLensResouceAllFileConfigFile.xml";
    AppMethodBeat.o(2651);
  }

  public static String bnA()
  {
    return lhY;
  }

  public static String bnB()
  {
    return lif;
  }

  public static void bnC()
  {
    AppMethodBeat.i(2647);
    ab.i(f.Ow(), "copyResFromAssets: ");
    long l = bo.yz();
    com.tencent.mm.vfs.e.cu(lhW);
    ab.i(f.Ow(), "copyResFromAssets: cost " + bo.az(l));
    AppMethodBeat.o(2647);
  }

  public static String bnz()
  {
    return lhW;
  }

  static void dO(String paramString1, String paramString2)
  {
    AppMethodBeat.i(2648);
    com.tencent.mm.vfs.e.cu(paramString2);
    com.tencent.mm.vfs.e.is(paramString1, paramString2);
    String str = paramString2 + File.separator + lig;
    if (com.tencent.mm.vfs.e.ct(str))
    {
      Object localObject = new g();
      paramString1 = com.tencent.mm.plugin.emojicapture.model.c.a.ljn;
      a.a.a(str, (com.tencent.mm.plugin.emojicapture.model.c.a)localObject);
      localObject = ((Iterable)((g)localObject).ljF).iterator();
      while (((Iterator)localObject).hasNext())
      {
        paramString1 = (h)((Iterator)localObject).next();
        com.tencent.mm.vfs.e.y(paramString2 + paramString1.ljG, paramString2 + paramString1.ljH);
      }
    }
    AppMethodBeat.o(2648);
  }

  public static String uw(int paramInt)
  {
    AppMethodBeat.i(2649);
    String str = lhX + lic + paramInt + '/' + lih;
    AppMethodBeat.o(2649);
    return str;
  }

  public static i ux(int paramInt)
  {
    AppMethodBeat.i(2650);
    String str = lhY + lic + paramInt + '/' + lih;
    i locali = new i();
    a.a locala = com.tencent.mm.plugin.emojicapture.model.c.a.ljn;
    a.a.a(str, (com.tencent.mm.plugin.emojicapture.model.c.a)locali);
    AppMethodBeat.o(2650);
    return locali;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.model.a.e
 * JD-Core Version:    0.6.2
 */