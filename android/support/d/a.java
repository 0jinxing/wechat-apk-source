package android.support.d;

import android.content.res.AssetManager.AssetInputStream;
import android.util.Pair;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class a
{
  public static final String TAG_APERTURE_VALUE = "ApertureValue";
  public static final String TAG_ARTIST = "Artist";
  public static final String TAG_BITS_PER_SAMPLE = "BitsPerSample";
  public static final String TAG_BODY_SERIAL_NUMBER = "BodySerialNumber";
  public static final String TAG_BRIGHTNESS_VALUE = "BrightnessValue";
  public static final String TAG_CAMARA_OWNER_NAME = "CameraOwnerName";
  public static final String TAG_CFA_PATTERN = "CFAPattern";
  public static final String TAG_COLOR_SPACE = "ColorSpace";
  public static final String TAG_COMPONENTS_CONFIGURATION = "ComponentsConfiguration";
  public static final String TAG_COMPRESSED_BITS_PER_PIXEL = "CompressedBitsPerPixel";
  public static final String TAG_COMPRESSION = "Compression";
  public static final String TAG_CONTRAST = "Contrast";
  public static final String TAG_COPYRIGHT = "Copyright";
  public static final String TAG_CUSTOM_RENDERED = "CustomRendered";
  public static final String TAG_DATETIME = "DateTime";
  public static final String TAG_DATETIME_DIGITIZED = "DateTimeDigitized";
  public static final String TAG_DATETIME_ORIGINAL = "DateTimeOriginal";
  public static final String TAG_DEFAULT_CROP_SIZE = "DefaultCropSize";
  public static final String TAG_DEVICE_SETTING_DESCRIPTION = "DeviceSettingDescription";
  public static final String TAG_DIGITAL_ZOOM_RATIO = "DigitalZoomRatio";
  public static final String TAG_DNG_VERSION = "DNGVersion";
  private static final String TAG_EXIF_IFD_POINTER = "ExifIFDPointer";
  public static final String TAG_EXIF_VERSION = "ExifVersion";
  public static final String TAG_EXPOSURE_BIAS_VALUE = "ExposureBiasValue";
  public static final String TAG_EXPOSURE_INDEX = "ExposureIndex";
  public static final String TAG_EXPOSURE_MODE = "ExposureMode";
  public static final String TAG_EXPOSURE_PROGRAM = "ExposureProgram";
  public static final String TAG_EXPOSURE_TIME = "ExposureTime";
  public static final String TAG_FILE_SOURCE = "FileSource";
  public static final String TAG_FLASH = "Flash";
  public static final String TAG_FLASHPIX_VERSION = "FlashpixVersion";
  public static final String TAG_FLASH_ENERGY = "FlashEnergy";
  public static final String TAG_FOCAL_LENGTH = "FocalLength";
  public static final String TAG_FOCAL_LENGTH_IN_35MM_FILM = "FocalLengthIn35mmFilm";
  public static final String TAG_FOCAL_PLANE_RESOLUTION_UNIT = "FocalPlaneResolutionUnit";
  public static final String TAG_FOCAL_PLANE_X_RESOLUTION = "FocalPlaneXResolution";
  public static final String TAG_FOCAL_PLANE_Y_RESOLUTION = "FocalPlaneYResolution";
  public static final String TAG_F_NUMBER = "FNumber";
  public static final String TAG_GAIN_CONTROL = "GainControl";
  public static final String TAG_GAMMA = "Gamma";
  public static final String TAG_GPS_ALTITUDE = "GPSAltitude";
  public static final String TAG_GPS_ALTITUDE_REF = "GPSAltitudeRef";
  public static final String TAG_GPS_AREA_INFORMATION = "GPSAreaInformation";
  public static final String TAG_GPS_DATESTAMP = "GPSDateStamp";
  public static final String TAG_GPS_DEST_BEARING = "GPSDestBearing";
  public static final String TAG_GPS_DEST_BEARING_REF = "GPSDestBearingRef";
  public static final String TAG_GPS_DEST_DISTANCE = "GPSDestDistance";
  public static final String TAG_GPS_DEST_DISTANCE_REF = "GPSDestDistanceRef";
  public static final String TAG_GPS_DEST_LATITUDE = "GPSDestLatitude";
  public static final String TAG_GPS_DEST_LATITUDE_REF = "GPSDestLatitudeRef";
  public static final String TAG_GPS_DEST_LONGITUDE = "GPSDestLongitude";
  public static final String TAG_GPS_DEST_LONGITUDE_REF = "GPSDestLongitudeRef";
  public static final String TAG_GPS_DIFFERENTIAL = "GPSDifferential";
  public static final String TAG_GPS_DOP = "GPSDOP";
  public static final String TAG_GPS_H_POSITIONING_ERROR = "GPSHPositioningError";
  public static final String TAG_GPS_IMG_DIRECTION = "GPSImgDirection";
  public static final String TAG_GPS_IMG_DIRECTION_REF = "GPSImgDirectionRef";
  private static final String TAG_GPS_INFO_IFD_POINTER = "GPSInfoIFDPointer";
  public static final String TAG_GPS_LATITUDE = "GPSLatitude";
  public static final String TAG_GPS_LATITUDE_REF = "GPSLatitudeRef";
  public static final String TAG_GPS_LONGITUDE = "GPSLongitude";
  public static final String TAG_GPS_LONGITUDE_REF = "GPSLongitudeRef";
  public static final String TAG_GPS_MAP_DATUM = "GPSMapDatum";
  public static final String TAG_GPS_MEASURE_MODE = "GPSMeasureMode";
  public static final String TAG_GPS_PROCESSING_METHOD = "GPSProcessingMethod";
  public static final String TAG_GPS_SATELLITES = "GPSSatellites";
  public static final String TAG_GPS_SPEED = "GPSSpeed";
  public static final String TAG_GPS_SPEED_REF = "GPSSpeedRef";
  public static final String TAG_GPS_STATUS = "GPSStatus";
  public static final String TAG_GPS_TIMESTAMP = "GPSTimeStamp";
  public static final String TAG_GPS_TRACK = "GPSTrack";
  public static final String TAG_GPS_TRACK_REF = "GPSTrackRef";
  public static final String TAG_GPS_VERSION_ID = "GPSVersionID";
  private static final String TAG_HAS_THUMBNAIL = "HasThumbnail";
  public static final String TAG_IMAGE_DESCRIPTION = "ImageDescription";
  public static final String TAG_IMAGE_LENGTH = "ImageLength";
  public static final String TAG_IMAGE_UNIQUE_ID = "ImageUniqueID";
  public static final String TAG_IMAGE_WIDTH = "ImageWidth";
  private static final String TAG_INTEROPERABILITY_IFD_POINTER = "InteroperabilityIFDPointer";
  public static final String TAG_INTEROPERABILITY_INDEX = "InteroperabilityIndex";
  public static final String TAG_ISO_SPEED = "ISOSpeed";
  public static final String TAG_ISO_SPEED_LATITUDE_YYY = "ISOSpeedLatitudeyyy";
  public static final String TAG_ISO_SPEED_LATITUDE_ZZZ = "ISOSpeedLatitudezzz";

  @Deprecated
  public static final String TAG_ISO_SPEED_RATINGS = "ISOSpeedRatings";
  public static final String TAG_JPEG_INTERCHANGE_FORMAT = "JPEGInterchangeFormat";
  public static final String TAG_JPEG_INTERCHANGE_FORMAT_LENGTH = "JPEGInterchangeFormatLength";
  public static final String TAG_LENS_MAKE = "LensMake";
  public static final String TAG_LENS_MODEL = "LensModel";
  public static final String TAG_LENS_SERIAL_NUMBER = "LensSerialNumber";
  public static final String TAG_LENS_SPECIFICATION = "LensSpecification";
  public static final String TAG_LIGHT_SOURCE = "LightSource";
  public static final String TAG_MAKE = "Make";
  public static final String TAG_MAKER_NOTE = "MakerNote";
  public static final String TAG_MAX_APERTURE_VALUE = "MaxApertureValue";
  public static final String TAG_METERING_MODE = "MeteringMode";
  public static final String TAG_MODEL = "Model";
  public static final String TAG_NEW_SUBFILE_TYPE = "NewSubfileType";
  public static final String TAG_OECF = "OECF";
  public static final String TAG_ORF_ASPECT_FRAME = "AspectFrame";
  private static final String TAG_ORF_CAMERA_SETTINGS_IFD_POINTER = "CameraSettingsIFDPointer";
  private static final String TAG_ORF_IMAGE_PROCESSING_IFD_POINTER = "ImageProcessingIFDPointer";
  public static final String TAG_ORF_PREVIEW_IMAGE_LENGTH = "PreviewImageLength";
  public static final String TAG_ORF_PREVIEW_IMAGE_START = "PreviewImageStart";
  public static final String TAG_ORF_THUMBNAIL_IMAGE = "ThumbnailImage";
  public static final String TAG_ORIENTATION = "Orientation";
  public static final String TAG_PHOTOGRAPHIC_SENSITIVITY = "PhotographicSensitivity";
  public static final String TAG_PHOTOMETRIC_INTERPRETATION = "PhotometricInterpretation";
  public static final String TAG_PIXEL_X_DIMENSION = "PixelXDimension";
  public static final String TAG_PIXEL_Y_DIMENSION = "PixelYDimension";
  public static final String TAG_PLANAR_CONFIGURATION = "PlanarConfiguration";
  public static final String TAG_PRIMARY_CHROMATICITIES = "PrimaryChromaticities";
  private static final d TAG_RAF_IMAGE_SIZE;
  public static final String TAG_RECOMMENDED_EXPOSURE_INDEX = "RecommendedExposureIndex";
  public static final String TAG_REFERENCE_BLACK_WHITE = "ReferenceBlackWhite";
  public static final String TAG_RELATED_SOUND_FILE = "RelatedSoundFile";
  public static final String TAG_RESOLUTION_UNIT = "ResolutionUnit";
  public static final String TAG_ROWS_PER_STRIP = "RowsPerStrip";
  public static final String TAG_RW2_ISO = "ISO";
  public static final String TAG_RW2_JPG_FROM_RAW = "JpgFromRaw";
  public static final String TAG_RW2_SENSOR_BOTTOM_BORDER = "SensorBottomBorder";
  public static final String TAG_RW2_SENSOR_LEFT_BORDER = "SensorLeftBorder";
  public static final String TAG_RW2_SENSOR_RIGHT_BORDER = "SensorRightBorder";
  public static final String TAG_RW2_SENSOR_TOP_BORDER = "SensorTopBorder";
  public static final String TAG_SAMPLES_PER_PIXEL = "SamplesPerPixel";
  public static final String TAG_SATURATION = "Saturation";
  public static final String TAG_SCENE_CAPTURE_TYPE = "SceneCaptureType";
  public static final String TAG_SCENE_TYPE = "SceneType";
  public static final String TAG_SENSING_METHOD = "SensingMethod";
  public static final String TAG_SENSITIVITY_TYPE = "SensitivityType";
  public static final String TAG_SHARPNESS = "Sharpness";
  public static final String TAG_SHUTTER_SPEED_VALUE = "ShutterSpeedValue";
  public static final String TAG_SOFTWARE = "Software";
  public static final String TAG_SPATIAL_FREQUENCY_RESPONSE = "SpatialFrequencyResponse";
  public static final String TAG_SPECTRAL_SENSITIVITY = "SpectralSensitivity";
  public static final String TAG_STANDARD_OUTPUT_SENSITIVITY = "StandardOutputSensitivity";
  public static final String TAG_STRIP_BYTE_COUNTS = "StripByteCounts";
  public static final String TAG_STRIP_OFFSETS = "StripOffsets";
  public static final String TAG_SUBFILE_TYPE = "SubfileType";
  public static final String TAG_SUBJECT_AREA = "SubjectArea";
  public static final String TAG_SUBJECT_DISTANCE = "SubjectDistance";
  public static final String TAG_SUBJECT_DISTANCE_RANGE = "SubjectDistanceRange";
  public static final String TAG_SUBJECT_LOCATION = "SubjectLocation";
  public static final String TAG_SUBSEC_TIME = "SubSecTime";
  public static final String TAG_SUBSEC_TIME_DIGITIZED = "SubSecTimeDigitized";
  public static final String TAG_SUBSEC_TIME_ORIGINAL = "SubSecTimeOriginal";
  private static final String TAG_SUB_IFD_POINTER = "SubIFDPointer";
  private static final String TAG_THUMBNAIL_DATA = "ThumbnailData";
  public static final String TAG_THUMBNAIL_IMAGE_LENGTH = "ThumbnailImageLength";
  public static final String TAG_THUMBNAIL_IMAGE_WIDTH = "ThumbnailImageWidth";
  private static final String TAG_THUMBNAIL_LENGTH = "ThumbnailLength";
  private static final String TAG_THUMBNAIL_OFFSET = "ThumbnailOffset";
  public static final String TAG_TRANSFER_FUNCTION = "TransferFunction";
  public static final String TAG_USER_COMMENT = "UserComment";
  public static final String TAG_WHITE_BALANCE = "WhiteBalance";
  public static final String TAG_WHITE_POINT = "WhitePoint";
  public static final String TAG_X_RESOLUTION = "XResolution";
  public static final String TAG_Y_CB_CR_COEFFICIENTS = "YCbCrCoefficients";
  public static final String TAG_Y_CB_CR_POSITIONING = "YCbCrPositioning";
  public static final String TAG_Y_CB_CR_SUB_SAMPLING = "YCbCrSubSampling";
  public static final String TAG_Y_RESOLUTION = "YResolution";
  private static final List<Integer> vR = Arrays.asList(new Integer[] { Integer.valueOf(1), Integer.valueOf(6), Integer.valueOf(3), Integer.valueOf(8) });
  private static final List<Integer> vS = Arrays.asList(new Integer[] { Integer.valueOf(2), Integer.valueOf(7), Integer.valueOf(4), Integer.valueOf(5) });
  public static final int[] vT = { 8, 8, 8 };
  public static final int[] vU = { 4 };
  public static final int[] vV = { 8 };
  static final byte[] vW = { -1, -40, -1 };
  private static final byte[] vX = { 79, 76, 89, 77, 80, 0 };
  private static final byte[] vY = { 79, 76, 89, 77, 80, 85, 83, 0, 73, 73 };
  private static SimpleDateFormat vZ;
  private static final Pattern wL = Pattern.compile(".*[1-9].*");
  private static final Pattern wM = Pattern.compile("^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$");
  static final String[] wa = { "", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE" };
  static final int[] wb = { 0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1 };
  private static final byte[] wc = { 65, 83, 67, 73, 73, 0, 0, 0 };
  private static final d[] wd = { new d("NewSubfileType", 254, 4, 0), new d("SubfileType", 255, 4, 0), new d("ImageWidth", 256, 0), new d("ImageLength", 257, 0), new d("BitsPerSample", 258, 3, 0), new d("Compression", 259, 3, 0), new d("PhotometricInterpretation", 262, 3, 0), new d("ImageDescription", 270, 2, 0), new d("Make", 271, 2, 0), new d("Model", 272, 2, 0), new d("StripOffsets", 273, 0), new d("Orientation", 274, 3, 0), new d("SamplesPerPixel", 277, 3, 0), new d("RowsPerStrip", 278, 0), new d("StripByteCounts", 279, 0), new d("XResolution", 282, 5, 0), new d("YResolution", 283, 5, 0), new d("PlanarConfiguration", 284, 3, 0), new d("ResolutionUnit", 296, 3, 0), new d("TransferFunction", 301, 3, 0), new d("Software", 305, 2, 0), new d("DateTime", 306, 2, 0), new d("Artist", 315, 2, 0), new d("WhitePoint", 318, 5, 0), new d("PrimaryChromaticities", 319, 5, 0), new d("SubIFDPointer", 330, 4, 0), new d("JPEGInterchangeFormat", 513, 4, 0), new d("JPEGInterchangeFormatLength", 514, 4, 0), new d("YCbCrCoefficients", 529, 5, 0), new d("YCbCrSubSampling", 530, 3, 0), new d("YCbCrPositioning", 531, 3, 0), new d("ReferenceBlackWhite", 532, 5, 0), new d("Copyright", 33432, 2, 0), new d("ExifIFDPointer", 34665, 4, 0), new d("GPSInfoIFDPointer", 34853, 4, 0), new d("SensorTopBorder", 4, 4, 0), new d("SensorLeftBorder", 5, 4, 0), new d("SensorBottomBorder", 6, 4, 0), new d("SensorRightBorder", 7, 4, 0), new d("ISO", 23, 3, 0), new d("JpgFromRaw", 46, 7, 0) };
  private static final d[] we = { new d("ExposureTime", 33434, 5, 0), new d("FNumber", 33437, 5, 0), new d("ExposureProgram", 34850, 3, 0), new d("SpectralSensitivity", 34852, 2, 0), new d("PhotographicSensitivity", 34855, 3, 0), new d("OECF", 34856, 7, 0), new d("ExifVersion", 36864, 2, 0), new d("DateTimeOriginal", 36867, 2, 0), new d("DateTimeDigitized", 36868, 2, 0), new d("ComponentsConfiguration", 37121, 7, 0), new d("CompressedBitsPerPixel", 37122, 5, 0), new d("ShutterSpeedValue", 37377, 10, 0), new d("ApertureValue", 37378, 5, 0), new d("BrightnessValue", 37379, 10, 0), new d("ExposureBiasValue", 37380, 10, 0), new d("MaxApertureValue", 37381, 5, 0), new d("SubjectDistance", 37382, 5, 0), new d("MeteringMode", 37383, 3, 0), new d("LightSource", 37384, 3, 0), new d("Flash", 37385, 3, 0), new d("FocalLength", 37386, 5, 0), new d("SubjectArea", 37396, 3, 0), new d("MakerNote", 37500, 7, 0), new d("UserComment", 37510, 7, 0), new d("SubSecTime", 37520, 2, 0), new d("SubSecTimeOriginal", 37521, 2, 0), new d("SubSecTimeDigitized", 37522, 2, 0), new d("FlashpixVersion", 40960, 7, 0), new d("ColorSpace", 40961, 3, 0), new d("PixelXDimension", 40962, 0), new d("PixelYDimension", 40963, 0), new d("RelatedSoundFile", 40964, 2, 0), new d("InteroperabilityIFDPointer", 40965, 4, 0), new d("FlashEnergy", 41483, 5, 0), new d("SpatialFrequencyResponse", 41484, 7, 0), new d("FocalPlaneXResolution", 41486, 5, 0), new d("FocalPlaneYResolution", 41487, 5, 0), new d("FocalPlaneResolutionUnit", 41488, 3, 0), new d("SubjectLocation", 41492, 3, 0), new d("ExposureIndex", 41493, 5, 0), new d("SensingMethod", 41495, 3, 0), new d("FileSource", 41728, 7, 0), new d("SceneType", 41729, 7, 0), new d("CFAPattern", 41730, 7, 0), new d("CustomRendered", 41985, 3, 0), new d("ExposureMode", 41986, 3, 0), new d("WhiteBalance", 41987, 3, 0), new d("DigitalZoomRatio", 41988, 5, 0), new d("FocalLengthIn35mmFilm", 41989, 3, 0), new d("SceneCaptureType", 41990, 3, 0), new d("GainControl", 41991, 3, 0), new d("Contrast", 41992, 3, 0), new d("Saturation", 41993, 3, 0), new d("Sharpness", 41994, 3, 0), new d("DeviceSettingDescription", 41995, 7, 0), new d("SubjectDistanceRange", 41996, 3, 0), new d("ImageUniqueID", 42016, 2, 0), new d("DNGVersion", 50706, 1, 0), new d("DefaultCropSize", 50720, 0) };
  private static final d[] wf = { new d("GPSVersionID", 0, 1, 0), new d("GPSLatitudeRef", 1, 2, 0), new d("GPSLatitude", 2, 5, 0), new d("GPSLongitudeRef", 3, 2, 0), new d("GPSLongitude", 4, 5, 0), new d("GPSAltitudeRef", 5, 1, 0), new d("GPSAltitude", 6, 5, 0), new d("GPSTimeStamp", 7, 5, 0), new d("GPSSatellites", 8, 2, 0), new d("GPSStatus", 9, 2, 0), new d("GPSMeasureMode", 10, 2, 0), new d("GPSDOP", 11, 5, 0), new d("GPSSpeedRef", 12, 2, 0), new d("GPSSpeed", 13, 5, 0), new d("GPSTrackRef", 14, 2, 0), new d("GPSTrack", 15, 5, 0), new d("GPSImgDirectionRef", 16, 2, 0), new d("GPSImgDirection", 17, 5, 0), new d("GPSMapDatum", 18, 2, 0), new d("GPSDestLatitudeRef", 19, 2, 0), new d("GPSDestLatitude", 20, 5, 0), new d("GPSDestLongitudeRef", 21, 2, 0), new d("GPSDestLongitude", 22, 5, 0), new d("GPSDestBearingRef", 23, 2, 0), new d("GPSDestBearing", 24, 5, 0), new d("GPSDestDistanceRef", 25, 2, 0), new d("GPSDestDistance", 26, 5, 0), new d("GPSProcessingMethod", 27, 7, 0), new d("GPSAreaInformation", 28, 7, 0), new d("GPSDateStamp", 29, 2, 0), new d("GPSDifferential", 30, 3, 0) };
  private static final d[] wg = { new d("InteroperabilityIndex", 1, 2, 0) };
  private static final d[] wh = { new d("NewSubfileType", 254, 4, 0), new d("SubfileType", 255, 4, 0), new d("ThumbnailImageWidth", 256, 0), new d("ThumbnailImageLength", 257, 0), new d("BitsPerSample", 258, 3, 0), new d("Compression", 259, 3, 0), new d("PhotometricInterpretation", 262, 3, 0), new d("ImageDescription", 270, 2, 0), new d("Make", 271, 2, 0), new d("Model", 272, 2, 0), new d("StripOffsets", 273, 0), new d("Orientation", 274, 3, 0), new d("SamplesPerPixel", 277, 3, 0), new d("RowsPerStrip", 278, 0), new d("StripByteCounts", 279, 0), new d("XResolution", 282, 5, 0), new d("YResolution", 283, 5, 0), new d("PlanarConfiguration", 284, 3, 0), new d("ResolutionUnit", 296, 3, 0), new d("TransferFunction", 301, 3, 0), new d("Software", 305, 2, 0), new d("DateTime", 306, 2, 0), new d("Artist", 315, 2, 0), new d("WhitePoint", 318, 5, 0), new d("PrimaryChromaticities", 319, 5, 0), new d("SubIFDPointer", 330, 4, 0), new d("JPEGInterchangeFormat", 513, 4, 0), new d("JPEGInterchangeFormatLength", 514, 4, 0), new d("YCbCrCoefficients", 529, 5, 0), new d("YCbCrSubSampling", 530, 3, 0), new d("YCbCrPositioning", 531, 3, 0), new d("ReferenceBlackWhite", 532, 5, 0), new d("Copyright", 33432, 2, 0), new d("ExifIFDPointer", 34665, 4, 0), new d("GPSInfoIFDPointer", 34853, 4, 0), new d("DNGVersion", 50706, 1, 0), new d("DefaultCropSize", 50720, 0) };
  private static final d[] wi;
  private static final d[] wj;
  private static final d[] wk;
  private static final d[] wl;
  static final d[][] wm;
  private static final d[] wn;
  private static final d wo;
  private static final d wp;
  private static final HashMap<Integer, d>[] wq;
  private static final HashMap<String, d>[] wr;
  private static final HashSet<String> ws;
  private static final HashMap<Integer, Integer> wt;
  private static final Charset wu;
  static final byte[] wv;
  private final String mFilename;
  private boolean wA;
  private int wB;
  private int wC;
  private byte[] wD;
  private int wE;
  private int wF;
  private int wG;
  private int wH;
  private int wI;
  private int wJ;
  private boolean wK;
  private final AssetManager.AssetInputStream ww;
  private int wx;
  private final HashMap<String, c>[] wy = new HashMap[wm.length];
  private ByteOrder wz = ByteOrder.BIG_ENDIAN;

  static
  {
    TAG_RAF_IMAGE_SIZE = new d("StripOffsets", 273, 3, (byte)0);
    wi = new d[] { new d("ThumbnailImage", 256, 7, 0), new d("CameraSettingsIFDPointer", 8224, 4, 0), new d("ImageProcessingIFDPointer", 8256, 4, 0) };
    wj = new d[] { new d("PreviewImageStart", 257, 4, 0), new d("PreviewImageLength", 258, 4, 0) };
    wk = new d[] { new d("AspectFrame", 4371, 3, 0) };
    wl = new d[] { new d("ColorSpace", 55, 3, 0) };
    wm = new d[][] { wd, we, wf, wg, wh, wd, wi, wj, wk, wl };
    wn = new d[] { new d("SubIFDPointer", 330, 4, 0), new d("ExifIFDPointer", 34665, 4, 0), new d("GPSInfoIFDPointer", 34853, 4, 0), new d("InteroperabilityIFDPointer", 40965, 4, 0), new d("CameraSettingsIFDPointer", 8224, 1, 0), new d("ImageProcessingIFDPointer", 8256, 1, 0) };
    wo = new d("JPEGInterchangeFormat", 513, 4, (byte)0);
    wp = new d("JPEGInterchangeFormatLength", 514, 4, (byte)0);
    wq = new HashMap[wm.length];
    wr = new HashMap[wm.length];
    ws = new HashSet(Arrays.asList(new String[] { "FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp" }));
    wt = new HashMap();
    wu = Charset.forName("US-ASCII");
    wv = "".getBytes(wu);
    SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
    vZ = localSimpleDateFormat;
    localSimpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    for (int i = 0; i < wm.length; i++)
    {
      wq[i] = new HashMap();
      wr[i] = new HashMap();
      for (localSimpleDateFormat : wm[i])
      {
        wq[i].put(Integer.valueOf(localSimpleDateFormat.number), localSimpleDateFormat);
        wr[i].put(localSimpleDateFormat.name, localSimpleDateFormat);
      }
    }
    wt.put(Integer.valueOf(wn[0].number), Integer.valueOf(5));
    wt.put(Integer.valueOf(wn[1].number), Integer.valueOf(1));
    wt.put(Integer.valueOf(wn[2].number), Integer.valueOf(2));
    wt.put(Integer.valueOf(wn[3].number), Integer.valueOf(3));
    wt.put(Integer.valueOf(wn[4].number), Integer.valueOf(7));
    wt.put(Integer.valueOf(wn[5].number), Integer.valueOf(8));
  }

  public a(InputStream paramInputStream)
  {
    if (paramInputStream == null)
      throw new IllegalArgumentException("inputStream cannot be null");
    this.mFilename = null;
    if ((paramInputStream instanceof AssetManager.AssetInputStream));
    for (this.ww = ((AssetManager.AssetInputStream)paramInputStream); ; this.ww = null)
    {
      b(paramInputStream);
      return;
    }
  }

  // ERROR //
  public a(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 829	java/lang/Object:<init>	()V
    //   4: aload_0
    //   5: getstatic 740	android/support/d/a:wm	[[Landroid/support/d/a$d;
    //   8: arraylength
    //   9: anewarray 748	java/util/HashMap
    //   12: putfield 831	android/support/d/a:wy	[Ljava/util/HashMap;
    //   15: aload_0
    //   16: getstatic 836	java/nio/ByteOrder:BIG_ENDIAN	Ljava/nio/ByteOrder;
    //   19: putfield 838	android/support/d/a:wz	Ljava/nio/ByteOrder;
    //   22: aload_1
    //   23: ifnonnull +14 -> 37
    //   26: new 840	java/lang/IllegalArgumentException
    //   29: dup
    //   30: ldc_w 853
    //   33: invokespecial 843	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   36: athrow
    //   37: aload_0
    //   38: aconst_null
    //   39: putfield 849	android/support/d/a:ww	Landroid/content/res/AssetManager$AssetInputStream;
    //   42: aload_0
    //   43: aload_1
    //   44: putfield 845	android/support/d/a:mFilename	Ljava/lang/String;
    //   47: new 855	java/io/FileInputStream
    //   50: astore_2
    //   51: aload_2
    //   52: aload_1
    //   53: invokespecial 856	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   56: aload_0
    //   57: aload_2
    //   58: invokespecial 851	android/support/d/a:b	(Ljava/io/InputStream;)V
    //   61: aload_2
    //   62: invokestatic 860	android/support/d/a:closeQuietly	(Ljava/io/Closeable;)V
    //   65: return
    //   66: astore_1
    //   67: aconst_null
    //   68: astore_2
    //   69: aload_2
    //   70: invokestatic 860	android/support/d/a:closeQuietly	(Ljava/io/Closeable;)V
    //   73: aload_1
    //   74: athrow
    //   75: astore_1
    //   76: goto -7 -> 69
    //
    // Exception table:
    //   from	to	target	type
    //   47	56	66	finally
    //   56	61	75	finally
  }

  private c C(String paramString)
  {
    String str = paramString;
    if ("ISOSpeedRatings".equals(paramString))
      str = "PhotographicSensitivity";
    int i = 0;
    if (i < wm.length)
    {
      paramString = (c)this.wy[i].get(str);
      if (paramString == null);
    }
    while (true)
    {
      return paramString;
      i++;
      break;
      paramString = null;
    }
  }

  private static Pair<Integer, Integer> D(String paramString)
  {
    int i;
    Object localObject;
    if (paramString.contains(","))
    {
      String[] arrayOfString = paramString.split(",");
      paramString = D(arrayOfString[0]);
      if (((Integer)paramString.first).intValue() == 2);
      do
      {
        return paramString;
        i = 1;
        localObject = paramString;
        paramString = (String)localObject;
      }
      while (i >= arrayOfString.length);
      paramString = D(arrayOfString[i]);
      if ((!((Integer)paramString.first).equals(((Pair)localObject).first)) && (!((Integer)paramString.second).equals(((Pair)localObject).first)))
        break label565;
    }
    label407: label554: label565: for (int j = ((Integer)((Pair)localObject).first).intValue(); ; j = -1)
    {
      if ((((Integer)((Pair)localObject).second).intValue() != -1) && ((((Integer)paramString.first).equals(((Pair)localObject).second)) || (((Integer)paramString.second).equals(((Pair)localObject).second))));
      for (int k = ((Integer)((Pair)localObject).second).intValue(); ; k = -1)
      {
        if ((j == -1) && (k == -1))
        {
          paramString = new Pair(Integer.valueOf(2), Integer.valueOf(-1));
          break;
        }
        if (j == -1)
          paramString = new Pair(Integer.valueOf(k), Integer.valueOf(-1));
        while (true)
        {
          while (true)
          {
            long l1;
            long l2;
            while (true)
            {
              i++;
              localObject = paramString;
              break;
              if (k != -1)
                break label554;
              paramString = new Pair(Integer.valueOf(j), Integer.valueOf(-1));
              continue;
              if (!paramString.contains("/"))
                break label407;
              paramString = paramString.split("/");
              if (paramString.length == 2)
                try
                {
                  l1 = ()Double.parseDouble(paramString[0]);
                  l2 = ()Double.parseDouble(paramString[1]);
                  if ((l1 >= 0L) && (l2 >= 0L))
                    break label350;
                  paramString = new android/util/Pair;
                  paramString.<init>(Integer.valueOf(10), Integer.valueOf(-1));
                }
                catch (NumberFormatException paramString)
                {
                }
            }
            paramString = new Pair(Integer.valueOf(2), Integer.valueOf(-1));
            break;
            label350: if ((l1 > 2147483647L) || (l2 > 2147483647L))
            {
              paramString = new Pair(Integer.valueOf(5), Integer.valueOf(-1));
              break;
            }
            paramString = new Pair(Integer.valueOf(10), Integer.valueOf(5));
            break;
            try
            {
              localObject = Long.valueOf(Long.parseLong(paramString));
              if ((((Long)localObject).longValue() < 0L) || (((Long)localObject).longValue() > 65535L))
                break label502;
              localObject = new android/util/Pair;
              ((Pair)localObject).<init>(Integer.valueOf(3), Integer.valueOf(4));
              paramString = (String)localObject;
            }
            catch (NumberFormatException localNumberFormatException)
            {
              try
              {
                Double.parseDouble(paramString);
                paramString = new android/util/Pair;
                paramString.<init>(Integer.valueOf(12), Integer.valueOf(-1));
              }
              catch (NumberFormatException paramString)
              {
                paramString = new Pair(Integer.valueOf(2), Integer.valueOf(-1));
              }
            }
          }
          break;
          label502: if (localNumberFormatException.longValue() < 0L)
          {
            localPair = new Pair(Integer.valueOf(9), Integer.valueOf(-1));
            paramString = localPair;
            break;
          }
          Pair localPair = new Pair(Integer.valueOf(4), Integer.valueOf(-1));
          paramString = localPair;
          break;
          paramString = localPair;
        }
      }
    }
  }

  private int a(b paramb)
  {
    int[] arrayOfInt = new int[wm.length];
    Object localObject1 = new int[wm.length];
    Object localObject2 = wn;
    int i = localObject2.length;
    for (int j = 0; j < i; j++)
      removeAttribute(localObject2[j].name);
    removeAttribute(wo.name);
    removeAttribute(wp.name);
    int k;
    for (j = 0; j < wm.length; j++)
    {
      Object[] arrayOfObject = this.wy[j].entrySet().toArray();
      k = arrayOfObject.length;
      for (i = 0; i < k; i++)
      {
        localObject2 = (Map.Entry)arrayOfObject[i];
        if (((Map.Entry)localObject2).getValue() == null)
          this.wy[j].remove(((Map.Entry)localObject2).getKey());
      }
    }
    if (!this.wy[1].isEmpty())
      this.wy[0].put(wn[1].name, c.a(0L, this.wz));
    if (!this.wy[2].isEmpty())
      this.wy[0].put(wn[2].name, c.a(0L, this.wz));
    if (!this.wy[3].isEmpty())
      this.wy[1].put(wn[3].name, c.a(0L, this.wz));
    if (this.wA)
    {
      this.wy[4].put(wo.name, c.a(0L, this.wz));
      this.wy[4].put(wp.name, c.a(this.wC, this.wz));
    }
    i = 0;
    if (i < wm.length)
    {
      localObject2 = this.wy[i].entrySet().iterator();
      j = 0;
      label371: if (((Iterator)localObject2).hasNext())
      {
        k = ((c)((Map.Entry)((Iterator)localObject2).next()).getValue()).size();
        if (k <= 4)
          break label1139;
        j = k + j;
      }
    }
    label1002: label1139: 
    while (true)
    {
      break label371;
      localObject1[i] += j;
      i++;
      break;
      j = 8;
      i = 0;
      while (i < wm.length)
      {
        k = j;
        if (!this.wy[i].isEmpty())
        {
          arrayOfInt[i] = j;
          k = j + (this.wy[i].size() * 12 + 2 + 4 + localObject1[i]);
        }
        i++;
        j = k;
      }
      i = j;
      if (this.wA)
      {
        this.wy[4].put(wo.name, c.a(j, this.wz));
        this.wB = (j + 6);
        i = j + this.wC;
      }
      int m = i + 8;
      if (!this.wy[1].isEmpty())
        this.wy[0].put(wn[1].name, c.a(arrayOfInt[1], this.wz));
      if (!this.wy[2].isEmpty())
        this.wy[0].put(wn[2].name, c.a(arrayOfInt[2], this.wz));
      if (!this.wy[3].isEmpty())
        this.wy[1].put(wn[3].name, c.a(arrayOfInt[3], this.wz));
      paramb.writeShort((short)m);
      paramb.write(wv);
      int n;
      if (this.wz == ByteOrder.BIG_ENDIAN)
      {
        j = 19789;
        n = j;
        paramb.writeShort(n);
        paramb.wO = this.wz;
        paramb.writeShort((short)42);
        paramb.writeInt(8);
      }
      for (j = 0; ; j++)
      {
        if (j >= wm.length)
          break label1114;
        if (!this.wy[j].isEmpty())
        {
          paramb.writeShort((short)this.wy[j].size());
          i = arrayOfInt[j];
          k = this.wy[j].size();
          localObject1 = this.wy[j].entrySet().iterator();
          i = i + 2 + k * 12 + 4;
          while (true)
          {
            if (!((Iterator)localObject1).hasNext())
              break label1002;
            localObject2 = (Map.Entry)((Iterator)localObject1).next();
            int i1 = ((d)wr[j].get(((Map.Entry)localObject2).getKey())).number;
            localObject2 = (c)((Map.Entry)localObject2).getValue();
            k = ((c)localObject2).size();
            paramb.writeShort((short)i1);
            paramb.writeShort((short)((c)localObject2).format);
            paramb.writeInt(((c)localObject2).wQ);
            if (k > 4)
            {
              paramb.writeInt((int)i);
              i += k;
              continue;
              j = 18761;
              n = j;
              break;
            }
            paramb.write(((c)localObject2).wR);
            if (k < 4)
              while (k < 4)
              {
                paramb.writeByte(0);
                k++;
              }
          }
          if ((j == 0) && (!this.wy[4].isEmpty()))
            paramb.writeInt((int)arrayOfInt[4]);
          while (true)
          {
            localObject2 = this.wy[j].entrySet().iterator();
            while (((Iterator)localObject2).hasNext())
            {
              localObject1 = (c)((Map.Entry)((Iterator)localObject2).next()).getValue();
              if (((c)localObject1).wR.length > 4)
                paramb.write(((c)localObject1).wR, 0, ((c)localObject1).wR.length);
            }
            paramb.writeInt(0);
          }
        }
      }
      if (this.wA)
        paramb.write(getThumbnailBytes());
      paramb.wO = ByteOrder.BIG_ENDIAN;
      return m;
    }
  }

  private void a(a parama)
  {
    a(parama, parama.available());
    b(parama, 0);
    d(parama, 0);
    d(parama, 5);
    d(parama, 4);
    cJ();
    if (this.wx == 8)
    {
      parama = (c)this.wy[1].get("MakerNote");
      if (parama != null)
      {
        parama = new a(parama.wR);
        parama.wO = this.wz;
        parama.seek(6L);
        b(parama, 9);
        parama = (c)this.wy[9].get("ColorSpace");
        if (parama != null)
          this.wy[1].put("ColorSpace", parama);
      }
    }
  }

  private void a(a parama, int paramInt)
  {
    this.wz = c(parama);
    parama.wO = this.wz;
    int i = parama.readUnsignedShort();
    if ((this.wx != 7) && (this.wx != 10) && (i != 42))
      throw new IOException("Invalid start code: " + Integer.toHexString(i));
    i = parama.readInt();
    if ((i < 8) || (i >= paramInt))
      throw new IOException("Invalid first Ifd offset: ".concat(String.valueOf(i)));
    paramInt = i - 8;
    if ((paramInt > 0) && (parama.skipBytes(paramInt) != paramInt))
      throw new IOException("Couldn't jump to first Ifd: ".concat(String.valueOf(paramInt)));
  }

  private void a(a parama, int paramInt1, int paramInt2)
  {
    parama.wO = ByteOrder.BIG_ENDIAN;
    parama.seek(paramInt1);
    int i = parama.readByte();
    if (i != -1)
      throw new IOException("Invalid marker: " + Integer.toHexString(i & 0xFF));
    if (parama.readByte() != -40)
      throw new IOException("Invalid marker: " + Integer.toHexString(i & 0xFF));
    paramInt1 = paramInt1 + 1 + 1;
    i = parama.readByte();
    if (i != -1)
      throw new IOException("Invalid marker:" + Integer.toHexString(i & 0xFF));
    i = parama.readByte();
    int j;
    int k;
    if ((i != -39) && (i != -38))
    {
      j = parama.readUnsignedShort() - 2;
      k = paramInt1 + 1 + 1 + 2;
      if (j < 0)
        throw new IOException("Invalid length");
      switch (i)
      {
      default:
        i = k;
        paramInt1 = j;
      case -31:
      case -2:
      case -64:
      case -63:
      case -62:
      case -61:
      case -59:
      case -58:
      case -57:
      case -55:
      case -54:
      case -53:
      case -51:
      case -50:
      case -49:
      }
    }
    while (true)
      if (paramInt1 < 0)
      {
        throw new IOException("Invalid length");
        paramInt1 = j;
        i = k;
        if (j >= 6)
        {
          Object localObject = new byte[6];
          if (parama.read((byte[])localObject) != 6)
            throw new IOException("Invalid exif");
          k += 6;
          j -= 6;
          paramInt1 = j;
          i = k;
          if (Arrays.equals((byte[])localObject, wv))
          {
            if (j <= 0)
              throw new IOException("Invalid exif");
            this.wF = k;
            byte[] arrayOfByte = new byte[j];
            if (parama.read(arrayOfByte) != j)
              throw new IOException("Invalid exif");
            i = k + j;
            localObject = new a(arrayOfByte);
            a((a)localObject, arrayOfByte.length);
            b((a)localObject, paramInt2);
            paramInt1 = 0;
            continue;
            localObject = new byte[j];
            if (parama.read((byte[])localObject) != j)
              throw new IOException("Invalid exif");
            if (getAttribute("UserComment") == null)
            {
              this.wy[1].put("UserComment", c.E(new String((byte[])localObject, wu)));
              paramInt1 = 0;
              i = k;
              continue;
              if (parama.skipBytes(1) != 1)
                throw new IOException("Invalid SOFx");
              this.wy[paramInt2].put("ImageLength", c.a(parama.readUnsignedShort(), this.wz));
              this.wy[paramInt2].put("ImageWidth", c.a(parama.readUnsignedShort(), this.wz));
              paramInt1 = j - 5;
              i = k;
            }
          }
        }
      }
      else
      {
        if (parama.skipBytes(paramInt1) != paramInt1)
          throw new IOException("Invalid JPEG segment");
        paramInt1 += i;
        break;
        parama.wO = this.wz;
        return;
        paramInt1 = 0;
        i = k;
      }
  }

  private void a(a parama, HashMap paramHashMap)
  {
    c localc = (c)paramHashMap.get("JPEGInterchangeFormat");
    paramHashMap = (c)paramHashMap.get("JPEGInterchangeFormatLength");
    int i;
    int j;
    int k;
    if ((localc != null) && (paramHashMap != null))
    {
      i = localc.c(this.wz);
      j = Math.min(paramHashMap.c(this.wz), parama.available() - i);
      if ((this.wx != 4) && (this.wx != 9) && (this.wx != 10))
        break label159;
      k = i + this.wF;
    }
    while (true)
    {
      if ((k > 0) && (j > 0))
      {
        this.wA = true;
        this.wB = k;
        this.wC = j;
        if ((this.mFilename == null) && (this.ww == null))
        {
          paramHashMap = new byte[j];
          parama.seek(k);
          parama.readFully(paramHashMap);
          this.wD = paramHashMap;
        }
      }
      return;
      label159: k = i;
      if (this.wx == 7)
        k = i + this.wG;
    }
  }

  private void b(a parama)
  {
    parama.skipBytes(84);
    Object localObject = new byte[4];
    byte[] arrayOfByte = new byte[4];
    parama.read((byte[])localObject);
    parama.skipBytes(4);
    parama.read(arrayOfByte);
    int i = ByteBuffer.wrap((byte[])localObject).getInt();
    int j = ByteBuffer.wrap(arrayOfByte).getInt();
    a(parama, i, 5);
    parama.seek(j);
    parama.wO = ByteOrder.BIG_ENDIAN;
    i = parama.readInt();
    for (j = 0; ; j++)
    {
      int m;
      if (j < i)
      {
        int k = parama.readUnsignedShort();
        m = parama.readUnsignedShort();
        if (k == TAG_RAF_IMAGE_SIZE.number)
        {
          j = parama.readShort();
          i = parama.readShort();
          parama = c.a(j, this.wz);
          localObject = c.a(i, this.wz);
          this.wy[0].put("ImageLength", parama);
          this.wy[0].put("ImageWidth", localObject);
        }
      }
      else
      {
        return;
      }
      parama.skipBytes(m);
    }
  }

  private void b(a parama, int paramInt)
  {
    int i = paramInt;
    if (a.d(parama) + 2 > a.e(parama));
    label15: int j;
    do
    {
      return;
      j = parama.readShort();
    }
    while (a.d(parama) + j * 12 > a.e(parama));
    int k = 0;
    int m;
    int n;
    int i1;
    long l1;
    d locald;
    long l2;
    int i2;
    if (k < j)
    {
      m = parama.readUnsignedShort();
      n = parama.readUnsignedShort();
      i1 = parama.readInt();
      l1 = 4L + parama.mPosition;
      locald = (d)wq[i].get(Integer.valueOf(m));
      l2 = 0L;
      i2 = 0;
      if (locald == null)
        break label896;
      if ((n <= 0) || (n >= wb.length))
      {
        paramInt = n;
        n = i2;
      }
    }
    while (true)
    {
      label128: if (n == 0)
        parama.seek(l1);
      while (true)
      {
        k = (short)(k + 1);
        break;
        if (!locald.an(n))
        {
          new StringBuilder("Skip the tag entry since data format (").append(wa[n]).append(") is unexpected for tag: ").append(locald.name);
          paramInt = n;
          n = i2;
          break label128;
        }
        paramInt = n;
        if (n == 7)
          paramInt = locald.wS;
        l2 = i1 * wb[paramInt];
        if ((l2 < 0L) || (l2 > 2147483647L))
        {
          n = i2;
          break label128;
        }
        n = 1;
        break label128;
        if (l2 > 4L)
        {
          n = parama.readInt();
          if (this.wx != 7)
            break label581;
          if ("MakerNote".equals(locald.name))
          {
            this.wG = n;
            label304: if (n + l2 > a.e(parama))
              break label613;
            parama.seek(n);
          }
        }
        else
        {
          localObject = (Integer)wt.get(Integer.valueOf(m));
          if (localObject == null)
            break label661;
          long l3 = -1L;
          l2 = l3;
          switch (paramInt)
          {
          default:
            l2 = l3;
          case 5:
          case 6:
          case 7:
          case 10:
          case 11:
          case 12:
          case 3:
          case 8:
          case 4:
          case 9:
          case 13:
          }
        }
        while (true)
        {
          if ((l2 > 0L) && (l2 < a.e(parama)))
          {
            parama.seek(l2);
            b(parama, ((Integer)localObject).intValue());
          }
          parama.seek(l1);
          break;
          if ((i != 6) || (!"ThumbnailImage".equals(locald.name)))
            break label304;
          this.wH = n;
          this.wI = i1;
          c localc1 = c.a(6, this.wz);
          c localc2 = c.a(this.wH, this.wz);
          localObject = c.a(this.wI, this.wz);
          this.wy[4].put("Compression", localc1);
          this.wy[4].put("JPEGInterchangeFormat", localc2);
          this.wy[4].put("JPEGInterchangeFormatLength", localObject);
          break label304;
          label581: if ((this.wx != 10) || (!"JpgFromRaw".equals(locald.name)))
            break label304;
          this.wJ = n;
          break label304;
          label613: parama.seek(l1);
          break;
          l2 = parama.readUnsignedShort();
          continue;
          l2 = parama.readShort();
          continue;
          l2 = parama.cM();
          continue;
          l2 = parama.readInt();
        }
        label661: Object localObject = new byte[(int)l2];
        parama.readFully((byte[])localObject);
        localObject = new c(paramInt, i1, (byte[])localObject, (byte)0);
        this.wy[i].put(locald.name, localObject);
        if ("DNGVersion".equals(locald.name))
          this.wx = 3;
        if (((!"Make".equals(locald.name)) && (!"Model".equals(locald.name))) || ((((c)localObject).d(this.wz).contains("PENTAX")) || (("Compression".equals(locald.name)) && (((c)localObject).c(this.wz) == 65535))))
          this.wx = 8;
        if (parama.mPosition != l1)
          parama.seek(l1);
      }
      if (parama.mPosition + 4 > a.e(parama))
        break label15;
      paramInt = parama.readInt();
      if ((paramInt <= 8) || (paramInt >= a.e(parama)))
        break label15;
      parama.seek(paramInt);
      if (this.wy[4].isEmpty())
      {
        i = 4;
        break;
      }
      if (!this.wy[5].isEmpty())
        break label15;
      i = 5;
      break;
      label896: paramInt = n;
      n = i2;
    }
  }

  private void b(a parama, HashMap paramHashMap)
  {
    Object localObject1 = (c)paramHashMap.get("StripOffsets");
    Object localObject2 = (c)paramHashMap.get("StripByteCounts");
    long[] arrayOfLong;
    if ((localObject1 != null) && (localObject2 != null))
    {
      paramHashMap = i(((c)localObject1).a(this.wz));
      arrayOfLong = i(((c)localObject2).a(this.wz));
      if (paramHashMap != null)
        break label63;
    }
    while (true)
    {
      return;
      label63: if (arrayOfLong != null)
      {
        long l = 0L;
        int i = arrayOfLong.length;
        for (int j = 0; j < i; j++)
          l += arrayOfLong[j];
        localObject1 = new byte[(int)l];
        j = 0;
        i = 0;
        int k = 0;
        while (j < paramHashMap.length)
        {
          int m = (int)paramHashMap[j];
          int n = (int)arrayOfLong[j];
          m -= k;
          parama.seek(m);
          localObject2 = new byte[n];
          parama.read((byte[])localObject2);
          k = k + m + n;
          System.arraycopy(localObject2, 0, localObject1, i, localObject2.length);
          i += localObject2.length;
          j++;
        }
        this.wA = true;
        this.wD = ((byte[])localObject1);
        this.wC = localObject1.length;
      }
    }
  }

  private void b(InputStream paramInputStream)
  {
    int i = 0;
    while (true)
    {
      Object localObject1;
      try
      {
        if (i < wm.length)
        {
          this.wy[i] = new HashMap();
          i++;
          continue;
        }
        localObject1 = new java/io/BufferedInputStream;
        ((BufferedInputStream)localObject1).<init>(paramInputStream, 5000);
        localObject2 = (BufferedInputStream)localObject1;
        ((BufferedInputStream)localObject2).mark(5000);
        paramInputStream = new byte[5000];
        ((BufferedInputStream)localObject2).read(paramInputStream);
        ((BufferedInputStream)localObject2).reset();
        if (e(paramInputStream))
        {
          i = 4;
          this.wx = i;
          paramInputStream = new android/support/d/a$a;
          paramInputStream.<init>((InputStream)localObject1);
        }
        switch (this.wx)
        {
        default:
          localObject1 = this.wy[4];
          localObject2 = (c)((HashMap)localObject1).get("Compression");
          if (localObject2 == null)
            break label1082;
          this.wE = ((c)localObject2).c(this.wz);
          switch (this.wE)
          {
          default:
            this.wK = true;
            return;
            if (f(paramInputStream))
            {
              i = 9;
              continue;
            }
            localObject2 = new android/support/d/a$a;
            ((a)localObject2).<init>(paramInputStream);
            this.wz = c((a)localObject2);
            ((a)localObject2).wO = this.wz;
            i = ((a)localObject2).readShort();
            ((a)localObject2).close();
            if ((i == 20306) || (i == 21330))
            {
              i = 1;
              if (i == 0)
                continue;
              i = 7;
              continue;
            }
            i = 0;
            continue;
            localObject2 = new android/support/d/a$a;
            ((a)localObject2).<init>(paramInputStream);
            this.wz = c((a)localObject2);
            ((a)localObject2).wO = this.wz;
            i = ((a)localObject2).readShort();
            ((a)localObject2).close();
            if (i == 85)
            {
              i = 1;
              if (i == 0)
                continue;
              i = 10;
              continue;
            }
            i = 0;
            continue;
            i = 0;
          case 6:
          case 1:
          case 7:
          }
          break;
        case 4:
          a(paramInputStream, 0, 0);
          continue;
        case 9:
        case 7:
        case 10:
        case 0:
        case 1:
        case 2:
        case 3:
        case 5:
        case 6:
        case 8:
        case 11:
        }
      }
      catch (IOException paramInputStream)
      {
        this.wK = false;
        cI();
        continue;
        b(paramInputStream);
        continue;
      }
      finally
      {
        cI();
      }
      a(paramInputStream);
      Object localObject2 = (c)this.wy[1].get("MakerNote");
      label1080: label1082: if (localObject2 != null)
      {
        localObject1 = new android/support/d/a$a;
        ((a)localObject1).<init>(((c)localObject2).wR);
        ((a)localObject1).wO = this.wz;
        localObject2 = new byte[vX.length];
        ((a)localObject1).readFully((byte[])localObject2);
        ((a)localObject1).seek(0L);
        Object localObject3 = new byte[vY.length];
        ((a)localObject1).readFully((byte[])localObject3);
        if (Arrays.equals((byte[])localObject2, vX))
          ((a)localObject1).seek(8L);
        while (true)
        {
          b((a)localObject1, 6);
          localObject1 = (c)this.wy[7].get("PreviewImageStart");
          localObject2 = (c)this.wy[7].get("PreviewImageLength");
          if ((localObject1 != null) && (localObject2 != null))
          {
            this.wy[5].put("JPEGInterchangeFormat", localObject1);
            this.wy[5].put("JPEGInterchangeFormatLength", localObject2);
          }
          localObject1 = (c)this.wy[8].get("AspectFrame");
          if (localObject1 == null)
            break;
          localObject2 = (int[])((c)localObject1).a(this.wz);
          if ((localObject2 != null) && (localObject2.length == 4))
            break label710;
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>("Invalid aspect frame values. frame=");
          ((StringBuilder)localObject1).append(Arrays.toString((int[])localObject2));
          break;
          if (Arrays.equals((byte[])localObject3, vY))
            ((a)localObject1).seek(12L);
        }
        label710: if ((localObject2[2] > localObject2[0]) && (localObject2[3] > localObject2[1]))
        {
          int j = localObject2[2] - localObject2[0] + 1;
          int k = localObject2[3] - localObject2[1] + 1;
          int m = k;
          i = j;
          if (j < k)
          {
            i = j + k;
            m = i - k;
            i -= m;
          }
          localObject1 = c.a(i, this.wz);
          localObject2 = c.a(m, this.wz);
          this.wy[0].put("ImageWidth", localObject1);
          this.wy[0].put("ImageLength", localObject2);
          continue;
          a(paramInputStream);
          if ((c)this.wy[0].get("JpgFromRaw") != null)
            a(paramInputStream, this.wJ, 5);
          localObject1 = (c)this.wy[0].get("ISO");
          localObject2 = (c)this.wy[1].get("PhotographicSensitivity");
          if ((localObject1 != null) && (localObject2 == null))
          {
            this.wy[1].put("PhotographicSensitivity", localObject1);
            continue;
            a(paramInputStream);
            continue;
            a(paramInputStream, (HashMap)localObject1);
            continue;
            localObject2 = (c)((HashMap)localObject1).get("BitsPerSample");
            if (localObject2 != null)
            {
              localObject3 = (int[])((c)localObject2).a(this.wz);
              if (Arrays.equals(vT, (int[])localObject3))
                i = 1;
            }
            while (true)
            {
              if (i == 0)
                break label1080;
              b(paramInputStream, (HashMap)localObject1);
              break;
              if (this.wx == 3)
              {
                localObject2 = (c)((HashMap)localObject1).get("PhotometricInterpretation");
                if (localObject2 != null)
                {
                  i = ((c)localObject2).c(this.wz);
                  if (((i == 1) && (Arrays.equals((int[])localObject3, vV))) || ((i == 6) && (Arrays.equals((int[])localObject3, vT))))
                    i = 1;
                }
              }
              else
              {
                i = 0;
              }
            }
            continue;
            this.wE = 6;
            a(paramInputStream, (HashMap)localObject1);
          }
        }
      }
    }
  }

  private void b(InputStream paramInputStream, OutputStream paramOutputStream)
  {
    paramInputStream = new DataInputStream(paramInputStream);
    b localb = new b(paramOutputStream, ByteOrder.BIG_ENDIAN);
    if (paramInputStream.readByte() != -1)
      throw new IOException("Invalid marker");
    localb.writeByte(-1);
    if (paramInputStream.readByte() != -40)
      throw new IOException("Invalid marker");
    localb.writeByte(-40);
    localb.writeByte(-1);
    localb.writeByte(-31);
    a(localb);
    byte[] arrayOfByte = new byte[4096];
    label452: 
    while (true)
    {
      if (paramInputStream.readByte() != -1)
        throw new IOException("Invalid marker");
      int i = paramInputStream.readByte();
      int j;
      switch (i)
      {
      default:
        localb.writeByte(-1);
        localb.writeByte(i);
        i = paramInputStream.readUnsignedShort();
        localb.writeShort((short)i);
        j = i - 2;
        i = j;
        if (j < 0)
          throw new IOException("Invalid length");
      case -31:
        j = paramInputStream.readUnsignedShort() - 2;
        if (j < 0)
          throw new IOException("Invalid length");
        paramOutputStream = new byte[6];
        if (j >= 6)
        {
          if (paramInputStream.read(paramOutputStream) != 6)
            throw new IOException("Invalid exif");
          if (Arrays.equals(paramOutputStream, wv))
          {
            if (paramInputStream.skipBytes(j - 6) == j - 6)
              continue;
            throw new IOException("Invalid length");
          }
        }
        else
        {
          localb.writeByte(-1);
          localb.writeByte(i);
          localb.writeShort((short)(j + 2));
          i = j;
          if (j >= 6)
          {
            i = j - 6;
            localb.write(paramOutputStream);
          }
          while (i > 0)
          {
            j = paramInputStream.read(arrayOfByte, 0, Math.min(i, 4096));
            if (j < 0)
              break;
            localb.write(arrayOfByte, 0, j);
            i -= j;
          }
        }
        break;
      case -39:
      case -38:
        localb.writeByte(-1);
        localb.writeByte(i);
        copy(paramInputStream, localb);
        return;
        while (true)
        {
          if (i <= 0)
            break label452;
          j = paramInputStream.read(arrayOfByte, 0, Math.min(i, 4096));
          if (j < 0)
            break;
          localb.write(arrayOfByte, 0, j);
          i -= j;
        }
      }
    }
  }

  private static ByteOrder c(a parama)
  {
    int i = parama.readShort();
    switch (i)
    {
    default:
      throw new IOException("Invalid byte order: " + Integer.toHexString(i));
    case 18761:
    case 19789:
    }
    for (parama = ByteOrder.LITTLE_ENDIAN; ; parama = ByteOrder.BIG_ENDIAN)
      return parama;
  }

  private void c(a parama, int paramInt)
  {
    c localc1 = (c)this.wy[paramInt].get("ImageLength");
    c localc2 = (c)this.wy[paramInt].get("ImageWidth");
    if ((localc1 == null) || (localc2 == null))
    {
      localc2 = (c)this.wy[paramInt].get("JPEGInterchangeFormat");
      if (localc2 != null)
        a(parama, localc2.c(this.wz), paramInt);
    }
  }

  private void cI()
  {
    String str = getAttribute("DateTimeOriginal");
    if ((str != null) && (getAttribute("DateTime") == null))
      this.wy[0].put("DateTime", c.E(str));
    if (getAttribute("ImageWidth") == null)
      this.wy[0].put("ImageWidth", c.a(0L, this.wz));
    if (getAttribute("ImageLength") == null)
      this.wy[0].put("ImageLength", c.a(0L, this.wz));
    if (getAttribute("Orientation") == null)
      this.wy[0].put("Orientation", c.a(0L, this.wz));
    if (getAttribute("LightSource") == null)
      this.wy[1].put("LightSource", c.a(0L, this.wz));
  }

  private void cJ()
  {
    q(0, 5);
    q(0, 4);
    q(5, 4);
    c localc1 = (c)this.wy[1].get("PixelXDimension");
    c localc2 = (c)this.wy[1].get("PixelYDimension");
    if ((localc1 != null) && (localc2 != null))
    {
      this.wy[0].put("ImageWidth", localc1);
      this.wy[0].put("ImageLength", localc2);
    }
    if ((this.wy[4].isEmpty()) && (h(this.wy[5])))
    {
      this.wy[4] = this.wy[5];
      this.wy[5] = new HashMap();
    }
    h(this.wy[4]);
  }

  private static void closeQuietly(Closeable paramCloseable)
  {
    if (paramCloseable != null);
    try
    {
      paramCloseable.close();
      label10: return;
    }
    catch (RuntimeException paramCloseable)
    {
      throw paramCloseable;
    }
    catch (Exception paramCloseable)
    {
      break label10;
    }
  }

  private static int copy(InputStream paramInputStream, OutputStream paramOutputStream)
  {
    byte[] arrayOfByte = new byte[8192];
    int i = 0;
    while (true)
    {
      int j = paramInputStream.read(arrayOfByte);
      if (j == -1)
        break;
      i += j;
      paramOutputStream.write(arrayOfByte, 0, j);
    }
    return i;
  }

  private void d(a parama, int paramInt)
  {
    c localc1 = (c)this.wy[paramInt].get("DefaultCropSize");
    c localc2 = (c)this.wy[paramInt].get("SensorTopBorder");
    Object localObject = (c)this.wy[paramInt].get("SensorLeftBorder");
    c localc3 = (c)this.wy[paramInt].get("SensorBottomBorder");
    c localc4 = (c)this.wy[paramInt].get("SensorRightBorder");
    if (localc1 != null)
      if (localc1.format == 5)
      {
        localObject = (e[])localc1.a(this.wz);
        if ((localObject == null) || (localObject.length != 2))
          new StringBuilder("Invalid crop size values. cropSize=").append(Arrays.toString((Object[])localObject));
      }
    while (true)
    {
      return;
      parama = c.a(localObject[0], this.wz);
      for (localObject = c.a(localObject[1], this.wz); ; localObject = c.a(localObject[1], this.wz))
      {
        this.wy[paramInt].put("ImageWidth", parama);
        this.wy[paramInt].put("ImageLength", localObject);
        break;
        localObject = (int[])localc1.a(this.wz);
        if ((localObject == null) || (localObject.length != 2))
        {
          new StringBuilder("Invalid crop size values. cropSize=").append(Arrays.toString((int[])localObject));
          break;
        }
        parama = c.a(localObject[0], this.wz);
      }
      if ((localc2 != null) && (localObject != null) && (localc3 != null) && (localc4 != null))
      {
        int i = localc2.c(this.wz);
        int j = localc3.c(this.wz);
        int k = localc4.c(this.wz);
        int m = ((c)localObject).c(this.wz);
        if ((j > i) && (k > m))
        {
          parama = c.a(j - i, this.wz);
          localObject = c.a(k - m, this.wz);
          this.wy[paramInt].put("ImageLength", parama);
          this.wy[paramInt].put("ImageWidth", localObject);
        }
      }
      else
      {
        c(parama, paramInt);
      }
    }
  }

  private static boolean e(byte[] paramArrayOfByte)
  {
    boolean bool = false;
    int i = 0;
    if (i < vW.length)
      if (paramArrayOfByte[i] == vW[i]);
    while (true)
    {
      return bool;
      i++;
      break;
      bool = true;
    }
  }

  private static boolean f(byte[] paramArrayOfByte)
  {
    boolean bool = false;
    byte[] arrayOfByte = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
    int i = 0;
    if (i < arrayOfByte.length)
      if (paramArrayOfByte[i] == arrayOfByte[i]);
    while (true)
    {
      return bool;
      i++;
      break;
      bool = true;
    }
  }

  private static double g(String paramString1, String paramString2)
  {
    try
    {
      paramString1 = paramString1.split(",");
      String[] arrayOfString = paramString1[0].split("/");
      double d1 = Double.parseDouble(arrayOfString[0].trim()) / Double.parseDouble(arrayOfString[1].trim());
      arrayOfString = paramString1[1].split("/");
      double d2 = Double.parseDouble(arrayOfString[0].trim()) / Double.parseDouble(arrayOfString[1].trim());
      paramString1 = paramString1[2].split("/");
      double d3 = Double.parseDouble(paramString1[0].trim()) / Double.parseDouble(paramString1[1].trim());
      d2 /= 60.0D;
      d3 = d3 / 3600.0D + (d1 + d2);
      if ((paramString2.equals("S")) || (paramString2.equals("W")))
        d1 = -d3;
      do
      {
        do
        {
          return d1;
          d1 = d3;
        }
        while (paramString2.equals("N"));
        d1 = d3;
      }
      while (paramString2.equals("E"));
      paramString1 = new java/lang/IllegalArgumentException;
      paramString1.<init>();
      throw paramString1;
    }
    catch (NumberFormatException paramString1)
    {
      throw new IllegalArgumentException();
    }
    catch (ArrayIndexOutOfBoundsException paramString1)
    {
      label184: break label184;
    }
  }

  // ERROR //
  private byte[] getThumbnailBytes()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aload_0
    //   3: getfield 965	android/support/d/a:wA	Z
    //   6: ifne +7 -> 13
    //   9: aload_1
    //   10: astore_2
    //   11: aload_2
    //   12: areturn
    //   13: aload_0
    //   14: getfield 1137	android/support/d/a:wD	[B
    //   17: ifnull +11 -> 28
    //   20: aload_0
    //   21: getfield 1137	android/support/d/a:wD	[B
    //   24: astore_2
    //   25: goto -14 -> 11
    //   28: aload_0
    //   29: getfield 849	android/support/d/a:ww	Landroid/content/res/AssetManager$AssetInputStream;
    //   32: ifnull +52 -> 84
    //   35: aload_0
    //   36: getfield 849	android/support/d/a:ww	Landroid/content/res/AssetManager$AssetInputStream;
    //   39: astore_2
    //   40: aload_2
    //   41: invokevirtual 1352	java/io/InputStream:markSupported	()Z
    //   44: ifeq +31 -> 75
    //   47: aload_2
    //   48: invokevirtual 1353	java/io/InputStream:reset	()V
    //   51: aload_2
    //   52: ifnonnull +60 -> 112
    //   55: new 1355	java/io/FileNotFoundException
    //   58: astore_3
    //   59: aload_3
    //   60: invokespecial 1356	java/io/FileNotFoundException:<init>	()V
    //   63: aload_3
    //   64: athrow
    //   65: astore_3
    //   66: aload_2
    //   67: invokestatic 860	android/support/d/a:closeQuietly	(Ljava/io/Closeable;)V
    //   70: aload_1
    //   71: astore_2
    //   72: goto -61 -> 11
    //   75: aload_2
    //   76: invokestatic 860	android/support/d/a:closeQuietly	(Ljava/io/Closeable;)V
    //   79: aload_1
    //   80: astore_2
    //   81: goto -70 -> 11
    //   84: aload_0
    //   85: getfield 845	android/support/d/a:mFilename	Ljava/lang/String;
    //   88: ifnull +122 -> 210
    //   91: new 855	java/io/FileInputStream
    //   94: dup
    //   95: aload_0
    //   96: getfield 845	android/support/d/a:mFilename	Ljava/lang/String;
    //   99: invokespecial 856	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   102: astore_2
    //   103: goto -52 -> 51
    //   106: astore_2
    //   107: aconst_null
    //   108: astore_2
    //   109: goto -43 -> 66
    //   112: aload_2
    //   113: aload_0
    //   114: getfield 985	android/support/d/a:wB	I
    //   117: i2l
    //   118: invokevirtual 1360	java/io/InputStream:skip	(J)J
    //   121: aload_0
    //   122: getfield 985	android/support/d/a:wB	I
    //   125: i2l
    //   126: lcmp
    //   127: ifeq +23 -> 150
    //   130: new 1052	java/io/IOException
    //   133: astore_3
    //   134: aload_3
    //   135: ldc_w 1362
    //   138: invokespecial 1070	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   141: aload_3
    //   142: athrow
    //   143: astore_1
    //   144: aload_2
    //   145: invokestatic 860	android/support/d/a:closeQuietly	(Ljava/io/Closeable;)V
    //   148: aload_1
    //   149: athrow
    //   150: aload_0
    //   151: getfield 967	android/support/d/a:wC	I
    //   154: newarray byte
    //   156: astore_3
    //   157: aload_2
    //   158: aload_3
    //   159: invokevirtual 1310	java/io/InputStream:read	([B)I
    //   162: aload_0
    //   163: getfield 967	android/support/d/a:wC	I
    //   166: if_icmpeq +16 -> 182
    //   169: new 1052	java/io/IOException
    //   172: astore_3
    //   173: aload_3
    //   174: ldc_w 1362
    //   177: invokespecial 1070	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   180: aload_3
    //   181: athrow
    //   182: aload_0
    //   183: aload_3
    //   184: putfield 1137	android/support/d/a:wD	[B
    //   187: aload_2
    //   188: invokestatic 860	android/support/d/a:closeQuietly	(Ljava/io/Closeable;)V
    //   191: aload_3
    //   192: astore_2
    //   193: goto -182 -> 11
    //   196: astore_1
    //   197: aconst_null
    //   198: astore_2
    //   199: goto -55 -> 144
    //   202: astore_1
    //   203: goto -59 -> 144
    //   206: astore_3
    //   207: goto -141 -> 66
    //   210: aconst_null
    //   211: astore_2
    //   212: goto -161 -> 51
    //
    // Exception table:
    //   from	to	target	type
    //   55	65	65	java/io/IOException
    //   112	143	65	java/io/IOException
    //   150	182	65	java/io/IOException
    //   182	187	65	java/io/IOException
    //   28	40	106	java/io/IOException
    //   84	103	106	java/io/IOException
    //   55	65	143	finally
    //   112	143	143	finally
    //   150	182	143	finally
    //   182	187	143	finally
    //   28	40	196	finally
    //   84	103	196	finally
    //   40	51	202	finally
    //   40	51	206	java/io/IOException
  }

  private boolean h(HashMap paramHashMap)
  {
    c localc = (c)paramHashMap.get("ImageLength");
    paramHashMap = (c)paramHashMap.get("ImageWidth");
    if ((localc != null) && (paramHashMap != null))
    {
      int i = localc.c(this.wz);
      int j = paramHashMap.c(this.wz);
      if ((i > 512) || (j > 512));
    }
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private static long[] i(Object paramObject)
  {
    if ((paramObject instanceof int[]))
    {
      int[] arrayOfInt = (int[])paramObject;
      paramObject = new long[arrayOfInt.length];
      for (int i = 0; i < arrayOfInt.length; i++)
        paramObject[i] = arrayOfInt[i];
    }
    while (true)
    {
      return paramObject;
      if ((paramObject instanceof long[]))
        paramObject = (long[])paramObject;
      else
        paramObject = null;
    }
  }

  private void q(int paramInt1, int paramInt2)
  {
    if ((this.wy[paramInt1].isEmpty()) || (this.wy[paramInt2].isEmpty()));
    while (true)
    {
      return;
      c localc1 = (c)this.wy[paramInt1].get("ImageLength");
      Object localObject1 = (c)this.wy[paramInt1].get("ImageWidth");
      c localc2 = (c)this.wy[paramInt2].get("ImageLength");
      Object localObject2 = (c)this.wy[paramInt2].get("ImageWidth");
      if ((localc1 != null) && (localObject1 != null) && (localc2 != null) && (localObject2 != null))
      {
        int i = localc1.c(this.wz);
        int j = ((c)localObject1).c(this.wz);
        int k = localc2.c(this.wz);
        int m = ((c)localObject2).c(this.wz);
        if ((i < k) && (j < m))
        {
          localObject2 = this.wy[paramInt1];
          localObject1 = this.wy;
          localObject1[paramInt1] = localObject1[paramInt2];
          this.wy[paramInt2] = localObject2;
        }
      }
    }
  }

  private void removeAttribute(String paramString)
  {
    for (int i = 0; i < wm.length; i++)
      this.wy[i].remove(paramString);
  }

  public final double[] cH()
  {
    String str1 = getAttribute("GPSLatitude");
    String str2 = getAttribute("GPSLatitudeRef");
    String str3 = getAttribute("GPSLongitude");
    String str4 = getAttribute("GPSLongitudeRef");
    if ((str1 != null) && (str2 != null) && (str3 != null) && (str4 != null));
    while (true)
    {
      try
      {
        double d1 = g(str1, str2);
        double d2 = g(str3, str4);
        double[] arrayOfDouble = new double[2];
        arrayOfDouble[0] = d1;
        arrayOfDouble[1] = d2;
        return arrayOfDouble;
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        new StringBuilder("Latitude/longitude values are not parseable. ").append(String.format("latValue=%s, latRef=%s, lngValue=%s, lngRef=%s", new Object[] { str1, str2, str3, str4 }));
      }
      Object localObject = null;
    }
  }

  public final String getAttribute(String paramString)
  {
    c localc = C(paramString);
    if (localc != null)
      if (!ws.contains(paramString))
        paramString = localc.d(this.wz);
    while (true)
    {
      return paramString;
      if (paramString.equals("GPSTimeStamp"))
      {
        if ((localc.format != 5) && (localc.format != 10))
        {
          new StringBuilder("GPS Timestamp format is not rational. format=").append(localc.format);
          paramString = null;
        }
        else
        {
          paramString = (e[])localc.a(this.wz);
          if ((paramString == null) || (paramString.length != 3))
          {
            new StringBuilder("Invalid GPS Timestamp array. array=").append(Arrays.toString(paramString));
            paramString = null;
          }
          else
          {
            paramString = String.format("%02d:%02d:%02d", new Object[] { Integer.valueOf((int)((float)paramString[0].wU / (float)paramString[0].wV)), Integer.valueOf((int)((float)paramString[1].wU / (float)paramString[1].wV)), Integer.valueOf((int)((float)paramString[2].wU / (float)paramString[2].wV)) });
          }
        }
      }
      else
      {
        try
        {
          paramString = Double.toString(localc.b(this.wz));
        }
        catch (NumberFormatException paramString)
        {
          paramString = null;
        }
        continue;
        paramString = null;
      }
    }
  }

  public final double getAttributeDouble(String paramString, double paramDouble)
  {
    paramString = C(paramString);
    if (paramString == null);
    while (true)
    {
      return paramDouble;
      try
      {
        double d = paramString.b(this.wz);
        paramDouble = d;
      }
      catch (NumberFormatException paramString)
      {
      }
    }
  }

  public final int getAttributeInt(String paramString, int paramInt)
  {
    paramString = C(paramString);
    if (paramString == null);
    while (true)
    {
      return paramInt;
      try
      {
        int i = paramString.c(this.wz);
        paramInt = i;
      }
      catch (NumberFormatException paramString)
      {
      }
    }
  }

  // ERROR //
  public final void saveAttributes()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 1232	android/support/d/a:wK	Z
    //   4: ifeq +11 -> 15
    //   7: aload_0
    //   8: getfield 1035	android/support/d/a:wx	I
    //   11: iconst_4
    //   12: if_icmpeq +14 -> 26
    //   15: new 1052	java/io/IOException
    //   18: dup
    //   19: ldc_w 1408
    //   22: invokespecial 1070	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   25: athrow
    //   26: aload_0
    //   27: getfield 845	android/support/d/a:mFilename	Ljava/lang/String;
    //   30: ifnonnull +14 -> 44
    //   33: new 1052	java/io/IOException
    //   36: dup
    //   37: ldc_w 1410
    //   40: invokespecial 1070	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   43: athrow
    //   44: aload_0
    //   45: getfield 1230	android/support/d/a:wE	I
    //   48: bipush 6
    //   50: if_icmpeq +12 -> 62
    //   53: aload_0
    //   54: getfield 1230	android/support/d/a:wE	I
    //   57: bipush 7
    //   59: if_icmpne +90 -> 149
    //   62: aload_0
    //   63: invokespecial 1019	android/support/d/a:getThumbnailBytes	()[B
    //   66: astore_1
    //   67: aload_0
    //   68: aload_1
    //   69: putfield 1137	android/support/d/a:wD	[B
    //   72: new 1412	java/io/File
    //   75: dup
    //   76: new 1054	java/lang/StringBuilder
    //   79: dup
    //   80: invokespecial 1413	java/lang/StringBuilder:<init>	()V
    //   83: aload_0
    //   84: getfield 845	android/support/d/a:mFilename	Ljava/lang/String;
    //   87: invokevirtual 1065	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   90: ldc_w 1415
    //   93: invokevirtual 1065	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   96: invokevirtual 1069	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   99: invokespecial 1416	java/io/File:<init>	(Ljava/lang/String;)V
    //   102: astore_2
    //   103: new 1412	java/io/File
    //   106: dup
    //   107: aload_0
    //   108: getfield 845	android/support/d/a:mFilename	Ljava/lang/String;
    //   111: invokespecial 1416	java/io/File:<init>	(Ljava/lang/String;)V
    //   114: aload_2
    //   115: invokevirtual 1420	java/io/File:renameTo	(Ljava/io/File;)Z
    //   118: ifne +36 -> 154
    //   121: new 1052	java/io/IOException
    //   124: dup
    //   125: new 1054	java/lang/StringBuilder
    //   128: dup
    //   129: ldc_w 1422
    //   132: invokespecial 1057	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   135: aload_2
    //   136: invokevirtual 1425	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   139: invokevirtual 1065	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   142: invokevirtual 1069	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   145: invokespecial 1070	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   148: athrow
    //   149: aconst_null
    //   150: astore_1
    //   151: goto -84 -> 67
    //   154: new 855	java/io/FileInputStream
    //   157: astore_3
    //   158: aload_3
    //   159: aload_2
    //   160: invokespecial 1428	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   163: new 1430	java/io/FileOutputStream
    //   166: astore 4
    //   168: aload 4
    //   170: aload_0
    //   171: getfield 845	android/support/d/a:mFilename	Ljava/lang/String;
    //   174: invokespecial 1431	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   177: aload_0
    //   178: aload_3
    //   179: aload 4
    //   181: invokespecial 1433	android/support/d/a:b	(Ljava/io/InputStream;Ljava/io/OutputStream;)V
    //   184: aload_3
    //   185: invokestatic 860	android/support/d/a:closeQuietly	(Ljava/io/Closeable;)V
    //   188: aload 4
    //   190: invokestatic 860	android/support/d/a:closeQuietly	(Ljava/io/Closeable;)V
    //   193: aload_2
    //   194: invokevirtual 1436	java/io/File:delete	()Z
    //   197: pop
    //   198: aload_0
    //   199: aconst_null
    //   200: putfield 1137	android/support/d/a:wD	[B
    //   203: return
    //   204: astore_1
    //   205: aconst_null
    //   206: astore 4
    //   208: aconst_null
    //   209: astore_3
    //   210: aload_3
    //   211: invokestatic 860	android/support/d/a:closeQuietly	(Ljava/io/Closeable;)V
    //   214: aload 4
    //   216: invokestatic 860	android/support/d/a:closeQuietly	(Ljava/io/Closeable;)V
    //   219: aload_2
    //   220: invokevirtual 1436	java/io/File:delete	()Z
    //   223: pop
    //   224: aload_1
    //   225: athrow
    //   226: astore_1
    //   227: aconst_null
    //   228: astore 4
    //   230: goto -20 -> 210
    //   233: astore_1
    //   234: goto -24 -> 210
    //
    // Exception table:
    //   from	to	target	type
    //   154	163	204	finally
    //   163	177	226	finally
    //   177	184	233	finally
  }

  public final void setAttribute(String paramString1, String paramString2)
  {
    String str = paramString1;
    if ("ISOSpeedRatings".equals(paramString1))
      str = "PhotographicSensitivity";
    paramString1 = paramString2;
    if (paramString2 != null)
    {
      paramString1 = paramString2;
      if (ws.contains(str))
      {
        if (!str.equals("GPSTimeStamp"))
          break label211;
        paramString1 = wM.matcher(paramString2);
        if (!paramString1.find())
        {
          new StringBuilder("Invalid value for ").append(str).append(" : ").append(paramString2);
          return;
        }
        paramString1 = Integer.parseInt(paramString1.group(1)) + "/1," + Integer.parseInt(paramString1.group(2)) + "/1," + Integer.parseInt(paramString1.group(3)) + "/1";
      }
    }
    int i = 0;
    label149: if (i < wm.length)
      if ((i != 4) || (this.wA))
      {
        paramString2 = (d)wr[i].get(str);
        if (paramString2 != null)
        {
          if (paramString1 != null)
            break label265;
          this.wy[i].remove(str);
        }
      }
    while (true)
    {
      while (true)
      {
        i++;
        break label149;
        break;
        try
        {
          label211: double d = Double.parseDouble(paramString2);
          paramString1 = new android/support/d/a$e;
          paramString1.<init>(d, (byte)0);
          paramString1 = paramString1.toString();
        }
        catch (NumberFormatException paramString1)
        {
          new StringBuilder("Invalid value for ").append(str).append(" : ").append(paramString2);
        }
      }
      break;
      label265: Object localObject1 = D(paramString1);
      int j;
      if ((paramString2.wS == ((Integer)((Pair)localObject1).first).intValue()) || (paramString2.wS == ((Integer)((Pair)localObject1).second).intValue()))
        j = paramString2.wS;
      label313: Object localObject2;
      switch (j)
      {
      case 6:
      case 8:
      case 11:
      default:
        break;
      case 1:
        localObject1 = this.wy[i];
        if ((paramString1.length() == 1) && (paramString1.charAt(0) >= '0') && (paramString1.charAt(0) <= '1'));
        for (paramString2 = new c(1, 1, new byte[] { (byte)(paramString1.charAt(0) - '0') }); ; paramString2 = new c(1, paramString2.length, paramString2))
        {
          ((HashMap)localObject1).put(str, paramString2);
          break;
          if ((paramString2.wT != -1) && ((paramString2.wT == ((Integer)((Pair)localObject1).first).intValue()) || (paramString2.wT == ((Integer)((Pair)localObject1).second).intValue())))
          {
            j = paramString2.wT;
            break label313;
          }
          if ((paramString2.wS == 1) || (paramString2.wS == 7) || (paramString2.wS == 2))
          {
            j = paramString2.wS;
            break label313;
          }
          localObject2 = new StringBuilder("Given tag (").append(str).append(") value didn't match with one of expected formats: ").append(wa[paramString2.wS]);
          if (paramString2.wT == -1)
          {
            paramString2 = "";
            localObject2 = ((StringBuilder)localObject2).append(paramString2).append(" (guess: ").append(wa[((Integer)localObject1.first).intValue()]);
            if (((Integer)((Pair)localObject1).second).intValue() != -1)
              break label679;
          }
          for (paramString2 = ""; ; paramString2 = ", " + wa[((Integer)localObject1.second).intValue()])
          {
            ((StringBuilder)localObject2).append(paramString2).append(")");
            break;
            paramString2 = ", " + wa[paramString2.wT];
            break label584;
          }
          paramString2 = paramString1.getBytes(wu);
        }
      case 2:
      case 7:
        this.wy[i].put(str, c.E(paramString1));
        break;
      case 3:
        paramString2 = paramString1.split(",");
        localObject1 = new int[paramString2.length];
        for (j = 0; j < paramString2.length; j++)
          localObject1[j] = Integer.parseInt(paramString2[j]);
        this.wy[i].put(str, c.a((int[])localObject1, this.wz));
        break;
      case 9:
        paramString2 = paramString1.split(",");
        localObject1 = new int[paramString2.length];
        for (j = 0; j < paramString2.length; j++)
          localObject1[j] = Integer.parseInt(paramString2[j]);
        this.wy[i].put(str, c.b((int[])localObject1, this.wz));
        break;
      case 4:
        paramString2 = paramString1.split(",");
        localObject1 = new long[paramString2.length];
        for (j = 0; j < paramString2.length; j++)
          localObject1[j] = Long.parseLong(paramString2[j]);
        this.wy[i].put(str, c.a((long[])localObject1, this.wz));
        break;
      case 5:
        localObject2 = paramString1.split(",");
        paramString2 = new e[localObject2.length];
        for (j = 0; j < localObject2.length; j++)
        {
          localObject1 = localObject2[j].split("/");
          paramString2[j] = new e(()Double.parseDouble(localObject1[0]), ()Double.parseDouble(localObject1[1]), 0);
        }
        this.wy[i].put(str, c.a(paramString2, this.wz));
        break;
      case 10:
        localObject2 = paramString1.split(",");
        paramString2 = new e[localObject2.length];
        for (j = 0; j < localObject2.length; j++)
        {
          localObject1 = localObject2[j].split("/");
          paramString2[j] = new e(()Double.parseDouble(localObject1[0]), ()Double.parseDouble(localObject1[1]), 0);
        }
        this.wy[i].put(str, c.b(paramString2, this.wz));
        break;
      case 12:
        label584: paramString2 = paramString1.split(",");
        label679: localObject1 = new double[paramString2.length];
        for (j = 0; j < paramString2.length; j++)
          localObject1[j] = Double.parseDouble(paramString2[j]);
        this.wy[i].put(str, c.a((double[])localObject1, this.wz));
      }
    }
  }

  static final class a extends InputStream
    implements DataInput
  {
    private static final ByteOrder BIG_ENDIAN = ByteOrder.BIG_ENDIAN;
    private static final ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
    private final int mLength;
    int mPosition;
    private DataInputStream wN;
    ByteOrder wO = ByteOrder.BIG_ENDIAN;

    public a(InputStream paramInputStream)
    {
      this.wN = new DataInputStream(paramInputStream);
      this.mLength = this.wN.available();
      this.mPosition = 0;
      this.wN.mark(this.mLength);
    }

    public a(byte[] paramArrayOfByte)
    {
      this(new ByteArrayInputStream(paramArrayOfByte));
    }

    public final int available()
    {
      return this.wN.available();
    }

    public final long cM()
    {
      return readInt() & 0xFFFFFFFF;
    }

    public final int read()
    {
      this.mPosition += 1;
      return this.wN.read();
    }

    public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    {
      paramInt1 = this.wN.read(paramArrayOfByte, paramInt1, paramInt2);
      this.mPosition += paramInt1;
      return paramInt1;
    }

    public final boolean readBoolean()
    {
      this.mPosition += 1;
      return this.wN.readBoolean();
    }

    public final byte readByte()
    {
      this.mPosition += 1;
      if (this.mPosition > this.mLength)
        throw new EOFException();
      int i = this.wN.read();
      if (i < 0)
        throw new EOFException();
      return (byte)i;
    }

    public final char readChar()
    {
      this.mPosition += 2;
      return this.wN.readChar();
    }

    public final double readDouble()
    {
      return Double.longBitsToDouble(readLong());
    }

    public final float readFloat()
    {
      return Float.intBitsToFloat(readInt());
    }

    public final void readFully(byte[] paramArrayOfByte)
    {
      this.mPosition += paramArrayOfByte.length;
      if (this.mPosition > this.mLength)
        throw new EOFException();
      if (this.wN.read(paramArrayOfByte, 0, paramArrayOfByte.length) != paramArrayOfByte.length)
        throw new IOException("Couldn't read up to the length of buffer");
    }

    public final void readFully(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    {
      this.mPosition += paramInt2;
      if (this.mPosition > this.mLength)
        throw new EOFException();
      if (this.wN.read(paramArrayOfByte, paramInt1, paramInt2) != paramInt2)
        throw new IOException("Couldn't read up to the length of buffer");
    }

    public final int readInt()
    {
      this.mPosition += 4;
      if (this.mPosition > this.mLength)
        throw new EOFException();
      int i = this.wN.read();
      int j = this.wN.read();
      int k = this.wN.read();
      int m = this.wN.read();
      if ((i | j | k | m) < 0)
        throw new EOFException();
      if (this.wO == LITTLE_ENDIAN)
        i += (j << 8) + ((k << 16) + (m << 24));
      while (true)
      {
        return i;
        if (this.wO != BIG_ENDIAN)
          break;
        i = (i << 24) + (j << 16) + (k << 8) + m;
      }
      throw new IOException("Invalid byte order: " + this.wO);
    }

    public final String readLine()
    {
      return null;
    }

    public final long readLong()
    {
      this.mPosition += 8;
      if (this.mPosition > this.mLength)
        throw new EOFException();
      int i = this.wN.read();
      int j = this.wN.read();
      int k = this.wN.read();
      int m = this.wN.read();
      int n = this.wN.read();
      int i1 = this.wN.read();
      int i2 = this.wN.read();
      int i3 = this.wN.read();
      if ((i | j | k | m | n | i1 | i2 | i3) < 0)
        throw new EOFException();
      long l1;
      long l2;
      long l4;
      long l5;
      long l6;
      long l7;
      if (this.wO == LITTLE_ENDIAN)
      {
        l1 = i3;
        l2 = i2;
        l3 = i1;
        l4 = n;
        l5 = m;
        l6 = k;
        l7 = j;
      }
      for (long l3 = i + ((l6 << 16) + ((l4 << 32) + ((l2 << 48) + (l1 << 56) + (l3 << 40)) + (l5 << 24)) + (l7 << 8)); ; l3 = (j << 48) + (l3 << 56) + (k << 40) + (m << 32) + (n << 24) + (i1 << 16) + (i2 << 8) + i3)
      {
        return l3;
        if (this.wO != BIG_ENDIAN)
          break;
        l3 = i;
      }
      throw new IOException("Invalid byte order: " + this.wO);
    }

    public final short readShort()
    {
      this.mPosition += 2;
      if (this.mPosition > this.mLength)
        throw new EOFException();
      int i = this.wN.read();
      int j = this.wN.read();
      if ((i | j) < 0)
        throw new EOFException();
      if (this.wO == LITTLE_ENDIAN)
        i = (short)(i + (j << 8));
      for (int k = i; ; k = i)
      {
        return k;
        if (this.wO != BIG_ENDIAN)
          break;
        i = (short)((i << 8) + j);
      }
      throw new IOException("Invalid byte order: " + this.wO);
    }

    public final String readUTF()
    {
      this.mPosition += 2;
      return this.wN.readUTF();
    }

    public final int readUnsignedByte()
    {
      this.mPosition += 1;
      return this.wN.readUnsignedByte();
    }

    public final int readUnsignedShort()
    {
      this.mPosition += 2;
      if (this.mPosition > this.mLength)
        throw new EOFException();
      int i = this.wN.read();
      int j = this.wN.read();
      if ((i | j) < 0)
        throw new EOFException();
      if (this.wO == LITTLE_ENDIAN)
        i += (j << 8);
      while (true)
      {
        return i;
        if (this.wO != BIG_ENDIAN)
          break;
        i = (i << 8) + j;
      }
      throw new IOException("Invalid byte order: " + this.wO);
    }

    public final void seek(long paramLong)
    {
      if (this.mPosition > paramLong)
      {
        this.mPosition = 0;
        this.wN.reset();
        this.wN.mark(this.mLength);
      }
      while (skipBytes((int)paramLong) != (int)paramLong)
      {
        throw new IOException("Couldn't seek up to the byteCount");
        paramLong -= this.mPosition;
      }
    }

    public final int skipBytes(int paramInt)
    {
      int i = Math.min(paramInt, this.mLength - this.mPosition);
      paramInt = 0;
      while (paramInt < i)
        paramInt += this.wN.skipBytes(i - paramInt);
      this.mPosition += paramInt;
      return paramInt;
    }
  }

  static final class b extends FilterOutputStream
  {
    ByteOrder wO;
    private final OutputStream wP;

    public b(OutputStream paramOutputStream, ByteOrder paramByteOrder)
    {
      super();
      this.wP = paramOutputStream;
      this.wO = paramByteOrder;
    }

    public final void write(byte[] paramArrayOfByte)
    {
      this.wP.write(paramArrayOfByte);
    }

    public final void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    {
      this.wP.write(paramArrayOfByte, paramInt1, paramInt2);
    }

    public final void writeByte(int paramInt)
    {
      this.wP.write(paramInt);
    }

    public final void writeInt(int paramInt)
    {
      if (this.wO == ByteOrder.LITTLE_ENDIAN)
      {
        this.wP.write(paramInt >>> 0 & 0xFF);
        this.wP.write(paramInt >>> 8 & 0xFF);
        this.wP.write(paramInt >>> 16 & 0xFF);
        this.wP.write(paramInt >>> 24 & 0xFF);
      }
      while (true)
      {
        return;
        if (this.wO == ByteOrder.BIG_ENDIAN)
        {
          this.wP.write(paramInt >>> 24 & 0xFF);
          this.wP.write(paramInt >>> 16 & 0xFF);
          this.wP.write(paramInt >>> 8 & 0xFF);
          this.wP.write(paramInt >>> 0 & 0xFF);
        }
      }
    }

    public final void writeShort(short paramShort)
    {
      if (this.wO == ByteOrder.LITTLE_ENDIAN)
      {
        this.wP.write(paramShort >>> 0 & 0xFF);
        this.wP.write(paramShort >>> 8 & 0xFF);
      }
      while (true)
      {
        return;
        if (this.wO == ByteOrder.BIG_ENDIAN)
        {
          this.wP.write(paramShort >>> 8 & 0xFF);
          this.wP.write(paramShort >>> 0 & 0xFF);
        }
      }
    }
  }

  static final class c
  {
    public final int format;
    public final int wQ;
    public final byte[] wR;

    c(int paramInt1, int paramInt2, byte[] paramArrayOfByte)
    {
      this.format = paramInt1;
      this.wQ = paramInt2;
      this.wR = paramArrayOfByte;
    }

    public static c E(String paramString)
    {
      paramString = (paramString + '\000').getBytes(a.cK());
      return new c(2, paramString.length, paramString);
    }

    public static c a(int paramInt, ByteOrder paramByteOrder)
    {
      return a(new int[] { paramInt }, paramByteOrder);
    }

    public static c a(long paramLong, ByteOrder paramByteOrder)
    {
      return a(new long[] { paramLong }, paramByteOrder);
    }

    public static c a(a.e parame, ByteOrder paramByteOrder)
    {
      return a(new a.e[] { parame }, paramByteOrder);
    }

    public static c a(double[] paramArrayOfDouble, ByteOrder paramByteOrder)
    {
      ByteBuffer localByteBuffer = ByteBuffer.wrap(new byte[a.wb[12] * paramArrayOfDouble.length]);
      localByteBuffer.order(paramByteOrder);
      int i = paramArrayOfDouble.length;
      for (int j = 0; j < i; j++)
        localByteBuffer.putDouble(paramArrayOfDouble[j]);
      return new c(12, paramArrayOfDouble.length, localByteBuffer.array());
    }

    public static c a(int[] paramArrayOfInt, ByteOrder paramByteOrder)
    {
      ByteBuffer localByteBuffer = ByteBuffer.wrap(new byte[a.wb[3] * paramArrayOfInt.length]);
      localByteBuffer.order(paramByteOrder);
      int i = paramArrayOfInt.length;
      for (int j = 0; j < i; j++)
        localByteBuffer.putShort((short)paramArrayOfInt[j]);
      return new c(3, paramArrayOfInt.length, localByteBuffer.array());
    }

    public static c a(long[] paramArrayOfLong, ByteOrder paramByteOrder)
    {
      ByteBuffer localByteBuffer = ByteBuffer.wrap(new byte[a.wb[4] * paramArrayOfLong.length]);
      localByteBuffer.order(paramByteOrder);
      int i = paramArrayOfLong.length;
      for (int j = 0; j < i; j++)
        localByteBuffer.putInt((int)paramArrayOfLong[j]);
      return new c(4, paramArrayOfLong.length, localByteBuffer.array());
    }

    public static c a(a.e[] paramArrayOfe, ByteOrder paramByteOrder)
    {
      ByteBuffer localByteBuffer = ByteBuffer.wrap(new byte[a.wb[5] * paramArrayOfe.length]);
      localByteBuffer.order(paramByteOrder);
      int i = paramArrayOfe.length;
      for (int j = 0; j < i; j++)
      {
        paramByteOrder = paramArrayOfe[j];
        localByteBuffer.putInt((int)paramByteOrder.wU);
        localByteBuffer.putInt((int)paramByteOrder.wV);
      }
      return new c(5, paramArrayOfe.length, localByteBuffer.array());
    }

    public static c b(int[] paramArrayOfInt, ByteOrder paramByteOrder)
    {
      ByteBuffer localByteBuffer = ByteBuffer.wrap(new byte[a.wb[9] * paramArrayOfInt.length]);
      localByteBuffer.order(paramByteOrder);
      int i = paramArrayOfInt.length;
      for (int j = 0; j < i; j++)
        localByteBuffer.putInt(paramArrayOfInt[j]);
      return new c(9, paramArrayOfInt.length, localByteBuffer.array());
    }

    public static c b(a.e[] paramArrayOfe, ByteOrder paramByteOrder)
    {
      ByteBuffer localByteBuffer = ByteBuffer.wrap(new byte[a.wb[10] * paramArrayOfe.length]);
      localByteBuffer.order(paramByteOrder);
      int i = paramArrayOfe.length;
      for (int j = 0; j < i; j++)
      {
        paramByteOrder = paramArrayOfe[j];
        localByteBuffer.putInt((int)paramByteOrder.wU);
        localByteBuffer.putInt((int)paramByteOrder.wV);
      }
      return new c(10, paramArrayOfe.length, localByteBuffer.array());
    }

    // ERROR //
    final Object a(ByteOrder paramByteOrder)
    {
      // Byte code:
      //   0: iconst_1
      //   1: istore_2
      //   2: iconst_0
      //   3: istore_3
      //   4: iconst_0
      //   5: istore 4
      //   7: iconst_0
      //   8: istore 5
      //   10: iconst_0
      //   11: istore 6
      //   13: iconst_0
      //   14: istore 7
      //   16: iconst_0
      //   17: istore 8
      //   19: new 112	android/support/d/a$a
      //   22: astore 9
      //   24: aload 9
      //   26: aload_0
      //   27: getfield 23	android/support/d/a$c:wR	[B
      //   30: invokespecial 115	android/support/d/a$a:<init>	([B)V
      //   33: aload 9
      //   35: aload_1
      //   36: putfield 119	android/support/d/a$a:wO	Ljava/nio/ByteOrder;
      //   39: aload_0
      //   40: getfield 19	android/support/d/a$c:format	I
      //   43: istore 10
      //   45: iload 10
      //   47: tableswitch	default:+61 -> 108, 1:+70->117, 2:+163->210, 3:+315->362, 4:+359->406, 5:+406->453, 6:+70->117, 7:+163->210, 8:+467->514, 9:+515->562, 10:+563->610, 11:+626->673, 12:+675->722
      //   109: lconst_0
      //   110: invokevirtual 122	android/support/d/a$a:close	()V
      //   113: aconst_null
      //   114: astore_1
      //   115: aload_1
      //   116: areturn
      //   117: aload_0
      //   118: getfield 23	android/support/d/a$c:wR	[B
      //   121: arraylength
      //   122: iconst_1
      //   123: if_icmpne +59 -> 182
      //   126: aload_0
      //   127: getfield 23	android/support/d/a$c:wR	[B
      //   130: iconst_0
      //   131: baload
      //   132: iflt +50 -> 182
      //   135: aload_0
      //   136: getfield 23	android/support/d/a$c:wR	[B
      //   139: iconst_0
      //   140: baload
      //   141: iconst_1
      //   142: if_icmpgt +40 -> 182
      //   145: new 49	java/lang/String
      //   148: dup
      //   149: iconst_1
      //   150: newarray char
      //   152: dup
      //   153: iconst_0
      //   154: aload_0
      //   155: getfield 23	android/support/d/a$c:wR	[B
      //   158: iconst_0
      //   159: baload
      //   160: bipush 48
      //   162: iadd
      //   163: i2c
      //   164: castore
      //   165: invokespecial 125	java/lang/String:<init>	([C)V
      //   168: astore_1
      //   169: aload 9
      //   171: invokevirtual 122	android/support/d/a$a:close	()V
      //   174: goto -59 -> 115
      //   177: astore 9
      //   179: goto -64 -> 115
      //   182: new 49	java/lang/String
      //   185: dup
      //   186: aload_0
      //   187: getfield 23	android/support/d/a$c:wR	[B
      //   190: invokestatic 47	android/support/d/a:cK	()Ljava/nio/charset/Charset;
      //   193: invokespecial 128	java/lang/String:<init>	([BLjava/nio/charset/Charset;)V
      //   196: astore_1
      //   197: aload 9
      //   199: invokevirtual 122	android/support/d/a$a:close	()V
      //   202: goto -87 -> 115
      //   205: astore 9
      //   207: goto -92 -> 115
      //   210: aload_0
      //   211: getfield 21	android/support/d/a$c:wQ	I
      //   214: invokestatic 131	android/support/d/a:cL	()[B
      //   217: arraylength
      //   218: if_icmplt +591 -> 809
      //   221: iconst_0
      //   222: istore 8
      //   224: iload_2
      //   225: istore_3
      //   226: iload 8
      //   228: invokestatic 131	android/support/d/a:cL	()[B
      //   231: arraylength
      //   232: if_icmpge +21 -> 253
      //   235: aload_0
      //   236: getfield 23	android/support/d/a$c:wR	[B
      //   239: iload 8
      //   241: baload
      //   242: invokestatic 131	android/support/d/a:cL	()[B
      //   245: iload 8
      //   247: baload
      //   248: if_icmpeq +63 -> 311
      //   251: iconst_0
      //   252: istore_3
      //   253: iload_3
      //   254: ifeq +555 -> 809
      //   257: invokestatic 131	android/support/d/a:cL	()[B
      //   260: arraylength
      //   261: istore 8
      //   263: new 31	java/lang/StringBuilder
      //   266: astore_1
      //   267: aload_1
      //   268: invokespecial 32	java/lang/StringBuilder:<init>	()V
      //   271: iload 8
      //   273: aload_0
      //   274: getfield 21	android/support/d/a$c:wQ	I
      //   277: if_icmpge +67 -> 344
      //   280: aload_0
      //   281: getfield 23	android/support/d/a$c:wR	[B
      //   284: iload 8
      //   286: baload
      //   287: istore_3
      //   288: iload_3
      //   289: ifeq +55 -> 344
      //   292: iload_3
      //   293: bipush 32
      //   295: if_icmplt +22 -> 317
      //   298: aload_1
      //   299: iload_3
      //   300: i2c
      //   301: invokevirtual 39	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
      //   304: pop
      //   305: iinc 8 1
      //   308: goto -37 -> 271
      //   311: iinc 8 1
      //   314: goto -90 -> 224
      //   317: aload_1
      //   318: bipush 63
      //   320: invokevirtual 39	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
      //   323: pop
      //   324: goto -19 -> 305
      //   327: astore_1
      //   328: aload 9
      //   330: astore_1
      //   331: aload_1
      //   332: ifnull +7 -> 339
      //   335: aload_1
      //   336: invokevirtual 122	android/support/d/a$a:close	()V
      //   339: aconst_null
      //   340: astore_1
      //   341: goto -226 -> 115
      //   344: aload_1
      //   345: invokevirtual 43	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   348: astore_1
      //   349: aload 9
      //   351: invokevirtual 122	android/support/d/a$a:close	()V
      //   354: goto -239 -> 115
      //   357: astore 9
      //   359: goto -244 -> 115
      //   362: aload_0
      //   363: getfield 21	android/support/d/a$c:wQ	I
      //   366: newarray int
      //   368: astore_1
      //   369: iload 8
      //   371: aload_0
      //   372: getfield 21	android/support/d/a$c:wQ	I
      //   375: if_icmpge +18 -> 393
      //   378: aload_1
      //   379: iload 8
      //   381: aload 9
      //   383: invokevirtual 135	android/support/d/a$a:readUnsignedShort	()I
      //   386: iastore
      //   387: iinc 8 1
      //   390: goto -21 -> 369
      //   393: aload 9
      //   395: invokevirtual 122	android/support/d/a$a:close	()V
      //   398: goto -283 -> 115
      //   401: astore 9
      //   403: goto -288 -> 115
      //   406: aload_0
      //   407: getfield 21	android/support/d/a$c:wQ	I
      //   410: newarray long
      //   412: astore_1
      //   413: iload_3
      //   414: istore 8
      //   416: iload 8
      //   418: aload_0
      //   419: getfield 21	android/support/d/a$c:wQ	I
      //   422: if_icmpge +18 -> 440
      //   425: aload_1
      //   426: iload 8
      //   428: aload 9
      //   430: invokevirtual 139	android/support/d/a$a:cM	()J
      //   433: lastore
      //   434: iinc 8 1
      //   437: goto -21 -> 416
      //   440: aload 9
      //   442: invokevirtual 122	android/support/d/a$a:close	()V
      //   445: goto -330 -> 115
      //   448: astore 9
      //   450: goto -335 -> 115
      //   453: aload_0
      //   454: getfield 21	android/support/d/a$c:wQ	I
      //   457: anewarray 65	android/support/d/a$e
      //   460: astore_1
      //   461: iconst_0
      //   462: istore 8
      //   464: iload 8
      //   466: aload_0
      //   467: getfield 21	android/support/d/a$c:wQ	I
      //   470: if_icmpge +31 -> 501
      //   473: aload_1
      //   474: iload 8
      //   476: new 65	android/support/d/a$e
      //   479: dup
      //   480: aload 9
      //   482: invokevirtual 139	android/support/d/a$a:cM	()J
      //   485: aload 9
      //   487: invokevirtual 139	android/support/d/a$a:cM	()J
      //   490: iconst_0
      //   491: invokespecial 142	android/support/d/a$e:<init>	(JJB)V
      //   494: aastore
      //   495: iinc 8 1
      //   498: goto -34 -> 464
      //   501: aload 9
      //   503: invokevirtual 122	android/support/d/a$a:close	()V
      //   506: goto -391 -> 115
      //   509: astore 9
      //   511: goto -396 -> 115
      //   514: aload_0
      //   515: getfield 21	android/support/d/a$c:wQ	I
      //   518: newarray int
      //   520: astore_1
      //   521: iload 4
      //   523: istore 8
      //   525: iload 8
      //   527: aload_0
      //   528: getfield 21	android/support/d/a$c:wQ	I
      //   531: if_icmpge +18 -> 549
      //   534: aload_1
      //   535: iload 8
      //   537: aload 9
      //   539: invokevirtual 146	android/support/d/a$a:readShort	()S
      //   542: iastore
      //   543: iinc 8 1
      //   546: goto -21 -> 525
      //   549: aload 9
      //   551: invokevirtual 122	android/support/d/a$a:close	()V
      //   554: goto -439 -> 115
      //   557: astore 9
      //   559: goto -444 -> 115
      //   562: aload_0
      //   563: getfield 21	android/support/d/a$c:wQ	I
      //   566: newarray int
      //   568: astore_1
      //   569: iload 5
      //   571: istore 8
      //   573: iload 8
      //   575: aload_0
      //   576: getfield 21	android/support/d/a$c:wQ	I
      //   579: if_icmpge +18 -> 597
      //   582: aload_1
      //   583: iload 8
      //   585: aload 9
      //   587: invokevirtual 149	android/support/d/a$a:readInt	()I
      //   590: iastore
      //   591: iinc 8 1
      //   594: goto -21 -> 573
      //   597: aload 9
      //   599: invokevirtual 122	android/support/d/a$a:close	()V
      //   602: goto -487 -> 115
      //   605: astore 9
      //   607: goto -492 -> 115
      //   610: aload_0
      //   611: getfield 21	android/support/d/a$c:wQ	I
      //   614: anewarray 65	android/support/d/a$e
      //   617: astore_1
      //   618: iconst_0
      //   619: istore 8
      //   621: iload 8
      //   623: aload_0
      //   624: getfield 21	android/support/d/a$c:wQ	I
      //   627: if_icmpge +33 -> 660
      //   630: aload_1
      //   631: iload 8
      //   633: new 65	android/support/d/a$e
      //   636: dup
      //   637: aload 9
      //   639: invokevirtual 149	android/support/d/a$a:readInt	()I
      //   642: i2l
      //   643: aload 9
      //   645: invokevirtual 149	android/support/d/a$a:readInt	()I
      //   648: i2l
      //   649: iconst_0
      //   650: invokespecial 142	android/support/d/a$e:<init>	(JJB)V
      //   653: aastore
      //   654: iinc 8 1
      //   657: goto -36 -> 621
      //   660: aload 9
      //   662: invokevirtual 122	android/support/d/a$a:close	()V
      //   665: goto -550 -> 115
      //   668: astore 9
      //   670: goto -555 -> 115
      //   673: aload_0
      //   674: getfield 21	android/support/d/a$c:wQ	I
      //   677: newarray double
      //   679: astore_1
      //   680: iload 6
      //   682: istore 8
      //   684: iload 8
      //   686: aload_0
      //   687: getfield 21	android/support/d/a$c:wQ	I
      //   690: if_icmpge +19 -> 709
      //   693: aload_1
      //   694: iload 8
      //   696: aload 9
      //   698: invokevirtual 153	android/support/d/a$a:readFloat	()F
      //   701: f2d
      //   702: dastore
      //   703: iinc 8 1
      //   706: goto -22 -> 684
      //   709: aload 9
      //   711: invokevirtual 122	android/support/d/a$a:close	()V
      //   714: goto -599 -> 115
      //   717: astore 9
      //   719: goto -604 -> 115
      //   722: aload_0
      //   723: getfield 21	android/support/d/a$c:wQ	I
      //   726: newarray double
      //   728: astore_1
      //   729: iload 7
      //   731: istore 8
      //   733: iload 8
      //   735: aload_0
      //   736: getfield 21	android/support/d/a$c:wQ	I
      //   739: if_icmpge +18 -> 757
      //   742: aload_1
      //   743: iload 8
      //   745: aload 9
      //   747: invokevirtual 157	android/support/d/a$a:readDouble	()D
      //   750: dastore
      //   751: iinc 8 1
      //   754: goto -21 -> 733
      //   757: aload 9
      //   759: invokevirtual 122	android/support/d/a$a:close	()V
      //   762: goto -647 -> 115
      //   765: astore 9
      //   767: goto -652 -> 115
      //   770: astore_1
      //   771: aconst_null
      //   772: astore 9
      //   774: aload 9
      //   776: ifnull +8 -> 784
      //   779: aload 9
      //   781: invokevirtual 122	android/support/d/a$a:close	()V
      //   784: aload_1
      //   785: athrow
      //   786: astore_1
      //   787: goto -674 -> 113
      //   790: astore_1
      //   791: goto -452 -> 339
      //   794: astore 9
      //   796: goto -12 -> 784
      //   799: astore_1
      //   800: goto -26 -> 774
      //   803: astore_1
      //   804: aconst_null
      //   805: astore_1
      //   806: goto -475 -> 331
      //   809: iconst_0
      //   810: istore 8
      //   812: goto -549 -> 263
      //
      // Exception table:
      //   from	to	target	type
      //   169	174	177	java/io/IOException
      //   197	202	205	java/io/IOException
      //   33	45	327	java/io/IOException
      //   117	169	327	java/io/IOException
      //   182	197	327	java/io/IOException
      //   210	221	327	java/io/IOException
      //   226	251	327	java/io/IOException
      //   257	263	327	java/io/IOException
      //   263	271	327	java/io/IOException
      //   271	288	327	java/io/IOException
      //   298	305	327	java/io/IOException
      //   317	324	327	java/io/IOException
      //   344	349	327	java/io/IOException
      //   362	369	327	java/io/IOException
      //   369	387	327	java/io/IOException
      //   406	413	327	java/io/IOException
      //   416	434	327	java/io/IOException
      //   453	461	327	java/io/IOException
      //   464	495	327	java/io/IOException
      //   514	521	327	java/io/IOException
      //   525	543	327	java/io/IOException
      //   562	569	327	java/io/IOException
      //   573	591	327	java/io/IOException
      //   610	618	327	java/io/IOException
      //   621	654	327	java/io/IOException
      //   673	680	327	java/io/IOException
      //   684	703	327	java/io/IOException
      //   722	729	327	java/io/IOException
      //   733	751	327	java/io/IOException
      //   349	354	357	java/io/IOException
      //   393	398	401	java/io/IOException
      //   440	445	448	java/io/IOException
      //   501	506	509	java/io/IOException
      //   549	554	557	java/io/IOException
      //   597	602	605	java/io/IOException
      //   660	665	668	java/io/IOException
      //   709	714	717	java/io/IOException
      //   757	762	765	java/io/IOException
      //   19	33	770	finally
      //   108	113	786	java/io/IOException
      //   335	339	790	java/io/IOException
      //   779	784	794	java/io/IOException
      //   33	45	799	finally
      //   117	169	799	finally
      //   182	197	799	finally
      //   210	221	799	finally
      //   226	251	799	finally
      //   257	263	799	finally
      //   263	271	799	finally
      //   271	288	799	finally
      //   298	305	799	finally
      //   317	324	799	finally
      //   344	349	799	finally
      //   362	369	799	finally
      //   369	387	799	finally
      //   406	413	799	finally
      //   416	434	799	finally
      //   453	461	799	finally
      //   464	495	799	finally
      //   514	521	799	finally
      //   525	543	799	finally
      //   562	569	799	finally
      //   573	591	799	finally
      //   610	618	799	finally
      //   621	654	799	finally
      //   673	680	799	finally
      //   684	703	799	finally
      //   722	729	799	finally
      //   733	751	799	finally
      //   19	33	803	java/io/IOException
    }

    public final double b(ByteOrder paramByteOrder)
    {
      paramByteOrder = a(paramByteOrder);
      if (paramByteOrder == null)
        throw new NumberFormatException("NULL can't be converted to a double value");
      double d;
      if ((paramByteOrder instanceof String))
        d = Double.parseDouble((String)paramByteOrder);
      while (true)
      {
        return d;
        if ((paramByteOrder instanceof long[]))
        {
          paramByteOrder = (long[])paramByteOrder;
          if (paramByteOrder.length == 1)
            d = paramByteOrder[0];
          else
            throw new NumberFormatException("There are more than one component");
        }
        else if ((paramByteOrder instanceof int[]))
        {
          paramByteOrder = (int[])paramByteOrder;
          if (paramByteOrder.length == 1)
            d = paramByteOrder[0];
          else
            throw new NumberFormatException("There are more than one component");
        }
        else if ((paramByteOrder instanceof double[]))
        {
          paramByteOrder = (double[])paramByteOrder;
          if (paramByteOrder.length == 1)
            d = paramByteOrder[0];
          else
            throw new NumberFormatException("There are more than one component");
        }
        else
        {
          if (!(paramByteOrder instanceof a.e[]))
            break label182;
          paramByteOrder = (a.e[])paramByteOrder;
          if (paramByteOrder.length != 1)
            break;
          d = paramByteOrder[0].cN();
        }
      }
      throw new NumberFormatException("There are more than one component");
      label182: throw new NumberFormatException("Couldn't find a double value");
    }

    public final int c(ByteOrder paramByteOrder)
    {
      paramByteOrder = a(paramByteOrder);
      if (paramByteOrder == null)
        throw new NumberFormatException("NULL can't be converted to a integer value");
      int i;
      if ((paramByteOrder instanceof String))
        i = Integer.parseInt((String)paramByteOrder);
      while (true)
      {
        return i;
        if ((paramByteOrder instanceof long[]))
        {
          paramByteOrder = (long[])paramByteOrder;
          if (paramByteOrder.length == 1)
            i = (int)paramByteOrder[0];
          else
            throw new NumberFormatException("There are more than one component");
        }
        else
        {
          if (!(paramByteOrder instanceof int[]))
            break label108;
          paramByteOrder = (int[])paramByteOrder;
          if (paramByteOrder.length != 1)
            break;
          i = paramByteOrder[0];
        }
      }
      throw new NumberFormatException("There are more than one component");
      label108: throw new NumberFormatException("Couldn't find a integer value");
    }

    public final String d(ByteOrder paramByteOrder)
    {
      int i = 0;
      int j = 0;
      int k = 0;
      int m = 0;
      Object localObject = a(paramByteOrder);
      if (localObject == null)
        paramByteOrder = null;
      while (true)
      {
        return paramByteOrder;
        if ((localObject instanceof String))
        {
          paramByteOrder = (String)localObject;
        }
        else
        {
          paramByteOrder = new StringBuilder();
          if ((localObject instanceof long[]))
          {
            localObject = (long[])localObject;
            while (m < localObject.length)
            {
              paramByteOrder.append(localObject[m]);
              if (m + 1 != localObject.length)
                paramByteOrder.append(",");
              m++;
            }
            paramByteOrder = paramByteOrder.toString();
          }
          else if ((localObject instanceof int[]))
          {
            localObject = (int[])localObject;
            for (m = i; m < localObject.length; m++)
            {
              paramByteOrder.append(localObject[m]);
              if (m + 1 != localObject.length)
                paramByteOrder.append(",");
            }
            paramByteOrder = paramByteOrder.toString();
          }
          else if ((localObject instanceof double[]))
          {
            localObject = (double[])localObject;
            for (m = j; m < localObject.length; m++)
            {
              paramByteOrder.append(localObject[m]);
              if (m + 1 != localObject.length)
                paramByteOrder.append(",");
            }
            paramByteOrder = paramByteOrder.toString();
          }
          else if ((localObject instanceof a.e[]))
          {
            localObject = (a.e[])localObject;
            for (m = k; m < localObject.length; m++)
            {
              paramByteOrder.append(localObject[m].wU);
              paramByteOrder.append('/');
              paramByteOrder.append(localObject[m].wV);
              if (m + 1 != localObject.length)
                paramByteOrder.append(",");
            }
            paramByteOrder = paramByteOrder.toString();
          }
          else
          {
            paramByteOrder = null;
          }
        }
      }
    }

    public final int size()
    {
      return a.wb[this.format] * this.wQ;
    }

    public final String toString()
    {
      return "(" + a.wa[this.format] + ", data length:" + this.wR.length + ")";
    }
  }

  static final class d
  {
    public final String name;
    public final int number;
    public final int wS;
    public final int wT;

    private d(String paramString, int paramInt)
    {
      this.name = paramString;
      this.number = paramInt;
      this.wS = 3;
      this.wT = 4;
    }

    private d(String paramString, int paramInt1, int paramInt2)
    {
      this.name = paramString;
      this.number = paramInt1;
      this.wS = paramInt2;
      this.wT = -1;
    }

    final boolean an(int paramInt)
    {
      boolean bool1 = true;
      boolean bool2 = bool1;
      if (this.wS != 7)
      {
        if (paramInt != 7)
          break label23;
        bool2 = bool1;
      }
      while (true)
      {
        return bool2;
        label23: bool2 = bool1;
        if (this.wS != paramInt)
        {
          bool2 = bool1;
          if (this.wT != paramInt)
            if ((this.wS == 4) || (this.wT == 4))
            {
              bool2 = bool1;
              if (paramInt == 3);
            }
            else if ((this.wS == 9) || (this.wT == 9))
            {
              bool2 = bool1;
              if (paramInt == 8);
            }
            else if ((this.wS == 12) || (this.wT == 12))
            {
              bool2 = bool1;
              if (paramInt == 11);
            }
            else
            {
              bool2 = false;
            }
        }
      }
    }
  }

  static final class e
  {
    public final long wU;
    public final long wV;

    private e(double paramDouble)
    {
      this(()(10000.0D * paramDouble), 10000L);
    }

    private e(long paramLong1, long paramLong2)
    {
      if (paramLong2 == 0L)
        this.wU = 0L;
      for (this.wV = 1L; ; this.wV = paramLong2)
      {
        return;
        this.wU = paramLong1;
      }
    }

    public final double cN()
    {
      return this.wU / this.wV;
    }

    public final String toString()
    {
      return this.wU + "/" + this.wV;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.d.a
 * JD-Core Version:    0.6.2
 */