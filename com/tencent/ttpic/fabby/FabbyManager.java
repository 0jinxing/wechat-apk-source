package com.tencent.ttpic.fabby;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.baseutils.FileUtils;
import com.tencent.ttpic.manager.FeatureManager;
import com.tencent.ttpic.util.ResourcePathMapper;
import com.tencent.ttpic.util.VideoGlobalContext;
import com.tencent.ttpic.util.VideoPrefsUtil;
import com.tencent.youtu.android.segmenter.SegmenterLib;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FabbyManager
{
  private static final String RAPID_MODE = "RPNSegmenter_m5.rapidnetmodel";
  private static final String RAPID_MODE_SMALL = "RPNSegmenter_m6.rapidnetmodel";
  private static final String RAPID_PROTO = "deploy_m5_512_512_bin.rapidnetproto";
  private static final String RAPID_PROTO_SMALL = "deploy_m6.rapidnetproto";
  public static boolean USE_SMALL_IMAGE = false;
  public static boolean USE_SMALL_MODEL;
  private static FabbyManager instance = null;
  public static boolean sChooseGPU_Segment = false;
  private boolean INIT_SEGMENT_LIB;
  private boolean gpuSupportOpenCL;
  public SegmenterLib lib;
  private boolean mIsModelCopySuccess;
  private boolean mIsProtoCopySuccess;
  private int mModelCopyType;
  private String mModelPath;
  private String mProtoPath;

  static
  {
    USE_SMALL_MODEL = false;
  }

  private FabbyManager()
  {
    AppMethodBeat.i(81862);
    this.mModelPath = "";
    this.mProtoPath = "";
    this.mIsProtoCopySuccess = true;
    this.mIsModelCopySuccess = true;
    this.mModelCopyType = 0;
    this.INIT_SEGMENT_LIB = false;
    copyCLFile();
    initSegmentLib();
    AppMethodBeat.o(81862);
  }

  private void copyCLFile()
  {
    AppMethodBeat.i(81866);
    Object localObject1 = VideoGlobalContext.getContext();
    try
    {
      InputStream localInputStream = ((Context)localObject1).getAssets().open("fabbysdk.cl");
      Object localObject2 = new java/io/File;
      ((File)localObject2).<init>(((Context)localObject1).getDir("execdir", 0), "fabbysdk.cl");
      localObject1 = new java/io/FileOutputStream;
      ((FileOutputStream)localObject1).<init>((File)localObject2);
      localObject2 = new byte[65535];
      while (true)
      {
        int i = localInputStream.read((byte[])localObject2);
        if (i <= 0)
          break;
        ((OutputStream)localObject1).write((byte[])localObject2, 0, i);
      }
    }
    catch (IOException localIOException)
    {
      AppMethodBeat.o(81866);
    }
    while (true)
    {
      return;
      localIOException.close();
      ((OutputStream)localObject1).close();
      AppMethodBeat.o(81866);
    }
  }

  public static FabbyManager getInstance()
  {
    AppMethodBeat.i(81864);
    if (instance == null);
    try
    {
      if (instance == null)
      {
        localFabbyManager = new com/tencent/ttpic/fabby/FabbyManager;
        localFabbyManager.<init>();
        instance = localFabbyManager;
      }
      if (!instance.getInitSegmentLib())
        instance.initSegmentLib();
      FabbyManager localFabbyManager = instance;
      AppMethodBeat.o(81864);
      return localFabbyManager;
    }
    finally
    {
      AppMethodBeat.o(81864);
    }
  }

  public static void init()
  {
    AppMethodBeat.i(81863);
    getInstance();
    AppMethodBeat.o(81863);
  }

  private void initSegmentLib()
  {
    AppMethodBeat.i(81865);
    if (!FeatureManager.isSegmentationReady())
    {
      AppMethodBeat.o(81865);
      return;
    }
    File localFile1 = VideoGlobalContext.getContext().getFilesDir();
    label33: File localFile2;
    label52: label71: Object localObject;
    if (USE_SMALL_MODEL)
    {
      str = "RPNSegmenter_m6.rapidnetmodel";
      localFile2 = new File(localFile1, str);
      if (!USE_SMALL_MODEL)
        break label248;
      str = "deploy_m6.rapidnetproto";
      localFile1 = new File(localFile1, str);
      if (!USE_SMALL_MODEL)
        break label254;
      str = "RPNSegmenter_m6.rapidnetmodel";
      str = ResourcePathMapper.getModelResPath(str);
      if ((str == null) || (str.startsWith("assets://")))
        break label266;
      localObject = new StringBuilder().append(str);
      if (!USE_SMALL_MODEL)
        break label260;
      str = "RPNSegmenter_m6.rapidnetmodel";
      label111: this.mIsModelCopySuccess = FileUtils.copyFile(str, localFile2.getAbsolutePath());
      this.mModelCopyType = 2;
      localObject = VideoGlobalContext.getContext();
      if (!USE_SMALL_MODEL)
        break label308;
    }
    label260: label266: label308: for (String str = "deploy_m6.rapidnetproto"; ; str = "deploy_m5_512_512_bin.rapidnetproto")
    {
      this.mIsProtoCopySuccess = FileUtils.copyAssets((Context)localObject, str, localFile1.getAbsolutePath());
      this.mModelPath = localFile2.getAbsolutePath();
      this.mProtoPath = localFile1.getAbsolutePath();
      this.lib = new SegmenterLib(localFile1.getAbsolutePath(), localFile2.getAbsolutePath());
      this.lib.setNativePtr(this.lib.getNativePtr());
      this.gpuSupportOpenCL = this.lib.isGPUSupportOpenCL();
      compileKernel();
      this.INIT_SEGMENT_LIB = true;
      AppMethodBeat.o(81865);
      break;
      str = "RPNSegmenter_m5.rapidnetmodel";
      break label33;
      label248: str = "deploy_m5_512_512_bin.rapidnetproto";
      break label52;
      label254: str = "RPNSegmenter_m5.rapidnetmodel";
      break label71;
      str = "RPNSegmenter_m5.rapidnetmodel";
      break label111;
      localObject = VideoGlobalContext.getContext();
      if (USE_SMALL_MODEL);
      for (str = "RPNSegmenter_m6.rapidnetmodel"; ; str = "RPNSegmenter_m5.rapidnetmodel")
      {
        this.mIsModelCopySuccess = FileUtils.copyAssets((Context)localObject, str, localFile2.getAbsolutePath());
        this.mModelCopyType = 1;
        break;
      }
    }
  }

  public boolean IsInitSuccess()
  {
    AppMethodBeat.i(81876);
    boolean bool;
    if (this.lib != null)
    {
      bool = this.lib.isInitSuccess();
      AppMethodBeat.o(81876);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(81876);
    }
  }

  public void clearSegmentBuffer()
  {
    AppMethodBeat.i(81875);
    if (this.lib != null)
      this.lib.clearSegmentBuffer();
    AppMethodBeat.o(81875);
  }

  public int compileKernel()
  {
    AppMethodBeat.i(81867);
    int i = this.lib.compileKernel();
    AppMethodBeat.o(81867);
    return i;
  }

  public int copyBufferToTexture(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(81874);
    paramInt1 = this.lib.copyBufferToTexture(paramInt1, paramInt2, paramInt3);
    AppMethodBeat.o(81874);
    return paramInt1;
  }

  public int copyTextureToBuffer(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(81872);
    paramInt1 = this.lib.copyTextureToBuffer(paramInt1, paramInt2, paramInt3);
    AppMethodBeat.o(81872);
    return paramInt1;
  }

  public int getErrorCode()
  {
    AppMethodBeat.i(81877);
    int i;
    if (this.lib != null)
    {
      i = this.lib.getErrorCode();
      AppMethodBeat.o(81877);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(81877);
    }
  }

  public int getErrorType()
  {
    AppMethodBeat.i(81878);
    int i;
    if (this.lib != null)
    {
      i = this.lib.getErrorType();
      AppMethodBeat.o(81878);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(81878);
    }
  }

  public boolean getInitSegmentLib()
  {
    return this.INIT_SEGMENT_LIB;
  }

  public boolean getIsModelCopySuccess()
  {
    return this.mIsModelCopySuccess;
  }

  public boolean getIsProtoCopySuccess()
  {
    return this.mIsProtoCopySuccess;
  }

  public int getModelCopyType()
  {
    return this.mModelCopyType;
  }

  public String getModelPath()
  {
    return this.mModelPath;
  }

  public String getProtoPath()
  {
    return this.mProtoPath;
  }

  public boolean isGPUSupportOpenCL()
  {
    boolean bool1 = false;
    AppMethodBeat.i(81869);
    boolean bool2 = VideoPrefsUtil.getDefaultPrefs().getBoolean("prefs_key_segment_on_cpu", false);
    if ((this.gpuSupportOpenCL) && (!bool2))
    {
      bool1 = true;
      AppMethodBeat.o(81869);
    }
    while (true)
    {
      return bool1;
      AppMethodBeat.o(81869);
    }
  }

  public Bitmap segment(Bitmap paramBitmap)
  {
    AppMethodBeat.i(81868);
    paramBitmap = this.lib.segment(paramBitmap);
    AppMethodBeat.o(81868);
    return paramBitmap;
  }

  public void segmentOnBitmap(Bitmap paramBitmap1, Bitmap paramBitmap2, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(81871);
    this.lib.segmentOnBitmap(paramBitmap1, paramBitmap2, paramInt1, paramInt2, paramInt3, paramInt4);
    AppMethodBeat.o(81871);
  }

  public int segmentOnTexture(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean, int paramInt5, int paramInt6)
  {
    AppMethodBeat.i(81870);
    paramInt1 = this.lib.segmentOnTexture(paramInt1, paramInt2, paramInt3, paramInt4, paramBoolean, paramInt5, paramInt6);
    AppMethodBeat.o(81870);
    return paramInt1;
  }

  public int segmentOnTextureV2(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(81873);
    paramInt1 = this.lib.segmentOnTextureV2(paramInt1, paramInt2, paramInt3, paramInt4);
    AppMethodBeat.o(81873);
    return paramInt1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.fabby.FabbyManager
 * JD-Core Version:    0.6.2
 */