package com.tencent.ttpic.util;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class RetrieveDataManager
{
  private static final ThreadLocal<RetrieveDataManager> INSTANCE;
  private final TexSaveProcess mRGBATexSaveProcess;
  private final TexSaveProcess mYUVTexSaveProcess;

  static
  {
    AppMethodBeat.i(83974);
    INSTANCE = new RetrieveDataManager.1();
    AppMethodBeat.o(83974);
  }

  public RetrieveDataManager()
  {
    AppMethodBeat.i(83969);
    this.mRGBATexSaveProcess = new RGBATexSaveProcess();
    this.mYUVTexSaveProcess = new YUVTexSaveProcess();
    AppMethodBeat.o(83969);
  }

  private TexSaveProcess createTexSaveProcess(int paramInt)
  {
    TexSaveProcess localTexSaveProcess;
    if (paramInt == RetrieveDataManager.DATA_TYPE.RGBA.value)
      localTexSaveProcess = this.mRGBATexSaveProcess;
    while (true)
    {
      return localTexSaveProcess;
      if (paramInt == RetrieveDataManager.DATA_TYPE.YUV.value)
        localTexSaveProcess = this.mYUVTexSaveProcess;
      else
        localTexSaveProcess = null;
    }
  }

  public static RetrieveDataManager getInstance()
  {
    AppMethodBeat.i(83970);
    RetrieveDataManager localRetrieveDataManager = (RetrieveDataManager)INSTANCE.get();
    AppMethodBeat.o(83970);
    return localRetrieveDataManager;
  }

  public void clear()
  {
    AppMethodBeat.i(83973);
    this.mRGBATexSaveProcess.clear();
    this.mYUVTexSaveProcess.clear();
    AppMethodBeat.o(83973);
  }

  public boolean isValid(int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(83972);
    RetrieveDataManager.DATA_TYPE[] arrayOfDATA_TYPE = RetrieveDataManager.DATA_TYPE.values();
    int i = arrayOfDATA_TYPE.length;
    int j = 0;
    if (j < i)
      if (arrayOfDATA_TYPE[j].value == paramInt)
      {
        bool = true;
        AppMethodBeat.o(83972);
      }
    while (true)
    {
      return bool;
      j++;
      break;
      AppMethodBeat.o(83972);
    }
  }

  public byte[] retrieveData(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(83971);
    Object localObject = createTexSaveProcess(paramInt1);
    if (localObject != null)
    {
      localObject = ((TexSaveProcess)localObject).retrieveData(paramInt2, paramInt3, paramInt4);
      AppMethodBeat.o(83971);
    }
    while (true)
    {
      return localObject;
      localObject = new byte[0];
      AppMethodBeat.o(83971);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.util.RetrieveDataManager
 * JD-Core Version:    0.6.2
 */