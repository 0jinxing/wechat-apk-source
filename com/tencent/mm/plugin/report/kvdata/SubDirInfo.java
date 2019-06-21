package com.tencent.mm.plugin.report.kvdata;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class SubDirInfo extends com.tencent.mm.bt.a
{
  public long dirCount_;
  public long fileCount_;
  public long fileLenInvalidCount;
  public int tag_;
  public long totalSize_;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(79153);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.tag_);
      paramArrayOfObject.ai(2, this.totalSize_);
      paramArrayOfObject.ai(3, this.dirCount_);
      paramArrayOfObject.ai(4, this.fileCount_);
      paramArrayOfObject.ai(5, this.fileLenInvalidCount);
      AppMethodBeat.o(79153);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.bs(1, this.tag_) + 0 + e.a.a.b.b.a.o(2, this.totalSize_) + e.a.a.b.b.a.o(3, this.dirCount_) + e.a.a.b.b.a.o(4, this.fileCount_) + e.a.a.b.b.a.o(5, this.fileLenInvalidCount);
        AppMethodBeat.o(79153);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(79153);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        SubDirInfo localSubDirInfo = (SubDirInfo)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(79153);
          break;
        case 1:
          localSubDirInfo.tag_ = locala.BTU.vd();
          AppMethodBeat.o(79153);
          paramInt = 0;
          break;
        case 2:
          localSubDirInfo.totalSize_ = locala.BTU.ve();
          AppMethodBeat.o(79153);
          paramInt = 0;
          break;
        case 3:
          localSubDirInfo.dirCount_ = locala.BTU.ve();
          AppMethodBeat.o(79153);
          paramInt = 0;
          break;
        case 4:
          localSubDirInfo.fileCount_ = locala.BTU.ve();
          AppMethodBeat.o(79153);
          paramInt = 0;
          break;
        case 5:
          localSubDirInfo.fileLenInvalidCount = locala.BTU.ve();
          AppMethodBeat.o(79153);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(79153);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.report.kvdata.SubDirInfo
 * JD-Core Version:    0.6.2
 */