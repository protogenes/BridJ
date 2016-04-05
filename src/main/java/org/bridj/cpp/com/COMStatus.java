package org.bridj.cpp.com;

/*
	All named COM HRESULT values from https://msdn.microsoft.com/en-us/library/cc704587.aspx
 */
public class COMStatus extends RuntimeException {
	public static final int S_OK                                                                  = 0;
	public static final int S_FALSE                                                               = 1;
	public static final int STG_S_CONVERTED                                                       = 0x00030200;
	public static final int STG_S_BLOCK                                                           = 0x00030201;
	public static final int STG_S_RETRYNOW                                                        = 0x00030202;
	public static final int STG_S_MONITORING                                                      = 0x00030203;
	public static final int STG_S_MULTIPLEOPENS                                                   = 0x00030204;
	public static final int STG_S_CONSOLIDATIONFAILED                                             = 0x00030205;
	public static final int STG_S_CANNOTCONSOLIDATE                                               = 0x00030206;
	public static final int OLE_S_USEREG                                                          = 0x00040000;
	public static final int OLE_S_STATIC                                                          = 0x00040001;
	public static final int OLE_S_MAC_CLIPFORMAT                                                  = 0x00040002;
	public static final int DRAGDROP_S_DROP                                                       = 0x00040100;
	public static final int DRAGDROP_S_CANCEL                                                     = 0x00040101;
	public static final int DRAGDROP_S_USEDEFAULTCURSORS                                          = 0x00040102;
	public static final int DATA_S_SAMEFORMATETC                                                  = 0x00040130;
	public static final int VIEW_S_ALREADY_FROZEN                                                 = 0x00040140;
	public static final int CACHE_S_FORMATETC_NOTSUPPORTED                                        = 0x00040170;
	public static final int CACHE_S_SAMECACHE                                                     = 0x00040171;
	public static final int CACHE_S_SOMECACHES_NOTUPDATED                                         = 0x00040172;
	public static final int OLEOBJ_S_INVALIDVERB                                                  = 0x00040180;
	public static final int OLEOBJ_S_CANNOT_DOVERB_NOW                                            = 0x00040181;
	public static final int OLEOBJ_S_INVALIDHWND                                                  = 0x00040182;
	public static final int INPLACE_S_TRUNCATED                                                   = 0x000401A0;
	public static final int CONVERT10_S_NO_PRESENTATION                                           = 0x000401C0;
	public static final int MK_S_REDUCED_TO_SELF                                                  = 0x000401E2;
	public static final int MK_S_ME                                                               = 0x000401E4;
	public static final int MK_S_HIM                                                              = 0x000401E5;
	public static final int MK_S_US                                                               = 0x000401E6;
	public static final int MK_S_MONIKERALREADYREGISTERED                                         = 0x000401E7;
	public static final int EVENT_S_SOME_SUBSCRIBERS_FAILED                                       = 0x00040200;
	public static final int EVENT_S_NOSUBSCRIBERS                                                 = 0x00040202;
	public static final int SCHED_S_TASK_READY                                                    = 0x00041300;
	public static final int SCHED_S_TASK_RUNNING                                                  = 0x00041301;
	public static final int SCHED_S_TASK_DISABLED                                                 = 0x00041302;
	public static final int SCHED_S_TASK_HAS_NOT_RUN                                              = 0x00041303;
	public static final int SCHED_S_TASK_NO_MORE_RUNS                                             = 0x00041304;
	public static final int SCHED_S_TASK_NOT_SCHEDULED                                            = 0x00041305;
	public static final int SCHED_S_TASK_TERMINATED                                               = 0x00041306;
	public static final int SCHED_S_TASK_NO_VALID_TRIGGERS                                        = 0x00041307;
	public static final int SCHED_S_EVENT_TRIGGER                                                 = 0x00041308;
	public static final int SCHED_S_SOME_TRIGGERS_FAILED                                          = 0x0004131B;
	public static final int SCHED_S_BATCH_LOGON_PROBLEM                                           = 0x0004131C;
	public static final int XACT_S_ASYNC                                                          = 0x0004D000;
	public static final int XACT_S_READONLY                                                       = 0x0004D002;
	public static final int XACT_S_SOMENORETAIN                                                   = 0x0004D003;
	public static final int XACT_S_OKINFORM                                                       = 0x0004D004;
	public static final int XACT_S_MADECHANGESCONTENT                                             = 0x0004D005;
	public static final int XACT_S_MADECHANGESINFORM                                              = 0x0004D006;
	public static final int XACT_S_ALLNORETAIN                                                    = 0x0004D007;
	public static final int XACT_S_ABORTING                                                       = 0x0004D008;
	public static final int XACT_S_SINGLEPHASE                                                    = 0x0004D009;
	public static final int XACT_S_LOCALLY_OK                                                     = 0x0004D00A;
	public static final int XACT_S_LASTRESOURCEMANAGER                                            = 0x0004D010;
	public static final int CO_S_NOTALLINTERFACES                                                 = 0x00080012;
	public static final int CO_S_MACHINENAMENOTFOUND                                              = 0x00080013;
	public static final int SEC_I_CONTINUE_NEEDED                                                 = 0x00090312;
	public static final int SEC_I_COMPLETE_NEEDED                                                 = 0x00090313;
	public static final int SEC_I_COMPLETE_AND_CONTINUE                                           = 0x00090314;
	public static final int SEC_I_LOCAL_LOGON                                                     = 0x00090315;
	public static final int SEC_I_CONTEXT_EXPIRED                                                 = 0x00090317;
	public static final int SEC_I_INCOMPLETE_CREDENTIALS                                          = 0x00090320;
	public static final int SEC_I_RENEGOTIATE                                                     = 0x00090321;
	public static final int SEC_I_NO_LSA_CONTEXT                                                  = 0x00090323;
	public static final int SEC_I_SIGNATURE_NEEDED                                                = 0x0009035C;
	public static final int CRYPT_I_NEW_PROTECTION_REQUIRED                                       = 0x00091012;
	public static final int NS_S_CALLPENDING                                                      = 0x000D0000;
	public static final int NS_S_CALLABORTED                                                      = 0x000D0001;
	public static final int NS_S_STREAM_TRUNCATED                                                 = 0x000D0002;
	public static final int NS_S_REBUFFERING                                                      = 0x000D0BC8;
	public static final int NS_S_DEGRADING_QUALITY                                                = 0x000D0BC9;
	public static final int NS_S_TRANSCRYPTOR_EOF                                                 = 0x000D0BDB;
	public static final int NS_S_WMP_UI_VERSIONMISMATCH                                           = 0x000D0FE8;
	public static final int NS_S_WMP_EXCEPTION                                                    = 0x000D0FE9;
	public static final int NS_S_WMP_LOADED_GIF_IMAGE                                             = 0x000D1040;
	public static final int NS_S_WMP_LOADED_PNG_IMAGE                                             = 0x000D1041;
	public static final int NS_S_WMP_LOADED_BMP_IMAGE                                             = 0x000D1042;
	public static final int NS_S_WMP_LOADED_JPG_IMAGE                                             = 0x000D1043;
	public static final int NS_S_WMG_FORCE_DROP_FRAME                                             = 0x000D104F;
	public static final int NS_S_WMR_ALREADYRENDERED                                              = 0x000D105F;
	public static final int NS_S_WMR_PINTYPEPARTIALMATCH                                          = 0x000D1060;
	public static final int NS_S_WMR_PINTYPEFULLMATCH                                             = 0x000D1061;
	public static final int NS_S_WMG_ADVISE_DROP_FRAME                                            = 0x000D1066;
	public static final int NS_S_WMG_ADVISE_DROP_TO_KEYFRAME                                      = 0x000D1067;
	public static final int NS_S_NEED_TO_BUY_BURN_RIGHTS                                          = 0x000D10DB;
	public static final int NS_S_WMPCORE_PLAYLISTCLEARABORT                                       = 0x000D10FE;
	public static final int NS_S_WMPCORE_PLAYLISTREMOVEITEMABORT                                  = 0x000D10FF;
	public static final int NS_S_WMPCORE_PLAYLIST_CREATION_PENDING                                = 0x000D1102;
	public static final int NS_S_WMPCORE_MEDIA_VALIDATION_PENDING                                 = 0x000D1103;
	public static final int NS_S_WMPCORE_PLAYLIST_REPEAT_SECONDARY_SEGMENTS_IGNORED               = 0x000D1104;
	public static final int NS_S_WMPCORE_COMMAND_NOT_AVAILABLE                                    = 0x000D1105;
	public static final int NS_S_WMPCORE_PLAYLIST_NAME_AUTO_GENERATED                             = 0x000D1106;
	public static final int NS_S_WMPCORE_PLAYLIST_IMPORT_MISSING_ITEMS                            = 0x000D1107;
	public static final int NS_S_WMPCORE_PLAYLIST_COLLAPSED_TO_SINGLE_MEDIA                       = 0x000D1108;
	public static final int NS_S_WMPCORE_MEDIA_CHILD_PLAYLIST_OPEN_PENDING                        = 0x000D1109;
	public static final int NS_S_WMPCORE_MORE_NODES_AVAIABLE                                      = 0x000D110A;
	public static final int NS_S_WMPBR_SUCCESS                                                    = 0x000D1135;
	public static final int NS_S_WMPBR_PARTIALSUCCESS                                             = 0x000D1136;
	public static final int NS_S_WMPEFFECT_TRANSPARENT                                            = 0x000D1144;
	public static final int NS_S_WMPEFFECT_OPAQUE                                                 = 0x000D1145;
	public static final int NS_S_OPERATION_PENDING                                                = 0x000D114E;
	public static final int NS_S_TRACK_BUY_REQUIRES_ALBUM_PURCHASE                                = 0x000D1359;
	public static final int NS_S_NAVIGATION_COMPLETE_WITH_ERRORS                                  = 0x000D135E;
	public static final int NS_S_TRACK_ALREADY_DOWNLOADED                                         = 0x000D1361;
	public static final int NS_S_PUBLISHING_POINT_STARTED_WITH_FAILED_SINKS                       = 0x000D1519;
	public static final int NS_S_DRM_LICENSE_ACQUIRED                                             = 0x000D2726;
	public static final int NS_S_DRM_INDIVIDUALIZED                                               = 0x000D2727;
	public static final int NS_S_DRM_MONITOR_CANCELLED                                            = 0x000D2746;
	public static final int NS_S_DRM_ACQUIRE_CANCELLED                                            = 0x000D2747;
	public static final int NS_S_DRM_BURNABLE_TRACK                                               = 0x000D276E;
	public static final int NS_S_DRM_BURNABLE_TRACK_WITH_PLAYLIST_RESTRICTION                     = 0x000D276F;
	public static final int NS_S_DRM_NEEDS_INDIVIDUALIZATION                                      = 0x000D27DE;
	public static final int NS_S_REBOOT_RECOMMENDED                                               = 0x000D2AF8;
	public static final int NS_S_REBOOT_REQUIRED                                                  = 0x000D2AF9;
	public static final int NS_S_EOSRECEDING                                                      = 0x000D2F09;
	public static final int NS_S_CHANGENOTICE                                                     = 0x000D2F0D;
	public static final int ERROR_FLT_IO_COMPLETE                                                 = 0x001F0001;
	public static final int ERROR_GRAPHICS_MODE_NOT_PINNED                                        = 0x00262307;
	public static final int ERROR_GRAPHICS_NO_PREFERRED_MODE                                      = 0x0026231E;
	public static final int ERROR_GRAPHICS_DATASET_IS_EMPTY                                       = 0x0026234B;
	public static final int ERROR_GRAPHICS_NO_MORE_ELEMENTS_IN_DATASET                            = 0x0026234C;
	public static final int ERROR_GRAPHICS_PATH_CONTENT_GEOMETRY_TRANSFORMATION_NOT_PINNED        = 0x00262351;
	public static final int PLA_S_PROPERTY_IGNORED                                                = 0x00300100;
	public static final int ERROR_NDIS_INDICATION_REQUIRED                                        = 0x00340001;
	public static final int TRK_S_OUT_OF_SYNC                                                     = 0x0DEAD100;
	public static final int TRK_VOLUME_NOT_FOUND                                                  = 0x0DEAD102;
	public static final int TRK_VOLUME_NOT_OWNED                                                  = 0x0DEAD103;
	public static final int TRK_S_NOTIFICATION_QUOTA_EXCEEDED                                     = 0x0DEAD107;
	public static final int NS_I_TIGER_START                                                      = 0x400D004F;
	public static final int NS_I_CUB_START                                                        = 0x400D0051;
	public static final int NS_I_CUB_RUNNING                                                      = 0x400D0052;
	public static final int NS_I_DISK_START                                                       = 0x400D0054;
	public static final int NS_I_DISK_REBUILD_STARTED                                             = 0x400D0056;
	public static final int NS_I_DISK_REBUILD_FINISHED                                            = 0x400D0057;
	public static final int NS_I_DISK_REBUILD_ABORTED                                             = 0x400D0058;
	public static final int NS_I_LIMIT_FUNNELS                                                    = 0x400D0059;
	public static final int NS_I_START_DISK                                                       = 0x400D005A;
	public static final int NS_I_STOP_DISK                                                        = 0x400D005B;
	public static final int NS_I_STOP_CUB                                                         = 0x400D005C;
	public static final int NS_I_KILL_USERSESSION                                                 = 0x400D005D;
	public static final int NS_I_KILL_CONNECTION                                                  = 0x400D005E;
	public static final int NS_I_REBUILD_DISK                                                     = 0x400D005F;
	public static final int MCMADM_I_NO_EVENTS                                                    = 0x400D0069;
	public static final int NS_I_LOGGING_FAILED                                                   = 0x400D006E;
	public static final int NS_I_LIMIT_BANDWIDTH                                                  = 0x400D0070;
	public static final int NS_I_CUB_UNFAIL_LINK                                                  = 0x400D0191;
	public static final int NS_I_RESTRIPE_START                                                   = 0x400D0193;
	public static final int NS_I_RESTRIPE_DONE                                                    = 0x400D0194;
	public static final int NS_I_RESTRIPE_DISK_OUT                                                = 0x400D0196;
	public static final int NS_I_RESTRIPE_CUB_OUT                                                 = 0x400D0197;
	public static final int NS_I_DISK_STOP                                                        = 0x400D0198;
	public static final int NS_I_PLAYLIST_CHANGE_RECEDING                                         = 0x400D14BE;
	public static final int NS_I_RECONNECTED                                                      = 0x400D2EFF;
	public static final int NS_I_NOLOG_STOP                                                       = 0x400D2F01;
	public static final int NS_I_EXISTING_PACKETIZER                                              = 0x400D2F03;
	public static final int NS_I_MANUAL_PROXY                                                     = 0x400D2F04;
	public static final int ERROR_GRAPHICS_DRIVER_MISMATCH                                        = 0x40262009;
	public static final int ERROR_GRAPHICS_UNKNOWN_CHILD_STATUS                                   = 0x4026242F;
	public static final int ERROR_GRAPHICS_LEADLINK_START_DEFERRED                                = 0x40262437;
	public static final int ERROR_GRAPHICS_POLLING_TOO_FREQUENTLY                                 = 0x40262439;
	public static final int ERROR_GRAPHICS_START_DEFERRED                                         = 0x4026243A;
	public static final int E_PENDING                                                             = 0x8000000A;
	public static final int E_NOTIMPL                                                             = 0x80004001;
	public static final int E_NOINTERFACE                                                         = 0x80004002;
	public static final int E_POINTER                                                             = 0x80004003;
	public static final int E_ABORT                                                               = 0x80004004;
	public static final int E_FAIL                                                                = 0x80004005;
	public static final int CO_E_INIT_TLS                                                         = 0x80004006;
	public static final int CO_E_INIT_SHARED_ALLOCATOR                                            = 0x80004007;
	public static final int CO_E_INIT_MEMORY_ALLOCATOR                                            = 0x80004008;
	public static final int CO_E_INIT_CLASS_CACHE                                                 = 0x80004009;
	public static final int CO_E_INIT_RPC_CHANNEL                                                 = 0x8000400A;
	public static final int CO_E_INIT_TLS_SET_CHANNEL_CONTROL                                     = 0x8000400B;
	public static final int CO_E_INIT_TLS_CHANNEL_CONTROL                                         = 0x8000400C;
	public static final int CO_E_INIT_UNACCEPTED_USER_ALLOCATOR                                   = 0x8000400D;
	public static final int CO_E_INIT_SCM_MUTEX_EXISTS                                            = 0x8000400E;
	public static final int CO_E_INIT_SCM_FILE_MAPPING_EXISTS                                     = 0x8000400F;
	public static final int CO_E_INIT_SCM_MAP_VIEW_OF_FILE                                        = 0x80004010;
	public static final int CO_E_INIT_SCM_EXEC_FAILURE                                            = 0x80004011;
	public static final int CO_E_INIT_ONLY_SINGLE_THREADED                                        = 0x80004012;
	public static final int CO_E_CANT_REMOTE                                                      = 0x80004013;
	public static final int CO_E_BAD_SERVER_NAME                                                  = 0x80004014;
	public static final int CO_E_WRONG_SERVER_IDENTITY                                            = 0x80004015;
	public static final int CO_E_OLE1DDE_DISABLED                                                 = 0x80004016;
	public static final int CO_E_RUNAS_SYNTAX                                                     = 0x80004017;
	public static final int CO_E_CREATEPROCESS_FAILURE                                            = 0x80004018;
	public static final int CO_E_RUNAS_CREATEPROCESS_FAILURE                                      = 0x80004019;
	public static final int CO_E_RUNAS_LOGON_FAILURE                                              = 0x8000401A;
	public static final int CO_E_LAUNCH_PERMSSION_DENIED                                          = 0x8000401B;
	public static final int CO_E_START_SERVICE_FAILURE                                            = 0x8000401C;
	public static final int CO_E_REMOTE_COMMUNICATION_FAILURE                                     = 0x8000401D;
	public static final int CO_E_SERVER_START_TIMEOUT                                             = 0x8000401E;
	public static final int CO_E_CLSREG_INCONSISTENT                                              = 0x8000401F;
	public static final int CO_E_IIDREG_INCONSISTENT                                              = 0x80004020;
	public static final int CO_E_NOT_SUPPORTED                                                    = 0x80004021;
	public static final int CO_E_RELOAD_DLL                                                       = 0x80004022;
	public static final int CO_E_MSI_ERROR                                                        = 0x80004023;
	public static final int CO_E_ATTEMPT_TO_CREATE_OUTSIDE_CLIENT_CONTEXT                         = 0x80004024;
	public static final int CO_E_SERVER_PAUSED                                                    = 0x80004025;
	public static final int CO_E_SERVER_NOT_PAUSED                                                = 0x80004026;
	public static final int CO_E_CLASS_DISABLED                                                   = 0x80004027;
	public static final int CO_E_CLRNOTAVAILABLE                                                  = 0x80004028;
	public static final int CO_E_ASYNC_WORK_REJECTED                                              = 0x80004029;
	public static final int CO_E_SERVER_INIT_TIMEOUT                                              = 0x8000402A;
	public static final int CO_E_NO_SECCTX_IN_ACTIVATE                                            = 0x8000402B;
	public static final int CO_E_TRACKER_CONFIG                                                   = 0x80004030;
	public static final int CO_E_THREADPOOL_CONFIG                                                = 0x80004031;
	public static final int CO_E_SXS_CONFIG                                                       = 0x80004032;
	public static final int CO_E_MALFORMED_SPN                                                    = 0x80004033;
	public static final int E_UNEXPECTED                                                          = 0x8000FFFF;
	public static final int RPC_E_CALL_REJECTED                                                   = 0x80010001;
	public static final int RPC_E_CALL_CANCELED                                                   = 0x80010002;
	public static final int RPC_E_CANTPOST_INSENDCALL                                             = 0x80010003;
	public static final int RPC_E_CANTCALLOUT_INASYNCCALL                                         = 0x80010004;
	public static final int RPC_E_CANTCALLOUT_INEXTERNALCALL                                      = 0x80010005;
	public static final int RPC_E_CONNECTION_TERMINATED                                           = 0x80010006;
	public static final int RPC_E_SERVER_DIED                                                     = 0x80010007;
	public static final int RPC_E_CLIENT_DIED                                                     = 0x80010008;
	public static final int RPC_E_INVALID_DATAPACKET                                              = 0x80010009;
	public static final int RPC_E_CANTTRANSMIT_CALL                                               = 0x8001000A;
	public static final int RPC_E_CLIENT_CANTMARSHAL_DATA                                         = 0x8001000B;
	public static final int RPC_E_CLIENT_CANTUNMARSHAL_DATA                                       = 0x8001000C;
	public static final int RPC_E_SERVER_CANTMARSHAL_DATA                                         = 0x8001000D;
	public static final int RPC_E_SERVER_CANTUNMARSHAL_DATA                                       = 0x8001000E;
	public static final int RPC_E_INVALID_DATA                                                    = 0x8001000F;
	public static final int RPC_E_INVALID_PARAMETER                                               = 0x80010010;
	public static final int RPC_E_CANTCALLOUT_AGAIN                                               = 0x80010011;
	public static final int RPC_E_SERVER_DIED_DNE                                                 = 0x80010012;
	public static final int RPC_E_SYS_CALL_FAILED                                                 = 0x80010100;
	public static final int RPC_E_OUT_OF_RESOURCES                                                = 0x80010101;
	public static final int RPC_E_ATTEMPTED_MULTITHREAD                                           = 0x80010102;
	public static final int RPC_E_NOT_REGISTERED                                                  = 0x80010103;
	public static final int RPC_E_FAULT                                                           = 0x80010104;
	public static final int RPC_E_SERVERFAULT                                                     = 0x80010105;
	public static final int RPC_E_CHANGED_MODE                                                    = 0x80010106;
	public static final int RPC_E_INVALIDMETHOD                                                   = 0x80010107;
	public static final int RPC_E_DISCONNECTED                                                    = 0x80010108;
	public static final int RPC_E_RETRY                                                           = 0x80010109;
	public static final int RPC_E_SERVERCALL_RETRYLATER                                           = 0x8001010A;
	public static final int RPC_E_SERVERCALL_REJECTED                                             = 0x8001010B;
	public static final int RPC_E_INVALID_CALLDATA                                                = 0x8001010C;
	public static final int RPC_E_CANTCALLOUT_ININPUTSYNCCALL                                     = 0x8001010D;
	public static final int RPC_E_WRONG_THREAD                                                    = 0x8001010E;
	public static final int RPC_E_THREAD_NOT_INIT                                                 = 0x8001010F;
	public static final int RPC_E_VERSION_MISMATCH                                                = 0x80010110;
	public static final int RPC_E_INVALID_HEADER                                                  = 0x80010111;
	public static final int RPC_E_INVALID_EXTENSION                                               = 0x80010112;
	public static final int RPC_E_INVALID_IPID                                                    = 0x80010113;
	public static final int RPC_E_INVALID_OBJECT                                                  = 0x80010114;
	public static final int RPC_S_CALLPENDING                                                     = 0x80010115;
	public static final int RPC_S_WAITONTIMER                                                     = 0x80010116;
	public static final int RPC_E_CALL_COMPLETE                                                   = 0x80010117;
	public static final int RPC_E_UNSECURE_CALL                                                   = 0x80010118;
	public static final int RPC_E_TOO_LATE                                                        = 0x80010119;
	public static final int RPC_E_NO_GOOD_SECURITY_PACKAGES                                       = 0x8001011A;
	public static final int RPC_E_ACCESS_DENIED                                                   = 0x8001011B;
	public static final int RPC_E_REMOTE_DISABLED                                                 = 0x8001011C;
	public static final int RPC_E_INVALID_OBJREF                                                  = 0x8001011D;
	public static final int RPC_E_NO_CONTEXT                                                      = 0x8001011E;
	public static final int RPC_E_TIMEOUT                                                         = 0x8001011F;
	public static final int RPC_E_NO_SYNC                                                         = 0x80010120;
	public static final int RPC_E_FULLSIC_REQUIRED                                                = 0x80010121;
	public static final int RPC_E_INVALID_STD_NAME                                                = 0x80010122;
	public static final int CO_E_FAILEDTOIMPERSONATE                                              = 0x80010123;
	public static final int CO_E_FAILEDTOGETSECCTX                                                = 0x80010124;
	public static final int CO_E_FAILEDTOOPENTHREADTOKEN                                          = 0x80010125;
	public static final int CO_E_FAILEDTOGETTOKENINFO                                             = 0x80010126;
	public static final int CO_E_TRUSTEEDOESNTMATCHCLIENT                                         = 0x80010127;
	public static final int CO_E_FAILEDTOQUERYCLIENTBLANKET                                       = 0x80010128;
	public static final int CO_E_FAILEDTOSETDACL                                                  = 0x80010129;
	public static final int CO_E_ACCESSCHECKFAILED                                                = 0x8001012A;
	public static final int CO_E_NETACCESSAPIFAILED                                               = 0x8001012B;
	public static final int CO_E_WRONGTRUSTEENAMESYNTAX                                           = 0x8001012C;
	public static final int CO_E_INVALIDSID                                                       = 0x8001012D;
	public static final int CO_E_CONVERSIONFAILED                                                 = 0x8001012E;
	public static final int CO_E_NOMATCHINGSIDFOUND                                               = 0x8001012F;
	public static final int CO_E_LOOKUPACCSIDFAILED                                               = 0x80010130;
	public static final int CO_E_NOMATCHINGNAMEFOUND                                              = 0x80010131;
	public static final int CO_E_LOOKUPACCNAMEFAILED                                              = 0x80010132;
	public static final int CO_E_SETSERLHNDLFAILED                                                = 0x80010133;
	public static final int CO_E_FAILEDTOGETWINDIR                                                = 0x80010134;
	public static final int CO_E_PATHTOOLONG                                                      = 0x80010135;
	public static final int CO_E_FAILEDTOGENUUID                                                  = 0x80010136;
	public static final int CO_E_FAILEDTOCREATEFILE                                               = 0x80010137;
	public static final int CO_E_FAILEDTOCLOSEHANDLE                                              = 0x80010138;
	public static final int CO_E_EXCEEDSYSACLLIMIT                                                = 0x80010139;
	public static final int CO_E_ACESINWRONGORDER                                                 = 0x8001013A;
	public static final int CO_E_INCOMPATIBLESTREAMVERSION                                        = 0x8001013B;
	public static final int CO_E_FAILEDTOOPENPROCESSTOKEN                                         = 0x8001013C;
	public static final int CO_E_DECODEFAILED                                                     = 0x8001013D;
	public static final int CO_E_ACNOTINITIALIZED                                                 = 0x8001013F;
	public static final int CO_E_CANCEL_DISABLED                                                  = 0x80010140;
	public static final int RPC_E_UNEXPECTED                                                      = 0x8001FFFF;
	public static final int DISP_E_UNKNOWNINTERFACE                                               = 0x80020001;
	public static final int DISP_E_MEMBERNOTFOUND                                                 = 0x80020003;
	public static final int DISP_E_PARAMNOTFOUND                                                  = 0x80020004;
	public static final int DISP_E_TYPEMISMATCH                                                   = 0x80020005;
	public static final int DISP_E_UNKNOWNNAME                                                    = 0x80020006;
	public static final int DISP_E_NONAMEDARGS                                                    = 0x80020007;
	public static final int DISP_E_BADVARTYPE                                                     = 0x80020008;
	public static final int DISP_E_EXCEPTION                                                      = 0x80020009;
	public static final int DISP_E_OVERFLOW                                                       = 0x8002000A;
	public static final int DISP_E_BADINDEX                                                       = 0x8002000B;
	public static final int DISP_E_UNKNOWNLCID                                                    = 0x8002000C;
	public static final int DISP_E_ARRAYISLOCKED                                                  = 0x8002000D;
	public static final int DISP_E_BADPARAMCOUNT                                                  = 0x8002000E;
	public static final int DISP_E_PARAMNOTOPTIONAL                                               = 0x8002000F;
	public static final int DISP_E_BADCALLEE                                                      = 0x80020010;
	public static final int DISP_E_NOTACOLLECTION                                                 = 0x80020011;
	public static final int DISP_E_DIVBYZERO                                                      = 0x80020012;
	public static final int DISP_E_BUFFERTOOSMALL                                                 = 0x80020013;
	public static final int TYPE_E_BUFFERTOOSMALL                                                 = 0x80028016;
	public static final int TYPE_E_FIELDNOTFOUND                                                  = 0x80028017;
	public static final int TYPE_E_INVDATAREAD                                                    = 0x80028018;
	public static final int TYPE_E_UNSUPFORMAT                                                    = 0x80028019;
	public static final int TYPE_E_REGISTRYACCESS                                                 = 0x8002801C;
	public static final int TYPE_E_LIBNOTREGISTERED                                               = 0x8002801D;
	public static final int TYPE_E_UNDEFINEDTYPE                                                  = 0x80028027;
	public static final int TYPE_E_QUALIFIEDNAMEDISALLOWED                                        = 0x80028028;
	public static final int TYPE_E_INVALIDSTATE                                                   = 0x80028029;
	public static final int TYPE_E_WRONGTYPEKIND                                                  = 0x8002802A;
	public static final int TYPE_E_ELEMENTNOTFOUND                                                = 0x8002802B;
	public static final int TYPE_E_AMBIGUOUSNAME                                                  = 0x8002802C;
	public static final int TYPE_E_NAMECONFLICT                                                   = 0x8002802D;
	public static final int TYPE_E_UNKNOWNLCID                                                    = 0x8002802E;
	public static final int TYPE_E_DLLFUNCTIONNOTFOUND                                            = 0x8002802F;
	public static final int TYPE_E_BADMODULEKIND                                                  = 0x800288BD;
	public static final int TYPE_E_SIZETOOBIG                                                     = 0x800288C5;
	public static final int TYPE_E_DUPLICATEID                                                    = 0x800288C6;
	public static final int TYPE_E_INVALIDID                                                      = 0x800288CF;
	public static final int TYPE_E_TYPEMISMATCH                                                   = 0x80028CA0;
	public static final int TYPE_E_OUTOFBOUNDS                                                    = 0x80028CA1;
	public static final int TYPE_E_IOERROR                                                        = 0x80028CA2;
	public static final int TYPE_E_CANTCREATETMPFILE                                              = 0x80028CA3;
	public static final int TYPE_E_CANTLOADLIBRARY                                                = 0x80029C4A;
	public static final int TYPE_E_INCONSISTENTPROPFUNCS                                          = 0x80029C83;
	public static final int TYPE_E_CIRCULARTYPE                                                   = 0x80029C84;
	public static final int STG_E_INVALIDFUNCTION                                                 = 0x80030001;
	public static final int STG_E_FILENOTFOUND                                                    = 0x80030002;
	public static final int STG_E_PATHNOTFOUND                                                    = 0x80030003;
	public static final int STG_E_TOOMANYOPENFILES                                                = 0x80030004;
	public static final int STG_E_ACCESSDENIED                                                    = 0x80030005;
	public static final int STG_E_INVALIDHANDLE                                                   = 0x80030006;
	public static final int STG_E_INSUFFICIENTMEMORY                                              = 0x80030008;
	public static final int STG_E_INVALIDPOINTER                                                  = 0x80030009;
	public static final int STG_E_NOMOREFILES                                                     = 0x80030012;
	public static final int STG_E_DISKISWRITEPROTECTED                                            = 0x80030013;
	public static final int STG_E_SEEKERROR                                                       = 0x80030019;
	public static final int STG_E_WRITEFAULT                                                      = 0x8003001D;
	public static final int STG_E_READFAULT                                                       = 0x8003001E;
	public static final int STG_E_SHAREVIOLATION                                                  = 0x80030020;
	public static final int STG_E_LOCKVIOLATION                                                   = 0x80030021;
	public static final int STG_E_FILEALREADYEXISTS                                               = 0x80030050;
	public static final int STG_E_INVALIDPARAMETER                                                = 0x80030057;
	public static final int STG_E_MEDIUMFULL                                                      = 0x80030070;
	public static final int STG_E_PROPSETMISMATCHED                                               = 0x800300F0;
	public static final int STG_E_ABNORMALAPIEXIT                                                 = 0x800300FA;
	public static final int STG_E_INVALIDHEADER                                                   = 0x800300FB;
	public static final int STG_E_INVALIDNAME                                                     = 0x800300FC;
	public static final int STG_E_UNKNOWN                                                         = 0x800300FD;
	public static final int STG_E_UNIMPLEMENTEDFUNCTION                                           = 0x800300FE;
	public static final int STG_E_INVALIDFLAG                                                     = 0x800300FF;
	public static final int STG_E_INUSE                                                           = 0x80030100;
	public static final int STG_E_NOTCURRENT                                                      = 0x80030101;
	public static final int STG_E_REVERTED                                                        = 0x80030102;
	public static final int STG_E_CANTSAVE                                                        = 0x80030103;
	public static final int STG_E_OLDFORMAT                                                       = 0x80030104;
	public static final int STG_E_OLDDLL                                                          = 0x80030105;
	public static final int STG_E_SHAREREQUIRED                                                   = 0x80030106;
	public static final int STG_E_NOTFILEBASEDSTORAGE                                             = 0x80030107;
	public static final int STG_E_EXTANTMARSHALLINGS                                              = 0x80030108;
	public static final int STG_E_DOCFILECORRUPT                                                  = 0x80030109;
	public static final int STG_E_BADBASEADDRESS                                                  = 0x80030110;
	public static final int STG_E_DOCFILETOOLARGE                                                 = 0x80030111;
	public static final int STG_E_NOTSIMPLEFORMAT                                                 = 0x80030112;
	public static final int STG_E_INCOMPLETE                                                      = 0x80030201;
	public static final int STG_E_TERMINATED                                                      = 0x80030202;
	public static final int STG_E_STATUS_COPY_PROTECTION_FAILURE                                  = 0x80030305;
	public static final int STG_E_CSS_AUTHENTICATION_FAILURE                                      = 0x80030306;
	public static final int STG_E_CSS_KEY_NOT_PRESENT                                             = 0x80030307;
	public static final int STG_E_CSS_KEY_NOT_ESTABLISHED                                         = 0x80030308;
	public static final int STG_E_CSS_SCRAMBLED_SECTOR                                            = 0x80030309;
	public static final int STG_E_CSS_REGION_MISMATCH                                             = 0x8003030A;
	public static final int STG_E_RESETS_EXHAUSTED                                                = 0x8003030B;
	public static final int OLE_E_OLEVERB                                                         = 0x80040000;
	public static final int OLE_E_ADVF                                                            = 0x80040001;
	public static final int OLE_E_ENUM_NOMORE                                                     = 0x80040002;
	public static final int OLE_E_ADVISENOTSUPPORTED                                              = 0x80040003;
	public static final int OLE_E_NOCONNECTION                                                    = 0x80040004;
	public static final int OLE_E_NOTRUNNING                                                      = 0x80040005;
	public static final int OLE_E_NOCACHE                                                         = 0x80040006;
	public static final int OLE_E_BLANK                                                           = 0x80040007;
	public static final int OLE_E_CLASSDIFF                                                       = 0x80040008;
	public static final int OLE_E_CANT_GETMONIKER                                                 = 0x80040009;
	public static final int OLE_E_CANT_BINDTOSOURCE                                               = 0x8004000A;
	public static final int OLE_E_STATIC                                                          = 0x8004000B;
	public static final int OLE_E_PROMPTSAVECANCELLED                                             = 0x8004000C;
	public static final int OLE_E_INVALIDRECT                                                     = 0x8004000D;
	public static final int OLE_E_WRONGCOMPOBJ                                                    = 0x8004000E;
	public static final int OLE_E_INVALIDHWND                                                     = 0x8004000F;
	public static final int OLE_E_NOT_INPLACEACTIVE                                               = 0x80040010;
	public static final int OLE_E_CANTCONVERT                                                     = 0x80040011;
	public static final int OLE_E_NOSTORAGE                                                       = 0x80040012;
	public static final int DV_E_FORMATETC                                                        = 0x80040064;
	public static final int DV_E_DVTARGETDEVICE                                                   = 0x80040065;
	public static final int DV_E_STGMEDIUM                                                        = 0x80040066;
	public static final int DV_E_STATDATA                                                         = 0x80040067;
	public static final int DV_E_LINDEX                                                           = 0x80040068;
	public static final int DV_E_TYMED                                                            = 0x80040069;
	public static final int DV_E_CLIPFORMAT                                                       = 0x8004006A;
	public static final int DV_E_DVASPECT                                                         = 0x8004006B;
	public static final int DV_E_DVTARGETDEVICE_SIZE                                              = 0x8004006C;
	public static final int DV_E_NOIVIEWOBJECT                                                    = 0x8004006D;
	public static final int DRAGDROP_E_NOTREGISTERED                                              = 0x80040100;
	public static final int DRAGDROP_E_ALREADYREGISTERED                                          = 0x80040101;
	public static final int DRAGDROP_E_INVALIDHWND                                                = 0x80040102;
	public static final int CLASS_E_NOAGGREGATION                                                 = 0x80040110;
	public static final int CLASS_E_CLASSNOTAVAILABLE                                             = 0x80040111;
	public static final int CLASS_E_NOTLICENSED                                                   = 0x80040112;
	public static final int VIEW_E_DRAW                                                           = 0x80040140;
	public static final int REGDB_E_READREGDB                                                     = 0x80040150;
	public static final int REGDB_E_WRITEREGDB                                                    = 0x80040151;
	public static final int REGDB_E_KEYMISSING                                                    = 0x80040152;
	public static final int REGDB_E_INVALIDVALUE                                                  = 0x80040153;
	public static final int REGDB_E_CLASSNOTREG                                                   = 0x80040154;
	public static final int REGDB_E_IIDNOTREG                                                     = 0x80040155;
	public static final int REGDB_E_BADTHREADINGMODEL                                             = 0x80040156;
	public static final int CAT_E_CATIDNOEXIST                                                    = 0x80040160;
	public static final int CAT_E_NODESCRIPTION                                                   = 0x80040161;
	public static final int CS_E_PACKAGE_NOTFOUND                                                 = 0x80040164;
	public static final int CS_E_NOT_DELETABLE                                                    = 0x80040165;
	public static final int CS_E_CLASS_NOTFOUND                                                   = 0x80040166;
	public static final int CS_E_INVALID_VERSION                                                  = 0x80040167;
	public static final int CS_E_NO_CLASSSTORE                                                    = 0x80040168;
	public static final int CS_E_OBJECT_NOTFOUND                                                  = 0x80040169;
	public static final int CS_E_OBJECT_ALREADY_EXISTS                                            = 0x8004016A;
	public static final int CS_E_INVALID_PATH                                                     = 0x8004016B;
	public static final int CS_E_NETWORK_ERROR                                                    = 0x8004016C;
	public static final int CS_E_ADMIN_LIMIT_EXCEEDED                                             = 0x8004016D;
	public static final int CS_E_SCHEMA_MISMATCH                                                  = 0x8004016E;
	public static final int CS_E_INTERNAL_ERROR                                                   = 0x8004016F;
	public static final int CACHE_E_NOCACHE_UPDATED                                               = 0x80040170;
	public static final int OLEOBJ_E_NOVERBS                                                      = 0x80040180;
	public static final int OLEOBJ_E_INVALIDVERB                                                  = 0x80040181;
	public static final int INPLACE_E_NOTUNDOABLE                                                 = 0x800401A0;
	public static final int INPLACE_E_NOTOOLSPACE                                                 = 0x800401A1;
	public static final int CONVERT10_E_OLESTREAM_GET                                             = 0x800401C0;
	public static final int CONVERT10_E_OLESTREAM_PUT                                             = 0x800401C1;
	public static final int CONVERT10_E_OLESTREAM_FMT                                             = 0x800401C2;
	public static final int CONVERT10_E_OLESTREAM_BITMAP_TO_DIB                                   = 0x800401C3;
	public static final int CONVERT10_E_STG_FMT                                                   = 0x800401C4;
	public static final int CONVERT10_E_STG_NO_STD_STREAM                                         = 0x800401C5;
	public static final int CONVERT10_E_STG_DIB_TO_BITMAP                                         = 0x800401C6;
	public static final int CLIPBRD_E_CANT_OPEN                                                   = 0x800401D0;
	public static final int CLIPBRD_E_CANT_EMPTY                                                  = 0x800401D1;
	public static final int CLIPBRD_E_CANT_SET                                                    = 0x800401D2;
	public static final int CLIPBRD_E_BAD_DATA                                                    = 0x800401D3;
	public static final int CLIPBRD_E_CANT_CLOSE                                                  = 0x800401D4;
	public static final int MK_E_CONNECTMANUALLY                                                  = 0x800401E0;
	public static final int MK_E_EXCEEDEDDEADLINE                                                 = 0x800401E1;
	public static final int MK_E_NEEDGENERIC                                                      = 0x800401E2;
	public static final int MK_E_UNAVAILABLE                                                      = 0x800401E3;
	public static final int MK_E_SYNTAX                                                           = 0x800401E4;
	public static final int MK_E_NOOBJECT                                                         = 0x800401E5;
	public static final int MK_E_INVALIDEXTENSION                                                 = 0x800401E6;
	public static final int MK_E_INTERMEDIATEINTERFACENOTSUPPORTED                                = 0x800401E7;
	public static final int MK_E_NOTBINDABLE                                                      = 0x800401E8;
	public static final int MK_E_NOTBOUND                                                         = 0x800401E9;
	public static final int MK_E_CANTOPENFILE                                                     = 0x800401EA;
	public static final int MK_E_MUSTBOTHERUSER                                                   = 0x800401EB;
	public static final int MK_E_NOINVERSE                                                        = 0x800401EC;
	public static final int MK_E_NOSTORAGE                                                        = 0x800401ED;
	public static final int MK_E_NOPREFIX                                                         = 0x800401EE;
	public static final int MK_E_ENUMERATION_FAILED                                               = 0x800401EF;
	public static final int CO_E_NOTINITIALIZED                                                   = 0x800401F0;
	public static final int CO_E_ALREADYINITIALIZED                                               = 0x800401F1;
	public static final int CO_E_CANTDETERMINECLASS                                               = 0x800401F2;
	public static final int CO_E_CLASSSTRING                                                      = 0x800401F3;
	public static final int CO_E_IIDSTRING                                                        = 0x800401F4;
	public static final int CO_E_APPNOTFOUND                                                      = 0x800401F5;
	public static final int CO_E_APPSINGLEUSE                                                     = 0x800401F6;
	public static final int CO_E_ERRORINAPP                                                       = 0x800401F7;
	public static final int CO_E_DLLNOTFOUND                                                      = 0x800401F8;
	public static final int CO_E_ERRORINDLL                                                       = 0x800401F9;
	public static final int CO_E_WRONGOSFORAPP                                                    = 0x800401FA;
	public static final int CO_E_OBJNOTREG                                                        = 0x800401FB;
	public static final int CO_E_OBJISREG                                                         = 0x800401FC;
	public static final int CO_E_OBJNOTCONNECTED                                                  = 0x800401FD;
	public static final int CO_E_APPDIDNTREG                                                      = 0x800401FE;
	public static final int CO_E_RELEASED                                                         = 0x800401FF;
	public static final int EVENT_E_ALL_SUBSCRIBERS_FAILED                                        = 0x80040201;
	public static final int EVENT_E_QUERYSYNTAX                                                   = 0x80040203;
	public static final int EVENT_E_QUERYFIELD                                                    = 0x80040204;
	public static final int EVENT_E_INTERNALEXCEPTION                                             = 0x80040205;
	public static final int EVENT_E_INTERNALERROR                                                 = 0x80040206;
	public static final int EVENT_E_INVALID_PER_USER_SID                                          = 0x80040207;
	public static final int EVENT_E_USER_EXCEPTION                                                = 0x80040208;
	public static final int EVENT_E_TOO_MANY_METHODS                                              = 0x80040209;
	public static final int EVENT_E_MISSING_EVENTCLASS                                            = 0x8004020A;
	public static final int EVENT_E_NOT_ALL_REMOVED                                               = 0x8004020B;
	public static final int EVENT_E_COMPLUS_NOT_INSTALLED                                         = 0x8004020C;
	public static final int EVENT_E_CANT_MODIFY_OR_DELETE_UNCONFIGURED_OBJECT                     = 0x8004020D;
	public static final int EVENT_E_CANT_MODIFY_OR_DELETE_CONFIGURED_OBJECT                       = 0x8004020E;
	public static final int EVENT_E_INVALID_EVENT_CLASS_PARTITION                                 = 0x8004020F;
	public static final int EVENT_E_PER_USER_SID_NOT_LOGGED_ON                                    = 0x80040210;
	public static final int SCHED_E_TRIGGER_NOT_FOUND                                             = 0x80041309;
	public static final int SCHED_E_TASK_NOT_READY                                                = 0x8004130A;
	public static final int SCHED_E_TASK_NOT_RUNNING                                              = 0x8004130B;
	public static final int SCHED_E_SERVICE_NOT_INSTALLED                                         = 0x8004130C;
	public static final int SCHED_E_CANNOT_OPEN_TASK                                              = 0x8004130D;
	public static final int SCHED_E_INVALID_TASK                                                  = 0x8004130E;
	public static final int SCHED_E_ACCOUNT_INFORMATION_NOT_SET                                   = 0x8004130F;
	public static final int SCHED_E_ACCOUNT_NAME_NOT_FOUND                                        = 0x80041310;
	public static final int SCHED_E_ACCOUNT_DBASE_CORRUPT                                         = 0x80041311;
	public static final int SCHED_E_NO_SECURITY_SERVICES                                          = 0x80041312;
	public static final int SCHED_E_UNKNOWN_OBJECT_VERSION                                        = 0x80041313;
	public static final int SCHED_E_UNSUPPORTED_ACCOUNT_OPTION                                    = 0x80041314;
	public static final int SCHED_E_SERVICE_NOT_RUNNING                                           = 0x80041315;
	public static final int SCHED_E_UNEXPECTEDNODE                                                = 0x80041316;
	public static final int SCHED_E_NAMESPACE                                                     = 0x80041317;
	public static final int SCHED_E_INVALIDVALUE                                                  = 0x80041318;
	public static final int SCHED_E_MISSINGNODE                                                   = 0x80041319;
	public static final int SCHED_E_MALFORMEDXML                                                  = 0x8004131A;
	public static final int SCHED_E_TOO_MANY_NODES                                                = 0x8004131D;
	public static final int SCHED_E_PAST_END_BOUNDARY                                             = 0x8004131E;
	public static final int SCHED_E_ALREADY_RUNNING                                               = 0x8004131F;
	public static final int SCHED_E_USER_NOT_LOGGED_ON                                            = 0x80041320;
	public static final int SCHED_E_INVALID_TASK_HASH                                             = 0x80041321;
	public static final int SCHED_E_SERVICE_NOT_AVAILABLE                                         = 0x80041322;
	public static final int SCHED_E_SERVICE_TOO_BUSY                                              = 0x80041323;
	public static final int SCHED_E_TASK_ATTEMPTED                                                = 0x80041324;
	public static final int XACT_E_ALREADYOTHERSINGLEPHASE                                        = 0x8004D000;
	public static final int XACT_E_CANTRETAIN                                                     = 0x8004D001;
	public static final int XACT_E_COMMITFAILED                                                   = 0x8004D002;
	public static final int XACT_E_COMMITPREVENTED                                                = 0x8004D003;
	public static final int XACT_E_HEURISTICABORT                                                 = 0x8004D004;
	public static final int XACT_E_HEURISTICCOMMIT                                                = 0x8004D005;
	public static final int XACT_E_HEURISTICDAMAGE                                                = 0x8004D006;
	public static final int XACT_E_HEURISTICDANGER                                                = 0x8004D007;
	public static final int XACT_E_ISOLATIONLEVEL                                                 = 0x8004D008;
	public static final int XACT_E_NOASYNC                                                        = 0x8004D009;
	public static final int XACT_E_NOENLIST                                                       = 0x8004D00A;
	public static final int XACT_E_NOISORETAIN                                                    = 0x8004D00B;
	public static final int XACT_E_NORESOURCE                                                     = 0x8004D00C;
	public static final int XACT_E_NOTCURRENT                                                     = 0x8004D00D;
	public static final int XACT_E_NOTRANSACTION                                                  = 0x8004D00E;
	public static final int XACT_E_NOTSUPPORTED                                                   = 0x8004D00F;
	public static final int XACT_E_UNKNOWNRMGRID                                                  = 0x8004D010;
	public static final int XACT_E_WRONGSTATE                                                     = 0x8004D011;
	public static final int XACT_E_WRONGUOW                                                       = 0x8004D012;
	public static final int XACT_E_XTIONEXISTS                                                    = 0x8004D013;
	public static final int XACT_E_NOIMPORTOBJECT                                                 = 0x8004D014;
	public static final int XACT_E_INVALIDCOOKIE                                                  = 0x8004D015;
	public static final int XACT_E_INDOUBT                                                        = 0x8004D016;
	public static final int XACT_E_NOTIMEOUT                                                      = 0x8004D017;
	public static final int XACT_E_ALREADYINPROGRESS                                              = 0x8004D018;
	public static final int XACT_E_ABORTED                                                        = 0x8004D019;
	public static final int XACT_E_LOGFULL                                                        = 0x8004D01A;
	public static final int XACT_E_TMNOTAVAILABLE                                                 = 0x8004D01B;
	public static final int XACT_E_CONNECTION_DOWN                                                = 0x8004D01C;
	public static final int XACT_E_CONNECTION_DENIED                                              = 0x8004D01D;
	public static final int XACT_E_REENLISTTIMEOUT                                                = 0x8004D01E;
	public static final int XACT_E_TIP_CONNECT_FAILED                                             = 0x8004D01F;
	public static final int XACT_E_TIP_PROTOCOL_ERROR                                             = 0x8004D020;
	public static final int XACT_E_TIP_PULL_FAILED                                                = 0x8004D021;
	public static final int XACT_E_DEST_TMNOTAVAILABLE                                            = 0x8004D022;
	public static final int XACT_E_TIP_DISABLED                                                   = 0x8004D023;
	public static final int XACT_E_NETWORK_TX_DISABLED                                            = 0x8004D024;
	public static final int XACT_E_PARTNER_NETWORK_TX_DISABLED                                    = 0x8004D025;
	public static final int XACT_E_XA_TX_DISABLED                                                 = 0x8004D026;
	public static final int XACT_E_UNABLE_TO_READ_DTC_CONFIG                                      = 0x8004D027;
	public static final int XACT_E_UNABLE_TO_LOAD_DTC_PROXY                                       = 0x8004D028;
	public static final int XACT_E_ABORTING                                                       = 0x8004D029;
	public static final int XACT_E_CLERKNOTFOUND                                                  = 0x8004D080;
	public static final int XACT_E_CLERKEXISTS                                                    = 0x8004D081;
	public static final int XACT_E_RECOVERYINPROGRESS                                             = 0x8004D082;
	public static final int XACT_E_TRANSACTIONCLOSED                                              = 0x8004D083;
	public static final int XACT_E_INVALIDLSN                                                     = 0x8004D084;
	public static final int XACT_E_REPLAYREQUEST                                                  = 0x8004D085;
	public static final int XACT_E_CONNECTION_REQUEST_DENIED                                      = 0x8004D100;
	public static final int XACT_E_TOOMANY_ENLISTMENTS                                            = 0x8004D101;
	public static final int XACT_E_DUPLICATE_GUID                                                 = 0x8004D102;
	public static final int XACT_E_NOTSINGLEPHASE                                                 = 0x8004D103;
	public static final int XACT_E_RECOVERYALREADYDONE                                            = 0x8004D104;
	public static final int XACT_E_PROTOCOL                                                       = 0x8004D105;
	public static final int XACT_E_RM_FAILURE                                                     = 0x8004D106;
	public static final int XACT_E_RECOVERY_FAILED                                                = 0x8004D107;
	public static final int XACT_E_LU_NOT_FOUND                                                   = 0x8004D108;
	public static final int XACT_E_DUPLICATE_LU                                                   = 0x8004D109;
	public static final int XACT_E_LU_NOT_CONNECTED                                               = 0x8004D10A;
	public static final int XACT_E_DUPLICATE_TRANSID                                              = 0x8004D10B;
	public static final int XACT_E_LU_BUSY                                                        = 0x8004D10C;
	public static final int XACT_E_LU_NO_RECOVERY_PROCESS                                         = 0x8004D10D;
	public static final int XACT_E_LU_DOWN                                                        = 0x8004D10E;
	public static final int XACT_E_LU_RECOVERING                                                  = 0x8004D10F;
	public static final int XACT_E_LU_RECOVERY_MISMATCH                                           = 0x8004D110;
	public static final int XACT_E_RM_UNAVAILABLE                                                 = 0x8004D111;
	public static final int CONTEXT_E_ABORTED                                                     = 0x8004E002;
	public static final int CONTEXT_E_ABORTING                                                    = 0x8004E003;
	public static final int CONTEXT_E_NOCONTEXT                                                   = 0x8004E004;
	public static final int CONTEXT_E_WOULD_DEADLOCK                                              = 0x8004E005;
	public static final int CONTEXT_E_SYNCH_TIMEOUT                                               = 0x8004E006;
	public static final int CONTEXT_E_OLDREF                                                      = 0x8004E007;
	public static final int CONTEXT_E_ROLENOTFOUND                                                = 0x8004E00C;
	public static final int CONTEXT_E_TMNOTAVAILABLE                                              = 0x8004E00F;
	public static final int CO_E_ACTIVATIONFAILED                                                 = 0x8004E021;
	public static final int CO_E_ACTIVATIONFAILED_EVENTLOGGED                                     = 0x8004E022;
	public static final int CO_E_ACTIVATIONFAILED_CATALOGERROR                                    = 0x8004E023;
	public static final int CO_E_ACTIVATIONFAILED_TIMEOUT                                         = 0x8004E024;
	public static final int CO_E_INITIALIZATIONFAILED                                             = 0x8004E025;
	public static final int CONTEXT_E_NOJIT                                                       = 0x8004E026;
	public static final int CONTEXT_E_NOTRANSACTION                                               = 0x8004E027;
	public static final int CO_E_THREADINGMODEL_CHANGED                                           = 0x8004E028;
	public static final int CO_E_NOIISINTRINSICS                                                  = 0x8004E029;
	public static final int CO_E_NOCOOKIES                                                        = 0x8004E02A;
	public static final int CO_E_DBERROR                                                          = 0x8004E02B;
	public static final int CO_E_NOTPOOLED                                                        = 0x8004E02C;
	public static final int CO_E_NOTCONSTRUCTED                                                   = 0x8004E02D;
	public static final int CO_E_NOSYNCHRONIZATION                                                = 0x8004E02E;
	public static final int CO_E_ISOLEVELMISMATCH                                                 = 0x8004E02F;
	public static final int CO_E_CALL_OUT_OF_TX_SCOPE_NOT_ALLOWED                                 = 0x8004E030;
	public static final int CO_E_EXIT_TRANSACTION_SCOPE_NOT_CALLED                                = 0x8004E031;
	public static final int E_ACCESSDENIED                                                        = 0x80070005;
	public static final int E_OUTOFMEMORY                                                         = 0x8007000E;
	public static final int ERROR_NOT_SUPPORTED                                                   = 0x80070032;
	public static final int E_INVALIDARG                                                          = 0x80070057;
	public static final int CO_E_CLASS_CREATE_FAILED                                              = 0x80080001;
	public static final int CO_E_SCM_ERROR                                                        = 0x80080002;
	public static final int CO_E_SCM_RPC_FAILURE                                                  = 0x80080003;
	public static final int CO_E_BAD_PATH                                                         = 0x80080004;
	public static final int CO_E_SERVER_EXEC_FAILURE                                              = 0x80080005;
	public static final int CO_E_OBJSRV_RPC_FAILURE                                               = 0x80080006;
	public static final int MK_E_NO_NORMALIZED                                                    = 0x80080007;
	public static final int CO_E_SERVER_STOPPING                                                  = 0x80080008;
	public static final int MEM_E_INVALID_ROOT                                                    = 0x80080009;
	public static final int MEM_E_INVALID_LINK                                                    = 0x80080010;
	public static final int MEM_E_INVALID_SIZE                                                    = 0x80080011;
	public static final int CO_E_MISSING_DISPLAYNAME                                              = 0x80080015;
	public static final int CO_E_RUNAS_VALUE_MUST_BE_AAA                                          = 0x80080016;
	public static final int CO_E_ELEVATION_DISABLED                                               = 0x80080017;
	public static final int NTE_BAD_UID                                                           = 0x80090001;
	public static final int NTE_BAD_HASH                                                          = 0x80090002;
	public static final int NTE_BAD_KEY                                                           = 0x80090003;
	public static final int NTE_BAD_LEN                                                           = 0x80090004;
	public static final int NTE_BAD_DATA                                                          = 0x80090005;
	public static final int NTE_BAD_SIGNATURE                                                     = 0x80090006;
	public static final int NTE_BAD_VER                                                           = 0x80090007;
	public static final int NTE_BAD_ALGID                                                         = 0x80090008;
	public static final int NTE_BAD_FLAGS                                                         = 0x80090009;
	public static final int NTE_BAD_TYPE                                                          = 0x8009000A;
	public static final int NTE_BAD_KEY_STATE                                                     = 0x8009000B;
	public static final int NTE_BAD_HASH_STATE                                                    = 0x8009000C;
	public static final int NTE_NO_KEY                                                            = 0x8009000D;
	public static final int NTE_NO_MEMORY                                                         = 0x8009000E;
	public static final int NTE_EXISTS                                                            = 0x8009000F;
	public static final int NTE_PERM                                                              = 0x80090010;
	public static final int NTE_NOT_FOUND                                                         = 0x80090011;
	public static final int NTE_DOUBLE_ENCRYPT                                                    = 0x80090012;
	public static final int NTE_BAD_PROVIDER                                                      = 0x80090013;
	public static final int NTE_BAD_PROV_TYPE                                                     = 0x80090014;
	public static final int NTE_BAD_PUBLIC_KEY                                                    = 0x80090015;
	public static final int NTE_BAD_KEYSET                                                        = 0x80090016;
	public static final int NTE_PROV_TYPE_NOT_DEF                                                 = 0x80090017;
	public static final int NTE_PROV_TYPE_ENTRY_BAD                                               = 0x80090018;
	public static final int NTE_KEYSET_NOT_DEF                                                    = 0x80090019;
	public static final int NTE_KEYSET_ENTRY_BAD                                                  = 0x8009001A;
	public static final int NTE_PROV_TYPE_NO_MATCH                                                = 0x8009001B;
	public static final int NTE_SIGNATURE_FILE_BAD                                                = 0x8009001C;
	public static final int NTE_PROVIDER_DLL_FAIL                                                 = 0x8009001D;
	public static final int NTE_PROV_DLL_NOT_FOUND                                                = 0x8009001E;
	public static final int NTE_BAD_KEYSET_PARAM                                                  = 0x8009001F;
	public static final int NTE_FAIL                                                              = 0x80090020;
	public static final int NTE_SYS_ERR                                                           = 0x80090021;
	public static final int NTE_SILENT_CONTEXT                                                    = 0x80090022;
	public static final int NTE_TOKEN_KEYSET_STORAGE_FULL                                         = 0x80090023;
	public static final int NTE_TEMPORARY_PROFILE                                                 = 0x80090024;
	public static final int NTE_FIXEDPARAMETER                                                    = 0x80090025;
	public static final int NTE_INVALID_HANDLE                                                    = 0x80090026;
	public static final int NTE_INVALID_PARAMETER                                                 = 0x80090027;
	public static final int NTE_BUFFER_TOO_SMALL                                                  = 0x80090028;
	public static final int NTE_NOT_SUPPORTED                                                     = 0x80090029;
	public static final int NTE_NO_MORE_ITEMS                                                     = 0x8009002A;
	public static final int NTE_BUFFERS_OVERLAP                                                   = 0x8009002B;
	public static final int NTE_DECRYPTION_FAILURE                                                = 0x8009002C;
	public static final int NTE_INTERNAL_ERROR                                                    = 0x8009002D;
	public static final int NTE_UI_REQUIRED                                                       = 0x8009002E;
	public static final int NTE_HMAC_NOT_SUPPORTED                                                = 0x8009002F;
	public static final int SEC_E_INSUFFICIENT_MEMORY                                             = 0x80090300;
	public static final int SEC_E_INVALID_HANDLE                                                  = 0x80090301;
	public static final int SEC_E_UNSUPPORTED_FUNCTION                                            = 0x80090302;
	public static final int SEC_E_TARGET_UNKNOWN                                                  = 0x80090303;
	public static final int SEC_E_INTERNAL_ERROR                                                  = 0x80090304;
	public static final int SEC_E_SECPKG_NOT_FOUND                                                = 0x80090305;
	public static final int SEC_E_NOT_OWNER                                                       = 0x80090306;
	public static final int SEC_E_CANNOT_INSTALL                                                  = 0x80090307;
	public static final int SEC_E_INVALID_TOKEN                                                   = 0x80090308;
	public static final int SEC_E_CANNOT_PACK                                                     = 0x80090309;
	public static final int SEC_E_QOP_NOT_SUPPORTED                                               = 0x8009030A;
	public static final int SEC_E_NO_IMPERSONATION                                                = 0x8009030B;
	public static final int SEC_E_LOGON_DENIED                                                    = 0x8009030C;
	public static final int SEC_E_UNKNOWN_CREDENTIALS                                             = 0x8009030D;
	public static final int SEC_E_NO_CREDENTIALS                                                  = 0x8009030E;
	public static final int SEC_E_MESSAGE_ALTERED                                                 = 0x8009030F;
	public static final int SEC_E_OUT_OF_SEQUENCE                                                 = 0x80090310;
	public static final int SEC_E_NO_AUTHENTICATING_AUTHORITY                                     = 0x80090311;
	public static final int SEC_E_BAD_PKGID                                                       = 0x80090316;
	public static final int SEC_E_CONTEXT_EXPIRED                                                 = 0x80090317;
	public static final int SEC_E_INCOMPLETE_MESSAGE                                              = 0x80090318;
	public static final int SEC_E_INCOMPLETE_CREDENTIALS                                          = 0x80090320;
	public static final int SEC_E_BUFFER_TOO_SMALL                                                = 0x80090321;
	public static final int SEC_E_WRONG_PRINCIPAL                                                 = 0x80090322;
	public static final int SEC_E_TIME_SKEW                                                       = 0x80090324;
	public static final int SEC_E_UNTRUSTED_ROOT                                                  = 0x80090325;
	public static final int SEC_E_ILLEGAL_MESSAGE                                                 = 0x80090326;
	public static final int SEC_E_CERT_UNKNOWN                                                    = 0x80090327;
	public static final int SEC_E_CERT_EXPIRED                                                    = 0x80090328;
	public static final int SEC_E_ENCRYPT_FAILURE                                                 = 0x80090329;
	public static final int SEC_E_DECRYPT_FAILURE                                                 = 0x80090330;
	public static final int SEC_E_ALGORITHM_MISMATCH                                              = 0x80090331;
	public static final int SEC_E_SECURITY_QOS_FAILED                                             = 0x80090332;
	public static final int SEC_E_UNFINISHED_CONTEXT_DELETED                                      = 0x80090333;
	public static final int SEC_E_NO_TGT_REPLY                                                    = 0x80090334;
	public static final int SEC_E_NO_IP_ADDRESSES                                                 = 0x80090335;
	public static final int SEC_E_WRONG_CREDENTIAL_HANDLE                                         = 0x80090336;
	public static final int SEC_E_CRYPTO_SYSTEM_INVALID                                           = 0x80090337;
	public static final int SEC_E_MAX_REFERRALS_EXCEEDED                                          = 0x80090338;
	public static final int SEC_E_MUST_BE_KDC                                                     = 0x80090339;
	public static final int SEC_E_STRONG_CRYPTO_NOT_SUPPORTED                                     = 0x8009033A;
	public static final int SEC_E_TOO_MANY_PRINCIPALS                                             = 0x8009033B;
	public static final int SEC_E_NO_PA_DATA                                                      = 0x8009033C;
	public static final int SEC_E_PKINIT_NAME_MISMATCH                                            = 0x8009033D;
	public static final int SEC_E_SMARTCARD_LOGON_REQUIRED                                        = 0x8009033E;
	public static final int SEC_E_SHUTDOWN_IN_PROGRESS                                            = 0x8009033F;
	public static final int SEC_E_KDC_INVALID_REQUEST                                             = 0x80090340;
	public static final int SEC_E_KDC_UNABLE_TO_REFER                                             = 0x80090341;
	public static final int SEC_E_KDC_UNKNOWN_ETYPE                                               = 0x80090342;
	public static final int SEC_E_UNSUPPORTED_PREAUTH                                             = 0x80090343;
	public static final int SEC_E_DELEGATION_REQUIRED                                             = 0x80090345;
	public static final int SEC_E_BAD_BINDINGS                                                    = 0x80090346;
	public static final int SEC_E_MULTIPLE_ACCOUNTS                                               = 0x80090347;
	public static final int SEC_E_NO_KERB_KEY                                                     = 0x80090348;
	public static final int SEC_E_CERT_WRONG_USAGE                                                = 0x80090349;
	public static final int SEC_E_DOWNGRADE_DETECTED                                              = 0x80090350;
	public static final int SEC_E_SMARTCARD_CERT_REVOKED                                          = 0x80090351;
	public static final int SEC_E_ISSUING_CA_UNTRUSTED                                            = 0x80090352;
	public static final int SEC_E_REVOCATION_OFFLINE_C                                            = 0x80090353;
	public static final int SEC_E_PKINIT_CLIENT_FAILURE                                           = 0x80090354;
	public static final int SEC_E_SMARTCARD_CERT_EXPIRED                                          = 0x80090355;
	public static final int SEC_E_NO_S4U_PROT_SUPPORT                                             = 0x80090356;
	public static final int SEC_E_CROSSREALM_DELEGATION_FAILURE                                   = 0x80090357;
	public static final int SEC_E_REVOCATION_OFFLINE_KDC                                          = 0x80090358;
	public static final int SEC_E_ISSUING_CA_UNTRUSTED_KDC                                        = 0x80090359;
	public static final int SEC_E_KDC_CERT_EXPIRED                                                = 0x8009035A;
	public static final int SEC_E_KDC_CERT_REVOKED                                                = 0x8009035B;
	public static final int SEC_E_INVALID_PARAMETER                                               = 0x8009035D;
	public static final int SEC_E_DELEGATION_POLICY                                               = 0x8009035E;
	public static final int SEC_E_POLICY_NLTM_ONLY                                                = 0x8009035F;
	public static final int CRYPT_E_MSG_ERROR                                                     = 0x80091001;
	public static final int CRYPT_E_UNKNOWN_ALGO                                                  = 0x80091002;
	public static final int CRYPT_E_OID_FORMAT                                                    = 0x80091003;
	public static final int CRYPT_E_INVALID_MSG_TYPE                                              = 0x80091004;
	public static final int CRYPT_E_UNEXPECTED_ENCODING                                           = 0x80091005;
	public static final int CRYPT_E_AUTH_ATTR_MISSING                                             = 0x80091006;
	public static final int CRYPT_E_HASH_VALUE                                                    = 0x80091007;
	public static final int CRYPT_E_INVALID_INDEX                                                 = 0x80091008;
	public static final int CRYPT_E_ALREADY_DECRYPTED                                             = 0x80091009;
	public static final int CRYPT_E_NOT_DECRYPTED                                                 = 0x8009100A;
	public static final int CRYPT_E_RECIPIENT_NOT_FOUND                                           = 0x8009100B;
	public static final int CRYPT_E_CONTROL_TYPE                                                  = 0x8009100C;
	public static final int CRYPT_E_ISSUER_SERIALNUMBER                                           = 0x8009100D;
	public static final int CRYPT_E_SIGNER_NOT_FOUND                                              = 0x8009100E;
	public static final int CRYPT_E_ATTRIBUTES_MISSING                                            = 0x8009100F;
	public static final int CRYPT_E_STREAM_MSG_NOT_READY                                          = 0x80091010;
	public static final int CRYPT_E_STREAM_INSUFFICIENT_DATA                                      = 0x80091011;
	public static final int CRYPT_E_BAD_LEN                                                       = 0x80092001;
	public static final int CRYPT_E_BAD_ENCODE                                                    = 0x80092002;
	public static final int CRYPT_E_FILE_ERROR                                                    = 0x80092003;
	public static final int CRYPT_E_NOT_FOUND                                                     = 0x80092004;
	public static final int CRYPT_E_EXISTS                                                        = 0x80092005;
	public static final int CRYPT_E_NO_PROVIDER                                                   = 0x80092006;
	public static final int CRYPT_E_SELF_SIGNED                                                   = 0x80092007;
	public static final int CRYPT_E_DELETED_PREV                                                  = 0x80092008;
	public static final int CRYPT_E_NO_MATCH                                                      = 0x80092009;
	public static final int CRYPT_E_UNEXPECTED_MSG_TYPE                                           = 0x8009200A;
	public static final int CRYPT_E_NO_KEY_PROPERTY                                               = 0x8009200B;
	public static final int CRYPT_E_NO_DECRYPT_CERT                                               = 0x8009200C;
	public static final int CRYPT_E_BAD_MSG                                                       = 0x8009200D;
	public static final int CRYPT_E_NO_SIGNER                                                     = 0x8009200E;
	public static final int CRYPT_E_PENDING_CLOSE                                                 = 0x8009200F;
	public static final int CRYPT_E_REVOKED                                                       = 0x80092010;
	public static final int CRYPT_E_NO_REVOCATION_DLL                                             = 0x80092011;
	public static final int CRYPT_E_NO_REVOCATION_CHECK                                           = 0x80092012;
	public static final int CRYPT_E_REVOCATION_OFFLINE                                            = 0x80092013;
	public static final int CRYPT_E_NOT_IN_REVOCATION_DATABASE                                    = 0x80092014;
	public static final int CRYPT_E_INVALID_NUMERIC_STRING                                        = 0x80092020;
	public static final int CRYPT_E_INVALID_PRINTABLE_STRING                                      = 0x80092021;
	public static final int CRYPT_E_INVALID_IA5_STRING                                            = 0x80092022;
	public static final int CRYPT_E_INVALID_X500_STRING                                           = 0x80092023;
	public static final int CRYPT_E_NOT_CHAR_STRING                                               = 0x80092024;
	public static final int CRYPT_E_FILERESIZED                                                   = 0x80092025;
	public static final int CRYPT_E_SECURITY_SETTINGS                                             = 0x80092026;
	public static final int CRYPT_E_NO_VERIFY_USAGE_DLL                                           = 0x80092027;
	public static final int CRYPT_E_NO_VERIFY_USAGE_CHECK                                         = 0x80092028;
	public static final int CRYPT_E_VERIFY_USAGE_OFFLINE                                          = 0x80092029;
	public static final int CRYPT_E_NOT_IN_CTL                                                    = 0x8009202A;
	public static final int CRYPT_E_NO_TRUSTED_SIGNER                                             = 0x8009202B;
	public static final int CRYPT_E_MISSING_PUBKEY_PARA                                           = 0x8009202C;
	public static final int CRYPT_E_OSS_ERROR                                                     = 0x80093000;
	public static final int OSS_MORE_BUF                                                          = 0x80093001;
	public static final int OSS_NEGATIVE_UINTEGER                                                 = 0x80093002;
	public static final int OSS_PDU_RANGE                                                         = 0x80093003;
	public static final int OSS_MORE_INPUT                                                        = 0x80093004;
	public static final int OSS_DATA_ERROR                                                        = 0x80093005;
	public static final int OSS_BAD_ARG                                                           = 0x80093006;
	public static final int OSS_BAD_VERSION                                                       = 0x80093007;
	public static final int OSS_OUT_MEMORY                                                        = 0x80093008;
	public static final int OSS_PDU_MISMATCH                                                      = 0x80093009;
	public static final int OSS_LIMITED                                                           = 0x8009300A;
	public static final int OSS_BAD_PTR                                                           = 0x8009300B;
	public static final int OSS_BAD_TIME                                                          = 0x8009300C;
	public static final int OSS_INDEFINITE_NOT_SUPPORTED                                          = 0x8009300D;
	public static final int OSS_MEM_ERROR                                                         = 0x8009300E;
	public static final int OSS_BAD_TABLE                                                         = 0x8009300F;
	public static final int OSS_TOO_LONG                                                          = 0x80093010;
	public static final int OSS_CONSTRAINT_VIOLATED                                               = 0x80093011;
	public static final int OSS_FATAL_ERROR                                                       = 0x80093012;
	public static final int OSS_ACCESS_SERIALIZATION_ERROR                                        = 0x80093013;
	public static final int OSS_NULL_TBL                                                          = 0x80093014;
	public static final int OSS_NULL_FCN                                                          = 0x80093015;
	public static final int OSS_BAD_ENCRULES                                                      = 0x80093016;
	public static final int OSS_UNAVAIL_ENCRULES                                                  = 0x80093017;
	public static final int OSS_CANT_OPEN_TRACE_WINDOW                                            = 0x80093018;
	public static final int OSS_UNIMPLEMENTED                                                     = 0x80093019;
	public static final int OSS_OID_DLL_NOT_LINKED                                                = 0x8009301A;
	public static final int OSS_CANT_OPEN_TRACE_FILE                                              = 0x8009301B;
	public static final int OSS_TRACE_FILE_ALREADY_OPEN                                           = 0x8009301C;
	public static final int OSS_TABLE_MISMATCH                                                    = 0x8009301D;
	public static final int OSS_TYPE_NOT_SUPPORTED                                                = 0x8009301E;
	public static final int OSS_REAL_DLL_NOT_LINKED                                               = 0x8009301F;
	public static final int OSS_REAL_CODE_NOT_LINKED                                              = 0x80093020;
	public static final int OSS_OUT_OF_RANGE                                                      = 0x80093021;
	public static final int OSS_COPIER_DLL_NOT_LINKED                                             = 0x80093022;
	public static final int OSS_CONSTRAINT_DLL_NOT_LINKED                                         = 0x80093023;
	public static final int OSS_COMPARATOR_DLL_NOT_LINKED                                         = 0x80093024;
	public static final int OSS_COMPARATOR_CODE_NOT_LINKED                                        = 0x80093025;
	public static final int OSS_MEM_MGR_DLL_NOT_LINKED                                            = 0x80093026;
	public static final int OSS_PDV_DLL_NOT_LINKED                                                = 0x80093027;
	public static final int OSS_PDV_CODE_NOT_LINKED                                               = 0x80093028;
	public static final int OSS_API_DLL_NOT_LINKED                                                = 0x80093029;
	public static final int OSS_BERDER_DLL_NOT_LINKED                                             = 0x8009302A;
	public static final int OSS_PER_DLL_NOT_LINKED                                                = 0x8009302B;
	public static final int OSS_OPEN_TYPE_ERROR                                                   = 0x8009302C;
	public static final int OSS_MUTEX_NOT_CREATED                                                 = 0x8009302D;
	public static final int OSS_CANT_CLOSE_TRACE_FILE                                             = 0x8009302E;
	public static final int CRYPT_E_ASN1_ERROR                                                    = 0x80093100;
	public static final int CRYPT_E_ASN1_INTERNAL                                                 = 0x80093101;
	public static final int CRYPT_E_ASN1_EOD                                                      = 0x80093102;
	public static final int CRYPT_E_ASN1_CORRUPT                                                  = 0x80093103;
	public static final int CRYPT_E_ASN1_LARGE                                                    = 0x80093104;
	public static final int CRYPT_E_ASN1_CONSTRAINT                                               = 0x80093105;
	public static final int CRYPT_E_ASN1_MEMORY                                                   = 0x80093106;
	public static final int CRYPT_E_ASN1_OVERFLOW                                                 = 0x80093107;
	public static final int CRYPT_E_ASN1_BADPDU                                                   = 0x80093108;
	public static final int CRYPT_E_ASN1_BADARGS                                                  = 0x80093109;
	public static final int CRYPT_E_ASN1_BADREAL                                                  = 0x8009310A;
	public static final int CRYPT_E_ASN1_BADTAG                                                   = 0x8009310B;
	public static final int CRYPT_E_ASN1_CHOICE                                                   = 0x8009310C;
	public static final int CRYPT_E_ASN1_RULE                                                     = 0x8009310D;
	public static final int CRYPT_E_ASN1_UTF8                                                     = 0x8009310E;
	public static final int CRYPT_E_ASN1_PDU_TYPE                                                 = 0x80093133;
	public static final int CRYPT_E_ASN1_NYI                                                      = 0x80093134;
	public static final int CRYPT_E_ASN1_EXTENDED                                                 = 0x80093201;
	public static final int CRYPT_E_ASN1_NOEOD                                                    = 0x80093202;
	public static final int CERTSRV_E_BAD_REQUESTSUBJECT                                          = 0x80094001;
	public static final int CERTSRV_E_NO_REQUEST                                                  = 0x80094002;
	public static final int CERTSRV_E_BAD_REQUESTSTATUS                                           = 0x80094003;
	public static final int CERTSRV_E_PROPERTY_EMPTY                                              = 0x80094004;
	public static final int CERTSRV_E_INVALID_CA_CERTIFICATE                                      = 0x80094005;
	public static final int CERTSRV_E_SERVER_SUSPENDED                                            = 0x80094006;
	public static final int CERTSRV_E_ENCODING_LENGTH                                             = 0x80094007;
	public static final int CERTSRV_E_ROLECONFLICT                                                = 0x80094008;
	public static final int CERTSRV_E_RESTRICTEDOFFICER                                           = 0x80094009;
	public static final int CERTSRV_E_KEY_ARCHIVAL_NOT_CONFIGURED                                 = 0x8009400A;
	public static final int CERTSRV_E_NO_VALID_KRA                                                = 0x8009400B;
	public static final int CERTSRV_E_BAD_REQUEST_KEY_ARCHIVAL                                    = 0x8009400C;
	public static final int CERTSRV_E_NO_CAADMIN_DEFINED                                          = 0x8009400D;
	public static final int CERTSRV_E_BAD_RENEWAL_CERT_ATTRIBUTE                                  = 0x8009400E;
	public static final int CERTSRV_E_NO_DB_SESSIONS                                              = 0x8009400F;
	public static final int CERTSRV_E_ALIGNMENT_FAULT                                             = 0x80094010;
	public static final int CERTSRV_E_ENROLL_DENIED                                               = 0x80094011;
	public static final int CERTSRV_E_TEMPLATE_DENIED                                             = 0x80094012;
	public static final int CERTSRV_E_DOWNLEVEL_DC_SSL_OR_UPGRADE                                 = 0x80094013;
	public static final int CERTSRV_E_UNSUPPORTED_CERT_TYPE                                       = 0x80094800;
	public static final int CERTSRV_E_NO_CERT_TYPE                                                = 0x80094801;
	public static final int CERTSRV_E_TEMPLATE_CONFLICT                                           = 0x80094802;
	public static final int CERTSRV_E_SUBJECT_ALT_NAME_REQUIRED                                   = 0x80094803;
	public static final int CERTSRV_E_ARCHIVED_KEY_REQUIRED                                       = 0x80094804;
	public static final int CERTSRV_E_SMIME_REQUIRED                                              = 0x80094805;
	public static final int CERTSRV_E_BAD_RENEWAL_SUBJECT                                         = 0x80094806;
	public static final int CERTSRV_E_BAD_TEMPLATE_VERSION                                        = 0x80094807;
	public static final int CERTSRV_E_TEMPLATE_POLICY_REQUIRED                                    = 0x80094808;
	public static final int CERTSRV_E_SIGNATURE_POLICY_REQUIRED                                   = 0x80094809;
	public static final int CERTSRV_E_SIGNATURE_COUNT                                             = 0x8009480A;
	public static final int CERTSRV_E_SIGNATURE_REJECTED                                          = 0x8009480B;
	public static final int CERTSRV_E_ISSUANCE_POLICY_REQUIRED                                    = 0x8009480C;
	public static final int CERTSRV_E_SUBJECT_UPN_REQUIRED                                        = 0x8009480D;
	public static final int CERTSRV_E_SUBJECT_DIRECTORY_GUID_REQUIRED                             = 0x8009480E;
	public static final int CERTSRV_E_SUBJECT_DNS_REQUIRED                                        = 0x8009480F;
	public static final int CERTSRV_E_ARCHIVED_KEY_UNEXPECTED                                     = 0x80094810;
	public static final int CERTSRV_E_KEY_LENGTH                                                  = 0x80094811;
	public static final int CERTSRV_E_SUBJECT_EMAIL_REQUIRED                                      = 0x80094812;
	public static final int CERTSRV_E_UNKNOWN_CERT_TYPE                                           = 0x80094813;
	public static final int CERTSRV_E_CERT_TYPE_OVERLAP                                           = 0x80094814;
	public static final int CERTSRV_E_TOO_MANY_SIGNATURES                                         = 0x80094815;
	public static final int CERTSRV_E_RENEWAL_BAD_PUBLIC_KEY                                      = 0x80094816;
	public static final int CERTSRV_E_INVALID_EK                                                  = 0x80094817;
	public static final int CERTSRV_E_KEY_ATTESTATION                                             = 0x8009481A;
	public static final int XENROLL_E_KEY_NOT_EXPORTABLE                                          = 0x80095000;
	public static final int XENROLL_E_CANNOT_ADD_ROOT_CERT                                        = 0x80095001;
	public static final int XENROLL_E_RESPONSE_KA_HASH_NOT_FOUND                                  = 0x80095002;
	public static final int XENROLL_E_RESPONSE_UNEXPECTED_KA_HASH                                 = 0x80095003;
	public static final int XENROLL_E_RESPONSE_KA_HASH_MISMATCH                                   = 0x80095004;
	public static final int XENROLL_E_KEYSPEC_SMIME_MISMATCH                                      = 0x80095005;
	public static final int TRUST_E_SYSTEM_ERROR                                                  = 0x80096001;
	public static final int TRUST_E_NO_SIGNER_CERT                                                = 0x80096002;
	public static final int TRUST_E_COUNTER_SIGNER                                                = 0x80096003;
	public static final int TRUST_E_CERT_SIGNATURE                                                = 0x80096004;
	public static final int TRUST_E_TIME_STAMP                                                    = 0x80096005;
	public static final int TRUST_E_BAD_DIGEST                                                    = 0x80096010;
	public static final int TRUST_E_BASIC_CONSTRAINTS                                             = 0x80096019;
	public static final int TRUST_E_FINANCIAL_CRITERIA                                            = 0x8009601E;
	public static final int MSSIPOTF_E_OUTOFMEMRANGE                                              = 0x80097001;
	public static final int MSSIPOTF_E_CANTGETOBJECT                                              = 0x80097002;
	public static final int MSSIPOTF_E_NOHEADTABLE                                                = 0x80097003;
	public static final int MSSIPOTF_E_BAD_MAGICNUMBER                                            = 0x80097004;
	public static final int MSSIPOTF_E_BAD_OFFSET_TABLE                                           = 0x80097005;
	public static final int MSSIPOTF_E_TABLE_TAGORDER                                             = 0x80097006;
	public static final int MSSIPOTF_E_TABLE_LONGWORD                                             = 0x80097007;
	public static final int MSSIPOTF_E_BAD_FIRST_TABLE_PLACEMENT                                  = 0x80097008;
	public static final int MSSIPOTF_E_TABLES_OVERLAP                                             = 0x80097009;
	public static final int MSSIPOTF_E_TABLE_PADBYTES                                             = 0x8009700A;
	public static final int MSSIPOTF_E_FILETOOSMALL                                               = 0x8009700B;
	public static final int MSSIPOTF_E_TABLE_CHECKSUM                                             = 0x8009700C;
	public static final int MSSIPOTF_E_FILE_CHECKSUM                                              = 0x8009700D;
	public static final int MSSIPOTF_E_FAILED_POLICY                                              = 0x80097010;
	public static final int MSSIPOTF_E_FAILED_HINTS_CHECK                                         = 0x80097011;
	public static final int MSSIPOTF_E_NOT_OPENTYPE                                               = 0x80097012;
	public static final int MSSIPOTF_E_FILE                                                       = 0x80097013;
	public static final int MSSIPOTF_E_CRYPT                                                      = 0x80097014;
	public static final int MSSIPOTF_E_BADVERSION                                                 = 0x80097015;
	public static final int MSSIPOTF_E_DSIG_STRUCTURE                                             = 0x80097016;
	public static final int MSSIPOTF_E_PCONST_CHECK                                               = 0x80097017;
	public static final int MSSIPOTF_E_STRUCTURE                                                  = 0x80097018;
	public static final int ERROR_CRED_REQUIRES_CONFIRMATION                                      = 0x80097019;
	public static final int TRUST_E_PROVIDER_UNKNOWN                                              = 0x800B0001;
	public static final int TRUST_E_ACTION_UNKNOWN                                                = 0x800B0002;
	public static final int TRUST_E_SUBJECT_FORM_UNKNOWN                                          = 0x800B0003;
	public static final int TRUST_E_SUBJECT_NOT_TRUSTED                                           = 0x800B0004;
	public static final int DIGSIG_E_ENCODE                                                       = 0x800B0005;
	public static final int DIGSIG_E_DECODE                                                       = 0x800B0006;
	public static final int DIGSIG_E_EXTENSIBILITY                                                = 0x800B0007;
	public static final int DIGSIG_E_CRYPTO                                                       = 0x800B0008;
	public static final int PERSIST_E_SIZEDEFINITE                                                = 0x800B0009;
	public static final int PERSIST_E_SIZEINDEFINITE                                              = 0x800B000A;
	public static final int PERSIST_E_NOTSELFSIZING                                               = 0x800B000B;
	public static final int TRUST_E_NOSIGNATURE                                                   = 0x800B0100;
	public static final int CERT_E_EXPIRED                                                        = 0x800B0101;
	public static final int CERT_E_VALIDITYPERIODNESTING                                          = 0x800B0102;
	public static final int CERT_E_ROLE                                                           = 0x800B0103;
	public static final int CERT_E_PATHLENCONST                                                   = 0x800B0104;
	public static final int CERT_E_CRITICAL                                                       = 0x800B0105;
	public static final int CERT_E_PURPOSE                                                        = 0x800B0106;
	public static final int CERT_E_ISSUERCHAINING                                                 = 0x800B0107;
	public static final int CERT_E_MALFORMED                                                      = 0x800B0108;
	public static final int CERT_E_UNTRUSTEDROOT                                                  = 0x800B0109;
	public static final int CERT_E_CHAINING                                                       = 0x800B010A;
	public static final int TRUST_E_FAIL                                                          = 0x800B010B;
	public static final int CERT_E_REVOKED                                                        = 0x800B010C;
	public static final int CERT_E_UNTRUSTEDTESTROOT                                              = 0x800B010D;
	public static final int CERT_E_REVOCATION_FAILURE                                             = 0x800B010E;
	public static final int CERT_E_CN_NO_MATCH                                                    = 0x800B010F;
	public static final int CERT_E_WRONG_USAGE                                                    = 0x800B0110;
	public static final int TRUST_E_EXPLICIT_DISTRUST                                             = 0x800B0111;
	public static final int CERT_E_UNTRUSTEDCA                                                    = 0x800B0112;
	public static final int CERT_E_INVALID_POLICY                                                 = 0x800B0113;
	public static final int CERT_E_INVALID_NAME                                                   = 0x800B0114;
	public static final int NS_W_SERVER_BANDWIDTH_LIMIT                                           = 0x800D0003;
	public static final int NS_W_FILE_BANDWIDTH_LIMIT                                             = 0x800D0004;
	public static final int NS_W_UNKNOWN_EVENT                                                    = 0x800D0060;
	public static final int NS_I_CATATONIC_FAILURE                                                = 0x800D0199;
	public static final int NS_I_CATATONIC_AUTO_UNFAIL                                            = 0x800D019A;
	public static final int SPAPI_E_EXPECTED_SECTION_NAME                                         = 0x800F0000;
	public static final int SPAPI_E_BAD_SECTION_NAME_LINE                                         = 0x800F0001;
	public static final int SPAPI_E_SECTION_NAME_TOO_LONG                                         = 0x800F0002;
	public static final int SPAPI_E_GENERAL_SYNTAX                                                = 0x800F0003;
	public static final int SPAPI_E_WRONG_INF_STYLE                                               = 0x800F0100;
	public static final int SPAPI_E_SECTION_NOT_FOUND                                             = 0x800F0101;
	public static final int SPAPI_E_LINE_NOT_FOUND                                                = 0x800F0102;
	public static final int SPAPI_E_NO_BACKUP                                                     = 0x800F0103;
	public static final int SPAPI_E_NO_ASSOCIATED_CLASS                                           = 0x800F0200;
	public static final int SPAPI_E_CLASS_MISMATCH                                                = 0x800F0201;
	public static final int SPAPI_E_DUPLICATE_FOUND                                               = 0x800F0202;
	public static final int SPAPI_E_NO_DRIVER_SELECTED                                            = 0x800F0203;
	public static final int SPAPI_E_KEY_DOES_NOT_EXIST                                            = 0x800F0204;
	public static final int SPAPI_E_INVALID_DEVINST_NAME                                          = 0x800F0205;
	public static final int SPAPI_E_INVALID_CLASS                                                 = 0x800F0206;
	public static final int SPAPI_E_DEVINST_ALREADY_EXISTS                                        = 0x800F0207;
	public static final int SPAPI_E_DEVINFO_NOT_REGISTERED                                        = 0x800F0208;
	public static final int SPAPI_E_INVALID_REG_PROPERTY                                          = 0x800F0209;
	public static final int SPAPI_E_NO_INF                                                        = 0x800F020A;
	public static final int SPAPI_E_NO_SUCH_DEVINST                                               = 0x800F020B;
	public static final int SPAPI_E_CANT_LOAD_CLASS_ICON                                          = 0x800F020C;
	public static final int SPAPI_E_INVALID_CLASS_INSTALLER                                       = 0x800F020D;
	public static final int SPAPI_E_DI_DO_DEFAULT                                                 = 0x800F020E;
	public static final int SPAPI_E_DI_NOFILECOPY                                                 = 0x800F020F;
	public static final int SPAPI_E_INVALID_HWPROFILE                                             = 0x800F0210;
	public static final int SPAPI_E_NO_DEVICE_SELECTED                                            = 0x800F0211;
	public static final int SPAPI_E_DEVINFO_LIST_LOCKED                                           = 0x800F0212;
	public static final int SPAPI_E_DEVINFO_DATA_LOCKED                                           = 0x800F0213;
	public static final int SPAPI_E_DI_BAD_PATH                                                   = 0x800F0214;
	public static final int SPAPI_E_NO_CLASSINSTALL_PARAMS                                        = 0x800F0215;
	public static final int SPAPI_E_FILEQUEUE_LOCKED                                              = 0x800F0216;
	public static final int SPAPI_E_BAD_SERVICE_INSTALLSECT                                       = 0x800F0217;
	public static final int SPAPI_E_NO_CLASS_DRIVER_LIST                                          = 0x800F0218;
	public static final int SPAPI_E_NO_ASSOCIATED_SERVICE                                         = 0x800F0219;
	public static final int SPAPI_E_NO_DEFAULT_DEVICE_INTERFACE                                   = 0x800F021A;
	public static final int SPAPI_E_DEVICE_INTERFACE_ACTIVE                                       = 0x800F021B;
	public static final int SPAPI_E_DEVICE_INTERFACE_REMOVED                                      = 0x800F021C;
	public static final int SPAPI_E_BAD_INTERFACE_INSTALLSECT                                     = 0x800F021D;
	public static final int SPAPI_E_NO_SUCH_INTERFACE_CLASS                                       = 0x800F021E;
	public static final int SPAPI_E_INVALID_REFERENCE_STRING                                      = 0x800F021F;
	public static final int SPAPI_E_INVALID_MACHINENAME                                           = 0x800F0220;
	public static final int SPAPI_E_REMOTE_COMM_FAILURE                                           = 0x800F0221;
	public static final int SPAPI_E_MACHINE_UNAVAILABLE                                           = 0x800F0222;
	public static final int SPAPI_E_NO_CONFIGMGR_SERVICES                                         = 0x800F0223;
	public static final int SPAPI_E_INVALID_PROPPAGE_PROVIDER                                     = 0x800F0224;
	public static final int SPAPI_E_NO_SUCH_DEVICE_INTERFACE                                      = 0x800F0225;
	public static final int SPAPI_E_DI_POSTPROCESSING_REQUIRED                                    = 0x800F0226;
	public static final int SPAPI_E_INVALID_COINSTALLER                                           = 0x800F0227;
	public static final int SPAPI_E_NO_COMPAT_DRIVERS                                             = 0x800F0228;
	public static final int SPAPI_E_NO_DEVICE_ICON                                                = 0x800F0229;
	public static final int SPAPI_E_INVALID_INF_LOGCONFIG                                         = 0x800F022A;
	public static final int SPAPI_E_DI_DONT_INSTALL                                               = 0x800F022B;
	public static final int SPAPI_E_INVALID_FILTER_DRIVER                                         = 0x800F022C;
	public static final int SPAPI_E_NON_WINDOWS_NT_DRIVER                                         = 0x800F022D;
	public static final int SPAPI_E_NON_WINDOWS_DRIVER                                            = 0x800F022E;
	public static final int SPAPI_E_NO_CATALOG_FOR_OEM_INF                                        = 0x800F022F;
	public static final int SPAPI_E_DEVINSTALL_QUEUE_NONNATIVE                                    = 0x800F0230;
	public static final int SPAPI_E_NOT_DISABLEABLE                                               = 0x800F0231;
	public static final int SPAPI_E_CANT_REMOVE_DEVINST                                           = 0x800F0232;
	public static final int SPAPI_E_INVALID_TARGET                                                = 0x800F0233;
	public static final int SPAPI_E_DRIVER_NONNATIVE                                              = 0x800F0234;
	public static final int SPAPI_E_IN_WOW64                                                      = 0x800F0235;
	public static final int SPAPI_E_SET_SYSTEM_RESTORE_POINT                                      = 0x800F0236;
	public static final int SPAPI_E_INCORRECTLY_COPIED_INF                                        = 0x800F0237;
	public static final int SPAPI_E_SCE_DISABLED                                                  = 0x800F0238;
	public static final int SPAPI_E_UNKNOWN_EXCEPTION                                             = 0x800F0239;
	public static final int SPAPI_E_PNP_REGISTRY_ERROR                                            = 0x800F023A;
	public static final int SPAPI_E_REMOTE_REQUEST_UNSUPPORTED                                    = 0x800F023B;
	public static final int SPAPI_E_NOT_AN_INSTALLED_OEM_INF                                      = 0x800F023C;
	public static final int SPAPI_E_INF_IN_USE_BY_DEVICES                                         = 0x800F023D;
	public static final int SPAPI_E_DI_FUNCTION_OBSOLETE                                          = 0x800F023E;
	public static final int SPAPI_E_NO_AUTHENTICODE_CATALOG                                       = 0x800F023F;
	public static final int SPAPI_E_AUTHENTICODE_DISALLOWED                                       = 0x800F0240;
	public static final int SPAPI_E_AUTHENTICODE_TRUSTED_PUBLISHER                                = 0x800F0241;
	public static final int SPAPI_E_AUTHENTICODE_TRUST_NOT_ESTABLISHED                            = 0x800F0242;
	public static final int SPAPI_E_AUTHENTICODE_PUBLISHER_NOT_TRUSTED                            = 0x800F0243;
	public static final int SPAPI_E_SIGNATURE_OSATTRIBUTE_MISMATCH                                = 0x800F0244;
	public static final int SPAPI_E_ONLY_VALIDATE_VIA_AUTHENTICODE                                = 0x800F0245;
	public static final int SPAPI_E_DEVICE_INSTALLER_NOT_READY                                    = 0x800F0246;
	public static final int SPAPI_E_DRIVER_STORE_ADD_FAILED                                       = 0x800F0247;
	public static final int SPAPI_E_DEVICE_INSTALL_BLOCKED                                        = 0x800F0248;
	public static final int SPAPI_E_DRIVER_INSTALL_BLOCKED                                        = 0x800F0249;
	public static final int SPAPI_E_WRONG_INF_TYPE                                                = 0x800F024A;
	public static final int SPAPI_E_FILE_HASH_NOT_IN_CATALOG                                      = 0x800F024B;
	public static final int SPAPI_E_DRIVER_STORE_DELETE_FAILED                                    = 0x800F024C;
	public static final int SPAPI_E_UNRECOVERABLE_STACK_OVERFLOW                                  = 0x800F0300;
	public static final int SPAPI_E_ERROR_NOT_INSTALLED                                           = 0x800F1000;
	public static final int SCARD_F_INTERNAL_ERROR                                                = 0x80100001;
	public static final int SCARD_E_CANCELLED                                                     = 0x80100002;
	public static final int SCARD_E_INVALID_HANDLE                                                = 0x80100003;
	public static final int SCARD_E_INVALID_PARAMETER                                             = 0x80100004;
	public static final int SCARD_E_INVALID_TARGET                                                = 0x80100005;
	public static final int SCARD_E_NO_MEMORY                                                     = 0x80100006;
	public static final int SCARD_F_WAITED_TOO_LONG                                               = 0x80100007;
	public static final int SCARD_E_INSUFFICIENT_BUFFER                                           = 0x80100008;
	public static final int SCARD_E_UNKNOWN_READER                                                = 0x80100009;
	public static final int SCARD_E_TIMEOUT                                                       = 0x8010000A;
	public static final int SCARD_E_SHARING_VIOLATION                                             = 0x8010000B;
	public static final int SCARD_E_NO_SMARTCARD                                                  = 0x8010000C;
	public static final int SCARD_E_UNKNOWN_CARD                                                  = 0x8010000D;
	public static final int SCARD_E_CANT_DISPOSE                                                  = 0x8010000E;
	public static final int SCARD_E_PROTO_MISMATCH                                                = 0x8010000F;
	public static final int SCARD_E_NOT_READY                                                     = 0x80100010;
	public static final int SCARD_E_INVALID_VALUE                                                 = 0x80100011;
	public static final int SCARD_E_SYSTEM_CANCELLED                                              = 0x80100012;
	public static final int SCARD_F_COMM_ERROR                                                    = 0x80100013;
	public static final int SCARD_F_UNKNOWN_ERROR                                                 = 0x80100014;
	public static final int SCARD_E_INVALID_ATR                                                   = 0x80100015;
	public static final int SCARD_E_NOT_TRANSACTED                                                = 0x80100016;
	public static final int SCARD_E_READER_UNAVAILABLE                                            = 0x80100017;
	public static final int SCARD_P_SHUTDOWN                                                      = 0x80100018;
	public static final int SCARD_E_PCI_TOO_SMALL                                                 = 0x80100019;
	public static final int SCARD_E_READER_UNSUPPORTED                                            = 0x8010001A;
	public static final int SCARD_E_DUPLICATE_READER                                              = 0x8010001B;
	public static final int SCARD_E_CARD_UNSUPPORTED                                              = 0x8010001C;
	public static final int SCARD_E_NO_SERVICE                                                    = 0x8010001D;
	public static final int SCARD_E_SERVICE_STOPPED                                               = 0x8010001E;
	public static final int SCARD_E_UNEXPECTED                                                    = 0x8010001F;
	public static final int SCARD_E_ICC_INSTALLATION                                              = 0x80100020;
	public static final int SCARD_E_ICC_CREATEORDER                                               = 0x80100021;
	public static final int SCARD_E_UNSUPPORTED_FEATURE                                           = 0x80100022;
	public static final int SCARD_E_DIR_NOT_FOUND                                                 = 0x80100023;
	public static final int SCARD_E_FILE_NOT_FOUND                                                = 0x80100024;
	public static final int SCARD_E_NO_DIR                                                        = 0x80100025;
	public static final int SCARD_E_NO_FILE                                                       = 0x80100026;
	public static final int SCARD_E_NO_ACCESS                                                     = 0x80100027;
	public static final int SCARD_E_WRITE_TOO_MANY                                                = 0x80100028;
	public static final int SCARD_E_BAD_SEEK                                                      = 0x80100029;
	public static final int SCARD_E_INVALID_CHV                                                   = 0x8010002A;
	public static final int SCARD_E_UNKNOWN_RES_MNG                                               = 0x8010002B;
	public static final int SCARD_E_NO_SUCH_CERTIFICATE                                           = 0x8010002C;
	public static final int SCARD_E_CERTIFICATE_UNAVAILABLE                                       = 0x8010002D;
	public static final int SCARD_E_NO_READERS_AVAILABLE                                          = 0x8010002E;
	public static final int SCARD_E_COMM_DATA_LOST                                                = 0x8010002F;
	public static final int SCARD_E_NO_KEY_CONTAINER                                              = 0x80100030;
	public static final int SCARD_E_SERVER_TOO_BUSY                                               = 0x80100031;
	public static final int SCARD_W_UNSUPPORTED_CARD                                              = 0x80100065;
	public static final int SCARD_W_UNRESPONSIVE_CARD                                             = 0x80100066;
	public static final int SCARD_W_UNPOWERED_CARD                                                = 0x80100067;
	public static final int SCARD_W_RESET_CARD                                                    = 0x80100068;
	public static final int SCARD_W_REMOVED_CARD                                                  = 0x80100069;
	public static final int SCARD_W_SECURITY_VIOLATION                                            = 0x8010006A;
	public static final int SCARD_W_WRONG_CHV                                                     = 0x8010006B;
	public static final int SCARD_W_CHV_BLOCKED                                                   = 0x8010006C;
	public static final int SCARD_W_EOF                                                           = 0x8010006D;
	public static final int SCARD_W_CANCELLED_BY_USER                                             = 0x8010006E;
	public static final int SCARD_W_CARD_NOT_AUTHENTICATED                                        = 0x8010006F;
	public static final int COMADMIN_E_OBJECTERRORS                                               = 0x80110401;
	public static final int COMADMIN_E_OBJECTINVALID                                              = 0x80110402;
	public static final int COMADMIN_E_KEYMISSING                                                 = 0x80110403;
	public static final int COMADMIN_E_ALREADYINSTALLED                                           = 0x80110404;
	public static final int COMADMIN_E_APP_FILE_WRITEFAIL                                         = 0x80110407;
	public static final int COMADMIN_E_APP_FILE_READFAIL                                          = 0x80110408;
	public static final int COMADMIN_E_APP_FILE_VERSION                                           = 0x80110409;
	public static final int COMADMIN_E_BADPATH                                                    = 0x8011040A;
	public static final int COMADMIN_E_APPLICATIONEXISTS                                          = 0x8011040B;
	public static final int COMADMIN_E_ROLEEXISTS                                                 = 0x8011040C;
	public static final int COMADMIN_E_CANTCOPYFILE                                               = 0x8011040D;
	public static final int COMADMIN_E_NOUSER                                                     = 0x8011040F;
	public static final int COMADMIN_E_INVALIDUSERIDS                                             = 0x80110410;
	public static final int COMADMIN_E_NOREGISTRYCLSID                                            = 0x80110411;
	public static final int COMADMIN_E_BADREGISTRYPROGID                                          = 0x80110412;
	public static final int COMADMIN_E_AUTHENTICATIONLEVEL                                        = 0x80110413;
	public static final int COMADMIN_E_USERPASSWDNOTVALID                                         = 0x80110414;
	public static final int COMADMIN_E_CLSIDORIIDMISMATCH                                         = 0x80110418;
	public static final int COMADMIN_E_REMOTEINTERFACE                                            = 0x80110419;
	public static final int COMADMIN_E_DLLREGISTERSERVER                                          = 0x8011041A;
	public static final int COMADMIN_E_NOSERVERSHARE                                              = 0x8011041B;
	public static final int COMADMIN_E_DLLLOADFAILED                                              = 0x8011041D;
	public static final int COMADMIN_E_BADREGISTRYLIBID                                           = 0x8011041E;
	public static final int COMADMIN_E_APPDIRNOTFOUND                                             = 0x8011041F;
	public static final int COMADMIN_E_REGISTRARFAILED                                            = 0x80110423;
	public static final int COMADMIN_E_COMPFILE_DOESNOTEXIST                                      = 0x80110424;
	public static final int COMADMIN_E_COMPFILE_LOADDLLFAIL                                       = 0x80110425;
	public static final int COMADMIN_E_COMPFILE_GETCLASSOBJ                                       = 0x80110426;
	public static final int COMADMIN_E_COMPFILE_CLASSNOTAVAIL                                     = 0x80110427;
	public static final int COMADMIN_E_COMPFILE_BADTLB                                            = 0x80110428;
	public static final int COMADMIN_E_COMPFILE_NOTINSTALLABLE                                    = 0x80110429;
	public static final int COMADMIN_E_NOTCHANGEABLE                                              = 0x8011042A;
	public static final int COMADMIN_E_NOTDELETEABLE                                              = 0x8011042B;
	public static final int COMADMIN_E_SESSION                                                    = 0x8011042C;
	public static final int COMADMIN_E_COMP_MOVE_LOCKED                                           = 0x8011042D;
	public static final int COMADMIN_E_COMP_MOVE_BAD_DEST                                         = 0x8011042E;
	public static final int COMADMIN_E_REGISTERTLB                                                = 0x80110430;
	public static final int COMADMIN_E_SYSTEMAPP                                                  = 0x80110433;
	public static final int COMADMIN_E_COMPFILE_NOREGISTRAR                                       = 0x80110434;
	public static final int COMADMIN_E_COREQCOMPINSTALLED                                         = 0x80110435;
	public static final int COMADMIN_E_SERVICENOTINSTALLED                                        = 0x80110436;
	public static final int COMADMIN_E_PROPERTYSAVEFAILED                                         = 0x80110437;
	public static final int COMADMIN_E_OBJECTEXISTS                                               = 0x80110438;
	public static final int COMADMIN_E_COMPONENTEXISTS                                            = 0x80110439;
	public static final int COMADMIN_E_REGFILE_CORRUPT                                            = 0x8011043B;
	public static final int COMADMIN_E_PROPERTY_OVERFLOW                                          = 0x8011043C;
	public static final int COMADMIN_E_NOTINREGISTRY                                              = 0x8011043E;
	public static final int COMADMIN_E_OBJECTNOTPOOLABLE                                          = 0x8011043F;
	public static final int COMADMIN_E_APPLID_MATCHES_CLSID                                       = 0x80110446;
	public static final int COMADMIN_E_ROLE_DOES_NOT_EXIST                                        = 0x80110447;
	public static final int COMADMIN_E_START_APP_NEEDS_COMPONENTS                                 = 0x80110448;
	public static final int COMADMIN_E_REQUIRES_DIFFERENT_PLATFORM                                = 0x80110449;
	public static final int COMADMIN_E_CAN_NOT_EXPORT_APP_PROXY                                   = 0x8011044A;
	public static final int COMADMIN_E_CAN_NOT_START_APP                                          = 0x8011044B;
	public static final int COMADMIN_E_CAN_NOT_EXPORT_SYS_APP                                     = 0x8011044C;
	public static final int COMADMIN_E_CANT_SUBSCRIBE_TO_COMPONENT                                = 0x8011044D;
	public static final int COMADMIN_E_EVENTCLASS_CANT_BE_SUBSCRIBER                              = 0x8011044E;
	public static final int COMADMIN_E_LIB_APP_PROXY_INCOMPATIBLE                                 = 0x8011044F;
	public static final int COMADMIN_E_BASE_PARTITION_ONLY                                        = 0x80110450;
	public static final int COMADMIN_E_START_APP_DISABLED                                         = 0x80110451;
	public static final int COMADMIN_E_CAT_DUPLICATE_PARTITION_NAME                               = 0x80110457;
	public static final int COMADMIN_E_CAT_INVALID_PARTITION_NAME                                 = 0x80110458;
	public static final int COMADMIN_E_CAT_PARTITION_IN_USE                                       = 0x80110459;
	public static final int COMADMIN_E_FILE_PARTITION_DUPLICATE_FILES                             = 0x8011045A;
	public static final int COMADMIN_E_CAT_IMPORTED_COMPONENTS_NOT_ALLOWED                        = 0x8011045B;
	public static final int COMADMIN_E_AMBIGUOUS_APPLICATION_NAME                                 = 0x8011045C;
	public static final int COMADMIN_E_AMBIGUOUS_PARTITION_NAME                                   = 0x8011045D;
	public static final int COMADMIN_E_REGDB_NOTINITIALIZED                                       = 0x80110472;
	public static final int COMADMIN_E_REGDB_NOTOPEN                                              = 0x80110473;
	public static final int COMADMIN_E_REGDB_SYSTEMERR                                            = 0x80110474;
	public static final int COMADMIN_E_REGDB_ALREADYRUNNING                                       = 0x80110475;
	public static final int COMADMIN_E_MIG_VERSIONNOTSUPPORTED                                    = 0x80110480;
	public static final int COMADMIN_E_MIG_SCHEMANOTFOUND                                         = 0x80110481;
	public static final int COMADMIN_E_CAT_BITNESSMISMATCH                                        = 0x80110482;
	public static final int COMADMIN_E_CAT_UNACCEPTABLEBITNESS                                    = 0x80110483;
	public static final int COMADMIN_E_CAT_WRONGAPPBITNESS                                        = 0x80110484;
	public static final int COMADMIN_E_CAT_PAUSE_RESUME_NOT_SUPPORTED                             = 0x80110485;
	public static final int COMADMIN_E_CAT_SERVERFAULT                                            = 0x80110486;
	public static final int COMQC_E_APPLICATION_NOT_QUEUED                                        = 0x80110600;
	public static final int COMQC_E_NO_QUEUEABLE_INTERFACES                                       = 0x80110601;
	public static final int COMQC_E_QUEUING_SERVICE_NOT_AVAILABLE                                 = 0x80110602;
	public static final int COMQC_E_NO_IPERSISTSTREAM                                             = 0x80110603;
	public static final int COMQC_E_BAD_MESSAGE                                                   = 0x80110604;
	public static final int COMQC_E_UNAUTHENTICATED                                               = 0x80110605;
	public static final int COMQC_E_UNTRUSTED_ENQUEUER                                            = 0x80110606;
	public static final int MSDTC_E_DUPLICATE_RESOURCE                                            = 0x80110701;
	public static final int COMADMIN_E_OBJECT_PARENT_MISSING                                      = 0x80110808;
	public static final int COMADMIN_E_OBJECT_DOES_NOT_EXIST                                      = 0x80110809;
	public static final int COMADMIN_E_APP_NOT_RUNNING                                            = 0x8011080A;
	public static final int COMADMIN_E_INVALID_PARTITION                                          = 0x8011080B;
	public static final int COMADMIN_E_SVCAPP_NOT_POOLABLE_OR_RECYCLABLE                          = 0x8011080D;
	public static final int COMADMIN_E_USER_IN_SET                                                = 0x8011080E;
	public static final int COMADMIN_E_CANTRECYCLELIBRARYAPPS                                     = 0x8011080F;
	public static final int COMADMIN_E_CANTRECYCLESERVICEAPPS                                     = 0x80110811;
	public static final int COMADMIN_E_PROCESSALREADYRECYCLED                                     = 0x80110812;
	public static final int COMADMIN_E_PAUSEDPROCESSMAYNOTBERECYCLED                              = 0x80110813;
	public static final int COMADMIN_E_CANTMAKEINPROCSERVICE                                      = 0x80110814;
	public static final int COMADMIN_E_PROGIDINUSEBYCLSID                                         = 0x80110815;
	public static final int COMADMIN_E_DEFAULT_PARTITION_NOT_IN_SET                               = 0x80110816;
	public static final int COMADMIN_E_RECYCLEDPROCESSMAYNOTBEPAUSED                              = 0x80110817;
	public static final int COMADMIN_E_PARTITION_ACCESSDENIED                                     = 0x80110818;
	public static final int COMADMIN_E_PARTITION_MSI_ONLY                                         = 0x80110819;
	public static final int COMADMIN_E_LEGACYCOMPS_NOT_ALLOWED_IN_1_0_FORMAT                      = 0x8011081A;
	public static final int COMADMIN_E_LEGACYCOMPS_NOT_ALLOWED_IN_NONBASE_PARTITIONS              = 0x8011081B;
	public static final int COMADMIN_E_COMP_MOVE_SOURCE                                           = 0x8011081C;
	public static final int COMADMIN_E_COMP_MOVE_DEST                                             = 0x8011081D;
	public static final int COMADMIN_E_COMP_MOVE_PRIVATE                                          = 0x8011081E;
	public static final int COMADMIN_E_BASEPARTITION_REQUIRED_IN_SET                              = 0x8011081F;
	public static final int COMADMIN_E_CANNOT_ALIAS_EVENTCLASS                                    = 0x80110820;
	public static final int COMADMIN_E_PRIVATE_ACCESSDENIED                                       = 0x80110821;
	public static final int COMADMIN_E_SAFERINVALID                                               = 0x80110822;
	public static final int COMADMIN_E_REGISTRY_ACCESSDENIED                                      = 0x80110823;
	public static final int COMADMIN_E_PARTITIONS_DISABLED                                        = 0x80110824;
	public static final int ERROR_FLT_NO_HANDLER_DEFINED                                          = 0x801F0001;
	public static final int ERROR_FLT_CONTEXT_ALREADY_DEFINED                                     = 0x801F0002;
	public static final int ERROR_FLT_INVALID_ASYNCHRONOUS_REQUEST                                = 0x801F0003;
	public static final int ERROR_FLT_DISALLOW_FAST_IO                                            = 0x801F0004;
	public static final int ERROR_FLT_INVALID_NAME_REQUEST                                        = 0x801F0005;
	public static final int ERROR_FLT_NOT_SAFE_TO_POST_OPERATION                                  = 0x801F0006;
	public static final int ERROR_FLT_NOT_INITIALIZED                                             = 0x801F0007;
	public static final int ERROR_FLT_FILTER_NOT_READY                                            = 0x801F0008;
	public static final int ERROR_FLT_POST_OPERATION_CLEANUP                                      = 0x801F0009;
	public static final int ERROR_FLT_INTERNAL_ERROR                                              = 0x801F000A;
	public static final int ERROR_FLT_DELETING_OBJECT                                             = 0x801F000B;
	public static final int ERROR_FLT_MUST_BE_NONPAGED_POOL                                       = 0x801F000C;
	public static final int ERROR_FLT_DUPLICATE_ENTRY                                             = 0x801F000D;
	public static final int ERROR_FLT_CBDQ_DISABLED                                               = 0x801F000E;
	public static final int ERROR_FLT_DO_NOT_ATTACH                                               = 0x801F000F;
	public static final int ERROR_FLT_DO_NOT_DETACH                                               = 0x801F0010;
	public static final int ERROR_FLT_INSTANCE_ALTITUDE_COLLISION                                 = 0x801F0011;
	public static final int ERROR_FLT_INSTANCE_NAME_COLLISION                                     = 0x801F0012;
	public static final int ERROR_FLT_FILTER_NOT_FOUND                                            = 0x801F0013;
	public static final int ERROR_FLT_VOLUME_NOT_FOUND                                            = 0x801F0014;
	public static final int ERROR_FLT_INSTANCE_NOT_FOUND                                          = 0x801F0015;
	public static final int ERROR_FLT_CONTEXT_ALLOCATION_NOT_FOUND                                = 0x801F0016;
	public static final int ERROR_FLT_INVALID_CONTEXT_REGISTRATION                                = 0x801F0017;
	public static final int ERROR_FLT_NAME_CACHE_MISS                                             = 0x801F0018;
	public static final int ERROR_FLT_NO_DEVICE_OBJECT                                            = 0x801F0019;
	public static final int ERROR_FLT_VOLUME_ALREADY_MOUNTED                                      = 0x801F001A;
	public static final int ERROR_FLT_ALREADY_ENLISTED                                            = 0x801F001B;
	public static final int ERROR_FLT_CONTEXT_ALREADY_LINKED                                      = 0x801F001C;
	public static final int ERROR_FLT_NO_WAITER_FOR_REPLY                                         = 0x801F0020;
	public static final int ERROR_HUNG_DISPLAY_DRIVER_THREAD                                      = 0x80260001;
	public static final int ERROR_MONITOR_NO_DESCRIPTOR                                           = 0x80261001;
	public static final int ERROR_MONITOR_UNKNOWN_DESCRIPTOR_FORMAT                               = 0x80261002;
	public static final int DWM_E_COMPOSITIONDISABLED                                             = 0x80263001;
	public static final int DWM_E_REMOTING_NOT_SUPPORTED                                          = 0x80263002;
	public static final int DWM_E_NO_REDIRECTION_SURFACE_AVAILABLE                                = 0x80263003;
	public static final int DWM_E_NOT_QUEUING_PRESENTS                                            = 0x80263004;
	public static final int TPM_E_ERROR_MASK                                                      = 0x80280000;
	public static final int TPM_E_AUTHFAIL                                                        = 0x80280001;
	public static final int TPM_E_BADINDEX                                                        = 0x80280002;
	public static final int TPM_E_BAD_PARAMETER                                                   = 0x80280003;
	public static final int TPM_E_AUDITFAILURE                                                    = 0x80280004;
	public static final int TPM_E_CLEAR_DISABLED                                                  = 0x80280005;
	public static final int TPM_E_DEACTIVATED                                                     = 0x80280006;
	public static final int TPM_E_DISABLED                                                        = 0x80280007;
	public static final int TPM_E_DISABLED_CMD                                                    = 0x80280008;
	public static final int TPM_E_FAIL                                                            = 0x80280009;
	public static final int TPM_E_BAD_ORDINAL                                                     = 0x8028000A;
	public static final int TPM_E_INSTALL_DISABLED                                                = 0x8028000B;
	public static final int TPM_E_INVALID_KEYHANDLE                                               = 0x8028000C;
	public static final int TPM_E_KEYNOTFOUND                                                     = 0x8028000D;
	public static final int TPM_E_INAPPROPRIATE_ENC                                               = 0x8028000E;
	public static final int TPM_E_MIGRATEFAIL                                                     = 0x8028000F;
	public static final int TPM_E_INVALID_PCR_INFO                                                = 0x80280010;
	public static final int TPM_E_NOSPACE                                                         = 0x80280011;
	public static final int TPM_E_NOSRK                                                           = 0x80280012;
	public static final int TPM_E_NOTSEALED_BLOB                                                  = 0x80280013;
	public static final int TPM_E_OWNER_SET                                                       = 0x80280014;
	public static final int TPM_E_RESOURCES                                                       = 0x80280015;
	public static final int TPM_E_SHORTRANDOM                                                     = 0x80280016;
	public static final int TPM_E_SIZE                                                            = 0x80280017;
	public static final int TPM_E_WRONGPCRVAL                                                     = 0x80280018;
	public static final int TPM_E_BAD_PARAM_SIZE                                                  = 0x80280019;
	public static final int TPM_E_SHA_THREAD                                                      = 0x8028001A;
	public static final int TPM_E_SHA_ERROR                                                       = 0x8028001B;
	public static final int TPM_E_FAILEDSELFTEST                                                  = 0x8028001C;
	public static final int TPM_E_AUTH2FAIL                                                       = 0x8028001D;
	public static final int TPM_E_BADTAG                                                          = 0x8028001E;
	public static final int TPM_E_IOERROR                                                         = 0x8028001F;
	public static final int TPM_E_ENCRYPT_ERROR                                                   = 0x80280020;
	public static final int TPM_E_DECRYPT_ERROR                                                   = 0x80280021;
	public static final int TPM_E_INVALID_AUTHHANDLE                                              = 0x80280022;
	public static final int TPM_E_NO_ENDORSEMENT                                                  = 0x80280023;
	public static final int TPM_E_INVALID_KEYUSAGE                                                = 0x80280024;
	public static final int TPM_E_WRONG_ENTITYTYPE                                                = 0x80280025;
	public static final int TPM_E_INVALID_POSTINIT                                                = 0x80280026;
	public static final int TPM_E_INAPPROPRIATE_SIG                                               = 0x80280027;
	public static final int TPM_E_BAD_KEY_PROPERTY                                                = 0x80280028;
	public static final int TPM_E_BAD_MIGRATION                                                   = 0x80280029;
	public static final int TPM_E_BAD_SCHEME                                                      = 0x8028002A;
	public static final int TPM_E_BAD_DATASIZE                                                    = 0x8028002B;
	public static final int TPM_E_BAD_MODE                                                        = 0x8028002C;
	public static final int TPM_E_BAD_PRESENCE                                                    = 0x8028002D;
	public static final int TPM_E_BAD_VERSION                                                     = 0x8028002E;
	public static final int TPM_E_NO_WRAP_TRANSPORT                                               = 0x8028002F;
	public static final int TPM_E_AUDITFAIL_UNSUCCESSFUL                                          = 0x80280030;
	public static final int TPM_E_AUDITFAIL_SUCCESSFUL                                            = 0x80280031;
	public static final int TPM_E_NOTRESETABLE                                                    = 0x80280032;
	public static final int TPM_E_NOTLOCAL                                                        = 0x80280033;
	public static final int TPM_E_BAD_TYPE                                                        = 0x80280034;
	public static final int TPM_E_INVALID_RESOURCE                                                = 0x80280035;
	public static final int TPM_E_NOTFIPS                                                         = 0x80280036;
	public static final int TPM_E_INVALID_FAMILY                                                  = 0x80280037;
	public static final int TPM_E_NO_NV_PERMISSION                                                = 0x80280038;
	public static final int TPM_E_REQUIRES_SIGN                                                   = 0x80280039;
	public static final int TPM_E_KEY_NOTSUPPORTED                                                = 0x8028003A;
	public static final int TPM_E_AUTH_CONFLICT                                                   = 0x8028003B;
	public static final int TPM_E_AREA_LOCKED                                                     = 0x8028003C;
	public static final int TPM_E_BAD_LOCALITY                                                    = 0x8028003D;
	public static final int TPM_E_READ_ONLY                                                       = 0x8028003E;
	public static final int TPM_E_PER_NOWRITE                                                     = 0x8028003F;
	public static final int TPM_E_FAMILYCOUNT                                                     = 0x80280040;
	public static final int TPM_E_WRITE_LOCKED                                                    = 0x80280041;
	public static final int TPM_E_BAD_ATTRIBUTES                                                  = 0x80280042;
	public static final int TPM_E_INVALID_STRUCTURE                                               = 0x80280043;
	public static final int TPM_E_KEY_OWNER_CONTROL                                               = 0x80280044;
	public static final int TPM_E_BAD_COUNTER                                                     = 0x80280045;
	public static final int TPM_E_NOT_FULLWRITE                                                   = 0x80280046;
	public static final int TPM_E_CONTEXT_GAP                                                     = 0x80280047;
	public static final int TPM_E_MAXNVWRITES                                                     = 0x80280048;
	public static final int TPM_E_NOOPERATOR                                                      = 0x80280049;
	public static final int TPM_E_RESOURCEMISSING                                                 = 0x8028004A;
	public static final int TPM_E_DELEGATE_LOCK                                                   = 0x8028004B;
	public static final int TPM_E_DELEGATE_FAMILY                                                 = 0x8028004C;
	public static final int TPM_E_DELEGATE_ADMIN                                                  = 0x8028004D;
	public static final int TPM_E_TRANSPORT_NOTEXCLUSIVE                                          = 0x8028004E;
	public static final int TPM_E_OWNER_CONTROL                                                   = 0x8028004F;
	public static final int TPM_E_DAA_RESOURCES                                                   = 0x80280050;
	public static final int TPM_E_DAA_INPUT_DATA0                                                 = 0x80280051;
	public static final int TPM_E_DAA_INPUT_DATA1                                                 = 0x80280052;
	public static final int TPM_E_DAA_ISSUER_SETTINGS                                             = 0x80280053;
	public static final int TPM_E_DAA_TPM_SETTINGS                                                = 0x80280054;
	public static final int TPM_E_DAA_STAGE                                                       = 0x80280055;
	public static final int TPM_E_DAA_ISSUER_VALIDITY                                             = 0x80280056;
	public static final int TPM_E_DAA_WRONG_W                                                     = 0x80280057;
	public static final int TPM_E_BAD_HANDLE                                                      = 0x80280058;
	public static final int TPM_E_BAD_DELEGATE                                                    = 0x80280059;
	public static final int TPM_E_BADCONTEXT                                                      = 0x8028005A;
	public static final int TPM_E_TOOMANYCONTEXTS                                                 = 0x8028005B;
	public static final int TPM_E_MA_TICKET_SIGNATURE                                             = 0x8028005C;
	public static final int TPM_E_MA_DESTINATION                                                  = 0x8028005D;
	public static final int TPM_E_MA_SOURCE                                                       = 0x8028005E;
	public static final int TPM_E_MA_AUTHORITY                                                    = 0x8028005F;
	public static final int TPM_E_PERMANENTEK                                                     = 0x80280061;
	public static final int TPM_E_BAD_SIGNATURE                                                   = 0x80280062;
	public static final int TPM_E_NOCONTEXTSPACE                                                  = 0x80280063;
	public static final int TPM_E_COMMAND_BLOCKED                                                 = 0x80280400;
	public static final int TPM_E_INVALID_HANDLE                                                  = 0x80280401;
	public static final int TPM_E_DUPLICATE_VHANDLE                                               = 0x80280402;
	public static final int TPM_E_EMBEDDED_COMMAND_BLOCKED                                        = 0x80280403;
	public static final int TPM_E_EMBEDDED_COMMAND_UNSUPPORTED                                    = 0x80280404;
	public static final int TPM_E_RETRY                                                           = 0x80280800;
	public static final int TPM_E_NEEDS_SELFTEST                                                  = 0x80280801;
	public static final int TPM_E_DOING_SELFTEST                                                  = 0x80280802;
	public static final int TPM_E_DEFEND_LOCK_RUNNING                                             = 0x80280803;
	public static final int TBS_E_INTERNAL_ERROR                                                  = 0x80284001;
	public static final int TBS_E_BAD_PARAMETER                                                   = 0x80284002;
	public static final int TBS_E_INVALID_OUTPUT_POINTER                                          = 0x80284003;
	public static final int TBS_E_INVALID_CONTEXT                                                 = 0x80284004;
	public static final int TBS_E_INSUFFICIENT_BUFFER                                             = 0x80284005;
	public static final int TBS_E_IOERROR                                                         = 0x80284006;
	public static final int TBS_E_INVALID_CONTEXT_PARAM                                           = 0x80284007;
	public static final int TBS_E_SERVICE_NOT_RUNNING                                             = 0x80284008;
	public static final int TBS_E_TOO_MANY_TBS_CONTEXTS                                           = 0x80284009;
	public static final int TBS_E_TOO_MANY_RESOURCES                                              = 0x8028400A;
	public static final int TBS_E_SERVICE_START_PENDING                                           = 0x8028400B;
	public static final int TBS_E_PPI_NOT_SUPPORTED                                               = 0x8028400C;
	public static final int TBS_E_COMMAND_CANCELED                                                = 0x8028400D;
	public static final int TBS_E_BUFFER_TOO_LARGE                                                = 0x8028400E;
	public static final int TPMAPI_E_INVALID_STATE                                                = 0x80290100;
	public static final int TPMAPI_E_NOT_ENOUGH_DATA                                              = 0x80290101;
	public static final int TPMAPI_E_TOO_MUCH_DATA                                                = 0x80290102;
	public static final int TPMAPI_E_INVALID_OUTPUT_POINTER                                       = 0x80290103;
	public static final int TPMAPI_E_INVALID_PARAMETER                                            = 0x80290104;
	public static final int TPMAPI_E_OUT_OF_MEMORY                                                = 0x80290105;
	public static final int TPMAPI_E_BUFFER_TOO_SMALL                                             = 0x80290106;
	public static final int TPMAPI_E_INTERNAL_ERROR                                               = 0x80290107;
	public static final int TPMAPI_E_ACCESS_DENIED                                                = 0x80290108;
	public static final int TPMAPI_E_AUTHORIZATION_FAILED                                         = 0x80290109;
	public static final int TPMAPI_E_INVALID_CONTEXT_HANDLE                                       = 0x8029010A;
	public static final int TPMAPI_E_TBS_COMMUNICATION_ERROR                                      = 0x8029010B;
	public static final int TPMAPI_E_TPM_COMMAND_ERROR                                            = 0x8029010C;
	public static final int TPMAPI_E_MESSAGE_TOO_LARGE                                            = 0x8029010D;
	public static final int TPMAPI_E_INVALID_ENCODING                                             = 0x8029010E;
	public static final int TPMAPI_E_INVALID_KEY_SIZE                                             = 0x8029010F;
	public static final int TPMAPI_E_ENCRYPTION_FAILED                                            = 0x80290110;
	public static final int TPMAPI_E_INVALID_KEY_PARAMS                                           = 0x80290111;
	public static final int TPMAPI_E_INVALID_MIGRATION_AUTHORIZATION_BLOB                         = 0x80290112;
	public static final int TPMAPI_E_INVALID_PCR_INDEX                                            = 0x80290113;
	public static final int TPMAPI_E_INVALID_DELEGATE_BLOB                                        = 0x80290114;
	public static final int TPMAPI_E_INVALID_CONTEXT_PARAMS                                       = 0x80290115;
	public static final int TPMAPI_E_INVALID_KEY_BLOB                                             = 0x80290116;
	public static final int TPMAPI_E_INVALID_PCR_DATA                                             = 0x80290117;
	public static final int TPMAPI_E_INVALID_OWNER_AUTH                                           = 0x80290118;
	public static final int TBSIMP_E_BUFFER_TOO_SMALL                                             = 0x80290200;
	public static final int TBSIMP_E_CLEANUP_FAILED                                               = 0x80290201;
	public static final int TBSIMP_E_INVALID_CONTEXT_HANDLE                                       = 0x80290202;
	public static final int TBSIMP_E_INVALID_CONTEXT_PARAM                                        = 0x80290203;
	public static final int TBSIMP_E_TPM_ERROR                                                    = 0x80290204;
	public static final int TBSIMP_E_HASH_BAD_KEY                                                 = 0x80290205;
	public static final int TBSIMP_E_DUPLICATE_VHANDLE                                            = 0x80290206;
	public static final int TBSIMP_E_INVALID_OUTPUT_POINTER                                       = 0x80290207;
	public static final int TBSIMP_E_INVALID_PARAMETER                                            = 0x80290208;
	public static final int TBSIMP_E_RPC_INIT_FAILED                                              = 0x80290209;
	public static final int TBSIMP_E_SCHEDULER_NOT_RUNNING                                        = 0x8029020A;
	public static final int TBSIMP_E_COMMAND_CANCELED                                             = 0x8029020B;
	public static final int TBSIMP_E_OUT_OF_MEMORY                                                = 0x8029020C;
	public static final int TBSIMP_E_LIST_NO_MORE_ITEMS                                           = 0x8029020D;
	public static final int TBSIMP_E_LIST_NOT_FOUND                                               = 0x8029020E;
	public static final int TBSIMP_E_NOT_ENOUGH_SPACE                                             = 0x8029020F;
	public static final int TBSIMP_E_NOT_ENOUGH_TPM_CONTEXTS                                      = 0x80290210;
	public static final int TBSIMP_E_COMMAND_FAILED                                               = 0x80290211;
	public static final int TBSIMP_E_UNKNOWN_ORDINAL                                              = 0x80290212;
	public static final int TBSIMP_E_RESOURCE_EXPIRED                                             = 0x80290213;
	public static final int TBSIMP_E_INVALID_RESOURCE                                             = 0x80290214;
	public static final int TBSIMP_E_NOTHING_TO_UNLOAD                                            = 0x80290215;
	public static final int TBSIMP_E_HASH_TABLE_FULL                                              = 0x80290216;
	public static final int TBSIMP_E_TOO_MANY_TBS_CONTEXTS                                        = 0x80290217;
	public static final int TBSIMP_E_TOO_MANY_RESOURCES                                           = 0x80290218;
	public static final int TBSIMP_E_PPI_NOT_SUPPORTED                                            = 0x80290219;
	public static final int TBSIMP_E_TPM_INCOMPATIBLE                                             = 0x8029021A;
	public static final int TPM_E_PPI_ACPI_FAILURE                                                = 0x80290300;
	public static final int TPM_E_PPI_USER_ABORT                                                  = 0x80290301;
	public static final int TPM_E_PPI_BIOS_FAILURE                                                = 0x80290302;
	public static final int TPM_E_PPI_NOT_SUPPORTED                                               = 0x80290303;
	public static final int PLA_E_DCS_NOT_FOUND                                                   = 0x80300002;
	public static final int PLA_E_TOO_MANY_FOLDERS                                                = 0x80300045;
	public static final int PLA_E_NO_MIN_DISK                                                     = 0x80300070;
	public static final int PLA_E_DCS_IN_USE                                                      = 0x803000AA;
	public static final int PLA_E_DCS_ALREADY_EXISTS                                              = 0x803000B7;
	public static final int PLA_E_PROPERTY_CONFLICT                                               = 0x80300101;
	public static final int PLA_E_DCS_SINGLETON_REQUIRED                                          = 0x80300102;
	public static final int PLA_E_CREDENTIALS_REQUIRED                                            = 0x80300103;
	public static final int PLA_E_DCS_NOT_RUNNING                                                 = 0x80300104;
	public static final int PLA_E_CONFLICT_INCL_EXCL_API                                          = 0x80300105;
	public static final int PLA_E_NETWORK_EXE_NOT_VALID                                           = 0x80300106;
	public static final int PLA_E_EXE_ALREADY_CONFIGURED                                          = 0x80300107;
	public static final int PLA_E_EXE_PATH_NOT_VALID                                              = 0x80300108;
	public static final int PLA_E_DC_ALREADY_EXISTS                                               = 0x80300109;
	public static final int PLA_E_DCS_START_WAIT_TIMEOUT                                          = 0x8030010A;
	public static final int PLA_E_DC_START_WAIT_TIMEOUT                                           = 0x8030010B;
	public static final int PLA_E_REPORT_WAIT_TIMEOUT                                             = 0x8030010C;
	public static final int PLA_E_NO_DUPLICATES                                                   = 0x8030010D;
	public static final int PLA_E_EXE_FULL_PATH_REQUIRED                                          = 0x8030010E;
	public static final int PLA_E_INVALID_SESSION_NAME                                            = 0x8030010F;
	public static final int PLA_E_PLA_CHANNEL_NOT_ENABLED                                         = 0x80300110;
	public static final int PLA_E_TASKSCHED_CHANNEL_NOT_ENABLED                                   = 0x80300111;
	public static final int FVE_E_LOCKED_VOLUME                                                   = 0x80310000;
	public static final int FVE_E_NOT_ENCRYPTED                                                   = 0x80310001;
	public static final int FVE_E_NO_TPM_BIOS                                                     = 0x80310002;
	public static final int FVE_E_NO_MBR_METRIC                                                   = 0x80310003;
	public static final int FVE_E_NO_BOOTSECTOR_METRIC                                            = 0x80310004;
	public static final int FVE_E_NO_BOOTMGR_METRIC                                               = 0x80310005;
	public static final int FVE_E_WRONG_BOOTMGR                                                   = 0x80310006;
	public static final int FVE_E_SECURE_KEY_REQUIRED                                             = 0x80310007;
	public static final int FVE_E_NOT_ACTIVATED                                                   = 0x80310008;
	public static final int FVE_E_ACTION_NOT_ALLOWED                                              = 0x80310009;
	public static final int FVE_E_AD_SCHEMA_NOT_INSTALLED                                         = 0x8031000A;
	public static final int FVE_E_AD_INVALID_DATATYPE                                             = 0x8031000B;
	public static final int FVE_E_AD_INVALID_DATASIZE                                             = 0x8031000C;
	public static final int FVE_E_AD_NO_VALUES                                                    = 0x8031000D;
	public static final int FVE_E_AD_ATTR_NOT_SET                                                 = 0x8031000E;
	public static final int FVE_E_AD_GUID_NOT_FOUND                                               = 0x8031000F;
	public static final int FVE_E_BAD_INFORMATION                                                 = 0x80310010;
	public static final int FVE_E_TOO_SMALL                                                       = 0x80310011;
	public static final int FVE_E_SYSTEM_VOLUME                                                   = 0x80310012;
	public static final int FVE_E_FAILED_WRONG_FS                                                 = 0x80310013;
	public static final int FVE_E_FAILED_BAD_FS                                                   = 0x80310014;
	public static final int FVE_E_NOT_SUPPORTED                                                   = 0x80310015;
	public static final int FVE_E_BAD_DATA                                                        = 0x80310016;
	public static final int FVE_E_VOLUME_NOT_BOUND                                                = 0x80310017;
	public static final int FVE_E_TPM_NOT_OWNED                                                   = 0x80310018;
	public static final int FVE_E_NOT_DATA_VOLUME                                                 = 0x80310019;
	public static final int FVE_E_AD_INSUFFICIENT_BUFFER                                          = 0x8031001A;
	public static final int FVE_E_CONV_READ                                                       = 0x8031001B;
	public static final int FVE_E_CONV_WRITE                                                      = 0x8031001C;
	public static final int FVE_E_KEY_REQUIRED                                                    = 0x8031001D;
	public static final int FVE_E_CLUSTERING_NOT_SUPPORTED                                        = 0x8031001E;
	public static final int FVE_E_VOLUME_BOUND_ALREADY                                            = 0x8031001F;
	public static final int FVE_E_OS_NOT_PROTECTED                                                = 0x80310020;
	public static final int FVE_E_PROTECTION_DISABLED                                             = 0x80310021;
	public static final int FVE_E_RECOVERY_KEY_REQUIRED                                           = 0x80310022;
	public static final int FVE_E_FOREIGN_VOLUME                                                  = 0x80310023;
	public static final int FVE_E_OVERLAPPED_UPDATE                                               = 0x80310024;
	public static final int FVE_E_TPM_SRK_AUTH_NOT_ZERO                                           = 0x80310025;
	public static final int FVE_E_FAILED_SECTOR_SIZE                                              = 0x80310026;
	public static final int FVE_E_FAILED_AUTHENTICATION                                           = 0x80310027;
	public static final int FVE_E_NOT_OS_VOLUME                                                   = 0x80310028;
	public static final int FVE_E_AUTOUNLOCK_ENABLED                                              = 0x80310029;
	public static final int FVE_E_WRONG_BOOTSECTOR                                                = 0x8031002A;
	public static final int FVE_E_WRONG_SYSTEM_FS                                                 = 0x8031002B;
	public static final int FVE_E_POLICY_PASSWORD_REQUIRED                                        = 0x8031002C;
	public static final int FVE_E_CANNOT_SET_FVEK_ENCRYPTED                                       = 0x8031002D;
	public static final int FVE_E_CANNOT_ENCRYPT_NO_KEY                                           = 0x8031002E;
	public static final int FVE_E_BOOTABLE_CDDVD                                                  = 0x80310030;
	public static final int FVE_E_PROTECTOR_EXISTS                                                = 0x80310031;
	public static final int FVE_E_RELATIVE_PATH                                                   = 0x80310032;
	public static final int FWP_E_CALLOUT_NOT_FOUND                                               = 0x80320001;
	public static final int FWP_E_CONDITION_NOT_FOUND                                             = 0x80320002;
	public static final int FWP_E_FILTER_NOT_FOUND                                                = 0x80320003;
	public static final int FWP_E_LAYER_NOT_FOUND                                                 = 0x80320004;
	public static final int FWP_E_PROVIDER_NOT_FOUND                                              = 0x80320005;
	public static final int FWP_E_PROVIDER_CONTEXT_NOT_FOUND                                      = 0x80320006;
	public static final int FWP_E_SUBLAYER_NOT_FOUND                                              = 0x80320007;
	public static final int FWP_E_NOT_FOUND                                                       = 0x80320008;
	public static final int FWP_E_ALREADY_EXISTS                                                  = 0x80320009;
	public static final int FWP_E_IN_USE                                                          = 0x8032000A;
	public static final int FWP_E_DYNAMIC_SESSION_IN_PROGRESS                                     = 0x8032000B;
	public static final int FWP_E_WRONG_SESSION                                                   = 0x8032000C;
	public static final int FWP_E_NO_TXN_IN_PROGRESS                                              = 0x8032000D;
	public static final int FWP_E_TXN_IN_PROGRESS                                                 = 0x8032000E;
	public static final int FWP_E_TXN_ABORTED                                                     = 0x8032000F;
	public static final int FWP_E_SESSION_ABORTED                                                 = 0x80320010;
	public static final int FWP_E_INCOMPATIBLE_TXN                                                = 0x80320011;
	public static final int FWP_E_TIMEOUT                                                         = 0x80320012;
	public static final int FWP_E_NET_EVENTS_DISABLED                                             = 0x80320013;
	public static final int FWP_E_INCOMPATIBLE_LAYER                                              = 0x80320014;
	public static final int FWP_E_KM_CLIENTS_ONLY                                                 = 0x80320015;
	public static final int FWP_E_LIFETIME_MISMATCH                                               = 0x80320016;
	public static final int FWP_E_BUILTIN_OBJECT                                                  = 0x80320017;
	public static final int FWP_E_TOO_MANY_BOOTTIME_FILTERS                                       = 0x80320018;
	public static final int FWP_E_NOTIFICATION_DROPPED                                            = 0x80320019;
	public static final int FWP_E_TRAFFIC_MISMATCH                                                = 0x8032001A;
	public static final int FWP_E_INCOMPATIBLE_SA_STATE                                           = 0x8032001B;
	public static final int FWP_E_NULL_POINTER                                                    = 0x8032001C;
	public static final int FWP_E_INVALID_ENUMERATOR                                              = 0x8032001D;
	public static final int FWP_E_INVALID_FLAGS                                                   = 0x8032001E;
	public static final int FWP_E_INVALID_NET_MASK                                                = 0x8032001F;
	public static final int FWP_E_INVALID_RANGE                                                   = 0x80320020;
	public static final int FWP_E_INVALID_INTERVAL                                                = 0x80320021;
	public static final int FWP_E_ZERO_LENGTH_ARRAY                                               = 0x80320022;
	public static final int FWP_E_NULL_DISPLAY_NAME                                               = 0x80320023;
	public static final int FWP_E_INVALID_ACTION_TYPE                                             = 0x80320024;
	public static final int FWP_E_INVALID_WEIGHT                                                  = 0x80320025;
	public static final int FWP_E_MATCH_TYPE_MISMATCH                                             = 0x80320026;
	public static final int FWP_E_TYPE_MISMATCH                                                   = 0x80320027;
	public static final int FWP_E_OUT_OF_BOUNDS                                                   = 0x80320028;
	public static final int FWP_E_RESERVED                                                        = 0x80320029;
	public static final int FWP_E_DUPLICATE_CONDITION                                             = 0x8032002A;
	public static final int FWP_E_DUPLICATE_KEYMOD                                                = 0x8032002B;
	public static final int FWP_E_ACTION_INCOMPATIBLE_WITH_LAYER                                  = 0x8032002C;
	public static final int FWP_E_ACTION_INCOMPATIBLE_WITH_SUBLAYER                               = 0x8032002D;
	public static final int FWP_E_CONTEXT_INCOMPATIBLE_WITH_LAYER                                 = 0x8032002E;
	public static final int FWP_E_CONTEXT_INCOMPATIBLE_WITH_CALLOUT                               = 0x8032002F;
	public static final int FWP_E_INCOMPATIBLE_AUTH_METHOD                                        = 0x80320030;
	public static final int FWP_E_INCOMPATIBLE_DH_GROUP                                           = 0x80320031;
	public static final int FWP_E_EM_NOT_SUPPORTED                                                = 0x80320032;
	public static final int FWP_E_NEVER_MATCH                                                     = 0x80320033;
	public static final int FWP_E_PROVIDER_CONTEXT_MISMATCH                                       = 0x80320034;
	public static final int FWP_E_INVALID_PARAMETER                                               = 0x80320035;
	public static final int FWP_E_TOO_MANY_SUBLAYERS                                              = 0x80320036;
	public static final int FWP_E_CALLOUT_NOTIFICATION_FAILED                                     = 0x80320037;
	public static final int FWP_E_INCOMPATIBLE_AUTH_CONFIG                                        = 0x80320038;
	public static final int FWP_E_INCOMPATIBLE_CIPHER_CONFIG                                      = 0x80320039;
	public static final int ERROR_NDIS_INTERFACE_CLOSING                                          = 0x80340002;
	public static final int ERROR_NDIS_BAD_VERSION                                                = 0x80340004;
	public static final int ERROR_NDIS_BAD_CHARACTERISTICS                                        = 0x80340005;
	public static final int ERROR_NDIS_ADAPTER_NOT_FOUND                                          = 0x80340006;
	public static final int ERROR_NDIS_OPEN_FAILED                                                = 0x80340007;
	public static final int ERROR_NDIS_DEVICE_FAILED                                              = 0x80340008;
	public static final int ERROR_NDIS_MULTICAST_FULL                                             = 0x80340009;
	public static final int ERROR_NDIS_MULTICAST_EXISTS                                           = 0x8034000A;
	public static final int ERROR_NDIS_MULTICAST_NOT_FOUND                                        = 0x8034000B;
	public static final int ERROR_NDIS_REQUEST_ABORTED                                            = 0x8034000C;
	public static final int ERROR_NDIS_RESET_IN_PROGRESS                                          = 0x8034000D;
	public static final int ERROR_NDIS_INVALID_PACKET                                             = 0x8034000F;
	public static final int ERROR_NDIS_INVALID_DEVICE_REQUEST                                     = 0x80340010;
	public static final int ERROR_NDIS_ADAPTER_NOT_READY                                          = 0x80340011;
	public static final int ERROR_NDIS_INVALID_LENGTH                                             = 0x80340014;
	public static final int ERROR_NDIS_INVALID_DATA                                               = 0x80340015;
	public static final int ERROR_NDIS_BUFFER_TOO_SHORT                                           = 0x80340016;
	public static final int ERROR_NDIS_INVALID_OID                                                = 0x80340017;
	public static final int ERROR_NDIS_ADAPTER_REMOVED                                            = 0x80340018;
	public static final int ERROR_NDIS_UNSUPPORTED_MEDIA                                          = 0x80340019;
	public static final int ERROR_NDIS_GROUP_ADDRESS_IN_USE                                       = 0x8034001A;
	public static final int ERROR_NDIS_FILE_NOT_FOUND                                             = 0x8034001B;
	public static final int ERROR_NDIS_ERROR_READING_FILE                                         = 0x8034001C;
	public static final int ERROR_NDIS_ALREADY_MAPPED                                             = 0x8034001D;
	public static final int ERROR_NDIS_RESOURCE_CONFLICT                                          = 0x8034001E;
	public static final int ERROR_NDIS_MEDIA_DISCONNECTED                                         = 0x8034001F;
	public static final int ERROR_NDIS_INVALID_ADDRESS                                            = 0x80340022;
	public static final int ERROR_NDIS_PAUSED                                                     = 0x8034002A;
	public static final int ERROR_NDIS_INTERFACE_NOT_FOUND                                        = 0x8034002B;
	public static final int ERROR_NDIS_UNSUPPORTED_REVISION                                       = 0x8034002C;
	public static final int ERROR_NDIS_INVALID_PORT                                               = 0x8034002D;
	public static final int ERROR_NDIS_INVALID_PORT_STATE                                         = 0x8034002E;
	public static final int ERROR_NDIS_NOT_SUPPORTED                                              = 0x803400BB;
	public static final int ERROR_NDIS_DOT11_AUTO_CONFIG_ENABLED                                  = 0x80342000;
	public static final int ERROR_NDIS_DOT11_MEDIA_IN_USE                                         = 0x80342001;
	public static final int ERROR_NDIS_DOT11_POWER_STATE_INVALID                                  = 0x80342002;
	public static final int TRK_E_NOT_FOUND                                                       = 0x8DEAD01B;
	public static final int TRK_E_VOLUME_QUOTA_EXCEEDED                                           = 0x8DEAD01C;
	public static final int TRK_SERVER_TOO_BUSY                                                   = 0x8DEAD01E;
	public static final int ERROR_AUDITING_DISABLED                                               = 0xC0090001;
	public static final int ERROR_ALL_SIDS_FILTERED                                               = 0xC0090002;
	public static final int ERROR_BIZRULES_NOT_ENABLED                                            = 0xC0090003;
	public static final int NS_E_NOCONNECTION                                                     = 0xC00D0005;
	public static final int NS_E_CANNOTCONNECT                                                    = 0xC00D0006;
	public static final int NS_E_CANNOTDESTROYTITLE                                               = 0xC00D0007;
	public static final int NS_E_CANNOTRENAMETITLE                                                = 0xC00D0008;
	public static final int NS_E_CANNOTOFFLINEDISK                                                = 0xC00D0009;
	public static final int NS_E_CANNOTONLINEDISK                                                 = 0xC00D000A;
	public static final int NS_E_NOREGISTEREDWALKER                                               = 0xC00D000B;
	public static final int NS_E_NOFUNNEL                                                         = 0xC00D000C;
	public static final int NS_E_NO_LOCALPLAY                                                     = 0xC00D000D;
	public static final int NS_E_NETWORK_BUSY                                                     = 0xC00D000E;
	public static final int NS_E_TOO_MANY_SESS                                                    = 0xC00D000F;
	public static final int NS_E_ALREADY_CONNECTED                                                = 0xC00D0010;
	public static final int NS_E_INVALID_INDEX                                                    = 0xC00D0011;
	public static final int NS_E_PROTOCOL_MISMATCH                                                = 0xC00D0012;
	public static final int NS_E_TIMEOUT                                                          = 0xC00D0013;
	public static final int NS_E_NET_WRITE                                                        = 0xC00D0014;
	public static final int NS_E_NET_READ                                                         = 0xC00D0015;
	public static final int NS_E_DISK_WRITE                                                       = 0xC00D0016;
	public static final int NS_E_DISK_READ                                                        = 0xC00D0017;
	public static final int NS_E_FILE_WRITE                                                       = 0xC00D0018;
	public static final int NS_E_FILE_READ                                                        = 0xC00D0019;
	public static final int NS_E_FILE_NOT_FOUND                                                   = 0xC00D001A;
	public static final int NS_E_FILE_EXISTS                                                      = 0xC00D001B;
	public static final int NS_E_INVALID_NAME                                                     = 0xC00D001C;
	public static final int NS_E_FILE_OPEN_FAILED                                                 = 0xC00D001D;
	public static final int NS_E_FILE_ALLOCATION_FAILED                                           = 0xC00D001E;
	public static final int NS_E_FILE_INIT_FAILED                                                 = 0xC00D001F;
	public static final int NS_E_FILE_PLAY_FAILED                                                 = 0xC00D0020;
	public static final int NS_E_SET_DISK_UID_FAILED                                              = 0xC00D0021;
	public static final int NS_E_INDUCED                                                          = 0xC00D0022;
	public static final int NS_E_CCLINK_DOWN                                                      = 0xC00D0023;
	public static final int NS_E_INTERNAL                                                         = 0xC00D0024;
	public static final int NS_E_BUSY                                                             = 0xC00D0025;
	public static final int NS_E_UNRECOGNIZED_STREAM_TYPE                                         = 0xC00D0026;
	public static final int NS_E_NETWORK_SERVICE_FAILURE                                          = 0xC00D0027;
	public static final int NS_E_NETWORK_RESOURCE_FAILURE                                         = 0xC00D0028;
	public static final int NS_E_CONNECTION_FAILURE                                               = 0xC00D0029;
	public static final int NS_E_SHUTDOWN                                                         = 0xC00D002A;
	public static final int NS_E_INVALID_REQUEST                                                  = 0xC00D002B;
	public static final int NS_E_INSUFFICIENT_BANDWIDTH                                           = 0xC00D002C;
	public static final int NS_E_NOT_REBUILDING                                                   = 0xC00D002D;
	public static final int NS_E_LATE_OPERATION                                                   = 0xC00D002E;
	public static final int NS_E_INVALID_DATA                                                     = 0xC00D002F;
	public static final int NS_E_FILE_BANDWIDTH_LIMIT                                             = 0xC00D0030;
	public static final int NS_E_OPEN_FILE_LIMIT                                                  = 0xC00D0031;
	public static final int NS_E_BAD_CONTROL_DATA                                                 = 0xC00D0032;
	public static final int NS_E_NO_STREAM                                                        = 0xC00D0033;
	public static final int NS_E_STREAM_END                                                       = 0xC00D0034;
	public static final int NS_E_SERVER_NOT_FOUND                                                 = 0xC00D0035;
	public static final int NS_E_DUPLICATE_NAME                                                   = 0xC00D0036;
	public static final int NS_E_DUPLICATE_ADDRESS                                                = 0xC00D0037;
	public static final int NS_E_BAD_MULTICAST_ADDRESS                                            = 0xC00D0038;
	public static final int NS_E_BAD_ADAPTER_ADDRESS                                              = 0xC00D0039;
	public static final int NS_E_BAD_DELIVERY_MODE                                                = 0xC00D003A;
	public static final int NS_E_INVALID_CHANNEL                                                  = 0xC00D003B;
	public static final int NS_E_INVALID_STREAM                                                   = 0xC00D003C;
	public static final int NS_E_INVALID_ARCHIVE                                                  = 0xC00D003D;
	public static final int NS_E_NOTITLES                                                         = 0xC00D003E;
	public static final int NS_E_INVALID_CLIENT                                                   = 0xC00D003F;
	public static final int NS_E_INVALID_BLACKHOLE_ADDRESS                                        = 0xC00D0040;
	public static final int NS_E_INCOMPATIBLE_FORMAT                                              = 0xC00D0041;
	public static final int NS_E_INVALID_KEY                                                      = 0xC00D0042;
	public static final int NS_E_INVALID_PORT                                                     = 0xC00D0043;
	public static final int NS_E_INVALID_TTL                                                      = 0xC00D0044;
	public static final int NS_E_STRIDE_REFUSED                                                   = 0xC00D0045;
	public static final int NS_E_MMSAUTOSERVER_CANTFINDWALKER                                     = 0xC00D0046;
	public static final int NS_E_MAX_BITRATE                                                      = 0xC00D0047;
	public static final int NS_E_LOGFILEPERIOD                                                    = 0xC00D0048;
	public static final int NS_E_MAX_CLIENTS                                                      = 0xC00D0049;
	public static final int NS_E_LOG_FILE_SIZE                                                    = 0xC00D004A;
	public static final int NS_E_MAX_FILERATE                                                     = 0xC00D004B;
	public static final int NS_E_WALKER_UNKNOWN                                                   = 0xC00D004C;
	public static final int NS_E_WALKER_SERVER                                                    = 0xC00D004D;
	public static final int NS_E_WALKER_USAGE                                                     = 0xC00D004E;
	public static final int NS_E_TIGER_FAIL                                                       = 0xC00D0050;
	public static final int NS_E_CUB_FAIL                                                         = 0xC00D0053;
	public static final int NS_E_DISK_FAIL                                                        = 0xC00D0055;
	public static final int NS_E_MAX_FUNNELS_ALERT                                                = 0xC00D0060;
	public static final int NS_E_ALLOCATE_FILE_FAIL                                               = 0xC00D0061;
	public static final int NS_E_PAGING_ERROR                                                     = 0xC00D0062;
	public static final int NS_E_BAD_BLOCK0_VERSION                                               = 0xC00D0063;
	public static final int NS_E_BAD_DISK_UID                                                     = 0xC00D0064;
	public static final int NS_E_BAD_FSMAJOR_VERSION                                              = 0xC00D0065;
	public static final int NS_E_BAD_STAMPNUMBER                                                  = 0xC00D0066;
	public static final int NS_E_PARTIALLY_REBUILT_DISK                                           = 0xC00D0067;
	public static final int NS_E_ENACTPLAN_GIVEUP                                                 = 0xC00D0068;
	public static final int MCMADM_E_REGKEY_NOT_FOUND                                             = 0xC00D006A;
	public static final int NS_E_NO_FORMATS                                                       = 0xC00D006B;
	public static final int NS_E_NO_REFERENCES                                                    = 0xC00D006C;
	public static final int NS_E_WAVE_OPEN                                                        = 0xC00D006D;
	public static final int NS_E_CANNOTCONNECTEVENTS                                              = 0xC00D006F;
	public static final int NS_E_NO_DEVICE                                                        = 0xC00D0071;
	public static final int NS_E_NO_SPECIFIED_DEVICE                                              = 0xC00D0072;
	public static final int NS_E_MONITOR_GIVEUP                                                   = 0xC00D00C8;
	public static final int NS_E_REMIRRORED_DISK                                                  = 0xC00D00C9;
	public static final int NS_E_INSUFFICIENT_DATA                                                = 0xC00D00CA;
	public static final int NS_E_ASSERT                                                           = 0xC00D00CB;
	public static final int NS_E_BAD_ADAPTER_NAME                                                 = 0xC00D00CC;
	public static final int NS_E_NOT_LICENSED                                                     = 0xC00D00CD;
	public static final int NS_E_NO_SERVER_CONTACT                                                = 0xC00D00CE;
	public static final int NS_E_TOO_MANY_TITLES                                                  = 0xC00D00CF;
	public static final int NS_E_TITLE_SIZE_EXCEEDED                                              = 0xC00D00D0;
	public static final int NS_E_UDP_DISABLED                                                     = 0xC00D00D1;
	public static final int NS_E_TCP_DISABLED                                                     = 0xC00D00D2;
	public static final int NS_E_HTTP_DISABLED                                                    = 0xC00D00D3;
	public static final int NS_E_LICENSE_EXPIRED                                                  = 0xC00D00D4;
	public static final int NS_E_TITLE_BITRATE                                                    = 0xC00D00D5;
	public static final int NS_E_EMPTY_PROGRAM_NAME                                               = 0xC00D00D6;
	public static final int NS_E_MISSING_CHANNEL                                                  = 0xC00D00D7;
	public static final int NS_E_NO_CHANNELS                                                      = 0xC00D00D8;
	public static final int NS_E_INVALID_INDEX2                                                   = 0xC00D00D9;
	public static final int NS_E_CUB_FAIL_LINK                                                    = 0xC00D0190;
	public static final int NS_E_BAD_CUB_UID                                                      = 0xC00D0192;
	public static final int NS_E_GLITCH_MODE                                                      = 0xC00D0195;
	public static final int NS_E_NO_MEDIA_PROTOCOL                                                = 0xC00D019B;
	public static final int NS_E_NOTHING_TO_DO                                                    = 0xC00D07F1;
	public static final int NS_E_NO_MULTICAST                                                     = 0xC00D07F2;
	public static final int NS_E_INVALID_INPUT_FORMAT                                             = 0xC00D0BB8;
	public static final int NS_E_MSAUDIO_NOT_INSTALLED                                            = 0xC00D0BB9;
	public static final int NS_E_UNEXPECTED_MSAUDIO_ERROR                                         = 0xC00D0BBA;
	public static final int NS_E_INVALID_OUTPUT_FORMAT                                            = 0xC00D0BBB;
	public static final int NS_E_NOT_CONFIGURED                                                   = 0xC00D0BBC;
	public static final int NS_E_PROTECTED_CONTENT                                                = 0xC00D0BBD;
	public static final int NS_E_LICENSE_REQUIRED                                                 = 0xC00D0BBE;
	public static final int NS_E_TAMPERED_CONTENT                                                 = 0xC00D0BBF;
	public static final int NS_E_LICENSE_OUTOFDATE                                                = 0xC00D0BC0;
	public static final int NS_E_LICENSE_INCORRECT_RIGHTS                                         = 0xC00D0BC1;
	public static final int NS_E_AUDIO_CODEC_NOT_INSTALLED                                        = 0xC00D0BC2;
	public static final int NS_E_AUDIO_CODEC_ERROR                                                = 0xC00D0BC3;
	public static final int NS_E_VIDEO_CODEC_NOT_INSTALLED                                        = 0xC00D0BC4;
	public static final int NS_E_VIDEO_CODEC_ERROR                                                = 0xC00D0BC5;
	public static final int NS_E_INVALIDPROFILE                                                   = 0xC00D0BC6;
	public static final int NS_E_INCOMPATIBLE_VERSION                                             = 0xC00D0BC7;
	public static final int NS_E_OFFLINE_MODE                                                     = 0xC00D0BCA;
	public static final int NS_E_NOT_CONNECTED                                                    = 0xC00D0BCB;
	public static final int NS_E_TOO_MUCH_DATA                                                    = 0xC00D0BCC;
	public static final int NS_E_UNSUPPORTED_PROPERTY                                             = 0xC00D0BCD;
	public static final int NS_E_8BIT_WAVE_UNSUPPORTED                                            = 0xC00D0BCE;
	public static final int NS_E_NO_MORE_SAMPLES                                                  = 0xC00D0BCF;
	public static final int NS_E_INVALID_SAMPLING_RATE                                            = 0xC00D0BD0;
	public static final int NS_E_MAX_PACKET_SIZE_TOO_SMALL                                        = 0xC00D0BD1;
	public static final int NS_E_LATE_PACKET                                                      = 0xC00D0BD2;
	public static final int NS_E_DUPLICATE_PACKET                                                 = 0xC00D0BD3;
	public static final int NS_E_SDK_BUFFERTOOSMALL                                               = 0xC00D0BD4;
	public static final int NS_E_INVALID_NUM_PASSES                                               = 0xC00D0BD5;
	public static final int NS_E_ATTRIBUTE_READ_ONLY                                              = 0xC00D0BD6;
	public static final int NS_E_ATTRIBUTE_NOT_ALLOWED                                            = 0xC00D0BD7;
	public static final int NS_E_INVALID_EDL                                                      = 0xC00D0BD8;
	public static final int NS_E_DATA_UNIT_EXTENSION_TOO_LARGE                                    = 0xC00D0BD9;
	public static final int NS_E_CODEC_DMO_ERROR                                                  = 0xC00D0BDA;
	public static final int NS_E_FEATURE_DISABLED_BY_GROUP_POLICY                                 = 0xC00D0BDC;
	public static final int NS_E_FEATURE_DISABLED_IN_SKU                                          = 0xC00D0BDD;
	public static final int NS_E_NO_CD                                                            = 0xC00D0FA0;
	public static final int NS_E_CANT_READ_DIGITAL                                                = 0xC00D0FA1;
	public static final int NS_E_DEVICE_DISCONNECTED                                              = 0xC00D0FA2;
	public static final int NS_E_DEVICE_NOT_SUPPORT_FORMAT                                        = 0xC00D0FA3;
	public static final int NS_E_SLOW_READ_DIGITAL                                                = 0xC00D0FA4;
	public static final int NS_E_MIXER_INVALID_LINE                                               = 0xC00D0FA5;
	public static final int NS_E_MIXER_INVALID_CONTROL                                            = 0xC00D0FA6;
	public static final int NS_E_MIXER_INVALID_VALUE                                              = 0xC00D0FA7;
	public static final int NS_E_MIXER_UNKNOWN_MMRESULT                                           = 0xC00D0FA8;
	public static final int NS_E_USER_STOP                                                        = 0xC00D0FA9;
	public static final int NS_E_MP3_FORMAT_NOT_FOUND                                             = 0xC00D0FAA;
	public static final int NS_E_CD_READ_ERROR_NO_CORRECTION                                      = 0xC00D0FAB;
	public static final int NS_E_CD_READ_ERROR                                                    = 0xC00D0FAC;
	public static final int NS_E_CD_SLOW_COPY                                                     = 0xC00D0FAD;
	public static final int NS_E_CD_COPYTO_CD                                                     = 0xC00D0FAE;
	public static final int NS_E_MIXER_NODRIVER                                                   = 0xC00D0FAF;
	public static final int NS_E_REDBOOK_ENABLED_WHILE_COPYING                                    = 0xC00D0FB0;
	public static final int NS_E_CD_REFRESH                                                       = 0xC00D0FB1;
	public static final int NS_E_CD_DRIVER_PROBLEM                                                = 0xC00D0FB2;
	public static final int NS_E_WONT_DO_DIGITAL                                                  = 0xC00D0FB3;
	public static final int NS_E_WMPXML_NOERROR                                                   = 0xC00D0FB4;
	public static final int NS_E_WMPXML_ENDOFDATA                                                 = 0xC00D0FB5;
	public static final int NS_E_WMPXML_PARSEERROR                                                = 0xC00D0FB6;
	public static final int NS_E_WMPXML_ATTRIBUTENOTFOUND                                         = 0xC00D0FB7;
	public static final int NS_E_WMPXML_PINOTFOUND                                                = 0xC00D0FB8;
	public static final int NS_E_WMPXML_EMPTYDOC                                                  = 0xC00D0FB9;
	public static final int NS_E_WMP_PATH_ALREADY_IN_LIBRARY                                      = 0xC00D0FBA;
	public static final int NS_E_WMP_FILESCANALREADYSTARTED                                       = 0xC00D0FBE;
	public static final int NS_E_WMP_HME_INVALIDOBJECTID                                          = 0xC00D0FBF;
	public static final int NS_E_WMP_MF_CODE_EXPIRED                                              = 0xC00D0FC0;
	public static final int NS_E_WMP_HME_NOTSEARCHABLEFORITEMS                                    = 0xC00D0FC1;
	public static final int NS_E_WMP_ADDTOLIBRARY_FAILED                                          = 0xC00D0FC7;
	public static final int NS_E_WMP_WINDOWSAPIFAILURE                                            = 0xC00D0FC8;
	public static final int NS_E_WMP_RECORDING_NOT_ALLOWED                                        = 0xC00D0FC9;
	public static final int NS_E_DEVICE_NOT_READY                                                 = 0xC00D0FCA;
	public static final int NS_E_DAMAGED_FILE                                                     = 0xC00D0FCB;
	public static final int NS_E_MPDB_GENERIC                                                     = 0xC00D0FCC;
	public static final int NS_E_FILE_FAILED_CHECKS                                               = 0xC00D0FCD;
	public static final int NS_E_MEDIA_LIBRARY_FAILED                                             = 0xC00D0FCE;
	public static final int NS_E_SHARING_VIOLATION                                                = 0xC00D0FCF;
	public static final int NS_E_NO_ERROR_STRING_FOUND                                            = 0xC00D0FD0;
	public static final int NS_E_WMPOCX_NO_REMOTE_CORE                                            = 0xC00D0FD1;
	public static final int NS_E_WMPOCX_NO_ACTIVE_CORE                                            = 0xC00D0FD2;
	public static final int NS_E_WMPOCX_NOT_RUNNING_REMOTELY                                      = 0xC00D0FD3;
	public static final int NS_E_WMPOCX_NO_REMOTE_WINDOW                                          = 0xC00D0FD4;
	public static final int NS_E_WMPOCX_ERRORMANAGERNOTAVAILABLE                                  = 0xC00D0FD5;
	public static final int NS_E_PLUGIN_NOTSHUTDOWN                                               = 0xC00D0FD6;
	public static final int NS_E_WMP_CANNOT_FIND_FOLDER                                           = 0xC00D0FD7;
	public static final int NS_E_WMP_STREAMING_RECORDING_NOT_ALLOWED                              = 0xC00D0FD8;
	public static final int NS_E_WMP_PLUGINDLL_NOTFOUND                                           = 0xC00D0FD9;
	public static final int NS_E_NEED_TO_ASK_USER                                                 = 0xC00D0FDA;
	public static final int NS_E_WMPOCX_PLAYER_NOT_DOCKED                                         = 0xC00D0FDB;
	public static final int NS_E_WMP_EXTERNAL_NOTREADY                                            = 0xC00D0FDC;
	public static final int NS_E_WMP_MLS_STALE_DATA                                               = 0xC00D0FDD;
	public static final int NS_E_WMP_UI_SUBCONTROLSNOTSUPPORTED                                   = 0xC00D0FDE;
	public static final int NS_E_WMP_UI_VERSIONMISMATCH                                           = 0xC00D0FDF;
	public static final int NS_E_WMP_UI_NOTATHEMEFILE                                             = 0xC00D0FE0;
	public static final int NS_E_WMP_UI_SUBELEMENTNOTFOUND                                        = 0xC00D0FE1;
	public static final int NS_E_WMP_UI_VERSIONPARSE                                              = 0xC00D0FE2;
	public static final int NS_E_WMP_UI_VIEWIDNOTFOUND                                            = 0xC00D0FE3;
	public static final int NS_E_WMP_UI_PASSTHROUGH                                               = 0xC00D0FE4;
	public static final int NS_E_WMP_UI_OBJECTNOTFOUND                                            = 0xC00D0FE5;
	public static final int NS_E_WMP_UI_SECONDHANDLER                                             = 0xC00D0FE6;
	public static final int NS_E_WMP_UI_NOSKININZIP                                               = 0xC00D0FE7;
	public static final int NS_E_WMP_URLDOWNLOADFAILED                                            = 0xC00D0FEA;
	public static final int NS_E_WMPOCX_UNABLE_TO_LOAD_SKIN                                       = 0xC00D0FEB;
	public static final int NS_E_WMP_INVALID_SKIN                                                 = 0xC00D0FEC;
	public static final int NS_E_WMP_SENDMAILFAILED                                               = 0xC00D0FED;
	public static final int NS_E_WMP_LOCKEDINSKINMODE                                             = 0xC00D0FEE;
	public static final int NS_E_WMP_FAILED_TO_SAVE_FILE                                          = 0xC00D0FEF;
	public static final int NS_E_WMP_SAVEAS_READONLY                                              = 0xC00D0FF0;
	public static final int NS_E_WMP_FAILED_TO_SAVE_PLAYLIST                                      = 0xC00D0FF1;
	public static final int NS_E_WMP_FAILED_TO_OPEN_WMD                                           = 0xC00D0FF2;
	public static final int NS_E_WMP_CANT_PLAY_PROTECTED                                          = 0xC00D0FF3;
	public static final int NS_E_SHARING_STATE_OUT_OF_SYNC                                        = 0xC00D0FF4;
	public static final int NS_E_WMPOCX_REMOTE_PLAYER_ALREADY_RUNNING                             = 0xC00D0FFA;
	public static final int NS_E_WMP_RBC_JPGMAPPINGIMAGE                                          = 0xC00D1004;
	public static final int NS_E_WMP_JPGTRANSPARENCY                                              = 0xC00D1005;
	public static final int NS_E_WMP_INVALID_MAX_VAL                                              = 0xC00D1009;
	public static final int NS_E_WMP_INVALID_MIN_VAL                                              = 0xC00D100A;
	public static final int NS_E_WMP_CS_JPGPOSITIONIMAGE                                          = 0xC00D100E;
	public static final int NS_E_WMP_CS_NOTEVENLYDIVISIBLE                                        = 0xC00D100F;
	public static final int NS_E_WMPZIP_NOTAZIPFILE                                               = 0xC00D1018;
	public static final int NS_E_WMPZIP_CORRUPT                                                   = 0xC00D1019;
	public static final int NS_E_WMPZIP_FILENOTFOUND                                              = 0xC00D101A;
	public static final int NS_E_WMP_IMAGE_FILETYPE_UNSUPPORTED                                   = 0xC00D1022;
	public static final int NS_E_WMP_IMAGE_INVALID_FORMAT                                         = 0xC00D1023;
	public static final int NS_E_WMP_GIF_UNEXPECTED_ENDOFFILE                                     = 0xC00D1024;
	public static final int NS_E_WMP_GIF_INVALID_FORMAT                                           = 0xC00D1025;
	public static final int NS_E_WMP_GIF_BAD_VERSION_NUMBER                                       = 0xC00D1026;
	public static final int NS_E_WMP_GIF_NO_IMAGE_IN_FILE                                         = 0xC00D1027;
	public static final int NS_E_WMP_PNG_INVALIDFORMAT                                            = 0xC00D1028;
	public static final int NS_E_WMP_PNG_UNSUPPORTED_BITDEPTH                                     = 0xC00D1029;
	public static final int NS_E_WMP_PNG_UNSUPPORTED_COMPRESSION                                  = 0xC00D102A;
	public static final int NS_E_WMP_PNG_UNSUPPORTED_FILTER                                       = 0xC00D102B;
	public static final int NS_E_WMP_PNG_UNSUPPORTED_INTERLACE                                    = 0xC00D102C;
	public static final int NS_E_WMP_PNG_UNSUPPORTED_BAD_CRC                                      = 0xC00D102D;
	public static final int NS_E_WMP_BMP_INVALID_BITMASK                                          = 0xC00D102E;
	public static final int NS_E_WMP_BMP_TOPDOWN_DIB_UNSUPPORTED                                  = 0xC00D102F;
	public static final int NS_E_WMP_BMP_BITMAP_NOT_CREATED                                       = 0xC00D1030;
	public static final int NS_E_WMP_BMP_COMPRESSION_UNSUPPORTED                                  = 0xC00D1031;
	public static final int NS_E_WMP_BMP_INVALID_FORMAT                                           = 0xC00D1032;
	public static final int NS_E_WMP_JPG_JERR_ARITHCODING_NOTIMPL                                 = 0xC00D1033;
	public static final int NS_E_WMP_JPG_INVALID_FORMAT                                           = 0xC00D1034;
	public static final int NS_E_WMP_JPG_BAD_DCTSIZE                                              = 0xC00D1035;
	public static final int NS_E_WMP_JPG_BAD_VERSION_NUMBER                                       = 0xC00D1036;
	public static final int NS_E_WMP_JPG_BAD_PRECISION                                            = 0xC00D1037;
	public static final int NS_E_WMP_JPG_CCIR601_NOTIMPL                                          = 0xC00D1038;
	public static final int NS_E_WMP_JPG_NO_IMAGE_IN_FILE                                         = 0xC00D1039;
	public static final int NS_E_WMP_JPG_READ_ERROR                                               = 0xC00D103A;
	public static final int NS_E_WMP_JPG_FRACT_SAMPLE_NOTIMPL                                     = 0xC00D103B;
	public static final int NS_E_WMP_JPG_IMAGE_TOO_BIG                                            = 0xC00D103C;
	public static final int NS_E_WMP_JPG_UNEXPECTED_ENDOFFILE                                     = 0xC00D103D;
	public static final int NS_E_WMP_JPG_SOF_UNSUPPORTED                                          = 0xC00D103E;
	public static final int NS_E_WMP_JPG_UNKNOWN_MARKER                                           = 0xC00D103F;
	public static final int NS_E_WMP_FAILED_TO_OPEN_IMAGE                                         = 0xC00D1044;
	public static final int NS_E_WMP_DAI_SONGTOOSHORT                                             = 0xC00D1049;
	public static final int NS_E_WMG_RATEUNAVAILABLE                                              = 0xC00D104A;
	public static final int NS_E_WMG_PLUGINUNAVAILABLE                                            = 0xC00D104B;
	public static final int NS_E_WMG_CANNOTQUEUE                                                  = 0xC00D104C;
	public static final int NS_E_WMG_PREROLLLICENSEACQUISITIONNOTALLOWED                          = 0xC00D104D;
	public static final int NS_E_WMG_UNEXPECTEDPREROLLSTATUS                                      = 0xC00D104E;
	public static final int NS_E_WMG_INVALID_COPP_CERTIFICATE                                     = 0xC00D1051;
	public static final int NS_E_WMG_COPP_SECURITY_INVALID                                        = 0xC00D1052;
	public static final int NS_E_WMG_COPP_UNSUPPORTED                                             = 0xC00D1053;
	public static final int NS_E_WMG_INVALIDSTATE                                                 = 0xC00D1054;
	public static final int NS_E_WMG_SINKALREADYEXISTS                                            = 0xC00D1055;
	public static final int NS_E_WMG_NOSDKINTERFACE                                               = 0xC00D1056;
	public static final int NS_E_WMG_NOTALLOUTPUTSRENDERED                                        = 0xC00D1057;
	public static final int NS_E_WMG_FILETRANSFERNOTALLOWED                                       = 0xC00D1058;
	public static final int NS_E_WMR_UNSUPPORTEDSTREAM                                            = 0xC00D1059;
	public static final int NS_E_WMR_PINNOTFOUND                                                  = 0xC00D105A;
	public static final int NS_E_WMR_WAITINGONFORMATSWITCH                                        = 0xC00D105B;
	public static final int NS_E_WMR_NOSOURCEFILTER                                               = 0xC00D105C;
	public static final int NS_E_WMR_PINTYPENOMATCH                                               = 0xC00D105D;
	public static final int NS_E_WMR_NOCALLBACKAVAILABLE                                          = 0xC00D105E;
	public static final int NS_E_WMR_SAMPLEPROPERTYNOTSET                                         = 0xC00D1062;
	public static final int NS_E_WMR_CANNOT_RENDER_BINARY_STREAM                                  = 0xC00D1063;
	public static final int NS_E_WMG_LICENSE_TAMPERED                                             = 0xC00D1064;
	public static final int NS_E_WMR_WILLNOT_RENDER_BINARY_STREAM                                 = 0xC00D1065;
	public static final int NS_E_WMX_UNRECOGNIZED_PLAYLIST_FORMAT                                 = 0xC00D1068;
	public static final int NS_E_ASX_INVALIDFORMAT                                                = 0xC00D1069;
	public static final int NS_E_ASX_INVALIDVERSION                                               = 0xC00D106A;
	public static final int NS_E_ASX_INVALID_REPEAT_BLOCK                                         = 0xC00D106B;
	public static final int NS_E_ASX_NOTHING_TO_WRITE                                             = 0xC00D106C;
	public static final int NS_E_URLLIST_INVALIDFORMAT                                            = 0xC00D106D;
	public static final int NS_E_WMX_ATTRIBUTE_DOES_NOT_EXIST                                     = 0xC00D106E;
	public static final int NS_E_WMX_ATTRIBUTE_ALREADY_EXISTS                                     = 0xC00D106F;
	public static final int NS_E_WMX_ATTRIBUTE_UNRETRIEVABLE                                      = 0xC00D1070;
	public static final int NS_E_WMX_ITEM_DOES_NOT_EXIST                                          = 0xC00D1071;
	public static final int NS_E_WMX_ITEM_TYPE_ILLEGAL                                            = 0xC00D1072;
	public static final int NS_E_WMX_ITEM_UNSETTABLE                                              = 0xC00D1073;
	public static final int NS_E_WMX_PLAYLIST_EMPTY                                               = 0xC00D1074;
	public static final int NS_E_MLS_SMARTPLAYLIST_FILTER_NOT_REGISTERED                          = 0xC00D1075;
	public static final int NS_E_WMX_INVALID_FORMAT_OVER_NESTING                                  = 0xC00D1076;
	public static final int NS_E_WMPCORE_NOSOURCEURLSTRING                                        = 0xC00D107C;
	public static final int NS_E_WMPCORE_COCREATEFAILEDFORGITOBJECT                               = 0xC00D107D;
	public static final int NS_E_WMPCORE_FAILEDTOGETMARSHALLEDEVENTHANDLERINTERFACE               = 0xC00D107E;
	public static final int NS_E_WMPCORE_BUFFERTOOSMALL                                           = 0xC00D107F;
	public static final int NS_E_WMPCORE_UNAVAILABLE                                              = 0xC00D1080;
	public static final int NS_E_WMPCORE_INVALIDPLAYLISTMODE                                      = 0xC00D1081;
	public static final int NS_E_WMPCORE_ITEMNOTINPLAYLIST                                        = 0xC00D1086;
	public static final int NS_E_WMPCORE_PLAYLISTEMPTY                                            = 0xC00D1087;
	public static final int NS_E_WMPCORE_NOBROWSER                                                = 0xC00D1088;
	public static final int NS_E_WMPCORE_UNRECOGNIZED_MEDIA_URL                                   = 0xC00D1089;
	public static final int NS_E_WMPCORE_GRAPH_NOT_IN_LIST                                        = 0xC00D108A;
	public static final int NS_E_WMPCORE_PLAYLIST_EMPTY_OR_SINGLE_MEDIA                           = 0xC00D108B;
	public static final int NS_E_WMPCORE_ERRORSINKNOTREGISTERED                                   = 0xC00D108C;
	public static final int NS_E_WMPCORE_ERRORMANAGERNOTAVAILABLE                                 = 0xC00D108D;
	public static final int NS_E_WMPCORE_WEBHELPFAILED                                            = 0xC00D108E;
	public static final int NS_E_WMPCORE_MEDIA_ERROR_RESUME_FAILED                                = 0xC00D108F;
	public static final int NS_E_WMPCORE_NO_REF_IN_ENTRY                                          = 0xC00D1090;
	public static final int NS_E_WMPCORE_WMX_LIST_ATTRIBUTE_NAME_EMPTY                            = 0xC00D1091;
	public static final int NS_E_WMPCORE_WMX_LIST_ATTRIBUTE_NAME_ILLEGAL                          = 0xC00D1092;
	public static final int NS_E_WMPCORE_WMX_LIST_ATTRIBUTE_VALUE_EMPTY                           = 0xC00D1093;
	public static final int NS_E_WMPCORE_WMX_LIST_ATTRIBUTE_VALUE_ILLEGAL                         = 0xC00D1094;
	public static final int NS_E_WMPCORE_WMX_LIST_ITEM_ATTRIBUTE_NAME_EMPTY                       = 0xC00D1095;
	public static final int NS_E_WMPCORE_WMX_LIST_ITEM_ATTRIBUTE_NAME_ILLEGAL                     = 0xC00D1096;
	public static final int NS_E_WMPCORE_WMX_LIST_ITEM_ATTRIBUTE_VALUE_EMPTY                      = 0xC00D1097;
	public static final int NS_E_WMPCORE_LIST_ENTRY_NO_REF                                        = 0xC00D1098;
	public static final int NS_E_WMPCORE_MISNAMED_FILE                                            = 0xC00D1099;
	public static final int NS_E_WMPCORE_CODEC_NOT_TRUSTED                                        = 0xC00D109A;
	public static final int NS_E_WMPCORE_CODEC_NOT_FOUND                                          = 0xC00D109B;
	public static final int NS_E_WMPCORE_CODEC_DOWNLOAD_NOT_ALLOWED                               = 0xC00D109C;
	public static final int NS_E_WMPCORE_ERROR_DOWNLOADING_PLAYLIST                               = 0xC00D109D;
	public static final int NS_E_WMPCORE_FAILED_TO_BUILD_PLAYLIST                                 = 0xC00D109E;
	public static final int NS_E_WMPCORE_PLAYLIST_ITEM_ALTERNATE_NONE                             = 0xC00D109F;
	public static final int NS_E_WMPCORE_PLAYLIST_ITEM_ALTERNATE_EXHAUSTED                        = 0xC00D10A0;
	public static final int NS_E_WMPCORE_PLAYLIST_ITEM_ALTERNATE_NAME_NOT_FOUND                   = 0xC00D10A1;
	public static final int NS_E_WMPCORE_PLAYLIST_ITEM_ALTERNATE_MORPH_FAILED                     = 0xC00D10A2;
	public static final int NS_E_WMPCORE_PLAYLIST_ITEM_ALTERNATE_INIT_FAILED                      = 0xC00D10A3;
	public static final int NS_E_WMPCORE_MEDIA_ALTERNATE_REF_EMPTY                                = 0xC00D10A4;
	public static final int NS_E_WMPCORE_PLAYLIST_NO_EVENT_NAME                                   = 0xC00D10A5;
	public static final int NS_E_WMPCORE_PLAYLIST_EVENT_ATTRIBUTE_ABSENT                          = 0xC00D10A6;
	public static final int NS_E_WMPCORE_PLAYLIST_EVENT_EMPTY                                     = 0xC00D10A7;
	public static final int NS_E_WMPCORE_PLAYLIST_STACK_EMPTY                                     = 0xC00D10A8;
	public static final int NS_E_WMPCORE_CURRENT_MEDIA_NOT_ACTIVE                                 = 0xC00D10A9;
	public static final int NS_E_WMPCORE_USER_CANCEL                                              = 0xC00D10AB;
	public static final int NS_E_WMPCORE_PLAYLIST_REPEAT_EMPTY                                    = 0xC00D10AC;
	public static final int NS_E_WMPCORE_PLAYLIST_REPEAT_START_MEDIA_NONE                         = 0xC00D10AD;
	public static final int NS_E_WMPCORE_PLAYLIST_REPEAT_END_MEDIA_NONE                           = 0xC00D10AE;
	public static final int NS_E_WMPCORE_INVALID_PLAYLIST_URL                                     = 0xC00D10AF;
	public static final int NS_E_WMPCORE_MISMATCHED_RUNTIME                                       = 0xC00D10B0;
	public static final int NS_E_WMPCORE_PLAYLIST_IMPORT_FAILED_NO_ITEMS                          = 0xC00D10B1;
	public static final int NS_E_WMPCORE_VIDEO_TRANSFORM_FILTER_INSERTION                         = 0xC00D10B2;
	public static final int NS_E_WMPCORE_MEDIA_UNAVAILABLE                                        = 0xC00D10B3;
	public static final int NS_E_WMPCORE_WMX_ENTRYREF_NO_REF                                      = 0xC00D10B4;
	public static final int NS_E_WMPCORE_NO_PLAYABLE_MEDIA_IN_PLAYLIST                            = 0xC00D10B5;
	public static final int NS_E_WMPCORE_PLAYLIST_EMPTY_NESTED_PLAYLIST_SKIPPED_ITEMS             = 0xC00D10B6;
	public static final int NS_E_WMPCORE_BUSY                                                     = 0xC00D10B7;
	public static final int NS_E_WMPCORE_MEDIA_CHILD_PLAYLIST_UNAVAILABLE                         = 0xC00D10B8;
	public static final int NS_E_WMPCORE_MEDIA_NO_CHILD_PLAYLIST                                  = 0xC00D10B9;
	public static final int NS_E_WMPCORE_FILE_NOT_FOUND                                           = 0xC00D10BA;
	public static final int NS_E_WMPCORE_TEMP_FILE_NOT_FOUND                                      = 0xC00D10BB;
	public static final int NS_E_WMDM_REVOKED                                                     = 0xC00D10BC;
	public static final int NS_E_DDRAW_GENERIC                                                    = 0xC00D10BD;
	public static final int NS_E_DISPLAY_MODE_CHANGE_FAILED                                       = 0xC00D10BE;
	public static final int NS_E_PLAYLIST_CONTAINS_ERRORS                                         = 0xC00D10BF;
	public static final int NS_E_CHANGING_PROXY_NAME                                              = 0xC00D10C0;
	public static final int NS_E_CHANGING_PROXY_PORT                                              = 0xC00D10C1;
	public static final int NS_E_CHANGING_PROXY_EXCEPTIONLIST                                     = 0xC00D10C2;
	public static final int NS_E_CHANGING_PROXYBYPASS                                             = 0xC00D10C3;
	public static final int NS_E_CHANGING_PROXY_PROTOCOL_NOT_FOUND                                = 0xC00D10C4;
	public static final int NS_E_GRAPH_NOAUDIOLANGUAGE                                            = 0xC00D10C5;
	public static final int NS_E_GRAPH_NOAUDIOLANGUAGESELECTED                                    = 0xC00D10C6;
	public static final int NS_E_CORECD_NOTAMEDIACD                                               = 0xC00D10C7;
	public static final int NS_E_WMPCORE_MEDIA_URL_TOO_LONG                                       = 0xC00D10C8;
	public static final int NS_E_WMPFLASH_CANT_FIND_COM_SERVER                                    = 0xC00D10C9;
	public static final int NS_E_WMPFLASH_INCOMPATIBLEVERSION                                     = 0xC00D10CA;
	public static final int NS_E_WMPOCXGRAPH_IE_DISALLOWS_ACTIVEX_CONTROLS                        = 0xC00D10CB;
	public static final int NS_E_NEED_CORE_REFERENCE                                              = 0xC00D10CC;
	public static final int NS_E_MEDIACD_READ_ERROR                                               = 0xC00D10CD;
	public static final int NS_E_IE_DISALLOWS_ACTIVEX_CONTROLS                                    = 0xC00D10CE;
	public static final int NS_E_FLASH_PLAYBACK_NOT_ALLOWED                                       = 0xC00D10CF;
	public static final int NS_E_UNABLE_TO_CREATE_RIP_LOCATION                                    = 0xC00D10D0;
	public static final int NS_E_WMPCORE_SOME_CODECS_MISSING                                      = 0xC00D10D1;
	public static final int NS_E_WMP_RIP_FAILED                                                   = 0xC00D10D2;
	public static final int NS_E_WMP_FAILED_TO_RIP_TRACK                                          = 0xC00D10D3;
	public static final int NS_E_WMP_ERASE_FAILED                                                 = 0xC00D10D4;
	public static final int NS_E_WMP_FORMAT_FAILED                                                = 0xC00D10D5;
	public static final int NS_E_WMP_CANNOT_BURN_NON_LOCAL_FILE                                   = 0xC00D10D6;
	public static final int NS_E_WMP_FILE_TYPE_CANNOT_BURN_TO_AUDIO_CD                            = 0xC00D10D7;
	public static final int NS_E_WMP_FILE_DOES_NOT_FIT_ON_CD                                      = 0xC00D10D8;
	public static final int NS_E_WMP_FILE_NO_DURATION                                             = 0xC00D10D9;
	public static final int NS_E_PDA_FAILED_TO_BURN                                               = 0xC00D10DA;
	public static final int NS_E_FAILED_DOWNLOAD_ABORT_BURN                                       = 0xC00D10DC;
	public static final int NS_E_WMPCORE_DEVICE_DRIVERS_MISSING                                   = 0xC00D10DD;
	public static final int NS_E_WMPIM_USEROFFLINE                                                = 0xC00D1126;
	public static final int NS_E_WMPIM_USERCANCELED                                               = 0xC00D1127;
	public static final int NS_E_WMPIM_DIALUPFAILED                                               = 0xC00D1128;
	public static final int NS_E_WINSOCK_ERROR_STRING                                             = 0xC00D1129;
	public static final int NS_E_WMPBR_NOLISTENER                                                 = 0xC00D1130;
	public static final int NS_E_WMPBR_BACKUPCANCEL                                               = 0xC00D1131;
	public static final int NS_E_WMPBR_RESTORECANCEL                                              = 0xC00D1132;
	public static final int NS_E_WMPBR_ERRORWITHURL                                               = 0xC00D1133;
	public static final int NS_E_WMPBR_NAMECOLLISION                                              = 0xC00D1134;
	public static final int NS_E_WMPBR_DRIVE_INVALID                                              = 0xC00D1137;
	public static final int NS_E_WMPBR_BACKUPRESTOREFAILED                                        = 0xC00D1138;
	public static final int NS_E_WMP_CONVERT_FILE_FAILED                                          = 0xC00D1158;
	public static final int NS_E_WMP_CONVERT_NO_RIGHTS_ERRORURL                                   = 0xC00D1159;
	public static final int NS_E_WMP_CONVERT_NO_RIGHTS_NOERRORURL                                 = 0xC00D115A;
	public static final int NS_E_WMP_CONVERT_FILE_CORRUPT                                         = 0xC00D115B;
	public static final int NS_E_WMP_CONVERT_PLUGIN_UNAVAILABLE_ERRORURL                          = 0xC00D115C;
	public static final int NS_E_WMP_CONVERT_PLUGIN_UNAVAILABLE_NOERRORURL                        = 0xC00D115D;
	public static final int NS_E_WMP_CONVERT_PLUGIN_UNKNOWN_FILE_OWNER                            = 0xC00D115E;
	public static final int NS_E_DVD_DISC_COPY_PROTECT_OUTPUT_NS                                  = 0xC00D1160;
	public static final int NS_E_DVD_DISC_COPY_PROTECT_OUTPUT_FAILED                              = 0xC00D1161;
	public static final int NS_E_DVD_NO_SUBPICTURE_STREAM                                         = 0xC00D1162;
	public static final int NS_E_DVD_COPY_PROTECT                                                 = 0xC00D1163;
	public static final int NS_E_DVD_AUTHORING_PROBLEM                                            = 0xC00D1164;
	public static final int NS_E_DVD_INVALID_DISC_REGION                                          = 0xC00D1165;
	public static final int NS_E_DVD_COMPATIBLE_VIDEO_CARD                                        = 0xC00D1166;
	public static final int NS_E_DVD_MACROVISION                                                  = 0xC00D1167;
	public static final int NS_E_DVD_SYSTEM_DECODER_REGION                                        = 0xC00D1168;
	public static final int NS_E_DVD_DISC_DECODER_REGION                                          = 0xC00D1169;
	public static final int NS_E_DVD_NO_VIDEO_STREAM                                              = 0xC00D116A;
	public static final int NS_E_DVD_NO_AUDIO_STREAM                                              = 0xC00D116B;
	public static final int NS_E_DVD_GRAPH_BUILDING                                               = 0xC00D116C;
	public static final int NS_E_DVD_NO_DECODER                                                   = 0xC00D116D;
	public static final int NS_E_DVD_PARENTAL                                                     = 0xC00D116E;
	public static final int NS_E_DVD_CANNOT_JUMP                                                  = 0xC00D116F;
	public static final int NS_E_DVD_DEVICE_CONTENTION                                            = 0xC00D1170;
	public static final int NS_E_DVD_NO_VIDEO_MEMORY                                              = 0xC00D1171;
	public static final int NS_E_DVD_CANNOT_COPY_PROTECTED                                        = 0xC00D1172;
	public static final int NS_E_DVD_REQUIRED_PROPERTY_NOT_SET                                    = 0xC00D1173;
	public static final int NS_E_DVD_INVALID_TITLE_CHAPTER                                        = 0xC00D1174;
	public static final int NS_E_NO_CD_BURNER                                                     = 0xC00D1176;
	public static final int NS_E_DEVICE_IS_NOT_READY                                              = 0xC00D1177;
	public static final int NS_E_PDA_UNSUPPORTED_FORMAT                                           = 0xC00D1178;
	public static final int NS_E_NO_PDA                                                           = 0xC00D1179;
	public static final int NS_E_PDA_UNSPECIFIED_ERROR                                            = 0xC00D117A;
	public static final int NS_E_MEMSTORAGE_BAD_DATA                                              = 0xC00D117B;
	public static final int NS_E_PDA_FAIL_SELECT_DEVICE                                           = 0xC00D117C;
	public static final int NS_E_PDA_FAIL_READ_WAVE_FILE                                          = 0xC00D117D;
	public static final int NS_E_IMAPI_LOSSOFSTREAMING                                            = 0xC00D117E;
	public static final int NS_E_PDA_DEVICE_FULL                                                  = 0xC00D117F;
	public static final int NS_E_FAIL_LAUNCH_ROXIO_PLUGIN                                         = 0xC00D1180;
	public static final int NS_E_PDA_DEVICE_FULL_IN_SESSION                                       = 0xC00D1181;
	public static final int NS_E_IMAPI_MEDIUM_INVALIDTYPE                                         = 0xC00D1182;
	public static final int NS_E_PDA_MANUALDEVICE                                                 = 0xC00D1183;
	public static final int NS_E_PDA_PARTNERSHIPNOTEXIST                                          = 0xC00D1184;
	public static final int NS_E_PDA_CANNOT_CREATE_ADDITIONAL_SYNC_RELATIONSHIP                   = 0xC00D1185;
	public static final int NS_E_PDA_NO_TRANSCODE_OF_DRM                                          = 0xC00D1186;
	public static final int NS_E_PDA_TRANSCODECACHEFULL                                           = 0xC00D1187;
	public static final int NS_E_PDA_TOO_MANY_FILE_COLLISIONS                                     = 0xC00D1188;
	public static final int NS_E_PDA_CANNOT_TRANSCODE                                             = 0xC00D1189;
	public static final int NS_E_PDA_TOO_MANY_FILES_IN_DIRECTORY                                  = 0xC00D118A;
	public static final int NS_E_PROCESSINGSHOWSYNCWIZARD                                         = 0xC00D118B;
	public static final int NS_E_PDA_TRANSCODE_NOT_PERMITTED                                      = 0xC00D118C;
	public static final int NS_E_PDA_INITIALIZINGDEVICES                                          = 0xC00D118D;
	public static final int NS_E_PDA_OBSOLETE_SP                                                  = 0xC00D118E;
	public static final int NS_E_PDA_TITLE_COLLISION                                              = 0xC00D118F;
	public static final int NS_E_PDA_DEVICESUPPORTDISABLED                                        = 0xC00D1190;
	public static final int NS_E_PDA_NO_LONGER_AVAILABLE                                          = 0xC00D1191;
	public static final int NS_E_PDA_ENCODER_NOT_RESPONDING                                       = 0xC00D1192;
	public static final int NS_E_PDA_CANNOT_SYNC_FROM_LOCATION                                    = 0xC00D1193;
	public static final int NS_E_WMP_PROTOCOL_PROBLEM                                             = 0xC00D1194;
	public static final int NS_E_WMP_NO_DISK_SPACE                                                = 0xC00D1195;
	public static final int NS_E_WMP_LOGON_FAILURE                                                = 0xC00D1196;
	public static final int NS_E_WMP_CANNOT_FIND_FILE                                             = 0xC00D1197;
	public static final int NS_E_WMP_SERVER_INACCESSIBLE                                          = 0xC00D1198;
	public static final int NS_E_WMP_UNSUPPORTED_FORMAT                                           = 0xC00D1199;
	public static final int NS_E_WMP_DSHOW_UNSUPPORTED_FORMAT                                     = 0xC00D119A;
	public static final int NS_E_WMP_PLAYLIST_EXISTS                                              = 0xC00D119B;
	public static final int NS_E_WMP_NONMEDIA_FILES                                               = 0xC00D119C;
	public static final int NS_E_WMP_INVALID_ASX                                                  = 0xC00D119D;
	public static final int NS_E_WMP_ALREADY_IN_USE                                               = 0xC00D119E;
	public static final int NS_E_WMP_IMAPI_FAILURE                                                = 0xC00D119F;
	public static final int NS_E_WMP_WMDM_FAILURE                                                 = 0xC00D11A0;
	public static final int NS_E_WMP_CODEC_NEEDED_WITH_4CC                                        = 0xC00D11A1;
	public static final int NS_E_WMP_CODEC_NEEDED_WITH_FORMATTAG                                  = 0xC00D11A2;
	public static final int NS_E_WMP_MSSAP_NOT_AVAILABLE                                          = 0xC00D11A3;
	public static final int NS_E_WMP_WMDM_INTERFACEDEAD                                           = 0xC00D11A4;
	public static final int NS_E_WMP_WMDM_NOTCERTIFIED                                            = 0xC00D11A5;
	public static final int NS_E_WMP_WMDM_LICENSE_NOTEXIST                                        = 0xC00D11A6;
	public static final int NS_E_WMP_WMDM_LICENSE_EXPIRED                                         = 0xC00D11A7;
	public static final int NS_E_WMP_WMDM_BUSY                                                    = 0xC00D11A8;
	public static final int NS_E_WMP_WMDM_NORIGHTS                                                = 0xC00D11A9;
	public static final int NS_E_WMP_WMDM_INCORRECT_RIGHTS                                        = 0xC00D11AA;
	public static final int NS_E_WMP_IMAPI_GENERIC                                                = 0xC00D11AB;
	public static final int NS_E_WMP_IMAPI_DEVICE_NOTPRESENT                                      = 0xC00D11AD;
	public static final int NS_E_WMP_IMAPI_DEVICE_BUSY                                            = 0xC00D11AE;
	public static final int NS_E_WMP_IMAPI_LOSS_OF_STREAMING                                      = 0xC00D11AF;
	public static final int NS_E_WMP_SERVER_UNAVAILABLE                                           = 0xC00D11B0;
	public static final int NS_E_WMP_FILE_OPEN_FAILED                                             = 0xC00D11B1;
	public static final int NS_E_WMP_VERIFY_ONLINE                                                = 0xC00D11B2;
	public static final int NS_E_WMP_SERVER_NOT_RESPONDING                                        = 0xC00D11B3;
	public static final int NS_E_WMP_DRM_CORRUPT_BACKUP                                           = 0xC00D11B4;
	public static final int NS_E_WMP_DRM_LICENSE_SERVER_UNAVAILABLE                               = 0xC00D11B5;
	public static final int NS_E_WMP_NETWORK_FIREWALL                                             = 0xC00D11B6;
	public static final int NS_E_WMP_NO_REMOVABLE_MEDIA                                           = 0xC00D11B7;
	public static final int NS_E_WMP_PROXY_CONNECT_TIMEOUT                                        = 0xC00D11B8;
	public static final int NS_E_WMP_NEED_UPGRADE                                                 = 0xC00D11B9;
	public static final int NS_E_WMP_AUDIO_HW_PROBLEM                                             = 0xC00D11BA;
	public static final int NS_E_WMP_INVALID_PROTOCOL                                             = 0xC00D11BB;
	public static final int NS_E_WMP_INVALID_LIBRARY_ADD                                          = 0xC00D11BC;
	public static final int NS_E_WMP_MMS_NOT_SUPPORTED                                            = 0xC00D11BD;
	public static final int NS_E_WMP_NO_PROTOCOLS_SELECTED                                        = 0xC00D11BE;
	public static final int NS_E_WMP_GOFULLSCREEN_FAILED                                          = 0xC00D11BF;
	public static final int NS_E_WMP_NETWORK_ERROR                                                = 0xC00D11C0;
	public static final int NS_E_WMP_CONNECT_TIMEOUT                                              = 0xC00D11C1;
	public static final int NS_E_WMP_MULTICAST_DISABLED                                           = 0xC00D11C2;
	public static final int NS_E_WMP_SERVER_DNS_TIMEOUT                                           = 0xC00D11C3;
	public static final int NS_E_WMP_PROXY_NOT_FOUND                                              = 0xC00D11C4;
	public static final int NS_E_WMP_TAMPERED_CONTENT                                             = 0xC00D11C5;
	public static final int NS_E_WMP_OUTOFMEMORY                                                  = 0xC00D11C6;
	public static final int NS_E_WMP_AUDIO_CODEC_NOT_INSTALLED                                    = 0xC00D11C7;
	public static final int NS_E_WMP_VIDEO_CODEC_NOT_INSTALLED                                    = 0xC00D11C8;
	public static final int NS_E_WMP_IMAPI_DEVICE_INVALIDTYPE                                     = 0xC00D11C9;
	public static final int NS_E_WMP_DRM_DRIVER_AUTH_FAILURE                                      = 0xC00D11CA;
	public static final int NS_E_WMP_NETWORK_RESOURCE_FAILURE                                     = 0xC00D11CB;
	public static final int NS_E_WMP_UPGRADE_APPLICATION                                          = 0xC00D11CC;
	public static final int NS_E_WMP_UNKNOWN_ERROR                                                = 0xC00D11CD;
	public static final int NS_E_WMP_INVALID_KEY                                                  = 0xC00D11CE;
	public static final int NS_E_WMP_CD_ANOTHER_USER                                              = 0xC00D11CF;
	public static final int NS_E_WMP_DRM_NEEDS_AUTHORIZATION                                      = 0xC00D11D0;
	public static final int NS_E_WMP_BAD_DRIVER                                                   = 0xC00D11D1;
	public static final int NS_E_WMP_ACCESS_DENIED                                                = 0xC00D11D2;
	public static final int NS_E_WMP_LICENSE_RESTRICTS                                            = 0xC00D11D3;
	public static final int NS_E_WMP_INVALID_REQUEST                                              = 0xC00D11D4;
	public static final int NS_E_WMP_CD_STASH_NO_SPACE                                            = 0xC00D11D5;
	public static final int NS_E_WMP_DRM_NEW_HARDWARE                                             = 0xC00D11D6;
	public static final int NS_E_WMP_DRM_INVALID_SIG                                              = 0xC00D11D7;
	public static final int NS_E_WMP_DRM_CANNOT_RESTORE                                           = 0xC00D11D8;
	public static final int NS_E_WMP_BURN_DISC_OVERFLOW                                           = 0xC00D11D9;
	public static final int NS_E_WMP_DRM_GENERIC_LICENSE_FAILURE                                  = 0xC00D11DA;
	public static final int NS_E_WMP_DRM_NO_SECURE_CLOCK                                          = 0xC00D11DB;
	public static final int NS_E_WMP_DRM_NO_RIGHTS                                                = 0xC00D11DC;
	public static final int NS_E_WMP_DRM_INDIV_FAILED                                             = 0xC00D11DD;
	public static final int NS_E_WMP_SERVER_NONEWCONNECTIONS                                      = 0xC00D11DE;
	public static final int NS_E_WMP_MULTIPLE_ERROR_IN_PLAYLIST                                   = 0xC00D11DF;
	public static final int NS_E_WMP_IMAPI2_ERASE_FAIL                                            = 0xC00D11E0;
	public static final int NS_E_WMP_IMAPI2_ERASE_DEVICE_BUSY                                     = 0xC00D11E1;
	public static final int NS_E_WMP_DRM_COMPONENT_FAILURE                                        = 0xC00D11E2;
	public static final int NS_E_WMP_DRM_NO_DEVICE_CERT                                           = 0xC00D11E3;
	public static final int NS_E_WMP_SERVER_SECURITY_ERROR                                        = 0xC00D11E4;
	public static final int NS_E_WMP_AUDIO_DEVICE_LOST                                            = 0xC00D11E5;
	public static final int NS_E_WMP_IMAPI_MEDIA_INCOMPATIBLE                                     = 0xC00D11E6;
	public static final int NS_E_SYNCWIZ_DEVICE_FULL                                              = 0xC00D11EE;
	public static final int NS_E_SYNCWIZ_CANNOT_CHANGE_SETTINGS                                   = 0xC00D11EF;
	public static final int NS_E_TRANSCODE_DELETECACHEERROR                                       = 0xC00D11F0;
	public static final int NS_E_CD_NO_BUFFERS_READ                                               = 0xC00D11F8;
	public static final int NS_E_CD_EMPTY_TRACK_QUEUE                                             = 0xC00D11F9;
	public static final int NS_E_CD_NO_READER                                                     = 0xC00D11FA;
	public static final int NS_E_CD_ISRC_INVALID                                                  = 0xC00D11FB;
	public static final int NS_E_CD_MEDIA_CATALOG_NUMBER_INVALID                                  = 0xC00D11FC;
	public static final int NS_E_SLOW_READ_DIGITAL_WITH_ERRORCORRECTION                           = 0xC00D11FD;
	public static final int NS_E_CD_SPEEDDETECT_NOT_ENOUGH_READS                                  = 0xC00D11FE;
	public static final int NS_E_CD_QUEUEING_DISABLED                                             = 0xC00D11FF;
	public static final int NS_E_WMP_DRM_ACQUIRING_LICENSE                                        = 0xC00D1202;
	public static final int NS_E_WMP_DRM_LICENSE_EXPIRED                                          = 0xC00D1203;
	public static final int NS_E_WMP_DRM_LICENSE_NOTACQUIRED                                      = 0xC00D1204;
	public static final int NS_E_WMP_DRM_LICENSE_NOTENABLED                                       = 0xC00D1205;
	public static final int NS_E_WMP_DRM_LICENSE_UNUSABLE                                         = 0xC00D1206;
	public static final int NS_E_WMP_DRM_LICENSE_CONTENT_REVOKED                                  = 0xC00D1207;
	public static final int NS_E_WMP_DRM_LICENSE_NOSAP                                            = 0xC00D1208;
	public static final int NS_E_WMP_DRM_UNABLE_TO_ACQUIRE_LICENSE                                = 0xC00D1209;
	public static final int NS_E_WMP_LICENSE_REQUIRED                                             = 0xC00D120A;
	public static final int NS_E_WMP_PROTECTED_CONTENT                                            = 0xC00D120B;
	public static final int NS_E_WMP_POLICY_VALUE_NOT_CONFIGURED                                  = 0xC00D122A;
	public static final int NS_E_PDA_CANNOT_SYNC_FROM_INTERNET                                    = 0xC00D1234;
	public static final int NS_E_PDA_CANNOT_SYNC_INVALID_PLAYLIST                                 = 0xC00D1235;
	public static final int NS_E_PDA_FAILED_TO_SYNCHRONIZE_FILE                                   = 0xC00D1236;
	public static final int NS_E_PDA_SYNC_FAILED                                                  = 0xC00D1237;
	public static final int NS_E_PDA_DELETE_FAILED                                                = 0xC00D1238;
	public static final int NS_E_PDA_FAILED_TO_RETRIEVE_FILE                                      = 0xC00D1239;
	public static final int NS_E_PDA_DEVICE_NOT_RESPONDING                                        = 0xC00D123A;
	public static final int NS_E_PDA_FAILED_TO_TRANSCODE_PHOTO                                    = 0xC00D123B;
	public static final int NS_E_PDA_FAILED_TO_ENCRYPT_TRANSCODED_FILE                            = 0xC00D123C;
	public static final int NS_E_PDA_CANNOT_TRANSCODE_TO_AUDIO                                    = 0xC00D123D;
	public static final int NS_E_PDA_CANNOT_TRANSCODE_TO_VIDEO                                    = 0xC00D123E;
	public static final int NS_E_PDA_CANNOT_TRANSCODE_TO_IMAGE                                    = 0xC00D123F;
	public static final int NS_E_PDA_RETRIEVED_FILE_FILENAME_TOO_LONG                             = 0xC00D1240;
	public static final int NS_E_PDA_CEWMDM_DRM_ERROR                                             = 0xC00D1241;
	public static final int NS_E_INCOMPLETE_PLAYLIST                                              = 0xC00D1242;
	public static final int NS_E_PDA_SYNC_RUNNING                                                 = 0xC00D1243;
	public static final int NS_E_PDA_SYNC_LOGIN_ERROR                                             = 0xC00D1244;
	public static final int NS_E_PDA_TRANSCODE_CODEC_NOT_FOUND                                    = 0xC00D1245;
	public static final int NS_E_CANNOT_SYNC_DRM_TO_NON_JANUS_DEVICE                              = 0xC00D1246;
	public static final int NS_E_CANNOT_SYNC_PREVIOUS_SYNC_RUNNING                                = 0xC00D1247;
	public static final int NS_E_WMP_HWND_NOTFOUND                                                = 0xC00D125C;
	public static final int NS_E_BKGDOWNLOAD_WRONG_NO_FILES                                       = 0xC00D125D;
	public static final int NS_E_BKGDOWNLOAD_COMPLETECANCELLEDJOB                                 = 0xC00D125E;
	public static final int NS_E_BKGDOWNLOAD_CANCELCOMPLETEDJOB                                   = 0xC00D125F;
	public static final int NS_E_BKGDOWNLOAD_NOJOBPOINTER                                         = 0xC00D1260;
	public static final int NS_E_BKGDOWNLOAD_INVALIDJOBSIGNATURE                                  = 0xC00D1261;
	public static final int NS_E_BKGDOWNLOAD_FAILED_TO_CREATE_TEMPFILE                            = 0xC00D1262;
	public static final int NS_E_BKGDOWNLOAD_PLUGIN_FAILEDINITIALIZE                              = 0xC00D1263;
	public static final int NS_E_BKGDOWNLOAD_PLUGIN_FAILEDTOMOVEFILE                              = 0xC00D1264;
	public static final int NS_E_BKGDOWNLOAD_CALLFUNCFAILED                                       = 0xC00D1265;
	public static final int NS_E_BKGDOWNLOAD_CALLFUNCTIMEOUT                                      = 0xC00D1266;
	public static final int NS_E_BKGDOWNLOAD_CALLFUNCENDED                                        = 0xC00D1267;
	public static final int NS_E_BKGDOWNLOAD_WMDUNPACKFAILED                                      = 0xC00D1268;
	public static final int NS_E_BKGDOWNLOAD_FAILEDINITIALIZE                                     = 0xC00D1269;
	public static final int NS_E_INTERFACE_NOT_REGISTERED_IN_GIT                                  = 0xC00D126A;
	public static final int NS_E_BKGDOWNLOAD_INVALID_FILE_NAME                                    = 0xC00D126B;
	public static final int NS_E_IMAGE_DOWNLOAD_FAILED                                            = 0xC00D128E;
	public static final int NS_E_WMP_UDRM_NOUSERLIST                                              = 0xC00D12C0;
	public static final int NS_E_WMP_DRM_NOT_ACQUIRING                                            = 0xC00D12C1;
	public static final int NS_E_WMP_BSTR_TOO_LONG                                                = 0xC00D12F2;
	public static final int NS_E_WMP_AUTOPLAY_INVALID_STATE                                       = 0xC00D12FC;
	public static final int NS_E_WMP_COMPONENT_REVOKED                                            = 0xC00D1306;
	public static final int NS_E_CURL_NOTSAFE                                                     = 0xC00D1324;
	public static final int NS_E_CURL_INVALIDCHAR                                                 = 0xC00D1325;
	public static final int NS_E_CURL_INVALIDHOSTNAME                                             = 0xC00D1326;
	public static final int NS_E_CURL_INVALIDPATH                                                 = 0xC00D1327;
	public static final int NS_E_CURL_INVALIDSCHEME                                               = 0xC00D1328;
	public static final int NS_E_CURL_INVALIDURL                                                  = 0xC00D1329;
	public static final int NS_E_CURL_CANTWALK                                                    = 0xC00D132B;
	public static final int NS_E_CURL_INVALIDPORT                                                 = 0xC00D132C;
	public static final int NS_E_CURLHELPER_NOTADIRECTORY                                         = 0xC00D132D;
	public static final int NS_E_CURLHELPER_NOTAFILE                                              = 0xC00D132E;
	public static final int NS_E_CURL_CANTDECODE                                                  = 0xC00D132F;
	public static final int NS_E_CURLHELPER_NOTRELATIVE                                           = 0xC00D1330;
	public static final int NS_E_CURL_INVALIDBUFFERSIZE                                           = 0xC00D1331;
	public static final int NS_E_SUBSCRIPTIONSERVICE_PLAYBACK_DISALLOWED                          = 0xC00D1356;
	public static final int NS_E_CANNOT_BUY_OR_DOWNLOAD_FROM_MULTIPLE_SERVICES                    = 0xC00D1357;
	public static final int NS_E_CANNOT_BUY_OR_DOWNLOAD_CONTENT                                   = 0xC00D1358;
	public static final int NS_E_NOT_CONTENT_PARTNER_TRACK                                        = 0xC00D135A;
	public static final int NS_E_TRACK_DOWNLOAD_REQUIRES_ALBUM_PURCHASE                           = 0xC00D135B;
	public static final int NS_E_TRACK_DOWNLOAD_REQUIRES_PURCHASE                                 = 0xC00D135C;
	public static final int NS_E_TRACK_PURCHASE_MAXIMUM_EXCEEDED                                  = 0xC00D135D;
	public static final int NS_E_SUBSCRIPTIONSERVICE_LOGIN_FAILED                                 = 0xC00D135F;
	public static final int NS_E_SUBSCRIPTIONSERVICE_DOWNLOAD_TIMEOUT                             = 0xC00D1360;
	public static final int NS_E_CONTENT_PARTNER_STILL_INITIALIZING                               = 0xC00D1362;
	public static final int NS_E_OPEN_CONTAINING_FOLDER_FAILED                                    = 0xC00D1363;
	public static final int NS_E_ADVANCEDEDIT_TOO_MANY_PICTURES                                   = 0xC00D136A;
	public static final int NS_E_REDIRECT                                                         = 0xC00D1388;
	public static final int NS_E_STALE_PRESENTATION                                               = 0xC00D1389;
	public static final int NS_E_NAMESPACE_WRONG_PERSIST                                          = 0xC00D138A;
	public static final int NS_E_NAMESPACE_WRONG_TYPE                                             = 0xC00D138B;
	public static final int NS_E_NAMESPACE_NODE_CONFLICT                                          = 0xC00D138C;
	public static final int NS_E_NAMESPACE_NODE_NOT_FOUND                                         = 0xC00D138D;
	public static final int NS_E_NAMESPACE_BUFFER_TOO_SMALL                                       = 0xC00D138E;
	public static final int NS_E_NAMESPACE_TOO_MANY_CALLBACKS                                     = 0xC00D138F;
	public static final int NS_E_NAMESPACE_DUPLICATE_CALLBACK                                     = 0xC00D1390;
	public static final int NS_E_NAMESPACE_CALLBACK_NOT_FOUND                                     = 0xC00D1391;
	public static final int NS_E_NAMESPACE_NAME_TOO_LONG                                          = 0xC00D1392;
	public static final int NS_E_NAMESPACE_DUPLICATE_NAME                                         = 0xC00D1393;
	public static final int NS_E_NAMESPACE_EMPTY_NAME                                             = 0xC00D1394;
	public static final int NS_E_NAMESPACE_INDEX_TOO_LARGE                                        = 0xC00D1395;
	public static final int NS_E_NAMESPACE_BAD_NAME                                               = 0xC00D1396;
	public static final int NS_E_NAMESPACE_WRONG_SECURITY                                         = 0xC00D1397;
	public static final int NS_E_CACHE_ARCHIVE_CONFLICT                                           = 0xC00D13EC;
	public static final int NS_E_CACHE_ORIGIN_SERVER_NOT_FOUND                                    = 0xC00D13ED;
	public static final int NS_E_CACHE_ORIGIN_SERVER_TIMEOUT                                      = 0xC00D13EE;
	public static final int NS_E_CACHE_NOT_BROADCAST                                              = 0xC00D13EF;
	public static final int NS_E_CACHE_CANNOT_BE_CACHED                                           = 0xC00D13F0;
	public static final int NS_E_CACHE_NOT_MODIFIED                                               = 0xC00D13F1;
	public static final int NS_E_CANNOT_REMOVE_PUBLISHING_POINT                                   = 0xC00D1450;
	public static final int NS_E_CANNOT_REMOVE_PLUGIN                                             = 0xC00D1451;
	public static final int NS_E_WRONG_PUBLISHING_POINT_TYPE                                      = 0xC00D1452;
	public static final int NS_E_UNSUPPORTED_LOAD_TYPE                                            = 0xC00D1453;
	public static final int NS_E_INVALID_PLUGIN_LOAD_TYPE_CONFIGURATION                           = 0xC00D1454;
	public static final int NS_E_INVALID_PUBLISHING_POINT_NAME                                    = 0xC00D1455;
	public static final int NS_E_TOO_MANY_MULTICAST_SINKS                                         = 0xC00D1456;
	public static final int NS_E_PUBLISHING_POINT_INVALID_REQUEST_WHILE_STARTED                   = 0xC00D1457;
	public static final int NS_E_MULTICAST_PLUGIN_NOT_ENABLED                                     = 0xC00D1458;
	public static final int NS_E_INVALID_OPERATING_SYSTEM_VERSION                                 = 0xC00D1459;
	public static final int NS_E_PUBLISHING_POINT_REMOVED                                         = 0xC00D145A;
	public static final int NS_E_INVALID_PUSH_PUBLISHING_POINT_START_REQUEST                      = 0xC00D145B;
	public static final int NS_E_UNSUPPORTED_LANGUAGE                                             = 0xC00D145C;
	public static final int NS_E_WRONG_OS_VERSION                                                 = 0xC00D145D;
	public static final int NS_E_PUBLISHING_POINT_STOPPED                                         = 0xC00D145E;
	public static final int NS_E_PLAYLIST_ENTRY_ALREADY_PLAYING                                   = 0xC00D14B4;
	public static final int NS_E_EMPTY_PLAYLIST                                                   = 0xC00D14B5;
	public static final int NS_E_PLAYLIST_PARSE_FAILURE                                           = 0xC00D14B6;
	public static final int NS_E_PLAYLIST_UNSUPPORTED_ENTRY                                       = 0xC00D14B7;
	public static final int NS_E_PLAYLIST_ENTRY_NOT_IN_PLAYLIST                                   = 0xC00D14B8;
	public static final int NS_E_PLAYLIST_ENTRY_SEEK                                              = 0xC00D14B9;
	public static final int NS_E_PLAYLIST_RECURSIVE_PLAYLISTS                                     = 0xC00D14BA;
	public static final int NS_E_PLAYLIST_TOO_MANY_NESTED_PLAYLISTS                               = 0xC00D14BB;
	public static final int NS_E_PLAYLIST_SHUTDOWN                                                = 0xC00D14BC;
	public static final int NS_E_PLAYLIST_END_RECEDING                                            = 0xC00D14BD;
	public static final int NS_E_DATAPATH_NO_SINK                                                 = 0xC00D1518;
	public static final int NS_E_INVALID_PUSH_TEMPLATE                                            = 0xC00D151A;
	public static final int NS_E_INVALID_PUSH_PUBLISHING_POINT                                    = 0xC00D151B;
	public static final int NS_E_CRITICAL_ERROR                                                   = 0xC00D151C;
	public static final int NS_E_NO_NEW_CONNECTIONS                                               = 0xC00D151D;
	public static final int NS_E_WSX_INVALID_VERSION                                              = 0xC00D151E;
	public static final int NS_E_HEADER_MISMATCH                                                  = 0xC00D151F;
	public static final int NS_E_PUSH_DUPLICATE_PUBLISHING_POINT_NAME                             = 0xC00D1520;
	public static final int NS_E_NO_SCRIPT_ENGINE                                                 = 0xC00D157C;
	public static final int NS_E_PLUGIN_ERROR_REPORTED                                            = 0xC00D157D;
	public static final int NS_E_SOURCE_PLUGIN_NOT_FOUND                                          = 0xC00D157E;
	public static final int NS_E_PLAYLIST_PLUGIN_NOT_FOUND                                        = 0xC00D157F;
	public static final int NS_E_DATA_SOURCE_ENUMERATION_NOT_SUPPORTED                            = 0xC00D1580;
	public static final int NS_E_MEDIA_PARSER_INVALID_FORMAT                                      = 0xC00D1581;
	public static final int NS_E_SCRIPT_DEBUGGER_NOT_INSTALLED                                    = 0xC00D1582;
	public static final int NS_E_FEATURE_REQUIRES_ENTERPRISE_SERVER                               = 0xC00D1583;
	public static final int NS_E_WIZARD_RUNNING                                                   = 0xC00D1584;
	public static final int NS_E_INVALID_LOG_URL                                                  = 0xC00D1585;
	public static final int NS_E_INVALID_MTU_RANGE                                                = 0xC00D1586;
	public static final int NS_E_INVALID_PLAY_STATISTICS                                          = 0xC00D1587;
	public static final int NS_E_LOG_NEED_TO_BE_SKIPPED                                           = 0xC00D1588;
	public static final int NS_E_HTTP_TEXT_DATACONTAINER_SIZE_LIMIT_EXCEEDED                      = 0xC00D1589;
	public static final int NS_E_PORT_IN_USE                                                      = 0xC00D158A;
	public static final int NS_E_PORT_IN_USE_HTTP                                                 = 0xC00D158B;
	public static final int NS_E_HTTP_TEXT_DATACONTAINER_INVALID_SERVER_RESPONSE                  = 0xC00D158C;
	public static final int NS_E_ARCHIVE_REACH_QUOTA                                              = 0xC00D158D;
	public static final int NS_E_ARCHIVE_ABORT_DUE_TO_BCAST                                       = 0xC00D158E;
	public static final int NS_E_ARCHIVE_GAP_DETECTED                                             = 0xC00D158F;
	public static final int NS_E_AUTHORIZATION_FILE_NOT_FOUND                                     = 0xC00D1590;
	public static final int NS_E_BAD_MARKIN                                                       = 0xC00D1B58;
	public static final int NS_E_BAD_MARKOUT                                                      = 0xC00D1B59;
	public static final int NS_E_NOMATCHING_MEDIASOURCE                                           = 0xC00D1B5A;
	public static final int NS_E_UNSUPPORTED_SOURCETYPE                                           = 0xC00D1B5B;
	public static final int NS_E_TOO_MANY_AUDIO                                                   = 0xC00D1B5C;
	public static final int NS_E_TOO_MANY_VIDEO                                                   = 0xC00D1B5D;
	public static final int NS_E_NOMATCHING_ELEMENT                                               = 0xC00D1B5E;
	public static final int NS_E_MISMATCHED_MEDIACONTENT                                          = 0xC00D1B5F;
	public static final int NS_E_CANNOT_DELETE_ACTIVE_SOURCEGROUP                                 = 0xC00D1B60;
	public static final int NS_E_AUDIODEVICE_BUSY                                                 = 0xC00D1B61;
	public static final int NS_E_AUDIODEVICE_UNEXPECTED                                           = 0xC00D1B62;
	public static final int NS_E_AUDIODEVICE_BADFORMAT                                            = 0xC00D1B63;
	public static final int NS_E_VIDEODEVICE_BUSY                                                 = 0xC00D1B64;
	public static final int NS_E_VIDEODEVICE_UNEXPECTED                                           = 0xC00D1B65;
	public static final int NS_E_INVALIDCALL_WHILE_ENCODER_RUNNING                                = 0xC00D1B66;
	public static final int NS_E_NO_PROFILE_IN_SOURCEGROUP                                        = 0xC00D1B67;
	public static final int NS_E_VIDEODRIVER_UNSTABLE                                             = 0xC00D1B68;
	public static final int NS_E_VIDCAPSTARTFAILED                                                = 0xC00D1B69;
	public static final int NS_E_VIDSOURCECOMPRESSION                                             = 0xC00D1B6A;
	public static final int NS_E_VIDSOURCESIZE                                                    = 0xC00D1B6B;
	public static final int NS_E_ICMQUERYFORMAT                                                   = 0xC00D1B6C;
	public static final int NS_E_VIDCAPCREATEWINDOW                                               = 0xC00D1B6D;
	public static final int NS_E_VIDCAPDRVINUSE                                                   = 0xC00D1B6E;
	public static final int NS_E_NO_MEDIAFORMAT_IN_SOURCE                                         = 0xC00D1B6F;
	public static final int NS_E_NO_VALID_OUTPUT_STREAM                                           = 0xC00D1B70;
	public static final int NS_E_NO_VALID_SOURCE_PLUGIN                                           = 0xC00D1B71;
	public static final int NS_E_NO_ACTIVE_SOURCEGROUP                                            = 0xC00D1B72;
	public static final int NS_E_NO_SCRIPT_STREAM                                                 = 0xC00D1B73;
	public static final int NS_E_INVALIDCALL_WHILE_ARCHIVAL_RUNNING                               = 0xC00D1B74;
	public static final int NS_E_INVALIDPACKETSIZE                                                = 0xC00D1B75;
	public static final int NS_E_PLUGIN_CLSID_INVALID                                             = 0xC00D1B76;
	public static final int NS_E_UNSUPPORTED_ARCHIVETYPE                                          = 0xC00D1B77;
	public static final int NS_E_UNSUPPORTED_ARCHIVEOPERATION                                     = 0xC00D1B78;
	public static final int NS_E_ARCHIVE_FILENAME_NOTSET                                          = 0xC00D1B79;
	public static final int NS_E_SOURCEGROUP_NOTPREPARED                                          = 0xC00D1B7A;
	public static final int NS_E_PROFILE_MISMATCH                                                 = 0xC00D1B7B;
	public static final int NS_E_INCORRECTCLIPSETTINGS                                            = 0xC00D1B7C;
	public static final int NS_E_NOSTATSAVAILABLE                                                 = 0xC00D1B7D;
	public static final int NS_E_NOTARCHIVING                                                     = 0xC00D1B7E;
	public static final int NS_E_INVALIDCALL_WHILE_ENCODER_STOPPED                                = 0xC00D1B7F;
	public static final int NS_E_NOSOURCEGROUPS                                                   = 0xC00D1B80;
	public static final int NS_E_INVALIDINPUTFPS                                                  = 0xC00D1B81;
	public static final int NS_E_NO_DATAVIEW_SUPPORT                                              = 0xC00D1B82;
	public static final int NS_E_CODEC_UNAVAILABLE                                                = 0xC00D1B83;
	public static final int NS_E_ARCHIVE_SAME_AS_INPUT                                            = 0xC00D1B84;
	public static final int NS_E_SOURCE_NOTSPECIFIED                                              = 0xC00D1B85;
	public static final int NS_E_NO_REALTIME_TIMECOMPRESSION                                      = 0xC00D1B86;
	public static final int NS_E_UNSUPPORTED_ENCODER_DEVICE                                       = 0xC00D1B87;
	public static final int NS_E_UNEXPECTED_DISPLAY_SETTINGS                                      = 0xC00D1B88;
	public static final int NS_E_NO_AUDIODATA                                                     = 0xC00D1B89;
	public static final int NS_E_INPUTSOURCE_PROBLEM                                              = 0xC00D1B8A;
	public static final int NS_E_WME_VERSION_MISMATCH                                             = 0xC00D1B8B;
	public static final int NS_E_NO_REALTIME_PREPROCESS                                           = 0xC00D1B8C;
	public static final int NS_E_NO_REPEAT_PREPROCESS                                             = 0xC00D1B8D;
	public static final int NS_E_CANNOT_PAUSE_LIVEBROADCAST                                       = 0xC00D1B8E;
	public static final int NS_E_DRM_PROFILE_NOT_SET                                              = 0xC00D1B8F;
	public static final int NS_E_DUPLICATE_DRMPROFILE                                             = 0xC00D1B90;
	public static final int NS_E_INVALID_DEVICE                                                   = 0xC00D1B91;
	public static final int NS_E_SPEECHEDL_ON_NON_MIXEDMODE                                       = 0xC00D1B92;
	public static final int NS_E_DRM_PASSWORD_TOO_LONG                                            = 0xC00D1B93;
	public static final int NS_E_DEVCONTROL_FAILED_SEEK                                           = 0xC00D1B94;
	public static final int NS_E_INTERLACE_REQUIRE_SAMESIZE                                       = 0xC00D1B95;
	public static final int NS_E_TOO_MANY_DEVICECONTROL                                           = 0xC00D1B96;
	public static final int NS_E_NO_MULTIPASS_FOR_LIVEDEVICE                                      = 0xC00D1B97;
	public static final int NS_E_MISSING_AUDIENCE                                                 = 0xC00D1B98;
	public static final int NS_E_AUDIENCE_CONTENTTYPE_MISMATCH                                    = 0xC00D1B99;
	public static final int NS_E_MISSING_SOURCE_INDEX                                             = 0xC00D1B9A;
	public static final int NS_E_NUM_LANGUAGE_MISMATCH                                            = 0xC00D1B9B;
	public static final int NS_E_LANGUAGE_MISMATCH                                                = 0xC00D1B9C;
	public static final int NS_E_VBRMODE_MISMATCH                                                 = 0xC00D1B9D;
	public static final int NS_E_INVALID_INPUT_AUDIENCE_INDEX                                     = 0xC00D1B9E;
	public static final int NS_E_INVALID_INPUT_LANGUAGE                                           = 0xC00D1B9F;
	public static final int NS_E_INVALID_INPUT_STREAM                                             = 0xC00D1BA0;
	public static final int NS_E_EXPECT_MONO_WAV_INPUT                                            = 0xC00D1BA1;
	public static final int NS_E_INPUT_WAVFORMAT_MISMATCH                                         = 0xC00D1BA2;
	public static final int NS_E_RECORDQ_DISK_FULL                                                = 0xC00D1BA3;
	public static final int NS_E_NO_PAL_INVERSE_TELECINE                                          = 0xC00D1BA4;
	public static final int NS_E_ACTIVE_SG_DEVICE_DISCONNECTED                                    = 0xC00D1BA5;
	public static final int NS_E_ACTIVE_SG_DEVICE_CONTROL_DISCONNECTED                            = 0xC00D1BA6;
	public static final int NS_E_NO_FRAMES_SUBMITTED_TO_ANALYZER                                  = 0xC00D1BA7;
	public static final int NS_E_INPUT_DOESNOT_SUPPORT_SMPTE                                      = 0xC00D1BA8;
	public static final int NS_E_NO_SMPTE_WITH_MULTIPLE_SOURCEGROUPS                              = 0xC00D1BA9;
	public static final int NS_E_BAD_CONTENTEDL                                                   = 0xC00D1BAA;
	public static final int NS_E_INTERLACEMODE_MISMATCH                                           = 0xC00D1BAB;
	public static final int NS_E_NONSQUAREPIXELMODE_MISMATCH                                      = 0xC00D1BAC;
	public static final int NS_E_SMPTEMODE_MISMATCH                                               = 0xC00D1BAD;
	public static final int NS_E_END_OF_TAPE                                                      = 0xC00D1BAE;
	public static final int NS_E_NO_MEDIA_IN_AUDIENCE                                             = 0xC00D1BAF;
	public static final int NS_E_NO_AUDIENCES                                                     = 0xC00D1BB0;
	public static final int NS_E_NO_AUDIO_COMPAT                                                  = 0xC00D1BB1;
	public static final int NS_E_INVALID_VBR_COMPAT                                               = 0xC00D1BB2;
	public static final int NS_E_NO_PROFILE_NAME                                                  = 0xC00D1BB3;
	public static final int NS_E_INVALID_VBR_WITH_UNCOMP                                          = 0xC00D1BB4;
	public static final int NS_E_MULTIPLE_VBR_AUDIENCES                                           = 0xC00D1BB5;
	public static final int NS_E_UNCOMP_COMP_COMBINATION                                          = 0xC00D1BB6;
	public static final int NS_E_MULTIPLE_AUDIO_CODECS                                            = 0xC00D1BB7;
	public static final int NS_E_MULTIPLE_AUDIO_FORMATS                                           = 0xC00D1BB8;
	public static final int NS_E_AUDIO_BITRATE_STEPDOWN                                           = 0xC00D1BB9;
	public static final int NS_E_INVALID_AUDIO_PEAKRATE                                           = 0xC00D1BBA;
	public static final int NS_E_INVALID_AUDIO_PEAKRATE_2                                         = 0xC00D1BBB;
	public static final int NS_E_INVALID_AUDIO_BUFFERMAX                                          = 0xC00D1BBC;
	public static final int NS_E_MULTIPLE_VIDEO_CODECS                                            = 0xC00D1BBD;
	public static final int NS_E_MULTIPLE_VIDEO_SIZES                                             = 0xC00D1BBE;
	public static final int NS_E_INVALID_VIDEO_BITRATE                                            = 0xC00D1BBF;
	public static final int NS_E_VIDEO_BITRATE_STEPDOWN                                           = 0xC00D1BC0;
	public static final int NS_E_INVALID_VIDEO_PEAKRATE                                           = 0xC00D1BC1;
	public static final int NS_E_INVALID_VIDEO_PEAKRATE_2                                         = 0xC00D1BC2;
	public static final int NS_E_INVALID_VIDEO_WIDTH                                              = 0xC00D1BC3;
	public static final int NS_E_INVALID_VIDEO_HEIGHT                                             = 0xC00D1BC4;
	public static final int NS_E_INVALID_VIDEO_FPS                                                = 0xC00D1BC5;
	public static final int NS_E_INVALID_VIDEO_KEYFRAME                                           = 0xC00D1BC6;
	public static final int NS_E_INVALID_VIDEO_IQUALITY                                           = 0xC00D1BC7;
	public static final int NS_E_INVALID_VIDEO_CQUALITY                                           = 0xC00D1BC8;
	public static final int NS_E_INVALID_VIDEO_BUFFER                                             = 0xC00D1BC9;
	public static final int NS_E_INVALID_VIDEO_BUFFERMAX                                          = 0xC00D1BCA;
	public static final int NS_E_INVALID_VIDEO_BUFFERMAX_2                                        = 0xC00D1BCB;
	public static final int NS_E_INVALID_VIDEO_WIDTH_ALIGN                                        = 0xC00D1BCC;
	public static final int NS_E_INVALID_VIDEO_HEIGHT_ALIGN                                       = 0xC00D1BCD;
	public static final int NS_E_MULTIPLE_SCRIPT_BITRATES                                         = 0xC00D1BCE;
	public static final int NS_E_INVALID_SCRIPT_BITRATE                                           = 0xC00D1BCF;
	public static final int NS_E_MULTIPLE_FILE_BITRATES                                           = 0xC00D1BD0;
	public static final int NS_E_INVALID_FILE_BITRATE                                             = 0xC00D1BD1;
	public static final int NS_E_SAME_AS_INPUT_COMBINATION                                        = 0xC00D1BD2;
	public static final int NS_E_SOURCE_CANNOT_LOOP                                               = 0xC00D1BD3;
	public static final int NS_E_INVALID_FOLDDOWN_COEFFICIENTS                                    = 0xC00D1BD4;
	public static final int NS_E_DRMPROFILE_NOTFOUND                                              = 0xC00D1BD5;
	public static final int NS_E_INVALID_TIMECODE                                                 = 0xC00D1BD6;
	public static final int NS_E_NO_AUDIO_TIMECOMPRESSION                                         = 0xC00D1BD7;
	public static final int NS_E_NO_TWOPASS_TIMECOMPRESSION                                       = 0xC00D1BD8;
	public static final int NS_E_TIMECODE_REQUIRES_VIDEOSTREAM                                    = 0xC00D1BD9;
	public static final int NS_E_NO_MBR_WITH_TIMECODE                                             = 0xC00D1BDA;
	public static final int NS_E_INVALID_INTERLACEMODE                                            = 0xC00D1BDB;
	public static final int NS_E_INVALID_INTERLACE_COMPAT                                         = 0xC00D1BDC;
	public static final int NS_E_INVALID_NONSQUAREPIXEL_COMPAT                                    = 0xC00D1BDD;
	public static final int NS_E_INVALID_SOURCE_WITH_DEVICE_CONTROL                               = 0xC00D1BDE;
	public static final int NS_E_CANNOT_GENERATE_BROADCAST_INFO_FOR_QUALITYVBR                    = 0xC00D1BDF;
	public static final int NS_E_EXCEED_MAX_DRM_PROFILE_LIMIT                                     = 0xC00D1BE0;
	public static final int NS_E_DEVICECONTROL_UNSTABLE                                           = 0xC00D1BE1;
	public static final int NS_E_INVALID_PIXEL_ASPECT_RATIO                                       = 0xC00D1BE2;
	public static final int NS_E_AUDIENCE__LANGUAGE_CONTENTTYPE_MISMATCH                          = 0xC00D1BE3;
	public static final int NS_E_INVALID_PROFILE_CONTENTTYPE                                      = 0xC00D1BE4;
	public static final int NS_E_TRANSFORM_PLUGIN_NOT_FOUND                                       = 0xC00D1BE5;
	public static final int NS_E_TRANSFORM_PLUGIN_INVALID                                         = 0xC00D1BE6;
	public static final int NS_E_EDL_REQUIRED_FOR_DEVICE_MULTIPASS                                = 0xC00D1BE7;
	public static final int NS_E_INVALID_VIDEO_WIDTH_FOR_INTERLACED_ENCODING                      = 0xC00D1BE8;
	public static final int NS_E_MARKIN_UNSUPPORTED                                               = 0xC00D1BE9;
	public static final int NS_E_DRM_INVALID_APPLICATION                                          = 0xC00D2711;
	public static final int NS_E_DRM_LICENSE_STORE_ERROR                                          = 0xC00D2712;
	public static final int NS_E_DRM_SECURE_STORE_ERROR                                           = 0xC00D2713;
	public static final int NS_E_DRM_LICENSE_STORE_SAVE_ERROR                                     = 0xC00D2714;
	public static final int NS_E_DRM_SECURE_STORE_UNLOCK_ERROR                                    = 0xC00D2715;
	public static final int NS_E_DRM_INVALID_CONTENT                                              = 0xC00D2716;
	public static final int NS_E_DRM_UNABLE_TO_OPEN_LICENSE                                       = 0xC00D2717;
	public static final int NS_E_DRM_INVALID_LICENSE                                              = 0xC00D2718;
	public static final int NS_E_DRM_INVALID_MACHINE                                              = 0xC00D2719;
	public static final int NS_E_DRM_ENUM_LICENSE_FAILED                                          = 0xC00D271B;
	public static final int NS_E_DRM_INVALID_LICENSE_REQUEST                                      = 0xC00D271C;
	public static final int NS_E_DRM_UNABLE_TO_INITIALIZE                                         = 0xC00D271D;
	public static final int NS_E_DRM_UNABLE_TO_ACQUIRE_LICENSE                                    = 0xC00D271E;
	public static final int NS_E_DRM_INVALID_LICENSE_ACQUIRED                                     = 0xC00D271F;
	public static final int NS_E_DRM_NO_RIGHTS                                                    = 0xC00D2720;
	public static final int NS_E_DRM_KEY_ERROR                                                    = 0xC00D2721;
	public static final int NS_E_DRM_ENCRYPT_ERROR                                                = 0xC00D2722;
	public static final int NS_E_DRM_DECRYPT_ERROR                                                = 0xC00D2723;
	public static final int NS_E_DRM_LICENSE_INVALID_XML                                          = 0xC00D2725;
	public static final int NS_E_DRM_NEEDS_INDIVIDUALIZATION                                      = 0xC00D2728;
	public static final int NS_E_DRM_ALREADY_INDIVIDUALIZED                                       = 0xC00D2729;
	public static final int NS_E_DRM_ACTION_NOT_QUERIED                                           = 0xC00D272A;
	public static final int NS_E_DRM_ACQUIRING_LICENSE                                            = 0xC00D272B;
	public static final int NS_E_DRM_INDIVIDUALIZING                                              = 0xC00D272C;
	public static final int NS_E_BACKUP_RESTORE_FAILURE                                           = 0xC00D272D;
	public static final int NS_E_BACKUP_RESTORE_BAD_REQUEST_ID                                    = 0xC00D272E;
	public static final int NS_E_DRM_PARAMETERS_MISMATCHED                                        = 0xC00D272F;
	public static final int NS_E_DRM_UNABLE_TO_CREATE_LICENSE_OBJECT                              = 0xC00D2730;
	public static final int NS_E_DRM_UNABLE_TO_CREATE_INDI_OBJECT                                 = 0xC00D2731;
	public static final int NS_E_DRM_UNABLE_TO_CREATE_ENCRYPT_OBJECT                              = 0xC00D2732;
	public static final int NS_E_DRM_UNABLE_TO_CREATE_DECRYPT_OBJECT                              = 0xC00D2733;
	public static final int NS_E_DRM_UNABLE_TO_CREATE_PROPERTIES_OBJECT                           = 0xC00D2734;
	public static final int NS_E_DRM_UNABLE_TO_CREATE_BACKUP_OBJECT                               = 0xC00D2735;
	public static final int NS_E_DRM_INDIVIDUALIZE_ERROR                                          = 0xC00D2736;
	public static final int NS_E_DRM_LICENSE_OPEN_ERROR                                           = 0xC00D2737;
	public static final int NS_E_DRM_LICENSE_CLOSE_ERROR                                          = 0xC00D2738;
	public static final int NS_E_DRM_GET_LICENSE_ERROR                                            = 0xC00D2739;
	public static final int NS_E_DRM_QUERY_ERROR                                                  = 0xC00D273A;
	public static final int NS_E_DRM_REPORT_ERROR                                                 = 0xC00D273B;
	public static final int NS_E_DRM_GET_LICENSESTRING_ERROR                                      = 0xC00D273C;
	public static final int NS_E_DRM_GET_CONTENTSTRING_ERROR                                      = 0xC00D273D;
	public static final int NS_E_DRM_MONITOR_ERROR                                                = 0xC00D273E;
	public static final int NS_E_DRM_UNABLE_TO_SET_PARAMETER                                      = 0xC00D273F;
	public static final int NS_E_DRM_INVALID_APPDATA                                              = 0xC00D2740;
	public static final int NS_E_DRM_INVALID_APPDATA_VERSION                                      = 0xC00D2741;
	public static final int NS_E_DRM_BACKUP_EXISTS                                                = 0xC00D2742;
	public static final int NS_E_DRM_BACKUP_CORRUPT                                               = 0xC00D2743;
	public static final int NS_E_DRM_BACKUPRESTORE_BUSY                                           = 0xC00D2744;
	public static final int NS_E_BACKUP_RESTORE_BAD_DATA                                          = 0xC00D2745;
	public static final int NS_E_DRM_LICENSE_UNUSABLE                                             = 0xC00D2748;
	public static final int NS_E_DRM_INVALID_PROPERTY                                             = 0xC00D2749;
	public static final int NS_E_DRM_SECURE_STORE_NOT_FOUND                                       = 0xC00D274A;
	public static final int NS_E_DRM_CACHED_CONTENT_ERROR                                         = 0xC00D274B;
	public static final int NS_E_DRM_INDIVIDUALIZATION_INCOMPLETE                                 = 0xC00D274C;
	public static final int NS_E_DRM_DRIVER_AUTH_FAILURE                                          = 0xC00D274D;
	public static final int NS_E_DRM_NEED_UPGRADE_MSSAP                                           = 0xC00D274E;
	public static final int NS_E_DRM_REOPEN_CONTENT                                               = 0xC00D274F;
	public static final int NS_E_DRM_DRIVER_DIGIOUT_FAILURE                                       = 0xC00D2750;
	public static final int NS_E_DRM_INVALID_SECURESTORE_PASSWORD                                 = 0xC00D2751;
	public static final int NS_E_DRM_APPCERT_REVOKED                                              = 0xC00D2752;
	public static final int NS_E_DRM_RESTORE_FRAUD                                                = 0xC00D2753;
	public static final int NS_E_DRM_HARDWARE_INCONSISTENT                                        = 0xC00D2754;
	public static final int NS_E_DRM_SDMI_TRIGGER                                                 = 0xC00D2755;
	public static final int NS_E_DRM_SDMI_NOMORECOPIES                                            = 0xC00D2756;
	public static final int NS_E_DRM_UNABLE_TO_CREATE_HEADER_OBJECT                               = 0xC00D2757;
	public static final int NS_E_DRM_UNABLE_TO_CREATE_KEYS_OBJECT                                 = 0xC00D2758;
	public static final int NS_E_DRM_LICENSE_NOTACQUIRED                                          = 0xC00D2759;
	public static final int NS_E_DRM_UNABLE_TO_CREATE_CODING_OBJECT                               = 0xC00D275A;
	public static final int NS_E_DRM_UNABLE_TO_CREATE_STATE_DATA_OBJECT                           = 0xC00D275B;
	public static final int NS_E_DRM_BUFFER_TOO_SMALL                                             = 0xC00D275C;
	public static final int NS_E_DRM_UNSUPPORTED_PROPERTY                                         = 0xC00D275D;
	public static final int NS_E_DRM_ERROR_BAD_NET_RESP                                           = 0xC00D275E;
	public static final int NS_E_DRM_STORE_NOTALLSTORED                                           = 0xC00D275F;
	public static final int NS_E_DRM_SECURITY_COMPONENT_SIGNATURE_INVALID                         = 0xC00D2760;
	public static final int NS_E_DRM_INVALID_DATA                                                 = 0xC00D2761;
	public static final int NS_E_DRM_POLICY_DISABLE_ONLINE                                        = 0xC00D2762;
	public static final int NS_E_DRM_UNABLE_TO_CREATE_AUTHENTICATION_OBJECT                       = 0xC00D2763;
	public static final int NS_E_DRM_NOT_CONFIGURED                                               = 0xC00D2764;
	public static final int NS_E_DRM_DEVICE_ACTIVATION_CANCELED                                   = 0xC00D2765;
	public static final int NS_E_BACKUP_RESTORE_TOO_MANY_RESETS                                   = 0xC00D2766;
	public static final int NS_E_DRM_DEBUGGING_NOT_ALLOWED                                        = 0xC00D2767;
	public static final int NS_E_DRM_OPERATION_CANCELED                                           = 0xC00D2768;
	public static final int NS_E_DRM_RESTRICTIONS_NOT_RETRIEVED                                   = 0xC00D2769;
	public static final int NS_E_DRM_UNABLE_TO_CREATE_PLAYLIST_OBJECT                             = 0xC00D276A;
	public static final int NS_E_DRM_UNABLE_TO_CREATE_PLAYLIST_BURN_OBJECT                        = 0xC00D276B;
	public static final int NS_E_DRM_UNABLE_TO_CREATE_DEVICE_REGISTRATION_OBJECT                  = 0xC00D276C;
	public static final int NS_E_DRM_UNABLE_TO_CREATE_METERING_OBJECT                             = 0xC00D276D;
	public static final int NS_E_DRM_TRACK_EXCEEDED_PLAYLIST_RESTICTION                           = 0xC00D2770;
	public static final int NS_E_DRM_TRACK_EXCEEDED_TRACKBURN_RESTRICTION                         = 0xC00D2771;
	public static final int NS_E_DRM_UNABLE_TO_GET_DEVICE_CERT                                    = 0xC00D2772;
	public static final int NS_E_DRM_UNABLE_TO_GET_SECURE_CLOCK                                   = 0xC00D2773;
	public static final int NS_E_DRM_UNABLE_TO_SET_SECURE_CLOCK                                   = 0xC00D2774;
	public static final int NS_E_DRM_UNABLE_TO_GET_SECURE_CLOCK_FROM_SERVER                       = 0xC00D2775;
	public static final int NS_E_DRM_POLICY_METERING_DISABLED                                     = 0xC00D2776;
	public static final int NS_E_DRM_TRANSFER_CHAINED_LICENSES_UNSUPPORTED                        = 0xC00D2777;
	public static final int NS_E_DRM_SDK_VERSIONMISMATCH                                          = 0xC00D2778;
	public static final int NS_E_DRM_LIC_NEEDS_DEVICE_CLOCK_SET                                   = 0xC00D2779;
	public static final int NS_E_LICENSE_HEADER_MISSING_URL                                       = 0xC00D277A;
	public static final int NS_E_DEVICE_NOT_WMDRM_DEVICE                                          = 0xC00D277B;
	public static final int NS_E_DRM_INVALID_APPCERT                                              = 0xC00D277C;
	public static final int NS_E_DRM_PROTOCOL_FORCEFUL_TERMINATION_ON_PETITION                    = 0xC00D277D;
	public static final int NS_E_DRM_PROTOCOL_FORCEFUL_TERMINATION_ON_CHALLENGE                   = 0xC00D277E;
	public static final int NS_E_DRM_CHECKPOINT_FAILED                                            = 0xC00D277F;
	public static final int NS_E_DRM_BB_UNABLE_TO_INITIALIZE                                      = 0xC00D2780;
	public static final int NS_E_DRM_UNABLE_TO_LOAD_HARDWARE_ID                                   = 0xC00D2781;
	public static final int NS_E_DRM_UNABLE_TO_OPEN_DATA_STORE                                    = 0xC00D2782;
	public static final int NS_E_DRM_DATASTORE_CORRUPT                                            = 0xC00D2783;
	public static final int NS_E_DRM_UNABLE_TO_CREATE_INMEMORYSTORE_OBJECT                        = 0xC00D2784;
	public static final int NS_E_DRM_STUBLIB_REQUIRED                                             = 0xC00D2785;
	public static final int NS_E_DRM_UNABLE_TO_CREATE_CERTIFICATE_OBJECT                          = 0xC00D2786;
	public static final int NS_E_DRM_MIGRATION_TARGET_NOT_ONLINE                                  = 0xC00D2787;
	public static final int NS_E_DRM_INVALID_MIGRATION_IMAGE                                      = 0xC00D2788;
	public static final int NS_E_DRM_MIGRATION_TARGET_STATES_CORRUPTED                            = 0xC00D2789;
	public static final int NS_E_DRM_MIGRATION_IMPORTER_NOT_AVAILABLE                             = 0xC00D278A;
	public static final int NS_DRM_E_MIGRATION_UPGRADE_WITH_DIFF_SID                              = 0xC00D278B;
	public static final int NS_DRM_E_MIGRATION_SOURCE_MACHINE_IN_USE                              = 0xC00D278C;
	public static final int NS_DRM_E_MIGRATION_TARGET_MACHINE_LESS_THAN_LH                        = 0xC00D278D;
	public static final int NS_DRM_E_MIGRATION_IMAGE_ALREADY_EXISTS                               = 0xC00D278E;
	public static final int NS_E_DRM_HARDWAREID_MISMATCH                                          = 0xC00D278F;
	public static final int NS_E_INVALID_DRMV2CLT_STUBLIB                                         = 0xC00D2790;
	public static final int NS_E_DRM_MIGRATION_INVALID_LEGACYV2_DATA                              = 0xC00D2791;
	public static final int NS_E_DRM_MIGRATION_LICENSE_ALREADY_EXISTS                             = 0xC00D2792;
	public static final int NS_E_DRM_MIGRATION_INVALID_LEGACYV2_SST_PASSWORD                      = 0xC00D2793;
	public static final int NS_E_DRM_MIGRATION_NOT_SUPPORTED                                      = 0xC00D2794;
	public static final int NS_E_DRM_UNABLE_TO_CREATE_MIGRATION_IMPORTER_OBJECT                   = 0xC00D2795;
	public static final int NS_E_DRM_CHECKPOINT_MISMATCH                                          = 0xC00D2796;
	public static final int NS_E_DRM_CHECKPOINT_CORRUPT                                           = 0xC00D2797;
	public static final int NS_E_REG_FLUSH_FAILURE                                                = 0xC00D2798;
	public static final int NS_E_HDS_KEY_MISMATCH                                                 = 0xC00D2799;
	public static final int NS_E_DRM_MIGRATION_OPERATION_CANCELLED                                = 0xC00D279A;
	public static final int NS_E_DRM_MIGRATION_OBJECT_IN_USE                                      = 0xC00D279B;
	public static final int NS_E_DRM_MALFORMED_CONTENT_HEADER                                     = 0xC00D279C;
	public static final int NS_E_DRM_LICENSE_EXPIRED                                              = 0xC00D27D8;
	public static final int NS_E_DRM_LICENSE_NOTENABLED                                           = 0xC00D27D9;
	public static final int NS_E_DRM_LICENSE_APPSECLOW                                            = 0xC00D27DA;
	public static final int NS_E_DRM_STORE_NEEDINDI                                               = 0xC00D27DB;
	public static final int NS_E_DRM_STORE_NOTALLOWED                                             = 0xC00D27DC;
	public static final int NS_E_DRM_LICENSE_APP_NOTALLOWED                                       = 0xC00D27DD;
	public static final int NS_E_DRM_LICENSE_CERT_EXPIRED                                         = 0xC00D27DF;
	public static final int NS_E_DRM_LICENSE_SECLOW                                               = 0xC00D27E0;
	public static final int NS_E_DRM_LICENSE_CONTENT_REVOKED                                      = 0xC00D27E1;
	public static final int NS_E_DRM_DEVICE_NOT_REGISTERED                                        = 0xC00D27E2;
	public static final int NS_E_DRM_LICENSE_NOSAP                                                = 0xC00D280A;
	public static final int NS_E_DRM_LICENSE_NOSVP                                                = 0xC00D280B;
	public static final int NS_E_DRM_LICENSE_NOWDM                                                = 0xC00D280C;
	public static final int NS_E_DRM_LICENSE_NOTRUSTEDCODEC                                       = 0xC00D280D;
	public static final int NS_E_DRM_SOURCEID_NOT_SUPPORTED                                       = 0xC00D280E;
	public static final int NS_E_DRM_NEEDS_UPGRADE_TEMPFILE                                       = 0xC00D283D;
	public static final int NS_E_DRM_NEED_UPGRADE_PD                                              = 0xC00D283E;
	public static final int NS_E_DRM_SIGNATURE_FAILURE                                            = 0xC00D283F;
	public static final int NS_E_DRM_LICENSE_SERVER_INFO_MISSING                                  = 0xC00D2840;
	public static final int NS_E_DRM_BUSY                                                         = 0xC00D2841;
	public static final int NS_E_DRM_PD_TOO_MANY_DEVICES                                          = 0xC00D2842;
	public static final int NS_E_DRM_INDIV_FRAUD                                                  = 0xC00D2843;
	public static final int NS_E_DRM_INDIV_NO_CABS                                                = 0xC00D2844;
	public static final int NS_E_DRM_INDIV_SERVICE_UNAVAILABLE                                    = 0xC00D2845;
	public static final int NS_E_DRM_RESTORE_SERVICE_UNAVAILABLE                                  = 0xC00D2846;
	public static final int NS_E_DRM_CLIENT_CODE_EXPIRED                                          = 0xC00D2847;
	public static final int NS_E_DRM_NO_UPLINK_LICENSE                                            = 0xC00D2848;
	public static final int NS_E_DRM_INVALID_KID                                                  = 0xC00D2849;
	public static final int NS_E_DRM_LICENSE_INITIALIZATION_ERROR                                 = 0xC00D284A;
	public static final int NS_E_DRM_CHAIN_TOO_LONG                                               = 0xC00D284C;
	public static final int NS_E_DRM_UNSUPPORTED_ALGORITHM                                        = 0xC00D284D;
	public static final int NS_E_DRM_LICENSE_DELETION_ERROR                                       = 0xC00D284E;
	public static final int NS_E_DRM_INVALID_CERTIFICATE                                          = 0xC00D28A0;
	public static final int NS_E_DRM_CERTIFICATE_REVOKED                                          = 0xC00D28A1;
	public static final int NS_E_DRM_LICENSE_UNAVAILABLE                                          = 0xC00D28A2;
	public static final int NS_E_DRM_DEVICE_LIMIT_REACHED                                         = 0xC00D28A3;
	public static final int NS_E_DRM_UNABLE_TO_VERIFY_PROXIMITY                                   = 0xC00D28A4;
	public static final int NS_E_DRM_MUST_REGISTER                                                = 0xC00D28A5;
	public static final int NS_E_DRM_MUST_APPROVE                                                 = 0xC00D28A6;
	public static final int NS_E_DRM_MUST_REVALIDATE                                              = 0xC00D28A7;
	public static final int NS_E_DRM_INVALID_PROXIMITY_RESPONSE                                   = 0xC00D28A8;
	public static final int NS_E_DRM_INVALID_SESSION                                              = 0xC00D28A9;
	public static final int NS_E_DRM_DEVICE_NOT_OPEN                                              = 0xC00D28AA;
	public static final int NS_E_DRM_DEVICE_ALREADY_REGISTERED                                    = 0xC00D28AB;
	public static final int NS_E_DRM_UNSUPPORTED_PROTOCOL_VERSION                                 = 0xC00D28AC;
	public static final int NS_E_DRM_UNSUPPORTED_ACTION                                           = 0xC00D28AD;
	public static final int NS_E_DRM_CERTIFICATE_SECURITY_LEVEL_INADEQUATE                        = 0xC00D28AE;
	public static final int NS_E_DRM_UNABLE_TO_OPEN_PORT                                          = 0xC00D28AF;
	public static final int NS_E_DRM_BAD_REQUEST                                                  = 0xC00D28B0;
	public static final int NS_E_DRM_INVALID_CRL                                                  = 0xC00D28B1;
	public static final int NS_E_DRM_ATTRIBUTE_TOO_LONG                                           = 0xC00D28B2;
	public static final int NS_E_DRM_EXPIRED_LICENSEBLOB                                          = 0xC00D28B3;
	public static final int NS_E_DRM_INVALID_LICENSEBLOB                                          = 0xC00D28B4;
	public static final int NS_E_DRM_INCLUSION_LIST_REQUIRED                                      = 0xC00D28B5;
	public static final int NS_E_DRM_DRMV2CLT_REVOKED                                             = 0xC00D28B6;
	public static final int NS_E_DRM_RIV_TOO_SMALL                                                = 0xC00D28B7;
	public static final int NS_E_OUTPUT_PROTECTION_LEVEL_UNSUPPORTED                              = 0xC00D2904;
	public static final int NS_E_COMPRESSED_DIGITAL_VIDEO_PROTECTION_LEVEL_UNSUPPORTED            = 0xC00D2905;
	public static final int NS_E_UNCOMPRESSED_DIGITAL_VIDEO_PROTECTION_LEVEL_UNSUPPORTED          = 0xC00D2906;
	public static final int NS_E_ANALOG_VIDEO_PROTECTION_LEVEL_UNSUPPORTED                        = 0xC00D2907;
	public static final int NS_E_COMPRESSED_DIGITAL_AUDIO_PROTECTION_LEVEL_UNSUPPORTED            = 0xC00D2908;
	public static final int NS_E_UNCOMPRESSED_DIGITAL_AUDIO_PROTECTION_LEVEL_UNSUPPORTED          = 0xC00D2909;
	public static final int NS_E_OUTPUT_PROTECTION_SCHEME_UNSUPPORTED                             = 0xC00D290A;
	public static final int NS_E_REBOOT_RECOMMENDED                                               = 0xC00D2AFA;
	public static final int NS_E_REBOOT_REQUIRED                                                  = 0xC00D2AFB;
	public static final int NS_E_SETUP_INCOMPLETE                                                 = 0xC00D2AFC;
	public static final int NS_E_SETUP_DRM_MIGRATION_FAILED                                       = 0xC00D2AFD;
	public static final int NS_E_SETUP_IGNORABLE_FAILURE                                          = 0xC00D2AFE;
	public static final int NS_E_SETUP_DRM_MIGRATION_FAILED_AND_IGNORABLE_FAILURE                 = 0xC00D2AFF;
	public static final int NS_E_SETUP_BLOCKED                                                    = 0xC00D2B00;
	public static final int NS_E_UNKNOWN_PROTOCOL                                                 = 0xC00D2EE0;
	public static final int NS_E_REDIRECT_TO_PROXY                                                = 0xC00D2EE1;
	public static final int NS_E_INTERNAL_SERVER_ERROR                                            = 0xC00D2EE2;
	public static final int NS_E_BAD_REQUEST                                                      = 0xC00D2EE3;
	public static final int NS_E_ERROR_FROM_PROXY                                                 = 0xC00D2EE4;
	public static final int NS_E_PROXY_TIMEOUT                                                    = 0xC00D2EE5;
	public static final int NS_E_SERVER_UNAVAILABLE                                               = 0xC00D2EE6;
	public static final int NS_E_REFUSED_BY_SERVER                                                = 0xC00D2EE7;
	public static final int NS_E_INCOMPATIBLE_SERVER                                              = 0xC00D2EE8;
	public static final int NS_E_MULTICAST_DISABLED                                               = 0xC00D2EE9;
	public static final int NS_E_INVALID_REDIRECT                                                 = 0xC00D2EEA;
	public static final int NS_E_ALL_PROTOCOLS_DISABLED                                           = 0xC00D2EEB;
	public static final int NS_E_MSBD_NO_LONGER_SUPPORTED                                         = 0xC00D2EEC;
	public static final int NS_E_PROXY_NOT_FOUND                                                  = 0xC00D2EED;
	public static final int NS_E_CANNOT_CONNECT_TO_PROXY                                          = 0xC00D2EEE;
	public static final int NS_E_SERVER_DNS_TIMEOUT                                               = 0xC00D2EEF;
	public static final int NS_E_PROXY_DNS_TIMEOUT                                                = 0xC00D2EF0;
	public static final int NS_E_CLOSED_ON_SUSPEND                                                = 0xC00D2EF1;
	public static final int NS_E_CANNOT_READ_PLAYLIST_FROM_MEDIASERVER                            = 0xC00D2EF2;
	public static final int NS_E_SESSION_NOT_FOUND                                                = 0xC00D2EF3;
	public static final int NS_E_REQUIRE_STREAMING_CLIENT                                         = 0xC00D2EF4;
	public static final int NS_E_PLAYLIST_ENTRY_HAS_CHANGED                                       = 0xC00D2EF5;
	public static final int NS_E_PROXY_ACCESSDENIED                                               = 0xC00D2EF6;
	public static final int NS_E_PROXY_SOURCE_ACCESSDENIED                                        = 0xC00D2EF7;
	public static final int NS_E_NETWORK_SINK_WRITE                                               = 0xC00D2EF8;
	public static final int NS_E_FIREWALL                                                         = 0xC00D2EF9;
	public static final int NS_E_MMS_NOT_SUPPORTED                                                = 0xC00D2EFA;
	public static final int NS_E_SERVER_ACCESSDENIED                                              = 0xC00D2EFB;
	public static final int NS_E_RESOURCE_GONE                                                    = 0xC00D2EFC;
	public static final int NS_E_NO_EXISTING_PACKETIZER                                           = 0xC00D2EFD;
	public static final int NS_E_BAD_SYNTAX_IN_SERVER_RESPONSE                                    = 0xC00D2EFE;
	public static final int NS_E_RESET_SOCKET_CONNECTION                                          = 0xC00D2F00;
	public static final int NS_E_TOO_MANY_HOPS                                                    = 0xC00D2F02;
	public static final int NS_E_TOO_MUCH_DATA_FROM_SERVER                                        = 0xC00D2F05;
	public static final int NS_E_CONNECT_TIMEOUT                                                  = 0xC00D2F06;
	public static final int NS_E_PROXY_CONNECT_TIMEOUT                                            = 0xC00D2F07;
	public static final int NS_E_SESSION_INVALID                                                  = 0xC00D2F08;
	public static final int NS_E_PACKETSINK_UNKNOWN_FEC_STREAM                                    = 0xC00D2F0A;
	public static final int NS_E_PUSH_CANNOTCONNECT                                               = 0xC00D2F0B;
	public static final int NS_E_INCOMPATIBLE_PUSH_SERVER                                         = 0xC00D2F0C;
	public static final int NS_E_END_OF_PLAYLIST                                                  = 0xC00D32C8;
	public static final int NS_E_USE_FILE_SOURCE                                                  = 0xC00D32C9;
	public static final int NS_E_PROPERTY_NOT_FOUND                                               = 0xC00D32CA;
	public static final int NS_E_PROPERTY_READ_ONLY                                               = 0xC00D32CC;
	public static final int NS_E_TABLE_KEY_NOT_FOUND                                              = 0xC00D32CD;
	public static final int NS_E_INVALID_QUERY_OPERATOR                                           = 0xC00D32CF;
	public static final int NS_E_INVALID_QUERY_PROPERTY                                           = 0xC00D32D0;
	public static final int NS_E_PROPERTY_NOT_SUPPORTED                                           = 0xC00D32D2;
	public static final int NS_E_SCHEMA_CLASSIFY_FAILURE                                          = 0xC00D32D4;
	public static final int NS_E_METADATA_FORMAT_NOT_SUPPORTED                                    = 0xC00D32D5;
	public static final int NS_E_METADATA_NO_EDITING_CAPABILITY                                   = 0xC00D32D6;
	public static final int NS_E_METADATA_CANNOT_SET_LOCALE                                       = 0xC00D32D7;
	public static final int NS_E_METADATA_LANGUAGE_NOT_SUPORTED                                   = 0xC00D32D8;
	public static final int NS_E_METADATA_NO_RFC1766_NAME_FOR_LOCALE                              = 0xC00D32D9;
	public static final int NS_E_METADATA_NOT_AVAILABLE                                           = 0xC00D32DA;
	public static final int NS_E_METADATA_CACHE_DATA_NOT_AVAILABLE                                = 0xC00D32DB;
	public static final int NS_E_METADATA_INVALID_DOCUMENT_TYPE                                   = 0xC00D32DC;
	public static final int NS_E_METADATA_IDENTIFIER_NOT_AVAILABLE                                = 0xC00D32DD;
	public static final int NS_E_METADATA_CANNOT_RETRIEVE_FROM_OFFLINE_CACHE                      = 0xC00D32DE;
	public static final int ERROR_MONITOR_INVALID_DESCRIPTOR_CHECKSUM                             = 0xC0261003;
	public static final int ERROR_MONITOR_INVALID_STANDARD_TIMING_BLOCK                           = 0xC0261004;
	public static final int ERROR_MONITOR_WMI_DATABLOCK_REGISTRATION_FAILED                       = 0xC0261005;
	public static final int ERROR_MONITOR_INVALID_SERIAL_NUMBER_MONDSC_BLOCK                      = 0xC0261006;
	public static final int ERROR_MONITOR_INVALID_USER_FRIENDLY_MONDSC_BLOCK                      = 0xC0261007;
	public static final int ERROR_MONITOR_NO_MORE_DESCRIPTOR_DATA                                 = 0xC0261008;
	public static final int ERROR_MONITOR_INVALID_DETAILED_TIMING_BLOCK                           = 0xC0261009;
	public static final int ERROR_GRAPHICS_NOT_EXCLUSIVE_MODE_OWNER                               = 0xC0262000;
	public static final int ERROR_GRAPHICS_INSUFFICIENT_DMA_BUFFER                                = 0xC0262001;
	public static final int ERROR_GRAPHICS_INVALID_DISPLAY_ADAPTER                                = 0xC0262002;
	public static final int ERROR_GRAPHICS_ADAPTER_WAS_RESET                                      = 0xC0262003;
	public static final int ERROR_GRAPHICS_INVALID_DRIVER_MODEL                                   = 0xC0262004;
	public static final int ERROR_GRAPHICS_PRESENT_MODE_CHANGED                                   = 0xC0262005;
	public static final int ERROR_GRAPHICS_PRESENT_OCCLUDED                                       = 0xC0262006;
	public static final int ERROR_GRAPHICS_PRESENT_DENIED                                         = 0xC0262007;
	public static final int ERROR_GRAPHICS_CANNOTCOLORCONVERT                                     = 0xC0262008;
	public static final int ERROR_GRAPHICS_NO_VIDEO_MEMORY                                        = 0xC0262100;
	public static final int ERROR_GRAPHICS_CANT_LOCK_MEMORY                                       = 0xC0262101;
	public static final int ERROR_GRAPHICS_ALLOCATION_BUSY                                        = 0xC0262102;
	public static final int ERROR_GRAPHICS_TOO_MANY_REFERENCES                                    = 0xC0262103;
	public static final int ERROR_GRAPHICS_TRY_AGAIN_LATER                                        = 0xC0262104;
	public static final int ERROR_GRAPHICS_TRY_AGAIN_NOW                                          = 0xC0262105;
	public static final int ERROR_GRAPHICS_ALLOCATION_INVALID                                     = 0xC0262106;
	public static final int ERROR_GRAPHICS_UNSWIZZLING_APERTURE_UNAVAILABLE                       = 0xC0262107;
	public static final int ERROR_GRAPHICS_UNSWIZZLING_APERTURE_UNSUPPORTED                       = 0xC0262108;
	public static final int ERROR_GRAPHICS_CANT_EVICT_PINNED_ALLOCATION                           = 0xC0262109;
	public static final int ERROR_GRAPHICS_INVALID_ALLOCATION_USAGE                               = 0xC0262110;
	public static final int ERROR_GRAPHICS_CANT_RENDER_LOCKED_ALLOCATION                          = 0xC0262111;
	public static final int ERROR_GRAPHICS_ALLOCATION_CLOSED                                      = 0xC0262112;
	public static final int ERROR_GRAPHICS_INVALID_ALLOCATION_INSTANCE                            = 0xC0262113;
	public static final int ERROR_GRAPHICS_INVALID_ALLOCATION_HANDLE                              = 0xC0262114;
	public static final int ERROR_GRAPHICS_WRONG_ALLOCATION_DEVICE                                = 0xC0262115;
	public static final int ERROR_GRAPHICS_ALLOCATION_CONTENT_LOST                                = 0xC0262116;
	public static final int ERROR_GRAPHICS_GPU_EXCEPTION_ON_DEVICE                                = 0xC0262200;
	public static final int ERROR_GRAPHICS_INVALID_VIDPN_TOPOLOGY                                 = 0xC0262300;
	public static final int ERROR_GRAPHICS_VIDPN_TOPOLOGY_NOT_SUPPORTED                           = 0xC0262301;
	public static final int ERROR_GRAPHICS_VIDPN_TOPOLOGY_CURRENTLY_NOT_SUPPORTED                 = 0xC0262302;
	public static final int ERROR_GRAPHICS_INVALID_VIDPN                                          = 0xC0262303;
	public static final int ERROR_GRAPHICS_INVALID_VIDEO_PRESENT_SOURCE                           = 0xC0262304;
	public static final int ERROR_GRAPHICS_INVALID_VIDEO_PRESENT_TARGET                           = 0xC0262305;
	public static final int ERROR_GRAPHICS_VIDPN_MODALITY_NOT_SUPPORTED                           = 0xC0262306;
	public static final int ERROR_GRAPHICS_INVALID_VIDPN_SOURCEMODESET                            = 0xC0262308;
	public static final int ERROR_GRAPHICS_INVALID_VIDPN_TARGETMODESET                            = 0xC0262309;
	public static final int ERROR_GRAPHICS_INVALID_FREQUENCY                                      = 0xC026230A;
	public static final int ERROR_GRAPHICS_INVALID_ACTIVE_REGION                                  = 0xC026230B;
	public static final int ERROR_GRAPHICS_INVALID_TOTAL_REGION                                   = 0xC026230C;
	public static final int ERROR_GRAPHICS_INVALID_VIDEO_PRESENT_SOURCE_MODE                      = 0xC0262310;
	public static final int ERROR_GRAPHICS_INVALID_VIDEO_PRESENT_TARGET_MODE                      = 0xC0262311;
	public static final int ERROR_GRAPHICS_PINNED_MODE_MUST_REMAIN_IN_SET                         = 0xC0262312;
	public static final int ERROR_GRAPHICS_PATH_ALREADY_IN_TOPOLOGY                               = 0xC0262313;
	public static final int ERROR_GRAPHICS_MODE_ALREADY_IN_MODESET                                = 0xC0262314;
	public static final int ERROR_GRAPHICS_INVALID_VIDEOPRESENTSOURCESET                          = 0xC0262315;
	public static final int ERROR_GRAPHICS_INVALID_VIDEOPRESENTTARGETSET                          = 0xC0262316;
	public static final int ERROR_GRAPHICS_SOURCE_ALREADY_IN_SET                                  = 0xC0262317;
	public static final int ERROR_GRAPHICS_TARGET_ALREADY_IN_SET                                  = 0xC0262318;
	public static final int ERROR_GRAPHICS_INVALID_VIDPN_PRESENT_PATH                             = 0xC0262319;
	public static final int ERROR_GRAPHICS_NO_RECOMMENDED_VIDPN_TOPOLOGY                          = 0xC026231A;
	public static final int ERROR_GRAPHICS_INVALID_MONITOR_FREQUENCYRANGESET                      = 0xC026231B;
	public static final int ERROR_GRAPHICS_INVALID_MONITOR_FREQUENCYRANGE                         = 0xC026231C;
	public static final int ERROR_GRAPHICS_FREQUENCYRANGE_NOT_IN_SET                              = 0xC026231D;
	public static final int ERROR_GRAPHICS_FREQUENCYRANGE_ALREADY_IN_SET                          = 0xC026231F;
	public static final int ERROR_GRAPHICS_STALE_MODESET                                          = 0xC0262320;
	public static final int ERROR_GRAPHICS_INVALID_MONITOR_SOURCEMODESET                          = 0xC0262321;
	public static final int ERROR_GRAPHICS_INVALID_MONITOR_SOURCE_MODE                            = 0xC0262322;
	public static final int ERROR_GRAPHICS_NO_RECOMMENDED_FUNCTIONAL_VIDPN                        = 0xC0262323;
	public static final int ERROR_GRAPHICS_MODE_ID_MUST_BE_UNIQUE                                 = 0xC0262324;
	public static final int ERROR_GRAPHICS_EMPTY_ADAPTER_MONITOR_MODE_SUPPORT_INTERSECTION        = 0xC0262325;
	public static final int ERROR_GRAPHICS_VIDEO_PRESENT_TARGETS_LESS_THAN_SOURCES                = 0xC0262326;
	public static final int ERROR_GRAPHICS_PATH_NOT_IN_TOPOLOGY                                   = 0xC0262327;
	public static final int ERROR_GRAPHICS_ADAPTER_MUST_HAVE_AT_LEAST_ONE_SOURCE                  = 0xC0262328;
	public static final int ERROR_GRAPHICS_ADAPTER_MUST_HAVE_AT_LEAST_ONE_TARGET                  = 0xC0262329;
	public static final int ERROR_GRAPHICS_INVALID_MONITORDESCRIPTORSET                           = 0xC026232A;
	public static final int ERROR_GRAPHICS_INVALID_MONITORDESCRIPTOR                              = 0xC026232B;
	public static final int ERROR_GRAPHICS_MONITORDESCRIPTOR_NOT_IN_SET                           = 0xC026232C;
	public static final int ERROR_GRAPHICS_MONITORDESCRIPTOR_ALREADY_IN_SET                       = 0xC026232D;
	public static final int ERROR_GRAPHICS_MONITORDESCRIPTOR_ID_MUST_BE_UNIQUE                    = 0xC026232E;
	public static final int ERROR_GRAPHICS_INVALID_VIDPN_TARGET_SUBSET_TYPE                       = 0xC026232F;
	public static final int ERROR_GRAPHICS_RESOURCES_NOT_RELATED                                  = 0xC0262330;
	public static final int ERROR_GRAPHICS_SOURCE_ID_MUST_BE_UNIQUE                               = 0xC0262331;
	public static final int ERROR_GRAPHICS_TARGET_ID_MUST_BE_UNIQUE                               = 0xC0262332;
	public static final int ERROR_GRAPHICS_NO_AVAILABLE_VIDPN_TARGET                              = 0xC0262333;
	public static final int ERROR_GRAPHICS_MONITOR_COULD_NOT_BE_ASSOCIATED_WITH_ADAPTER           = 0xC0262334;
	public static final int ERROR_GRAPHICS_NO_VIDPNMGR                                            = 0xC0262335;
	public static final int ERROR_GRAPHICS_NO_ACTIVE_VIDPN                                        = 0xC0262336;
	public static final int ERROR_GRAPHICS_STALE_VIDPN_TOPOLOGY                                   = 0xC0262337;
	public static final int ERROR_GRAPHICS_MONITOR_NOT_CONNECTED                                  = 0xC0262338;
	public static final int ERROR_GRAPHICS_SOURCE_NOT_IN_TOPOLOGY                                 = 0xC0262339;
	public static final int ERROR_GRAPHICS_INVALID_PRIMARYSURFACE_SIZE                            = 0xC026233A;
	public static final int ERROR_GRAPHICS_INVALID_VISIBLEREGION_SIZE                             = 0xC026233B;
	public static final int ERROR_GRAPHICS_INVALID_STRIDE                                         = 0xC026233C;
	public static final int ERROR_GRAPHICS_INVALID_PIXELFORMAT                                    = 0xC026233D;
	public static final int ERROR_GRAPHICS_INVALID_COLORBASIS                                     = 0xC026233E;
	public static final int ERROR_GRAPHICS_INVALID_PIXELVALUEACCESSMODE                           = 0xC026233F;
	public static final int ERROR_GRAPHICS_TARGET_NOT_IN_TOPOLOGY                                 = 0xC0262340;
	public static final int ERROR_GRAPHICS_NO_DISPLAY_MODE_MANAGEMENT_SUPPORT                     = 0xC0262341;
	public static final int ERROR_GRAPHICS_VIDPN_SOURCE_IN_USE                                    = 0xC0262342;
	public static final int ERROR_GRAPHICS_CANT_ACCESS_ACTIVE_VIDPN                               = 0xC0262343;
	public static final int ERROR_GRAPHICS_INVALID_PATH_IMPORTANCE_ORDINAL                        = 0xC0262344;
	public static final int ERROR_GRAPHICS_INVALID_PATH_CONTENT_GEOMETRY_TRANSFORMATION           = 0xC0262345;
	public static final int ERROR_GRAPHICS_PATH_CONTENT_GEOMETRY_TRANSFORMATION_NOT_SUPPORTED     = 0xC0262346;
	public static final int ERROR_GRAPHICS_INVALID_GAMMA_RAMP                                     = 0xC0262347;
	public static final int ERROR_GRAPHICS_GAMMA_RAMP_NOT_SUPPORTED                               = 0xC0262348;
	public static final int ERROR_GRAPHICS_MULTISAMPLING_NOT_SUPPORTED                            = 0xC0262349;
	public static final int ERROR_GRAPHICS_MODE_NOT_IN_MODESET                                    = 0xC026234A;
	public static final int ERROR_GRAPHICS_INVALID_VIDPN_TOPOLOGY_RECOMMENDATION_REASON           = 0xC026234D;
	public static final int ERROR_GRAPHICS_INVALID_PATH_CONTENT_TYPE                              = 0xC026234E;
	public static final int ERROR_GRAPHICS_INVALID_COPYPROTECTION_TYPE                            = 0xC026234F;
	public static final int ERROR_GRAPHICS_UNASSIGNED_MODESET_ALREADY_EXISTS                      = 0xC0262350;
	public static final int ERROR_GRAPHICS_INVALID_SCANLINE_ORDERING                              = 0xC0262352;
	public static final int ERROR_GRAPHICS_TOPOLOGY_CHANGES_NOT_ALLOWED                           = 0xC0262353;
	public static final int ERROR_GRAPHICS_NO_AVAILABLE_IMPORTANCE_ORDINALS                       = 0xC0262354;
	public static final int ERROR_GRAPHICS_INCOMPATIBLE_PRIVATE_FORMAT                            = 0xC0262355;
	public static final int ERROR_GRAPHICS_INVALID_MODE_PRUNING_ALGORITHM                         = 0xC0262356;
	public static final int ERROR_GRAPHICS_SPECIFIED_CHILD_ALREADY_CONNECTED                      = 0xC0262400;
	public static final int ERROR_GRAPHICS_CHILD_DESCRIPTOR_NOT_SUPPORTED                         = 0xC0262401;
	public static final int ERROR_GRAPHICS_NOT_A_LINKED_ADAPTER                                   = 0xC0262430;
	public static final int ERROR_GRAPHICS_LEADLINK_NOT_ENUMERATED                                = 0xC0262431;
	public static final int ERROR_GRAPHICS_CHAINLINKS_NOT_ENUMERATED                              = 0xC0262432;
	public static final int ERROR_GRAPHICS_ADAPTER_CHAIN_NOT_READY                                = 0xC0262433;
	public static final int ERROR_GRAPHICS_CHAINLINKS_NOT_STARTED                                 = 0xC0262434;
	public static final int ERROR_GRAPHICS_CHAINLINKS_NOT_POWERED_ON                              = 0xC0262435;
	public static final int ERROR_GRAPHICS_INCONSISTENT_DEVICE_LINK_STATE                         = 0xC0262436;
	public static final int ERROR_GRAPHICS_NOT_POST_DEVICE_DRIVER                                 = 0xC0262438;
	public static final int ERROR_GRAPHICS_OPM_NOT_SUPPORTED                                      = 0xC0262500;
	public static final int ERROR_GRAPHICS_COPP_NOT_SUPPORTED                                     = 0xC0262501;
	public static final int ERROR_GRAPHICS_UAB_NOT_SUPPORTED                                      = 0xC0262502;
	public static final int ERROR_GRAPHICS_OPM_INVALID_ENCRYPTED_PARAMETERS                       = 0xC0262503;
	public static final int ERROR_GRAPHICS_OPM_PARAMETER_ARRAY_TOO_SMALL                          = 0xC0262504;
	public static final int ERROR_GRAPHICS_OPM_NO_VIDEO_OUTPUTS_EXIST                             = 0xC0262505;
	public static final int ERROR_GRAPHICS_PVP_NO_DISPLAY_DEVICE_CORRESPONDS_TO_NAME              = 0xC0262506;
	public static final int ERROR_GRAPHICS_PVP_DISPLAY_DEVICE_NOT_ATTACHED_TO_DESKTOP             = 0xC0262507;
	public static final int ERROR_GRAPHICS_PVP_MIRRORING_DEVICES_NOT_SUPPORTED                    = 0xC0262508;
	public static final int ERROR_GRAPHICS_OPM_INVALID_POINTER                                    = 0xC026250A;
	public static final int ERROR_GRAPHICS_OPM_INTERNAL_ERROR                                     = 0xC026250B;
	public static final int ERROR_GRAPHICS_OPM_INVALID_HANDLE                                     = 0xC026250C;
	public static final int ERROR_GRAPHICS_PVP_NO_MONITORS_CORRESPOND_TO_DISPLAY_DEVICE           = 0xC026250D;
	public static final int ERROR_GRAPHICS_PVP_INVALID_CERTIFICATE_LENGTH                         = 0xC026250E;
	public static final int ERROR_GRAPHICS_OPM_SPANNING_MODE_ENABLED                              = 0xC026250F;
	public static final int ERROR_GRAPHICS_OPM_THEATER_MODE_ENABLED                               = 0xC0262510;
	public static final int ERROR_GRAPHICS_PVP_HFS_FAILED                                         = 0xC0262511;
	public static final int ERROR_GRAPHICS_OPM_INVALID_SRM                                        = 0xC0262512;
	public static final int ERROR_GRAPHICS_OPM_OUTPUT_DOES_NOT_SUPPORT_HDCP                       = 0xC0262513;
	public static final int ERROR_GRAPHICS_OPM_OUTPUT_DOES_NOT_SUPPORT_ACP                        = 0xC0262514;
	public static final int ERROR_GRAPHICS_OPM_OUTPUT_DOES_NOT_SUPPORT_CGMSA                      = 0xC0262515;
	public static final int ERROR_GRAPHICS_OPM_HDCP_SRM_NEVER_SET                                 = 0xC0262516;
	public static final int ERROR_GRAPHICS_OPM_RESOLUTION_TOO_HIGH                                = 0xC0262517;
	public static final int ERROR_GRAPHICS_OPM_ALL_HDCP_HARDWARE_ALREADY_IN_USE                   = 0xC0262518;
	public static final int ERROR_GRAPHICS_OPM_VIDEO_OUTPUT_NO_LONGER_EXISTS                      = 0xC0262519;
	public static final int ERROR_GRAPHICS_OPM_SESSION_TYPE_CHANGE_IN_PROGRESS                    = 0xC026251A;
	public static final int ERROR_GRAPHICS_I2C_NOT_SUPPORTED                                      = 0xC0262580;
	public static final int ERROR_GRAPHICS_I2C_DEVICE_DOES_NOT_EXIST                              = 0xC0262581;
	public static final int ERROR_GRAPHICS_I2C_ERROR_TRANSMITTING_DATA                            = 0xC0262582;
	public static final int ERROR_GRAPHICS_I2C_ERROR_RECEIVING_DATA                               = 0xC0262583;
	public static final int ERROR_GRAPHICS_DDCCI_VCP_NOT_SUPPORTED                                = 0xC0262584;
	public static final int ERROR_GRAPHICS_DDCCI_INVALID_DATA                                     = 0xC0262585;
	public static final int ERROR_GRAPHICS_DDCCI_MONITOR_RETURNED_INVALID_TIMING_STATUS_BYTE      = 0xC0262586;
	public static final int ERROR_GRAPHICS_MCA_INVALID_CAPABILITIES_STRING                        = 0xC0262587;
	public static final int ERROR_GRAPHICS_MCA_INTERNAL_ERROR                                     = 0xC0262588;
	public static final int ERROR_GRAPHICS_DDCCI_INVALID_MESSAGE_COMMAND                          = 0xC0262589;
	public static final int ERROR_GRAPHICS_DDCCI_INVALID_MESSAGE_LENGTH                           = 0xC026258A;
	public static final int ERROR_GRAPHICS_DDCCI_INVALID_MESSAGE_CHECKSUM                         = 0xC026258B;
	public static final int ERROR_GRAPHICS_PMEA_INVALID_MONITOR                                   = 0xC02625D6;
	public static final int ERROR_GRAPHICS_PMEA_INVALID_D3D_DEVICE                                = 0xC02625D7;
	public static final int ERROR_GRAPHICS_DDCCI_CURRENT_CURRENT_VALUE_GREATER_THAN_MAXIMUM_VALUE = 0xC02625D8;
	public static final int ERROR_GRAPHICS_MCA_INVALID_VCP_VERSION                                = 0xC02625D9;
	public static final int ERROR_GRAPHICS_MCA_MONITOR_VIOLATES_MCCS_SPECIFICATION                = 0xC02625DA;
	public static final int ERROR_GRAPHICS_MCA_MCCS_VERSION_MISMATCH                              = 0xC02625DB;
	public static final int ERROR_GRAPHICS_MCA_UNSUPPORTED_MCCS_VERSION                           = 0xC02625DC;
	public static final int ERROR_GRAPHICS_MCA_INVALID_TECHNOLOGY_TYPE_RETURNED                   = 0xC02625DE;
	public static final int ERROR_GRAPHICS_MCA_UNSUPPORTED_COLOR_TEMPERATURE                      = 0xC02625DF;
	public static final int ERROR_GRAPHICS_ONLY_CONSOLE_SESSION_SUPPORTED                         = 0xC02625E0;

	public static boolean check(int hResult) {
		return check(hResult, null);
	}

	public static boolean check(int hResult, String message, Object... args) {
		switch (hResult) {
			case S_OK:
				return true;
			case S_FALSE:
				return false;
			case STG_S_CONVERTED:
				throw new COMStatus("STG_S_CONVERTED: The underlying file was converted to compound file format.", message, args);
			case STG_S_BLOCK:
				throw new COMStatus("STG_S_BLOCK: The storage operation should block until more data is available.", message, args);
			case STG_S_RETRYNOW:
				throw new COMStatus("STG_S_RETRYNOW: The storage operation should retry immediately.", message, args);
			case STG_S_MONITORING:
				throw new COMStatus("STG_S_MONITORING: The notified event sink will not influence the storage operation.", message, args);
			case STG_S_MULTIPLEOPENS:
				throw new COMStatus("STG_S_MULTIPLEOPENS: Multiple opens prevent consolidated (commit succeeded).", message, args);
			case STG_S_CONSOLIDATIONFAILED:
				throw new COMStatus("STG_S_CONSOLIDATIONFAILED: Consolidation of the storage file failed (commit succeeded).", message, args);
			case STG_S_CANNOTCONSOLIDATE:
				throw new COMStatus("STG_S_CANNOTCONSOLIDATE: Consolidation of the storage file is inappropriate (commit succeeded).", message, args);
			case OLE_S_USEREG:
				throw new COMStatus("OLE_S_USEREG: Use the registry database to provide the requested information.", message, args);
			case OLE_S_STATIC:
				throw new COMStatus("OLE_S_STATIC: Success, but static.", message, args);
			case OLE_S_MAC_CLIPFORMAT:
				throw new COMStatus("OLE_S_MAC_CLIPFORMAT: Macintosh clipboard format.", message, args);
			case DRAGDROP_S_DROP:
				throw new COMStatus("DRAGDROP_S_DROP: Successful drop took place.", message, args);
			case DRAGDROP_S_CANCEL:
				throw new COMStatus("DRAGDROP_S_CANCEL: Drag-drop operation canceled.", message, args);
			case DRAGDROP_S_USEDEFAULTCURSORS:
				throw new COMStatus("DRAGDROP_S_USEDEFAULTCURSORS: Use the default cursor.", message, args);
			case DATA_S_SAMEFORMATETC:
				throw new COMStatus("DATA_S_SAMEFORMATETC: Data has same FORMATETC.", message, args);
			case VIEW_S_ALREADY_FROZEN:
				throw new COMStatus("VIEW_S_ALREADY_FROZEN: View is already frozen.", message, args);
			case CACHE_S_FORMATETC_NOTSUPPORTED:
				throw new COMStatus("CACHE_S_FORMATETC_NOTSUPPORTED: FORMATETC not supported.", message, args);
			case CACHE_S_SAMECACHE:
				throw new COMStatus("CACHE_S_SAMECACHE: Same cache.", message, args);
			case CACHE_S_SOMECACHES_NOTUPDATED:
				throw new COMStatus("CACHE_S_SOMECACHES_NOTUPDATED: Some caches are not updated.", message, args);
			case OLEOBJ_S_INVALIDVERB:
				throw new COMStatus("OLEOBJ_S_INVALIDVERB: Invalid verb for OLE object.", message, args);
			case OLEOBJ_S_CANNOT_DOVERB_NOW:
				throw new COMStatus("OLEOBJ_S_CANNOT_DOVERB_NOW: Verb number is valid but verb cannot be done now.", message, args);
			case OLEOBJ_S_INVALIDHWND:
				throw new COMStatus("OLEOBJ_S_INVALIDHWND: Invalid window handle passed.", message, args);
			case INPLACE_S_TRUNCATED:
				throw new COMStatus("INPLACE_S_TRUNCATED: Message is too long; some of it had to be truncated before displaying.", message, args);
			case CONVERT10_S_NO_PRESENTATION:
				throw new COMStatus("CONVERT10_S_NO_PRESENTATION: Unable to convert OLESTREAM to IStorage.", message, args);
			case MK_S_REDUCED_TO_SELF:
				throw new COMStatus("MK_S_REDUCED_TO_SELF: Moniker reduced to itself.", message, args);
			case MK_S_ME:
				throw new COMStatus("MK_S_ME: Common prefix is this moniker.", message, args);
			case MK_S_HIM:
				throw new COMStatus("MK_S_HIM: Common prefix is input moniker.", message, args);
			case MK_S_US:
				throw new COMStatus("MK_S_US: Common prefix is both monikers.", message, args);
			case MK_S_MONIKERALREADYREGISTERED:
				throw new COMStatus("MK_S_MONIKERALREADYREGISTERED: Moniker is already registered in running object table.", message, args);
			case EVENT_S_SOME_SUBSCRIBERS_FAILED:
				throw new COMStatus("EVENT_S_SOME_SUBSCRIBERS_FAILED: An event was able to invoke some, but not all, of the subscribers.", message, args);
			case EVENT_S_NOSUBSCRIBERS:
				throw new COMStatus("EVENT_S_NOSUBSCRIBERS: An event was delivered, but there were no subscribers.", message, args);
			case SCHED_S_TASK_READY:
				throw new COMStatus("SCHED_S_TASK_READY: The task is ready to run at its next scheduled time.", message, args);
			case SCHED_S_TASK_RUNNING:
				throw new COMStatus("SCHED_S_TASK_RUNNING: The task is currently running.", message, args);
			case SCHED_S_TASK_DISABLED:
				throw new COMStatus("SCHED_S_TASK_DISABLED: The task will not run at the scheduled times because it has been disabled.", message, args);
			case SCHED_S_TASK_HAS_NOT_RUN:
				throw new COMStatus("SCHED_S_TASK_HAS_NOT_RUN: The task has not yet run.", message, args);
			case SCHED_S_TASK_NO_MORE_RUNS:
				throw new COMStatus("SCHED_S_TASK_NO_MORE_RUNS: There are no more runs scheduled for this task.", message, args);
			case SCHED_S_TASK_NOT_SCHEDULED:
				throw new COMStatus("SCHED_S_TASK_NOT_SCHEDULED: One or more of the properties that are needed to run this task on a schedule have not been set.", message, args);
			case SCHED_S_TASK_TERMINATED:
				throw new COMStatus("SCHED_S_TASK_TERMINATED: The last run of the task was terminated by the user.", message, args);
			case SCHED_S_TASK_NO_VALID_TRIGGERS:
				throw new COMStatus("SCHED_S_TASK_NO_VALID_TRIGGERS: Either the task has no triggers, or the existing triggers are disabled or not set.", message, args);
			case SCHED_S_EVENT_TRIGGER:
				throw new COMStatus("SCHED_S_EVENT_TRIGGER: Event triggers do not have set run times.", message, args);
			case SCHED_S_SOME_TRIGGERS_FAILED:
				throw new COMStatus("SCHED_S_SOME_TRIGGERS_FAILED: The task is registered, but not all specified triggers will start the task.", message, args);
			case SCHED_S_BATCH_LOGON_PROBLEM:
				throw new COMStatus("SCHED_S_BATCH_LOGON_PROBLEM: The task is registered, but it may fail to start. Batch logon privilege needs to be enabled for the task principal.", message, args);
			case XACT_S_ASYNC:
				throw new COMStatus("XACT_S_ASYNC: An asynchronous operation was specified. The operation has begun, but its outcome is not known yet.", message, args);
			case XACT_S_READONLY:
				throw new COMStatus("XACT_S_READONLY: The method call succeeded because the transaction was read-only.", message, args);
			case XACT_S_SOMENORETAIN:
				throw new COMStatus("XACT_S_SOMENORETAIN: The transaction was successfully aborted. However, this is a coordinated transaction, and a number of enlisted resources were aborted outright because they could not support abort-retaining semantics.", message, args);
			case XACT_S_OKINFORM:
				throw new COMStatus("XACT_S_OKINFORM: No changes were made during this call, but the sink wants another chance to look if any other sinks make further changes.", message, args);
			case XACT_S_MADECHANGESCONTENT:
				throw new COMStatus("XACT_S_MADECHANGESCONTENT: The sink is content and wants the transaction to proceed. Changes were made to one or more resources during this call.", message, args);
			case XACT_S_MADECHANGESINFORM:
				throw new COMStatus("XACT_S_MADECHANGESINFORM: The sink is for the moment and wants the transaction to proceed, but if other changes are made following this return by other event sinks, this sink wants another chance to look.", message, args);
			case XACT_S_ALLNORETAIN:
				throw new COMStatus("XACT_S_ALLNORETAIN: The transaction was successfully aborted. However, the abort was nonretaining.", message, args);
			case XACT_S_ABORTING:
				throw new COMStatus("XACT_S_ABORTING: An abort operation was already in progress.", message, args);
			case XACT_S_SINGLEPHASE:
				throw new COMStatus("XACT_S_SINGLEPHASE: The resource manager has performed a single-phase commit of the transaction.", message, args);
			case XACT_S_LOCALLY_OK:
				throw new COMStatus("XACT_S_LOCALLY_OK: The local transaction has not aborted.", message, args);
			case XACT_S_LASTRESOURCEMANAGER:
				throw new COMStatus("XACT_S_LASTRESOURCEMANAGER: The resource manager has requested to be the coordinator (last resource manager) for the transaction.", message, args);
			case CO_S_NOTALLINTERFACES:
				throw new COMStatus("CO_S_NOTALLINTERFACES: Not all the requested interfaces were available.", message, args);
			case CO_S_MACHINENAMENOTFOUND:
				throw new COMStatus("CO_S_MACHINENAMENOTFOUND: The specified machine name was not found in the cache.", message, args);
			case SEC_I_CONTINUE_NEEDED:
				throw new COMStatus("SEC_I_CONTINUE_NEEDED: The function completed successfully, but it must be called again to complete the context.", message, args);
			case SEC_I_COMPLETE_NEEDED:
				throw new COMStatus("SEC_I_COMPLETE_NEEDED: The function completed successfully, but CompleteToken must be called.", message, args);
			case SEC_I_COMPLETE_AND_CONTINUE:
				throw new COMStatus("SEC_I_COMPLETE_AND_CONTINUE: The function completed successfully, but both CompleteToken and this function must be called to complete the context.", message, args);
			case SEC_I_LOCAL_LOGON:
				throw new COMStatus("SEC_I_LOCAL_LOGON: The logon was completed, but no network authority was available. The logon was made using locally known information.", message, args);
			case SEC_I_CONTEXT_EXPIRED:
				throw new COMStatus("SEC_I_CONTEXT_EXPIRED: The context has expired and can no longer be used.", message, args);
			case SEC_I_INCOMPLETE_CREDENTIALS:
				throw new COMStatus("SEC_I_INCOMPLETE_CREDENTIALS: The credentials supplied were not complete and could not be verified. Additional information can be returned from the context.", message, args);
			case SEC_I_RENEGOTIATE:
				throw new COMStatus("SEC_I_RENEGOTIATE: The context data must be renegotiated with the peer.", message, args);
			case SEC_I_NO_LSA_CONTEXT:
				throw new COMStatus("SEC_I_NO_LSA_CONTEXT: There is no LSA mode context associated with this context.", message, args);
			case SEC_I_SIGNATURE_NEEDED:
				throw new COMStatus("SEC_I_SIGNATURE_NEEDED: A signature operation must be performed before the user can authenticate.", message, args);
			case CRYPT_I_NEW_PROTECTION_REQUIRED:
				throw new COMStatus("CRYPT_I_NEW_PROTECTION_REQUIRED: The protected data needs to be reprotected.", message, args);
			case NS_S_CALLPENDING:
				throw new COMStatus("NS_S_CALLPENDING: The requested operation is pending completion.", message, args);
			case NS_S_CALLABORTED:
				throw new COMStatus("NS_S_CALLABORTED: The requested operation was aborted by the client.", message, args);
			case NS_S_STREAM_TRUNCATED:
				throw new COMStatus("NS_S_STREAM_TRUNCATED: The stream was purposefully stopped before completion.", message, args);
			case NS_S_REBUFFERING:
				throw new COMStatus("NS_S_REBUFFERING: The requested operation has caused the source to rebuffer.", message, args);
			case NS_S_DEGRADING_QUALITY:
				throw new COMStatus("NS_S_DEGRADING_QUALITY: The requested operation has caused the source to degrade codec quality.", message, args);
			case NS_S_TRANSCRYPTOR_EOF:
				throw new COMStatus("NS_S_TRANSCRYPTOR_EOF: The transcryptor object has reached end of file.", message, args);
			case NS_S_WMP_UI_VERSIONMISMATCH:
				throw new COMStatus("NS_S_WMP_UI_VERSIONMISMATCH: An upgrade may be needed for the theme manager to correctly show this skin. Skin reports version: %.1f.", message, args);
			case NS_S_WMP_EXCEPTION:
				throw new COMStatus("NS_S_WMP_EXCEPTION: An error occurred in one of the UI components.", message, args);
			case NS_S_WMP_LOADED_GIF_IMAGE:
				throw new COMStatus("NS_S_WMP_LOADED_GIF_IMAGE: Successfully loaded a GIF file.", message, args);
			case NS_S_WMP_LOADED_PNG_IMAGE:
				throw new COMStatus("NS_S_WMP_LOADED_PNG_IMAGE: Successfully loaded a PNG file.", message, args);
			case NS_S_WMP_LOADED_BMP_IMAGE:
				throw new COMStatus("NS_S_WMP_LOADED_BMP_IMAGE: Successfully loaded a BMP file.", message, args);
			case NS_S_WMP_LOADED_JPG_IMAGE:
				throw new COMStatus("NS_S_WMP_LOADED_JPG_IMAGE: Successfully loaded a JPG file.", message, args);
			case NS_S_WMG_FORCE_DROP_FRAME:
				throw new COMStatus("NS_S_WMG_FORCE_DROP_FRAME: Drop this frame.", message, args);
			case NS_S_WMR_ALREADYRENDERED:
				throw new COMStatus("NS_S_WMR_ALREADYRENDERED: The specified stream has already been rendered.", message, args);
			case NS_S_WMR_PINTYPEPARTIALMATCH:
				throw new COMStatus("NS_S_WMR_PINTYPEPARTIALMATCH: The specified type partially matches this pin type.", message, args);
			case NS_S_WMR_PINTYPEFULLMATCH:
				throw new COMStatus("NS_S_WMR_PINTYPEFULLMATCH: The specified type fully matches this pin type.", message, args);
			case NS_S_WMG_ADVISE_DROP_FRAME:
				throw new COMStatus("NS_S_WMG_ADVISE_DROP_FRAME: The timestamp is late compared to the current render position. Advise dropping this frame.", message, args);
			case NS_S_WMG_ADVISE_DROP_TO_KEYFRAME:
				throw new COMStatus("NS_S_WMG_ADVISE_DROP_TO_KEYFRAME: The timestamp is severely late compared to the current render position. Advise dropping everything up to the next key frame.", message, args);
			case NS_S_NEED_TO_BUY_BURN_RIGHTS:
				throw new COMStatus("NS_S_NEED_TO_BUY_BURN_RIGHTS: No burn rights. You will be prompted to buy burn rights when you try to burn this file to an audio CD.", message, args);
			case NS_S_WMPCORE_PLAYLISTCLEARABORT:
				throw new COMStatus("NS_S_WMPCORE_PLAYLISTCLEARABORT: Failed to clear playlist because it was aborted by user.", message, args);
			case NS_S_WMPCORE_PLAYLISTREMOVEITEMABORT:
				throw new COMStatus("NS_S_WMPCORE_PLAYLISTREMOVEITEMABORT: Failed to remove item in the playlist since it was aborted by user.", message, args);
			case NS_S_WMPCORE_PLAYLIST_CREATION_PENDING:
				throw new COMStatus("NS_S_WMPCORE_PLAYLIST_CREATION_PENDING: Playlist is being generated asynchronously.", message, args);
			case NS_S_WMPCORE_MEDIA_VALIDATION_PENDING:
				throw new COMStatus("NS_S_WMPCORE_MEDIA_VALIDATION_PENDING: Validation of the media is pending.", message, args);
			case NS_S_WMPCORE_PLAYLIST_REPEAT_SECONDARY_SEGMENTS_IGNORED:
				throw new COMStatus("NS_S_WMPCORE_PLAYLIST_REPEAT_SECONDARY_SEGMENTS_IGNORED: Encountered more than one Repeat block during ASX processing.", message, args);
			case NS_S_WMPCORE_COMMAND_NOT_AVAILABLE:
				throw new COMStatus("NS_S_WMPCORE_COMMAND_NOT_AVAILABLE: Current state of WMP disallows calling this method or property.", message, args);
			case NS_S_WMPCORE_PLAYLIST_NAME_AUTO_GENERATED:
				throw new COMStatus("NS_S_WMPCORE_PLAYLIST_NAME_AUTO_GENERATED: Name for the playlist has been auto generated.", message, args);
			case NS_S_WMPCORE_PLAYLIST_IMPORT_MISSING_ITEMS:
				throw new COMStatus("NS_S_WMPCORE_PLAYLIST_IMPORT_MISSING_ITEMS: The imported playlist does not contain all items from the original.", message, args);
			case NS_S_WMPCORE_PLAYLIST_COLLAPSED_TO_SINGLE_MEDIA:
				throw new COMStatus("NS_S_WMPCORE_PLAYLIST_COLLAPSED_TO_SINGLE_MEDIA: The M3U playlist has been ignored because it only contains one item.", message, args);
			case NS_S_WMPCORE_MEDIA_CHILD_PLAYLIST_OPEN_PENDING:
				throw new COMStatus("NS_S_WMPCORE_MEDIA_CHILD_PLAYLIST_OPEN_PENDING: The open for the child playlist associated with this media is pending.", message, args);
			case NS_S_WMPCORE_MORE_NODES_AVAIABLE:
				throw new COMStatus("NS_S_WMPCORE_MORE_NODES_AVAIABLE: More nodes support the interface requested, but the array for returning them is full.", message, args);
			case NS_S_WMPBR_SUCCESS:
				throw new COMStatus("NS_S_WMPBR_SUCCESS: Backup or Restore successful!.", message, args);
			case NS_S_WMPBR_PARTIALSUCCESS:
				throw new COMStatus("NS_S_WMPBR_PARTIALSUCCESS: Transfer complete with limitations.", message, args);
			case NS_S_WMPEFFECT_TRANSPARENT:
				throw new COMStatus("NS_S_WMPEFFECT_TRANSPARENT: Request to the effects control to change transparency status to transparent.", message, args);
			case NS_S_WMPEFFECT_OPAQUE:
				throw new COMStatus("NS_S_WMPEFFECT_OPAQUE: Request to the effects control to change transparency status to opaque.", message, args);
			case NS_S_OPERATION_PENDING:
				throw new COMStatus("NS_S_OPERATION_PENDING: The requested application pane is performing an operation and will not be released.", message, args);
			case NS_S_TRACK_BUY_REQUIRES_ALBUM_PURCHASE:
				throw new COMStatus("NS_S_TRACK_BUY_REQUIRES_ALBUM_PURCHASE: The file is only available for purchase when you buy the entire album.", message, args);
			case NS_S_NAVIGATION_COMPLETE_WITH_ERRORS:
				throw new COMStatus("NS_S_NAVIGATION_COMPLETE_WITH_ERRORS: There were problems completing the requested navigation. There are identifiers missing in the catalog.", message, args);
			case NS_S_TRACK_ALREADY_DOWNLOADED:
				throw new COMStatus("NS_S_TRACK_ALREADY_DOWNLOADED: Track already downloaded.", message, args);
			case NS_S_PUBLISHING_POINT_STARTED_WITH_FAILED_SINKS:
				throw new COMStatus("NS_S_PUBLISHING_POINT_STARTED_WITH_FAILED_SINKS: The publishing point successfully started, but one or more of the requested data writer plug-ins failed.", message, args);
			case NS_S_DRM_LICENSE_ACQUIRED:
				throw new COMStatus("NS_S_DRM_LICENSE_ACQUIRED: Status message: The license was acquired.", message, args);
			case NS_S_DRM_INDIVIDUALIZED:
				throw new COMStatus("NS_S_DRM_INDIVIDUALIZED: Status message: The security upgrade has been completed.", message, args);
			case NS_S_DRM_MONITOR_CANCELLED:
				throw new COMStatus("NS_S_DRM_MONITOR_CANCELLED: Status message: License monitoring has been canceled.", message, args);
			case NS_S_DRM_ACQUIRE_CANCELLED:
				throw new COMStatus("NS_S_DRM_ACQUIRE_CANCELLED: Status message: License acquisition has been canceled.", message, args);
			case NS_S_DRM_BURNABLE_TRACK:
				throw new COMStatus("NS_S_DRM_BURNABLE_TRACK: The track is burnable and had no playlist burn limit.", message, args);
			case NS_S_DRM_BURNABLE_TRACK_WITH_PLAYLIST_RESTRICTION:
				throw new COMStatus("NS_S_DRM_BURNABLE_TRACK_WITH_PLAYLIST_RESTRICTION: The track is burnable but has a playlist burn limit.", message, args);
			case NS_S_DRM_NEEDS_INDIVIDUALIZATION:
				throw new COMStatus("NS_S_DRM_NEEDS_INDIVIDUALIZATION: A security upgrade is required to perform the operation on this media file.", message, args);
			case NS_S_REBOOT_RECOMMENDED:
				throw new COMStatus("NS_S_REBOOT_RECOMMENDED: Installation was successful; however, some file cleanup is not complete. For best results, restart your computer.", message, args);
			case NS_S_REBOOT_REQUIRED:
				throw new COMStatus("NS_S_REBOOT_REQUIRED: Installation was successful; however, some file cleanup is not complete. To continue, you must restart your computer.", message, args);
			case NS_S_EOSRECEDING:
				throw new COMStatus("NS_S_EOSRECEDING: EOS hit during rewinding.", message, args);
			case NS_S_CHANGENOTICE:
				throw new COMStatus("NS_S_CHANGENOTICE: Internal.", message, args);
			case ERROR_FLT_IO_COMPLETE:
				throw new COMStatus("ERROR_FLT_IO_COMPLETE: The IO was completed by a filter.", message, args);
			case ERROR_GRAPHICS_MODE_NOT_PINNED:
				throw new COMStatus("ERROR_GRAPHICS_MODE_NOT_PINNED: No mode is pinned on the specified VidPN source or target.", message, args);
			case ERROR_GRAPHICS_NO_PREFERRED_MODE:
				throw new COMStatus("ERROR_GRAPHICS_NO_PREFERRED_MODE: Specified mode set does not specify preference for one of its modes.", message, args);
			case ERROR_GRAPHICS_DATASET_IS_EMPTY:
				throw new COMStatus("ERROR_GRAPHICS_DATASET_IS_EMPTY: Specified data set (for example, mode set, frequency range set, descriptor set, and topology) is empty.", message, args);
			case ERROR_GRAPHICS_NO_MORE_ELEMENTS_IN_DATASET:
				throw new COMStatus("ERROR_GRAPHICS_NO_MORE_ELEMENTS_IN_DATASET: Specified data set (for example, mode set, frequency range set, descriptor set, and topology) does not contain any more elements.", message, args);
			case ERROR_GRAPHICS_PATH_CONTENT_GEOMETRY_TRANSFORMATION_NOT_PINNED:
				throw new COMStatus("ERROR_GRAPHICS_PATH_CONTENT_GEOMETRY_TRANSFORMATION_NOT_PINNED: Specified content transformation is not pinned on the specified VidPN present path.", message, args);
			case PLA_S_PROPERTY_IGNORED:
				throw new COMStatus("PLA_S_PROPERTY_IGNORED: Property value will be ignored.", message, args);
			case ERROR_NDIS_INDICATION_REQUIRED:
				throw new COMStatus("ERROR_NDIS_INDICATION_REQUIRED: The request will be completed later by a Network Driver Interface Specification (NDIS) status indication.", message, args);
			case TRK_S_OUT_OF_SYNC:
				throw new COMStatus("TRK_S_OUT_OF_SYNC: The VolumeSequenceNumber of a MOVE_NOTIFICATION request is incorrect.", message, args);
			case TRK_VOLUME_NOT_FOUND:
				throw new COMStatus("TRK_VOLUME_NOT_FOUND: The VolumeID in a request was not found in the server's ServerVolumeTable.", message, args);
			case TRK_VOLUME_NOT_OWNED:
				throw new COMStatus("TRK_VOLUME_NOT_OWNED: A notification was sent to the LnkSvrMessage method, but the RequestMachine for the request was not the VolumeOwner for a VolumeID in the request.", message, args);
			case TRK_S_NOTIFICATION_QUOTA_EXCEEDED:
				throw new COMStatus("TRK_S_NOTIFICATION_QUOTA_EXCEEDED: The server received a MOVE_NOTIFICATION request, but the FileTable size limit has already been reached.", message, args);
			case NS_I_TIGER_START:
				throw new COMStatus("NS_I_TIGER_START: The Title Server %1 is running.", message, args);
			case NS_I_CUB_START:
				throw new COMStatus("NS_I_CUB_START: Content Server %1 (%2) is starting.", message, args);
			case NS_I_CUB_RUNNING:
				throw new COMStatus("NS_I_CUB_RUNNING: Content Server %1 (%2) is running.", message, args);
			case NS_I_DISK_START:
				throw new COMStatus("NS_I_DISK_START: Disk %1 ( %2 ) on Content Server %3, is running.", message, args);
			case NS_I_DISK_REBUILD_STARTED:
				throw new COMStatus("NS_I_DISK_REBUILD_STARTED: Started rebuilding disk %1 ( %2 ) on Content Server %3.", message, args);
			case NS_I_DISK_REBUILD_FINISHED:
				throw new COMStatus("NS_I_DISK_REBUILD_FINISHED: Finished rebuilding disk %1 ( %2 ) on Content Server %3.", message, args);
			case NS_I_DISK_REBUILD_ABORTED:
				throw new COMStatus("NS_I_DISK_REBUILD_ABORTED: Aborted rebuilding disk %1 ( %2 ) on Content Server %3.", message, args);
			case NS_I_LIMIT_FUNNELS:
				throw new COMStatus("NS_I_LIMIT_FUNNELS: A NetShow administrator at network location %1 set the data stream limit to %2 streams.", message, args);
			case NS_I_START_DISK:
				throw new COMStatus("NS_I_START_DISK: A NetShow administrator at network location %1 started disk %2.", message, args);
			case NS_I_STOP_DISK:
				throw new COMStatus("NS_I_STOP_DISK: A NetShow administrator at network location %1 stopped disk %2.", message, args);
			case NS_I_STOP_CUB:
				throw new COMStatus("NS_I_STOP_CUB: A NetShow administrator at network location %1 stopped Content Server %2.", message, args);
			case NS_I_KILL_USERSESSION:
				throw new COMStatus("NS_I_KILL_USERSESSION: A NetShow administrator at network location %1 aborted user session %2 from the system.", message, args);
			case NS_I_KILL_CONNECTION:
				throw new COMStatus("NS_I_KILL_CONNECTION: A NetShow administrator at network location %1 aborted obsolete connection %2 from the system.", message, args);
			case NS_I_REBUILD_DISK:
				throw new COMStatus("NS_I_REBUILD_DISK: A NetShow administrator at network location %1 started rebuilding disk %2.", message, args);
			case MCMADM_I_NO_EVENTS:
				throw new COMStatus("MCMADM_I_NO_EVENTS: Event initialization failed, there will be no MCM events.", message, args);
			case NS_I_LOGGING_FAILED:
				throw new COMStatus("NS_I_LOGGING_FAILED: The logging operation failed.", message, args);
			case NS_I_LIMIT_BANDWIDTH:
				throw new COMStatus("NS_I_LIMIT_BANDWIDTH: A NetShow administrator at network location %1 set the maximum bandwidth limit to %2 bps.", message, args);
			case NS_I_CUB_UNFAIL_LINK:
				throw new COMStatus("NS_I_CUB_UNFAIL_LINK: Content Server %1 (%2) has established its link to Content Server %3.", message, args);
			case NS_I_RESTRIPE_START:
				throw new COMStatus("NS_I_RESTRIPE_START: Restripe operation has started.", message, args);
			case NS_I_RESTRIPE_DONE:
				throw new COMStatus("NS_I_RESTRIPE_DONE: Restripe operation has completed.", message, args);
			case NS_I_RESTRIPE_DISK_OUT:
				throw new COMStatus("NS_I_RESTRIPE_DISK_OUT: Content disk %1 (%2) on Content Server %3 has been restriped out.", message, args);
			case NS_I_RESTRIPE_CUB_OUT:
				throw new COMStatus("NS_I_RESTRIPE_CUB_OUT: Content server %1 (%2) has been restriped out.", message, args);
			case NS_I_DISK_STOP:
				throw new COMStatus("NS_I_DISK_STOP: Disk %1 ( %2 ) on Content Server %3, has been offlined.", message, args);
			case NS_I_PLAYLIST_CHANGE_RECEDING:
				throw new COMStatus("NS_I_PLAYLIST_CHANGE_RECEDING: The playlist change occurred while receding.", message, args);
			case NS_I_RECONNECTED:
				throw new COMStatus("NS_I_RECONNECTED: The client is reconnected.", message, args);
			case NS_I_NOLOG_STOP:
				throw new COMStatus("NS_I_NOLOG_STOP: Forcing a switch to a pending header on start.", message, args);
			case NS_I_EXISTING_PACKETIZER:
				throw new COMStatus("NS_I_EXISTING_PACKETIZER: There is already an existing packetizer plugin for the stream.", message, args);
			case NS_I_MANUAL_PROXY:
				throw new COMStatus("NS_I_MANUAL_PROXY: The proxy setting is manual.", message, args);
			case ERROR_GRAPHICS_DRIVER_MISMATCH:
				throw new COMStatus("ERROR_GRAPHICS_DRIVER_MISMATCH: The kernel driver detected a version mismatch between it and the user mode driver.", message, args);
			case ERROR_GRAPHICS_UNKNOWN_CHILD_STATUS:
				throw new COMStatus("ERROR_GRAPHICS_UNKNOWN_CHILD_STATUS: Child device presence was not reliably detected.", message, args);
			case ERROR_GRAPHICS_LEADLINK_START_DEFERRED:
				throw new COMStatus("ERROR_GRAPHICS_LEADLINK_START_DEFERRED: Starting the lead-link adapter has been deferred temporarily.", message, args);
			case ERROR_GRAPHICS_POLLING_TOO_FREQUENTLY:
				throw new COMStatus("ERROR_GRAPHICS_POLLING_TOO_FREQUENTLY: The display adapter is being polled for children too frequently at the same polling level.", message, args);
			case ERROR_GRAPHICS_START_DEFERRED:
				throw new COMStatus("ERROR_GRAPHICS_START_DEFERRED: Starting the adapter has been deferred temporarily.", message, args);
			case E_PENDING:
				throw new COMStatus("E_PENDING: The data necessary to complete this operation is not yet available.", message, args);
			case E_NOTIMPL:
				throw new COMStatus("E_NOTIMPL: Not implemented.", message, args);
			case E_NOINTERFACE:
				throw new COMStatus("E_NOINTERFACE: No such interface supported.", message, args);
			case E_POINTER:
				throw new COMStatus("E_POINTER: Invalid pointer.", message, args);
			case E_ABORT:
				throw new COMStatus("E_ABORT: Operation aborted.", message, args);
			case E_FAIL:
				throw new COMStatus("E_FAIL: Unspecified error.", message, args);
			case CO_E_INIT_TLS:
				throw new COMStatus("CO_E_INIT_TLS: Thread local storage failure.", message, args);
			case CO_E_INIT_SHARED_ALLOCATOR:
				throw new COMStatus("CO_E_INIT_SHARED_ALLOCATOR: Get shared memory allocator failure.", message, args);
			case CO_E_INIT_MEMORY_ALLOCATOR:
				throw new COMStatus("CO_E_INIT_MEMORY_ALLOCATOR: Get memory allocator failure.", message, args);
			case CO_E_INIT_CLASS_CACHE:
				throw new COMStatus("CO_E_INIT_CLASS_CACHE: Unable to initialize class cache.", message, args);
			case CO_E_INIT_RPC_CHANNEL:
				throw new COMStatus("CO_E_INIT_RPC_CHANNEL: Unable to initialize remote procedure call (RPC) services.", message, args);
			case CO_E_INIT_TLS_SET_CHANNEL_CONTROL:
				throw new COMStatus("CO_E_INIT_TLS_SET_CHANNEL_CONTROL: Cannot set thread local storage channel control.", message, args);
			case CO_E_INIT_TLS_CHANNEL_CONTROL:
				throw new COMStatus("CO_E_INIT_TLS_CHANNEL_CONTROL: Could not allocate thread local storage channel control.", message, args);
			case CO_E_INIT_UNACCEPTED_USER_ALLOCATOR:
				throw new COMStatus("CO_E_INIT_UNACCEPTED_USER_ALLOCATOR: The user-supplied memory allocator is unacceptable.", message, args);
			case CO_E_INIT_SCM_MUTEX_EXISTS:
				throw new COMStatus("CO_E_INIT_SCM_MUTEX_EXISTS: The OLE service mutex already exists.", message, args);
			case CO_E_INIT_SCM_FILE_MAPPING_EXISTS:
				throw new COMStatus("CO_E_INIT_SCM_FILE_MAPPING_EXISTS: The OLE service file mapping already exists.", message, args);
			case CO_E_INIT_SCM_MAP_VIEW_OF_FILE:
				throw new COMStatus("CO_E_INIT_SCM_MAP_VIEW_OF_FILE: Unable to map view of file for OLE service.", message, args);
			case CO_E_INIT_SCM_EXEC_FAILURE:
				throw new COMStatus("CO_E_INIT_SCM_EXEC_FAILURE: Failure attempting to launch OLE service.", message, args);
			case CO_E_INIT_ONLY_SINGLE_THREADED:
				throw new COMStatus("CO_E_INIT_ONLY_SINGLE_THREADED: There was an attempt to call CoInitialize a second time while single-threaded.", message, args);
			case CO_E_CANT_REMOTE:
				throw new COMStatus("CO_E_CANT_REMOTE: A Remote activation was necessary but was not allowed.", message, args);
			case CO_E_BAD_SERVER_NAME:
				throw new COMStatus("CO_E_BAD_SERVER_NAME: A Remote activation was necessary, but the server name provided was invalid.", message, args);
			case CO_E_WRONG_SERVER_IDENTITY:
				throw new COMStatus("CO_E_WRONG_SERVER_IDENTITY: The class is configured to run as a security ID different from the caller.", message, args);
			case CO_E_OLE1DDE_DISABLED:
				throw new COMStatus("CO_E_OLE1DDE_DISABLED: Use of OLE1 services requiring Dynamic Data Exchange (DDE) Windows is disabled.", message, args);
			case CO_E_RUNAS_SYNTAX:
				throw new COMStatus("CO_E_RUNAS_SYNTAX: A RunAs specification must be <domain name>\\<user name> or simply <user name>.", message, args);
			case CO_E_CREATEPROCESS_FAILURE:
				throw new COMStatus("CO_E_CREATEPROCESS_FAILURE: The server process could not be started. The path name may be incorrect.", message, args);
			case CO_E_RUNAS_CREATEPROCESS_FAILURE:
				throw new COMStatus("CO_E_RUNAS_CREATEPROCESS_FAILURE: The server process could not be started as the configured identity. The path name may be incorrect or unavailable.", message, args);
			case CO_E_RUNAS_LOGON_FAILURE:
				throw new COMStatus("CO_E_RUNAS_LOGON_FAILURE: The server process could not be started because the configured identity is incorrect. Check the user name and password.", message, args);
			case CO_E_LAUNCH_PERMSSION_DENIED:
				throw new COMStatus("CO_E_LAUNCH_PERMSSION_DENIED: The client is not allowed to launch this server.", message, args);
			case CO_E_START_SERVICE_FAILURE:
				throw new COMStatus("CO_E_START_SERVICE_FAILURE: The service providing this server could not be started.", message, args);
			case CO_E_REMOTE_COMMUNICATION_FAILURE:
				throw new COMStatus("CO_E_REMOTE_COMMUNICATION_FAILURE: This computer was unable to communicate with the computer providing the server.", message, args);
			case CO_E_SERVER_START_TIMEOUT:
				throw new COMStatus("CO_E_SERVER_START_TIMEOUT: The server did not respond after being launched.", message, args);
			case CO_E_CLSREG_INCONSISTENT:
				throw new COMStatus("CO_E_CLSREG_INCONSISTENT: The registration information for this server is inconsistent or incomplete.", message, args);
			case CO_E_IIDREG_INCONSISTENT:
				throw new COMStatus("CO_E_IIDREG_INCONSISTENT: The registration information for this interface is inconsistent or incomplete.", message, args);
			case CO_E_NOT_SUPPORTED:
				throw new COMStatus("CO_E_NOT_SUPPORTED: The operation attempted is not supported.", message, args);
			case CO_E_RELOAD_DLL:
				throw new COMStatus("CO_E_RELOAD_DLL: A DLL must be loaded.", message, args);
			case CO_E_MSI_ERROR:
				throw new COMStatus("CO_E_MSI_ERROR: A Microsoft Software Installer error was encountered.", message, args);
			case CO_E_ATTEMPT_TO_CREATE_OUTSIDE_CLIENT_CONTEXT:
				throw new COMStatus("CO_E_ATTEMPT_TO_CREATE_OUTSIDE_CLIENT_CONTEXT: The specified activation could not occur in the client context as specified.", message, args);
			case CO_E_SERVER_PAUSED:
				throw new COMStatus("CO_E_SERVER_PAUSED: Activations on the server are paused.", message, args);
			case CO_E_SERVER_NOT_PAUSED:
				throw new COMStatus("CO_E_SERVER_NOT_PAUSED: Activations on the server are not paused.", message, args);
			case CO_E_CLASS_DISABLED:
				throw new COMStatus("CO_E_CLASS_DISABLED: The component or application containing the component has been disabled.", message, args);
			case CO_E_CLRNOTAVAILABLE:
				throw new COMStatus("CO_E_CLRNOTAVAILABLE: The common language runtime is not available.", message, args);
			case CO_E_ASYNC_WORK_REJECTED:
				throw new COMStatus("CO_E_ASYNC_WORK_REJECTED: The thread-pool rejected the submitted asynchronous work.", message, args);
			case CO_E_SERVER_INIT_TIMEOUT:
				throw new COMStatus("CO_E_SERVER_INIT_TIMEOUT: The server started, but it did not finish initializing in a timely fashion.", message, args);
			case CO_E_NO_SECCTX_IN_ACTIVATE:
				throw new COMStatus("CO_E_NO_SECCTX_IN_ACTIVATE: Unable to complete the call because there is no COM+ security context inside IObjectControl.Activate.", message, args);
			case CO_E_TRACKER_CONFIG:
				throw new COMStatus("CO_E_TRACKER_CONFIG: The provided tracker configuration is invalid.", message, args);
			case CO_E_THREADPOOL_CONFIG:
				throw new COMStatus("CO_E_THREADPOOL_CONFIG: The provided thread pool configuration is invalid.", message, args);
			case CO_E_SXS_CONFIG:
				throw new COMStatus("CO_E_SXS_CONFIG: The provided side-by-side configuration is invalid.", message, args);
			case CO_E_MALFORMED_SPN:
				throw new COMStatus("CO_E_MALFORMED_SPN: The server principal name (SPN) obtained during security negotiation is malformed.", message, args);
			case E_UNEXPECTED:
				throw new COMStatus("E_UNEXPECTED: Catastrophic failure.", message, args);
			case RPC_E_CALL_REJECTED:
				throw new COMStatus("RPC_E_CALL_REJECTED: Call was rejected by callee.", message, args);
			case RPC_E_CALL_CANCELED:
				throw new COMStatus("RPC_E_CALL_CANCELED: Call was canceled by the message filter.", message, args);
			case RPC_E_CANTPOST_INSENDCALL:
				throw new COMStatus("RPC_E_CANTPOST_INSENDCALL: The caller is dispatching an intertask SendMessage call and cannot call out via PostMessage.", message, args);
			case RPC_E_CANTCALLOUT_INASYNCCALL:
				throw new COMStatus("RPC_E_CANTCALLOUT_INASYNCCALL: The caller is dispatching an asynchronous call and cannot make an outgoing call on behalf of this call.", message, args);
			case RPC_E_CANTCALLOUT_INEXTERNALCALL:
				throw new COMStatus("RPC_E_CANTCALLOUT_INEXTERNALCALL: It is illegal to call out while inside message filter.", message, args);
			case RPC_E_CONNECTION_TERMINATED:
				throw new COMStatus("RPC_E_CONNECTION_TERMINATED: The connection terminated or is in a bogus state and can no longer be used. Other connections are still valid.", message, args);
			case RPC_E_SERVER_DIED:
				throw new COMStatus("RPC_E_SERVER_DIED: The callee (the server, not the server application) is not available and disappeared; all connections are invalid. The call may have executed.", message, args);
			case RPC_E_CLIENT_DIED:
				throw new COMStatus("RPC_E_CLIENT_DIED: The caller (client) disappeared while the callee (server) was processing a call.", message, args);
			case RPC_E_INVALID_DATAPACKET:
				throw new COMStatus("RPC_E_INVALID_DATAPACKET: The data packet with the marshaled parameter data is incorrect.", message, args);
			case RPC_E_CANTTRANSMIT_CALL:
				throw new COMStatus("RPC_E_CANTTRANSMIT_CALL: The call was not transmitted properly; the message queue was full and was not emptied after yielding.", message, args);
			case RPC_E_CLIENT_CANTMARSHAL_DATA:
				throw new COMStatus("RPC_E_CLIENT_CANTMARSHAL_DATA: The client RPC caller cannot marshal the parameter data due to errors (such as low memory).", message, args);
			case RPC_E_CLIENT_CANTUNMARSHAL_DATA:
				throw new COMStatus("RPC_E_CLIENT_CANTUNMARSHAL_DATA: The client RPC caller cannot unmarshal the return data due to errors (such as low memory).", message, args);
			case RPC_E_SERVER_CANTMARSHAL_DATA:
				throw new COMStatus("RPC_E_SERVER_CANTMARSHAL_DATA: The server RPC callee cannot marshal the return data due to errors (such as low memory).", message, args);
			case RPC_E_SERVER_CANTUNMARSHAL_DATA:
				throw new COMStatus("RPC_E_SERVER_CANTUNMARSHAL_DATA: The server RPC callee cannot unmarshal the parameter data due to errors (such as low memory).", message, args);
			case RPC_E_INVALID_DATA:
				throw new COMStatus("RPC_E_INVALID_DATA: Received data is invalid. The data may be server or client data.", message, args);
			case RPC_E_INVALID_PARAMETER:
				throw new COMStatus("RPC_E_INVALID_PARAMETER: A particular parameter is invalid and cannot be (un)marshaled.", message, args);
			case RPC_E_CANTCALLOUT_AGAIN:
				throw new COMStatus("RPC_E_CANTCALLOUT_AGAIN: There is no second outgoing call on same channel in DDE conversation.", message, args);
			case RPC_E_SERVER_DIED_DNE:
				throw new COMStatus("RPC_E_SERVER_DIED_DNE: The callee (the server, not the server application) is not available and disappeared; all connections are invalid. The call did not execute.", message, args);
			case RPC_E_SYS_CALL_FAILED:
				throw new COMStatus("RPC_E_SYS_CALL_FAILED: System call failed.", message, args);
			case RPC_E_OUT_OF_RESOURCES:
				throw new COMStatus("RPC_E_OUT_OF_RESOURCES: Could not allocate some required resource (such as memory or events)", message, args);
			case RPC_E_ATTEMPTED_MULTITHREAD:
				throw new COMStatus("RPC_E_ATTEMPTED_MULTITHREAD: Attempted to make calls on more than one thread in single-threaded mode.", message, args);
			case RPC_E_NOT_REGISTERED:
				throw new COMStatus("RPC_E_NOT_REGISTERED: The requested interface is not registered on the server object.", message, args);
			case RPC_E_FAULT:
				throw new COMStatus("RPC_E_FAULT: RPC could not call the server or could not return the results of calling the server.", message, args);
			case RPC_E_SERVERFAULT:
				throw new COMStatus("RPC_E_SERVERFAULT: The server threw an exception.", message, args);
			case RPC_E_CHANGED_MODE:
				throw new COMStatus("RPC_E_CHANGED_MODE: Cannot change thread mode after it is set.", message, args);
			case RPC_E_INVALIDMETHOD:
				throw new COMStatus("RPC_E_INVALIDMETHOD: The method called does not exist on the server.", message, args);
			case RPC_E_DISCONNECTED:
				throw new COMStatus("RPC_E_DISCONNECTED: The object invoked has disconnected from its clients.", message, args);
			case RPC_E_RETRY:
				throw new COMStatus("RPC_E_RETRY: The object invoked chose not to process the call now. Try again later.", message, args);
			case RPC_E_SERVERCALL_RETRYLATER:
				throw new COMStatus("RPC_E_SERVERCALL_RETRYLATER: The message filter indicated that the application is busy.", message, args);
			case RPC_E_SERVERCALL_REJECTED:
				throw new COMStatus("RPC_E_SERVERCALL_REJECTED: The message filter rejected the call.", message, args);
			case RPC_E_INVALID_CALLDATA:
				throw new COMStatus("RPC_E_INVALID_CALLDATA: A call control interface was called with invalid data.", message, args);
			case RPC_E_CANTCALLOUT_ININPUTSYNCCALL:
				throw new COMStatus("RPC_E_CANTCALLOUT_ININPUTSYNCCALL: An outgoing call cannot be made because the application is dispatching an input-synchronous call.", message, args);
			case RPC_E_WRONG_THREAD:
				throw new COMStatus("RPC_E_WRONG_THREAD: The application called an interface that was marshaled for a different thread.", message, args);
			case RPC_E_THREAD_NOT_INIT:
				throw new COMStatus("RPC_E_THREAD_NOT_INIT: CoInitialize has not been called on the current thread.", message, args);
			case RPC_E_VERSION_MISMATCH:
				throw new COMStatus("RPC_E_VERSION_MISMATCH: The version of OLE on the client and server machines does not match.", message, args);
			case RPC_E_INVALID_HEADER:
				throw new COMStatus("RPC_E_INVALID_HEADER: OLE received a packet with an invalid header.", message, args);
			case RPC_E_INVALID_EXTENSION:
				throw new COMStatus("RPC_E_INVALID_EXTENSION: OLE received a packet with an invalid extension.", message, args);
			case RPC_E_INVALID_IPID:
				throw new COMStatus("RPC_E_INVALID_IPID: The requested object or interface does not exist.", message, args);
			case RPC_E_INVALID_OBJECT:
				throw new COMStatus("RPC_E_INVALID_OBJECT: The requested object does not exist.", message, args);
			case RPC_S_CALLPENDING:
				throw new COMStatus("RPC_S_CALLPENDING: OLE has sent a request and is waiting for a reply.", message, args);
			case RPC_S_WAITONTIMER:
				throw new COMStatus("RPC_S_WAITONTIMER: OLE is waiting before retrying a request.", message, args);
			case RPC_E_CALL_COMPLETE:
				throw new COMStatus("RPC_E_CALL_COMPLETE: Call context cannot be accessed after call completed.", message, args);
			case RPC_E_UNSECURE_CALL:
				throw new COMStatus("RPC_E_UNSECURE_CALL: Impersonate on unsecure calls is not supported.", message, args);
			case RPC_E_TOO_LATE:
				throw new COMStatus("RPC_E_TOO_LATE: Security must be initialized before any interfaces are marshaled or unmarshaled. It cannot be changed after initialized.", message, args);
			case RPC_E_NO_GOOD_SECURITY_PACKAGES:
				throw new COMStatus("RPC_E_NO_GOOD_SECURITY_PACKAGES: No security packages are installed on this machine, the user is not logged on, or there are no compatible security packages between the client and server.", message, args);
			case RPC_E_ACCESS_DENIED:
				throw new COMStatus("RPC_E_ACCESS_DENIED: Access is denied.", message, args);
			case RPC_E_REMOTE_DISABLED:
				throw new COMStatus("RPC_E_REMOTE_DISABLED: Remote calls are not allowed for this process.", message, args);
			case RPC_E_INVALID_OBJREF:
				throw new COMStatus("RPC_E_INVALID_OBJREF: The marshaled interface data packet (OBJREF) has an invalid or unknown format.", message, args);
			case RPC_E_NO_CONTEXT:
				throw new COMStatus("RPC_E_NO_CONTEXT: No context is associated with this call. This happens for some custom marshaled calls and on the client side of the call.", message, args);
			case RPC_E_TIMEOUT:
				throw new COMStatus("RPC_E_TIMEOUT: This operation returned because the time-out period expired.", message, args);
			case RPC_E_NO_SYNC:
				throw new COMStatus("RPC_E_NO_SYNC: There are no synchronize objects to wait on.", message, args);
			case RPC_E_FULLSIC_REQUIRED:
				throw new COMStatus("RPC_E_FULLSIC_REQUIRED: Full subject issuer chain Secure Sockets Layer (SSL) principal name expected from the server.", message, args);
			case RPC_E_INVALID_STD_NAME:
				throw new COMStatus("RPC_E_INVALID_STD_NAME: Principal name is not a valid Microsoft standard (msstd) name.", message, args);
			case CO_E_FAILEDTOIMPERSONATE:
				throw new COMStatus("CO_E_FAILEDTOIMPERSONATE: Unable to impersonate DCOM client.", message, args);
			case CO_E_FAILEDTOGETSECCTX:
				throw new COMStatus("CO_E_FAILEDTOGETSECCTX: Unable to obtain server's security context.", message, args);
			case CO_E_FAILEDTOOPENTHREADTOKEN:
				throw new COMStatus("CO_E_FAILEDTOOPENTHREADTOKEN: Unable to open the access token of the current thread.", message, args);
			case CO_E_FAILEDTOGETTOKENINFO:
				throw new COMStatus("CO_E_FAILEDTOGETTOKENINFO: Unable to obtain user information from an access token.", message, args);
			case CO_E_TRUSTEEDOESNTMATCHCLIENT:
				throw new COMStatus("CO_E_TRUSTEEDOESNTMATCHCLIENT: The client who called IAccessControl::IsAccessPermitted was not the trustee provided to the method.", message, args);
			case CO_E_FAILEDTOQUERYCLIENTBLANKET:
				throw new COMStatus("CO_E_FAILEDTOQUERYCLIENTBLANKET: Unable to obtain the client's security blanket.", message, args);
			case CO_E_FAILEDTOSETDACL:
				throw new COMStatus("CO_E_FAILEDTOSETDACL: Unable to set a discretionary access control list (ACL) into a security descriptor.", message, args);
			case CO_E_ACCESSCHECKFAILED:
				throw new COMStatus("CO_E_ACCESSCHECKFAILED: The system function AccessCheck returned false.", message, args);
			case CO_E_NETACCESSAPIFAILED:
				throw new COMStatus("CO_E_NETACCESSAPIFAILED: Either NetAccessDel or NetAccessAdd returned an error code.", message, args);
			case CO_E_WRONGTRUSTEENAMESYNTAX:
				throw new COMStatus("CO_E_WRONGTRUSTEENAMESYNTAX: One of the trustee strings provided by the user did not conform to the <Domain>\\<Name> syntax and it was not the *\"string\".", message, args);
			case CO_E_INVALIDSID:
				throw new COMStatus("CO_E_INVALIDSID: One of the security identifiers provided by the user was invalid.", message, args);
			case CO_E_CONVERSIONFAILED:
				throw new COMStatus("CO_E_CONVERSIONFAILED: Unable to convert a wide character trustee string to a multiple-byte trustee string.", message, args);
			case CO_E_NOMATCHINGSIDFOUND:
				throw new COMStatus("CO_E_NOMATCHINGSIDFOUND: Unable to find a security identifier that corresponds to a trustee string provided by the user.", message, args);
			case CO_E_LOOKUPACCSIDFAILED:
				throw new COMStatus("CO_E_LOOKUPACCSIDFAILED: The system function LookupAccountSID failed.", message, args);
			case CO_E_NOMATCHINGNAMEFOUND:
				throw new COMStatus("CO_E_NOMATCHINGNAMEFOUND: Unable to find a trustee name that corresponds to a security identifier provided by the user.", message, args);
			case CO_E_LOOKUPACCNAMEFAILED:
				throw new COMStatus("CO_E_LOOKUPACCNAMEFAILED: The system function LookupAccountName failed.", message, args);
			case CO_E_SETSERLHNDLFAILED:
				throw new COMStatus("CO_E_SETSERLHNDLFAILED: Unable to set or reset a serialization handle.", message, args);
			case CO_E_FAILEDTOGETWINDIR:
				throw new COMStatus("CO_E_FAILEDTOGETWINDIR: Unable to obtain the Windows directory.", message, args);
			case CO_E_PATHTOOLONG:
				throw new COMStatus("CO_E_PATHTOOLONG: Path too long.", message, args);
			case CO_E_FAILEDTOGENUUID:
				throw new COMStatus("CO_E_FAILEDTOGENUUID: Unable to generate a UUID.", message, args);
			case CO_E_FAILEDTOCREATEFILE:
				throw new COMStatus("CO_E_FAILEDTOCREATEFILE: Unable to create file.", message, args);
			case CO_E_FAILEDTOCLOSEHANDLE:
				throw new COMStatus("CO_E_FAILEDTOCLOSEHANDLE: Unable to close a serialization handle or a file handle.", message, args);
			case CO_E_EXCEEDSYSACLLIMIT:
				throw new COMStatus("CO_E_EXCEEDSYSACLLIMIT: The number of access control entries (ACEs) in an ACL exceeds the system limit.", message, args);
			case CO_E_ACESINWRONGORDER:
				throw new COMStatus("CO_E_ACESINWRONGORDER: Not all the DENY_ACCESS ACEs are arranged in front of the GRANT_ACCESS ACEs in the stream.", message, args);
			case CO_E_INCOMPATIBLESTREAMVERSION:
				throw new COMStatus("CO_E_INCOMPATIBLESTREAMVERSION: The version of ACL format in the stream is not supported by this implementation of IAccessControl.", message, args);
			case CO_E_FAILEDTOOPENPROCESSTOKEN:
				throw new COMStatus("CO_E_FAILEDTOOPENPROCESSTOKEN: Unable to open the access token of the server process.", message, args);
			case CO_E_DECODEFAILED:
				throw new COMStatus("CO_E_DECODEFAILED: Unable to decode the ACL in the stream provided by the user.", message, args);
			case CO_E_ACNOTINITIALIZED:
				throw new COMStatus("CO_E_ACNOTINITIALIZED: The COM IAccessControl object is not initialized.", message, args);
			case CO_E_CANCEL_DISABLED:
				throw new COMStatus("CO_E_CANCEL_DISABLED: Call Cancellation is disabled.", message, args);
			case RPC_E_UNEXPECTED:
				throw new COMStatus("RPC_E_UNEXPECTED: An internal error occurred.", message, args);
			case DISP_E_UNKNOWNINTERFACE:
				throw new COMStatus("DISP_E_UNKNOWNINTERFACE: Unknown interface.", message, args);
			case DISP_E_MEMBERNOTFOUND:
				throw new COMStatus("DISP_E_MEMBERNOTFOUND: Member not found.", message, args);
			case DISP_E_PARAMNOTFOUND:
				throw new COMStatus("DISP_E_PARAMNOTFOUND: Parameter not found.", message, args);
			case DISP_E_TYPEMISMATCH:
				throw new COMStatus("DISP_E_TYPEMISMATCH: Type mismatch.", message, args);
			case DISP_E_UNKNOWNNAME:
				throw new COMStatus("DISP_E_UNKNOWNNAME: Unknown name.", message, args);
			case DISP_E_NONAMEDARGS:
				throw new COMStatus("DISP_E_NONAMEDARGS: No named arguments.", message, args);
			case DISP_E_BADVARTYPE:
				throw new COMStatus("DISP_E_BADVARTYPE: Bad variable type.", message, args);
			case DISP_E_EXCEPTION:
				throw new COMStatus("DISP_E_EXCEPTION: Exception occurred.", message, args);
			case DISP_E_OVERFLOW:
				throw new COMStatus("DISP_E_OVERFLOW: Out of present range.", message, args);
			case DISP_E_BADINDEX:
				throw new COMStatus("DISP_E_BADINDEX: Invalid index.", message, args);
			case DISP_E_UNKNOWNLCID:
				throw new COMStatus("DISP_E_UNKNOWNLCID: Unknown language.", message, args);
			case DISP_E_ARRAYISLOCKED:
				throw new COMStatus("DISP_E_ARRAYISLOCKED: Memory is locked.", message, args);
			case DISP_E_BADPARAMCOUNT:
				throw new COMStatus("DISP_E_BADPARAMCOUNT: Invalid number of parameters.", message, args);
			case DISP_E_PARAMNOTOPTIONAL:
				throw new COMStatus("DISP_E_PARAMNOTOPTIONAL: Parameter not optional.", message, args);
			case DISP_E_BADCALLEE:
				throw new COMStatus("DISP_E_BADCALLEE: Invalid callee.", message, args);
			case DISP_E_NOTACOLLECTION:
				throw new COMStatus("DISP_E_NOTACOLLECTION: Does not support a collection.", message, args);
			case DISP_E_DIVBYZERO:
				throw new COMStatus("DISP_E_DIVBYZERO: Division by zero.", message, args);
			case DISP_E_BUFFERTOOSMALL:
				throw new COMStatus("DISP_E_BUFFERTOOSMALL: Buffer too small.", message, args);
			case TYPE_E_BUFFERTOOSMALL:
				throw new COMStatus("TYPE_E_BUFFERTOOSMALL: Buffer too small.", message, args);
			case TYPE_E_FIELDNOTFOUND:
				throw new COMStatus("TYPE_E_FIELDNOTFOUND: Field name not defined in the record.", message, args);
			case TYPE_E_INVDATAREAD:
				throw new COMStatus("TYPE_E_INVDATAREAD: Old format or invalid type library.", message, args);
			case TYPE_E_UNSUPFORMAT:
				throw new COMStatus("TYPE_E_UNSUPFORMAT: Old format or invalid type library.", message, args);
			case TYPE_E_REGISTRYACCESS:
				throw new COMStatus("TYPE_E_REGISTRYACCESS: Error accessing the OLE registry.", message, args);
			case TYPE_E_LIBNOTREGISTERED:
				throw new COMStatus("TYPE_E_LIBNOTREGISTERED: Library not registered.", message, args);
			case TYPE_E_UNDEFINEDTYPE:
				throw new COMStatus("TYPE_E_UNDEFINEDTYPE: Bound to unknown type.", message, args);
			case TYPE_E_QUALIFIEDNAMEDISALLOWED:
				throw new COMStatus("TYPE_E_QUALIFIEDNAMEDISALLOWED: Qualified name disallowed.", message, args);
			case TYPE_E_INVALIDSTATE:
				throw new COMStatus("TYPE_E_INVALIDSTATE: Invalid forward reference, or reference to uncompiled type.", message, args);
			case TYPE_E_WRONGTYPEKIND:
				throw new COMStatus("TYPE_E_WRONGTYPEKIND: Type mismatch.", message, args);
			case TYPE_E_ELEMENTNOTFOUND:
				throw new COMStatus("TYPE_E_ELEMENTNOTFOUND: Element not found.", message, args);
			case TYPE_E_AMBIGUOUSNAME:
				throw new COMStatus("TYPE_E_AMBIGUOUSNAME: Ambiguous name.", message, args);
			case TYPE_E_NAMECONFLICT:
				throw new COMStatus("TYPE_E_NAMECONFLICT: Name already exists in the library.", message, args);
			case TYPE_E_UNKNOWNLCID:
				throw new COMStatus("TYPE_E_UNKNOWNLCID: Unknown language code identifier (LCID).", message, args);
			case TYPE_E_DLLFUNCTIONNOTFOUND:
				throw new COMStatus("TYPE_E_DLLFUNCTIONNOTFOUND: Function not defined in specified DLL.", message, args);
			case TYPE_E_BADMODULEKIND:
				throw new COMStatus("TYPE_E_BADMODULEKIND: Wrong module kind for the operation.", message, args);
			case TYPE_E_SIZETOOBIG:
				throw new COMStatus("TYPE_E_SIZETOOBIG: Size may not exceed 64 KB.", message, args);
			case TYPE_E_DUPLICATEID:
				throw new COMStatus("TYPE_E_DUPLICATEID: Duplicate ID in inheritance hierarchy.", message, args);
			case TYPE_E_INVALIDID:
				throw new COMStatus("TYPE_E_INVALIDID: Incorrect inheritance depth in standard OLE hmember.", message, args);
			case TYPE_E_TYPEMISMATCH:
				throw new COMStatus("TYPE_E_TYPEMISMATCH: Type mismatch.", message, args);
			case TYPE_E_OUTOFBOUNDS:
				throw new COMStatus("TYPE_E_OUTOFBOUNDS: Invalid number of arguments.", message, args);
			case TYPE_E_IOERROR:
				throw new COMStatus("TYPE_E_IOERROR: I/O error.", message, args);
			case TYPE_E_CANTCREATETMPFILE:
				throw new COMStatus("TYPE_E_CANTCREATETMPFILE: Error creating unique .tmp file.", message, args);
			case TYPE_E_CANTLOADLIBRARY:
				throw new COMStatus("TYPE_E_CANTLOADLIBRARY: Error loading type library or DLL.", message, args);
			case TYPE_E_INCONSISTENTPROPFUNCS:
				throw new COMStatus("TYPE_E_INCONSISTENTPROPFUNCS: Inconsistent property functions.", message, args);
			case TYPE_E_CIRCULARTYPE:
				throw new COMStatus("TYPE_E_CIRCULARTYPE: Circular dependency between types and modules.", message, args);
			case STG_E_INVALIDFUNCTION:
				throw new COMStatus("STG_E_INVALIDFUNCTION: Unable to perform requested operation.", message, args);
			case STG_E_FILENOTFOUND:
				throw new COMStatus("STG_E_FILENOTFOUND: %1 could not be found.", message, args);
			case STG_E_PATHNOTFOUND:
				throw new COMStatus("STG_E_PATHNOTFOUND: The path %1 could not be found.", message, args);
			case STG_E_TOOMANYOPENFILES:
				throw new COMStatus("STG_E_TOOMANYOPENFILES: There are insufficient resources to open another file.", message, args);
			case STG_E_ACCESSDENIED:
				throw new COMStatus("STG_E_ACCESSDENIED: Access denied.", message, args);
			case STG_E_INVALIDHANDLE:
				throw new COMStatus("STG_E_INVALIDHANDLE: Attempted an operation on an invalid object.", message, args);
			case STG_E_INSUFFICIENTMEMORY:
				throw new COMStatus("STG_E_INSUFFICIENTMEMORY: There is insufficient memory available to complete operation.", message, args);
			case STG_E_INVALIDPOINTER:
				throw new COMStatus("STG_E_INVALIDPOINTER: Invalid pointer error.", message, args);
			case STG_E_NOMOREFILES:
				throw new COMStatus("STG_E_NOMOREFILES: There are no more entries to return.", message, args);
			case STG_E_DISKISWRITEPROTECTED:
				throw new COMStatus("STG_E_DISKISWRITEPROTECTED: Disk is write-protected.", message, args);
			case STG_E_SEEKERROR:
				throw new COMStatus("STG_E_SEEKERROR: An error occurred during a seek operation.", message, args);
			case STG_E_WRITEFAULT:
				throw new COMStatus("STG_E_WRITEFAULT: A disk error occurred during a write operation.", message, args);
			case STG_E_READFAULT:
				throw new COMStatus("STG_E_READFAULT: A disk error occurred during a read operation.", message, args);
			case STG_E_SHAREVIOLATION:
				throw new COMStatus("STG_E_SHAREVIOLATION: A share violation has occurred.", message, args);
			case STG_E_LOCKVIOLATION:
				throw new COMStatus("STG_E_LOCKVIOLATION: A lock violation has occurred.", message, args);
			case STG_E_FILEALREADYEXISTS:
				throw new COMStatus("STG_E_FILEALREADYEXISTS: %1 already exists.", message, args);
			case STG_E_INVALIDPARAMETER:
				throw new COMStatus("STG_E_INVALIDPARAMETER: Invalid parameter error.", message, args);
			case STG_E_MEDIUMFULL:
				throw new COMStatus("STG_E_MEDIUMFULL: There is insufficient disk space to complete operation.", message, args);
			case STG_E_PROPSETMISMATCHED:
				throw new COMStatus("STG_E_PROPSETMISMATCHED: Illegal write of non-simple property to simple property set.", message, args);
			case STG_E_ABNORMALAPIEXIT:
				throw new COMStatus("STG_E_ABNORMALAPIEXIT: An application programming interface (API) call exited abnormally.", message, args);
			case STG_E_INVALIDHEADER:
				throw new COMStatus("STG_E_INVALIDHEADER: The file %1 is not a valid compound file.", message, args);
			case STG_E_INVALIDNAME:
				throw new COMStatus("STG_E_INVALIDNAME: The name %1 is not valid.", message, args);
			case STG_E_UNKNOWN:
				throw new COMStatus("STG_E_UNKNOWN: An unexpected error occurred.", message, args);
			case STG_E_UNIMPLEMENTEDFUNCTION:
				throw new COMStatus("STG_E_UNIMPLEMENTEDFUNCTION: That function is not implemented.", message, args);
			case STG_E_INVALIDFLAG:
				throw new COMStatus("STG_E_INVALIDFLAG: Invalid flag error.", message, args);
			case STG_E_INUSE:
				throw new COMStatus("STG_E_INUSE: Attempted to use an object that is busy.", message, args);
			case STG_E_NOTCURRENT:
				throw new COMStatus("STG_E_NOTCURRENT: The storage has been changed since the last commit.", message, args);
			case STG_E_REVERTED:
				throw new COMStatus("STG_E_REVERTED: Attempted to use an object that has ceased to exist.", message, args);
			case STG_E_CANTSAVE:
				throw new COMStatus("STG_E_CANTSAVE: Cannot save.", message, args);
			case STG_E_OLDFORMAT:
				throw new COMStatus("STG_E_OLDFORMAT: The compound file %1 was produced with an incompatible version of storage.", message, args);
			case STG_E_OLDDLL:
				throw new COMStatus("STG_E_OLDDLL: The compound file %1 was produced with a newer version of storage.", message, args);
			case STG_E_SHAREREQUIRED:
				throw new COMStatus("STG_E_SHAREREQUIRED: Share.exe or equivalent is required for operation.", message, args);
			case STG_E_NOTFILEBASEDSTORAGE:
				throw new COMStatus("STG_E_NOTFILEBASEDSTORAGE: Illegal operation called on non-file based storage.", message, args);
			case STG_E_EXTANTMARSHALLINGS:
				throw new COMStatus("STG_E_EXTANTMARSHALLINGS: Illegal operation called on object with extant marshalings.", message, args);
			case STG_E_DOCFILECORRUPT:
				throw new COMStatus("STG_E_DOCFILECORRUPT: The docfile has been corrupted.", message, args);
			case STG_E_BADBASEADDRESS:
				throw new COMStatus("STG_E_BADBASEADDRESS: OLE32.DLL has been loaded at the wrong address.", message, args);
			case STG_E_DOCFILETOOLARGE:
				throw new COMStatus("STG_E_DOCFILETOOLARGE: The compound file is too large for the current implementation.", message, args);
			case STG_E_NOTSIMPLEFORMAT:
				throw new COMStatus("STG_E_NOTSIMPLEFORMAT: The compound file was not created with the STGM_SIMPLE flag.", message, args);
			case STG_E_INCOMPLETE:
				throw new COMStatus("STG_E_INCOMPLETE: The file download was aborted abnormally. The file is incomplete.", message, args);
			case STG_E_TERMINATED:
				throw new COMStatus("STG_E_TERMINATED: The file download has been terminated.", message, args);
			case STG_E_STATUS_COPY_PROTECTION_FAILURE:
				throw new COMStatus("STG_E_STATUS_COPY_PROTECTION_FAILURE: Generic Copy Protection Error.", message, args);
			case STG_E_CSS_AUTHENTICATION_FAILURE:
				throw new COMStatus("STG_E_CSS_AUTHENTICATION_FAILURE: Copy Protection Error—DVD CSS Authentication failed.", message, args);
			case STG_E_CSS_KEY_NOT_PRESENT:
				throw new COMStatus("STG_E_CSS_KEY_NOT_PRESENT: Copy Protection Error—The given sector does not have a valid CSS key.", message, args);
			case STG_E_CSS_KEY_NOT_ESTABLISHED:
				throw new COMStatus("STG_E_CSS_KEY_NOT_ESTABLISHED: Copy Protection Error—DVD session key not established.", message, args);
			case STG_E_CSS_SCRAMBLED_SECTOR:
				throw new COMStatus("STG_E_CSS_SCRAMBLED_SECTOR: Copy Protection Error—The read failed because the sector is encrypted.", message, args);
			case STG_E_CSS_REGION_MISMATCH:
				throw new COMStatus("STG_E_CSS_REGION_MISMATCH: Copy Protection Error—The current DVD's region does not correspond to the region setting of the drive.", message, args);
			case STG_E_RESETS_EXHAUSTED:
				throw new COMStatus("STG_E_RESETS_EXHAUSTED: Copy Protection Error—The drive's region setting may be permanent or the number of user resets has been exhausted.", message, args);
			case OLE_E_OLEVERB:
				throw new COMStatus("OLE_E_OLEVERB: Invalid OLEVERB structure.", message, args);
			case OLE_E_ADVF:
				throw new COMStatus("OLE_E_ADVF: Invalid advise flags.", message, args);
			case OLE_E_ENUM_NOMORE:
				throw new COMStatus("OLE_E_ENUM_NOMORE: Cannot enumerate any more because the associated data is missing.", message, args);
			case OLE_E_ADVISENOTSUPPORTED:
				throw new COMStatus("OLE_E_ADVISENOTSUPPORTED: This implementation does not take advises.", message, args);
			case OLE_E_NOCONNECTION:
				throw new COMStatus("OLE_E_NOCONNECTION: There is no connection for this connection ID.", message, args);
			case OLE_E_NOTRUNNING:
				throw new COMStatus("OLE_E_NOTRUNNING: Need to run the object to perform this operation.", message, args);
			case OLE_E_NOCACHE:
				throw new COMStatus("OLE_E_NOCACHE: There is no cache to operate on.", message, args);
			case OLE_E_BLANK:
				throw new COMStatus("OLE_E_BLANK: Uninitialized object.", message, args);
			case OLE_E_CLASSDIFF:
				throw new COMStatus("OLE_E_CLASSDIFF: Linked object's source class has changed.", message, args);
			case OLE_E_CANT_GETMONIKER:
				throw new COMStatus("OLE_E_CANT_GETMONIKER: Not able to get the moniker of the object.", message, args);
			case OLE_E_CANT_BINDTOSOURCE:
				throw new COMStatus("OLE_E_CANT_BINDTOSOURCE: Not able to bind to the source.", message, args);
			case OLE_E_STATIC:
				throw new COMStatus("OLE_E_STATIC: Object is static; operation not allowed.", message, args);
			case OLE_E_PROMPTSAVECANCELLED:
				throw new COMStatus("OLE_E_PROMPTSAVECANCELLED: User canceled out of the Save dialog box.", message, args);
			case OLE_E_INVALIDRECT:
				throw new COMStatus("OLE_E_INVALIDRECT: Invalid rectangle.", message, args);
			case OLE_E_WRONGCOMPOBJ:
				throw new COMStatus("OLE_E_WRONGCOMPOBJ: compobj.dll is too old for the ole2.dll initialized.", message, args);
			case OLE_E_INVALIDHWND:
				throw new COMStatus("OLE_E_INVALIDHWND: Invalid window handle.", message, args);
			case OLE_E_NOT_INPLACEACTIVE:
				throw new COMStatus("OLE_E_NOT_INPLACEACTIVE: Object is not in any of the inplace active states.", message, args);
			case OLE_E_CANTCONVERT:
				throw new COMStatus("OLE_E_CANTCONVERT: Not able to convert object.", message, args);
			case OLE_E_NOSTORAGE:
				throw new COMStatus("OLE_E_NOSTORAGE: Not able to perform the operation because object is not given storage yet.", message, args);
			case DV_E_FORMATETC:
				throw new COMStatus("DV_E_FORMATETC: Invalid FORMATETC structure.", message, args);
			case DV_E_DVTARGETDEVICE:
				throw new COMStatus("DV_E_DVTARGETDEVICE: Invalid DVTARGETDEVICE structure.", message, args);
			case DV_E_STGMEDIUM:
				throw new COMStatus("DV_E_STGMEDIUM: Invalid STDGMEDIUM structure.", message, args);
			case DV_E_STATDATA:
				throw new COMStatus("DV_E_STATDATA: Invalid STATDATA structure.", message, args);
			case DV_E_LINDEX:
				throw new COMStatus("DV_E_LINDEX: Invalid lindex.", message, args);
			case DV_E_TYMED:
				throw new COMStatus("DV_E_TYMED: Invalid TYMED structure.", message, args);
			case DV_E_CLIPFORMAT:
				throw new COMStatus("DV_E_CLIPFORMAT: Invalid clipboard format.", message, args);
			case DV_E_DVASPECT:
				throw new COMStatus("DV_E_DVASPECT: Invalid aspects.", message, args);
			case DV_E_DVTARGETDEVICE_SIZE:
				throw new COMStatus("DV_E_DVTARGETDEVICE_SIZE: The tdSize parameter of the DVTARGETDEVICE structure is invalid.", message, args);
			case DV_E_NOIVIEWOBJECT:
				throw new COMStatus("DV_E_NOIVIEWOBJECT: Object does not support IViewObject interface.", message, args);
			case DRAGDROP_E_NOTREGISTERED:
				throw new COMStatus("DRAGDROP_E_NOTREGISTERED: Trying to revoke a drop target that has not been registered.", message, args);
			case DRAGDROP_E_ALREADYREGISTERED:
				throw new COMStatus("DRAGDROP_E_ALREADYREGISTERED: This window has already been registered as a drop target.", message, args);
			case DRAGDROP_E_INVALIDHWND:
				throw new COMStatus("DRAGDROP_E_INVALIDHWND: Invalid window handle.", message, args);
			case CLASS_E_NOAGGREGATION:
				throw new COMStatus("CLASS_E_NOAGGREGATION: Class does not support aggregation (or class object is remote).", message, args);
			case CLASS_E_CLASSNOTAVAILABLE:
				throw new COMStatus("CLASS_E_CLASSNOTAVAILABLE: ClassFactory cannot supply requested class.", message, args);
			case CLASS_E_NOTLICENSED:
				throw new COMStatus("CLASS_E_NOTLICENSED: Class is not licensed for use.", message, args);
			case VIEW_E_DRAW:
				throw new COMStatus("VIEW_E_DRAW: Error drawing view.", message, args);
			case REGDB_E_READREGDB:
				throw new COMStatus("REGDB_E_READREGDB: Could not read key from registry.", message, args);
			case REGDB_E_WRITEREGDB:
				throw new COMStatus("REGDB_E_WRITEREGDB: Could not write key to registry.", message, args);
			case REGDB_E_KEYMISSING:
				throw new COMStatus("REGDB_E_KEYMISSING: Could not find the key in the registry.", message, args);
			case REGDB_E_INVALIDVALUE:
				throw new COMStatus("REGDB_E_INVALIDVALUE: Invalid value for registry.", message, args);
			case REGDB_E_CLASSNOTREG:
				throw new COMStatus("REGDB_E_CLASSNOTREG: Class not registered.", message, args);
			case REGDB_E_IIDNOTREG:
				throw new COMStatus("REGDB_E_IIDNOTREG: Interface not registered.", message, args);
			case REGDB_E_BADTHREADINGMODEL:
				throw new COMStatus("REGDB_E_BADTHREADINGMODEL: Threading model entry is not valid.", message, args);
			case CAT_E_CATIDNOEXIST:
				throw new COMStatus("CAT_E_CATIDNOEXIST: CATID does not exist.", message, args);
			case CAT_E_NODESCRIPTION:
				throw new COMStatus("CAT_E_NODESCRIPTION: Description not found.", message, args);
			case CS_E_PACKAGE_NOTFOUND:
				throw new COMStatus("CS_E_PACKAGE_NOTFOUND: No package in the software installation data in Active Directory meets this criteria.", message, args);
			case CS_E_NOT_DELETABLE:
				throw new COMStatus("CS_E_NOT_DELETABLE: Deleting this will break the referential integrity of the software installation data in Active Directory.", message, args);
			case CS_E_CLASS_NOTFOUND:
				throw new COMStatus("CS_E_CLASS_NOTFOUND: The CLSID was not found in the software installation data in Active Directory.", message, args);
			case CS_E_INVALID_VERSION:
				throw new COMStatus("CS_E_INVALID_VERSION: The software installation data in Active Directory is corrupt.", message, args);
			case CS_E_NO_CLASSSTORE:
				throw new COMStatus("CS_E_NO_CLASSSTORE: There is no software installation data in Active Directory.", message, args);
			case CS_E_OBJECT_NOTFOUND:
				throw new COMStatus("CS_E_OBJECT_NOTFOUND: There is no software installation data object in Active Directory.", message, args);
			case CS_E_OBJECT_ALREADY_EXISTS:
				throw new COMStatus("CS_E_OBJECT_ALREADY_EXISTS: The software installation data object in Active Directory already exists.", message, args);
			case CS_E_INVALID_PATH:
				throw new COMStatus("CS_E_INVALID_PATH: The path to the software installation data in Active Directory is not correct.", message, args);
			case CS_E_NETWORK_ERROR:
				throw new COMStatus("CS_E_NETWORK_ERROR: A network error interrupted the operation.", message, args);
			case CS_E_ADMIN_LIMIT_EXCEEDED:
				throw new COMStatus("CS_E_ADMIN_LIMIT_EXCEEDED: The size of this object exceeds the maximum size set by the administrator.", message, args);
			case CS_E_SCHEMA_MISMATCH:
				throw new COMStatus("CS_E_SCHEMA_MISMATCH: The schema for the software installation data in Active Directory does not match the required schema.", message, args);
			case CS_E_INTERNAL_ERROR:
				throw new COMStatus("CS_E_INTERNAL_ERROR: An error occurred in the software installation data in Active Directory.", message, args);
			case CACHE_E_NOCACHE_UPDATED:
				throw new COMStatus("CACHE_E_NOCACHE_UPDATED: Cache not updated.", message, args);
			case OLEOBJ_E_NOVERBS:
				throw new COMStatus("OLEOBJ_E_NOVERBS: No verbs for OLE object.", message, args);
			case OLEOBJ_E_INVALIDVERB:
				throw new COMStatus("OLEOBJ_E_INVALIDVERB: Invalid verb for OLE object.", message, args);
			case INPLACE_E_NOTUNDOABLE:
				throw new COMStatus("INPLACE_E_NOTUNDOABLE: Undo is not available.", message, args);
			case INPLACE_E_NOTOOLSPACE:
				throw new COMStatus("INPLACE_E_NOTOOLSPACE: Space for tools is not available.", message, args);
			case CONVERT10_E_OLESTREAM_GET:
				throw new COMStatus("CONVERT10_E_OLESTREAM_GET: OLESTREAM Get method failed.", message, args);
			case CONVERT10_E_OLESTREAM_PUT:
				throw new COMStatus("CONVERT10_E_OLESTREAM_PUT: OLESTREAM Put method failed.", message, args);
			case CONVERT10_E_OLESTREAM_FMT:
				throw new COMStatus("CONVERT10_E_OLESTREAM_FMT: Contents of the OLESTREAM not in correct format.", message, args);
			case CONVERT10_E_OLESTREAM_BITMAP_TO_DIB:
				throw new COMStatus("CONVERT10_E_OLESTREAM_BITMAP_TO_DIB: There was an error in a Windows GDI call while converting the bitmap to a device-independent bitmap (DIB).", message, args);
			case CONVERT10_E_STG_FMT:
				throw new COMStatus("CONVERT10_E_STG_FMT: Contents of the IStorage not in correct format.", message, args);
			case CONVERT10_E_STG_NO_STD_STREAM:
				throw new COMStatus("CONVERT10_E_STG_NO_STD_STREAM: Contents of IStorage is missing one of the standard streams.", message, args);
			case CONVERT10_E_STG_DIB_TO_BITMAP:
				throw new COMStatus("CONVERT10_E_STG_DIB_TO_BITMAP: There was an error in a Windows Graphics Device Interface (GDI) call while converting the DIB to a bitmap.", message, args);
			case CLIPBRD_E_CANT_OPEN:
				throw new COMStatus("CLIPBRD_E_CANT_OPEN: OpenClipboard failed.", message, args);
			case CLIPBRD_E_CANT_EMPTY:
				throw new COMStatus("CLIPBRD_E_CANT_EMPTY: EmptyClipboard failed.", message, args);
			case CLIPBRD_E_CANT_SET:
				throw new COMStatus("CLIPBRD_E_CANT_SET: SetClipboard failed.", message, args);
			case CLIPBRD_E_BAD_DATA:
				throw new COMStatus("CLIPBRD_E_BAD_DATA: Data on clipboard is invalid.", message, args);
			case CLIPBRD_E_CANT_CLOSE:
				throw new COMStatus("CLIPBRD_E_CANT_CLOSE: CloseClipboard failed.", message, args);
			case MK_E_CONNECTMANUALLY:
				throw new COMStatus("MK_E_CONNECTMANUALLY: Moniker needs to be connected manually.", message, args);
			case MK_E_EXCEEDEDDEADLINE:
				throw new COMStatus("MK_E_EXCEEDEDDEADLINE: Operation exceeded deadline.", message, args);
			case MK_E_NEEDGENERIC:
				throw new COMStatus("MK_E_NEEDGENERIC: Moniker needs to be generic.", message, args);
			case MK_E_UNAVAILABLE:
				throw new COMStatus("MK_E_UNAVAILABLE: Operation unavailable.", message, args);
			case MK_E_SYNTAX:
				throw new COMStatus("MK_E_SYNTAX: Invalid syntax.", message, args);
			case MK_E_NOOBJECT:
				throw new COMStatus("MK_E_NOOBJECT: No object for moniker.", message, args);
			case MK_E_INVALIDEXTENSION:
				throw new COMStatus("MK_E_INVALIDEXTENSION: Bad extension for file.", message, args);
			case MK_E_INTERMEDIATEINTERFACENOTSUPPORTED:
				throw new COMStatus("MK_E_INTERMEDIATEINTERFACENOTSUPPORTED: Intermediate operation failed.", message, args);
			case MK_E_NOTBINDABLE:
				throw new COMStatus("MK_E_NOTBINDABLE: Moniker is not bindable.", message, args);
			case MK_E_NOTBOUND:
				throw new COMStatus("MK_E_NOTBOUND: Moniker is not bound.", message, args);
			case MK_E_CANTOPENFILE:
				throw new COMStatus("MK_E_CANTOPENFILE: Moniker cannot open file.", message, args);
			case MK_E_MUSTBOTHERUSER:
				throw new COMStatus("MK_E_MUSTBOTHERUSER: User input required for operation to succeed.", message, args);
			case MK_E_NOINVERSE:
				throw new COMStatus("MK_E_NOINVERSE: Moniker class has no inverse.", message, args);
			case MK_E_NOSTORAGE:
				throw new COMStatus("MK_E_NOSTORAGE: Moniker does not refer to storage.", message, args);
			case MK_E_NOPREFIX:
				throw new COMStatus("MK_E_NOPREFIX: No common prefix.", message, args);
			case MK_E_ENUMERATION_FAILED:
				throw new COMStatus("MK_E_ENUMERATION_FAILED: Moniker could not be enumerated.", message, args);
			case CO_E_NOTINITIALIZED:
				throw new COMStatus("CO_E_NOTINITIALIZED: CoInitialize has not been called.", message, args);
			case CO_E_ALREADYINITIALIZED:
				throw new COMStatus("CO_E_ALREADYINITIALIZED: CoInitialize has already been called.", message, args);
			case CO_E_CANTDETERMINECLASS:
				throw new COMStatus("CO_E_CANTDETERMINECLASS: Class of object cannot be determined.", message, args);
			case CO_E_CLASSSTRING:
				throw new COMStatus("CO_E_CLASSSTRING: Invalid class string.", message, args);
			case CO_E_IIDSTRING:
				throw new COMStatus("CO_E_IIDSTRING: Invalid interface string.", message, args);
			case CO_E_APPNOTFOUND:
				throw new COMStatus("CO_E_APPNOTFOUND: Application not found.", message, args);
			case CO_E_APPSINGLEUSE:
				throw new COMStatus("CO_E_APPSINGLEUSE: Application cannot be run more than once.", message, args);
			case CO_E_ERRORINAPP:
				throw new COMStatus("CO_E_ERRORINAPP: Some error in application.", message, args);
			case CO_E_DLLNOTFOUND:
				throw new COMStatus("CO_E_DLLNOTFOUND: DLL for class not found.", message, args);
			case CO_E_ERRORINDLL:
				throw new COMStatus("CO_E_ERRORINDLL: Error in the DLL.", message, args);
			case CO_E_WRONGOSFORAPP:
				throw new COMStatus("CO_E_WRONGOSFORAPP: Wrong operating system or operating system version for application.", message, args);
			case CO_E_OBJNOTREG:
				throw new COMStatus("CO_E_OBJNOTREG: Object is not registered.", message, args);
			case CO_E_OBJISREG:
				throw new COMStatus("CO_E_OBJISREG: Object is already registered.", message, args);
			case CO_E_OBJNOTCONNECTED:
				throw new COMStatus("CO_E_OBJNOTCONNECTED: Object is not connected to server.", message, args);
			case CO_E_APPDIDNTREG:
				throw new COMStatus("CO_E_APPDIDNTREG: Application was launched, but it did not register a class factory.", message, args);
			case CO_E_RELEASED:
				throw new COMStatus("CO_E_RELEASED: Object has been released.", message, args);
			case EVENT_E_ALL_SUBSCRIBERS_FAILED:
				throw new COMStatus("EVENT_E_ALL_SUBSCRIBERS_FAILED: An event was unable to invoke any of the subscribers.", message, args);
			case EVENT_E_QUERYSYNTAX:
				throw new COMStatus("EVENT_E_QUERYSYNTAX: A syntax error occurred trying to evaluate a query string.", message, args);
			case EVENT_E_QUERYFIELD:
				throw new COMStatus("EVENT_E_QUERYFIELD: An invalid field name was used in a query string.", message, args);
			case EVENT_E_INTERNALEXCEPTION:
				throw new COMStatus("EVENT_E_INTERNALEXCEPTION: An unexpected exception was raised.", message, args);
			case EVENT_E_INTERNALERROR:
				throw new COMStatus("EVENT_E_INTERNALERROR: An unexpected internal error was detected.", message, args);
			case EVENT_E_INVALID_PER_USER_SID:
				throw new COMStatus("EVENT_E_INVALID_PER_USER_SID: The owner security identifier (SID) on a per-user subscription does not exist.", message, args);
			case EVENT_E_USER_EXCEPTION:
				throw new COMStatus("EVENT_E_USER_EXCEPTION: A user-supplied component or subscriber raised an exception.", message, args);
			case EVENT_E_TOO_MANY_METHODS:
				throw new COMStatus("EVENT_E_TOO_MANY_METHODS: An interface has too many methods to fire events from.", message, args);
			case EVENT_E_MISSING_EVENTCLASS:
				throw new COMStatus("EVENT_E_MISSING_EVENTCLASS: A subscription cannot be stored unless its event class already exists.", message, args);
			case EVENT_E_NOT_ALL_REMOVED:
				throw new COMStatus("EVENT_E_NOT_ALL_REMOVED: Not all the objects requested could be removed.", message, args);
			case EVENT_E_COMPLUS_NOT_INSTALLED:
				throw new COMStatus("EVENT_E_COMPLUS_NOT_INSTALLED: COM+ is required for this operation, but it is not installed.", message, args);
			case EVENT_E_CANT_MODIFY_OR_DELETE_UNCONFIGURED_OBJECT:
				throw new COMStatus("EVENT_E_CANT_MODIFY_OR_DELETE_UNCONFIGURED_OBJECT: Cannot modify or delete an object that was not added using the COM+ Administrative SDK.", message, args);
			case EVENT_E_CANT_MODIFY_OR_DELETE_CONFIGURED_OBJECT:
				throw new COMStatus("EVENT_E_CANT_MODIFY_OR_DELETE_CONFIGURED_OBJECT: Cannot modify or delete an object that was added using the COM+ Administrative SDK.", message, args);
			case EVENT_E_INVALID_EVENT_CLASS_PARTITION:
				throw new COMStatus("EVENT_E_INVALID_EVENT_CLASS_PARTITION: The event class for this subscription is in an invalid partition.", message, args);
			case EVENT_E_PER_USER_SID_NOT_LOGGED_ON:
				throw new COMStatus("EVENT_E_PER_USER_SID_NOT_LOGGED_ON: The owner of the PerUser subscription is not logged on to the system specified.", message, args);
			case SCHED_E_TRIGGER_NOT_FOUND:
				throw new COMStatus("SCHED_E_TRIGGER_NOT_FOUND: Trigger not found.", message, args);
			case SCHED_E_TASK_NOT_READY:
				throw new COMStatus("SCHED_E_TASK_NOT_READY: One or more of the properties that are needed to run this task have not been set.", message, args);
			case SCHED_E_TASK_NOT_RUNNING:
				throw new COMStatus("SCHED_E_TASK_NOT_RUNNING: There is no running instance of the task.", message, args);
			case SCHED_E_SERVICE_NOT_INSTALLED:
				throw new COMStatus("SCHED_E_SERVICE_NOT_INSTALLED: The Task Scheduler service is not installed on this computer.", message, args);
			case SCHED_E_CANNOT_OPEN_TASK:
				throw new COMStatus("SCHED_E_CANNOT_OPEN_TASK: The task object could not be opened.", message, args);
			case SCHED_E_INVALID_TASK:
				throw new COMStatus("SCHED_E_INVALID_TASK: The object is either an invalid task object or is not a task object.", message, args);
			case SCHED_E_ACCOUNT_INFORMATION_NOT_SET:
				throw new COMStatus("SCHED_E_ACCOUNT_INFORMATION_NOT_SET: No account information could be found in the Task Scheduler security database for the task indicated.", message, args);
			case SCHED_E_ACCOUNT_NAME_NOT_FOUND:
				throw new COMStatus("SCHED_E_ACCOUNT_NAME_NOT_FOUND: Unable to establish existence of the account specified.", message, args);
			case SCHED_E_ACCOUNT_DBASE_CORRUPT:
				throw new COMStatus("SCHED_E_ACCOUNT_DBASE_CORRUPT: Corruption was detected in the Task Scheduler security database; the database has been reset.", message, args);
			case SCHED_E_NO_SECURITY_SERVICES:
				throw new COMStatus("SCHED_E_NO_SECURITY_SERVICES: Task Scheduler security services are available only on Windows NT operating system.", message, args);
			case SCHED_E_UNKNOWN_OBJECT_VERSION:
				throw new COMStatus("SCHED_E_UNKNOWN_OBJECT_VERSION: The task object version is either unsupported or invalid.", message, args);
			case SCHED_E_UNSUPPORTED_ACCOUNT_OPTION:
				throw new COMStatus("SCHED_E_UNSUPPORTED_ACCOUNT_OPTION: The task has been configured with an unsupported combination of account settings and run-time options.", message, args);
			case SCHED_E_SERVICE_NOT_RUNNING:
				throw new COMStatus("SCHED_E_SERVICE_NOT_RUNNING: The Task Scheduler service is not running.", message, args);
			case SCHED_E_UNEXPECTEDNODE:
				throw new COMStatus("SCHED_E_UNEXPECTEDNODE: The task XML contains an unexpected node.", message, args);
			case SCHED_E_NAMESPACE:
				throw new COMStatus("SCHED_E_NAMESPACE: The task XML contains an element or attribute from an unexpected namespace.", message, args);
			case SCHED_E_INVALIDVALUE:
				throw new COMStatus("SCHED_E_INVALIDVALUE: The task XML contains a value that is incorrectly formatted or out of range.", message, args);
			case SCHED_E_MISSINGNODE:
				throw new COMStatus("SCHED_E_MISSINGNODE: The task XML is missing a required element or attribute.", message, args);
			case SCHED_E_MALFORMEDXML:
				throw new COMStatus("SCHED_E_MALFORMEDXML: The task XML is malformed.", message, args);
			case SCHED_E_TOO_MANY_NODES:
				throw new COMStatus("SCHED_E_TOO_MANY_NODES: The task XML contains too many nodes of the same type.", message, args);
			case SCHED_E_PAST_END_BOUNDARY:
				throw new COMStatus("SCHED_E_PAST_END_BOUNDARY: The task cannot be started after the trigger's end boundary.", message, args);
			case SCHED_E_ALREADY_RUNNING:
				throw new COMStatus("SCHED_E_ALREADY_RUNNING: An instance of this task is already running.", message, args);
			case SCHED_E_USER_NOT_LOGGED_ON:
				throw new COMStatus("SCHED_E_USER_NOT_LOGGED_ON: The task will not run because the user is not logged on.", message, args);
			case SCHED_E_INVALID_TASK_HASH:
				throw new COMStatus("SCHED_E_INVALID_TASK_HASH: The task image is corrupt or has been tampered with.", message, args);
			case SCHED_E_SERVICE_NOT_AVAILABLE:
				throw new COMStatus("SCHED_E_SERVICE_NOT_AVAILABLE: The Task Scheduler service is not available.", message, args);
			case SCHED_E_SERVICE_TOO_BUSY:
				throw new COMStatus("SCHED_E_SERVICE_TOO_BUSY: The Task Scheduler service is too busy to handle your request. Try again later.", message, args);
			case SCHED_E_TASK_ATTEMPTED:
				throw new COMStatus("SCHED_E_TASK_ATTEMPTED: The Task Scheduler service attempted to run the task, but the task did not run due to one of the constraints in the task definition.", message, args);
			case XACT_E_ALREADYOTHERSINGLEPHASE:
				throw new COMStatus("XACT_E_ALREADYOTHERSINGLEPHASE: Another single phase resource manager has already been enlisted in this transaction.", message, args);
			case XACT_E_CANTRETAIN:
				throw new COMStatus("XACT_E_CANTRETAIN: A retaining commit or abort is not supported.", message, args);
			case XACT_E_COMMITFAILED:
				throw new COMStatus("XACT_E_COMMITFAILED: The transaction failed to commit for an unknown reason. The transaction was aborted.", message, args);
			case XACT_E_COMMITPREVENTED:
				throw new COMStatus("XACT_E_COMMITPREVENTED: Cannot call commit on this transaction object because the calling application did not initiate the transaction.", message, args);
			case XACT_E_HEURISTICABORT:
				throw new COMStatus("XACT_E_HEURISTICABORT: Instead of committing, the resource heuristically aborted.", message, args);
			case XACT_E_HEURISTICCOMMIT:
				throw new COMStatus("XACT_E_HEURISTICCOMMIT: Instead of aborting, the resource heuristically committed.", message, args);
			case XACT_E_HEURISTICDAMAGE:
				throw new COMStatus("XACT_E_HEURISTICDAMAGE: Some of the states of the resource were committed while others were aborted, likely because of heuristic decisions.", message, args);
			case XACT_E_HEURISTICDANGER:
				throw new COMStatus("XACT_E_HEURISTICDANGER: Some of the states of the resource may have been committed while others may have been aborted, likely because of heuristic decisions.", message, args);
			case XACT_E_ISOLATIONLEVEL:
				throw new COMStatus("XACT_E_ISOLATIONLEVEL: The requested isolation level is not valid or supported.", message, args);
			case XACT_E_NOASYNC:
				throw new COMStatus("XACT_E_NOASYNC: The transaction manager does not support an asynchronous operation for this method.", message, args);
			case XACT_E_NOENLIST:
				throw new COMStatus("XACT_E_NOENLIST: Unable to enlist in the transaction.", message, args);
			case XACT_E_NOISORETAIN:
				throw new COMStatus("XACT_E_NOISORETAIN: The requested semantics of retention of isolation across retaining commit and abort boundaries cannot be supported by this transaction implementation, or isoFlags was not equal to 0.", message, args);
			case XACT_E_NORESOURCE:
				throw new COMStatus("XACT_E_NORESOURCE: There is no resource presently associated with this enlistment.", message, args);
			case XACT_E_NOTCURRENT:
				throw new COMStatus("XACT_E_NOTCURRENT: The transaction failed to commit due to the failure of optimistic concurrency control in at least one of the resource managers.", message, args);
			case XACT_E_NOTRANSACTION:
				throw new COMStatus("XACT_E_NOTRANSACTION: The transaction has already been implicitly or explicitly committed or aborted.", message, args);
			case XACT_E_NOTSUPPORTED:
				throw new COMStatus("XACT_E_NOTSUPPORTED: An invalid combination of flags was specified.", message, args);
			case XACT_E_UNKNOWNRMGRID:
				throw new COMStatus("XACT_E_UNKNOWNRMGRID: The resource manager ID is not associated with this transaction or the transaction manager.", message, args);
			case XACT_E_WRONGSTATE:
				throw new COMStatus("XACT_E_WRONGSTATE: This method was called in the wrong state.", message, args);
			case XACT_E_WRONGUOW:
				throw new COMStatus("XACT_E_WRONGUOW: The indicated unit of work does not match the unit of work expected by the resource manager.", message, args);
			case XACT_E_XTIONEXISTS:
				throw new COMStatus("XACT_E_XTIONEXISTS: An enlistment in a transaction already exists.", message, args);
			case XACT_E_NOIMPORTOBJECT:
				throw new COMStatus("XACT_E_NOIMPORTOBJECT: An import object for the transaction could not be found.", message, args);
			case XACT_E_INVALIDCOOKIE:
				throw new COMStatus("XACT_E_INVALIDCOOKIE: The transaction cookie is invalid.", message, args);
			case XACT_E_INDOUBT:
				throw new COMStatus("XACT_E_INDOUBT: The transaction status is in doubt. A communication failure occurred, or a transaction manager or resource manager has failed.", message, args);
			case XACT_E_NOTIMEOUT:
				throw new COMStatus("XACT_E_NOTIMEOUT: A time-out was specified, but time-outs are not supported.", message, args);
			case XACT_E_ALREADYINPROGRESS:
				throw new COMStatus("XACT_E_ALREADYINPROGRESS: The requested operation is already in progress for the transaction.", message, args);
			case XACT_E_ABORTED:
				throw new COMStatus("XACT_E_ABORTED: The transaction has already been aborted.", message, args);
			case XACT_E_LOGFULL:
				throw new COMStatus("XACT_E_LOGFULL: The Transaction Manager returned a log full error.", message, args);
			case XACT_E_TMNOTAVAILABLE:
				throw new COMStatus("XACT_E_TMNOTAVAILABLE: The transaction manager is not available.", message, args);
			case XACT_E_CONNECTION_DOWN:
				throw new COMStatus("XACT_E_CONNECTION_DOWN: A connection with the transaction manager was lost.", message, args);
			case XACT_E_CONNECTION_DENIED:
				throw new COMStatus("XACT_E_CONNECTION_DENIED: A request to establish a connection with the transaction manager was denied.", message, args);
			case XACT_E_REENLISTTIMEOUT:
				throw new COMStatus("XACT_E_REENLISTTIMEOUT: Resource manager reenlistment to determine transaction status timed out.", message, args);
			case XACT_E_TIP_CONNECT_FAILED:
				throw new COMStatus("XACT_E_TIP_CONNECT_FAILED: The transaction manager failed to establish a connection with another Transaction Internet Protocol (TIP) transaction manager.", message, args);
			case XACT_E_TIP_PROTOCOL_ERROR:
				throw new COMStatus("XACT_E_TIP_PROTOCOL_ERROR: The transaction manager encountered a protocol error with another TIP transaction manager.", message, args);
			case XACT_E_TIP_PULL_FAILED:
				throw new COMStatus("XACT_E_TIP_PULL_FAILED: The transaction manager could not propagate a transaction from another TIP transaction manager.", message, args);
			case XACT_E_DEST_TMNOTAVAILABLE:
				throw new COMStatus("XACT_E_DEST_TMNOTAVAILABLE: The transaction manager on the destination machine is not available.", message, args);
			case XACT_E_TIP_DISABLED:
				throw new COMStatus("XACT_E_TIP_DISABLED: The transaction manager has disabled its support for TIP.", message, args);
			case XACT_E_NETWORK_TX_DISABLED:
				throw new COMStatus("XACT_E_NETWORK_TX_DISABLED: The transaction manager has disabled its support for remote or network transactions.", message, args);
			case XACT_E_PARTNER_NETWORK_TX_DISABLED:
				throw new COMStatus("XACT_E_PARTNER_NETWORK_TX_DISABLED: The partner transaction manager has disabled its support for remote or network transactions.", message, args);
			case XACT_E_XA_TX_DISABLED:
				throw new COMStatus("XACT_E_XA_TX_DISABLED: The transaction manager has disabled its support for XA transactions.", message, args);
			case XACT_E_UNABLE_TO_READ_DTC_CONFIG:
				throw new COMStatus("XACT_E_UNABLE_TO_READ_DTC_CONFIG: Microsoft Distributed Transaction Coordinator (MSDTC) was unable to read its configuration information.", message, args);
			case XACT_E_UNABLE_TO_LOAD_DTC_PROXY:
				throw new COMStatus("XACT_E_UNABLE_TO_LOAD_DTC_PROXY: MSDTC was unable to load the DTC proxy DLL.", message, args);
			case XACT_E_ABORTING:
				throw new COMStatus("XACT_E_ABORTING: The local transaction has aborted.", message, args);
			case XACT_E_CLERKNOTFOUND:
				throw new COMStatus("XACT_E_CLERKNOTFOUND: The specified CRM clerk was not found. It may have completed before it could be held.", message, args);
			case XACT_E_CLERKEXISTS:
				throw new COMStatus("XACT_E_CLERKEXISTS: The specified CRM clerk does not exist.", message, args);
			case XACT_E_RECOVERYINPROGRESS:
				throw new COMStatus("XACT_E_RECOVERYINPROGRESS: Recovery of the CRM log file is still in progress.", message, args);
			case XACT_E_TRANSACTIONCLOSED:
				throw new COMStatus("XACT_E_TRANSACTIONCLOSED: The transaction has completed, and the log records have been discarded from the log file. They are no longer available.", message, args);
			case XACT_E_INVALIDLSN:
				throw new COMStatus("XACT_E_INVALIDLSN: lsnToRead is outside of the current limits of the log", message, args);
			case XACT_E_REPLAYREQUEST:
				throw new COMStatus("XACT_E_REPLAYREQUEST: The COM+ Compensating Resource Manager has records it wishes to replay.", message, args);
			case XACT_E_CONNECTION_REQUEST_DENIED:
				throw new COMStatus("XACT_E_CONNECTION_REQUEST_DENIED: The request to connect to the specified transaction coordinator was denied.", message, args);
			case XACT_E_TOOMANY_ENLISTMENTS:
				throw new COMStatus("XACT_E_TOOMANY_ENLISTMENTS: The maximum number of enlistments for the specified transaction has been reached.", message, args);
			case XACT_E_DUPLICATE_GUID:
				throw new COMStatus("XACT_E_DUPLICATE_GUID: A resource manager with the same identifier is already registered with the specified transaction coordinator.", message, args);
			case XACT_E_NOTSINGLEPHASE:
				throw new COMStatus("XACT_E_NOTSINGLEPHASE: The prepare request given was not eligible for single-phase optimizations.", message, args);
			case XACT_E_RECOVERYALREADYDONE:
				throw new COMStatus("XACT_E_RECOVERYALREADYDONE: RecoveryComplete has already been called for the given resource manager.", message, args);
			case XACT_E_PROTOCOL:
				throw new COMStatus("XACT_E_PROTOCOL: The interface call made was incorrect for the current state of the protocol.", message, args);
			case XACT_E_RM_FAILURE:
				throw new COMStatus("XACT_E_RM_FAILURE: The xa_open call failed for the XA resource.", message, args);
			case XACT_E_RECOVERY_FAILED:
				throw new COMStatus("XACT_E_RECOVERY_FAILED: The xa_recover call failed for the XA resource.", message, args);
			case XACT_E_LU_NOT_FOUND:
				throw new COMStatus("XACT_E_LU_NOT_FOUND: The logical unit of work specified cannot be found.", message, args);
			case XACT_E_DUPLICATE_LU:
				throw new COMStatus("XACT_E_DUPLICATE_LU: The specified logical unit of work already exists.", message, args);
			case XACT_E_LU_NOT_CONNECTED:
				throw new COMStatus("XACT_E_LU_NOT_CONNECTED: Subordinate creation failed. The specified logical unit of work was not connected.", message, args);
			case XACT_E_DUPLICATE_TRANSID:
				throw new COMStatus("XACT_E_DUPLICATE_TRANSID: A transaction with the given identifier already exists.", message, args);
			case XACT_E_LU_BUSY:
				throw new COMStatus("XACT_E_LU_BUSY: The resource is in use.", message, args);
			case XACT_E_LU_NO_RECOVERY_PROCESS:
				throw new COMStatus("XACT_E_LU_NO_RECOVERY_PROCESS: The LU Recovery process is down.", message, args);
			case XACT_E_LU_DOWN:
				throw new COMStatus("XACT_E_LU_DOWN: The remote session was lost.", message, args);
			case XACT_E_LU_RECOVERING:
				throw new COMStatus("XACT_E_LU_RECOVERING: The resource is currently recovering.", message, args);
			case XACT_E_LU_RECOVERY_MISMATCH:
				throw new COMStatus("XACT_E_LU_RECOVERY_MISMATCH: There was a mismatch in driving recovery.", message, args);
			case XACT_E_RM_UNAVAILABLE:
				throw new COMStatus("XACT_E_RM_UNAVAILABLE: An error occurred with the XA resource.", message, args);
			case CONTEXT_E_ABORTED:
				throw new COMStatus("CONTEXT_E_ABORTED: The root transaction wanted to commit, but the transaction aborted.", message, args);
			case CONTEXT_E_ABORTING:
				throw new COMStatus("CONTEXT_E_ABORTING: The COM+ component on which the method call was made has a transaction that has already aborted or is in the process of aborting.", message, args);
			case CONTEXT_E_NOCONTEXT:
				throw new COMStatus("CONTEXT_E_NOCONTEXT: There is no Microsoft Transaction Server (MTS) object context.", message, args);
			case CONTEXT_E_WOULD_DEADLOCK:
				throw new COMStatus("CONTEXT_E_WOULD_DEADLOCK: The component is configured to use synchronization, and this method call would cause a deadlock to occur.", message, args);
			case CONTEXT_E_SYNCH_TIMEOUT:
				throw new COMStatus("CONTEXT_E_SYNCH_TIMEOUT: The component is configured to use synchronization, and a thread has timed out waiting to enter the context.", message, args);
			case CONTEXT_E_OLDREF:
				throw new COMStatus("CONTEXT_E_OLDREF: You made a method call on a COM+ component that has a transaction that has already committed or aborted.", message, args);
			case CONTEXT_E_ROLENOTFOUND:
				throw new COMStatus("CONTEXT_E_ROLENOTFOUND: The specified role was not configured for the application.", message, args);
			case CONTEXT_E_TMNOTAVAILABLE:
				throw new COMStatus("CONTEXT_E_TMNOTAVAILABLE: COM+ was unable to talk to the MSDTC.", message, args);
			case CO_E_ACTIVATIONFAILED:
				throw new COMStatus("CO_E_ACTIVATIONFAILED: An unexpected error occurred during COM+ activation.", message, args);
			case CO_E_ACTIVATIONFAILED_EVENTLOGGED:
				throw new COMStatus("CO_E_ACTIVATIONFAILED_EVENTLOGGED: COM+ activation failed. Check the event log for more information.", message, args);
			case CO_E_ACTIVATIONFAILED_CATALOGERROR:
				throw new COMStatus("CO_E_ACTIVATIONFAILED_CATALOGERROR: COM+ activation failed due to a catalog or configuration error.", message, args);
			case CO_E_ACTIVATIONFAILED_TIMEOUT:
				throw new COMStatus("CO_E_ACTIVATIONFAILED_TIMEOUT: COM+ activation failed because the activation could not be completed in the specified amount of time.", message, args);
			case CO_E_INITIALIZATIONFAILED:
				throw new COMStatus("CO_E_INITIALIZATIONFAILED: COM+ activation failed because an initialization function failed. Check the event log for more information.", message, args);
			case CONTEXT_E_NOJIT:
				throw new COMStatus("CONTEXT_E_NOJIT: The requested operation requires that just-in-time (JIT) be in the current context, and it is not.", message, args);
			case CONTEXT_E_NOTRANSACTION:
				throw new COMStatus("CONTEXT_E_NOTRANSACTION: The requested operation requires that the current context have a transaction, and it does not.", message, args);
			case CO_E_THREADINGMODEL_CHANGED:
				throw new COMStatus("CO_E_THREADINGMODEL_CHANGED: The components threading model has changed after install into a COM+ application. Re-install component.", message, args);
			case CO_E_NOIISINTRINSICS:
				throw new COMStatus("CO_E_NOIISINTRINSICS: Internet Information Services (IIS) intrinsics not available. Start your work with IIS.", message, args);
			case CO_E_NOCOOKIES:
				throw new COMStatus("CO_E_NOCOOKIES: An attempt to write a cookie failed.", message, args);
			case CO_E_DBERROR:
				throw new COMStatus("CO_E_DBERROR: An attempt to use a database generated a database-specific error.", message, args);
			case CO_E_NOTPOOLED:
				throw new COMStatus("CO_E_NOTPOOLED: The COM+ component you created must use object pooling to work.", message, args);
			case CO_E_NOTCONSTRUCTED:
				throw new COMStatus("CO_E_NOTCONSTRUCTED: The COM+ component you created must use object construction to work correctly.", message, args);
			case CO_E_NOSYNCHRONIZATION:
				throw new COMStatus("CO_E_NOSYNCHRONIZATION: The COM+ component requires synchronization, and it is not configured for it.", message, args);
			case CO_E_ISOLEVELMISMATCH:
				throw new COMStatus("CO_E_ISOLEVELMISMATCH: The TxIsolation Level property for the COM+ component being created is stronger than the TxIsolationLevel for the root.", message, args);
			case CO_E_CALL_OUT_OF_TX_SCOPE_NOT_ALLOWED:
				throw new COMStatus("CO_E_CALL_OUT_OF_TX_SCOPE_NOT_ALLOWED: The component attempted to make a cross-context call between invocations of EnterTransactionScope and ExitTransactionScope. This is not allowed. Cross-context calls cannot be made while inside a transaction scope.", message, args);
			case CO_E_EXIT_TRANSACTION_SCOPE_NOT_CALLED:
				throw new COMStatus("CO_E_EXIT_TRANSACTION_SCOPE_NOT_CALLED: The component made a call to EnterTransactionScope, but did not make a corresponding call to ExitTransactionScope before returning.", message, args);
			case E_ACCESSDENIED:
				throw new COMStatus("E_ACCESSDENIED: General access denied error.", message, args);
			case E_OUTOFMEMORY:
				throw new COMStatus("E_OUTOFMEMORY: The server does not have enough memory for the new channel.", message, args);
			case ERROR_NOT_SUPPORTED:
				throw new COMStatus("ERROR_NOT_SUPPORTED: The server cannot support a client request for a dynamic virtual channel.", message, args);
			case E_INVALIDARG:
				throw new COMStatus("E_INVALIDARG: One or more arguments are invalid.", message, args);
			case CO_E_CLASS_CREATE_FAILED:
				throw new COMStatus("CO_E_CLASS_CREATE_FAILED: Attempt to create a class object failed.", message, args);
			case CO_E_SCM_ERROR:
				throw new COMStatus("CO_E_SCM_ERROR: OLE service could not bind object.", message, args);
			case CO_E_SCM_RPC_FAILURE:
				throw new COMStatus("CO_E_SCM_RPC_FAILURE: RPC communication failed with OLE service.", message, args);
			case CO_E_BAD_PATH:
				throw new COMStatus("CO_E_BAD_PATH: Bad path to object.", message, args);
			case CO_E_SERVER_EXEC_FAILURE:
				throw new COMStatus("CO_E_SERVER_EXEC_FAILURE: Server execution failed.", message, args);
			case CO_E_OBJSRV_RPC_FAILURE:
				throw new COMStatus("CO_E_OBJSRV_RPC_FAILURE: OLE service could not communicate with the object server.", message, args);
			case MK_E_NO_NORMALIZED:
				throw new COMStatus("MK_E_NO_NORMALIZED: Moniker path could not be normalized.", message, args);
			case CO_E_SERVER_STOPPING:
				throw new COMStatus("CO_E_SERVER_STOPPING: Object server is stopping when OLE service contacts it.", message, args);
			case MEM_E_INVALID_ROOT:
				throw new COMStatus("MEM_E_INVALID_ROOT: An invalid root block pointer was specified.", message, args);
			case MEM_E_INVALID_LINK:
				throw new COMStatus("MEM_E_INVALID_LINK: An allocation chain contained an invalid link pointer.", message, args);
			case MEM_E_INVALID_SIZE:
				throw new COMStatus("MEM_E_INVALID_SIZE: The requested allocation size was too large.", message, args);
			case CO_E_MISSING_DISPLAYNAME:
				throw new COMStatus("CO_E_MISSING_DISPLAYNAME: The activation requires a display name to be present under the class identifier (CLSID) key.", message, args);
			case CO_E_RUNAS_VALUE_MUST_BE_AAA:
				throw new COMStatus("CO_E_RUNAS_VALUE_MUST_BE_AAA: The activation requires that the RunAs value for the application is Activate As Activator.", message, args);
			case CO_E_ELEVATION_DISABLED:
				throw new COMStatus("CO_E_ELEVATION_DISABLED: The class is not configured to support elevated activation.", message, args);
			case NTE_BAD_UID:
				throw new COMStatus("NTE_BAD_UID: Bad UID.", message, args);
			case NTE_BAD_HASH:
				throw new COMStatus("NTE_BAD_HASH: Bad hash.", message, args);
			case NTE_BAD_KEY:
				throw new COMStatus("NTE_BAD_KEY: Bad key.", message, args);
			case NTE_BAD_LEN:
				throw new COMStatus("NTE_BAD_LEN: Bad length.", message, args);
			case NTE_BAD_DATA:
				throw new COMStatus("NTE_BAD_DATA: Bad data.", message, args);
			case NTE_BAD_SIGNATURE:
				throw new COMStatus("NTE_BAD_SIGNATURE: Invalid signature.", message, args);
			case NTE_BAD_VER:
				throw new COMStatus("NTE_BAD_VER: Bad version of provider.", message, args);
			case NTE_BAD_ALGID:
				throw new COMStatus("NTE_BAD_ALGID: Invalid algorithm specified.", message, args);
			case NTE_BAD_FLAGS:
				throw new COMStatus("NTE_BAD_FLAGS: Invalid flags specified.", message, args);
			case NTE_BAD_TYPE:
				throw new COMStatus("NTE_BAD_TYPE: Invalid type specified.", message, args);
			case NTE_BAD_KEY_STATE:
				throw new COMStatus("NTE_BAD_KEY_STATE: Key not valid for use in specified state.", message, args);
			case NTE_BAD_HASH_STATE:
				throw new COMStatus("NTE_BAD_HASH_STATE: Hash not valid for use in specified state.", message, args);
			case NTE_NO_KEY:
				throw new COMStatus("NTE_NO_KEY: Key does not exist.", message, args);
			case NTE_NO_MEMORY:
				throw new COMStatus("NTE_NO_MEMORY: Insufficient memory available for the operation.", message, args);
			case NTE_EXISTS:
				throw new COMStatus("NTE_EXISTS: Object already exists.", message, args);
			case NTE_PERM:
				throw new COMStatus("NTE_PERM: Access denied.", message, args);
			case NTE_NOT_FOUND:
				throw new COMStatus("NTE_NOT_FOUND: Object was not found.", message, args);
			case NTE_DOUBLE_ENCRYPT:
				throw new COMStatus("NTE_DOUBLE_ENCRYPT: Data already encrypted.", message, args);
			case NTE_BAD_PROVIDER:
				throw new COMStatus("NTE_BAD_PROVIDER: Invalid provider specified.", message, args);
			case NTE_BAD_PROV_TYPE:
				throw new COMStatus("NTE_BAD_PROV_TYPE: Invalid provider type specified.", message, args);
			case NTE_BAD_PUBLIC_KEY:
				throw new COMStatus("NTE_BAD_PUBLIC_KEY: Provider's public key is invalid.", message, args);
			case NTE_BAD_KEYSET:
				throw new COMStatus("NTE_BAD_KEYSET: Key set does not exist.", message, args);
			case NTE_PROV_TYPE_NOT_DEF:
				throw new COMStatus("NTE_PROV_TYPE_NOT_DEF: Provider type not defined.", message, args);
			case NTE_PROV_TYPE_ENTRY_BAD:
				throw new COMStatus("NTE_PROV_TYPE_ENTRY_BAD: The provider type, as registered, is invalid.", message, args);
			case NTE_KEYSET_NOT_DEF:
				throw new COMStatus("NTE_KEYSET_NOT_DEF: The key set is not defined.", message, args);
			case NTE_KEYSET_ENTRY_BAD:
				throw new COMStatus("NTE_KEYSET_ENTRY_BAD: The key set, as registered, is invalid.", message, args);
			case NTE_PROV_TYPE_NO_MATCH:
				throw new COMStatus("NTE_PROV_TYPE_NO_MATCH: Provider type does not match registered value.", message, args);
			case NTE_SIGNATURE_FILE_BAD:
				throw new COMStatus("NTE_SIGNATURE_FILE_BAD: The digital signature file is corrupt.", message, args);
			case NTE_PROVIDER_DLL_FAIL:
				throw new COMStatus("NTE_PROVIDER_DLL_FAIL: Provider DLL failed to initialize correctly.", message, args);
			case NTE_PROV_DLL_NOT_FOUND:
				throw new COMStatus("NTE_PROV_DLL_NOT_FOUND: Provider DLL could not be found.", message, args);
			case NTE_BAD_KEYSET_PARAM:
				throw new COMStatus("NTE_BAD_KEYSET_PARAM: The keyset parameter is invalid.", message, args);
			case NTE_FAIL:
				throw new COMStatus("NTE_FAIL: An internal error occurred.", message, args);
			case NTE_SYS_ERR:
				throw new COMStatus("NTE_SYS_ERR: A base error occurred.", message, args);
			case NTE_SILENT_CONTEXT:
				throw new COMStatus("NTE_SILENT_CONTEXT: Provider could not perform the action because the context was acquired as silent.", message, args);
			case NTE_TOKEN_KEYSET_STORAGE_FULL:
				throw new COMStatus("NTE_TOKEN_KEYSET_STORAGE_FULL: The security token does not have storage space available for an additional container.", message, args);
			case NTE_TEMPORARY_PROFILE:
				throw new COMStatus("NTE_TEMPORARY_PROFILE: The profile for the user is a temporary profile.", message, args);
			case NTE_FIXEDPARAMETER:
				throw new COMStatus("NTE_FIXEDPARAMETER: The key parameters could not be set because the configuration service provider (CSP) uses fixed parameters.", message, args);
			case NTE_INVALID_HANDLE:
				throw new COMStatus("NTE_INVALID_HANDLE: The supplied handle is invalid.", message, args);
			case NTE_INVALID_PARAMETER:
				throw new COMStatus("NTE_INVALID_PARAMETER: The parameter is incorrect.", message, args);
			case NTE_BUFFER_TOO_SMALL:
				throw new COMStatus("NTE_BUFFER_TOO_SMALL: The buffer supplied to a function was too small.", message, args);
			case NTE_NOT_SUPPORTED:
				throw new COMStatus("NTE_NOT_SUPPORTED: The requested operation is not supported.", message, args);
			case NTE_NO_MORE_ITEMS:
				throw new COMStatus("NTE_NO_MORE_ITEMS: No more data is available.", message, args);
			case NTE_BUFFERS_OVERLAP:
				throw new COMStatus("NTE_BUFFERS_OVERLAP: The supplied buffers overlap incorrectly.", message, args);
			case NTE_DECRYPTION_FAILURE:
				throw new COMStatus("NTE_DECRYPTION_FAILURE: The specified data could not be decrypted.", message, args);
			case NTE_INTERNAL_ERROR:
				throw new COMStatus("NTE_INTERNAL_ERROR: An internal consistency check failed.", message, args);
			case NTE_UI_REQUIRED:
				throw new COMStatus("NTE_UI_REQUIRED: This operation requires input from the user.", message, args);
			case NTE_HMAC_NOT_SUPPORTED:
				throw new COMStatus("NTE_HMAC_NOT_SUPPORTED: The cryptographic provider does not support Hash Message Authentication Code (HMAC).", message, args);
			case SEC_E_INSUFFICIENT_MEMORY:
				throw new COMStatus("SEC_E_INSUFFICIENT_MEMORY: Not enough memory is available to complete this request.", message, args);
			case SEC_E_INVALID_HANDLE:
				throw new COMStatus("SEC_E_INVALID_HANDLE: The handle specified is invalid.", message, args);
			case SEC_E_UNSUPPORTED_FUNCTION:
				throw new COMStatus("SEC_E_UNSUPPORTED_FUNCTION: The function requested is not supported.", message, args);
			case SEC_E_TARGET_UNKNOWN:
				throw new COMStatus("SEC_E_TARGET_UNKNOWN: The specified target is unknown or unreachable.", message, args);
			case SEC_E_INTERNAL_ERROR:
				throw new COMStatus("SEC_E_INTERNAL_ERROR: The Local Security Authority (LSA) cannot be contacted.", message, args);
			case SEC_E_SECPKG_NOT_FOUND:
				throw new COMStatus("SEC_E_SECPKG_NOT_FOUND: The requested security package does not exist.", message, args);
			case SEC_E_NOT_OWNER:
				throw new COMStatus("SEC_E_NOT_OWNER: The caller is not the owner of the desired credentials.", message, args);
			case SEC_E_CANNOT_INSTALL:
				throw new COMStatus("SEC_E_CANNOT_INSTALL: The security package failed to initialize and cannot be installed.", message, args);
			case SEC_E_INVALID_TOKEN:
				throw new COMStatus("SEC_E_INVALID_TOKEN: The token supplied to the function is invalid.", message, args);
			case SEC_E_CANNOT_PACK:
				throw new COMStatus("SEC_E_CANNOT_PACK: The security package is not able to marshal the logon buffer, so the logon attempt has failed.", message, args);
			case SEC_E_QOP_NOT_SUPPORTED:
				throw new COMStatus("SEC_E_QOP_NOT_SUPPORTED: The per-message quality of protection is not supported by the security package.", message, args);
			case SEC_E_NO_IMPERSONATION:
				throw new COMStatus("SEC_E_NO_IMPERSONATION: The security context does not allow impersonation of the client.", message, args);
			case SEC_E_LOGON_DENIED:
				throw new COMStatus("SEC_E_LOGON_DENIED: The logon attempt failed.", message, args);
			case SEC_E_UNKNOWN_CREDENTIALS:
				throw new COMStatus("SEC_E_UNKNOWN_CREDENTIALS: The credentials supplied to the package were not recognized.", message, args);
			case SEC_E_NO_CREDENTIALS:
				throw new COMStatus("SEC_E_NO_CREDENTIALS: No credentials are available in the security package.", message, args);
			case SEC_E_MESSAGE_ALTERED:
				throw new COMStatus("SEC_E_MESSAGE_ALTERED: The message or signature supplied for verification has been altered.", message, args);
			case SEC_E_OUT_OF_SEQUENCE:
				throw new COMStatus("SEC_E_OUT_OF_SEQUENCE: The message supplied for verification is out of sequence.", message, args);
			case SEC_E_NO_AUTHENTICATING_AUTHORITY:
				throw new COMStatus("SEC_E_NO_AUTHENTICATING_AUTHORITY: No authority could be contacted for authentication.", message, args);
			case SEC_E_BAD_PKGID:
				throw new COMStatus("SEC_E_BAD_PKGID: The requested security package does not exist.", message, args);
			case SEC_E_CONTEXT_EXPIRED:
				throw new COMStatus("SEC_E_CONTEXT_EXPIRED: The context has expired and can no longer be used.", message, args);
			case SEC_E_INCOMPLETE_MESSAGE:
				throw new COMStatus("SEC_E_INCOMPLETE_MESSAGE: The supplied message is incomplete. The signature was not verified.", message, args);
			case SEC_E_INCOMPLETE_CREDENTIALS:
				throw new COMStatus("SEC_E_INCOMPLETE_CREDENTIALS: The credentials supplied were not complete and could not be verified. The context could not be initialized.", message, args);
			case SEC_E_BUFFER_TOO_SMALL:
				throw new COMStatus("SEC_E_BUFFER_TOO_SMALL: The buffers supplied to a function was too small.", message, args);
			case SEC_E_WRONG_PRINCIPAL:
				throw new COMStatus("SEC_E_WRONG_PRINCIPAL: The target principal name is incorrect.", message, args);
			case SEC_E_TIME_SKEW:
				throw new COMStatus("SEC_E_TIME_SKEW: The clocks on the client and server machines are skewed.", message, args);
			case SEC_E_UNTRUSTED_ROOT:
				throw new COMStatus("SEC_E_UNTRUSTED_ROOT: The certificate chain was issued by an authority that is not trusted.", message, args);
			case SEC_E_ILLEGAL_MESSAGE:
				throw new COMStatus("SEC_E_ILLEGAL_MESSAGE: The message received was unexpected or badly formatted.", message, args);
			case SEC_E_CERT_UNKNOWN:
				throw new COMStatus("SEC_E_CERT_UNKNOWN: An unknown error occurred while processing the certificate.", message, args);
			case SEC_E_CERT_EXPIRED:
				throw new COMStatus("SEC_E_CERT_EXPIRED: The received certificate has expired.", message, args);
			case SEC_E_ENCRYPT_FAILURE:
				throw new COMStatus("SEC_E_ENCRYPT_FAILURE: The specified data could not be encrypted.", message, args);
			case SEC_E_DECRYPT_FAILURE:
				throw new COMStatus("SEC_E_DECRYPT_FAILURE: The specified data could not be decrypted.", message, args);
			case SEC_E_ALGORITHM_MISMATCH:
				throw new COMStatus("SEC_E_ALGORITHM_MISMATCH: The client and server cannot communicate because they do not possess a common algorithm.", message, args);
			case SEC_E_SECURITY_QOS_FAILED:
				throw new COMStatus("SEC_E_SECURITY_QOS_FAILED: The security context could not be established due to a failure in the requested quality of service (for example, mutual authentication or delegation).", message, args);
			case SEC_E_UNFINISHED_CONTEXT_DELETED:
				throw new COMStatus("SEC_E_UNFINISHED_CONTEXT_DELETED: A security context was deleted before the context was completed. This is considered a logon failure.", message, args);
			case SEC_E_NO_TGT_REPLY:
				throw new COMStatus("SEC_E_NO_TGT_REPLY: The client is trying to negotiate a context and the server requires user-to-user but did not send a ticket granting ticket (TGT) reply.", message, args);
			case SEC_E_NO_IP_ADDRESSES:
				throw new COMStatus("SEC_E_NO_IP_ADDRESSES: Unable to accomplish the requested task because the local machine does not have an IP addresses.", message, args);
			case SEC_E_WRONG_CREDENTIAL_HANDLE:
				throw new COMStatus("SEC_E_WRONG_CREDENTIAL_HANDLE: The supplied credential handle does not match the credential associated with the security context.", message, args);
			case SEC_E_CRYPTO_SYSTEM_INVALID:
				throw new COMStatus("SEC_E_CRYPTO_SYSTEM_INVALID: The cryptographic system or checksum function is invalid because a required function is unavailable.", message, args);
			case SEC_E_MAX_REFERRALS_EXCEEDED:
				throw new COMStatus("SEC_E_MAX_REFERRALS_EXCEEDED: The number of maximum ticket referrals has been exceeded.", message, args);
			case SEC_E_MUST_BE_KDC:
				throw new COMStatus("SEC_E_MUST_BE_KDC: The local machine must be a Kerberos domain controller (KDC), and it is not.", message, args);
			case SEC_E_STRONG_CRYPTO_NOT_SUPPORTED:
				throw new COMStatus("SEC_E_STRONG_CRYPTO_NOT_SUPPORTED: The other end of the security negotiation requires strong cryptographics, but it is not supported on the local machine.", message, args);
			case SEC_E_TOO_MANY_PRINCIPALS:
				throw new COMStatus("SEC_E_TOO_MANY_PRINCIPALS: The KDC reply contained more than one principal name.", message, args);
			case SEC_E_NO_PA_DATA:
				throw new COMStatus("SEC_E_NO_PA_DATA: Expected to find PA data for a hint of what etype to use, but it was not found.", message, args);
			case SEC_E_PKINIT_NAME_MISMATCH:
				throw new COMStatus("SEC_E_PKINIT_NAME_MISMATCH: The client certificate does not contain a valid user principal name (UPN), or does not match the client name in the logon request. Contact your administrator.", message, args);
			case SEC_E_SMARTCARD_LOGON_REQUIRED:
				throw new COMStatus("SEC_E_SMARTCARD_LOGON_REQUIRED: Smart card logon is required and was not used.", message, args);
			case SEC_E_SHUTDOWN_IN_PROGRESS:
				throw new COMStatus("SEC_E_SHUTDOWN_IN_PROGRESS: A system shutdown is in progress.", message, args);
			case SEC_E_KDC_INVALID_REQUEST:
				throw new COMStatus("SEC_E_KDC_INVALID_REQUEST: An invalid request was sent to the KDC.", message, args);
			case SEC_E_KDC_UNABLE_TO_REFER:
				throw new COMStatus("SEC_E_KDC_UNABLE_TO_REFER: The KDC was unable to generate a referral for the service requested.", message, args);
			case SEC_E_KDC_UNKNOWN_ETYPE:
				throw new COMStatus("SEC_E_KDC_UNKNOWN_ETYPE: The encryption type requested is not supported by the KDC.", message, args);
			case SEC_E_UNSUPPORTED_PREAUTH:
				throw new COMStatus("SEC_E_UNSUPPORTED_PREAUTH: An unsupported pre-authentication mechanism was presented to the Kerberos package.", message, args);
			case SEC_E_DELEGATION_REQUIRED:
				throw new COMStatus("SEC_E_DELEGATION_REQUIRED: The requested operation cannot be completed. The computer must be trusted for delegation, and the current user account must be configured to allow delegation.", message, args);
			case SEC_E_BAD_BINDINGS:
				throw new COMStatus("SEC_E_BAD_BINDINGS: Client's supplied Security Support Provider Interface (SSPI) channel bindings were incorrect.", message, args);
			case SEC_E_MULTIPLE_ACCOUNTS:
				throw new COMStatus("SEC_E_MULTIPLE_ACCOUNTS: The received certificate was mapped to multiple accounts.", message, args);
			case SEC_E_NO_KERB_KEY:
				throw new COMStatus("SEC_E_NO_KERB_KEY: No Kerberos key was found.", message, args);
			case SEC_E_CERT_WRONG_USAGE:
				throw new COMStatus("SEC_E_CERT_WRONG_USAGE: The certificate is not valid for the requested usage.", message, args);
			case SEC_E_DOWNGRADE_DETECTED:
				throw new COMStatus("SEC_E_DOWNGRADE_DETECTED: The system detected a possible attempt to compromise security. Ensure that you can contact the server that authenticated you.", message, args);
			case SEC_E_SMARTCARD_CERT_REVOKED:
				throw new COMStatus("SEC_E_SMARTCARD_CERT_REVOKED: The smart card certificate used for authentication has been revoked. Contact your system administrator. The event log may contain additional information.", message, args);
			case SEC_E_ISSUING_CA_UNTRUSTED:
				throw new COMStatus("SEC_E_ISSUING_CA_UNTRUSTED: An untrusted certification authority (CA) was detected while processing the smart card certificate used for authentication. Contact your system administrator.", message, args);
			case SEC_E_REVOCATION_OFFLINE_C:
				throw new COMStatus("SEC_E_REVOCATION_OFFLINE_C: The revocation status of the smart card certificate used for authentication could not be determined. Contact your system administrator.", message, args);
			case SEC_E_PKINIT_CLIENT_FAILURE:
				throw new COMStatus("SEC_E_PKINIT_CLIENT_FAILURE: The smart card certificate used for authentication was not trusted. Contact your system administrator.", message, args);
			case SEC_E_SMARTCARD_CERT_EXPIRED:
				throw new COMStatus("SEC_E_SMARTCARD_CERT_EXPIRED: The smart card certificate used for authentication has expired. Contact your system administrator.", message, args);
			case SEC_E_NO_S4U_PROT_SUPPORT:
				throw new COMStatus("SEC_E_NO_S4U_PROT_SUPPORT: The Kerberos subsystem encountered an error. A service for user protocol requests was made against a domain controller that does not support services for users.", message, args);
			case SEC_E_CROSSREALM_DELEGATION_FAILURE:
				throw new COMStatus("SEC_E_CROSSREALM_DELEGATION_FAILURE: An attempt was made by this server to make a Kerberos-constrained delegation request for a target outside the server's realm. This is not supported and indicates a misconfiguration on this server's allowed-to-delegate-to list. Contact your administrator.", message, args);
			case SEC_E_REVOCATION_OFFLINE_KDC:
				throw new COMStatus("SEC_E_REVOCATION_OFFLINE_KDC: The revocation status of the domain controller certificate used for smart card authentication could not be determined. The system event log contains additional information. Contact your system administrator.", message, args);
			case SEC_E_ISSUING_CA_UNTRUSTED_KDC:
				throw new COMStatus("SEC_E_ISSUING_CA_UNTRUSTED_KDC: An untrusted CA was detected while processing the domain controller certificate used for authentication. The system event log contains additional information. Contact your system administrator.", message, args);
			case SEC_E_KDC_CERT_EXPIRED:
				throw new COMStatus("SEC_E_KDC_CERT_EXPIRED: The domain controller certificate used for smart card logon has expired. Contact your system administrator with the contents of your system event log.", message, args);
			case SEC_E_KDC_CERT_REVOKED:
				throw new COMStatus("SEC_E_KDC_CERT_REVOKED: The domain controller certificate used for smart card logon has been revoked. Contact your system administrator with the contents of your system event log.", message, args);
			case SEC_E_INVALID_PARAMETER:
				throw new COMStatus("SEC_E_INVALID_PARAMETER: One or more of the parameters passed to the function were invalid.", message, args);
			case SEC_E_DELEGATION_POLICY:
				throw new COMStatus("SEC_E_DELEGATION_POLICY: The client policy does not allow credential delegation to the target server.", message, args);
			case SEC_E_POLICY_NLTM_ONLY:
				throw new COMStatus("SEC_E_POLICY_NLTM_ONLY: The client policy does not allow credential delegation to the target server with NLTM only authentication.", message, args);
			case CRYPT_E_MSG_ERROR:
				throw new COMStatus("CRYPT_E_MSG_ERROR: An error occurred while performing an operation on a cryptographic message.", message, args);
			case CRYPT_E_UNKNOWN_ALGO:
				throw new COMStatus("CRYPT_E_UNKNOWN_ALGO: Unknown cryptographic algorithm.", message, args);
			case CRYPT_E_OID_FORMAT:
				throw new COMStatus("CRYPT_E_OID_FORMAT: The object identifier is poorly formatted.", message, args);
			case CRYPT_E_INVALID_MSG_TYPE:
				throw new COMStatus("CRYPT_E_INVALID_MSG_TYPE: Invalid cryptographic message type.", message, args);
			case CRYPT_E_UNEXPECTED_ENCODING:
				throw new COMStatus("CRYPT_E_UNEXPECTED_ENCODING: Unexpected cryptographic message encoding.", message, args);
			case CRYPT_E_AUTH_ATTR_MISSING:
				throw new COMStatus("CRYPT_E_AUTH_ATTR_MISSING: The cryptographic message does not contain an expected authenticated attribute.", message, args);
			case CRYPT_E_HASH_VALUE:
				throw new COMStatus("CRYPT_E_HASH_VALUE: The hash value is not correct.", message, args);
			case CRYPT_E_INVALID_INDEX:
				throw new COMStatus("CRYPT_E_INVALID_INDEX: The index value is not valid.", message, args);
			case CRYPT_E_ALREADY_DECRYPTED:
				throw new COMStatus("CRYPT_E_ALREADY_DECRYPTED: The content of the cryptographic message has already been decrypted.", message, args);
			case CRYPT_E_NOT_DECRYPTED:
				throw new COMStatus("CRYPT_E_NOT_DECRYPTED: The content of the cryptographic message has not been decrypted yet.", message, args);
			case CRYPT_E_RECIPIENT_NOT_FOUND:
				throw new COMStatus("CRYPT_E_RECIPIENT_NOT_FOUND: The enveloped-data message does not contain the specified recipient.", message, args);
			case CRYPT_E_CONTROL_TYPE:
				throw new COMStatus("CRYPT_E_CONTROL_TYPE: Invalid control type.", message, args);
			case CRYPT_E_ISSUER_SERIALNUMBER:
				throw new COMStatus("CRYPT_E_ISSUER_SERIALNUMBER: Invalid issuer or serial number.", message, args);
			case CRYPT_E_SIGNER_NOT_FOUND:
				throw new COMStatus("CRYPT_E_SIGNER_NOT_FOUND: Cannot find the original signer.", message, args);
			case CRYPT_E_ATTRIBUTES_MISSING:
				throw new COMStatus("CRYPT_E_ATTRIBUTES_MISSING: The cryptographic message does not contain all of the requested attributes.", message, args);
			case CRYPT_E_STREAM_MSG_NOT_READY:
				throw new COMStatus("CRYPT_E_STREAM_MSG_NOT_READY: The streamed cryptographic message is not ready to return data.", message, args);
			case CRYPT_E_STREAM_INSUFFICIENT_DATA:
				throw new COMStatus("CRYPT_E_STREAM_INSUFFICIENT_DATA: The streamed cryptographic message requires more data to complete the decode operation.", message, args);
			case CRYPT_E_BAD_LEN:
				throw new COMStatus("CRYPT_E_BAD_LEN: The length specified for the output data was insufficient.", message, args);
			case CRYPT_E_BAD_ENCODE:
				throw new COMStatus("CRYPT_E_BAD_ENCODE: An error occurred during the encode or decode operation.", message, args);
			case CRYPT_E_FILE_ERROR:
				throw new COMStatus("CRYPT_E_FILE_ERROR: An error occurred while reading or writing to a file.", message, args);
			case CRYPT_E_NOT_FOUND:
				throw new COMStatus("CRYPT_E_NOT_FOUND: Cannot find object or property.", message, args);
			case CRYPT_E_EXISTS:
				throw new COMStatus("CRYPT_E_EXISTS: The object or property already exists.", message, args);
			case CRYPT_E_NO_PROVIDER:
				throw new COMStatus("CRYPT_E_NO_PROVIDER: No provider was specified for the store or object.", message, args);
			case CRYPT_E_SELF_SIGNED:
				throw new COMStatus("CRYPT_E_SELF_SIGNED: The specified certificate is self-signed.", message, args);
			case CRYPT_E_DELETED_PREV:
				throw new COMStatus("CRYPT_E_DELETED_PREV: The previous certificate or certificate revocation list (CRL) context was deleted.", message, args);
			case CRYPT_E_NO_MATCH:
				throw new COMStatus("CRYPT_E_NO_MATCH: Cannot find the requested object.", message, args);
			case CRYPT_E_UNEXPECTED_MSG_TYPE:
				throw new COMStatus("CRYPT_E_UNEXPECTED_MSG_TYPE: The certificate does not have a property that references a private key.", message, args);
			case CRYPT_E_NO_KEY_PROPERTY:
				throw new COMStatus("CRYPT_E_NO_KEY_PROPERTY: Cannot find the certificate and private key for decryption.", message, args);
			case CRYPT_E_NO_DECRYPT_CERT:
				throw new COMStatus("CRYPT_E_NO_DECRYPT_CERT: Cannot find the certificate and private key to use for decryption.", message, args);
			case CRYPT_E_BAD_MSG:
				throw new COMStatus("CRYPT_E_BAD_MSG: Not a cryptographic message or the cryptographic message is not formatted correctly.", message, args);
			case CRYPT_E_NO_SIGNER:
				throw new COMStatus("CRYPT_E_NO_SIGNER: The signed cryptographic message does not have a signer for the specified signer index.", message, args);
			case CRYPT_E_PENDING_CLOSE:
				throw new COMStatus("CRYPT_E_PENDING_CLOSE: Final closure is pending until additional frees or closes.", message, args);
			case CRYPT_E_REVOKED:
				throw new COMStatus("CRYPT_E_REVOKED: The certificate is revoked.", message, args);
			case CRYPT_E_NO_REVOCATION_DLL:
				throw new COMStatus("CRYPT_E_NO_REVOCATION_DLL: No DLL or exported function was found to verify revocation.", message, args);
			case CRYPT_E_NO_REVOCATION_CHECK:
				throw new COMStatus("CRYPT_E_NO_REVOCATION_CHECK: The revocation function was unable to check revocation for the certificate.", message, args);
			case CRYPT_E_REVOCATION_OFFLINE:
				throw new COMStatus("CRYPT_E_REVOCATION_OFFLINE: The revocation function was unable to check revocation because the revocation server was offline.", message, args);
			case CRYPT_E_NOT_IN_REVOCATION_DATABASE:
				throw new COMStatus("CRYPT_E_NOT_IN_REVOCATION_DATABASE: The certificate is not in the revocation server's database.", message, args);
			case CRYPT_E_INVALID_NUMERIC_STRING:
				throw new COMStatus("CRYPT_E_INVALID_NUMERIC_STRING: The string contains a non-numeric character.", message, args);
			case CRYPT_E_INVALID_PRINTABLE_STRING:
				throw new COMStatus("CRYPT_E_INVALID_PRINTABLE_STRING: The string contains a nonprintable character.", message, args);
			case CRYPT_E_INVALID_IA5_STRING:
				throw new COMStatus("CRYPT_E_INVALID_IA5_STRING: The string contains a character not in the 7-bit ASCII character set.", message, args);
			case CRYPT_E_INVALID_X500_STRING:
				throw new COMStatus("CRYPT_E_INVALID_X500_STRING: The string contains an invalid X500 name attribute key, object identifier (OID), value, or delimiter.", message, args);
			case CRYPT_E_NOT_CHAR_STRING:
				throw new COMStatus("CRYPT_E_NOT_CHAR_STRING: The dwValueType for the CERT_NAME_VALUE is not one of the character strings. Most likely it is either a CERT_RDN_ENCODED_BLOB or CERT_TDN_OCTED_STRING.", message, args);
			case CRYPT_E_FILERESIZED:
				throw new COMStatus("CRYPT_E_FILERESIZED: The Put operation cannot continue. The file needs to be resized. However, there is already a signature present. A complete signing operation must be done.", message, args);
			case CRYPT_E_SECURITY_SETTINGS:
				throw new COMStatus("CRYPT_E_SECURITY_SETTINGS: The cryptographic operation failed due to a local security option setting.", message, args);
			case CRYPT_E_NO_VERIFY_USAGE_DLL:
				throw new COMStatus("CRYPT_E_NO_VERIFY_USAGE_DLL: No DLL or exported function was found to verify subject usage.", message, args);
			case CRYPT_E_NO_VERIFY_USAGE_CHECK:
				throw new COMStatus("CRYPT_E_NO_VERIFY_USAGE_CHECK: The called function was unable to perform a usage check on the subject.", message, args);
			case CRYPT_E_VERIFY_USAGE_OFFLINE:
				throw new COMStatus("CRYPT_E_VERIFY_USAGE_OFFLINE: The called function was unable to complete the usage check because the server was offline.", message, args);
			case CRYPT_E_NOT_IN_CTL:
				throw new COMStatus("CRYPT_E_NOT_IN_CTL: The subject was not found in a certificate trust list (CTL).", message, args);
			case CRYPT_E_NO_TRUSTED_SIGNER:
				throw new COMStatus("CRYPT_E_NO_TRUSTED_SIGNER: None of the signers of the cryptographic message or certificate trust list is trusted.", message, args);
			case CRYPT_E_MISSING_PUBKEY_PARA:
				throw new COMStatus("CRYPT_E_MISSING_PUBKEY_PARA: The public key's algorithm parameters are missing.", message, args);
			case CRYPT_E_OSS_ERROR:
				throw new COMStatus("CRYPT_E_OSS_ERROR: OSS Certificate encode/decode error code base.", message, args);
			case OSS_MORE_BUF:
				throw new COMStatus("OSS_MORE_BUF: OSS ASN.1 Error: Output Buffer is too small.", message, args);
			case OSS_NEGATIVE_UINTEGER:
				throw new COMStatus("OSS_NEGATIVE_UINTEGER: OSS ASN.1 Error: Signed integer is encoded as a unsigned integer.", message, args);
			case OSS_PDU_RANGE:
				throw new COMStatus("OSS_PDU_RANGE: OSS ASN.1 Error: Unknown ASN.1 data type.", message, args);
			case OSS_MORE_INPUT:
				throw new COMStatus("OSS_MORE_INPUT: OSS ASN.1 Error: Output buffer is too small; the decoded data has been truncated.", message, args);
			case OSS_DATA_ERROR:
				throw new COMStatus("OSS_DATA_ERROR: OSS ASN.1 Error: Invalid data.", message, args);
			case OSS_BAD_ARG:
				throw new COMStatus("OSS_BAD_ARG: OSS ASN.1 Error: Invalid argument.", message, args);
			case OSS_BAD_VERSION:
				throw new COMStatus("OSS_BAD_VERSION: OSS ASN.1 Error: Encode/Decode version mismatch.", message, args);
			case OSS_OUT_MEMORY:
				throw new COMStatus("OSS_OUT_MEMORY: OSS ASN.1 Error: Out of memory.", message, args);
			case OSS_PDU_MISMATCH:
				throw new COMStatus("OSS_PDU_MISMATCH: OSS ASN.1 Error: Encode/Decode error.", message, args);
			case OSS_LIMITED:
				throw new COMStatus("OSS_LIMITED: OSS ASN.1 Error: Internal error.", message, args);
			case OSS_BAD_PTR:
				throw new COMStatus("OSS_BAD_PTR: OSS ASN.1 Error: Invalid data.", message, args);
			case OSS_BAD_TIME:
				throw new COMStatus("OSS_BAD_TIME: OSS ASN.1 Error: Invalid data.", message, args);
			case OSS_INDEFINITE_NOT_SUPPORTED:
				throw new COMStatus("OSS_INDEFINITE_NOT_SUPPORTED: OSS ASN.1 Error: Unsupported BER indefinite-length encoding.", message, args);
			case OSS_MEM_ERROR:
				throw new COMStatus("OSS_MEM_ERROR: OSS ASN.1 Error: Access violation.", message, args);
			case OSS_BAD_TABLE:
				throw new COMStatus("OSS_BAD_TABLE: OSS ASN.1 Error: Invalid data.", message, args);
			case OSS_TOO_LONG:
				throw new COMStatus("OSS_TOO_LONG: OSS ASN.1 Error: Invalid data.", message, args);
			case OSS_CONSTRAINT_VIOLATED:
				throw new COMStatus("OSS_CONSTRAINT_VIOLATED: OSS ASN.1 Error: Invalid data.", message, args);
			case OSS_FATAL_ERROR:
				throw new COMStatus("OSS_FATAL_ERROR: OSS ASN.1 Error: Internal error.", message, args);
			case OSS_ACCESS_SERIALIZATION_ERROR:
				throw new COMStatus("OSS_ACCESS_SERIALIZATION_ERROR: OSS ASN.1 Error: Multithreading conflict.", message, args);
			case OSS_NULL_TBL:
				throw new COMStatus("OSS_NULL_TBL: OSS ASN.1 Error: Invalid data.", message, args);
			case OSS_NULL_FCN:
				throw new COMStatus("OSS_NULL_FCN: OSS ASN.1 Error: Invalid data.", message, args);
			case OSS_BAD_ENCRULES:
				throw new COMStatus("OSS_BAD_ENCRULES: OSS ASN.1 Error: Invalid data.", message, args);
			case OSS_UNAVAIL_ENCRULES:
				throw new COMStatus("OSS_UNAVAIL_ENCRULES: OSS ASN.1 Error: Encode/Decode function not implemented.", message, args);
			case OSS_CANT_OPEN_TRACE_WINDOW:
				throw new COMStatus("OSS_CANT_OPEN_TRACE_WINDOW: OSS ASN.1 Error: Trace file error.", message, args);
			case OSS_UNIMPLEMENTED:
				throw new COMStatus("OSS_UNIMPLEMENTED: OSS ASN.1 Error: Function not implemented.", message, args);
			case OSS_OID_DLL_NOT_LINKED:
				throw new COMStatus("OSS_OID_DLL_NOT_LINKED: OSS ASN.1 Error: Program link error.", message, args);
			case OSS_CANT_OPEN_TRACE_FILE:
				throw new COMStatus("OSS_CANT_OPEN_TRACE_FILE: OSS ASN.1 Error: Trace file error.", message, args);
			case OSS_TRACE_FILE_ALREADY_OPEN:
				throw new COMStatus("OSS_TRACE_FILE_ALREADY_OPEN: OSS ASN.1 Error: Trace file error.", message, args);
			case OSS_TABLE_MISMATCH:
				throw new COMStatus("OSS_TABLE_MISMATCH: OSS ASN.1 Error: Invalid data.", message, args);
			case OSS_TYPE_NOT_SUPPORTED:
				throw new COMStatus("OSS_TYPE_NOT_SUPPORTED: OSS ASN.1 Error: Invalid data.", message, args);
			case OSS_REAL_DLL_NOT_LINKED:
				throw new COMStatus("OSS_REAL_DLL_NOT_LINKED: OSS ASN.1 Error: Program link error.", message, args);
			case OSS_REAL_CODE_NOT_LINKED:
				throw new COMStatus("OSS_REAL_CODE_NOT_LINKED: OSS ASN.1 Error: Program link error.", message, args);
			case OSS_OUT_OF_RANGE:
				throw new COMStatus("OSS_OUT_OF_RANGE: OSS ASN.1 Error: Program link error.", message, args);
			case OSS_COPIER_DLL_NOT_LINKED:
				throw new COMStatus("OSS_COPIER_DLL_NOT_LINKED: OSS ASN.1 Error: Program link error.", message, args);
			case OSS_CONSTRAINT_DLL_NOT_LINKED:
				throw new COMStatus("OSS_CONSTRAINT_DLL_NOT_LINKED: OSS ASN.1 Error: Program link error.", message, args);
			case OSS_COMPARATOR_DLL_NOT_LINKED:
				throw new COMStatus("OSS_COMPARATOR_DLL_NOT_LINKED: OSS ASN.1 Error: Program link error.", message, args);
			case OSS_COMPARATOR_CODE_NOT_LINKED:
				throw new COMStatus("OSS_COMPARATOR_CODE_NOT_LINKED: OSS ASN.1 Error: Program link error.", message, args);
			case OSS_MEM_MGR_DLL_NOT_LINKED:
				throw new COMStatus("OSS_MEM_MGR_DLL_NOT_LINKED: OSS ASN.1 Error: Program link error.", message, args);
			case OSS_PDV_DLL_NOT_LINKED:
				throw new COMStatus("OSS_PDV_DLL_NOT_LINKED: OSS ASN.1 Error: Program link error.", message, args);
			case OSS_PDV_CODE_NOT_LINKED:
				throw new COMStatus("OSS_PDV_CODE_NOT_LINKED: OSS ASN.1 Error: Program link error.", message, args);
			case OSS_API_DLL_NOT_LINKED:
				throw new COMStatus("OSS_API_DLL_NOT_LINKED: OSS ASN.1 Error: Program link error.", message, args);
			case OSS_BERDER_DLL_NOT_LINKED:
				throw new COMStatus("OSS_BERDER_DLL_NOT_LINKED: OSS ASN.1 Error: Program link error.", message, args);
			case OSS_PER_DLL_NOT_LINKED:
				throw new COMStatus("OSS_PER_DLL_NOT_LINKED: OSS ASN.1 Error: Program link error.", message, args);
			case OSS_OPEN_TYPE_ERROR:
				throw new COMStatus("OSS_OPEN_TYPE_ERROR: OSS ASN.1 Error: Program link error.", message, args);
			case OSS_MUTEX_NOT_CREATED:
				throw new COMStatus("OSS_MUTEX_NOT_CREATED: OSS ASN.1 Error: System resource error.", message, args);
			case OSS_CANT_CLOSE_TRACE_FILE:
				throw new COMStatus("OSS_CANT_CLOSE_TRACE_FILE: OSS ASN.1 Error: Trace file error.", message, args);
			case CRYPT_E_ASN1_ERROR:
				throw new COMStatus("CRYPT_E_ASN1_ERROR: ASN1 Certificate encode/decode error code base.", message, args);
			case CRYPT_E_ASN1_INTERNAL:
				throw new COMStatus("CRYPT_E_ASN1_INTERNAL: ASN1 internal encode or decode error.", message, args);
			case CRYPT_E_ASN1_EOD:
				throw new COMStatus("CRYPT_E_ASN1_EOD: ASN1 unexpected end of data.", message, args);
			case CRYPT_E_ASN1_CORRUPT:
				throw new COMStatus("CRYPT_E_ASN1_CORRUPT: ASN1 corrupted data.", message, args);
			case CRYPT_E_ASN1_LARGE:
				throw new COMStatus("CRYPT_E_ASN1_LARGE: ASN1 value too large.", message, args);
			case CRYPT_E_ASN1_CONSTRAINT:
				throw new COMStatus("CRYPT_E_ASN1_CONSTRAINT: ASN1 constraint violated.", message, args);
			case CRYPT_E_ASN1_MEMORY:
				throw new COMStatus("CRYPT_E_ASN1_MEMORY: ASN1 out of memory.", message, args);
			case CRYPT_E_ASN1_OVERFLOW:
				throw new COMStatus("CRYPT_E_ASN1_OVERFLOW: ASN1 buffer overflow.", message, args);
			case CRYPT_E_ASN1_BADPDU:
				throw new COMStatus("CRYPT_E_ASN1_BADPDU: ASN1 function not supported for this protocol data unit (PDU).", message, args);
			case CRYPT_E_ASN1_BADARGS:
				throw new COMStatus("CRYPT_E_ASN1_BADARGS: ASN1 bad arguments to function call.", message, args);
			case CRYPT_E_ASN1_BADREAL:
				throw new COMStatus("CRYPT_E_ASN1_BADREAL: ASN1 bad real value.", message, args);
			case CRYPT_E_ASN1_BADTAG:
				throw new COMStatus("CRYPT_E_ASN1_BADTAG: ASN1 bad tag value met.", message, args);
			case CRYPT_E_ASN1_CHOICE:
				throw new COMStatus("CRYPT_E_ASN1_CHOICE: ASN1 bad choice value.", message, args);
			case CRYPT_E_ASN1_RULE:
				throw new COMStatus("CRYPT_E_ASN1_RULE: ASN1 bad encoding rule.", message, args);
			case CRYPT_E_ASN1_UTF8:
				throw new COMStatus("CRYPT_E_ASN1_UTF8: ASN1 bad Unicode (UTF8).", message, args);
			case CRYPT_E_ASN1_PDU_TYPE:
				throw new COMStatus("CRYPT_E_ASN1_PDU_TYPE: ASN1 bad PDU type.", message, args);
			case CRYPT_E_ASN1_NYI:
				throw new COMStatus("CRYPT_E_ASN1_NYI: ASN1 not yet implemented.", message, args);
			case CRYPT_E_ASN1_EXTENDED:
				throw new COMStatus("CRYPT_E_ASN1_EXTENDED: ASN1 skipped unknown extensions.", message, args);
			case CRYPT_E_ASN1_NOEOD:
				throw new COMStatus("CRYPT_E_ASN1_NOEOD: ASN1 end of data expected.", message, args);
			case CERTSRV_E_BAD_REQUESTSUBJECT:
				throw new COMStatus("CERTSRV_E_BAD_REQUESTSUBJECT: The request subject name is invalid or too long.", message, args);
			case CERTSRV_E_NO_REQUEST:
				throw new COMStatus("CERTSRV_E_NO_REQUEST: The request does not exist.", message, args);
			case CERTSRV_E_BAD_REQUESTSTATUS:
				throw new COMStatus("CERTSRV_E_BAD_REQUESTSTATUS: The request's current status does not allow this operation.", message, args);
			case CERTSRV_E_PROPERTY_EMPTY:
				throw new COMStatus("CERTSRV_E_PROPERTY_EMPTY: The requested property value is empty.", message, args);
			case CERTSRV_E_INVALID_CA_CERTIFICATE:
				throw new COMStatus("CERTSRV_E_INVALID_CA_CERTIFICATE: The CA's certificate contains invalid data.", message, args);
			case CERTSRV_E_SERVER_SUSPENDED:
				throw new COMStatus("CERTSRV_E_SERVER_SUSPENDED: Certificate service has been suspended for a database restore operation.", message, args);
			case CERTSRV_E_ENCODING_LENGTH:
				throw new COMStatus("CERTSRV_E_ENCODING_LENGTH: The certificate contains an encoded length that is potentially incompatible with older enrollment software.", message, args);
			case CERTSRV_E_ROLECONFLICT:
				throw new COMStatus("CERTSRV_E_ROLECONFLICT: The operation is denied. The user has multiple roles assigned, and the CA is configured to enforce role separation.", message, args);
			case CERTSRV_E_RESTRICTEDOFFICER:
				throw new COMStatus("CERTSRV_E_RESTRICTEDOFFICER: The operation is denied. It can only be performed by a certificate manager that is allowed to manage certificates for the current requester.", message, args);
			case CERTSRV_E_KEY_ARCHIVAL_NOT_CONFIGURED:
				throw new COMStatus("CERTSRV_E_KEY_ARCHIVAL_NOT_CONFIGURED: Cannot archive private key. The CA is not configured for key archival.", message, args);
			case CERTSRV_E_NO_VALID_KRA:
				throw new COMStatus("CERTSRV_E_NO_VALID_KRA: Cannot archive private key. The CA could not verify one or more key recovery certificates.", message, args);
			case CERTSRV_E_BAD_REQUEST_KEY_ARCHIVAL:
				throw new COMStatus("CERTSRV_E_BAD_REQUEST_KEY_ARCHIVAL: The request is incorrectly formatted. The encrypted private key must be in an unauthenticated attribute in an outermost signature.", message, args);
			case CERTSRV_E_NO_CAADMIN_DEFINED:
				throw new COMStatus("CERTSRV_E_NO_CAADMIN_DEFINED: At least one security principal must have the permission to manage this CA.", message, args);
			case CERTSRV_E_BAD_RENEWAL_CERT_ATTRIBUTE:
				throw new COMStatus("CERTSRV_E_BAD_RENEWAL_CERT_ATTRIBUTE: The request contains an invalid renewal certificate attribute.", message, args);
			case CERTSRV_E_NO_DB_SESSIONS:
				throw new COMStatus("CERTSRV_E_NO_DB_SESSIONS: An attempt was made to open a CA database session, but there are already too many active sessions. The server may need to be configured to allow additional sessions.", message, args);
			case CERTSRV_E_ALIGNMENT_FAULT:
				throw new COMStatus("CERTSRV_E_ALIGNMENT_FAULT: A memory reference caused a data alignment fault.", message, args);
			case CERTSRV_E_ENROLL_DENIED:
				throw new COMStatus("CERTSRV_E_ENROLL_DENIED: The permissions on this CA do not allow the current user to enroll for certificates.", message, args);
			case CERTSRV_E_TEMPLATE_DENIED:
				throw new COMStatus("CERTSRV_E_TEMPLATE_DENIED: The permissions on the certificate template do not allow the current user to enroll for this type of certificate.", message, args);
			case CERTSRV_E_DOWNLEVEL_DC_SSL_OR_UPGRADE:
				throw new COMStatus("CERTSRV_E_DOWNLEVEL_DC_SSL_OR_UPGRADE: The contacted domain controller cannot support signed Lightweight Directory Access Protocol (LDAP) traffic. Update the domain controller or configure Certificate Services to use SSL for Active Directory access.", message, args);
			case CERTSRV_E_UNSUPPORTED_CERT_TYPE:
				throw new COMStatus("CERTSRV_E_UNSUPPORTED_CERT_TYPE: The requested certificate template is not supported by this CA.", message, args);
			case CERTSRV_E_NO_CERT_TYPE:
				throw new COMStatus("CERTSRV_E_NO_CERT_TYPE: The request contains no certificate template information.", message, args);
			case CERTSRV_E_TEMPLATE_CONFLICT:
				throw new COMStatus("CERTSRV_E_TEMPLATE_CONFLICT: The request contains conflicting template information.", message, args);
			case CERTSRV_E_SUBJECT_ALT_NAME_REQUIRED:
				throw new COMStatus("CERTSRV_E_SUBJECT_ALT_NAME_REQUIRED: The request is missing a required Subject Alternate name extension.", message, args);
			case CERTSRV_E_ARCHIVED_KEY_REQUIRED:
				throw new COMStatus("CERTSRV_E_ARCHIVED_KEY_REQUIRED: The request is missing a required private key for archival by the server.", message, args);
			case CERTSRV_E_SMIME_REQUIRED:
				throw new COMStatus("CERTSRV_E_SMIME_REQUIRED: The request is missing a required SMIME capabilities extension.", message, args);
			case CERTSRV_E_BAD_RENEWAL_SUBJECT:
				throw new COMStatus("CERTSRV_E_BAD_RENEWAL_SUBJECT: The request was made on behalf of a subject other than the caller. The certificate template must be configured to require at least one signature to authorize the request.", message, args);
			case CERTSRV_E_BAD_TEMPLATE_VERSION:
				throw new COMStatus("CERTSRV_E_BAD_TEMPLATE_VERSION: The request template version is newer than the supported template version.", message, args);
			case CERTSRV_E_TEMPLATE_POLICY_REQUIRED:
				throw new COMStatus("CERTSRV_E_TEMPLATE_POLICY_REQUIRED: The template is missing a required signature policy attribute.", message, args);
			case CERTSRV_E_SIGNATURE_POLICY_REQUIRED:
				throw new COMStatus("CERTSRV_E_SIGNATURE_POLICY_REQUIRED: The request is missing required signature policy information.", message, args);
			case CERTSRV_E_SIGNATURE_COUNT:
				throw new COMStatus("CERTSRV_E_SIGNATURE_COUNT: The request is missing one or more required signatures.", message, args);
			case CERTSRV_E_SIGNATURE_REJECTED:
				throw new COMStatus("CERTSRV_E_SIGNATURE_REJECTED: One or more signatures did not include the required application or issuance policies. The request is missing one or more required valid signatures.", message, args);
			case CERTSRV_E_ISSUANCE_POLICY_REQUIRED:
				throw new COMStatus("CERTSRV_E_ISSUANCE_POLICY_REQUIRED: The request is missing one or more required signature issuance policies.", message, args);
			case CERTSRV_E_SUBJECT_UPN_REQUIRED:
				throw new COMStatus("CERTSRV_E_SUBJECT_UPN_REQUIRED: The UPN is unavailable and cannot be added to the Subject Alternate name.", message, args);
			case CERTSRV_E_SUBJECT_DIRECTORY_GUID_REQUIRED:
				throw new COMStatus("CERTSRV_E_SUBJECT_DIRECTORY_GUID_REQUIRED: The Active Directory GUID is unavailable and cannot be added to the Subject Alternate name.", message, args);
			case CERTSRV_E_SUBJECT_DNS_REQUIRED:
				throw new COMStatus("CERTSRV_E_SUBJECT_DNS_REQUIRED: The Domain Name System (DNS) name is unavailable and cannot be added to the Subject Alternate name.", message, args);
			case CERTSRV_E_ARCHIVED_KEY_UNEXPECTED:
				throw new COMStatus("CERTSRV_E_ARCHIVED_KEY_UNEXPECTED: The request includes a private key for archival by the server, but key archival is not enabled for the specified certificate template.", message, args);
			case CERTSRV_E_KEY_LENGTH:
				throw new COMStatus("CERTSRV_E_KEY_LENGTH: The public key does not meet the minimum size required by the specified certificate template.", message, args);
			case CERTSRV_E_SUBJECT_EMAIL_REQUIRED:
				throw new COMStatus("CERTSRV_E_SUBJECT_EMAIL_REQUIRED: The email name is unavailable and cannot be added to the Subject or Subject Alternate name.", message, args);
			case CERTSRV_E_UNKNOWN_CERT_TYPE:
				throw new COMStatus("CERTSRV_E_UNKNOWN_CERT_TYPE: One or more certificate templates to be enabled on this CA could not be found.", message, args);
			case CERTSRV_E_CERT_TYPE_OVERLAP:
				throw new COMStatus("CERTSRV_E_CERT_TYPE_OVERLAP: The certificate template renewal period is longer than the certificate validity period. The template should be reconfigured or the CA certificate renewed.", message, args);
			case CERTSRV_E_TOO_MANY_SIGNATURES:
				throw new COMStatus("CERTSRV_E_TOO_MANY_SIGNATURES: The certificate template requires too many return authorization (RA) signatures. Only one RA signature is allowed.", message, args);
			case CERTSRV_E_RENEWAL_BAD_PUBLIC_KEY:
				throw new COMStatus("CERTSRV_E_RENEWAL_BAD_PUBLIC_KEY: The key used in a renewal request does not match one of the certificates being renewed.", message, args);
			case CERTSRV_E_INVALID_EK:
				throw new COMStatus("CERTSRV_E_INVALID_EK: The endorsement key certificate is not valid.", message, args);
			case CERTSRV_E_KEY_ATTESTATION:
				throw new COMStatus("CERTSRV_E_KEY_ATTESTATION: Key attestation did not succeed.", message, args);
			case XENROLL_E_KEY_NOT_EXPORTABLE:
				throw new COMStatus("XENROLL_E_KEY_NOT_EXPORTABLE: The key is not exportable.", message, args);
			case XENROLL_E_CANNOT_ADD_ROOT_CERT:
				throw new COMStatus("XENROLL_E_CANNOT_ADD_ROOT_CERT: You cannot add the root CA certificate into your local store.", message, args);
			case XENROLL_E_RESPONSE_KA_HASH_NOT_FOUND:
				throw new COMStatus("XENROLL_E_RESPONSE_KA_HASH_NOT_FOUND: The key archival hash attribute was not found in the response.", message, args);
			case XENROLL_E_RESPONSE_UNEXPECTED_KA_HASH:
				throw new COMStatus("XENROLL_E_RESPONSE_UNEXPECTED_KA_HASH: An unexpected key archival hash attribute was found in the response.", message, args);
			case XENROLL_E_RESPONSE_KA_HASH_MISMATCH:
				throw new COMStatus("XENROLL_E_RESPONSE_KA_HASH_MISMATCH: There is a key archival hash mismatch between the request and the response.", message, args);
			case XENROLL_E_KEYSPEC_SMIME_MISMATCH:
				throw new COMStatus("XENROLL_E_KEYSPEC_SMIME_MISMATCH: Signing certificate cannot include SMIME extension.", message, args);
			case TRUST_E_SYSTEM_ERROR:
				throw new COMStatus("TRUST_E_SYSTEM_ERROR: A system-level error occurred while verifying trust.", message, args);
			case TRUST_E_NO_SIGNER_CERT:
				throw new COMStatus("TRUST_E_NO_SIGNER_CERT: The certificate for the signer of the message is invalid or not found.", message, args);
			case TRUST_E_COUNTER_SIGNER:
				throw new COMStatus("TRUST_E_COUNTER_SIGNER: One of the counter signatures was invalid.", message, args);
			case TRUST_E_CERT_SIGNATURE:
				throw new COMStatus("TRUST_E_CERT_SIGNATURE: The signature of the certificate cannot be verified.", message, args);
			case TRUST_E_TIME_STAMP:
				throw new COMStatus("TRUST_E_TIME_STAMP: The time-stamp signature or certificate could not be verified or is malformed.", message, args);
			case TRUST_E_BAD_DIGEST:
				throw new COMStatus("TRUST_E_BAD_DIGEST: The digital signature of the object did not verify.", message, args);
			case TRUST_E_BASIC_CONSTRAINTS:
				throw new COMStatus("TRUST_E_BASIC_CONSTRAINTS: A certificate's basic constraint extension has not been observed.", message, args);
			case TRUST_E_FINANCIAL_CRITERIA:
				throw new COMStatus("TRUST_E_FINANCIAL_CRITERIA: The certificate does not meet or contain the Authenticode financial extensions.", message, args);
			case MSSIPOTF_E_OUTOFMEMRANGE:
				throw new COMStatus("MSSIPOTF_E_OUTOFMEMRANGE: Tried to reference a part of the file outside the proper range.", message, args);
			case MSSIPOTF_E_CANTGETOBJECT:
				throw new COMStatus("MSSIPOTF_E_CANTGETOBJECT: Could not retrieve an object from the file.", message, args);
			case MSSIPOTF_E_NOHEADTABLE:
				throw new COMStatus("MSSIPOTF_E_NOHEADTABLE: Could not find the head table in the file.", message, args);
			case MSSIPOTF_E_BAD_MAGICNUMBER:
				throw new COMStatus("MSSIPOTF_E_BAD_MAGICNUMBER: The magic number in the head table is incorrect.", message, args);
			case MSSIPOTF_E_BAD_OFFSET_TABLE:
				throw new COMStatus("MSSIPOTF_E_BAD_OFFSET_TABLE: The offset table has incorrect values.", message, args);
			case MSSIPOTF_E_TABLE_TAGORDER:
				throw new COMStatus("MSSIPOTF_E_TABLE_TAGORDER: Duplicate table tags or the tags are out of alphabetical order.", message, args);
			case MSSIPOTF_E_TABLE_LONGWORD:
				throw new COMStatus("MSSIPOTF_E_TABLE_LONGWORD: A table does not start on a long word boundary.", message, args);
			case MSSIPOTF_E_BAD_FIRST_TABLE_PLACEMENT:
				throw new COMStatus("MSSIPOTF_E_BAD_FIRST_TABLE_PLACEMENT: First table does not appear after header information.", message, args);
			case MSSIPOTF_E_TABLES_OVERLAP:
				throw new COMStatus("MSSIPOTF_E_TABLES_OVERLAP: Two or more tables overlap.", message, args);
			case MSSIPOTF_E_TABLE_PADBYTES:
				throw new COMStatus("MSSIPOTF_E_TABLE_PADBYTES: Too many pad bytes between tables, or pad bytes are not 0.", message, args);
			case MSSIPOTF_E_FILETOOSMALL:
				throw new COMStatus("MSSIPOTF_E_FILETOOSMALL: File is too small to contain the last table.", message, args);
			case MSSIPOTF_E_TABLE_CHECKSUM:
				throw new COMStatus("MSSIPOTF_E_TABLE_CHECKSUM: A table checksum is incorrect.", message, args);
			case MSSIPOTF_E_FILE_CHECKSUM:
				throw new COMStatus("MSSIPOTF_E_FILE_CHECKSUM: The file checksum is incorrect.", message, args);
			case MSSIPOTF_E_FAILED_POLICY:
				throw new COMStatus("MSSIPOTF_E_FAILED_POLICY: The signature does not have the correct attributes for the policy.", message, args);
			case MSSIPOTF_E_FAILED_HINTS_CHECK:
				throw new COMStatus("MSSIPOTF_E_FAILED_HINTS_CHECK: The file did not pass the hints check.", message, args);
			case MSSIPOTF_E_NOT_OPENTYPE:
				throw new COMStatus("MSSIPOTF_E_NOT_OPENTYPE: The file is not an OpenType file.", message, args);
			case MSSIPOTF_E_FILE:
				throw new COMStatus("MSSIPOTF_E_FILE: Failed on a file operation (such as open, map, read, or write).", message, args);
			case MSSIPOTF_E_CRYPT:
				throw new COMStatus("MSSIPOTF_E_CRYPT: A call to a CryptoAPI function failed.", message, args);
			case MSSIPOTF_E_BADVERSION:
				throw new COMStatus("MSSIPOTF_E_BADVERSION: There is a bad version number in the file.", message, args);
			case MSSIPOTF_E_DSIG_STRUCTURE:
				throw new COMStatus("MSSIPOTF_E_DSIG_STRUCTURE: The structure of the DSIG table is incorrect.", message, args);
			case MSSIPOTF_E_PCONST_CHECK:
				throw new COMStatus("MSSIPOTF_E_PCONST_CHECK: A check failed in a partially constant table.", message, args);
			case MSSIPOTF_E_STRUCTURE:
				throw new COMStatus("MSSIPOTF_E_STRUCTURE: Some kind of structural error.", message, args);
			case ERROR_CRED_REQUIRES_CONFIRMATION:
				throw new COMStatus("ERROR_CRED_REQUIRES_CONFIRMATION: The requested credential requires confirmation.", message, args);
			case TRUST_E_PROVIDER_UNKNOWN:
				throw new COMStatus("TRUST_E_PROVIDER_UNKNOWN: Unknown trust provider.", message, args);
			case TRUST_E_ACTION_UNKNOWN:
				throw new COMStatus("TRUST_E_ACTION_UNKNOWN: The trust verification action specified is not supported by the specified trust provider.", message, args);
			case TRUST_E_SUBJECT_FORM_UNKNOWN:
				throw new COMStatus("TRUST_E_SUBJECT_FORM_UNKNOWN: The form specified for the subject is not one supported or known by the specified trust provider.", message, args);
			case TRUST_E_SUBJECT_NOT_TRUSTED:
				throw new COMStatus("TRUST_E_SUBJECT_NOT_TRUSTED: The subject is not trusted for the specified action.", message, args);
			case DIGSIG_E_ENCODE:
				throw new COMStatus("DIGSIG_E_ENCODE: Error due to problem in ASN.1 encoding process.", message, args);
			case DIGSIG_E_DECODE:
				throw new COMStatus("DIGSIG_E_DECODE: Error due to problem in ASN.1 decoding process.", message, args);
			case DIGSIG_E_EXTENSIBILITY:
				throw new COMStatus("DIGSIG_E_EXTENSIBILITY: Reading/writing extensions where attributes are appropriate, and vice versa.", message, args);
			case DIGSIG_E_CRYPTO:
				throw new COMStatus("DIGSIG_E_CRYPTO: Unspecified cryptographic failure.", message, args);
			case PERSIST_E_SIZEDEFINITE:
				throw new COMStatus("PERSIST_E_SIZEDEFINITE: The size of the data could not be determined.", message, args);
			case PERSIST_E_SIZEINDEFINITE:
				throw new COMStatus("PERSIST_E_SIZEINDEFINITE: The size of the indefinite-sized data could not be determined.", message, args);
			case PERSIST_E_NOTSELFSIZING:
				throw new COMStatus("PERSIST_E_NOTSELFSIZING: This object does not read and write self-sizing data.", message, args);
			case TRUST_E_NOSIGNATURE:
				throw new COMStatus("TRUST_E_NOSIGNATURE: No signature was present in the subject.", message, args);
			case CERT_E_EXPIRED:
				throw new COMStatus("CERT_E_EXPIRED: A required certificate is not within its validity period when verifying against the current system clock or the time stamp in the signed file.", message, args);
			case CERT_E_VALIDITYPERIODNESTING:
				throw new COMStatus("CERT_E_VALIDITYPERIODNESTING: The validity periods of the certification chain do not nest correctly.", message, args);
			case CERT_E_ROLE:
				throw new COMStatus("CERT_E_ROLE: A certificate that can only be used as an end entity is being used as a CA or vice versa.", message, args);
			case CERT_E_PATHLENCONST:
				throw new COMStatus("CERT_E_PATHLENCONST: A path length constraint in the certification chain has been violated.", message, args);
			case CERT_E_CRITICAL:
				throw new COMStatus("CERT_E_CRITICAL: A certificate contains an unknown extension that is marked \"critical\".", message, args);
			case CERT_E_PURPOSE:
				throw new COMStatus("CERT_E_PURPOSE: A certificate is being used for a purpose other than the ones specified by its CA.", message, args);
			case CERT_E_ISSUERCHAINING:
				throw new COMStatus("CERT_E_ISSUERCHAINING: A parent of a given certificate did not issue that child certificate.", message, args);
			case CERT_E_MALFORMED:
				throw new COMStatus("CERT_E_MALFORMED: A certificate is missing or has an empty value for an important field, such as a subject or issuer name.", message, args);
			case CERT_E_UNTRUSTEDROOT:
				throw new COMStatus("CERT_E_UNTRUSTEDROOT: A certificate chain processed, but terminated in a root certificate that is not trusted by the trust provider.", message, args);
			case CERT_E_CHAINING:
				throw new COMStatus("CERT_E_CHAINING: A certificate chain could not be built to a trusted root authority.", message, args);
			case TRUST_E_FAIL:
				throw new COMStatus("TRUST_E_FAIL: Generic trust failure.", message, args);
			case CERT_E_REVOKED:
				throw new COMStatus("CERT_E_REVOKED: A certificate was explicitly revoked by its issuer.", message, args);
			case CERT_E_UNTRUSTEDTESTROOT:
				throw new COMStatus("CERT_E_UNTRUSTEDTESTROOT: The certification path terminates with the test root that is not trusted with the current policy settings.", message, args);
			case CERT_E_REVOCATION_FAILURE:
				throw new COMStatus("CERT_E_REVOCATION_FAILURE: The revocation process could not continue—the certificates could not be checked.", message, args);
			case CERT_E_CN_NO_MATCH:
				throw new COMStatus("CERT_E_CN_NO_MATCH: The certificate's CN name does not match the passed value.", message, args);
			case CERT_E_WRONG_USAGE:
				throw new COMStatus("CERT_E_WRONG_USAGE: The certificate is not valid for the requested usage.", message, args);
			case TRUST_E_EXPLICIT_DISTRUST:
				throw new COMStatus("TRUST_E_EXPLICIT_DISTRUST: The certificate was explicitly marked as untrusted by the user.", message, args);
			case CERT_E_UNTRUSTEDCA:
				throw new COMStatus("CERT_E_UNTRUSTEDCA: A certification chain processed correctly, but one of the CA certificates is not trusted by the policy provider.", message, args);
			case CERT_E_INVALID_POLICY:
				throw new COMStatus("CERT_E_INVALID_POLICY: The certificate has invalid policy.", message, args);
			case CERT_E_INVALID_NAME:
				throw new COMStatus("CERT_E_INVALID_NAME: The certificate has an invalid name. The name is not included in the permitted list or is explicitly excluded.", message, args);
			case NS_W_SERVER_BANDWIDTH_LIMIT:
				throw new COMStatus("NS_W_SERVER_BANDWIDTH_LIMIT: The maximum filebitrate value specified is greater than the server's configured maximum bandwidth.", message, args);
			case NS_W_FILE_BANDWIDTH_LIMIT:
				throw new COMStatus("NS_W_FILE_BANDWIDTH_LIMIT: The maximum bandwidth value specified is less than the maximum filebitrate.", message, args);
			case NS_W_UNKNOWN_EVENT:
				throw new COMStatus("NS_W_UNKNOWN_EVENT: Unknown %1 event encountered.", message, args);
			case NS_I_CATATONIC_FAILURE:
				throw new COMStatus("NS_I_CATATONIC_FAILURE: Disk %1 ( %2 ) on Content Server %3, will be failed because it is catatonic.", message, args);
			case NS_I_CATATONIC_AUTO_UNFAIL:
				throw new COMStatus("NS_I_CATATONIC_AUTO_UNFAIL: Disk %1 ( %2 ) on Content Server %3, auto online from catatonic state.", message, args);
			case SPAPI_E_EXPECTED_SECTION_NAME:
				throw new COMStatus("SPAPI_E_EXPECTED_SECTION_NAME: A non-empty line was encountered in the INF before the start of a section.", message, args);
			case SPAPI_E_BAD_SECTION_NAME_LINE:
				throw new COMStatus("SPAPI_E_BAD_SECTION_NAME_LINE: A section name marker in the information file (INF) is not complete or does not exist on a line by itself.", message, args);
			case SPAPI_E_SECTION_NAME_TOO_LONG:
				throw new COMStatus("SPAPI_E_SECTION_NAME_TOO_LONG: An INF section was encountered whose name exceeds the maximum section name length.", message, args);
			case SPAPI_E_GENERAL_SYNTAX:
				throw new COMStatus("SPAPI_E_GENERAL_SYNTAX: The syntax of the INF is invalid.", message, args);
			case SPAPI_E_WRONG_INF_STYLE:
				throw new COMStatus("SPAPI_E_WRONG_INF_STYLE: The style of the INF is different than what was requested.", message, args);
			case SPAPI_E_SECTION_NOT_FOUND:
				throw new COMStatus("SPAPI_E_SECTION_NOT_FOUND: The required section was not found in the INF.", message, args);
			case SPAPI_E_LINE_NOT_FOUND:
				throw new COMStatus("SPAPI_E_LINE_NOT_FOUND: The required line was not found in the INF.", message, args);
			case SPAPI_E_NO_BACKUP:
				throw new COMStatus("SPAPI_E_NO_BACKUP: The files affected by the installation of this file queue have not been backed up for uninstall.", message, args);
			case SPAPI_E_NO_ASSOCIATED_CLASS:
				throw new COMStatus("SPAPI_E_NO_ASSOCIATED_CLASS: The INF or the device information set or element does not have an associated install class.", message, args);
			case SPAPI_E_CLASS_MISMATCH:
				throw new COMStatus("SPAPI_E_CLASS_MISMATCH: The INF or the device information set or element does not match the specified install class.", message, args);
			case SPAPI_E_DUPLICATE_FOUND:
				throw new COMStatus("SPAPI_E_DUPLICATE_FOUND: An existing device was found that is a duplicate of the device being manually installed.", message, args);
			case SPAPI_E_NO_DRIVER_SELECTED:
				throw new COMStatus("SPAPI_E_NO_DRIVER_SELECTED: There is no driver selected for the device information set or element.", message, args);
			case SPAPI_E_KEY_DOES_NOT_EXIST:
				throw new COMStatus("SPAPI_E_KEY_DOES_NOT_EXIST: The requested device registry key does not exist.", message, args);
			case SPAPI_E_INVALID_DEVINST_NAME:
				throw new COMStatus("SPAPI_E_INVALID_DEVINST_NAME: The device instance name is invalid.", message, args);
			case SPAPI_E_INVALID_CLASS:
				throw new COMStatus("SPAPI_E_INVALID_CLASS: The install class is not present or is invalid.", message, args);
			case SPAPI_E_DEVINST_ALREADY_EXISTS:
				throw new COMStatus("SPAPI_E_DEVINST_ALREADY_EXISTS: The device instance cannot be created because it already exists.", message, args);
			case SPAPI_E_DEVINFO_NOT_REGISTERED:
				throw new COMStatus("SPAPI_E_DEVINFO_NOT_REGISTERED: The operation cannot be performed on a device information element that has not been registered.", message, args);
			case SPAPI_E_INVALID_REG_PROPERTY:
				throw new COMStatus("SPAPI_E_INVALID_REG_PROPERTY: The device property code is invalid.", message, args);
			case SPAPI_E_NO_INF:
				throw new COMStatus("SPAPI_E_NO_INF: The INF from which a driver list is to be built does not exist.", message, args);
			case SPAPI_E_NO_SUCH_DEVINST:
				throw new COMStatus("SPAPI_E_NO_SUCH_DEVINST: The device instance does not exist in the hardware tree.", message, args);
			case SPAPI_E_CANT_LOAD_CLASS_ICON:
				throw new COMStatus("SPAPI_E_CANT_LOAD_CLASS_ICON: The icon representing this install class cannot be loaded.", message, args);
			case SPAPI_E_INVALID_CLASS_INSTALLER:
				throw new COMStatus("SPAPI_E_INVALID_CLASS_INSTALLER: The class installer registry entry is invalid.", message, args);
			case SPAPI_E_DI_DO_DEFAULT:
				throw new COMStatus("SPAPI_E_DI_DO_DEFAULT: The class installer has indicated that the default action should be performed for this installation request.", message, args);
			case SPAPI_E_DI_NOFILECOPY:
				throw new COMStatus("SPAPI_E_DI_NOFILECOPY: The operation does not require any files to be copied.", message, args);
			case SPAPI_E_INVALID_HWPROFILE:
				throw new COMStatus("SPAPI_E_INVALID_HWPROFILE: The specified hardware profile does not exist.", message, args);
			case SPAPI_E_NO_DEVICE_SELECTED:
				throw new COMStatus("SPAPI_E_NO_DEVICE_SELECTED: There is no device information element currently selected for this device information set.", message, args);
			case SPAPI_E_DEVINFO_LIST_LOCKED:
				throw new COMStatus("SPAPI_E_DEVINFO_LIST_LOCKED: The operation cannot be performed because the device information set is locked.", message, args);
			case SPAPI_E_DEVINFO_DATA_LOCKED:
				throw new COMStatus("SPAPI_E_DEVINFO_DATA_LOCKED: The operation cannot be performed because the device information element is locked.", message, args);
			case SPAPI_E_DI_BAD_PATH:
				throw new COMStatus("SPAPI_E_DI_BAD_PATH: The specified path does not contain any applicable device INFs.", message, args);
			case SPAPI_E_NO_CLASSINSTALL_PARAMS:
				throw new COMStatus("SPAPI_E_NO_CLASSINSTALL_PARAMS: No class installer parameters have been set for the device information set or element.", message, args);
			case SPAPI_E_FILEQUEUE_LOCKED:
				throw new COMStatus("SPAPI_E_FILEQUEUE_LOCKED: The operation cannot be performed because the file queue is locked.", message, args);
			case SPAPI_E_BAD_SERVICE_INSTALLSECT:
				throw new COMStatus("SPAPI_E_BAD_SERVICE_INSTALLSECT: A service installation section in this INF is invalid.", message, args);
			case SPAPI_E_NO_CLASS_DRIVER_LIST:
				throw new COMStatus("SPAPI_E_NO_CLASS_DRIVER_LIST: There is no class driver list for the device information element.", message, args);
			case SPAPI_E_NO_ASSOCIATED_SERVICE:
				throw new COMStatus("SPAPI_E_NO_ASSOCIATED_SERVICE: The installation failed because a function driver was not specified for this device instance.", message, args);
			case SPAPI_E_NO_DEFAULT_DEVICE_INTERFACE:
				throw new COMStatus("SPAPI_E_NO_DEFAULT_DEVICE_INTERFACE: There is presently no default device interface designated for this interface class.", message, args);
			case SPAPI_E_DEVICE_INTERFACE_ACTIVE:
				throw new COMStatus("SPAPI_E_DEVICE_INTERFACE_ACTIVE: The operation cannot be performed because the device interface is currently active.", message, args);
			case SPAPI_E_DEVICE_INTERFACE_REMOVED:
				throw new COMStatus("SPAPI_E_DEVICE_INTERFACE_REMOVED: The operation cannot be performed because the device interface has been removed from the system.", message, args);
			case SPAPI_E_BAD_INTERFACE_INSTALLSECT:
				throw new COMStatus("SPAPI_E_BAD_INTERFACE_INSTALLSECT: An interface installation section in this INF is invalid.", message, args);
			case SPAPI_E_NO_SUCH_INTERFACE_CLASS:
				throw new COMStatus("SPAPI_E_NO_SUCH_INTERFACE_CLASS: This interface class does not exist in the system.", message, args);
			case SPAPI_E_INVALID_REFERENCE_STRING:
				throw new COMStatus("SPAPI_E_INVALID_REFERENCE_STRING: The reference string supplied for this interface device is invalid.", message, args);
			case SPAPI_E_INVALID_MACHINENAME:
				throw new COMStatus("SPAPI_E_INVALID_MACHINENAME: The specified machine name does not conform to Universal Naming Convention (UNCs).", message, args);
			case SPAPI_E_REMOTE_COMM_FAILURE:
				throw new COMStatus("SPAPI_E_REMOTE_COMM_FAILURE: A general remote communication error occurred.", message, args);
			case SPAPI_E_MACHINE_UNAVAILABLE:
				throw new COMStatus("SPAPI_E_MACHINE_UNAVAILABLE: The machine selected for remote communication is not available at this time.", message, args);
			case SPAPI_E_NO_CONFIGMGR_SERVICES:
				throw new COMStatus("SPAPI_E_NO_CONFIGMGR_SERVICES: The Plug and Play service is not available on the remote machine.", message, args);
			case SPAPI_E_INVALID_PROPPAGE_PROVIDER:
				throw new COMStatus("SPAPI_E_INVALID_PROPPAGE_PROVIDER: The property page provider registry entry is invalid.", message, args);
			case SPAPI_E_NO_SUCH_DEVICE_INTERFACE:
				throw new COMStatus("SPAPI_E_NO_SUCH_DEVICE_INTERFACE: The requested device interface is not present in the system.", message, args);
			case SPAPI_E_DI_POSTPROCESSING_REQUIRED:
				throw new COMStatus("SPAPI_E_DI_POSTPROCESSING_REQUIRED: The device's co-installer has additional work to perform after installation is complete.", message, args);
			case SPAPI_E_INVALID_COINSTALLER:
				throw new COMStatus("SPAPI_E_INVALID_COINSTALLER: The device's co-installer is invalid.", message, args);
			case SPAPI_E_NO_COMPAT_DRIVERS:
				throw new COMStatus("SPAPI_E_NO_COMPAT_DRIVERS: There are no compatible drivers for this device.", message, args);
			case SPAPI_E_NO_DEVICE_ICON:
				throw new COMStatus("SPAPI_E_NO_DEVICE_ICON: There is no icon that represents this device or device type.", message, args);
			case SPAPI_E_INVALID_INF_LOGCONFIG:
				throw new COMStatus("SPAPI_E_INVALID_INF_LOGCONFIG: A logical configuration specified in this INF is invalid.", message, args);
			case SPAPI_E_DI_DONT_INSTALL:
				throw new COMStatus("SPAPI_E_DI_DONT_INSTALL: The class installer has denied the request to install or upgrade this device.", message, args);
			case SPAPI_E_INVALID_FILTER_DRIVER:
				throw new COMStatus("SPAPI_E_INVALID_FILTER_DRIVER: One of the filter drivers installed for this device is invalid.", message, args);
			case SPAPI_E_NON_WINDOWS_NT_DRIVER:
				throw new COMStatus("SPAPI_E_NON_WINDOWS_NT_DRIVER: The driver selected for this device does not support Windows XP operating system.", message, args);
			case SPAPI_E_NON_WINDOWS_DRIVER:
				throw new COMStatus("SPAPI_E_NON_WINDOWS_DRIVER: The driver selected for this device does not support Windows.", message, args);
			case SPAPI_E_NO_CATALOG_FOR_OEM_INF:
				throw new COMStatus("SPAPI_E_NO_CATALOG_FOR_OEM_INF: The third-party INF does not contain digital signature information.", message, args);
			case SPAPI_E_DEVINSTALL_QUEUE_NONNATIVE:
				throw new COMStatus("SPAPI_E_DEVINSTALL_QUEUE_NONNATIVE: An invalid attempt was made to use a device installation file queue for verification of digital signatures relative to other platforms.", message, args);
			case SPAPI_E_NOT_DISABLEABLE:
				throw new COMStatus("SPAPI_E_NOT_DISABLEABLE: The device cannot be disabled.", message, args);
			case SPAPI_E_CANT_REMOVE_DEVINST:
				throw new COMStatus("SPAPI_E_CANT_REMOVE_DEVINST: The device could not be dynamically removed.", message, args);
			case SPAPI_E_INVALID_TARGET:
				throw new COMStatus("SPAPI_E_INVALID_TARGET: Cannot copy to specified target.", message, args);
			case SPAPI_E_DRIVER_NONNATIVE:
				throw new COMStatus("SPAPI_E_DRIVER_NONNATIVE: Driver is not intended for this platform.", message, args);
			case SPAPI_E_IN_WOW64:
				throw new COMStatus("SPAPI_E_IN_WOW64: Operation not allowed in WOW64.", message, args);
			case SPAPI_E_SET_SYSTEM_RESTORE_POINT:
				throw new COMStatus("SPAPI_E_SET_SYSTEM_RESTORE_POINT: The operation involving unsigned file copying was rolled back, so that a system restore point could be set.", message, args);
			case SPAPI_E_INCORRECTLY_COPIED_INF:
				throw new COMStatus("SPAPI_E_INCORRECTLY_COPIED_INF: An INF was copied into the Windows INF directory in an improper manner.", message, args);
			case SPAPI_E_SCE_DISABLED:
				throw new COMStatus("SPAPI_E_SCE_DISABLED: The Security Configuration Editor (SCE) APIs have been disabled on this embedded product.", message, args);
			case SPAPI_E_UNKNOWN_EXCEPTION:
				throw new COMStatus("SPAPI_E_UNKNOWN_EXCEPTION: An unknown exception was encountered.", message, args);
			case SPAPI_E_PNP_REGISTRY_ERROR:
				throw new COMStatus("SPAPI_E_PNP_REGISTRY_ERROR: A problem was encountered when accessing the Plug and Play registry database.", message, args);
			case SPAPI_E_REMOTE_REQUEST_UNSUPPORTED:
				throw new COMStatus("SPAPI_E_REMOTE_REQUEST_UNSUPPORTED: The requested operation is not supported for a remote machine.", message, args);
			case SPAPI_E_NOT_AN_INSTALLED_OEM_INF:
				throw new COMStatus("SPAPI_E_NOT_AN_INSTALLED_OEM_INF: The specified file is not an installed original equipment manufacturer (OEM) INF.", message, args);
			case SPAPI_E_INF_IN_USE_BY_DEVICES:
				throw new COMStatus("SPAPI_E_INF_IN_USE_BY_DEVICES: One or more devices are presently installed using the specified INF.", message, args);
			case SPAPI_E_DI_FUNCTION_OBSOLETE:
				throw new COMStatus("SPAPI_E_DI_FUNCTION_OBSOLETE: The requested device install operation is obsolete.", message, args);
			case SPAPI_E_NO_AUTHENTICODE_CATALOG:
				throw new COMStatus("SPAPI_E_NO_AUTHENTICODE_CATALOG: A file could not be verified because it does not have an associated catalog signed via Authenticode.", message, args);
			case SPAPI_E_AUTHENTICODE_DISALLOWED:
				throw new COMStatus("SPAPI_E_AUTHENTICODE_DISALLOWED: Authenticode signature verification is not supported for the specified INF.", message, args);
			case SPAPI_E_AUTHENTICODE_TRUSTED_PUBLISHER:
				throw new COMStatus("SPAPI_E_AUTHENTICODE_TRUSTED_PUBLISHER: The INF was signed with an Authenticode catalog from a trusted publisher.", message, args);
			case SPAPI_E_AUTHENTICODE_TRUST_NOT_ESTABLISHED:
				throw new COMStatus("SPAPI_E_AUTHENTICODE_TRUST_NOT_ESTABLISHED: The publisher of an Authenticode-signed catalog has not yet been established as trusted.", message, args);
			case SPAPI_E_AUTHENTICODE_PUBLISHER_NOT_TRUSTED:
				throw new COMStatus("SPAPI_E_AUTHENTICODE_PUBLISHER_NOT_TRUSTED: The publisher of an Authenticode-signed catalog was not established as trusted.", message, args);
			case SPAPI_E_SIGNATURE_OSATTRIBUTE_MISMATCH:
				throw new COMStatus("SPAPI_E_SIGNATURE_OSATTRIBUTE_MISMATCH: The software was tested for compliance with Windows logo requirements on a different version of Windows and may not be compatible with this version.", message, args);
			case SPAPI_E_ONLY_VALIDATE_VIA_AUTHENTICODE:
				throw new COMStatus("SPAPI_E_ONLY_VALIDATE_VIA_AUTHENTICODE: The file may be validated only by a catalog signed via Authenticode.", message, args);
			case SPAPI_E_DEVICE_INSTALLER_NOT_READY:
				throw new COMStatus("SPAPI_E_DEVICE_INSTALLER_NOT_READY: One of the installers for this device cannot perform the installation at this time.", message, args);
			case SPAPI_E_DRIVER_STORE_ADD_FAILED:
				throw new COMStatus("SPAPI_E_DRIVER_STORE_ADD_FAILED: A problem was encountered while attempting to add the driver to the store.", message, args);
			case SPAPI_E_DEVICE_INSTALL_BLOCKED:
				throw new COMStatus("SPAPI_E_DEVICE_INSTALL_BLOCKED: The installation of this device is forbidden by system policy. Contact your system administrator.", message, args);
			case SPAPI_E_DRIVER_INSTALL_BLOCKED:
				throw new COMStatus("SPAPI_E_DRIVER_INSTALL_BLOCKED: The installation of this driver is forbidden by system policy. Contact your system administrator.", message, args);
			case SPAPI_E_WRONG_INF_TYPE:
				throw new COMStatus("SPAPI_E_WRONG_INF_TYPE: The specified INF is the wrong type for this operation.", message, args);
			case SPAPI_E_FILE_HASH_NOT_IN_CATALOG:
				throw new COMStatus("SPAPI_E_FILE_HASH_NOT_IN_CATALOG: The hash for the file is not present in the specified catalog file. The file is likely corrupt or the victim of tampering.", message, args);
			case SPAPI_E_DRIVER_STORE_DELETE_FAILED:
				throw new COMStatus("SPAPI_E_DRIVER_STORE_DELETE_FAILED: A problem was encountered while attempting to delete the driver from the store.", message, args);
			case SPAPI_E_UNRECOVERABLE_STACK_OVERFLOW:
				throw new COMStatus("SPAPI_E_UNRECOVERABLE_STACK_OVERFLOW: An unrecoverable stack overflow was encountered.", message, args);
			case SPAPI_E_ERROR_NOT_INSTALLED:
				throw new COMStatus("SPAPI_E_ERROR_NOT_INSTALLED: No installed components were detected.", message, args);
			case SCARD_F_INTERNAL_ERROR:
				throw new COMStatus("SCARD_F_INTERNAL_ERROR: An internal consistency check failed.", message, args);
			case SCARD_E_CANCELLED:
				throw new COMStatus("SCARD_E_CANCELLED: The action was canceled by an SCardCancel request.", message, args);
			case SCARD_E_INVALID_HANDLE:
				throw new COMStatus("SCARD_E_INVALID_HANDLE: The supplied handle was invalid.", message, args);
			case SCARD_E_INVALID_PARAMETER:
				throw new COMStatus("SCARD_E_INVALID_PARAMETER: One or more of the supplied parameters could not be properly interpreted.", message, args);
			case SCARD_E_INVALID_TARGET:
				throw new COMStatus("SCARD_E_INVALID_TARGET: Registry startup information is missing or invalid.", message, args);
			case SCARD_E_NO_MEMORY:
				throw new COMStatus("SCARD_E_NO_MEMORY: Not enough memory available to complete this command.", message, args);
			case SCARD_F_WAITED_TOO_LONG:
				throw new COMStatus("SCARD_F_WAITED_TOO_LONG: An internal consistency timer has expired.", message, args);
			case SCARD_E_INSUFFICIENT_BUFFER:
				throw new COMStatus("SCARD_E_INSUFFICIENT_BUFFER: The data buffer to receive returned data is too small for the returned data.", message, args);
			case SCARD_E_UNKNOWN_READER:
				throw new COMStatus("SCARD_E_UNKNOWN_READER: The specified reader name is not recognized.", message, args);
			case SCARD_E_TIMEOUT:
				throw new COMStatus("SCARD_E_TIMEOUT: The user-specified time-out value has expired.", message, args);
			case SCARD_E_SHARING_VIOLATION:
				throw new COMStatus("SCARD_E_SHARING_VIOLATION: The smart card cannot be accessed because of other connections outstanding.", message, args);
			case SCARD_E_NO_SMARTCARD:
				throw new COMStatus("SCARD_E_NO_SMARTCARD: The operation requires a smart card, but no smart card is currently in the device.", message, args);
			case SCARD_E_UNKNOWN_CARD:
				throw new COMStatus("SCARD_E_UNKNOWN_CARD: The specified smart card name is not recognized.", message, args);
			case SCARD_E_CANT_DISPOSE:
				throw new COMStatus("SCARD_E_CANT_DISPOSE: The system could not dispose of the media in the requested manner.", message, args);
			case SCARD_E_PROTO_MISMATCH:
				throw new COMStatus("SCARD_E_PROTO_MISMATCH: The requested protocols are incompatible with the protocol currently in use with the smart card.", message, args);
			case SCARD_E_NOT_READY:
				throw new COMStatus("SCARD_E_NOT_READY: The reader or smart card is not ready to accept commands.", message, args);
			case SCARD_E_INVALID_VALUE:
				throw new COMStatus("SCARD_E_INVALID_VALUE: One or more of the supplied parameters values could not be properly interpreted.", message, args);
			case SCARD_E_SYSTEM_CANCELLED:
				throw new COMStatus("SCARD_E_SYSTEM_CANCELLED: The action was canceled by the system, presumably to log off or shut down.", message, args);
			case SCARD_F_COMM_ERROR:
				throw new COMStatus("SCARD_F_COMM_ERROR: An internal communications error has been detected.", message, args);
			case SCARD_F_UNKNOWN_ERROR:
				throw new COMStatus("SCARD_F_UNKNOWN_ERROR: An internal error has been detected, but the source is unknown.", message, args);
			case SCARD_E_INVALID_ATR:
				throw new COMStatus("SCARD_E_INVALID_ATR: An automatic terminal recognition (ATR) obtained from the registry is not a valid ATR string.", message, args);
			case SCARD_E_NOT_TRANSACTED:
				throw new COMStatus("SCARD_E_NOT_TRANSACTED: An attempt was made to end a nonexistent transaction.", message, args);
			case SCARD_E_READER_UNAVAILABLE:
				throw new COMStatus("SCARD_E_READER_UNAVAILABLE: The specified reader is not currently available for use.", message, args);
			case SCARD_P_SHUTDOWN:
				throw new COMStatus("SCARD_P_SHUTDOWN: The operation has been aborted to allow the server application to exit.", message, args);
			case SCARD_E_PCI_TOO_SMALL:
				throw new COMStatus("SCARD_E_PCI_TOO_SMALL: The peripheral component interconnect (PCI) Receive buffer was too small.", message, args);
			case SCARD_E_READER_UNSUPPORTED:
				throw new COMStatus("SCARD_E_READER_UNSUPPORTED: The reader driver does not meet minimal requirements for support.", message, args);
			case SCARD_E_DUPLICATE_READER:
				throw new COMStatus("SCARD_E_DUPLICATE_READER: The reader driver did not produce a unique reader name.", message, args);
			case SCARD_E_CARD_UNSUPPORTED:
				throw new COMStatus("SCARD_E_CARD_UNSUPPORTED: The smart card does not meet minimal requirements for support.", message, args);
			case SCARD_E_NO_SERVICE:
				throw new COMStatus("SCARD_E_NO_SERVICE: The smart card resource manager is not running.", message, args);
			case SCARD_E_SERVICE_STOPPED:
				throw new COMStatus("SCARD_E_SERVICE_STOPPED: The smart card resource manager has shut down.", message, args);
			case SCARD_E_UNEXPECTED:
				throw new COMStatus("SCARD_E_UNEXPECTED: An unexpected card error has occurred.", message, args);
			case SCARD_E_ICC_INSTALLATION:
				throw new COMStatus("SCARD_E_ICC_INSTALLATION: No primary provider can be found for the smart card.", message, args);
			case SCARD_E_ICC_CREATEORDER:
				throw new COMStatus("SCARD_E_ICC_CREATEORDER: The requested order of object creation is not supported.", message, args);
			case SCARD_E_UNSUPPORTED_FEATURE:
				throw new COMStatus("SCARD_E_UNSUPPORTED_FEATURE: This smart card does not support the requested feature.", message, args);
			case SCARD_E_DIR_NOT_FOUND:
				throw new COMStatus("SCARD_E_DIR_NOT_FOUND: The identified directory does not exist in the smart card.", message, args);
			case SCARD_E_FILE_NOT_FOUND:
				throw new COMStatus("SCARD_E_FILE_NOT_FOUND: The identified file does not exist in the smart card.", message, args);
			case SCARD_E_NO_DIR:
				throw new COMStatus("SCARD_E_NO_DIR: The supplied path does not represent a smart card directory.", message, args);
			case SCARD_E_NO_FILE:
				throw new COMStatus("SCARD_E_NO_FILE: The supplied path does not represent a smart card file.", message, args);
			case SCARD_E_NO_ACCESS:
				throw new COMStatus("SCARD_E_NO_ACCESS: Access is denied to this file.", message, args);
			case SCARD_E_WRITE_TOO_MANY:
				throw new COMStatus("SCARD_E_WRITE_TOO_MANY: The smart card does not have enough memory to store the information.", message, args);
			case SCARD_E_BAD_SEEK:
				throw new COMStatus("SCARD_E_BAD_SEEK: There was an error trying to set the smart card file object pointer.", message, args);
			case SCARD_E_INVALID_CHV:
				throw new COMStatus("SCARD_E_INVALID_CHV: The supplied PIN is incorrect.", message, args);
			case SCARD_E_UNKNOWN_RES_MNG:
				throw new COMStatus("SCARD_E_UNKNOWN_RES_MNG: An unrecognized error code was returned from a layered component.", message, args);
			case SCARD_E_NO_SUCH_CERTIFICATE:
				throw new COMStatus("SCARD_E_NO_SUCH_CERTIFICATE: The requested certificate does not exist.", message, args);
			case SCARD_E_CERTIFICATE_UNAVAILABLE:
				throw new COMStatus("SCARD_E_CERTIFICATE_UNAVAILABLE: The requested certificate could not be obtained.", message, args);
			case SCARD_E_NO_READERS_AVAILABLE:
				throw new COMStatus("SCARD_E_NO_READERS_AVAILABLE: Cannot find a smart card reader.", message, args);
			case SCARD_E_COMM_DATA_LOST:
				throw new COMStatus("SCARD_E_COMM_DATA_LOST: A communications error with the smart card has been detected. Retry the operation.", message, args);
			case SCARD_E_NO_KEY_CONTAINER:
				throw new COMStatus("SCARD_E_NO_KEY_CONTAINER: The requested key container does not exist on the smart card.", message, args);
			case SCARD_E_SERVER_TOO_BUSY:
				throw new COMStatus("SCARD_E_SERVER_TOO_BUSY: The smart card resource manager is too busy to complete this operation.", message, args);
			case SCARD_W_UNSUPPORTED_CARD:
				throw new COMStatus("SCARD_W_UNSUPPORTED_CARD: The reader cannot communicate with the smart card, due to ATR configuration conflicts.", message, args);
			case SCARD_W_UNRESPONSIVE_CARD:
				throw new COMStatus("SCARD_W_UNRESPONSIVE_CARD: The smart card is not responding to a reset.", message, args);
			case SCARD_W_UNPOWERED_CARD:
				throw new COMStatus("SCARD_W_UNPOWERED_CARD: Power has been removed from the smart card, so that further communication is not possible.", message, args);
			case SCARD_W_RESET_CARD:
				throw new COMStatus("SCARD_W_RESET_CARD: The smart card has been reset, so any shared state information is invalid.", message, args);
			case SCARD_W_REMOVED_CARD:
				throw new COMStatus("SCARD_W_REMOVED_CARD: The smart card has been removed, so that further communication is not possible.", message, args);
			case SCARD_W_SECURITY_VIOLATION:
				throw new COMStatus("SCARD_W_SECURITY_VIOLATION: Access was denied because of a security violation.", message, args);
			case SCARD_W_WRONG_CHV:
				throw new COMStatus("SCARD_W_WRONG_CHV: The card cannot be accessed because the wrong PIN was presented.", message, args);
			case SCARD_W_CHV_BLOCKED:
				throw new COMStatus("SCARD_W_CHV_BLOCKED: The card cannot be accessed because the maximum number of PIN entry attempts has been reached.", message, args);
			case SCARD_W_EOF:
				throw new COMStatus("SCARD_W_EOF: The end of the smart card file has been reached.", message, args);
			case SCARD_W_CANCELLED_BY_USER:
				throw new COMStatus("SCARD_W_CANCELLED_BY_USER: The action was canceled by the user.", message, args);
			case SCARD_W_CARD_NOT_AUTHENTICATED:
				throw new COMStatus("SCARD_W_CARD_NOT_AUTHENTICATED: No PIN was presented to the smart card.", message, args);
			case COMADMIN_E_OBJECTERRORS:
				throw new COMStatus("COMADMIN_E_OBJECTERRORS: Errors occurred accessing one or more objects—the ErrorInfo collection may have more detail.", message, args);
			case COMADMIN_E_OBJECTINVALID:
				throw new COMStatus("COMADMIN_E_OBJECTINVALID: One or more of the object's properties are missing or invalid.", message, args);
			case COMADMIN_E_KEYMISSING:
				throw new COMStatus("COMADMIN_E_KEYMISSING: The object was not found in the catalog.", message, args);
			case COMADMIN_E_ALREADYINSTALLED:
				throw new COMStatus("COMADMIN_E_ALREADYINSTALLED: The object is already registered.", message, args);
			case COMADMIN_E_APP_FILE_WRITEFAIL:
				throw new COMStatus("COMADMIN_E_APP_FILE_WRITEFAIL: An error occurred writing to the application file.", message, args);
			case COMADMIN_E_APP_FILE_READFAIL:
				throw new COMStatus("COMADMIN_E_APP_FILE_READFAIL: An error occurred reading the application file.", message, args);
			case COMADMIN_E_APP_FILE_VERSION:
				throw new COMStatus("COMADMIN_E_APP_FILE_VERSION: Invalid version number in application file.", message, args);
			case COMADMIN_E_BADPATH:
				throw new COMStatus("COMADMIN_E_BADPATH: The file path is invalid.", message, args);
			case COMADMIN_E_APPLICATIONEXISTS:
				throw new COMStatus("COMADMIN_E_APPLICATIONEXISTS: The application is already installed.", message, args);
			case COMADMIN_E_ROLEEXISTS:
				throw new COMStatus("COMADMIN_E_ROLEEXISTS: The role already exists.", message, args);
			case COMADMIN_E_CANTCOPYFILE:
				throw new COMStatus("COMADMIN_E_CANTCOPYFILE: An error occurred copying the file.", message, args);
			case COMADMIN_E_NOUSER:
				throw new COMStatus("COMADMIN_E_NOUSER: One or more users are not valid.", message, args);
			case COMADMIN_E_INVALIDUSERIDS:
				throw new COMStatus("COMADMIN_E_INVALIDUSERIDS: One or more users in the application file are not valid.", message, args);
			case COMADMIN_E_NOREGISTRYCLSID:
				throw new COMStatus("COMADMIN_E_NOREGISTRYCLSID: The component's CLSID is missing or corrupt.", message, args);
			case COMADMIN_E_BADREGISTRYPROGID:
				throw new COMStatus("COMADMIN_E_BADREGISTRYPROGID: The component's programmatic ID is missing or corrupt.", message, args);
			case COMADMIN_E_AUTHENTICATIONLEVEL:
				throw new COMStatus("COMADMIN_E_AUTHENTICATIONLEVEL: Unable to set required authentication level for update request.", message, args);
			case COMADMIN_E_USERPASSWDNOTVALID:
				throw new COMStatus("COMADMIN_E_USERPASSWDNOTVALID: The identity or password set on the application is not valid.", message, args);
			case COMADMIN_E_CLSIDORIIDMISMATCH:
				throw new COMStatus("COMADMIN_E_CLSIDORIIDMISMATCH: Application file CLSIDs or instance identifiers (IIDs) do not match corresponding DLLs.", message, args);
			case COMADMIN_E_REMOTEINTERFACE:
				throw new COMStatus("COMADMIN_E_REMOTEINTERFACE: Interface information is either missing or changed.", message, args);
			case COMADMIN_E_DLLREGISTERSERVER:
				throw new COMStatus("COMADMIN_E_DLLREGISTERSERVER: DllRegisterServer failed on component install.", message, args);
			case COMADMIN_E_NOSERVERSHARE:
				throw new COMStatus("COMADMIN_E_NOSERVERSHARE: No server file share available.", message, args);
			case COMADMIN_E_DLLLOADFAILED:
				throw new COMStatus("COMADMIN_E_DLLLOADFAILED: DLL could not be loaded.", message, args);
			case COMADMIN_E_BADREGISTRYLIBID:
				throw new COMStatus("COMADMIN_E_BADREGISTRYLIBID: The registered TypeLib ID is not valid.", message, args);
			case COMADMIN_E_APPDIRNOTFOUND:
				throw new COMStatus("COMADMIN_E_APPDIRNOTFOUND: Application install directory not found.", message, args);
			case COMADMIN_E_REGISTRARFAILED:
				throw new COMStatus("COMADMIN_E_REGISTRARFAILED: Errors occurred while in the component registrar.", message, args);
			case COMADMIN_E_COMPFILE_DOESNOTEXIST:
				throw new COMStatus("COMADMIN_E_COMPFILE_DOESNOTEXIST: The file does not exist.", message, args);
			case COMADMIN_E_COMPFILE_LOADDLLFAIL:
				throw new COMStatus("COMADMIN_E_COMPFILE_LOADDLLFAIL: The DLL could not be loaded.", message, args);
			case COMADMIN_E_COMPFILE_GETCLASSOBJ:
				throw new COMStatus("COMADMIN_E_COMPFILE_GETCLASSOBJ: GetClassObject failed in the DLL.", message, args);
			case COMADMIN_E_COMPFILE_CLASSNOTAVAIL:
				throw new COMStatus("COMADMIN_E_COMPFILE_CLASSNOTAVAIL: The DLL does not support the components listed in the TypeLib.", message, args);
			case COMADMIN_E_COMPFILE_BADTLB:
				throw new COMStatus("COMADMIN_E_COMPFILE_BADTLB: The TypeLib could not be loaded.", message, args);
			case COMADMIN_E_COMPFILE_NOTINSTALLABLE:
				throw new COMStatus("COMADMIN_E_COMPFILE_NOTINSTALLABLE: The file does not contain components or component information.", message, args);
			case COMADMIN_E_NOTCHANGEABLE:
				throw new COMStatus("COMADMIN_E_NOTCHANGEABLE: Changes to this object and its subobjects have been disabled.", message, args);
			case COMADMIN_E_NOTDELETEABLE:
				throw new COMStatus("COMADMIN_E_NOTDELETEABLE: The delete function has been disabled for this object.", message, args);
			case COMADMIN_E_SESSION:
				throw new COMStatus("COMADMIN_E_SESSION: The server catalog version is not supported.", message, args);
			case COMADMIN_E_COMP_MOVE_LOCKED:
				throw new COMStatus("COMADMIN_E_COMP_MOVE_LOCKED: The component move was disallowed because the source or destination application is either a system application or currently locked against changes.", message, args);
			case COMADMIN_E_COMP_MOVE_BAD_DEST:
				throw new COMStatus("COMADMIN_E_COMP_MOVE_BAD_DEST: The component move failed because the destination application no longer exists.", message, args);
			case COMADMIN_E_REGISTERTLB:
				throw new COMStatus("COMADMIN_E_REGISTERTLB: The system was unable to register the TypeLib.", message, args);
			case COMADMIN_E_SYSTEMAPP:
				throw new COMStatus("COMADMIN_E_SYSTEMAPP: This operation cannot be performed on the system application.", message, args);
			case COMADMIN_E_COMPFILE_NOREGISTRAR:
				throw new COMStatus("COMADMIN_E_COMPFILE_NOREGISTRAR: The component registrar referenced in this file is not available.", message, args);
			case COMADMIN_E_COREQCOMPINSTALLED:
				throw new COMStatus("COMADMIN_E_COREQCOMPINSTALLED: A component in the same DLL is already installed.", message, args);
			case COMADMIN_E_SERVICENOTINSTALLED:
				throw new COMStatus("COMADMIN_E_SERVICENOTINSTALLED: The service is not installed.", message, args);
			case COMADMIN_E_PROPERTYSAVEFAILED:
				throw new COMStatus("COMADMIN_E_PROPERTYSAVEFAILED: One or more property settings are either invalid or in conflict with each other.", message, args);
			case COMADMIN_E_OBJECTEXISTS:
				throw new COMStatus("COMADMIN_E_OBJECTEXISTS: The object you are attempting to add or rename already exists.", message, args);
			case COMADMIN_E_COMPONENTEXISTS:
				throw new COMStatus("COMADMIN_E_COMPONENTEXISTS: The component already exists.", message, args);
			case COMADMIN_E_REGFILE_CORRUPT:
				throw new COMStatus("COMADMIN_E_REGFILE_CORRUPT: The registration file is corrupt.", message, args);
			case COMADMIN_E_PROPERTY_OVERFLOW:
				throw new COMStatus("COMADMIN_E_PROPERTY_OVERFLOW: The property value is too large.", message, args);
			case COMADMIN_E_NOTINREGISTRY:
				throw new COMStatus("COMADMIN_E_NOTINREGISTRY: Object was not found in registry.", message, args);
			case COMADMIN_E_OBJECTNOTPOOLABLE:
				throw new COMStatus("COMADMIN_E_OBJECTNOTPOOLABLE: This object cannot be pooled.", message, args);
			case COMADMIN_E_APPLID_MATCHES_CLSID:
				throw new COMStatus("COMADMIN_E_APPLID_MATCHES_CLSID: A CLSID with the same GUID as the new application ID is already installed on this machine.", message, args);
			case COMADMIN_E_ROLE_DOES_NOT_EXIST:
				throw new COMStatus("COMADMIN_E_ROLE_DOES_NOT_EXIST: A role assigned to a component, interface, or method did not exist in the application.", message, args);
			case COMADMIN_E_START_APP_NEEDS_COMPONENTS:
				throw new COMStatus("COMADMIN_E_START_APP_NEEDS_COMPONENTS: You must have components in an application to start the application.", message, args);
			case COMADMIN_E_REQUIRES_DIFFERENT_PLATFORM:
				throw new COMStatus("COMADMIN_E_REQUIRES_DIFFERENT_PLATFORM: This operation is not enabled on this platform.", message, args);
			case COMADMIN_E_CAN_NOT_EXPORT_APP_PROXY:
				throw new COMStatus("COMADMIN_E_CAN_NOT_EXPORT_APP_PROXY: Application proxy is not exportable.", message, args);
			case COMADMIN_E_CAN_NOT_START_APP:
				throw new COMStatus("COMADMIN_E_CAN_NOT_START_APP: Failed to start application because it is either a library application or an application proxy.", message, args);
			case COMADMIN_E_CAN_NOT_EXPORT_SYS_APP:
				throw new COMStatus("COMADMIN_E_CAN_NOT_EXPORT_SYS_APP: System application is not exportable.", message, args);
			case COMADMIN_E_CANT_SUBSCRIBE_TO_COMPONENT:
				throw new COMStatus("COMADMIN_E_CANT_SUBSCRIBE_TO_COMPONENT: Cannot subscribe to this component (the component may have been imported).", message, args);
			case COMADMIN_E_EVENTCLASS_CANT_BE_SUBSCRIBER:
				throw new COMStatus("COMADMIN_E_EVENTCLASS_CANT_BE_SUBSCRIBER: An event class cannot also be a subscriber component.", message, args);
			case COMADMIN_E_LIB_APP_PROXY_INCOMPATIBLE:
				throw new COMStatus("COMADMIN_E_LIB_APP_PROXY_INCOMPATIBLE: Library applications and application proxies are incompatible.", message, args);
			case COMADMIN_E_BASE_PARTITION_ONLY:
				throw new COMStatus("COMADMIN_E_BASE_PARTITION_ONLY: This function is valid for the base partition only.", message, args);
			case COMADMIN_E_START_APP_DISABLED:
				throw new COMStatus("COMADMIN_E_START_APP_DISABLED: You cannot start an application that has been disabled.", message, args);
			case COMADMIN_E_CAT_DUPLICATE_PARTITION_NAME:
				throw new COMStatus("COMADMIN_E_CAT_DUPLICATE_PARTITION_NAME: The specified partition name is already in use on this computer.", message, args);
			case COMADMIN_E_CAT_INVALID_PARTITION_NAME:
				throw new COMStatus("COMADMIN_E_CAT_INVALID_PARTITION_NAME: The specified partition name is invalid. Check that the name contains at least one visible character.", message, args);
			case COMADMIN_E_CAT_PARTITION_IN_USE:
				throw new COMStatus("COMADMIN_E_CAT_PARTITION_IN_USE: The partition cannot be deleted because it is the default partition for one or more users.", message, args);
			case COMADMIN_E_FILE_PARTITION_DUPLICATE_FILES:
				throw new COMStatus("COMADMIN_E_FILE_PARTITION_DUPLICATE_FILES: The partition cannot be exported because one or more components in the partition have the same file name.", message, args);
			case COMADMIN_E_CAT_IMPORTED_COMPONENTS_NOT_ALLOWED:
				throw new COMStatus("COMADMIN_E_CAT_IMPORTED_COMPONENTS_NOT_ALLOWED: Applications that contain one or more imported components cannot be installed into a nonbase partition.", message, args);
			case COMADMIN_E_AMBIGUOUS_APPLICATION_NAME:
				throw new COMStatus("COMADMIN_E_AMBIGUOUS_APPLICATION_NAME: The application name is not unique and cannot be resolved to an application ID.", message, args);
			case COMADMIN_E_AMBIGUOUS_PARTITION_NAME:
				throw new COMStatus("COMADMIN_E_AMBIGUOUS_PARTITION_NAME: The partition name is not unique and cannot be resolved to a partition ID.", message, args);
			case COMADMIN_E_REGDB_NOTINITIALIZED:
				throw new COMStatus("COMADMIN_E_REGDB_NOTINITIALIZED: The COM+ registry database has not been initialized.", message, args);
			case COMADMIN_E_REGDB_NOTOPEN:
				throw new COMStatus("COMADMIN_E_REGDB_NOTOPEN: The COM+ registry database is not open.", message, args);
			case COMADMIN_E_REGDB_SYSTEMERR:
				throw new COMStatus("COMADMIN_E_REGDB_SYSTEMERR: The COM+ registry database detected a system error.", message, args);
			case COMADMIN_E_REGDB_ALREADYRUNNING:
				throw new COMStatus("COMADMIN_E_REGDB_ALREADYRUNNING: The COM+ registry database is already running.", message, args);
			case COMADMIN_E_MIG_VERSIONNOTSUPPORTED:
				throw new COMStatus("COMADMIN_E_MIG_VERSIONNOTSUPPORTED: This version of the COM+ registry database cannot be migrated.", message, args);
			case COMADMIN_E_MIG_SCHEMANOTFOUND:
				throw new COMStatus("COMADMIN_E_MIG_SCHEMANOTFOUND: The schema version to be migrated could not be found in the COM+ registry database.", message, args);
			case COMADMIN_E_CAT_BITNESSMISMATCH:
				throw new COMStatus("COMADMIN_E_CAT_BITNESSMISMATCH: There was a type mismatch between binaries.", message, args);
			case COMADMIN_E_CAT_UNACCEPTABLEBITNESS:
				throw new COMStatus("COMADMIN_E_CAT_UNACCEPTABLEBITNESS: A binary of unknown or invalid type was provided.", message, args);
			case COMADMIN_E_CAT_WRONGAPPBITNESS:
				throw new COMStatus("COMADMIN_E_CAT_WRONGAPPBITNESS: There was a type mismatch between a binary and an application.", message, args);
			case COMADMIN_E_CAT_PAUSE_RESUME_NOT_SUPPORTED:
				throw new COMStatus("COMADMIN_E_CAT_PAUSE_RESUME_NOT_SUPPORTED: The application cannot be paused or resumed.", message, args);
			case COMADMIN_E_CAT_SERVERFAULT:
				throw new COMStatus("COMADMIN_E_CAT_SERVERFAULT: The COM+ catalog server threw an exception during execution.", message, args);
			case COMQC_E_APPLICATION_NOT_QUEUED:
				throw new COMStatus("COMQC_E_APPLICATION_NOT_QUEUED: Only COM+ applications marked \"queued\" can be invoked using the \"queue\" moniker.", message, args);
			case COMQC_E_NO_QUEUEABLE_INTERFACES:
				throw new COMStatus("COMQC_E_NO_QUEUEABLE_INTERFACES: At least one interface must be marked \"queued\" to create a queued component instance with the \"queue\" moniker.", message, args);
			case COMQC_E_QUEUING_SERVICE_NOT_AVAILABLE:
				throw new COMStatus("COMQC_E_QUEUING_SERVICE_NOT_AVAILABLE: Message Queuing is required for the requested operation and is not installed.", message, args);
			case COMQC_E_NO_IPERSISTSTREAM:
				throw new COMStatus("COMQC_E_NO_IPERSISTSTREAM: Unable to marshal an interface that does not support IPersistStream.", message, args);
			case COMQC_E_BAD_MESSAGE:
				throw new COMStatus("COMQC_E_BAD_MESSAGE: The message is improperly formatted or was damaged in transit.", message, args);
			case COMQC_E_UNAUTHENTICATED:
				throw new COMStatus("COMQC_E_UNAUTHENTICATED: An unauthenticated message was received by an application that accepts only authenticated messages.", message, args);
			case COMQC_E_UNTRUSTED_ENQUEUER:
				throw new COMStatus("COMQC_E_UNTRUSTED_ENQUEUER: The message was requeued or moved by a user not in the QC Trusted User \"role\".", message, args);
			case MSDTC_E_DUPLICATE_RESOURCE:
				throw new COMStatus("MSDTC_E_DUPLICATE_RESOURCE: Cannot create a duplicate resource of type Distributed Transaction Coordinator.", message, args);
			case COMADMIN_E_OBJECT_PARENT_MISSING:
				throw new COMStatus("COMADMIN_E_OBJECT_PARENT_MISSING: One of the objects being inserted or updated does not belong to a valid parent collection.", message, args);
			case COMADMIN_E_OBJECT_DOES_NOT_EXIST:
				throw new COMStatus("COMADMIN_E_OBJECT_DOES_NOT_EXIST: One of the specified objects cannot be found.", message, args);
			case COMADMIN_E_APP_NOT_RUNNING:
				throw new COMStatus("COMADMIN_E_APP_NOT_RUNNING: The specified application is not currently running.", message, args);
			case COMADMIN_E_INVALID_PARTITION:
				throw new COMStatus("COMADMIN_E_INVALID_PARTITION: The partitions specified are not valid.", message, args);
			case COMADMIN_E_SVCAPP_NOT_POOLABLE_OR_RECYCLABLE:
				throw new COMStatus("COMADMIN_E_SVCAPP_NOT_POOLABLE_OR_RECYCLABLE: COM+ applications that run as Windows NT service may not be pooled or recycled.", message, args);
			case COMADMIN_E_USER_IN_SET:
				throw new COMStatus("COMADMIN_E_USER_IN_SET: One or more users are already assigned to a local partition set.", message, args);
			case COMADMIN_E_CANTRECYCLELIBRARYAPPS:
				throw new COMStatus("COMADMIN_E_CANTRECYCLELIBRARYAPPS: Library applications may not be recycled.", message, args);
			case COMADMIN_E_CANTRECYCLESERVICEAPPS:
				throw new COMStatus("COMADMIN_E_CANTRECYCLESERVICEAPPS: Applications running as Windows NT services may not be recycled.", message, args);
			case COMADMIN_E_PROCESSALREADYRECYCLED:
				throw new COMStatus("COMADMIN_E_PROCESSALREADYRECYCLED: The process has already been recycled.", message, args);
			case COMADMIN_E_PAUSEDPROCESSMAYNOTBERECYCLED:
				throw new COMStatus("COMADMIN_E_PAUSEDPROCESSMAYNOTBERECYCLED: A paused process may not be recycled.", message, args);
			case COMADMIN_E_CANTMAKEINPROCSERVICE:
				throw new COMStatus("COMADMIN_E_CANTMAKEINPROCSERVICE: Library applications may not be Windows NT services.", message, args);
			case COMADMIN_E_PROGIDINUSEBYCLSID:
				throw new COMStatus("COMADMIN_E_PROGIDINUSEBYCLSID: The ProgID provided to the copy operation is invalid. The ProgID is in use by another registered CLSID.", message, args);
			case COMADMIN_E_DEFAULT_PARTITION_NOT_IN_SET:
				throw new COMStatus("COMADMIN_E_DEFAULT_PARTITION_NOT_IN_SET: The partition specified as the default is not a member of the partition set.", message, args);
			case COMADMIN_E_RECYCLEDPROCESSMAYNOTBEPAUSED:
				throw new COMStatus("COMADMIN_E_RECYCLEDPROCESSMAYNOTBEPAUSED: A recycled process may not be paused.", message, args);
			case COMADMIN_E_PARTITION_ACCESSDENIED:
				throw new COMStatus("COMADMIN_E_PARTITION_ACCESSDENIED: Access to the specified partition is denied.", message, args);
			case COMADMIN_E_PARTITION_MSI_ONLY:
				throw new COMStatus("COMADMIN_E_PARTITION_MSI_ONLY: Only application files (*.msi files) can be installed into partitions.", message, args);
			case COMADMIN_E_LEGACYCOMPS_NOT_ALLOWED_IN_1_0_FORMAT:
				throw new COMStatus("COMADMIN_E_LEGACYCOMPS_NOT_ALLOWED_IN_1_0_FORMAT: Applications containing one or more legacy components may not be exported to 1.0 format.", message, args);
			case COMADMIN_E_LEGACYCOMPS_NOT_ALLOWED_IN_NONBASE_PARTITIONS:
				throw new COMStatus("COMADMIN_E_LEGACYCOMPS_NOT_ALLOWED_IN_NONBASE_PARTITIONS: Legacy components may not exist in nonbase partitions.", message, args);
			case COMADMIN_E_COMP_MOVE_SOURCE:
				throw new COMStatus("COMADMIN_E_COMP_MOVE_SOURCE: A component cannot be moved (or copied) from the System Application, an application proxy, or a nonchangeable application.", message, args);
			case COMADMIN_E_COMP_MOVE_DEST:
				throw new COMStatus("COMADMIN_E_COMP_MOVE_DEST: A component cannot be moved (or copied) to the System Application, an application proxy or a nonchangeable application.", message, args);
			case COMADMIN_E_COMP_MOVE_PRIVATE:
				throw new COMStatus("COMADMIN_E_COMP_MOVE_PRIVATE: A private component cannot be moved (or copied) to a library application or to the base partition.", message, args);
			case COMADMIN_E_BASEPARTITION_REQUIRED_IN_SET:
				throw new COMStatus("COMADMIN_E_BASEPARTITION_REQUIRED_IN_SET: The Base Application Partition exists in all partition sets and cannot be removed.", message, args);
			case COMADMIN_E_CANNOT_ALIAS_EVENTCLASS:
				throw new COMStatus("COMADMIN_E_CANNOT_ALIAS_EVENTCLASS: Alas, Event Class components cannot be aliased.", message, args);
			case COMADMIN_E_PRIVATE_ACCESSDENIED:
				throw new COMStatus("COMADMIN_E_PRIVATE_ACCESSDENIED: Access is denied because the component is private.", message, args);
			case COMADMIN_E_SAFERINVALID:
				throw new COMStatus("COMADMIN_E_SAFERINVALID: The specified SAFER level is invalid.", message, args);
			case COMADMIN_E_REGISTRY_ACCESSDENIED:
				throw new COMStatus("COMADMIN_E_REGISTRY_ACCESSDENIED: The specified user cannot write to the system registry.", message, args);
			case COMADMIN_E_PARTITIONS_DISABLED:
				throw new COMStatus("COMADMIN_E_PARTITIONS_DISABLED: COM+ partitions are currently disabled.", message, args);
			case ERROR_FLT_NO_HANDLER_DEFINED:
				throw new COMStatus("ERROR_FLT_NO_HANDLER_DEFINED: A handler was not defined by the filter for this operation.", message, args);
			case ERROR_FLT_CONTEXT_ALREADY_DEFINED:
				throw new COMStatus("ERROR_FLT_CONTEXT_ALREADY_DEFINED: A context is already defined for this object.", message, args);
			case ERROR_FLT_INVALID_ASYNCHRONOUS_REQUEST:
				throw new COMStatus("ERROR_FLT_INVALID_ASYNCHRONOUS_REQUEST: Asynchronous requests are not valid for this operation.", message, args);
			case ERROR_FLT_DISALLOW_FAST_IO:
				throw new COMStatus("ERROR_FLT_DISALLOW_FAST_IO: Disallow the Fast IO path for this operation.", message, args);
			case ERROR_FLT_INVALID_NAME_REQUEST:
				throw new COMStatus("ERROR_FLT_INVALID_NAME_REQUEST: An invalid name request was made. The name requested cannot be retrieved at this time.", message, args);
			case ERROR_FLT_NOT_SAFE_TO_POST_OPERATION:
				throw new COMStatus("ERROR_FLT_NOT_SAFE_TO_POST_OPERATION: Posting this operation to a worker thread for further processing is not safe at this time because it could lead to a system deadlock.", message, args);
			case ERROR_FLT_NOT_INITIALIZED:
				throw new COMStatus("ERROR_FLT_NOT_INITIALIZED: The Filter Manager was not initialized when a filter tried to register. Be sure that the Filter Manager is being loaded as a driver.", message, args);
			case ERROR_FLT_FILTER_NOT_READY:
				throw new COMStatus("ERROR_FLT_FILTER_NOT_READY: The filter is not ready for attachment to volumes because it has not finished initializing (FltStartFiltering has not been called).", message, args);
			case ERROR_FLT_POST_OPERATION_CLEANUP:
				throw new COMStatus("ERROR_FLT_POST_OPERATION_CLEANUP: The filter must clean up any operation-specific context at this time because it is being removed from the system before the operation is completed by the lower drivers.", message, args);
			case ERROR_FLT_INTERNAL_ERROR:
				throw new COMStatus("ERROR_FLT_INTERNAL_ERROR: The Filter Manager had an internal error from which it cannot recover; therefore, the operation has been failed. This is usually the result of a filter returning an invalid value from a preoperation callback.", message, args);
			case ERROR_FLT_DELETING_OBJECT:
				throw new COMStatus("ERROR_FLT_DELETING_OBJECT: The object specified for this action is in the process of being deleted; therefore, the action requested cannot be completed at this time.", message, args);
			case ERROR_FLT_MUST_BE_NONPAGED_POOL:
				throw new COMStatus("ERROR_FLT_MUST_BE_NONPAGED_POOL: Nonpaged pool must be used for this type of context.", message, args);
			case ERROR_FLT_DUPLICATE_ENTRY:
				throw new COMStatus("ERROR_FLT_DUPLICATE_ENTRY: A duplicate handler definition has been provided for an operation.", message, args);
			case ERROR_FLT_CBDQ_DISABLED:
				throw new COMStatus("ERROR_FLT_CBDQ_DISABLED: The callback data queue has been disabled.", message, args);
			case ERROR_FLT_DO_NOT_ATTACH:
				throw new COMStatus("ERROR_FLT_DO_NOT_ATTACH: Do not attach the filter to the volume at this time.", message, args);
			case ERROR_FLT_DO_NOT_DETACH:
				throw new COMStatus("ERROR_FLT_DO_NOT_DETACH: Do not detach the filter from the volume at this time.", message, args);
			case ERROR_FLT_INSTANCE_ALTITUDE_COLLISION:
				throw new COMStatus("ERROR_FLT_INSTANCE_ALTITUDE_COLLISION: An instance already exists at this altitude on the volume specified.", message, args);
			case ERROR_FLT_INSTANCE_NAME_COLLISION:
				throw new COMStatus("ERROR_FLT_INSTANCE_NAME_COLLISION: An instance already exists with this name on the volume specified.", message, args);
			case ERROR_FLT_FILTER_NOT_FOUND:
				throw new COMStatus("ERROR_FLT_FILTER_NOT_FOUND: The system could not find the filter specified.", message, args);
			case ERROR_FLT_VOLUME_NOT_FOUND:
				throw new COMStatus("ERROR_FLT_VOLUME_NOT_FOUND: The system could not find the volume specified.", message, args);
			case ERROR_FLT_INSTANCE_NOT_FOUND:
				throw new COMStatus("ERROR_FLT_INSTANCE_NOT_FOUND: The system could not find the instance specified.", message, args);
			case ERROR_FLT_CONTEXT_ALLOCATION_NOT_FOUND:
				throw new COMStatus("ERROR_FLT_CONTEXT_ALLOCATION_NOT_FOUND: No registered context allocation definition was found for the given request.", message, args);
			case ERROR_FLT_INVALID_CONTEXT_REGISTRATION:
				throw new COMStatus("ERROR_FLT_INVALID_CONTEXT_REGISTRATION: An invalid parameter was specified during context registration.", message, args);
			case ERROR_FLT_NAME_CACHE_MISS:
				throw new COMStatus("ERROR_FLT_NAME_CACHE_MISS: The name requested was not found in the Filter Manager name cache and could not be retrieved from the file system.", message, args);
			case ERROR_FLT_NO_DEVICE_OBJECT:
				throw new COMStatus("ERROR_FLT_NO_DEVICE_OBJECT: The requested device object does not exist for the given volume.", message, args);
			case ERROR_FLT_VOLUME_ALREADY_MOUNTED:
				throw new COMStatus("ERROR_FLT_VOLUME_ALREADY_MOUNTED: The specified volume is already mounted.", message, args);
			case ERROR_FLT_ALREADY_ENLISTED:
				throw new COMStatus("ERROR_FLT_ALREADY_ENLISTED: The specified Transaction Context is already enlisted in a transaction.", message, args);
			case ERROR_FLT_CONTEXT_ALREADY_LINKED:
				throw new COMStatus("ERROR_FLT_CONTEXT_ALREADY_LINKED: The specified context is already attached to another object.", message, args);
			case ERROR_FLT_NO_WAITER_FOR_REPLY:
				throw new COMStatus("ERROR_FLT_NO_WAITER_FOR_REPLY: No waiter is present for the filter's reply to this message.", message, args);
			case ERROR_HUNG_DISPLAY_DRIVER_THREAD:
				throw new COMStatus("ERROR_HUNG_DISPLAY_DRIVER_THREAD: {Display Driver Stopped Responding} The %hs display driver has stopped working normally. Save your work and reboot the system to restore full display functionality. The next time you reboot the machine a dialog will be displayed giving you a chance to report this failure to Microsoft.", message, args);
			case ERROR_MONITOR_NO_DESCRIPTOR:
				throw new COMStatus("ERROR_MONITOR_NO_DESCRIPTOR: Monitor descriptor could not be obtained.", message, args);
			case ERROR_MONITOR_UNKNOWN_DESCRIPTOR_FORMAT:
				throw new COMStatus("ERROR_MONITOR_UNKNOWN_DESCRIPTOR_FORMAT: Format of the obtained monitor descriptor is not supported by this release.", message, args);
			case DWM_E_COMPOSITIONDISABLED:
				throw new COMStatus("DWM_E_COMPOSITIONDISABLED: {Desktop Composition is Disabled} The operation could not be completed because desktop composition is disabled.", message, args);
			case DWM_E_REMOTING_NOT_SUPPORTED:
				throw new COMStatus("DWM_E_REMOTING_NOT_SUPPORTED: {Some Desktop Composition APIs Are Not Supported While Remoting} Some desktop composition APIs are not supported while remoting. The operation is not supported while running in a remote session.", message, args);
			case DWM_E_NO_REDIRECTION_SURFACE_AVAILABLE:
				throw new COMStatus("DWM_E_NO_REDIRECTION_SURFACE_AVAILABLE: {No DWM Redirection Surface is Available} The Desktop Window Manager (DWM) was unable to provide a redirection surface to complete the DirectX present.", message, args);
			case DWM_E_NOT_QUEUING_PRESENTS:
				throw new COMStatus("DWM_E_NOT_QUEUING_PRESENTS: {DWM Is Not Queuing Presents for the Specified Window} The window specified is not currently using queued presents.", message, args);
			case TPM_E_ERROR_MASK:
				throw new COMStatus("TPM_E_ERROR_MASK: This is an error mask to convert Trusted Platform Module (TPM) hardware errors to Win32 errors.", message, args);
			case TPM_E_AUTHFAIL:
				throw new COMStatus("TPM_E_AUTHFAIL: Authentication failed.", message, args);
			case TPM_E_BADINDEX:
				throw new COMStatus("TPM_E_BADINDEX: The index to a Platform Configuration Register (PCR), DIR, or other register is incorrect.", message, args);
			case TPM_E_BAD_PARAMETER:
				throw new COMStatus("TPM_E_BAD_PARAMETER: One or more parameters are bad.", message, args);
			case TPM_E_AUDITFAILURE:
				throw new COMStatus("TPM_E_AUDITFAILURE: An operation completed successfully but the auditing of that operation failed.", message, args);
			case TPM_E_CLEAR_DISABLED:
				throw new COMStatus("TPM_E_CLEAR_DISABLED: The clear disable flag is set and all clear operations now require physical access.", message, args);
			case TPM_E_DEACTIVATED:
				throw new COMStatus("TPM_E_DEACTIVATED: The TPM is deactivated.", message, args);
			case TPM_E_DISABLED:
				throw new COMStatus("TPM_E_DISABLED: The TPM is disabled.", message, args);
			case TPM_E_DISABLED_CMD:
				throw new COMStatus("TPM_E_DISABLED_CMD: The target command has been disabled.", message, args);
			case TPM_E_FAIL:
				throw new COMStatus("TPM_E_FAIL: The operation failed.", message, args);
			case TPM_E_BAD_ORDINAL:
				throw new COMStatus("TPM_E_BAD_ORDINAL: The ordinal was unknown or inconsistent.", message, args);
			case TPM_E_INSTALL_DISABLED:
				throw new COMStatus("TPM_E_INSTALL_DISABLED: The ability to install an owner is disabled.", message, args);
			case TPM_E_INVALID_KEYHANDLE:
				throw new COMStatus("TPM_E_INVALID_KEYHANDLE: The key handle cannot be interpreted.", message, args);
			case TPM_E_KEYNOTFOUND:
				throw new COMStatus("TPM_E_KEYNOTFOUND: The key handle points to an invalid key.", message, args);
			case TPM_E_INAPPROPRIATE_ENC:
				throw new COMStatus("TPM_E_INAPPROPRIATE_ENC: Unacceptable encryption scheme.", message, args);
			case TPM_E_MIGRATEFAIL:
				throw new COMStatus("TPM_E_MIGRATEFAIL: Migration authorization failed.", message, args);
			case TPM_E_INVALID_PCR_INFO:
				throw new COMStatus("TPM_E_INVALID_PCR_INFO: PCR information could not be interpreted.", message, args);
			case TPM_E_NOSPACE:
				throw new COMStatus("TPM_E_NOSPACE: No room to load key.", message, args);
			case TPM_E_NOSRK:
				throw new COMStatus("TPM_E_NOSRK: There is no storage root key (SRK) set.", message, args);
			case TPM_E_NOTSEALED_BLOB:
				throw new COMStatus("TPM_E_NOTSEALED_BLOB: An encrypted blob is invalid or was not created by this TPM.", message, args);
			case TPM_E_OWNER_SET:
				throw new COMStatus("TPM_E_OWNER_SET: There is already an owner.", message, args);
			case TPM_E_RESOURCES:
				throw new COMStatus("TPM_E_RESOURCES: The TPM has insufficient internal resources to perform the requested action.", message, args);
			case TPM_E_SHORTRANDOM:
				throw new COMStatus("TPM_E_SHORTRANDOM: A random string was too short.", message, args);
			case TPM_E_SIZE:
				throw new COMStatus("TPM_E_SIZE: The TPM does not have the space to perform the operation.", message, args);
			case TPM_E_WRONGPCRVAL:
				throw new COMStatus("TPM_E_WRONGPCRVAL: The named PCR value does not match the current PCR value.", message, args);
			case TPM_E_BAD_PARAM_SIZE:
				throw new COMStatus("TPM_E_BAD_PARAM_SIZE: The paramSize argument to the command has the incorrect value.", message, args);
			case TPM_E_SHA_THREAD:
				throw new COMStatus("TPM_E_SHA_THREAD: There is no existing SHA-1 thread.", message, args);
			case TPM_E_SHA_ERROR:
				throw new COMStatus("TPM_E_SHA_ERROR: The calculation is unable to proceed because the existing SHA-1 thread has already encountered an error.", message, args);
			case TPM_E_FAILEDSELFTEST:
				throw new COMStatus("TPM_E_FAILEDSELFTEST: Self-test has failed and the TPM has shut down.", message, args);
			case TPM_E_AUTH2FAIL:
				throw new COMStatus("TPM_E_AUTH2FAIL: The authorization for the second key in a two-key function failed authorization.", message, args);
			case TPM_E_BADTAG:
				throw new COMStatus("TPM_E_BADTAG: The tag value sent to for a command is invalid.", message, args);
			case TPM_E_IOERROR:
				throw new COMStatus("TPM_E_IOERROR: An I/O error occurred transmitting information to the TPM.", message, args);
			case TPM_E_ENCRYPT_ERROR:
				throw new COMStatus("TPM_E_ENCRYPT_ERROR: The encryption process had a problem.", message, args);
			case TPM_E_DECRYPT_ERROR:
				throw new COMStatus("TPM_E_DECRYPT_ERROR: The decryption process did not complete.", message, args);
			case TPM_E_INVALID_AUTHHANDLE:
				throw new COMStatus("TPM_E_INVALID_AUTHHANDLE: An invalid handle was used.", message, args);
			case TPM_E_NO_ENDORSEMENT:
				throw new COMStatus("TPM_E_NO_ENDORSEMENT: The TPM does not have an endorsement key (EK) installed.", message, args);
			case TPM_E_INVALID_KEYUSAGE:
				throw new COMStatus("TPM_E_INVALID_KEYUSAGE: The usage of a key is not allowed.", message, args);
			case TPM_E_WRONG_ENTITYTYPE:
				throw new COMStatus("TPM_E_WRONG_ENTITYTYPE: The submitted entity type is not allowed.", message, args);
			case TPM_E_INVALID_POSTINIT:
				throw new COMStatus("TPM_E_INVALID_POSTINIT: The command was received in the wrong sequence relative to TPM_Init and a subsequent TPM_Startup.", message, args);
			case TPM_E_INAPPROPRIATE_SIG:
				throw new COMStatus("TPM_E_INAPPROPRIATE_SIG: Signed data cannot include additional DER information.", message, args);
			case TPM_E_BAD_KEY_PROPERTY:
				throw new COMStatus("TPM_E_BAD_KEY_PROPERTY: The key properties in TPM_KEY_PARMs are not supported by this TPM.", message, args);
			case TPM_E_BAD_MIGRATION:
				throw new COMStatus("TPM_E_BAD_MIGRATION: The migration properties of this key are incorrect.", message, args);
			case TPM_E_BAD_SCHEME:
				throw new COMStatus("TPM_E_BAD_SCHEME: The signature or encryption scheme for this key is incorrect or not permitted in this situation.", message, args);
			case TPM_E_BAD_DATASIZE:
				throw new COMStatus("TPM_E_BAD_DATASIZE: The size of the data (or blob) parameter is bad or inconsistent with the referenced key.", message, args);
			case TPM_E_BAD_MODE:
				throw new COMStatus("TPM_E_BAD_MODE: A mode parameter is bad, such as capArea or subCapArea for TPM_GetCapability, physicalPresence parameter for TPM_PhysicalPresence, or migrationType for TPM_CreateMigrationBlob.", message, args);
			case TPM_E_BAD_PRESENCE:
				throw new COMStatus("TPM_E_BAD_PRESENCE: Either the physicalPresence or physicalPresenceLock bits have the wrong value.", message, args);
			case TPM_E_BAD_VERSION:
				throw new COMStatus("TPM_E_BAD_VERSION: The TPM cannot perform this version of the capability.", message, args);
			case TPM_E_NO_WRAP_TRANSPORT:
				throw new COMStatus("TPM_E_NO_WRAP_TRANSPORT: The TPM does not allow for wrapped transport sessions.", message, args);
			case TPM_E_AUDITFAIL_UNSUCCESSFUL:
				throw new COMStatus("TPM_E_AUDITFAIL_UNSUCCESSFUL: TPM audit construction failed and the underlying command was returning a failure code also.", message, args);
			case TPM_E_AUDITFAIL_SUCCESSFUL:
				throw new COMStatus("TPM_E_AUDITFAIL_SUCCESSFUL: TPM audit construction failed and the underlying command was returning success.", message, args);
			case TPM_E_NOTRESETABLE:
				throw new COMStatus("TPM_E_NOTRESETABLE: Attempt to reset a PCR that does not have the resettable attribute.", message, args);
			case TPM_E_NOTLOCAL:
				throw new COMStatus("TPM_E_NOTLOCAL: Attempt to reset a PCR register that requires locality and the locality modifier not part of command transport.", message, args);
			case TPM_E_BAD_TYPE:
				throw new COMStatus("TPM_E_BAD_TYPE: Make identity blob not properly typed.", message, args);
			case TPM_E_INVALID_RESOURCE:
				throw new COMStatus("TPM_E_INVALID_RESOURCE: When saving context identified resource type does not match actual resource.", message, args);
			case TPM_E_NOTFIPS:
				throw new COMStatus("TPM_E_NOTFIPS: The TPM is attempting to execute a command only available when in Federal Information Processing Standards (FIPS) mode.", message, args);
			case TPM_E_INVALID_FAMILY:
				throw new COMStatus("TPM_E_INVALID_FAMILY: The command is attempting to use an invalid family ID.", message, args);
			case TPM_E_NO_NV_PERMISSION:
				throw new COMStatus("TPM_E_NO_NV_PERMISSION: The permission to manipulate the NV storage is not available.", message, args);
			case TPM_E_REQUIRES_SIGN:
				throw new COMStatus("TPM_E_REQUIRES_SIGN: The operation requires a signed command.", message, args);
			case TPM_E_KEY_NOTSUPPORTED:
				throw new COMStatus("TPM_E_KEY_NOTSUPPORTED: Wrong operation to load an NV key.", message, args);
			case TPM_E_AUTH_CONFLICT:
				throw new COMStatus("TPM_E_AUTH_CONFLICT: NV_LoadKey blob requires both owner and blob authorization.", message, args);
			case TPM_E_AREA_LOCKED:
				throw new COMStatus("TPM_E_AREA_LOCKED: The NV area is locked and not writable.", message, args);
			case TPM_E_BAD_LOCALITY:
				throw new COMStatus("TPM_E_BAD_LOCALITY: The locality is incorrect for the attempted operation.", message, args);
			case TPM_E_READ_ONLY:
				throw new COMStatus("TPM_E_READ_ONLY: The NV area is read-only and cannot be written to.", message, args);
			case TPM_E_PER_NOWRITE:
				throw new COMStatus("TPM_E_PER_NOWRITE: There is no protection on the write to the NV area.", message, args);
			case TPM_E_FAMILYCOUNT:
				throw new COMStatus("TPM_E_FAMILYCOUNT: The family count value does not match.", message, args);
			case TPM_E_WRITE_LOCKED:
				throw new COMStatus("TPM_E_WRITE_LOCKED: The NV area has already been written to.", message, args);
			case TPM_E_BAD_ATTRIBUTES:
				throw new COMStatus("TPM_E_BAD_ATTRIBUTES: The NV area attributes conflict.", message, args);
			case TPM_E_INVALID_STRUCTURE:
				throw new COMStatus("TPM_E_INVALID_STRUCTURE: The structure tag and version are invalid or inconsistent.", message, args);
			case TPM_E_KEY_OWNER_CONTROL:
				throw new COMStatus("TPM_E_KEY_OWNER_CONTROL: The key is under control of the TPM owner and can only be evicted by the TPM owner.", message, args);
			case TPM_E_BAD_COUNTER:
				throw new COMStatus("TPM_E_BAD_COUNTER: The counter handle is incorrect.", message, args);
			case TPM_E_NOT_FULLWRITE:
				throw new COMStatus("TPM_E_NOT_FULLWRITE: The write is not a complete write of the area.", message, args);
			case TPM_E_CONTEXT_GAP:
				throw new COMStatus("TPM_E_CONTEXT_GAP: The gap between saved context counts is too large.", message, args);
			case TPM_E_MAXNVWRITES:
				throw new COMStatus("TPM_E_MAXNVWRITES: The maximum number of NV writes without an owner has been exceeded.", message, args);
			case TPM_E_NOOPERATOR:
				throw new COMStatus("TPM_E_NOOPERATOR: No operator AuthData value is set.", message, args);
			case TPM_E_RESOURCEMISSING:
				throw new COMStatus("TPM_E_RESOURCEMISSING: The resource pointed to by context is not loaded.", message, args);
			case TPM_E_DELEGATE_LOCK:
				throw new COMStatus("TPM_E_DELEGATE_LOCK: The delegate administration is locked.", message, args);
			case TPM_E_DELEGATE_FAMILY:
				throw new COMStatus("TPM_E_DELEGATE_FAMILY: Attempt to manage a family other then the delegated family.", message, args);
			case TPM_E_DELEGATE_ADMIN:
				throw new COMStatus("TPM_E_DELEGATE_ADMIN: Delegation table management not enabled.", message, args);
			case TPM_E_TRANSPORT_NOTEXCLUSIVE:
				throw new COMStatus("TPM_E_TRANSPORT_NOTEXCLUSIVE: There was a command executed outside an exclusive transport session.", message, args);
			case TPM_E_OWNER_CONTROL:
				throw new COMStatus("TPM_E_OWNER_CONTROL: Attempt to context save an owner evict controlled key.", message, args);
			case TPM_E_DAA_RESOURCES:
				throw new COMStatus("TPM_E_DAA_RESOURCES: The DAA command has no resources available to execute the command.", message, args);
			case TPM_E_DAA_INPUT_DATA0:
				throw new COMStatus("TPM_E_DAA_INPUT_DATA0: The consistency check on DAA parameter inputData0 has failed.", message, args);
			case TPM_E_DAA_INPUT_DATA1:
				throw new COMStatus("TPM_E_DAA_INPUT_DATA1: The consistency check on DAA parameter inputData1 has failed.", message, args);
			case TPM_E_DAA_ISSUER_SETTINGS:
				throw new COMStatus("TPM_E_DAA_ISSUER_SETTINGS: The consistency check on DAA_issuerSettings has failed.", message, args);
			case TPM_E_DAA_TPM_SETTINGS:
				throw new COMStatus("TPM_E_DAA_TPM_SETTINGS: The consistency check on DAA_tpmSpecific has failed.", message, args);
			case TPM_E_DAA_STAGE:
				throw new COMStatus("TPM_E_DAA_STAGE: The atomic process indicated by the submitted DAA command is not the expected process.", message, args);
			case TPM_E_DAA_ISSUER_VALIDITY:
				throw new COMStatus("TPM_E_DAA_ISSUER_VALIDITY: The issuer's validity check has detected an inconsistency.", message, args);
			case TPM_E_DAA_WRONG_W:
				throw new COMStatus("TPM_E_DAA_WRONG_W: The consistency check on w has failed.", message, args);
			case TPM_E_BAD_HANDLE:
				throw new COMStatus("TPM_E_BAD_HANDLE: The handle is incorrect.", message, args);
			case TPM_E_BAD_DELEGATE:
				throw new COMStatus("TPM_E_BAD_DELEGATE: Delegation is not correct.", message, args);
			case TPM_E_BADCONTEXT:
				throw new COMStatus("TPM_E_BADCONTEXT: The context blob is invalid.", message, args);
			case TPM_E_TOOMANYCONTEXTS:
				throw new COMStatus("TPM_E_TOOMANYCONTEXTS: Too many contexts held by the TPM.", message, args);
			case TPM_E_MA_TICKET_SIGNATURE:
				throw new COMStatus("TPM_E_MA_TICKET_SIGNATURE: Migration authority signature validation failure.", message, args);
			case TPM_E_MA_DESTINATION:
				throw new COMStatus("TPM_E_MA_DESTINATION: Migration destination not authenticated.", message, args);
			case TPM_E_MA_SOURCE:
				throw new COMStatus("TPM_E_MA_SOURCE: Migration source incorrect.", message, args);
			case TPM_E_MA_AUTHORITY:
				throw new COMStatus("TPM_E_MA_AUTHORITY: Incorrect migration authority.", message, args);
			case TPM_E_PERMANENTEK:
				throw new COMStatus("TPM_E_PERMANENTEK: Attempt to revoke the EK and the EK is not revocable.", message, args);
			case TPM_E_BAD_SIGNATURE:
				throw new COMStatus("TPM_E_BAD_SIGNATURE: Bad signature of CMK ticket.", message, args);
			case TPM_E_NOCONTEXTSPACE:
				throw new COMStatus("TPM_E_NOCONTEXTSPACE: There is no room in the context list for additional contexts.", message, args);
			case TPM_E_COMMAND_BLOCKED:
				throw new COMStatus("TPM_E_COMMAND_BLOCKED: The command was blocked.", message, args);
			case TPM_E_INVALID_HANDLE:
				throw new COMStatus("TPM_E_INVALID_HANDLE: The specified handle was not found.", message, args);
			case TPM_E_DUPLICATE_VHANDLE:
				throw new COMStatus("TPM_E_DUPLICATE_VHANDLE: The TPM returned a duplicate handle and the command needs to be resubmitted.", message, args);
			case TPM_E_EMBEDDED_COMMAND_BLOCKED:
				throw new COMStatus("TPM_E_EMBEDDED_COMMAND_BLOCKED: The command within the transport was blocked.", message, args);
			case TPM_E_EMBEDDED_COMMAND_UNSUPPORTED:
				throw new COMStatus("TPM_E_EMBEDDED_COMMAND_UNSUPPORTED: The command within the transport is not supported.", message, args);
			case TPM_E_RETRY:
				throw new COMStatus("TPM_E_RETRY: The TPM is too busy to respond to the command immediately, but the command could be resubmitted at a later time.", message, args);
			case TPM_E_NEEDS_SELFTEST:
				throw new COMStatus("TPM_E_NEEDS_SELFTEST: SelfTestFull has not been run.", message, args);
			case TPM_E_DOING_SELFTEST:
				throw new COMStatus("TPM_E_DOING_SELFTEST: The TPM is currently executing a full self-test.", message, args);
			case TPM_E_DEFEND_LOCK_RUNNING:
				throw new COMStatus("TPM_E_DEFEND_LOCK_RUNNING: The TPM is defending against dictionary attacks and is in a time-out period.", message, args);
			case TBS_E_INTERNAL_ERROR:
				throw new COMStatus("TBS_E_INTERNAL_ERROR: An internal software error has been detected.", message, args);
			case TBS_E_BAD_PARAMETER:
				throw new COMStatus("TBS_E_BAD_PARAMETER: One or more input parameters are bad.", message, args);
			case TBS_E_INVALID_OUTPUT_POINTER:
				throw new COMStatus("TBS_E_INVALID_OUTPUT_POINTER: A specified output pointer is bad.", message, args);
			case TBS_E_INVALID_CONTEXT:
				throw new COMStatus("TBS_E_INVALID_CONTEXT: The specified context handle does not refer to a valid context.", message, args);
			case TBS_E_INSUFFICIENT_BUFFER:
				throw new COMStatus("TBS_E_INSUFFICIENT_BUFFER: A specified output buffer is too small.", message, args);
			case TBS_E_IOERROR:
				throw new COMStatus("TBS_E_IOERROR: An error occurred while communicating with the TPM.", message, args);
			case TBS_E_INVALID_CONTEXT_PARAM:
				throw new COMStatus("TBS_E_INVALID_CONTEXT_PARAM: One or more context parameters are invalid.", message, args);
			case TBS_E_SERVICE_NOT_RUNNING:
				throw new COMStatus("TBS_E_SERVICE_NOT_RUNNING: The TPM Base Services (TBS) is not running and could not be started.", message, args);
			case TBS_E_TOO_MANY_TBS_CONTEXTS:
				throw new COMStatus("TBS_E_TOO_MANY_TBS_CONTEXTS: A new context could not be created because there are too many open contexts.", message, args);
			case TBS_E_TOO_MANY_RESOURCES:
				throw new COMStatus("TBS_E_TOO_MANY_RESOURCES: A new virtual resource could not be created because there are too many open virtual resources.", message, args);
			case TBS_E_SERVICE_START_PENDING:
				throw new COMStatus("TBS_E_SERVICE_START_PENDING: The TBS service has been started but is not yet running.", message, args);
			case TBS_E_PPI_NOT_SUPPORTED:
				throw new COMStatus("TBS_E_PPI_NOT_SUPPORTED: The physical presence interface is not supported.", message, args);
			case TBS_E_COMMAND_CANCELED:
				throw new COMStatus("TBS_E_COMMAND_CANCELED: The command was canceled.", message, args);
			case TBS_E_BUFFER_TOO_LARGE:
				throw new COMStatus("TBS_E_BUFFER_TOO_LARGE: The input or output buffer is too large.", message, args);
			case TPMAPI_E_INVALID_STATE:
				throw new COMStatus("TPMAPI_E_INVALID_STATE: The command buffer is not in the correct state.", message, args);
			case TPMAPI_E_NOT_ENOUGH_DATA:
				throw new COMStatus("TPMAPI_E_NOT_ENOUGH_DATA: The command buffer does not contain enough data to satisfy the request.", message, args);
			case TPMAPI_E_TOO_MUCH_DATA:
				throw new COMStatus("TPMAPI_E_TOO_MUCH_DATA: The command buffer cannot contain any more data.", message, args);
			case TPMAPI_E_INVALID_OUTPUT_POINTER:
				throw new COMStatus("TPMAPI_E_INVALID_OUTPUT_POINTER: One or more output parameters was null or invalid.", message, args);
			case TPMAPI_E_INVALID_PARAMETER:
				throw new COMStatus("TPMAPI_E_INVALID_PARAMETER: One or more input parameters are invalid.", message, args);
			case TPMAPI_E_OUT_OF_MEMORY:
				throw new COMStatus("TPMAPI_E_OUT_OF_MEMORY: Not enough memory was available to satisfy the request.", message, args);
			case TPMAPI_E_BUFFER_TOO_SMALL:
				throw new COMStatus("TPMAPI_E_BUFFER_TOO_SMALL: The specified buffer was too small.", message, args);
			case TPMAPI_E_INTERNAL_ERROR:
				throw new COMStatus("TPMAPI_E_INTERNAL_ERROR: An internal error was detected.", message, args);
			case TPMAPI_E_ACCESS_DENIED:
				throw new COMStatus("TPMAPI_E_ACCESS_DENIED: The caller does not have the appropriate rights to perform the requested operation.", message, args);
			case TPMAPI_E_AUTHORIZATION_FAILED:
				throw new COMStatus("TPMAPI_E_AUTHORIZATION_FAILED: The specified authorization information was invalid.", message, args);
			case TPMAPI_E_INVALID_CONTEXT_HANDLE:
				throw new COMStatus("TPMAPI_E_INVALID_CONTEXT_HANDLE: The specified context handle was not valid.", message, args);
			case TPMAPI_E_TBS_COMMUNICATION_ERROR:
				throw new COMStatus("TPMAPI_E_TBS_COMMUNICATION_ERROR: An error occurred while communicating with the TBS.", message, args);
			case TPMAPI_E_TPM_COMMAND_ERROR:
				throw new COMStatus("TPMAPI_E_TPM_COMMAND_ERROR: The TPM returned an unexpected result.", message, args);
			case TPMAPI_E_MESSAGE_TOO_LARGE:
				throw new COMStatus("TPMAPI_E_MESSAGE_TOO_LARGE: The message was too large for the encoding scheme.", message, args);
			case TPMAPI_E_INVALID_ENCODING:
				throw new COMStatus("TPMAPI_E_INVALID_ENCODING: The encoding in the binary large object (BLOB) was not recognized.", message, args);
			case TPMAPI_E_INVALID_KEY_SIZE:
				throw new COMStatus("TPMAPI_E_INVALID_KEY_SIZE: The key size is not valid.", message, args);
			case TPMAPI_E_ENCRYPTION_FAILED:
				throw new COMStatus("TPMAPI_E_ENCRYPTION_FAILED: The encryption operation failed.", message, args);
			case TPMAPI_E_INVALID_KEY_PARAMS:
				throw new COMStatus("TPMAPI_E_INVALID_KEY_PARAMS: The key parameters structure was not valid.", message, args);
			case TPMAPI_E_INVALID_MIGRATION_AUTHORIZATION_BLOB:
				throw new COMStatus("TPMAPI_E_INVALID_MIGRATION_AUTHORIZATION_BLOB: The requested supplied data does not appear to be a valid migration authorization BLOB.", message, args);
			case TPMAPI_E_INVALID_PCR_INDEX:
				throw new COMStatus("TPMAPI_E_INVALID_PCR_INDEX: The specified PCR index was invalid.", message, args);
			case TPMAPI_E_INVALID_DELEGATE_BLOB:
				throw new COMStatus("TPMAPI_E_INVALID_DELEGATE_BLOB: The data given does not appear to be a valid delegate BLOB.", message, args);
			case TPMAPI_E_INVALID_CONTEXT_PARAMS:
				throw new COMStatus("TPMAPI_E_INVALID_CONTEXT_PARAMS: One or more of the specified context parameters was not valid.", message, args);
			case TPMAPI_E_INVALID_KEY_BLOB:
				throw new COMStatus("TPMAPI_E_INVALID_KEY_BLOB: The data given does not appear to be a valid key BLOB.", message, args);
			case TPMAPI_E_INVALID_PCR_DATA:
				throw new COMStatus("TPMAPI_E_INVALID_PCR_DATA: The specified PCR data was invalid.", message, args);
			case TPMAPI_E_INVALID_OWNER_AUTH:
				throw new COMStatus("TPMAPI_E_INVALID_OWNER_AUTH: The format of the owner authorization data was invalid.", message, args);
			case TBSIMP_E_BUFFER_TOO_SMALL:
				throw new COMStatus("TBSIMP_E_BUFFER_TOO_SMALL: The specified buffer was too small.", message, args);
			case TBSIMP_E_CLEANUP_FAILED:
				throw new COMStatus("TBSIMP_E_CLEANUP_FAILED: The context could not be cleaned up.", message, args);
			case TBSIMP_E_INVALID_CONTEXT_HANDLE:
				throw new COMStatus("TBSIMP_E_INVALID_CONTEXT_HANDLE: The specified context handle is invalid.", message, args);
			case TBSIMP_E_INVALID_CONTEXT_PARAM:
				throw new COMStatus("TBSIMP_E_INVALID_CONTEXT_PARAM: An invalid context parameter was specified.", message, args);
			case TBSIMP_E_TPM_ERROR:
				throw new COMStatus("TBSIMP_E_TPM_ERROR: An error occurred while communicating with the TPM.", message, args);
			case TBSIMP_E_HASH_BAD_KEY:
				throw new COMStatus("TBSIMP_E_HASH_BAD_KEY: No entry with the specified key was found.", message, args);
			case TBSIMP_E_DUPLICATE_VHANDLE:
				throw new COMStatus("TBSIMP_E_DUPLICATE_VHANDLE: The specified virtual handle matches a virtual handle already in use.", message, args);
			case TBSIMP_E_INVALID_OUTPUT_POINTER:
				throw new COMStatus("TBSIMP_E_INVALID_OUTPUT_POINTER: The pointer to the returned handle location was null or invalid.", message, args);
			case TBSIMP_E_INVALID_PARAMETER:
				throw new COMStatus("TBSIMP_E_INVALID_PARAMETER: One or more parameters are invalid.", message, args);
			case TBSIMP_E_RPC_INIT_FAILED:
				throw new COMStatus("TBSIMP_E_RPC_INIT_FAILED: The RPC subsystem could not be initialized.", message, args);
			case TBSIMP_E_SCHEDULER_NOT_RUNNING:
				throw new COMStatus("TBSIMP_E_SCHEDULER_NOT_RUNNING: The TBS scheduler is not running.", message, args);
			case TBSIMP_E_COMMAND_CANCELED:
				throw new COMStatus("TBSIMP_E_COMMAND_CANCELED: The command was canceled.", message, args);
			case TBSIMP_E_OUT_OF_MEMORY:
				throw new COMStatus("TBSIMP_E_OUT_OF_MEMORY: There was not enough memory to fulfill the request.", message, args);
			case TBSIMP_E_LIST_NO_MORE_ITEMS:
				throw new COMStatus("TBSIMP_E_LIST_NO_MORE_ITEMS: The specified list is empty, or the iteration has reached the end of the list.", message, args);
			case TBSIMP_E_LIST_NOT_FOUND:
				throw new COMStatus("TBSIMP_E_LIST_NOT_FOUND: The specified item was not found in the list.", message, args);
			case TBSIMP_E_NOT_ENOUGH_SPACE:
				throw new COMStatus("TBSIMP_E_NOT_ENOUGH_SPACE: The TPM does not have enough space to load the requested resource.", message, args);
			case TBSIMP_E_NOT_ENOUGH_TPM_CONTEXTS:
				throw new COMStatus("TBSIMP_E_NOT_ENOUGH_TPM_CONTEXTS: There are too many TPM contexts in use.", message, args);
			case TBSIMP_E_COMMAND_FAILED:
				throw new COMStatus("TBSIMP_E_COMMAND_FAILED: The TPM command failed.", message, args);
			case TBSIMP_E_UNKNOWN_ORDINAL:
				throw new COMStatus("TBSIMP_E_UNKNOWN_ORDINAL: The TBS does not recognize the specified ordinal.", message, args);
			case TBSIMP_E_RESOURCE_EXPIRED:
				throw new COMStatus("TBSIMP_E_RESOURCE_EXPIRED: The requested resource is no longer available.", message, args);
			case TBSIMP_E_INVALID_RESOURCE:
				throw new COMStatus("TBSIMP_E_INVALID_RESOURCE: The resource type did not match.", message, args);
			case TBSIMP_E_NOTHING_TO_UNLOAD:
				throw new COMStatus("TBSIMP_E_NOTHING_TO_UNLOAD: No resources can be unloaded.", message, args);
			case TBSIMP_E_HASH_TABLE_FULL:
				throw new COMStatus("TBSIMP_E_HASH_TABLE_FULL: No new entries can be added to the hash table.", message, args);
			case TBSIMP_E_TOO_MANY_TBS_CONTEXTS:
				throw new COMStatus("TBSIMP_E_TOO_MANY_TBS_CONTEXTS: A new TBS context could not be created because there are too many open contexts.", message, args);
			case TBSIMP_E_TOO_MANY_RESOURCES:
				throw new COMStatus("TBSIMP_E_TOO_MANY_RESOURCES: A new virtual resource could not be created because there are too many open virtual resources.", message, args);
			case TBSIMP_E_PPI_NOT_SUPPORTED:
				throw new COMStatus("TBSIMP_E_PPI_NOT_SUPPORTED: The physical presence interface is not supported.", message, args);
			case TBSIMP_E_TPM_INCOMPATIBLE:
				throw new COMStatus("TBSIMP_E_TPM_INCOMPATIBLE: TBS is not compatible with the version of TPM found on the system.", message, args);
			case TPM_E_PPI_ACPI_FAILURE:
				throw new COMStatus("TPM_E_PPI_ACPI_FAILURE: A general error was detected when attempting to acquire the BIOS response to a physical presence command.", message, args);
			case TPM_E_PPI_USER_ABORT:
				throw new COMStatus("TPM_E_PPI_USER_ABORT: The user failed to confirm the TPM operation request.", message, args);
			case TPM_E_PPI_BIOS_FAILURE:
				throw new COMStatus("TPM_E_PPI_BIOS_FAILURE: The BIOS failure prevented the successful execution of the requested TPM operation (for example, invalid TPM operation request, BIOS communication error with the TPM).", message, args);
			case TPM_E_PPI_NOT_SUPPORTED:
				throw new COMStatus("TPM_E_PPI_NOT_SUPPORTED: The BIOS does not support the physical presence interface.", message, args);
			case PLA_E_DCS_NOT_FOUND:
				throw new COMStatus("PLA_E_DCS_NOT_FOUND: A Data Collector Set was not found.", message, args);
			case PLA_E_TOO_MANY_FOLDERS:
				throw new COMStatus("PLA_E_TOO_MANY_FOLDERS: Unable to start Data Collector Set because there are too many folders.", message, args);
			case PLA_E_NO_MIN_DISK:
				throw new COMStatus("PLA_E_NO_MIN_DISK: Not enough free disk space to start Data Collector Set.", message, args);
			case PLA_E_DCS_IN_USE:
				throw new COMStatus("PLA_E_DCS_IN_USE: Data Collector Set is in use.", message, args);
			case PLA_E_DCS_ALREADY_EXISTS:
				throw new COMStatus("PLA_E_DCS_ALREADY_EXISTS: Data Collector Set already exists.", message, args);
			case PLA_E_PROPERTY_CONFLICT:
				throw new COMStatus("PLA_E_PROPERTY_CONFLICT: Property value conflict.", message, args);
			case PLA_E_DCS_SINGLETON_REQUIRED:
				throw new COMStatus("PLA_E_DCS_SINGLETON_REQUIRED: The current configuration for this Data Collector Set requires that it contain exactly one Data Collector.", message, args);
			case PLA_E_CREDENTIALS_REQUIRED:
				throw new COMStatus("PLA_E_CREDENTIALS_REQUIRED: A user account is required to commit the current Data Collector Set properties.", message, args);
			case PLA_E_DCS_NOT_RUNNING:
				throw new COMStatus("PLA_E_DCS_NOT_RUNNING: Data Collector Set is not running.", message, args);
			case PLA_E_CONFLICT_INCL_EXCL_API:
				throw new COMStatus("PLA_E_CONFLICT_INCL_EXCL_API: A conflict was detected in the list of include and exclude APIs. Do not specify the same API in both the include list and the exclude list.", message, args);
			case PLA_E_NETWORK_EXE_NOT_VALID:
				throw new COMStatus("PLA_E_NETWORK_EXE_NOT_VALID: The executable path specified refers to a network share or UNC path.", message, args);
			case PLA_E_EXE_ALREADY_CONFIGURED:
				throw new COMStatus("PLA_E_EXE_ALREADY_CONFIGURED: The executable path specified is already configured for API tracing.", message, args);
			case PLA_E_EXE_PATH_NOT_VALID:
				throw new COMStatus("PLA_E_EXE_PATH_NOT_VALID: The executable path specified does not exist. Verify that the specified path is correct.", message, args);
			case PLA_E_DC_ALREADY_EXISTS:
				throw new COMStatus("PLA_E_DC_ALREADY_EXISTS: Data Collector already exists.", message, args);
			case PLA_E_DCS_START_WAIT_TIMEOUT:
				throw new COMStatus("PLA_E_DCS_START_WAIT_TIMEOUT: The wait for the Data Collector Set start notification has timed out.", message, args);
			case PLA_E_DC_START_WAIT_TIMEOUT:
				throw new COMStatus("PLA_E_DC_START_WAIT_TIMEOUT: The wait for the Data Collector to start has timed out.", message, args);
			case PLA_E_REPORT_WAIT_TIMEOUT:
				throw new COMStatus("PLA_E_REPORT_WAIT_TIMEOUT: The wait for the report generation tool to finish has timed out.", message, args);
			case PLA_E_NO_DUPLICATES:
				throw new COMStatus("PLA_E_NO_DUPLICATES: Duplicate items are not allowed.", message, args);
			case PLA_E_EXE_FULL_PATH_REQUIRED:
				throw new COMStatus("PLA_E_EXE_FULL_PATH_REQUIRED: When specifying the executable to trace, you must specify a full path to the executable and not just a file name.", message, args);
			case PLA_E_INVALID_SESSION_NAME:
				throw new COMStatus("PLA_E_INVALID_SESSION_NAME: The session name provided is invalid.", message, args);
			case PLA_E_PLA_CHANNEL_NOT_ENABLED:
				throw new COMStatus("PLA_E_PLA_CHANNEL_NOT_ENABLED: The Event Log channel Microsoft-Windows-Diagnosis-PLA/Operational must be enabled to perform this operation.", message, args);
			case PLA_E_TASKSCHED_CHANNEL_NOT_ENABLED:
				throw new COMStatus("PLA_E_TASKSCHED_CHANNEL_NOT_ENABLED: The Event Log channel Microsoft-Windows-TaskScheduler must be enabled to perform this operation.", message, args);
			case FVE_E_LOCKED_VOLUME:
				throw new COMStatus("FVE_E_LOCKED_VOLUME: The volume must be unlocked before it can be used.", message, args);
			case FVE_E_NOT_ENCRYPTED:
				throw new COMStatus("FVE_E_NOT_ENCRYPTED: The volume is fully decrypted and no key is available.", message, args);
			case FVE_E_NO_TPM_BIOS:
				throw new COMStatus("FVE_E_NO_TPM_BIOS: The firmware does not support using a TPM during boot.", message, args);
			case FVE_E_NO_MBR_METRIC:
				throw new COMStatus("FVE_E_NO_MBR_METRIC: The firmware does not use a TPM to perform initial program load (IPL) measurement.", message, args);
			case FVE_E_NO_BOOTSECTOR_METRIC:
				throw new COMStatus("FVE_E_NO_BOOTSECTOR_METRIC: The master boot record (MBR) is not TPM-aware.", message, args);
			case FVE_E_NO_BOOTMGR_METRIC:
				throw new COMStatus("FVE_E_NO_BOOTMGR_METRIC: The BOOTMGR is not being measured by the TPM.", message, args);
			case FVE_E_WRONG_BOOTMGR:
				throw new COMStatus("FVE_E_WRONG_BOOTMGR: The BOOTMGR component does not perform expected TPM measurements.", message, args);
			case FVE_E_SECURE_KEY_REQUIRED:
				throw new COMStatus("FVE_E_SECURE_KEY_REQUIRED: No secure key protection mechanism has been defined.", message, args);
			case FVE_E_NOT_ACTIVATED:
				throw new COMStatus("FVE_E_NOT_ACTIVATED: This volume has not been provisioned for encryption.", message, args);
			case FVE_E_ACTION_NOT_ALLOWED:
				throw new COMStatus("FVE_E_ACTION_NOT_ALLOWED: Requested action was denied by the full-volume encryption (FVE) control engine.", message, args);
			case FVE_E_AD_SCHEMA_NOT_INSTALLED:
				throw new COMStatus("FVE_E_AD_SCHEMA_NOT_INSTALLED: The Active Directory forest does not contain the required attributes and classes to host FVE or TPM information.", message, args);
			case FVE_E_AD_INVALID_DATATYPE:
				throw new COMStatus("FVE_E_AD_INVALID_DATATYPE: The type of data obtained from Active Directory was not expected.", message, args);
			case FVE_E_AD_INVALID_DATASIZE:
				throw new COMStatus("FVE_E_AD_INVALID_DATASIZE: The size of the data obtained from Active Directory was not expected.", message, args);
			case FVE_E_AD_NO_VALUES:
				throw new COMStatus("FVE_E_AD_NO_VALUES: The attribute read from Active Directory has no (zero) values.", message, args);
			case FVE_E_AD_ATTR_NOT_SET:
				throw new COMStatus("FVE_E_AD_ATTR_NOT_SET: The attribute was not set.", message, args);
			case FVE_E_AD_GUID_NOT_FOUND:
				throw new COMStatus("FVE_E_AD_GUID_NOT_FOUND: The specified GUID could not be found.", message, args);
			case FVE_E_BAD_INFORMATION:
				throw new COMStatus("FVE_E_BAD_INFORMATION: The control block for the encrypted volume is not valid.", message, args);
			case FVE_E_TOO_SMALL:
				throw new COMStatus("FVE_E_TOO_SMALL: Not enough free space remaining on volume to allow encryption.", message, args);
			case FVE_E_SYSTEM_VOLUME:
				throw new COMStatus("FVE_E_SYSTEM_VOLUME: The volume cannot be encrypted because it is required to boot the operating system.", message, args);
			case FVE_E_FAILED_WRONG_FS:
				throw new COMStatus("FVE_E_FAILED_WRONG_FS: The volume cannot be encrypted because the file system is not supported.", message, args);
			case FVE_E_FAILED_BAD_FS:
				throw new COMStatus("FVE_E_FAILED_BAD_FS: The file system is inconsistent. Run CHKDSK.", message, args);
			case FVE_E_NOT_SUPPORTED:
				throw new COMStatus("FVE_E_NOT_SUPPORTED: This volume cannot be encrypted.", message, args);
			case FVE_E_BAD_DATA:
				throw new COMStatus("FVE_E_BAD_DATA: Data supplied is malformed.", message, args);
			case FVE_E_VOLUME_NOT_BOUND:
				throw new COMStatus("FVE_E_VOLUME_NOT_BOUND: Volume is not bound to the system.", message, args);
			case FVE_E_TPM_NOT_OWNED:
				throw new COMStatus("FVE_E_TPM_NOT_OWNED: TPM must be owned before a volume can be bound to it.", message, args);
			case FVE_E_NOT_DATA_VOLUME:
				throw new COMStatus("FVE_E_NOT_DATA_VOLUME: The volume specified is not a data volume.", message, args);
			case FVE_E_AD_INSUFFICIENT_BUFFER:
				throw new COMStatus("FVE_E_AD_INSUFFICIENT_BUFFER: The buffer supplied to a function was insufficient to contain the returned data.", message, args);
			case FVE_E_CONV_READ:
				throw new COMStatus("FVE_E_CONV_READ: A read operation failed while converting the volume.", message, args);
			case FVE_E_CONV_WRITE:
				throw new COMStatus("FVE_E_CONV_WRITE: A write operation failed while converting the volume.", message, args);
			case FVE_E_KEY_REQUIRED:
				throw new COMStatus("FVE_E_KEY_REQUIRED: One or more key protection mechanisms are required for this volume.", message, args);
			case FVE_E_CLUSTERING_NOT_SUPPORTED:
				throw new COMStatus("FVE_E_CLUSTERING_NOT_SUPPORTED: Cluster configurations are not supported.", message, args);
			case FVE_E_VOLUME_BOUND_ALREADY:
				throw new COMStatus("FVE_E_VOLUME_BOUND_ALREADY: The volume is already bound to the system.", message, args);
			case FVE_E_OS_NOT_PROTECTED:
				throw new COMStatus("FVE_E_OS_NOT_PROTECTED: The boot OS volume is not being protected via FVE.", message, args);
			case FVE_E_PROTECTION_DISABLED:
				throw new COMStatus("FVE_E_PROTECTION_DISABLED: All protection mechanisms are effectively disabled (clear key exists).", message, args);
			case FVE_E_RECOVERY_KEY_REQUIRED:
				throw new COMStatus("FVE_E_RECOVERY_KEY_REQUIRED: A recovery key protection mechanism is required.", message, args);
			case FVE_E_FOREIGN_VOLUME:
				throw new COMStatus("FVE_E_FOREIGN_VOLUME: This volume cannot be bound to a TPM.", message, args);
			case FVE_E_OVERLAPPED_UPDATE:
				throw new COMStatus("FVE_E_OVERLAPPED_UPDATE: The control block for the encrypted volume was updated by another thread. Try again.", message, args);
			case FVE_E_TPM_SRK_AUTH_NOT_ZERO:
				throw new COMStatus("FVE_E_TPM_SRK_AUTH_NOT_ZERO: The SRK authentication of the TPM is not zero and, therefore, is not compatible.", message, args);
			case FVE_E_FAILED_SECTOR_SIZE:
				throw new COMStatus("FVE_E_FAILED_SECTOR_SIZE: The volume encryption algorithm cannot be used on this sector size.", message, args);
			case FVE_E_FAILED_AUTHENTICATION:
				throw new COMStatus("FVE_E_FAILED_AUTHENTICATION: BitLocker recovery authentication failed.", message, args);
			case FVE_E_NOT_OS_VOLUME:
				throw new COMStatus("FVE_E_NOT_OS_VOLUME: The volume specified is not the boot OS volume.", message, args);
			case FVE_E_AUTOUNLOCK_ENABLED:
				throw new COMStatus("FVE_E_AUTOUNLOCK_ENABLED: Auto-unlock information for data volumes is present on the boot OS volume.", message, args);
			case FVE_E_WRONG_BOOTSECTOR:
				throw new COMStatus("FVE_E_WRONG_BOOTSECTOR: The system partition boot sector does not perform TPM measurements.", message, args);
			case FVE_E_WRONG_SYSTEM_FS:
				throw new COMStatus("FVE_E_WRONG_SYSTEM_FS: The system partition file system must be NTFS.", message, args);
			case FVE_E_POLICY_PASSWORD_REQUIRED:
				throw new COMStatus("FVE_E_POLICY_PASSWORD_REQUIRED: Group policy requires a recovery password before encryption may begin.", message, args);
			case FVE_E_CANNOT_SET_FVEK_ENCRYPTED:
				throw new COMStatus("FVE_E_CANNOT_SET_FVEK_ENCRYPTED: The volume encryption algorithm and key cannot be set on an encrypted volume.", message, args);
			case FVE_E_CANNOT_ENCRYPT_NO_KEY:
				throw new COMStatus("FVE_E_CANNOT_ENCRYPT_NO_KEY: A key must be specified before encryption may begin.", message, args);
			case FVE_E_BOOTABLE_CDDVD:
				throw new COMStatus("FVE_E_BOOTABLE_CDDVD: A bootable CD/DVD is in the system. Remove the CD/DVD and reboot the system.", message, args);
			case FVE_E_PROTECTOR_EXISTS:
				throw new COMStatus("FVE_E_PROTECTOR_EXISTS: An instance of this key protector already exists on the volume.", message, args);
			case FVE_E_RELATIVE_PATH:
				throw new COMStatus("FVE_E_RELATIVE_PATH: The file cannot be saved to a relative path.", message, args);
			case FWP_E_CALLOUT_NOT_FOUND:
				throw new COMStatus("FWP_E_CALLOUT_NOT_FOUND: The callout does not exist.", message, args);
			case FWP_E_CONDITION_NOT_FOUND:
				throw new COMStatus("FWP_E_CONDITION_NOT_FOUND: The filter condition does not exist.", message, args);
			case FWP_E_FILTER_NOT_FOUND:
				throw new COMStatus("FWP_E_FILTER_NOT_FOUND: The filter does not exist.", message, args);
			case FWP_E_LAYER_NOT_FOUND:
				throw new COMStatus("FWP_E_LAYER_NOT_FOUND: The layer does not exist.", message, args);
			case FWP_E_PROVIDER_NOT_FOUND:
				throw new COMStatus("FWP_E_PROVIDER_NOT_FOUND: The provider does not exist.", message, args);
			case FWP_E_PROVIDER_CONTEXT_NOT_FOUND:
				throw new COMStatus("FWP_E_PROVIDER_CONTEXT_NOT_FOUND: The provider context does not exist.", message, args);
			case FWP_E_SUBLAYER_NOT_FOUND:
				throw new COMStatus("FWP_E_SUBLAYER_NOT_FOUND: The sublayer does not exist.", message, args);
			case FWP_E_NOT_FOUND:
				throw new COMStatus("FWP_E_NOT_FOUND: The object does not exist.", message, args);
			case FWP_E_ALREADY_EXISTS:
				throw new COMStatus("FWP_E_ALREADY_EXISTS: An object with that GUID or LUID already exists.", message, args);
			case FWP_E_IN_USE:
				throw new COMStatus("FWP_E_IN_USE: The object is referenced by other objects and, therefore, cannot be deleted.", message, args);
			case FWP_E_DYNAMIC_SESSION_IN_PROGRESS:
				throw new COMStatus("FWP_E_DYNAMIC_SESSION_IN_PROGRESS: The call is not allowed from within a dynamic session.", message, args);
			case FWP_E_WRONG_SESSION:
				throw new COMStatus("FWP_E_WRONG_SESSION: The call was made from the wrong session and, therefore, cannot be completed.", message, args);
			case FWP_E_NO_TXN_IN_PROGRESS:
				throw new COMStatus("FWP_E_NO_TXN_IN_PROGRESS: The call must be made from within an explicit transaction.", message, args);
			case FWP_E_TXN_IN_PROGRESS:
				throw new COMStatus("FWP_E_TXN_IN_PROGRESS: The call is not allowed from within an explicit transaction.", message, args);
			case FWP_E_TXN_ABORTED:
				throw new COMStatus("FWP_E_TXN_ABORTED: The explicit transaction has been forcibly canceled.", message, args);
			case FWP_E_SESSION_ABORTED:
				throw new COMStatus("FWP_E_SESSION_ABORTED: The session has been canceled.", message, args);
			case FWP_E_INCOMPATIBLE_TXN:
				throw new COMStatus("FWP_E_INCOMPATIBLE_TXN: The call is not allowed from within a read-only transaction.", message, args);
			case FWP_E_TIMEOUT:
				throw new COMStatus("FWP_E_TIMEOUT: The call timed out while waiting to acquire the transaction lock.", message, args);
			case FWP_E_NET_EVENTS_DISABLED:
				throw new COMStatus("FWP_E_NET_EVENTS_DISABLED: Collection of network diagnostic events is disabled.", message, args);
			case FWP_E_INCOMPATIBLE_LAYER:
				throw new COMStatus("FWP_E_INCOMPATIBLE_LAYER: The operation is not supported by the specified layer.", message, args);
			case FWP_E_KM_CLIENTS_ONLY:
				throw new COMStatus("FWP_E_KM_CLIENTS_ONLY: The call is allowed for kernel-mode callers only.", message, args);
			case FWP_E_LIFETIME_MISMATCH:
				throw new COMStatus("FWP_E_LIFETIME_MISMATCH: The call tried to associate two objects with incompatible lifetimes.", message, args);
			case FWP_E_BUILTIN_OBJECT:
				throw new COMStatus("FWP_E_BUILTIN_OBJECT: The object is built in and, therefore, cannot be deleted.", message, args);
			case FWP_E_TOO_MANY_BOOTTIME_FILTERS:
				throw new COMStatus("FWP_E_TOO_MANY_BOOTTIME_FILTERS: The maximum number of boot-time filters has been reached.", message, args);
			case FWP_E_NOTIFICATION_DROPPED:
				throw new COMStatus("FWP_E_NOTIFICATION_DROPPED: A notification could not be delivered because a message queue is at its maximum capacity.", message, args);
			case FWP_E_TRAFFIC_MISMATCH:
				throw new COMStatus("FWP_E_TRAFFIC_MISMATCH: The traffic parameters do not match those for the security association context.", message, args);
			case FWP_E_INCOMPATIBLE_SA_STATE:
				throw new COMStatus("FWP_E_INCOMPATIBLE_SA_STATE: The call is not allowed for the current security association state.", message, args);
			case FWP_E_NULL_POINTER:
				throw new COMStatus("FWP_E_NULL_POINTER: A required pointer is null.", message, args);
			case FWP_E_INVALID_ENUMERATOR:
				throw new COMStatus("FWP_E_INVALID_ENUMERATOR: An enumerator is not valid.", message, args);
			case FWP_E_INVALID_FLAGS:
				throw new COMStatus("FWP_E_INVALID_FLAGS: The flags field contains an invalid value.", message, args);
			case FWP_E_INVALID_NET_MASK:
				throw new COMStatus("FWP_E_INVALID_NET_MASK: A network mask is not valid.", message, args);
			case FWP_E_INVALID_RANGE:
				throw new COMStatus("FWP_E_INVALID_RANGE: An FWP_RANGE is not valid.", message, args);
			case FWP_E_INVALID_INTERVAL:
				throw new COMStatus("FWP_E_INVALID_INTERVAL: The time interval is not valid.", message, args);
			case FWP_E_ZERO_LENGTH_ARRAY:
				throw new COMStatus("FWP_E_ZERO_LENGTH_ARRAY: An array that must contain at least one element that is zero-length.", message, args);
			case FWP_E_NULL_DISPLAY_NAME:
				throw new COMStatus("FWP_E_NULL_DISPLAY_NAME: The displayData.name field cannot be null.", message, args);
			case FWP_E_INVALID_ACTION_TYPE:
				throw new COMStatus("FWP_E_INVALID_ACTION_TYPE: The action type is not one of the allowed action types for a filter.", message, args);
			case FWP_E_INVALID_WEIGHT:
				throw new COMStatus("FWP_E_INVALID_WEIGHT: The filter weight is not valid.", message, args);
			case FWP_E_MATCH_TYPE_MISMATCH:
				throw new COMStatus("FWP_E_MATCH_TYPE_MISMATCH: A filter condition contains a match type that is not compatible with the operands.", message, args);
			case FWP_E_TYPE_MISMATCH:
				throw new COMStatus("FWP_E_TYPE_MISMATCH: An FWP_VALUE or FWPM_CONDITION_VALUE is of the wrong type.", message, args);
			case FWP_E_OUT_OF_BOUNDS:
				throw new COMStatus("FWP_E_OUT_OF_BOUNDS: An integer value is outside the allowed range.", message, args);
			case FWP_E_RESERVED:
				throw new COMStatus("FWP_E_RESERVED: A reserved field is nonzero.", message, args);
			case FWP_E_DUPLICATE_CONDITION:
				throw new COMStatus("FWP_E_DUPLICATE_CONDITION: A filter cannot contain multiple conditions operating on a single field.", message, args);
			case FWP_E_DUPLICATE_KEYMOD:
				throw new COMStatus("FWP_E_DUPLICATE_KEYMOD: A policy cannot contain the same keying module more than once.", message, args);
			case FWP_E_ACTION_INCOMPATIBLE_WITH_LAYER:
				throw new COMStatus("FWP_E_ACTION_INCOMPATIBLE_WITH_LAYER: The action type is not compatible with the layer.", message, args);
			case FWP_E_ACTION_INCOMPATIBLE_WITH_SUBLAYER:
				throw new COMStatus("FWP_E_ACTION_INCOMPATIBLE_WITH_SUBLAYER: The action type is not compatible with the sublayer.", message, args);
			case FWP_E_CONTEXT_INCOMPATIBLE_WITH_LAYER:
				throw new COMStatus("FWP_E_CONTEXT_INCOMPATIBLE_WITH_LAYER: The raw context or the provider context is not compatible with the layer.", message, args);
			case FWP_E_CONTEXT_INCOMPATIBLE_WITH_CALLOUT:
				throw new COMStatus("FWP_E_CONTEXT_INCOMPATIBLE_WITH_CALLOUT: The raw context or the provider context is not compatible with the callout.", message, args);
			case FWP_E_INCOMPATIBLE_AUTH_METHOD:
				throw new COMStatus("FWP_E_INCOMPATIBLE_AUTH_METHOD: The authentication method is not compatible with the policy type.", message, args);
			case FWP_E_INCOMPATIBLE_DH_GROUP:
				throw new COMStatus("FWP_E_INCOMPATIBLE_DH_GROUP: The Diffie-Hellman group is not compatible with the policy type.", message, args);
			case FWP_E_EM_NOT_SUPPORTED:
				throw new COMStatus("FWP_E_EM_NOT_SUPPORTED: An Internet Key Exchange (IKE) policy cannot contain an Extended Mode policy.", message, args);
			case FWP_E_NEVER_MATCH:
				throw new COMStatus("FWP_E_NEVER_MATCH: The enumeration template or subscription will never match any objects.", message, args);
			case FWP_E_PROVIDER_CONTEXT_MISMATCH:
				throw new COMStatus("FWP_E_PROVIDER_CONTEXT_MISMATCH: The provider context is of the wrong type.", message, args);
			case FWP_E_INVALID_PARAMETER:
				throw new COMStatus("FWP_E_INVALID_PARAMETER: The parameter is incorrect.", message, args);
			case FWP_E_TOO_MANY_SUBLAYERS:
				throw new COMStatus("FWP_E_TOO_MANY_SUBLAYERS: The maximum number of sublayers has been reached.", message, args);
			case FWP_E_CALLOUT_NOTIFICATION_FAILED:
				throw new COMStatus("FWP_E_CALLOUT_NOTIFICATION_FAILED: The notification function for a callout returned an error.", message, args);
			case FWP_E_INCOMPATIBLE_AUTH_CONFIG:
				throw new COMStatus("FWP_E_INCOMPATIBLE_AUTH_CONFIG: The IPsec authentication configuration is not compatible with the authentication type.", message, args);
			case FWP_E_INCOMPATIBLE_CIPHER_CONFIG:
				throw new COMStatus("FWP_E_INCOMPATIBLE_CIPHER_CONFIG: The IPsec cipher configuration is not compatible with the cipher type.", message, args);
			case ERROR_NDIS_INTERFACE_CLOSING:
				throw new COMStatus("ERROR_NDIS_INTERFACE_CLOSING: The binding to the network interface is being closed.", message, args);
			case ERROR_NDIS_BAD_VERSION:
				throw new COMStatus("ERROR_NDIS_BAD_VERSION: An invalid version was specified.", message, args);
			case ERROR_NDIS_BAD_CHARACTERISTICS:
				throw new COMStatus("ERROR_NDIS_BAD_CHARACTERISTICS: An invalid characteristics table was used.", message, args);
			case ERROR_NDIS_ADAPTER_NOT_FOUND:
				throw new COMStatus("ERROR_NDIS_ADAPTER_NOT_FOUND: Failed to find the network interface, or the network interface is not ready.", message, args);
			case ERROR_NDIS_OPEN_FAILED:
				throw new COMStatus("ERROR_NDIS_OPEN_FAILED: Failed to open the network interface.", message, args);
			case ERROR_NDIS_DEVICE_FAILED:
				throw new COMStatus("ERROR_NDIS_DEVICE_FAILED: The network interface has encountered an internal unrecoverable failure.", message, args);
			case ERROR_NDIS_MULTICAST_FULL:
				throw new COMStatus("ERROR_NDIS_MULTICAST_FULL: The multicast list on the network interface is full.", message, args);
			case ERROR_NDIS_MULTICAST_EXISTS:
				throw new COMStatus("ERROR_NDIS_MULTICAST_EXISTS: An attempt was made to add a duplicate multicast address to the list.", message, args);
			case ERROR_NDIS_MULTICAST_NOT_FOUND:
				throw new COMStatus("ERROR_NDIS_MULTICAST_NOT_FOUND: At attempt was made to remove a multicast address that was never added.", message, args);
			case ERROR_NDIS_REQUEST_ABORTED:
				throw new COMStatus("ERROR_NDIS_REQUEST_ABORTED: The network interface aborted the request.", message, args);
			case ERROR_NDIS_RESET_IN_PROGRESS:
				throw new COMStatus("ERROR_NDIS_RESET_IN_PROGRESS: The network interface cannot process the request because it is being reset.", message, args);
			case ERROR_NDIS_INVALID_PACKET:
				throw new COMStatus("ERROR_NDIS_INVALID_PACKET: An attempt was made to send an invalid packet on a network interface.", message, args);
			case ERROR_NDIS_INVALID_DEVICE_REQUEST:
				throw new COMStatus("ERROR_NDIS_INVALID_DEVICE_REQUEST: The specified request is not a valid operation for the target device.", message, args);
			case ERROR_NDIS_ADAPTER_NOT_READY:
				throw new COMStatus("ERROR_NDIS_ADAPTER_NOT_READY: The network interface is not ready to complete this operation.", message, args);
			case ERROR_NDIS_INVALID_LENGTH:
				throw new COMStatus("ERROR_NDIS_INVALID_LENGTH: The length of the buffer submitted for this operation is not valid.", message, args);
			case ERROR_NDIS_INVALID_DATA:
				throw new COMStatus("ERROR_NDIS_INVALID_DATA: The data used for this operation is not valid.", message, args);
			case ERROR_NDIS_BUFFER_TOO_SHORT:
				throw new COMStatus("ERROR_NDIS_BUFFER_TOO_SHORT: The length of the buffer submitted for this operation is too small.", message, args);
			case ERROR_NDIS_INVALID_OID:
				throw new COMStatus("ERROR_NDIS_INVALID_OID: The network interface does not support this OID.", message, args);
			case ERROR_NDIS_ADAPTER_REMOVED:
				throw new COMStatus("ERROR_NDIS_ADAPTER_REMOVED: The network interface has been removed.", message, args);
			case ERROR_NDIS_UNSUPPORTED_MEDIA:
				throw new COMStatus("ERROR_NDIS_UNSUPPORTED_MEDIA: The network interface does not support this media type.", message, args);
			case ERROR_NDIS_GROUP_ADDRESS_IN_USE:
				throw new COMStatus("ERROR_NDIS_GROUP_ADDRESS_IN_USE: An attempt was made to remove a token ring group address that is in use by other components.", message, args);
			case ERROR_NDIS_FILE_NOT_FOUND:
				throw new COMStatus("ERROR_NDIS_FILE_NOT_FOUND: An attempt was made to map a file that cannot be found.", message, args);
			case ERROR_NDIS_ERROR_READING_FILE:
				throw new COMStatus("ERROR_NDIS_ERROR_READING_FILE: An error occurred while the NDIS tried to map the file.", message, args);
			case ERROR_NDIS_ALREADY_MAPPED:
				throw new COMStatus("ERROR_NDIS_ALREADY_MAPPED: An attempt was made to map a file that is already mapped.", message, args);
			case ERROR_NDIS_RESOURCE_CONFLICT:
				throw new COMStatus("ERROR_NDIS_RESOURCE_CONFLICT: An attempt to allocate a hardware resource failed because the resource is used by another component.", message, args);
			case ERROR_NDIS_MEDIA_DISCONNECTED:
				throw new COMStatus("ERROR_NDIS_MEDIA_DISCONNECTED: The I/O operation failed because network media is disconnected or the wireless access point is out of range.", message, args);
			case ERROR_NDIS_INVALID_ADDRESS:
				throw new COMStatus("ERROR_NDIS_INVALID_ADDRESS: The network address used in the request is invalid.", message, args);
			case ERROR_NDIS_PAUSED:
				throw new COMStatus("ERROR_NDIS_PAUSED: The offload operation on the network interface has been paused.", message, args);
			case ERROR_NDIS_INTERFACE_NOT_FOUND:
				throw new COMStatus("ERROR_NDIS_INTERFACE_NOT_FOUND: The network interface was not found.", message, args);
			case ERROR_NDIS_UNSUPPORTED_REVISION:
				throw new COMStatus("ERROR_NDIS_UNSUPPORTED_REVISION: The revision number specified in the structure is not supported.", message, args);
			case ERROR_NDIS_INVALID_PORT:
				throw new COMStatus("ERROR_NDIS_INVALID_PORT: The specified port does not exist on this network interface.", message, args);
			case ERROR_NDIS_INVALID_PORT_STATE:
				throw new COMStatus("ERROR_NDIS_INVALID_PORT_STATE: The current state of the specified port on this network interface does not support the requested operation.", message, args);
			case ERROR_NDIS_NOT_SUPPORTED:
				throw new COMStatus("ERROR_NDIS_NOT_SUPPORTED: The network interface does not support this request.", message, args);
			case ERROR_NDIS_DOT11_AUTO_CONFIG_ENABLED:
				throw new COMStatus("ERROR_NDIS_DOT11_AUTO_CONFIG_ENABLED: The wireless local area network (LAN) interface is in auto-configuration mode and does not support the requested parameter change operation.", message, args);
			case ERROR_NDIS_DOT11_MEDIA_IN_USE:
				throw new COMStatus("ERROR_NDIS_DOT11_MEDIA_IN_USE: The wireless LAN interface is busy and cannot perform the requested operation.", message, args);
			case ERROR_NDIS_DOT11_POWER_STATE_INVALID:
				throw new COMStatus("ERROR_NDIS_DOT11_POWER_STATE_INVALID: The wireless LAN interface is shutting down and does not support the requested operation.", message, args);
			case TRK_E_NOT_FOUND:
				throw new COMStatus("TRK_E_NOT_FOUND: A requested object was not found.", message, args);
			case TRK_E_VOLUME_QUOTA_EXCEEDED:
				throw new COMStatus("TRK_E_VOLUME_QUOTA_EXCEEDED: The server received a CREATE_VOLUME subrequest of a SYNC_VOLUMES request, but the ServerVolumeTable size limit for the RequestMachine has already been reached.", message, args);
			case TRK_SERVER_TOO_BUSY:
				throw new COMStatus("TRK_SERVER_TOO_BUSY: The server is busy, and the client should retry the request at a later time.", message, args);
			case ERROR_AUDITING_DISABLED:
				throw new COMStatus("ERROR_AUDITING_DISABLED: The specified event is currently not being audited.", message, args);
			case ERROR_ALL_SIDS_FILTERED:
				throw new COMStatus("ERROR_ALL_SIDS_FILTERED: The SID filtering operation removed all SIDs.", message, args);
			case ERROR_BIZRULES_NOT_ENABLED:
				throw new COMStatus("ERROR_BIZRULES_NOT_ENABLED: Business rule scripts are disabled for the calling application.", message, args);
			case NS_E_NOCONNECTION:
				throw new COMStatus("NS_E_NOCONNECTION: There is no connection established with the Windows Media server. The operation failed.", message, args);
			case NS_E_CANNOTCONNECT:
				throw new COMStatus("NS_E_CANNOTCONNECT: Unable to establish a connection to the server.", message, args);
			case NS_E_CANNOTDESTROYTITLE:
				throw new COMStatus("NS_E_CANNOTDESTROYTITLE: Unable to destroy the title.", message, args);
			case NS_E_CANNOTRENAMETITLE:
				throw new COMStatus("NS_E_CANNOTRENAMETITLE: Unable to rename the title.", message, args);
			case NS_E_CANNOTOFFLINEDISK:
				throw new COMStatus("NS_E_CANNOTOFFLINEDISK: Unable to offline disk.", message, args);
			case NS_E_CANNOTONLINEDISK:
				throw new COMStatus("NS_E_CANNOTONLINEDISK: Unable to online disk.", message, args);
			case NS_E_NOREGISTEREDWALKER:
				throw new COMStatus("NS_E_NOREGISTEREDWALKER: There is no file parser registered for this type of file.", message, args);
			case NS_E_NOFUNNEL:
				throw new COMStatus("NS_E_NOFUNNEL: There is no data connection established.", message, args);
			case NS_E_NO_LOCALPLAY:
				throw new COMStatus("NS_E_NO_LOCALPLAY: Failed to load the local play DLL.", message, args);
			case NS_E_NETWORK_BUSY:
				throw new COMStatus("NS_E_NETWORK_BUSY: The network is busy.", message, args);
			case NS_E_TOO_MANY_SESS:
				throw new COMStatus("NS_E_TOO_MANY_SESS: The server session limit was exceeded.", message, args);
			case NS_E_ALREADY_CONNECTED:
				throw new COMStatus("NS_E_ALREADY_CONNECTED: The network connection already exists.", message, args);
			case NS_E_INVALID_INDEX:
				throw new COMStatus("NS_E_INVALID_INDEX: Index %1 is invalid.", message, args);
			case NS_E_PROTOCOL_MISMATCH:
				throw new COMStatus("NS_E_PROTOCOL_MISMATCH: There is no protocol or protocol version supported by both the client and the server.", message, args);
			case NS_E_TIMEOUT:
				throw new COMStatus("NS_E_TIMEOUT: The server, a computer set up to offer multimedia content to other computers, could not handle your request for multimedia content in a timely manner. Please try again later.", message, args);
			case NS_E_NET_WRITE:
				throw new COMStatus("NS_E_NET_WRITE: Error writing to the network.", message, args);
			case NS_E_NET_READ:
				throw new COMStatus("NS_E_NET_READ: Error reading from the network.", message, args);
			case NS_E_DISK_WRITE:
				throw new COMStatus("NS_E_DISK_WRITE: Error writing to a disk.", message, args);
			case NS_E_DISK_READ:
				throw new COMStatus("NS_E_DISK_READ: Error reading from a disk.", message, args);
			case NS_E_FILE_WRITE:
				throw new COMStatus("NS_E_FILE_WRITE: Error writing to a file.", message, args);
			case NS_E_FILE_READ:
				throw new COMStatus("NS_E_FILE_READ: Error reading from a file.", message, args);
			case NS_E_FILE_NOT_FOUND:
				throw new COMStatus("NS_E_FILE_NOT_FOUND: The system cannot find the file specified.", message, args);
			case NS_E_FILE_EXISTS:
				throw new COMStatus("NS_E_FILE_EXISTS: The file already exists.", message, args);
			case NS_E_INVALID_NAME:
				throw new COMStatus("NS_E_INVALID_NAME: The file name, directory name, or volume label syntax is incorrect.", message, args);
			case NS_E_FILE_OPEN_FAILED:
				throw new COMStatus("NS_E_FILE_OPEN_FAILED: Failed to open a file.", message, args);
			case NS_E_FILE_ALLOCATION_FAILED:
				throw new COMStatus("NS_E_FILE_ALLOCATION_FAILED: Unable to allocate a file.", message, args);
			case NS_E_FILE_INIT_FAILED:
				throw new COMStatus("NS_E_FILE_INIT_FAILED: Unable to initialize a file.", message, args);
			case NS_E_FILE_PLAY_FAILED:
				throw new COMStatus("NS_E_FILE_PLAY_FAILED: Unable to play a file.", message, args);
			case NS_E_SET_DISK_UID_FAILED:
				throw new COMStatus("NS_E_SET_DISK_UID_FAILED: Could not set the disk UID.", message, args);
			case NS_E_INDUCED:
				throw new COMStatus("NS_E_INDUCED: An error was induced for testing purposes.", message, args);
			case NS_E_CCLINK_DOWN:
				throw new COMStatus("NS_E_CCLINK_DOWN: Two Content Servers failed to communicate.", message, args);
			case NS_E_INTERNAL:
				throw new COMStatus("NS_E_INTERNAL: An unknown error occurred.", message, args);
			case NS_E_BUSY:
				throw new COMStatus("NS_E_BUSY: The requested resource is in use.", message, args);
			case NS_E_UNRECOGNIZED_STREAM_TYPE:
				throw new COMStatus("NS_E_UNRECOGNIZED_STREAM_TYPE: The specified protocol is not recognized. Be sure that the file name and syntax, such as slashes, are correct for the protocol.", message, args);
			case NS_E_NETWORK_SERVICE_FAILURE:
				throw new COMStatus("NS_E_NETWORK_SERVICE_FAILURE: The network service provider failed.", message, args);
			case NS_E_NETWORK_RESOURCE_FAILURE:
				throw new COMStatus("NS_E_NETWORK_RESOURCE_FAILURE: An attempt to acquire a network resource failed.", message, args);
			case NS_E_CONNECTION_FAILURE:
				throw new COMStatus("NS_E_CONNECTION_FAILURE: The network connection has failed.", message, args);
			case NS_E_SHUTDOWN:
				throw new COMStatus("NS_E_SHUTDOWN: The session is being terminated locally.", message, args);
			case NS_E_INVALID_REQUEST:
				throw new COMStatus("NS_E_INVALID_REQUEST: The request is invalid in the current state.", message, args);
			case NS_E_INSUFFICIENT_BANDWIDTH:
				throw new COMStatus("NS_E_INSUFFICIENT_BANDWIDTH: There is insufficient bandwidth available to fulfill the request.", message, args);
			case NS_E_NOT_REBUILDING:
				throw new COMStatus("NS_E_NOT_REBUILDING: The disk is not rebuilding.", message, args);
			case NS_E_LATE_OPERATION:
				throw new COMStatus("NS_E_LATE_OPERATION: An operation requested for a particular time could not be carried out on schedule.", message, args);
			case NS_E_INVALID_DATA:
				throw new COMStatus("NS_E_INVALID_DATA: Invalid or corrupt data was encountered.", message, args);
			case NS_E_FILE_BANDWIDTH_LIMIT:
				throw new COMStatus("NS_E_FILE_BANDWIDTH_LIMIT: The bandwidth required to stream a file is higher than the maximum file bandwidth allowed on the server.", message, args);
			case NS_E_OPEN_FILE_LIMIT:
				throw new COMStatus("NS_E_OPEN_FILE_LIMIT: The client cannot have any more files open simultaneously.", message, args);
			case NS_E_BAD_CONTROL_DATA:
				throw new COMStatus("NS_E_BAD_CONTROL_DATA: The server received invalid data from the client on the control connection.", message, args);
			case NS_E_NO_STREAM:
				throw new COMStatus("NS_E_NO_STREAM: There is no stream available.", message, args);
			case NS_E_STREAM_END:
				throw new COMStatus("NS_E_STREAM_END: There is no more data in the stream.", message, args);
			case NS_E_SERVER_NOT_FOUND:
				throw new COMStatus("NS_E_SERVER_NOT_FOUND: The specified server could not be found.", message, args);
			case NS_E_DUPLICATE_NAME:
				throw new COMStatus("NS_E_DUPLICATE_NAME: The specified name is already in use.", message, args);
			case NS_E_DUPLICATE_ADDRESS:
				throw new COMStatus("NS_E_DUPLICATE_ADDRESS: The specified address is already in use.", message, args);
			case NS_E_BAD_MULTICAST_ADDRESS:
				throw new COMStatus("NS_E_BAD_MULTICAST_ADDRESS: The specified address is not a valid multicast address.", message, args);
			case NS_E_BAD_ADAPTER_ADDRESS:
				throw new COMStatus("NS_E_BAD_ADAPTER_ADDRESS: The specified adapter address is invalid.", message, args);
			case NS_E_BAD_DELIVERY_MODE:
				throw new COMStatus("NS_E_BAD_DELIVERY_MODE: The specified delivery mode is invalid.", message, args);
			case NS_E_INVALID_CHANNEL:
				throw new COMStatus("NS_E_INVALID_CHANNEL: The specified station does not exist.", message, args);
			case NS_E_INVALID_STREAM:
				throw new COMStatus("NS_E_INVALID_STREAM: The specified stream does not exist.", message, args);
			case NS_E_INVALID_ARCHIVE:
				throw new COMStatus("NS_E_INVALID_ARCHIVE: The specified archive could not be opened.", message, args);
			case NS_E_NOTITLES:
				throw new COMStatus("NS_E_NOTITLES: The system cannot find any titles on the server.", message, args);
			case NS_E_INVALID_CLIENT:
				throw new COMStatus("NS_E_INVALID_CLIENT: The system cannot find the client specified.", message, args);
			case NS_E_INVALID_BLACKHOLE_ADDRESS:
				throw new COMStatus("NS_E_INVALID_BLACKHOLE_ADDRESS: The Blackhole Address is not initialized.", message, args);
			case NS_E_INCOMPATIBLE_FORMAT:
				throw new COMStatus("NS_E_INCOMPATIBLE_FORMAT: The station does not support the stream format.", message, args);
			case NS_E_INVALID_KEY:
				throw new COMStatus("NS_E_INVALID_KEY: The specified key is not valid.", message, args);
			case NS_E_INVALID_PORT:
				throw new COMStatus("NS_E_INVALID_PORT: The specified port is not valid.", message, args);
			case NS_E_INVALID_TTL:
				throw new COMStatus("NS_E_INVALID_TTL: The specified TTL is not valid.", message, args);
			case NS_E_STRIDE_REFUSED:
				throw new COMStatus("NS_E_STRIDE_REFUSED: The request to fast forward or rewind could not be fulfilled.", message, args);
			case NS_E_MMSAUTOSERVER_CANTFINDWALKER:
				throw new COMStatus("NS_E_MMSAUTOSERVER_CANTFINDWALKER: Unable to load the appropriate file parser.", message, args);
			case NS_E_MAX_BITRATE:
				throw new COMStatus("NS_E_MAX_BITRATE: Cannot exceed the maximum bandwidth limit.", message, args);
			case NS_E_LOGFILEPERIOD:
				throw new COMStatus("NS_E_LOGFILEPERIOD: Invalid value for LogFilePeriod.", message, args);
			case NS_E_MAX_CLIENTS:
				throw new COMStatus("NS_E_MAX_CLIENTS: Cannot exceed the maximum client limit.", message, args);
			case NS_E_LOG_FILE_SIZE:
				throw new COMStatus("NS_E_LOG_FILE_SIZE: The maximum log file size has been reached.", message, args);
			case NS_E_MAX_FILERATE:
				throw new COMStatus("NS_E_MAX_FILERATE: Cannot exceed the maximum file rate.", message, args);
			case NS_E_WALKER_UNKNOWN:
				throw new COMStatus("NS_E_WALKER_UNKNOWN: Unknown file type.", message, args);
			case NS_E_WALKER_SERVER:
				throw new COMStatus("NS_E_WALKER_SERVER: The specified file, %1, cannot be loaded onto the specified server, %2.", message, args);
			case NS_E_WALKER_USAGE:
				throw new COMStatus("NS_E_WALKER_USAGE: There was a usage error with file parser.", message, args);
			case NS_E_TIGER_FAIL:
				throw new COMStatus("NS_E_TIGER_FAIL: The Title Server %1 has failed.", message, args);
			case NS_E_CUB_FAIL:
				throw new COMStatus("NS_E_CUB_FAIL: Content Server %1 (%2) has failed.", message, args);
			case NS_E_DISK_FAIL:
				throw new COMStatus("NS_E_DISK_FAIL: Disk %1 ( %2 ) on Content Server %3, has failed.", message, args);
			case NS_E_MAX_FUNNELS_ALERT:
				throw new COMStatus("NS_E_MAX_FUNNELS_ALERT: The NetShow data stream limit of %1 streams was reached.", message, args);
			case NS_E_ALLOCATE_FILE_FAIL:
				throw new COMStatus("NS_E_ALLOCATE_FILE_FAIL: The NetShow Video Server was unable to allocate a %1 block file named %2.", message, args);
			case NS_E_PAGING_ERROR:
				throw new COMStatus("NS_E_PAGING_ERROR: A Content Server was unable to page a block.", message, args);
			case NS_E_BAD_BLOCK0_VERSION:
				throw new COMStatus("NS_E_BAD_BLOCK0_VERSION: Disk %1 has unrecognized control block version %2.", message, args);
			case NS_E_BAD_DISK_UID:
				throw new COMStatus("NS_E_BAD_DISK_UID: Disk %1 has incorrect uid %2.", message, args);
			case NS_E_BAD_FSMAJOR_VERSION:
				throw new COMStatus("NS_E_BAD_FSMAJOR_VERSION: Disk %1 has unsupported file system major version %2.", message, args);
			case NS_E_BAD_STAMPNUMBER:
				throw new COMStatus("NS_E_BAD_STAMPNUMBER: Disk %1 has bad stamp number in control block.", message, args);
			case NS_E_PARTIALLY_REBUILT_DISK:
				throw new COMStatus("NS_E_PARTIALLY_REBUILT_DISK: Disk %1 is partially reconstructed.", message, args);
			case NS_E_ENACTPLAN_GIVEUP:
				throw new COMStatus("NS_E_ENACTPLAN_GIVEUP: EnactPlan gives up.", message, args);
			case MCMADM_E_REGKEY_NOT_FOUND:
				throw new COMStatus("MCMADM_E_REGKEY_NOT_FOUND: The key was not found in the registry.", message, args);
			case NS_E_NO_FORMATS:
				throw new COMStatus("NS_E_NO_FORMATS: The publishing point cannot be started because the server does not have the appropriate stream formats. Use the Multicast Announcement Wizard to create a new announcement for this publishing point.", message, args);
			case NS_E_NO_REFERENCES:
				throw new COMStatus("NS_E_NO_REFERENCES: No reference URLs were found in an ASX file.", message, args);
			case NS_E_WAVE_OPEN:
				throw new COMStatus("NS_E_WAVE_OPEN: Error opening wave device, the device might be in use.", message, args);
			case NS_E_CANNOTCONNECTEVENTS:
				throw new COMStatus("NS_E_CANNOTCONNECTEVENTS: Unable to establish a connection to the NetShow event monitor service.", message, args);
			case NS_E_NO_DEVICE:
				throw new COMStatus("NS_E_NO_DEVICE: No device driver is present on the system.", message, args);
			case NS_E_NO_SPECIFIED_DEVICE:
				throw new COMStatus("NS_E_NO_SPECIFIED_DEVICE: No specified device driver is present.", message, args);
			case NS_E_MONITOR_GIVEUP:
				throw new COMStatus("NS_E_MONITOR_GIVEUP: Netshow Events Monitor is not operational and has been disconnected.", message, args);
			case NS_E_REMIRRORED_DISK:
				throw new COMStatus("NS_E_REMIRRORED_DISK: Disk %1 is remirrored.", message, args);
			case NS_E_INSUFFICIENT_DATA:
				throw new COMStatus("NS_E_INSUFFICIENT_DATA: Insufficient data found.", message, args);
			case NS_E_ASSERT:
				throw new COMStatus("NS_E_ASSERT: 1 failed in file %2 line %3.", message, args);
			case NS_E_BAD_ADAPTER_NAME:
				throw new COMStatus("NS_E_BAD_ADAPTER_NAME: The specified adapter name is invalid.", message, args);
			case NS_E_NOT_LICENSED:
				throw new COMStatus("NS_E_NOT_LICENSED: The application is not licensed for this feature.", message, args);
			case NS_E_NO_SERVER_CONTACT:
				throw new COMStatus("NS_E_NO_SERVER_CONTACT: Unable to contact the server.", message, args);
			case NS_E_TOO_MANY_TITLES:
				throw new COMStatus("NS_E_TOO_MANY_TITLES: Maximum number of titles exceeded.", message, args);
			case NS_E_TITLE_SIZE_EXCEEDED:
				throw new COMStatus("NS_E_TITLE_SIZE_EXCEEDED: Maximum size of a title exceeded.", message, args);
			case NS_E_UDP_DISABLED:
				throw new COMStatus("NS_E_UDP_DISABLED: UDP protocol not enabled. Not trying %1!ls!.", message, args);
			case NS_E_TCP_DISABLED:
				throw new COMStatus("NS_E_TCP_DISABLED: TCP protocol not enabled. Not trying %1!ls!.", message, args);
			case NS_E_HTTP_DISABLED:
				throw new COMStatus("NS_E_HTTP_DISABLED: HTTP protocol not enabled. Not trying %1!ls!.", message, args);
			case NS_E_LICENSE_EXPIRED:
				throw new COMStatus("NS_E_LICENSE_EXPIRED: The product license has expired.", message, args);
			case NS_E_TITLE_BITRATE:
				throw new COMStatus("NS_E_TITLE_BITRATE: Source file exceeds the per title maximum bitrate. See NetShow Theater documentation for more information.", message, args);
			case NS_E_EMPTY_PROGRAM_NAME:
				throw new COMStatus("NS_E_EMPTY_PROGRAM_NAME: The program name cannot be empty.", message, args);
			case NS_E_MISSING_CHANNEL:
				throw new COMStatus("NS_E_MISSING_CHANNEL: Station %1 does not exist.", message, args);
			case NS_E_NO_CHANNELS:
				throw new COMStatus("NS_E_NO_CHANNELS: You need to define at least one station before this operation can complete.", message, args);
			case NS_E_INVALID_INDEX2:
				throw new COMStatus("NS_E_INVALID_INDEX2: The index specified is invalid.", message, args);
			case NS_E_CUB_FAIL_LINK:
				throw new COMStatus("NS_E_CUB_FAIL_LINK: Content Server %1 (%2) has failed its link to Content Server %3.", message, args);
			case NS_E_BAD_CUB_UID:
				throw new COMStatus("NS_E_BAD_CUB_UID: Content Server %1 (%2) has incorrect uid %3.", message, args);
			case NS_E_GLITCH_MODE:
				throw new COMStatus("NS_E_GLITCH_MODE: Server unreliable because multiple components failed.", message, args);
			case NS_E_NO_MEDIA_PROTOCOL:
				throw new COMStatus("NS_E_NO_MEDIA_PROTOCOL: Content Server %1 (%2) is unable to communicate with the Media System Network Protocol.", message, args);
			case NS_E_NOTHING_TO_DO:
				throw new COMStatus("NS_E_NOTHING_TO_DO: Nothing to do.", message, args);
			case NS_E_NO_MULTICAST:
				throw new COMStatus("NS_E_NO_MULTICAST: Not receiving data from the server.", message, args);
			case NS_E_INVALID_INPUT_FORMAT:
				throw new COMStatus("NS_E_INVALID_INPUT_FORMAT: The input media format is invalid.", message, args);
			case NS_E_MSAUDIO_NOT_INSTALLED:
				throw new COMStatus("NS_E_MSAUDIO_NOT_INSTALLED: The MSAudio codec is not installed on this system.", message, args);
			case NS_E_UNEXPECTED_MSAUDIO_ERROR:
				throw new COMStatus("NS_E_UNEXPECTED_MSAUDIO_ERROR: An unexpected error occurred with the MSAudio codec.", message, args);
			case NS_E_INVALID_OUTPUT_FORMAT:
				throw new COMStatus("NS_E_INVALID_OUTPUT_FORMAT: The output media format is invalid.", message, args);
			case NS_E_NOT_CONFIGURED:
				throw new COMStatus("NS_E_NOT_CONFIGURED: The object must be fully configured before audio samples can be processed.", message, args);
			case NS_E_PROTECTED_CONTENT:
				throw new COMStatus("NS_E_PROTECTED_CONTENT: You need a license to perform the requested operation on this media file.", message, args);
			case NS_E_LICENSE_REQUIRED:
				throw new COMStatus("NS_E_LICENSE_REQUIRED: You need a license to perform the requested operation on this media file.", message, args);
			case NS_E_TAMPERED_CONTENT:
				throw new COMStatus("NS_E_TAMPERED_CONTENT: This media file is corrupted or invalid. Contact the content provider for a new file.", message, args);
			case NS_E_LICENSE_OUTOFDATE:
				throw new COMStatus("NS_E_LICENSE_OUTOFDATE: The license for this media file has expired. Get a new license or contact the content provider for further assistance.", message, args);
			case NS_E_LICENSE_INCORRECT_RIGHTS:
				throw new COMStatus("NS_E_LICENSE_INCORRECT_RIGHTS: You are not allowed to open this file. Contact the content provider for further assistance.", message, args);
			case NS_E_AUDIO_CODEC_NOT_INSTALLED:
				throw new COMStatus("NS_E_AUDIO_CODEC_NOT_INSTALLED: The requested audio codec is not installed on this system.", message, args);
			case NS_E_AUDIO_CODEC_ERROR:
				throw new COMStatus("NS_E_AUDIO_CODEC_ERROR: An unexpected error occurred with the audio codec.", message, args);
			case NS_E_VIDEO_CODEC_NOT_INSTALLED:
				throw new COMStatus("NS_E_VIDEO_CODEC_NOT_INSTALLED: The requested video codec is not installed on this system.", message, args);
			case NS_E_VIDEO_CODEC_ERROR:
				throw new COMStatus("NS_E_VIDEO_CODEC_ERROR: An unexpected error occurred with the video codec.", message, args);
			case NS_E_INVALIDPROFILE:
				throw new COMStatus("NS_E_INVALIDPROFILE: The Profile is invalid.", message, args);
			case NS_E_INCOMPATIBLE_VERSION:
				throw new COMStatus("NS_E_INCOMPATIBLE_VERSION: A new version of the SDK is needed to play the requested content.", message, args);
			case NS_E_OFFLINE_MODE:
				throw new COMStatus("NS_E_OFFLINE_MODE: The requested URL is not available in offline mode.", message, args);
			case NS_E_NOT_CONNECTED:
				throw new COMStatus("NS_E_NOT_CONNECTED: The requested URL cannot be accessed because there is no network connection.", message, args);
			case NS_E_TOO_MUCH_DATA:
				throw new COMStatus("NS_E_TOO_MUCH_DATA: The encoding process was unable to keep up with the amount of supplied data.", message, args);
			case NS_E_UNSUPPORTED_PROPERTY:
				throw new COMStatus("NS_E_UNSUPPORTED_PROPERTY: The given property is not supported.", message, args);
			case NS_E_8BIT_WAVE_UNSUPPORTED:
				throw new COMStatus("NS_E_8BIT_WAVE_UNSUPPORTED: Windows Media Player cannot copy the files to the CD because they are 8-bit. Convert the files to 16-bit, 44-kHz stereo files by using Sound Recorder or another audio-processing program, and then try again.", message, args);
			case NS_E_NO_MORE_SAMPLES:
				throw new COMStatus("NS_E_NO_MORE_SAMPLES: There are no more samples in the current range.", message, args);
			case NS_E_INVALID_SAMPLING_RATE:
				throw new COMStatus("NS_E_INVALID_SAMPLING_RATE: The given sampling rate is invalid.", message, args);
			case NS_E_MAX_PACKET_SIZE_TOO_SMALL:
				throw new COMStatus("NS_E_MAX_PACKET_SIZE_TOO_SMALL: The given maximum packet size is too small to accommodate this profile.)", message, args);
			case NS_E_LATE_PACKET:
				throw new COMStatus("NS_E_LATE_PACKET: The packet arrived too late to be of use.", message, args);
			case NS_E_DUPLICATE_PACKET:
				throw new COMStatus("NS_E_DUPLICATE_PACKET: The packet is a duplicate of one received before.", message, args);
			case NS_E_SDK_BUFFERTOOSMALL:
				throw new COMStatus("NS_E_SDK_BUFFERTOOSMALL: Supplied buffer is too small.", message, args);
			case NS_E_INVALID_NUM_PASSES:
				throw new COMStatus("NS_E_INVALID_NUM_PASSES: The wrong number of preprocessing passes was used for the stream's output type.", message, args);
			case NS_E_ATTRIBUTE_READ_ONLY:
				throw new COMStatus("NS_E_ATTRIBUTE_READ_ONLY: An attempt was made to add, modify, or delete a read only attribute.", message, args);
			case NS_E_ATTRIBUTE_NOT_ALLOWED:
				throw new COMStatus("NS_E_ATTRIBUTE_NOT_ALLOWED: An attempt was made to add attribute that is not allowed for the given media type.", message, args);
			case NS_E_INVALID_EDL:
				throw new COMStatus("NS_E_INVALID_EDL: The EDL provided is invalid.", message, args);
			case NS_E_DATA_UNIT_EXTENSION_TOO_LARGE:
				throw new COMStatus("NS_E_DATA_UNIT_EXTENSION_TOO_LARGE: The Data Unit Extension data was too large to be used.", message, args);
			case NS_E_CODEC_DMO_ERROR:
				throw new COMStatus("NS_E_CODEC_DMO_ERROR: An unexpected error occurred with a DMO codec.", message, args);
			case NS_E_FEATURE_DISABLED_BY_GROUP_POLICY:
				throw new COMStatus("NS_E_FEATURE_DISABLED_BY_GROUP_POLICY: This feature has been disabled by group policy.", message, args);
			case NS_E_FEATURE_DISABLED_IN_SKU:
				throw new COMStatus("NS_E_FEATURE_DISABLED_IN_SKU: This feature is disabled in this SKU.", message, args);
			case NS_E_NO_CD:
				throw new COMStatus("NS_E_NO_CD: There is no CD in the CD drive. Insert a CD, and then try again.", message, args);
			case NS_E_CANT_READ_DIGITAL:
				throw new COMStatus("NS_E_CANT_READ_DIGITAL: Windows Media Player could not use digital playback to play the CD. To switch to analog playback, on the Tools menu, click Options, and then click the Devices tab. Double-click the CD drive, and then in the Playback area, click Analog. For additional assistance, click Web Help.", message, args);
			case NS_E_DEVICE_DISCONNECTED:
				throw new COMStatus("NS_E_DEVICE_DISCONNECTED: Windows Media Player no longer detects a connected portable device. Reconnect your portable device, and then try synchronizing the file again.", message, args);
			case NS_E_DEVICE_NOT_SUPPORT_FORMAT:
				throw new COMStatus("NS_E_DEVICE_NOT_SUPPORT_FORMAT: Windows Media Player cannot play the file. The portable device does not support the specified file type.", message, args);
			case NS_E_SLOW_READ_DIGITAL:
				throw new COMStatus("NS_E_SLOW_READ_DIGITAL: Windows Media Player could not use digital playback to play the CD. The Player has automatically switched the CD drive to analog playback. To switch back to digital CD playback, use the Devices tab. For additional assistance, click Web Help.", message, args);
			case NS_E_MIXER_INVALID_LINE:
				throw new COMStatus("NS_E_MIXER_INVALID_LINE: An invalid line error occurred in the mixer.", message, args);
			case NS_E_MIXER_INVALID_CONTROL:
				throw new COMStatus("NS_E_MIXER_INVALID_CONTROL: An invalid control error occurred in the mixer.", message, args);
			case NS_E_MIXER_INVALID_VALUE:
				throw new COMStatus("NS_E_MIXER_INVALID_VALUE: An invalid value error occurred in the mixer.", message, args);
			case NS_E_MIXER_UNKNOWN_MMRESULT:
				throw new COMStatus("NS_E_MIXER_UNKNOWN_MMRESULT: An unrecognized MMRESULT occurred in the mixer.", message, args);
			case NS_E_USER_STOP:
				throw new COMStatus("NS_E_USER_STOP: User has stopped the operation.", message, args);
			case NS_E_MP3_FORMAT_NOT_FOUND:
				throw new COMStatus("NS_E_MP3_FORMAT_NOT_FOUND: Windows Media Player cannot rip the track because a compatible MP3 encoder is not installed on your computer. Install a compatible MP3 encoder or choose a different format to rip to (such as Windows Media Audio).", message, args);
			case NS_E_CD_READ_ERROR_NO_CORRECTION:
				throw new COMStatus("NS_E_CD_READ_ERROR_NO_CORRECTION: Windows Media Player cannot read the CD. The disc might be dirty or damaged. Turn on error correction, and then try again.", message, args);
			case NS_E_CD_READ_ERROR:
				throw new COMStatus("NS_E_CD_READ_ERROR: Windows Media Player cannot read the CD. The disc might be dirty or damaged or the CD drive might be malfunctioning.", message, args);
			case NS_E_CD_SLOW_COPY:
				throw new COMStatus("NS_E_CD_SLOW_COPY: For best performance, do not play CD tracks while ripping them.", message, args);
			case NS_E_CD_COPYTO_CD:
				throw new COMStatus("NS_E_CD_COPYTO_CD: It is not possible to directly burn tracks from one CD to another CD. You must first rip the tracks from the CD to your computer, and then burn the files to a blank CD.", message, args);
			case NS_E_MIXER_NODRIVER:
				throw new COMStatus("NS_E_MIXER_NODRIVER: Could not open a sound mixer driver.", message, args);
			case NS_E_REDBOOK_ENABLED_WHILE_COPYING:
				throw new COMStatus("NS_E_REDBOOK_ENABLED_WHILE_COPYING: Windows Media Player cannot rip tracks from the CD correctly because the CD drive settings in Device Manager do not match the CD drive settings in the Player.", message, args);
			case NS_E_CD_REFRESH:
				throw new COMStatus("NS_E_CD_REFRESH: Windows Media Player is busy reading the CD.", message, args);
			case NS_E_CD_DRIVER_PROBLEM:
				throw new COMStatus("NS_E_CD_DRIVER_PROBLEM: Windows Media Player could not use digital playback to play the CD. The Player has automatically switched the CD drive to analog playback. To switch back to digital CD playback, use the Devices tab. For additional assistance, click Web Help.", message, args);
			case NS_E_WONT_DO_DIGITAL:
				throw new COMStatus("NS_E_WONT_DO_DIGITAL: Windows Media Player could not use digital playback to play the CD. The Player has automatically switched the CD drive to analog playback. To switch back to digital CD playback, use the Devices tab. For additional assistance, click Web Help.", message, args);
			case NS_E_WMPXML_NOERROR:
				throw new COMStatus("NS_E_WMPXML_NOERROR: A call was made to GetParseError on the XML parser but there was no error to retrieve.", message, args);
			case NS_E_WMPXML_ENDOFDATA:
				throw new COMStatus("NS_E_WMPXML_ENDOFDATA: The XML Parser ran out of data while parsing.", message, args);
			case NS_E_WMPXML_PARSEERROR:
				throw new COMStatus("NS_E_WMPXML_PARSEERROR: A generic parse error occurred in the XML parser but no information is available.", message, args);
			case NS_E_WMPXML_ATTRIBUTENOTFOUND:
				throw new COMStatus("NS_E_WMPXML_ATTRIBUTENOTFOUND: A call get GetNamedAttribute or GetNamedAttributeIndex on the XML parser resulted in the index not being found.", message, args);
			case NS_E_WMPXML_PINOTFOUND:
				throw new COMStatus("NS_E_WMPXML_PINOTFOUND: A call was made go GetNamedPI on the XML parser, but the requested Processing Instruction was not found.", message, args);
			case NS_E_WMPXML_EMPTYDOC:
				throw new COMStatus("NS_E_WMPXML_EMPTYDOC: Persist was called on the XML parser, but the parser has no data to persist.", message, args);
			case NS_E_WMP_PATH_ALREADY_IN_LIBRARY:
				throw new COMStatus("NS_E_WMP_PATH_ALREADY_IN_LIBRARY: This file path is already in the library.", message, args);
			case NS_E_WMP_FILESCANALREADYSTARTED:
				throw new COMStatus("NS_E_WMP_FILESCANALREADYSTARTED: Windows Media Player is already searching for files to add to your library. Wait for the current process to finish before attempting to search again.", message, args);
			case NS_E_WMP_HME_INVALIDOBJECTID:
				throw new COMStatus("NS_E_WMP_HME_INVALIDOBJECTID: Windows Media Player is unable to find the media you are looking for.", message, args);
			case NS_E_WMP_MF_CODE_EXPIRED:
				throw new COMStatus("NS_E_WMP_MF_CODE_EXPIRED: A component of Windows Media Player is out-of-date. If you are running a pre-release version of Windows, try upgrading to a more recent version.", message, args);
			case NS_E_WMP_HME_NOTSEARCHABLEFORITEMS:
				throw new COMStatus("NS_E_WMP_HME_NOTSEARCHABLEFORITEMS: This container does not support search on items.", message, args);
			case NS_E_WMP_ADDTOLIBRARY_FAILED:
				throw new COMStatus("NS_E_WMP_ADDTOLIBRARY_FAILED: Windows Media Player encountered a problem while adding one or more files to the library. For additional assistance, click Web Help.", message, args);
			case NS_E_WMP_WINDOWSAPIFAILURE:
				throw new COMStatus("NS_E_WMP_WINDOWSAPIFAILURE: A Windows API call failed but no error information was available.", message, args);
			case NS_E_WMP_RECORDING_NOT_ALLOWED:
				throw new COMStatus("NS_E_WMP_RECORDING_NOT_ALLOWED: This file does not have burn rights. If you obtained this file from an online store, go to the online store to get burn rights.", message, args);
			case NS_E_DEVICE_NOT_READY:
				throw new COMStatus("NS_E_DEVICE_NOT_READY: Windows Media Player no longer detects a connected portable device. Reconnect your portable device, and then try to sync the file again.", message, args);
			case NS_E_DAMAGED_FILE:
				throw new COMStatus("NS_E_DAMAGED_FILE: Windows Media Player cannot play the file because it is corrupted.", message, args);
			case NS_E_MPDB_GENERIC:
				throw new COMStatus("NS_E_MPDB_GENERIC: Windows Media Player encountered an error while attempting to access information in the library. Try restarting the Player.", message, args);
			case NS_E_FILE_FAILED_CHECKS:
				throw new COMStatus("NS_E_FILE_FAILED_CHECKS: The file cannot be added to the library because it is smaller than the \"Skip files smaller than\" setting. To add the file, change the setting on the Library tab. For additional assistance, click Web Help.", message, args);
			case NS_E_MEDIA_LIBRARY_FAILED:
				throw new COMStatus("NS_E_MEDIA_LIBRARY_FAILED: Windows Media Player cannot create the library. You must be logged on as an administrator or a member of the Administrators group to install the Player. For more information, contact your system administrator.", message, args);
			case NS_E_SHARING_VIOLATION:
				throw new COMStatus("NS_E_SHARING_VIOLATION: The file is already in use. Close other programs that might be using the file, or stop playing the file, and then try again.", message, args);
			case NS_E_NO_ERROR_STRING_FOUND:
				throw new COMStatus("NS_E_NO_ERROR_STRING_FOUND: Windows Media Player has encountered an unknown error.", message, args);
			case NS_E_WMPOCX_NO_REMOTE_CORE:
				throw new COMStatus("NS_E_WMPOCX_NO_REMOTE_CORE: The Windows Media Player ActiveX control cannot connect to remote media services, but will continue with local media services.", message, args);
			case NS_E_WMPOCX_NO_ACTIVE_CORE:
				throw new COMStatus("NS_E_WMPOCX_NO_ACTIVE_CORE: The requested method or property is not available because the Windows Media Player ActiveX control has not been properly activated.", message, args);
			case NS_E_WMPOCX_NOT_RUNNING_REMOTELY:
				throw new COMStatus("NS_E_WMPOCX_NOT_RUNNING_REMOTELY: The Windows Media Player ActiveX control is not running in remote mode.", message, args);
			case NS_E_WMPOCX_NO_REMOTE_WINDOW:
				throw new COMStatus("NS_E_WMPOCX_NO_REMOTE_WINDOW: An error occurred while trying to get the remote Windows Media Player window.", message, args);
			case NS_E_WMPOCX_ERRORMANAGERNOTAVAILABLE:
				throw new COMStatus("NS_E_WMPOCX_ERRORMANAGERNOTAVAILABLE: Windows Media Player has encountered an unknown error.", message, args);
			case NS_E_PLUGIN_NOTSHUTDOWN:
				throw new COMStatus("NS_E_PLUGIN_NOTSHUTDOWN: Windows Media Player was not closed properly. A damaged or incompatible plug-in might have caused the problem to occur. As a precaution, all optional plug-ins have been disabled.", message, args);
			case NS_E_WMP_CANNOT_FIND_FOLDER:
				throw new COMStatus("NS_E_WMP_CANNOT_FIND_FOLDER: Windows Media Player cannot find the specified path. Verify that the path is typed correctly. If it is, the path does not exist in the specified location, or the computer where the path is located is not available.", message, args);
			case NS_E_WMP_STREAMING_RECORDING_NOT_ALLOWED:
				throw new COMStatus("NS_E_WMP_STREAMING_RECORDING_NOT_ALLOWED: Windows Media Player cannot save a file that is being streamed.", message, args);
			case NS_E_WMP_PLUGINDLL_NOTFOUND:
				throw new COMStatus("NS_E_WMP_PLUGINDLL_NOTFOUND: Windows Media Player cannot find the selected plug-in. The Player will try to remove it from the menu. To use this plug-in, install it again.", message, args);
			case NS_E_NEED_TO_ASK_USER:
				throw new COMStatus("NS_E_NEED_TO_ASK_USER: Action requires input from the user.", message, args);
			case NS_E_WMPOCX_PLAYER_NOT_DOCKED:
				throw new COMStatus("NS_E_WMPOCX_PLAYER_NOT_DOCKED: The Windows Media Player ActiveX control must be in a docked state for this action to be performed.", message, args);
			case NS_E_WMP_EXTERNAL_NOTREADY:
				throw new COMStatus("NS_E_WMP_EXTERNAL_NOTREADY: The Windows Media Player external object is not ready.", message, args);
			case NS_E_WMP_MLS_STALE_DATA:
				throw new COMStatus("NS_E_WMP_MLS_STALE_DATA: Windows Media Player cannot perform the requested action. Your computer's time and date might not be set correctly.", message, args);
			case NS_E_WMP_UI_SUBCONTROLSNOTSUPPORTED:
				throw new COMStatus("NS_E_WMP_UI_SUBCONTROLSNOTSUPPORTED: The control (%s) does not support creation of sub-controls, yet (%d) sub-controls have been specified.", message, args);
			case NS_E_WMP_UI_VERSIONMISMATCH:
				throw new COMStatus("NS_E_WMP_UI_VERSIONMISMATCH: Version mismatch: (%.1f required, %.1f found).", message, args);
			case NS_E_WMP_UI_NOTATHEMEFILE:
				throw new COMStatus("NS_E_WMP_UI_NOTATHEMEFILE: The layout manager was given valid XML that wasn't a theme file.", message, args);
			case NS_E_WMP_UI_SUBELEMENTNOTFOUND:
				throw new COMStatus("NS_E_WMP_UI_SUBELEMENTNOTFOUND: The %s subelement could not be found on the %s object.", message, args);
			case NS_E_WMP_UI_VERSIONPARSE:
				throw new COMStatus("NS_E_WMP_UI_VERSIONPARSE: An error occurred parsing the version tag. Valid version tags are of the form: <?wmp version='1.0'?>.", message, args);
			case NS_E_WMP_UI_VIEWIDNOTFOUND:
				throw new COMStatus("NS_E_WMP_UI_VIEWIDNOTFOUND: The view specified in for the 'currentViewID' property (%s) was not found in this theme file.", message, args);
			case NS_E_WMP_UI_PASSTHROUGH:
				throw new COMStatus("NS_E_WMP_UI_PASSTHROUGH: This error used internally for hit testing.", message, args);
			case NS_E_WMP_UI_OBJECTNOTFOUND:
				throw new COMStatus("NS_E_WMP_UI_OBJECTNOTFOUND: Attributes were specified for the %s object, but the object was not available to send them to.", message, args);
			case NS_E_WMP_UI_SECONDHANDLER:
				throw new COMStatus("NS_E_WMP_UI_SECONDHANDLER: The %s event already has a handler, the second handler was ignored.", message, args);
			case NS_E_WMP_UI_NOSKININZIP:
				throw new COMStatus("NS_E_WMP_UI_NOSKININZIP: No .wms file found in skin archive.", message, args);
			case NS_E_WMP_URLDOWNLOADFAILED:
				throw new COMStatus("NS_E_WMP_URLDOWNLOADFAILED: Windows Media Player encountered a problem while downloading the file. For additional assistance, click Web Help.", message, args);
			case NS_E_WMPOCX_UNABLE_TO_LOAD_SKIN:
				throw new COMStatus("NS_E_WMPOCX_UNABLE_TO_LOAD_SKIN: The Windows Media Player ActiveX control cannot load the requested uiMode and cannot roll back to the existing uiMode.", message, args);
			case NS_E_WMP_INVALID_SKIN:
				throw new COMStatus("NS_E_WMP_INVALID_SKIN: Windows Media Player encountered a problem with the skin file. The skin file might not be valid.", message, args);
			case NS_E_WMP_SENDMAILFAILED:
				throw new COMStatus("NS_E_WMP_SENDMAILFAILED: Windows Media Player cannot send the link because your email program is not responding. Verify that your email program is configured properly, and then try again. For more information about email, see Windows Help.", message, args);
			case NS_E_WMP_LOCKEDINSKINMODE:
				throw new COMStatus("NS_E_WMP_LOCKEDINSKINMODE: Windows Media Player cannot switch to full mode because your computer administrator has locked this skin.", message, args);
			case NS_E_WMP_FAILED_TO_SAVE_FILE:
				throw new COMStatus("NS_E_WMP_FAILED_TO_SAVE_FILE: Windows Media Player encountered a problem while saving the file. For additional assistance, click Web Help.", message, args);
			case NS_E_WMP_SAVEAS_READONLY:
				throw new COMStatus("NS_E_WMP_SAVEAS_READONLY: Windows Media Player cannot overwrite a read-only file. Try using a different file name.", message, args);
			case NS_E_WMP_FAILED_TO_SAVE_PLAYLIST:
				throw new COMStatus("NS_E_WMP_FAILED_TO_SAVE_PLAYLIST: Windows Media Player encountered a problem while creating or saving the playlist. For additional assistance, click Web Help.", message, args);
			case NS_E_WMP_FAILED_TO_OPEN_WMD:
				throw new COMStatus("NS_E_WMP_FAILED_TO_OPEN_WMD: Windows Media Player cannot open the Windows Media Download file. The file might be damaged.", message, args);
			case NS_E_WMP_CANT_PLAY_PROTECTED:
				throw new COMStatus("NS_E_WMP_CANT_PLAY_PROTECTED: The file cannot be added to the library because it is a protected DVR-MS file. This content cannot be played back by Windows Media Player.", message, args);
			case NS_E_SHARING_STATE_OUT_OF_SYNC:
				throw new COMStatus("NS_E_SHARING_STATE_OUT_OF_SYNC: Media sharing has been turned off because a required Windows setting or component has changed. For additional assistance, click Web Help.", message, args);
			case NS_E_WMPOCX_REMOTE_PLAYER_ALREADY_RUNNING:
				throw new COMStatus("NS_E_WMPOCX_REMOTE_PLAYER_ALREADY_RUNNING: Exclusive Services launch failed because the Windows Media Player is already running.", message, args);
			case NS_E_WMP_RBC_JPGMAPPINGIMAGE:
				throw new COMStatus("NS_E_WMP_RBC_JPGMAPPINGIMAGE: JPG Images are not recommended for use as a mappingImage.", message, args);
			case NS_E_WMP_JPGTRANSPARENCY:
				throw new COMStatus("NS_E_WMP_JPGTRANSPARENCY: JPG Images are not recommended when using a transparencyColor.", message, args);
			case NS_E_WMP_INVALID_MAX_VAL:
				throw new COMStatus("NS_E_WMP_INVALID_MAX_VAL: The Max property cannot be less than Min property.", message, args);
			case NS_E_WMP_INVALID_MIN_VAL:
				throw new COMStatus("NS_E_WMP_INVALID_MIN_VAL: The Min property cannot be greater than Max property.", message, args);
			case NS_E_WMP_CS_JPGPOSITIONIMAGE:
				throw new COMStatus("NS_E_WMP_CS_JPGPOSITIONIMAGE: JPG Images are not recommended for use as a positionImage.", message, args);
			case NS_E_WMP_CS_NOTEVENLYDIVISIBLE:
				throw new COMStatus("NS_E_WMP_CS_NOTEVENLYDIVISIBLE: The (%s) image's size is not evenly divisible by the positionImage's size.", message, args);
			case NS_E_WMPZIP_NOTAZIPFILE:
				throw new COMStatus("NS_E_WMPZIP_NOTAZIPFILE: The ZIP reader opened a file and its signature did not match that of the ZIP files.", message, args);
			case NS_E_WMPZIP_CORRUPT:
				throw new COMStatus("NS_E_WMPZIP_CORRUPT: The ZIP reader has detected that the file is corrupted.", message, args);
			case NS_E_WMPZIP_FILENOTFOUND:
				throw new COMStatus("NS_E_WMPZIP_FILENOTFOUND: GetFileStream, SaveToFile, or SaveTemp file was called on the ZIP reader with a file name that was not found in the ZIP file.", message, args);
			case NS_E_WMP_IMAGE_FILETYPE_UNSUPPORTED:
				throw new COMStatus("NS_E_WMP_IMAGE_FILETYPE_UNSUPPORTED: Image type not supported.", message, args);
			case NS_E_WMP_IMAGE_INVALID_FORMAT:
				throw new COMStatus("NS_E_WMP_IMAGE_INVALID_FORMAT: Image file may be corrupt.", message, args);
			case NS_E_WMP_GIF_UNEXPECTED_ENDOFFILE:
				throw new COMStatus("NS_E_WMP_GIF_UNEXPECTED_ENDOFFILE: Unexpected end of file. GIF file may be corrupt.", message, args);
			case NS_E_WMP_GIF_INVALID_FORMAT:
				throw new COMStatus("NS_E_WMP_GIF_INVALID_FORMAT: Invalid GIF file.", message, args);
			case NS_E_WMP_GIF_BAD_VERSION_NUMBER:
				throw new COMStatus("NS_E_WMP_GIF_BAD_VERSION_NUMBER: Invalid GIF version. Only 87a or 89a supported.", message, args);
			case NS_E_WMP_GIF_NO_IMAGE_IN_FILE:
				throw new COMStatus("NS_E_WMP_GIF_NO_IMAGE_IN_FILE: No images found in GIF file.", message, args);
			case NS_E_WMP_PNG_INVALIDFORMAT:
				throw new COMStatus("NS_E_WMP_PNG_INVALIDFORMAT: Invalid PNG image file format.", message, args);
			case NS_E_WMP_PNG_UNSUPPORTED_BITDEPTH:
				throw new COMStatus("NS_E_WMP_PNG_UNSUPPORTED_BITDEPTH: PNG bitdepth not supported.", message, args);
			case NS_E_WMP_PNG_UNSUPPORTED_COMPRESSION:
				throw new COMStatus("NS_E_WMP_PNG_UNSUPPORTED_COMPRESSION: Compression format defined in PNG file not supported,", message, args);
			case NS_E_WMP_PNG_UNSUPPORTED_FILTER:
				throw new COMStatus("NS_E_WMP_PNG_UNSUPPORTED_FILTER: Filter method defined in PNG file not supported.", message, args);
			case NS_E_WMP_PNG_UNSUPPORTED_INTERLACE:
				throw new COMStatus("NS_E_WMP_PNG_UNSUPPORTED_INTERLACE: Interlace method defined in PNG file not supported.", message, args);
			case NS_E_WMP_PNG_UNSUPPORTED_BAD_CRC:
				throw new COMStatus("NS_E_WMP_PNG_UNSUPPORTED_BAD_CRC: Bad CRC in PNG file.", message, args);
			case NS_E_WMP_BMP_INVALID_BITMASK:
				throw new COMStatus("NS_E_WMP_BMP_INVALID_BITMASK: Invalid bitmask in BMP file.", message, args);
			case NS_E_WMP_BMP_TOPDOWN_DIB_UNSUPPORTED:
				throw new COMStatus("NS_E_WMP_BMP_TOPDOWN_DIB_UNSUPPORTED: Topdown DIB not supported.", message, args);
			case NS_E_WMP_BMP_BITMAP_NOT_CREATED:
				throw new COMStatus("NS_E_WMP_BMP_BITMAP_NOT_CREATED: Bitmap could not be created.", message, args);
			case NS_E_WMP_BMP_COMPRESSION_UNSUPPORTED:
				throw new COMStatus("NS_E_WMP_BMP_COMPRESSION_UNSUPPORTED: Compression format defined in BMP not supported.", message, args);
			case NS_E_WMP_BMP_INVALID_FORMAT:
				throw new COMStatus("NS_E_WMP_BMP_INVALID_FORMAT: Invalid Bitmap format.", message, args);
			case NS_E_WMP_JPG_JERR_ARITHCODING_NOTIMPL:
				throw new COMStatus("NS_E_WMP_JPG_JERR_ARITHCODING_NOTIMPL: JPEG Arithmetic coding not supported.", message, args);
			case NS_E_WMP_JPG_INVALID_FORMAT:
				throw new COMStatus("NS_E_WMP_JPG_INVALID_FORMAT: Invalid JPEG format.", message, args);
			case NS_E_WMP_JPG_BAD_DCTSIZE:
				throw new COMStatus("NS_E_WMP_JPG_BAD_DCTSIZE: Invalid JPEG format.", message, args);
			case NS_E_WMP_JPG_BAD_VERSION_NUMBER:
				throw new COMStatus("NS_E_WMP_JPG_BAD_VERSION_NUMBER: Internal version error. Unexpected JPEG library version.", message, args);
			case NS_E_WMP_JPG_BAD_PRECISION:
				throw new COMStatus("NS_E_WMP_JPG_BAD_PRECISION: Internal JPEG Library error. Unsupported JPEG data precision.", message, args);
			case NS_E_WMP_JPG_CCIR601_NOTIMPL:
				throw new COMStatus("NS_E_WMP_JPG_CCIR601_NOTIMPL: JPEG CCIR601 not supported.", message, args);
			case NS_E_WMP_JPG_NO_IMAGE_IN_FILE:
				throw new COMStatus("NS_E_WMP_JPG_NO_IMAGE_IN_FILE: No image found in JPEG file.", message, args);
			case NS_E_WMP_JPG_READ_ERROR:
				throw new COMStatus("NS_E_WMP_JPG_READ_ERROR: Could not read JPEG file.", message, args);
			case NS_E_WMP_JPG_FRACT_SAMPLE_NOTIMPL:
				throw new COMStatus("NS_E_WMP_JPG_FRACT_SAMPLE_NOTIMPL: JPEG Fractional sampling not supported.", message, args);
			case NS_E_WMP_JPG_IMAGE_TOO_BIG:
				throw new COMStatus("NS_E_WMP_JPG_IMAGE_TOO_BIG: JPEG image too large. Maximum image size supported is 65500 X 65500.", message, args);
			case NS_E_WMP_JPG_UNEXPECTED_ENDOFFILE:
				throw new COMStatus("NS_E_WMP_JPG_UNEXPECTED_ENDOFFILE: Unexpected end of file reached in JPEG file.", message, args);
			case NS_E_WMP_JPG_SOF_UNSUPPORTED:
				throw new COMStatus("NS_E_WMP_JPG_SOF_UNSUPPORTED: Unsupported JPEG SOF marker found.", message, args);
			case NS_E_WMP_JPG_UNKNOWN_MARKER:
				throw new COMStatus("NS_E_WMP_JPG_UNKNOWN_MARKER: Unknown JPEG marker found.", message, args);
			case NS_E_WMP_FAILED_TO_OPEN_IMAGE:
				throw new COMStatus("NS_E_WMP_FAILED_TO_OPEN_IMAGE: Windows Media Player cannot display the picture file. The player either does not support the picture type or the picture is corrupted.", message, args);
			case NS_E_WMP_DAI_SONGTOOSHORT:
				throw new COMStatus("NS_E_WMP_DAI_SONGTOOSHORT: Windows Media Player cannot compute a Digital Audio Id for the song. It is too short.", message, args);
			case NS_E_WMG_RATEUNAVAILABLE:
				throw new COMStatus("NS_E_WMG_RATEUNAVAILABLE: Windows Media Player cannot play the file at the requested speed.", message, args);
			case NS_E_WMG_PLUGINUNAVAILABLE:
				throw new COMStatus("NS_E_WMG_PLUGINUNAVAILABLE: The rendering or digital signal processing plug-in cannot be instantiated.", message, args);
			case NS_E_WMG_CANNOTQUEUE:
				throw new COMStatus("NS_E_WMG_CANNOTQUEUE: The file cannot be queued for seamless playback.", message, args);
			case NS_E_WMG_PREROLLLICENSEACQUISITIONNOTALLOWED:
				throw new COMStatus("NS_E_WMG_PREROLLLICENSEACQUISITIONNOTALLOWED: Windows Media Player cannot download media usage rights for a file in the playlist.", message, args);
			case NS_E_WMG_UNEXPECTEDPREROLLSTATUS:
				throw new COMStatus("NS_E_WMG_UNEXPECTEDPREROLLSTATUS: Windows Media Player encountered an error while trying to queue a file.", message, args);
			case NS_E_WMG_INVALID_COPP_CERTIFICATE:
				throw new COMStatus("NS_E_WMG_INVALID_COPP_CERTIFICATE: Windows Media Player cannot play the protected file. The Player cannot verify that the connection to your video card is secure. Try installing an updated device driver for your video card.", message, args);
			case NS_E_WMG_COPP_SECURITY_INVALID:
				throw new COMStatus("NS_E_WMG_COPP_SECURITY_INVALID: Windows Media Player cannot play the protected file. The Player detected that the connection to your hardware might not be secure.", message, args);
			case NS_E_WMG_COPP_UNSUPPORTED:
				throw new COMStatus("NS_E_WMG_COPP_UNSUPPORTED: Windows Media Player output link protection is unsupported on this system.", message, args);
			case NS_E_WMG_INVALIDSTATE:
				throw new COMStatus("NS_E_WMG_INVALIDSTATE: Operation attempted in an invalid graph state.", message, args);
			case NS_E_WMG_SINKALREADYEXISTS:
				throw new COMStatus("NS_E_WMG_SINKALREADYEXISTS: A renderer cannot be inserted in a stream while one already exists.", message, args);
			case NS_E_WMG_NOSDKINTERFACE:
				throw new COMStatus("NS_E_WMG_NOSDKINTERFACE: The Windows Media SDK interface needed to complete the operation does not exist at this time.", message, args);
			case NS_E_WMG_NOTALLOUTPUTSRENDERED:
				throw new COMStatus("NS_E_WMG_NOTALLOUTPUTSRENDERED: Windows Media Player cannot play a portion of the file because it requires a codec that either could not be downloaded or that is not supported by the Player.", message, args);
			case NS_E_WMG_FILETRANSFERNOTALLOWED:
				throw new COMStatus("NS_E_WMG_FILETRANSFERNOTALLOWED: File transfer streams are not allowed in the standalone Player.", message, args);
			case NS_E_WMR_UNSUPPORTEDSTREAM:
				throw new COMStatus("NS_E_WMR_UNSUPPORTEDSTREAM: Windows Media Player cannot play the file. The Player does not support the format you are trying to play.", message, args);
			case NS_E_WMR_PINNOTFOUND:
				throw new COMStatus("NS_E_WMR_PINNOTFOUND: An operation was attempted on a pin that does not exist in the DirectShow filter graph.", message, args);
			case NS_E_WMR_WAITINGONFORMATSWITCH:
				throw new COMStatus("NS_E_WMR_WAITINGONFORMATSWITCH: Specified operation cannot be completed while waiting for a media format change from the SDK.", message, args);
			case NS_E_WMR_NOSOURCEFILTER:
				throw new COMStatus("NS_E_WMR_NOSOURCEFILTER: Specified operation cannot be completed because the source filter does not exist.", message, args);
			case NS_E_WMR_PINTYPENOMATCH:
				throw new COMStatus("NS_E_WMR_PINTYPENOMATCH: The specified type does not match this pin.", message, args);
			case NS_E_WMR_NOCALLBACKAVAILABLE:
				throw new COMStatus("NS_E_WMR_NOCALLBACKAVAILABLE: The WMR Source Filter does not have a callback available.", message, args);
			case NS_E_WMR_SAMPLEPROPERTYNOTSET:
				throw new COMStatus("NS_E_WMR_SAMPLEPROPERTYNOTSET: The specified property has not been set on this sample.", message, args);
			case NS_E_WMR_CANNOT_RENDER_BINARY_STREAM:
				throw new COMStatus("NS_E_WMR_CANNOT_RENDER_BINARY_STREAM: A plug-in is required to correctly play the file. To determine if the plug-in is available to download, click Web Help.", message, args);
			case NS_E_WMG_LICENSE_TAMPERED:
				throw new COMStatus("NS_E_WMG_LICENSE_TAMPERED: Windows Media Player cannot play the file because your media usage rights are corrupted. If you previously backed up your media usage rights, try restoring them.", message, args);
			case NS_E_WMR_WILLNOT_RENDER_BINARY_STREAM:
				throw new COMStatus("NS_E_WMR_WILLNOT_RENDER_BINARY_STREAM: Windows Media Player cannot play protected files that contain binary streams.", message, args);
			case NS_E_WMX_UNRECOGNIZED_PLAYLIST_FORMAT:
				throw new COMStatus("NS_E_WMX_UNRECOGNIZED_PLAYLIST_FORMAT: Windows Media Player cannot play the playlist because it is not valid.", message, args);
			case NS_E_ASX_INVALIDFORMAT:
				throw new COMStatus("NS_E_ASX_INVALIDFORMAT: Windows Media Player cannot play the playlist because it is not valid.", message, args);
			case NS_E_ASX_INVALIDVERSION:
				throw new COMStatus("NS_E_ASX_INVALIDVERSION: A later version of Windows Media Player might be required to play this playlist.", message, args);
			case NS_E_ASX_INVALID_REPEAT_BLOCK:
				throw new COMStatus("NS_E_ASX_INVALID_REPEAT_BLOCK: The format of a REPEAT loop within the current playlist file is not valid.", message, args);
			case NS_E_ASX_NOTHING_TO_WRITE:
				throw new COMStatus("NS_E_ASX_NOTHING_TO_WRITE: Windows Media Player cannot save the playlist because it does not contain any items.", message, args);
			case NS_E_URLLIST_INVALIDFORMAT:
				throw new COMStatus("NS_E_URLLIST_INVALIDFORMAT: Windows Media Player cannot play the playlist because it is not valid.", message, args);
			case NS_E_WMX_ATTRIBUTE_DOES_NOT_EXIST:
				throw new COMStatus("NS_E_WMX_ATTRIBUTE_DOES_NOT_EXIST: The specified attribute does not exist.", message, args);
			case NS_E_WMX_ATTRIBUTE_ALREADY_EXISTS:
				throw new COMStatus("NS_E_WMX_ATTRIBUTE_ALREADY_EXISTS: The specified attribute already exists.", message, args);
			case NS_E_WMX_ATTRIBUTE_UNRETRIEVABLE:
				throw new COMStatus("NS_E_WMX_ATTRIBUTE_UNRETRIEVABLE: Cannot retrieve the specified attribute.", message, args);
			case NS_E_WMX_ITEM_DOES_NOT_EXIST:
				throw new COMStatus("NS_E_WMX_ITEM_DOES_NOT_EXIST: The specified item does not exist in the current playlist.", message, args);
			case NS_E_WMX_ITEM_TYPE_ILLEGAL:
				throw new COMStatus("NS_E_WMX_ITEM_TYPE_ILLEGAL: Items of the specified type cannot be created within the current playlist.", message, args);
			case NS_E_WMX_ITEM_UNSETTABLE:
				throw new COMStatus("NS_E_WMX_ITEM_UNSETTABLE: The specified item cannot be set in the current playlist.", message, args);
			case NS_E_WMX_PLAYLIST_EMPTY:
				throw new COMStatus("NS_E_WMX_PLAYLIST_EMPTY: Windows Media Player cannot perform the requested action because the playlist does not contain any items.", message, args);
			case NS_E_MLS_SMARTPLAYLIST_FILTER_NOT_REGISTERED:
				throw new COMStatus("NS_E_MLS_SMARTPLAYLIST_FILTER_NOT_REGISTERED: The specified auto playlist contains a filter type that is either not valid or is not installed on this computer.", message, args);
			case NS_E_WMX_INVALID_FORMAT_OVER_NESTING:
				throw new COMStatus("NS_E_WMX_INVALID_FORMAT_OVER_NESTING: Windows Media Player cannot play the file because the associated playlist contains too many nested playlists.", message, args);
			case NS_E_WMPCORE_NOSOURCEURLSTRING:
				throw new COMStatus("NS_E_WMPCORE_NOSOURCEURLSTRING: Windows Media Player cannot find the file. Verify that the path is typed correctly. If it is, the file might not exist in the specified location, or the computer where the file is stored might not be available.", message, args);
			case NS_E_WMPCORE_COCREATEFAILEDFORGITOBJECT:
				throw new COMStatus("NS_E_WMPCORE_COCREATEFAILEDFORGITOBJECT: Failed to create the Global Interface Table.", message, args);
			case NS_E_WMPCORE_FAILEDTOGETMARSHALLEDEVENTHANDLERINTERFACE:
				throw new COMStatus("NS_E_WMPCORE_FAILEDTOGETMARSHALLEDEVENTHANDLERINTERFACE: Failed to get the marshaled graph event handler interface.", message, args);
			case NS_E_WMPCORE_BUFFERTOOSMALL:
				throw new COMStatus("NS_E_WMPCORE_BUFFERTOOSMALL: Buffer is too small for copying media type.", message, args);
			case NS_E_WMPCORE_UNAVAILABLE:
				throw new COMStatus("NS_E_WMPCORE_UNAVAILABLE: The current state of the Player does not allow this operation.", message, args);
			case NS_E_WMPCORE_INVALIDPLAYLISTMODE:
				throw new COMStatus("NS_E_WMPCORE_INVALIDPLAYLISTMODE: The playlist manager does not understand the current play mode (for example, shuffle or normal).", message, args);
			case NS_E_WMPCORE_ITEMNOTINPLAYLIST:
				throw new COMStatus("NS_E_WMPCORE_ITEMNOTINPLAYLIST: Windows Media Player cannot play the file because it is not in the current playlist.", message, args);
			case NS_E_WMPCORE_PLAYLISTEMPTY:
				throw new COMStatus("NS_E_WMPCORE_PLAYLISTEMPTY: There are no items in the playlist. Add items to the playlist, and then try again.", message, args);
			case NS_E_WMPCORE_NOBROWSER:
				throw new COMStatus("NS_E_WMPCORE_NOBROWSER: The web page cannot be displayed because no web browser is installed on your computer.", message, args);
			case NS_E_WMPCORE_UNRECOGNIZED_MEDIA_URL:
				throw new COMStatus("NS_E_WMPCORE_UNRECOGNIZED_MEDIA_URL: Windows Media Player cannot find the specified file. Verify the path is typed correctly. If it is, the file does not exist in the specified location, or the computer where the file is stored is not available.", message, args);
			case NS_E_WMPCORE_GRAPH_NOT_IN_LIST:
				throw new COMStatus("NS_E_WMPCORE_GRAPH_NOT_IN_LIST: Graph with the specified URL was not found in the prerolled graph list.", message, args);
			case NS_E_WMPCORE_PLAYLIST_EMPTY_OR_SINGLE_MEDIA:
				throw new COMStatus("NS_E_WMPCORE_PLAYLIST_EMPTY_OR_SINGLE_MEDIA: Windows Media Player cannot perform the requested operation because there is only one item in the playlist.", message, args);
			case NS_E_WMPCORE_ERRORSINKNOTREGISTERED:
				throw new COMStatus("NS_E_WMPCORE_ERRORSINKNOTREGISTERED: An error sink was never registered for the calling object.", message, args);
			case NS_E_WMPCORE_ERRORMANAGERNOTAVAILABLE:
				throw new COMStatus("NS_E_WMPCORE_ERRORMANAGERNOTAVAILABLE: The error manager is not available to respond to errors.", message, args);
			case NS_E_WMPCORE_WEBHELPFAILED:
				throw new COMStatus("NS_E_WMPCORE_WEBHELPFAILED: The Web Help URL cannot be opened.", message, args);
			case NS_E_WMPCORE_MEDIA_ERROR_RESUME_FAILED:
				throw new COMStatus("NS_E_WMPCORE_MEDIA_ERROR_RESUME_FAILED: Could not resume playing next item in playlist.", message, args);
			case NS_E_WMPCORE_NO_REF_IN_ENTRY:
				throw new COMStatus("NS_E_WMPCORE_NO_REF_IN_ENTRY: Windows Media Player cannot play the file because the associated playlist does not contain any items or the playlist is not valid.", message, args);
			case NS_E_WMPCORE_WMX_LIST_ATTRIBUTE_NAME_EMPTY:
				throw new COMStatus("NS_E_WMPCORE_WMX_LIST_ATTRIBUTE_NAME_EMPTY: An empty string for playlist attribute name was found.", message, args);
			case NS_E_WMPCORE_WMX_LIST_ATTRIBUTE_NAME_ILLEGAL:
				throw new COMStatus("NS_E_WMPCORE_WMX_LIST_ATTRIBUTE_NAME_ILLEGAL: A playlist attribute name that is not valid was found.", message, args);
			case NS_E_WMPCORE_WMX_LIST_ATTRIBUTE_VALUE_EMPTY:
				throw new COMStatus("NS_E_WMPCORE_WMX_LIST_ATTRIBUTE_VALUE_EMPTY: An empty string for a playlist attribute value was found.", message, args);
			case NS_E_WMPCORE_WMX_LIST_ATTRIBUTE_VALUE_ILLEGAL:
				throw new COMStatus("NS_E_WMPCORE_WMX_LIST_ATTRIBUTE_VALUE_ILLEGAL: An illegal value for a playlist attribute was found.", message, args);
			case NS_E_WMPCORE_WMX_LIST_ITEM_ATTRIBUTE_NAME_EMPTY:
				throw new COMStatus("NS_E_WMPCORE_WMX_LIST_ITEM_ATTRIBUTE_NAME_EMPTY: An empty string for a playlist item attribute name was found.", message, args);
			case NS_E_WMPCORE_WMX_LIST_ITEM_ATTRIBUTE_NAME_ILLEGAL:
				throw new COMStatus("NS_E_WMPCORE_WMX_LIST_ITEM_ATTRIBUTE_NAME_ILLEGAL: An illegal value for a playlist item attribute name was found.", message, args);
			case NS_E_WMPCORE_WMX_LIST_ITEM_ATTRIBUTE_VALUE_EMPTY:
				throw new COMStatus("NS_E_WMPCORE_WMX_LIST_ITEM_ATTRIBUTE_VALUE_EMPTY: An illegal value for a playlist item attribute was found.", message, args);
			case NS_E_WMPCORE_LIST_ENTRY_NO_REF:
				throw new COMStatus("NS_E_WMPCORE_LIST_ENTRY_NO_REF: The playlist does not contain any items.", message, args);
			case NS_E_WMPCORE_MISNAMED_FILE:
				throw new COMStatus("NS_E_WMPCORE_MISNAMED_FILE: Windows Media Player cannot play the file. The file is either corrupted or the Player does not support the format you are trying to play.", message, args);
			case NS_E_WMPCORE_CODEC_NOT_TRUSTED:
				throw new COMStatus("NS_E_WMPCORE_CODEC_NOT_TRUSTED: The codec downloaded for this file does not appear to be properly signed, so it cannot be installed.", message, args);
			case NS_E_WMPCORE_CODEC_NOT_FOUND:
				throw new COMStatus("NS_E_WMPCORE_CODEC_NOT_FOUND: Windows Media Player cannot play the file. One or more codecs required to play the file could not be found.", message, args);
			case NS_E_WMPCORE_CODEC_DOWNLOAD_NOT_ALLOWED:
				throw new COMStatus("NS_E_WMPCORE_CODEC_DOWNLOAD_NOT_ALLOWED: Windows Media Player cannot play the file because a required codec is not installed on your computer. To try downloading the codec, turn on the \"Download codecs automatically\" option.", message, args);
			case NS_E_WMPCORE_ERROR_DOWNLOADING_PLAYLIST:
				throw new COMStatus("NS_E_WMPCORE_ERROR_DOWNLOADING_PLAYLIST: Windows Media Player encountered a problem while downloading the playlist. For additional assistance, click Web Help.", message, args);
			case NS_E_WMPCORE_FAILED_TO_BUILD_PLAYLIST:
				throw new COMStatus("NS_E_WMPCORE_FAILED_TO_BUILD_PLAYLIST: Failed to build the playlist.", message, args);
			case NS_E_WMPCORE_PLAYLIST_ITEM_ALTERNATE_NONE:
				throw new COMStatus("NS_E_WMPCORE_PLAYLIST_ITEM_ALTERNATE_NONE: Playlist has no alternates to switch into.", message, args);
			case NS_E_WMPCORE_PLAYLIST_ITEM_ALTERNATE_EXHAUSTED:
				throw new COMStatus("NS_E_WMPCORE_PLAYLIST_ITEM_ALTERNATE_EXHAUSTED: No more playlist alternates available to switch to.", message, args);
			case NS_E_WMPCORE_PLAYLIST_ITEM_ALTERNATE_NAME_NOT_FOUND:
				throw new COMStatus("NS_E_WMPCORE_PLAYLIST_ITEM_ALTERNATE_NAME_NOT_FOUND: Could not find the name of the alternate playlist to switch into.", message, args);
			case NS_E_WMPCORE_PLAYLIST_ITEM_ALTERNATE_MORPH_FAILED:
				throw new COMStatus("NS_E_WMPCORE_PLAYLIST_ITEM_ALTERNATE_MORPH_FAILED: Failed to switch to an alternate for this media.", message, args);
			case NS_E_WMPCORE_PLAYLIST_ITEM_ALTERNATE_INIT_FAILED:
				throw new COMStatus("NS_E_WMPCORE_PLAYLIST_ITEM_ALTERNATE_INIT_FAILED: Failed to initialize an alternate for the media.", message, args);
			case NS_E_WMPCORE_MEDIA_ALTERNATE_REF_EMPTY:
				throw new COMStatus("NS_E_WMPCORE_MEDIA_ALTERNATE_REF_EMPTY: No URL specified for the roll over Refs in the playlist file.", message, args);
			case NS_E_WMPCORE_PLAYLIST_NO_EVENT_NAME:
				throw new COMStatus("NS_E_WMPCORE_PLAYLIST_NO_EVENT_NAME: Encountered a playlist with no name.", message, args);
			case NS_E_WMPCORE_PLAYLIST_EVENT_ATTRIBUTE_ABSENT:
				throw new COMStatus("NS_E_WMPCORE_PLAYLIST_EVENT_ATTRIBUTE_ABSENT: A required attribute in the event block of the playlist was not found.", message, args);
			case NS_E_WMPCORE_PLAYLIST_EVENT_EMPTY:
				throw new COMStatus("NS_E_WMPCORE_PLAYLIST_EVENT_EMPTY: No items were found in the event block of the playlist.", message, args);
			case NS_E_WMPCORE_PLAYLIST_STACK_EMPTY:
				throw new COMStatus("NS_E_WMPCORE_PLAYLIST_STACK_EMPTY: No playlist was found while returning from a nested playlist.", message, args);
			case NS_E_WMPCORE_CURRENT_MEDIA_NOT_ACTIVE:
				throw new COMStatus("NS_E_WMPCORE_CURRENT_MEDIA_NOT_ACTIVE: The media item is not active currently.", message, args);
			case NS_E_WMPCORE_USER_CANCEL:
				throw new COMStatus("NS_E_WMPCORE_USER_CANCEL: Windows Media Player cannot perform the requested action because you chose to cancel it.", message, args);
			case NS_E_WMPCORE_PLAYLIST_REPEAT_EMPTY:
				throw new COMStatus("NS_E_WMPCORE_PLAYLIST_REPEAT_EMPTY: Windows Media Player encountered a problem with the playlist. The format of the playlist is not valid.", message, args);
			case NS_E_WMPCORE_PLAYLIST_REPEAT_START_MEDIA_NONE:
				throw new COMStatus("NS_E_WMPCORE_PLAYLIST_REPEAT_START_MEDIA_NONE: Media object corresponding to start of a playlist repeat block was not found.", message, args);
			case NS_E_WMPCORE_PLAYLIST_REPEAT_END_MEDIA_NONE:
				throw new COMStatus("NS_E_WMPCORE_PLAYLIST_REPEAT_END_MEDIA_NONE: Media object corresponding to the end of a playlist repeat block was not found.", message, args);
			case NS_E_WMPCORE_INVALID_PLAYLIST_URL:
				throw new COMStatus("NS_E_WMPCORE_INVALID_PLAYLIST_URL: The playlist URL supplied to the playlist manager is not valid.", message, args);
			case NS_E_WMPCORE_MISMATCHED_RUNTIME:
				throw new COMStatus("NS_E_WMPCORE_MISMATCHED_RUNTIME: Windows Media Player cannot play the file because it is corrupted.", message, args);
			case NS_E_WMPCORE_PLAYLIST_IMPORT_FAILED_NO_ITEMS:
				throw new COMStatus("NS_E_WMPCORE_PLAYLIST_IMPORT_FAILED_NO_ITEMS: Windows Media Player cannot add the playlist to the library because the playlist does not contain any items.", message, args);
			case NS_E_WMPCORE_VIDEO_TRANSFORM_FILTER_INSERTION:
				throw new COMStatus("NS_E_WMPCORE_VIDEO_TRANSFORM_FILTER_INSERTION: An error has occurred that could prevent the changing of the video contrast on this media.", message, args);
			case NS_E_WMPCORE_MEDIA_UNAVAILABLE:
				throw new COMStatus("NS_E_WMPCORE_MEDIA_UNAVAILABLE: Windows Media Player cannot play the file. If the file is located on the Internet, connect to the Internet. If the file is located on a removable storage card, insert the storage card.", message, args);
			case NS_E_WMPCORE_WMX_ENTRYREF_NO_REF:
				throw new COMStatus("NS_E_WMPCORE_WMX_ENTRYREF_NO_REF: The playlist contains an ENTRYREF for which no href was parsed. Check the syntax of playlist file.", message, args);
			case NS_E_WMPCORE_NO_PLAYABLE_MEDIA_IN_PLAYLIST:
				throw new COMStatus("NS_E_WMPCORE_NO_PLAYABLE_MEDIA_IN_PLAYLIST: Windows Media Player cannot play any items in the playlist. To find information about the problem, click the Now Playing tab, and then click the icon next to each file in the List pane.", message, args);
			case NS_E_WMPCORE_PLAYLIST_EMPTY_NESTED_PLAYLIST_SKIPPED_ITEMS:
				throw new COMStatus("NS_E_WMPCORE_PLAYLIST_EMPTY_NESTED_PLAYLIST_SKIPPED_ITEMS: Windows Media Player cannot play some or all of the items in the playlist because the playlist is nested.", message, args);
			case NS_E_WMPCORE_BUSY:
				throw new COMStatus("NS_E_WMPCORE_BUSY: Windows Media Player cannot play the file at this time. Try again later.", message, args);
			case NS_E_WMPCORE_MEDIA_CHILD_PLAYLIST_UNAVAILABLE:
				throw new COMStatus("NS_E_WMPCORE_MEDIA_CHILD_PLAYLIST_UNAVAILABLE: There is no child playlist available for this media item at this time.", message, args);
			case NS_E_WMPCORE_MEDIA_NO_CHILD_PLAYLIST:
				throw new COMStatus("NS_E_WMPCORE_MEDIA_NO_CHILD_PLAYLIST: There is no child playlist for this media item.", message, args);
			case NS_E_WMPCORE_FILE_NOT_FOUND:
				throw new COMStatus("NS_E_WMPCORE_FILE_NOT_FOUND: Windows Media Player cannot find the file. The link from the item in the library to its associated digital media file might be broken. To fix the problem, try repairing the link or removing the item from the library.", message, args);
			case NS_E_WMPCORE_TEMP_FILE_NOT_FOUND:
				throw new COMStatus("NS_E_WMPCORE_TEMP_FILE_NOT_FOUND: The temporary file was not found.", message, args);
			case NS_E_WMDM_REVOKED:
				throw new COMStatus("NS_E_WMDM_REVOKED: Windows Media Player cannot sync the file because the device needs to be updated.", message, args);
			case NS_E_DDRAW_GENERIC:
				throw new COMStatus("NS_E_DDRAW_GENERIC: Windows Media Player cannot play the video because there is a problem with your video card.", message, args);
			case NS_E_DISPLAY_MODE_CHANGE_FAILED:
				throw new COMStatus("NS_E_DISPLAY_MODE_CHANGE_FAILED: Windows Media Player failed to change the screen mode for full-screen video playback.", message, args);
			case NS_E_PLAYLIST_CONTAINS_ERRORS:
				throw new COMStatus("NS_E_PLAYLIST_CONTAINS_ERRORS: Windows Media Player cannot play one or more files. For additional information, right-click an item that cannot be played, and then click Error Details.", message, args);
			case NS_E_CHANGING_PROXY_NAME:
				throw new COMStatus("NS_E_CHANGING_PROXY_NAME: Cannot change the proxy name if the proxy setting is not set to custom.", message, args);
			case NS_E_CHANGING_PROXY_PORT:
				throw new COMStatus("NS_E_CHANGING_PROXY_PORT: Cannot change the proxy port if the proxy setting is not set to custom.", message, args);
			case NS_E_CHANGING_PROXY_EXCEPTIONLIST:
				throw new COMStatus("NS_E_CHANGING_PROXY_EXCEPTIONLIST: Cannot change the proxy exception list if the proxy setting is not set to custom.", message, args);
			case NS_E_CHANGING_PROXYBYPASS:
				throw new COMStatus("NS_E_CHANGING_PROXYBYPASS: Cannot change the proxy bypass flag if the proxy setting is not set to custom.", message, args);
			case NS_E_CHANGING_PROXY_PROTOCOL_NOT_FOUND:
				throw new COMStatus("NS_E_CHANGING_PROXY_PROTOCOL_NOT_FOUND: Cannot find the specified protocol.", message, args);
			case NS_E_GRAPH_NOAUDIOLANGUAGE:
				throw new COMStatus("NS_E_GRAPH_NOAUDIOLANGUAGE: Cannot change the language settings. Either the graph has no audio or the audio only supports one language.", message, args);
			case NS_E_GRAPH_NOAUDIOLANGUAGESELECTED:
				throw new COMStatus("NS_E_GRAPH_NOAUDIOLANGUAGESELECTED: The graph has no audio language selected.", message, args);
			case NS_E_CORECD_NOTAMEDIACD:
				throw new COMStatus("NS_E_CORECD_NOTAMEDIACD: This is not a media CD.", message, args);
			case NS_E_WMPCORE_MEDIA_URL_TOO_LONG:
				throw new COMStatus("NS_E_WMPCORE_MEDIA_URL_TOO_LONG: Windows Media Player cannot play the file because the URL is too long.", message, args);
			case NS_E_WMPFLASH_CANT_FIND_COM_SERVER:
				throw new COMStatus("NS_E_WMPFLASH_CANT_FIND_COM_SERVER: To play the selected item, you must install the Macromedia Flash Player. To download the Macromedia Flash Player, go to the Adobe website.", message, args);
			case NS_E_WMPFLASH_INCOMPATIBLEVERSION:
				throw new COMStatus("NS_E_WMPFLASH_INCOMPATIBLEVERSION: To play the selected item, you must install a later version of the Macromedia Flash Player. To download the Macromedia Flash Player, go to the Adobe website.", message, args);
			case NS_E_WMPOCXGRAPH_IE_DISALLOWS_ACTIVEX_CONTROLS:
				throw new COMStatus("NS_E_WMPOCXGRAPH_IE_DISALLOWS_ACTIVEX_CONTROLS: Windows Media Player cannot play the file because your Internet security settings prohibit the use of ActiveX controls.", message, args);
			case NS_E_NEED_CORE_REFERENCE:
				throw new COMStatus("NS_E_NEED_CORE_REFERENCE: The use of this method requires an existing reference to the Player object.", message, args);
			case NS_E_MEDIACD_READ_ERROR:
				throw new COMStatus("NS_E_MEDIACD_READ_ERROR: Windows Media Player cannot play the CD. The disc might be dirty or damaged.", message, args);
			case NS_E_IE_DISALLOWS_ACTIVEX_CONTROLS:
				throw new COMStatus("NS_E_IE_DISALLOWS_ACTIVEX_CONTROLS: Windows Media Player cannot play the file because your Internet security settings prohibit the use of ActiveX controls.", message, args);
			case NS_E_FLASH_PLAYBACK_NOT_ALLOWED:
				throw new COMStatus("NS_E_FLASH_PLAYBACK_NOT_ALLOWED: Flash playback has been turned off in Windows Media Player.", message, args);
			case NS_E_UNABLE_TO_CREATE_RIP_LOCATION:
				throw new COMStatus("NS_E_UNABLE_TO_CREATE_RIP_LOCATION: Windows Media Player cannot rip the CD because a valid rip location cannot be created.", message, args);
			case NS_E_WMPCORE_SOME_CODECS_MISSING:
				throw new COMStatus("NS_E_WMPCORE_SOME_CODECS_MISSING: Windows Media Player cannot play the file because a required codec is not installed on your computer.", message, args);
			case NS_E_WMP_RIP_FAILED:
				throw new COMStatus("NS_E_WMP_RIP_FAILED: Windows Media Player cannot rip one or more tracks from the CD.", message, args);
			case NS_E_WMP_FAILED_TO_RIP_TRACK:
				throw new COMStatus("NS_E_WMP_FAILED_TO_RIP_TRACK: Windows Media Player encountered a problem while ripping the track from the CD. For additional assistance, click Web Help.", message, args);
			case NS_E_WMP_ERASE_FAILED:
				throw new COMStatus("NS_E_WMP_ERASE_FAILED: Windows Media Player encountered a problem while erasing the disc. For additional assistance, click Web Help.", message, args);
			case NS_E_WMP_FORMAT_FAILED:
				throw new COMStatus("NS_E_WMP_FORMAT_FAILED: Windows Media Player encountered a problem while formatting the device. For additional assistance, click Web Help.", message, args);
			case NS_E_WMP_CANNOT_BURN_NON_LOCAL_FILE:
				throw new COMStatus("NS_E_WMP_CANNOT_BURN_NON_LOCAL_FILE: This file cannot be burned to a CD because it is not located on your computer.", message, args);
			case NS_E_WMP_FILE_TYPE_CANNOT_BURN_TO_AUDIO_CD:
				throw new COMStatus("NS_E_WMP_FILE_TYPE_CANNOT_BURN_TO_AUDIO_CD: It is not possible to burn this file type to an audio CD. Windows Media Player can burn the following file types to an audio CD: WMA, MP3, or WAV.", message, args);
			case NS_E_WMP_FILE_DOES_NOT_FIT_ON_CD:
				throw new COMStatus("NS_E_WMP_FILE_DOES_NOT_FIT_ON_CD: This file is too large to fit on a disc.", message, args);
			case NS_E_WMP_FILE_NO_DURATION:
				throw new COMStatus("NS_E_WMP_FILE_NO_DURATION: It is not possible to determine if this file can fit on a disc because Windows Media Player cannot detect the length of the file. Playing the file before burning may enable the Player to detect the file length.", message, args);
			case NS_E_PDA_FAILED_TO_BURN:
				throw new COMStatus("NS_E_PDA_FAILED_TO_BURN: Windows Media Player encountered a problem while burning the file to the disc. For additional assistance, click Web Help.", message, args);
			case NS_E_FAILED_DOWNLOAD_ABORT_BURN:
				throw new COMStatus("NS_E_FAILED_DOWNLOAD_ABORT_BURN: Windows Media Player cannot burn the audio CD because some items in the list that you chose to buy could not be downloaded from the online store.", message, args);
			case NS_E_WMPCORE_DEVICE_DRIVERS_MISSING:
				throw new COMStatus("NS_E_WMPCORE_DEVICE_DRIVERS_MISSING: Windows Media Player cannot play the file. Try using Windows Update or Device Manager to update the device drivers for your audio and video cards. For information about using Windows Update or Device Manager, see Windows Help.", message, args);
			case NS_E_WMPIM_USEROFFLINE:
				throw new COMStatus("NS_E_WMPIM_USEROFFLINE: Windows Media Player has detected that you are not connected to the Internet. Connect to the Internet, and then try again.", message, args);
			case NS_E_WMPIM_USERCANCELED:
				throw new COMStatus("NS_E_WMPIM_USERCANCELED: The attempt to connect to the Internet was canceled.", message, args);
			case NS_E_WMPIM_DIALUPFAILED:
				throw new COMStatus("NS_E_WMPIM_DIALUPFAILED: The attempt to connect to the Internet failed.", message, args);
			case NS_E_WINSOCK_ERROR_STRING:
				throw new COMStatus("NS_E_WINSOCK_ERROR_STRING: Windows Media Player has encountered an unknown network error.", message, args);
			case NS_E_WMPBR_NOLISTENER:
				throw new COMStatus("NS_E_WMPBR_NOLISTENER: No window is currently listening to Backup and Restore events.", message, args);
			case NS_E_WMPBR_BACKUPCANCEL:
				throw new COMStatus("NS_E_WMPBR_BACKUPCANCEL: Your media usage rights were not backed up because the backup was canceled.", message, args);
			case NS_E_WMPBR_RESTORECANCEL:
				throw new COMStatus("NS_E_WMPBR_RESTORECANCEL: Your media usage rights were not restored because the restoration was canceled.", message, args);
			case NS_E_WMPBR_ERRORWITHURL:
				throw new COMStatus("NS_E_WMPBR_ERRORWITHURL: An error occurred while backing up or restoring your media usage rights. A required web page cannot be displayed.", message, args);
			case NS_E_WMPBR_NAMECOLLISION:
				throw new COMStatus("NS_E_WMPBR_NAMECOLLISION: Your media usage rights were not backed up because the backup was canceled.", message, args);
			case NS_E_WMPBR_DRIVE_INVALID:
				throw new COMStatus("NS_E_WMPBR_DRIVE_INVALID: Windows Media Player cannot restore your media usage rights from the specified location. Choose another location, and then try again.", message, args);
			case NS_E_WMPBR_BACKUPRESTOREFAILED:
				throw new COMStatus("NS_E_WMPBR_BACKUPRESTOREFAILED: Windows Media Player cannot backup or restore your media usage rights.", message, args);
			case NS_E_WMP_CONVERT_FILE_FAILED:
				throw new COMStatus("NS_E_WMP_CONVERT_FILE_FAILED: Windows Media Player cannot add the file to the library.", message, args);
			case NS_E_WMP_CONVERT_NO_RIGHTS_ERRORURL:
				throw new COMStatus("NS_E_WMP_CONVERT_NO_RIGHTS_ERRORURL: Windows Media Player cannot add the file to the library because the content provider prohibits it. For assistance, contact the company that provided the file.", message, args);
			case NS_E_WMP_CONVERT_NO_RIGHTS_NOERRORURL:
				throw new COMStatus("NS_E_WMP_CONVERT_NO_RIGHTS_NOERRORURL: Windows Media Player cannot add the file to the library because the content provider prohibits it. For assistance, contact the company that provided the file.", message, args);
			case NS_E_WMP_CONVERT_FILE_CORRUPT:
				throw new COMStatus("NS_E_WMP_CONVERT_FILE_CORRUPT: Windows Media Player cannot add the file to the library. The file might not be valid.", message, args);
			case NS_E_WMP_CONVERT_PLUGIN_UNAVAILABLE_ERRORURL:
				throw new COMStatus("NS_E_WMP_CONVERT_PLUGIN_UNAVAILABLE_ERRORURL: Windows Media Player cannot add the file to the library. The plug-in required to add the file is not installed properly. For assistance, click Web Help to display the website of the company that provided the file.", message, args);
			case NS_E_WMP_CONVERT_PLUGIN_UNAVAILABLE_NOERRORURL:
				throw new COMStatus("NS_E_WMP_CONVERT_PLUGIN_UNAVAILABLE_NOERRORURL: Windows Media Player cannot add the file to the library. The plug-in required to add the file is not installed properly. For assistance, contact the company that provided the file.", message, args);
			case NS_E_WMP_CONVERT_PLUGIN_UNKNOWN_FILE_OWNER:
				throw new COMStatus("NS_E_WMP_CONVERT_PLUGIN_UNKNOWN_FILE_OWNER: Windows Media Player cannot add the file to the library. The plug-in required to add the file is not installed properly. For assistance, contact the company that provided the file.", message, args);
			case NS_E_DVD_DISC_COPY_PROTECT_OUTPUT_NS:
				throw new COMStatus("NS_E_DVD_DISC_COPY_PROTECT_OUTPUT_NS: Windows Media Player cannot play this DVD. Try installing an updated driver for your video card or obtaining a newer video card.", message, args);
			case NS_E_DVD_DISC_COPY_PROTECT_OUTPUT_FAILED:
				throw new COMStatus("NS_E_DVD_DISC_COPY_PROTECT_OUTPUT_FAILED: This DVD's resolution exceeds the maximum allowed by your component video outputs. Try reducing your screen resolution to 640 x 480, or turn off analog component outputs and use a VGA connection to your monitor.", message, args);
			case NS_E_DVD_NO_SUBPICTURE_STREAM:
				throw new COMStatus("NS_E_DVD_NO_SUBPICTURE_STREAM: Windows Media Player cannot display subtitles or highlights in DVD menus. Reinstall the DVD decoder or contact the DVD drive manufacturer to obtain an updated decoder.", message, args);
			case NS_E_DVD_COPY_PROTECT:
				throw new COMStatus("NS_E_DVD_COPY_PROTECT: Windows Media Player cannot play this DVD because there is a problem with digital copy protection between your DVD drive, decoder, and video card. Try installing an updated driver for your video card.", message, args);
			case NS_E_DVD_AUTHORING_PROBLEM:
				throw new COMStatus("NS_E_DVD_AUTHORING_PROBLEM: Windows Media Player cannot play the DVD. The disc was created in a manner that the Player does not support.", message, args);
			case NS_E_DVD_INVALID_DISC_REGION:
				throw new COMStatus("NS_E_DVD_INVALID_DISC_REGION: Windows Media Player cannot play the DVD because the disc prohibits playback in your region of the world. You must obtain a disc that is intended for your geographic region.", message, args);
			case NS_E_DVD_COMPATIBLE_VIDEO_CARD:
				throw new COMStatus("NS_E_DVD_COMPATIBLE_VIDEO_CARD: Windows Media Player cannot play the DVD because your video card does not support DVD playback.", message, args);
			case NS_E_DVD_MACROVISION:
				throw new COMStatus("NS_E_DVD_MACROVISION: Windows Media Player cannot play this DVD because it is not possible to turn on analog copy protection on the output display. Try installing an updated driver for your video card.", message, args);
			case NS_E_DVD_SYSTEM_DECODER_REGION:
				throw new COMStatus("NS_E_DVD_SYSTEM_DECODER_REGION: Windows Media Player cannot play the DVD because the region assigned to your DVD drive does not match the region assigned to your DVD decoder.", message, args);
			case NS_E_DVD_DISC_DECODER_REGION:
				throw new COMStatus("NS_E_DVD_DISC_DECODER_REGION: Windows Media Player cannot play the DVD because the disc prohibits playback in your region of the world. You must obtain a disc that is intended for your geographic region.", message, args);
			case NS_E_DVD_NO_VIDEO_STREAM:
				throw new COMStatus("NS_E_DVD_NO_VIDEO_STREAM: Windows Media Player cannot play DVD video. You might need to adjust your Windows display settings. Open display settings in Control Panel, and then try lowering your screen resolution and color quality settings.", message, args);
			case NS_E_DVD_NO_AUDIO_STREAM:
				throw new COMStatus("NS_E_DVD_NO_AUDIO_STREAM: Windows Media Player cannot play DVD audio. Verify that your sound card is set up correctly, and then try again.", message, args);
			case NS_E_DVD_GRAPH_BUILDING:
				throw new COMStatus("NS_E_DVD_GRAPH_BUILDING: Windows Media Player cannot play DVD video. Close any open files and quit any other programs, and then try again. If the problem persists, restart your computer.", message, args);
			case NS_E_DVD_NO_DECODER:
				throw new COMStatus("NS_E_DVD_NO_DECODER: Windows Media Player cannot play the DVD because a compatible DVD decoder is not installed on your computer.", message, args);
			case NS_E_DVD_PARENTAL:
				throw new COMStatus("NS_E_DVD_PARENTAL: Windows Media Player cannot play the scene because it has a parental rating higher than the rating that you are authorized to view.", message, args);
			case NS_E_DVD_CANNOT_JUMP:
				throw new COMStatus("NS_E_DVD_CANNOT_JUMP: Windows Media Player cannot skip to the requested location on the DVD.", message, args);
			case NS_E_DVD_DEVICE_CONTENTION:
				throw new COMStatus("NS_E_DVD_DEVICE_CONTENTION: Windows Media Player cannot play the DVD because it is currently in use by another program. Quit the other program that is using the DVD, and then try again.", message, args);
			case NS_E_DVD_NO_VIDEO_MEMORY:
				throw new COMStatus("NS_E_DVD_NO_VIDEO_MEMORY: Windows Media Player cannot play DVD video. You might need to adjust your Windows display settings. Open display settings in Control Panel, and then try lowering your screen resolution and color quality settings.", message, args);
			case NS_E_DVD_CANNOT_COPY_PROTECTED:
				throw new COMStatus("NS_E_DVD_CANNOT_COPY_PROTECTED: Windows Media Player cannot rip the DVD because it is copy protected.", message, args);
			case NS_E_DVD_REQUIRED_PROPERTY_NOT_SET:
				throw new COMStatus("NS_E_DVD_REQUIRED_PROPERTY_NOT_SET: One of more of the required properties has not been set.", message, args);
			case NS_E_DVD_INVALID_TITLE_CHAPTER:
				throw new COMStatus("NS_E_DVD_INVALID_TITLE_CHAPTER: The specified title and/or chapter number does not exist on this DVD.", message, args);
			case NS_E_NO_CD_BURNER:
				throw new COMStatus("NS_E_NO_CD_BURNER: Windows Media Player cannot burn the files because the Player cannot find a burner. If the burner is connected properly, try using Windows Update to install the latest device driver.", message, args);
			case NS_E_DEVICE_IS_NOT_READY:
				throw new COMStatus("NS_E_DEVICE_IS_NOT_READY: Windows Media Player does not detect storage media in the selected device. Insert storage media into the device, and then try again.", message, args);
			case NS_E_PDA_UNSUPPORTED_FORMAT:
				throw new COMStatus("NS_E_PDA_UNSUPPORTED_FORMAT: Windows Media Player cannot sync this file. The Player might not support the file type.", message, args);
			case NS_E_NO_PDA:
				throw new COMStatus("NS_E_NO_PDA: Windows Media Player does not detect a portable device. Connect your portable device, and then try again.", message, args);
			case NS_E_PDA_UNSPECIFIED_ERROR:
				throw new COMStatus("NS_E_PDA_UNSPECIFIED_ERROR: Windows Media Player encountered an error while communicating with the device. The storage card on the device might be full, the device might be turned off, or the device might not allow playlists or folders to be created on it.", message, args);
			case NS_E_MEMSTORAGE_BAD_DATA:
				throw new COMStatus("NS_E_MEMSTORAGE_BAD_DATA: Windows Media Player encountered an error while burning a CD.", message, args);
			case NS_E_PDA_FAIL_SELECT_DEVICE:
				throw new COMStatus("NS_E_PDA_FAIL_SELECT_DEVICE: Windows Media Player encountered an error while communicating with a portable device or CD drive.", message, args);
			case NS_E_PDA_FAIL_READ_WAVE_FILE:
				throw new COMStatus("NS_E_PDA_FAIL_READ_WAVE_FILE: Windows Media Player cannot open the WAV file.", message, args);
			case NS_E_IMAPI_LOSSOFSTREAMING:
				throw new COMStatus("NS_E_IMAPI_LOSSOFSTREAMING: Windows Media Player failed to burn all the files to the CD. Select a slower recording speed, and then try again.", message, args);
			case NS_E_PDA_DEVICE_FULL:
				throw new COMStatus("NS_E_PDA_DEVICE_FULL: There is not enough storage space on the portable device to complete this operation. Delete some unneeded files on the portable device, and then try again.", message, args);
			case NS_E_FAIL_LAUNCH_ROXIO_PLUGIN:
				throw new COMStatus("NS_E_FAIL_LAUNCH_ROXIO_PLUGIN: Windows Media Player cannot burn the files. Verify that your burner is connected properly, and then try again. If the problem persists, reinstall the Player.", message, args);
			case NS_E_PDA_DEVICE_FULL_IN_SESSION:
				throw new COMStatus("NS_E_PDA_DEVICE_FULL_IN_SESSION: Windows Media Player did not sync some files to the device because there is not enough storage space on the device.", message, args);
			case NS_E_IMAPI_MEDIUM_INVALIDTYPE:
				throw new COMStatus("NS_E_IMAPI_MEDIUM_INVALIDTYPE: The disc in the burner is not valid. Insert a blank disc into the burner, and then try again.", message, args);
			case NS_E_PDA_MANUALDEVICE:
				throw new COMStatus("NS_E_PDA_MANUALDEVICE: Windows Media Player cannot perform the requested action because the device does not support sync.", message, args);
			case NS_E_PDA_PARTNERSHIPNOTEXIST:
				throw new COMStatus("NS_E_PDA_PARTNERSHIPNOTEXIST: To perform the requested action, you must first set up sync with the device.", message, args);
			case NS_E_PDA_CANNOT_CREATE_ADDITIONAL_SYNC_RELATIONSHIP:
				throw new COMStatus("NS_E_PDA_CANNOT_CREATE_ADDITIONAL_SYNC_RELATIONSHIP: You have already created sync partnerships with 16 devices. To create a new sync partnership, you must first end an existing partnership.", message, args);
			case NS_E_PDA_NO_TRANSCODE_OF_DRM:
				throw new COMStatus("NS_E_PDA_NO_TRANSCODE_OF_DRM: Windows Media Player cannot sync the file because protected files cannot be converted to the required quality level or file format.", message, args);
			case NS_E_PDA_TRANSCODECACHEFULL:
				throw new COMStatus("NS_E_PDA_TRANSCODECACHEFULL: The folder that stores converted files is full. Either empty the folder or increase its size, and then try again.", message, args);
			case NS_E_PDA_TOO_MANY_FILE_COLLISIONS:
				throw new COMStatus("NS_E_PDA_TOO_MANY_FILE_COLLISIONS: There are too many files with the same name in the folder on the device. Change the file name or sync to a different folder.", message, args);
			case NS_E_PDA_CANNOT_TRANSCODE:
				throw new COMStatus("NS_E_PDA_CANNOT_TRANSCODE: Windows Media Player cannot convert the file to the format required by the device.", message, args);
			case NS_E_PDA_TOO_MANY_FILES_IN_DIRECTORY:
				throw new COMStatus("NS_E_PDA_TOO_MANY_FILES_IN_DIRECTORY: You have reached the maximum number of files your device allows in a folder. If your device supports playback from subfolders, try creating subfolders on the device and storing some files in them.", message, args);
			case NS_E_PROCESSINGSHOWSYNCWIZARD:
				throw new COMStatus("NS_E_PROCESSINGSHOWSYNCWIZARD: Windows Media Player is already trying to start the Device Setup Wizard.", message, args);
			case NS_E_PDA_TRANSCODE_NOT_PERMITTED:
				throw new COMStatus("NS_E_PDA_TRANSCODE_NOT_PERMITTED: Windows Media Player cannot convert this file format. If an updated version of the codec used to compress this file is available, install it and then try to sync the file again.", message, args);
			case NS_E_PDA_INITIALIZINGDEVICES:
				throw new COMStatus("NS_E_PDA_INITIALIZINGDEVICES: Windows Media Player is busy setting up devices. Try again later.", message, args);
			case NS_E_PDA_OBSOLETE_SP:
				throw new COMStatus("NS_E_PDA_OBSOLETE_SP: Your device is using an outdated driver that is no longer supported by Windows Media Player. For additional assistance, click Web Help.", message, args);
			case NS_E_PDA_TITLE_COLLISION:
				throw new COMStatus("NS_E_PDA_TITLE_COLLISION: Windows Media Player cannot sync the file because a file with the same name already exists on the device. Change the file name or try to sync the file to a different folder.", message, args);
			case NS_E_PDA_DEVICESUPPORTDISABLED:
				throw new COMStatus("NS_E_PDA_DEVICESUPPORTDISABLED: Automatic and manual sync have been turned off temporarily. To sync to a device, restart Windows Media Player.", message, args);
			case NS_E_PDA_NO_LONGER_AVAILABLE:
				throw new COMStatus("NS_E_PDA_NO_LONGER_AVAILABLE: This device is not available. Connect the device to the computer, and then try again.", message, args);
			case NS_E_PDA_ENCODER_NOT_RESPONDING:
				throw new COMStatus("NS_E_PDA_ENCODER_NOT_RESPONDING: Windows Media Player cannot sync the file because an error occurred while converting the file to another quality level or format. If the problem persists, remove the file from the list of files to sync.", message, args);
			case NS_E_PDA_CANNOT_SYNC_FROM_LOCATION:
				throw new COMStatus("NS_E_PDA_CANNOT_SYNC_FROM_LOCATION: Windows Media Player cannot sync the file to your device. The file might be stored in a location that is not supported. Copy the file from its current location to your hard disk, add it to your library, and then try to sync the file again.", message, args);
			case NS_E_WMP_PROTOCOL_PROBLEM:
				throw new COMStatus("NS_E_WMP_PROTOCOL_PROBLEM: Windows Media Player cannot open the specified URL. Verify that the Player is configured to use all available protocols, and then try again.", message, args);
			case NS_E_WMP_NO_DISK_SPACE:
				throw new COMStatus("NS_E_WMP_NO_DISK_SPACE: Windows Media Player cannot perform the requested action because there is not enough storage space on your computer. Delete some unneeded files on your hard disk, and then try again.", message, args);
			case NS_E_WMP_LOGON_FAILURE:
				throw new COMStatus("NS_E_WMP_LOGON_FAILURE: The server denied access to the file. Verify that you are using the correct user name and password.", message, args);
			case NS_E_WMP_CANNOT_FIND_FILE:
				throw new COMStatus("NS_E_WMP_CANNOT_FIND_FILE: Windows Media Player cannot find the file. If you are trying to play, burn, or sync an item that is in your library, the item might point to a file that has been moved, renamed, or deleted.", message, args);
			case NS_E_WMP_SERVER_INACCESSIBLE:
				throw new COMStatus("NS_E_WMP_SERVER_INACCESSIBLE: Windows Media Player cannot connect to the server. The server name might not be correct, the server might not be available, or your proxy settings might not be correct.", message, args);
			case NS_E_WMP_UNSUPPORTED_FORMAT:
				throw new COMStatus("NS_E_WMP_UNSUPPORTED_FORMAT: Windows Media Player cannot play the file. The Player might not support the file type or might not support the codec that was used to compress the file.", message, args);
			case NS_E_WMP_DSHOW_UNSUPPORTED_FORMAT:
				throw new COMStatus("NS_E_WMP_DSHOW_UNSUPPORTED_FORMAT: Windows Media Player cannot play the file. The Player might not support the file type or a required codec might not be installed on your computer.", message, args);
			case NS_E_WMP_PLAYLIST_EXISTS:
				throw new COMStatus("NS_E_WMP_PLAYLIST_EXISTS: Windows Media Player cannot create the playlist because the name already exists. Type a different playlist name.", message, args);
			case NS_E_WMP_NONMEDIA_FILES:
				throw new COMStatus("NS_E_WMP_NONMEDIA_FILES: Windows Media Player cannot delete the playlist because it contains items that are not digital media files. Any digital media files in the playlist were deleted.", message, args);
			case NS_E_WMP_INVALID_ASX:
				throw new COMStatus("NS_E_WMP_INVALID_ASX: The playlist cannot be opened because it is stored in a shared folder on another computer. If possible, move the playlist to the playlists folder on your computer.", message, args);
			case NS_E_WMP_ALREADY_IN_USE:
				throw new COMStatus("NS_E_WMP_ALREADY_IN_USE: Windows Media Player is already in use. Stop playing any items, close all Player dialog boxes, and then try again.", message, args);
			case NS_E_WMP_IMAPI_FAILURE:
				throw new COMStatus("NS_E_WMP_IMAPI_FAILURE: Windows Media Player encountered an error while burning. Verify that the burner is connected properly and that the disc is clean and not damaged.", message, args);
			case NS_E_WMP_WMDM_FAILURE:
				throw new COMStatus("NS_E_WMP_WMDM_FAILURE: Windows Media Player has encountered an unknown error with your portable device. Reconnect your portable device, and then try again.", message, args);
			case NS_E_WMP_CODEC_NEEDED_WITH_4CC:
				throw new COMStatus("NS_E_WMP_CODEC_NEEDED_WITH_4CC: A codec is required to play this file. To determine if this codec is available to download from the web, click Web Help.", message, args);
			case NS_E_WMP_CODEC_NEEDED_WITH_FORMATTAG:
				throw new COMStatus("NS_E_WMP_CODEC_NEEDED_WITH_FORMATTAG: An audio codec is needed to play this file. To determine if this codec is available to download from the web, click Web Help.", message, args);
			case NS_E_WMP_MSSAP_NOT_AVAILABLE:
				throw new COMStatus("NS_E_WMP_MSSAP_NOT_AVAILABLE: To play the file, you must install the latest Windows service pack. To install the service pack from the Windows Update website, click Web Help.", message, args);
			case NS_E_WMP_WMDM_INTERFACEDEAD:
				throw new COMStatus("NS_E_WMP_WMDM_INTERFACEDEAD: Windows Media Player no longer detects a portable device. Reconnect your portable device, and then try again.", message, args);
			case NS_E_WMP_WMDM_NOTCERTIFIED:
				throw new COMStatus("NS_E_WMP_WMDM_NOTCERTIFIED: Windows Media Player cannot sync the file because the portable device does not support protected files.", message, args);
			case NS_E_WMP_WMDM_LICENSE_NOTEXIST:
				throw new COMStatus("NS_E_WMP_WMDM_LICENSE_NOTEXIST: This file does not have sync rights. If you obtained this file from an online store, go to the online store to get sync rights.", message, args);
			case NS_E_WMP_WMDM_LICENSE_EXPIRED:
				throw new COMStatus("NS_E_WMP_WMDM_LICENSE_EXPIRED: Windows Media Player cannot sync the file because the sync rights have expired. Go to the content provider's online store to get new sync rights.", message, args);
			case NS_E_WMP_WMDM_BUSY:
				throw new COMStatus("NS_E_WMP_WMDM_BUSY: The portable device is already in use. Wait until the current task finishes or quit other programs that might be using the portable device, and then try again.", message, args);
			case NS_E_WMP_WMDM_NORIGHTS:
				throw new COMStatus("NS_E_WMP_WMDM_NORIGHTS: Windows Media Player cannot sync the file because the content provider or device prohibits it. You might be able to resolve this problem by going to the content provider's online store to get sync rights.", message, args);
			case NS_E_WMP_WMDM_INCORRECT_RIGHTS:
				throw new COMStatus("NS_E_WMP_WMDM_INCORRECT_RIGHTS: The content provider has not granted you the right to sync this file. Go to the content provider's online store to get sync rights.", message, args);
			case NS_E_WMP_IMAPI_GENERIC:
				throw new COMStatus("NS_E_WMP_IMAPI_GENERIC: Windows Media Player cannot burn the files to the CD. Verify that the disc is clean and not damaged. If necessary, select a slower recording speed or try a different brand of blank discs.", message, args);
			case NS_E_WMP_IMAPI_DEVICE_NOTPRESENT:
				throw new COMStatus("NS_E_WMP_IMAPI_DEVICE_NOTPRESENT: Windows Media Player cannot burn the files. Verify that the burner is connected properly, and then try again.", message, args);
			case NS_E_WMP_IMAPI_DEVICE_BUSY:
				throw new COMStatus("NS_E_WMP_IMAPI_DEVICE_BUSY: Windows Media Player cannot burn the files. Verify that the burner is connected properly and that the disc is clean and not damaged. If the burner is already in use, wait until the current task finishes or quit other programs that might be using the burner.", message, args);
			case NS_E_WMP_IMAPI_LOSS_OF_STREAMING:
				throw new COMStatus("NS_E_WMP_IMAPI_LOSS_OF_STREAMING: Windows Media Player cannot burn the files to the CD.", message, args);
			case NS_E_WMP_SERVER_UNAVAILABLE:
				throw new COMStatus("NS_E_WMP_SERVER_UNAVAILABLE: Windows Media Player cannot play the file. The server might not be available or there might be a problem with your network or firewall settings.", message, args);
			case NS_E_WMP_FILE_OPEN_FAILED:
				throw new COMStatus("NS_E_WMP_FILE_OPEN_FAILED: Windows Media Player encountered a problem while playing the file. For additional assistance, click Web Help.", message, args);
			case NS_E_WMP_VERIFY_ONLINE:
				throw new COMStatus("NS_E_WMP_VERIFY_ONLINE: Windows Media Player must connect to the Internet to verify the file's media usage rights. Connect to the Internet, and then try again.", message, args);
			case NS_E_WMP_SERVER_NOT_RESPONDING:
				throw new COMStatus("NS_E_WMP_SERVER_NOT_RESPONDING: Windows Media Player cannot play the file because a network error occurred. The server might not be available. Verify that you are connected to the network and that your proxy settings are correct.", message, args);
			case NS_E_WMP_DRM_CORRUPT_BACKUP:
				throw new COMStatus("NS_E_WMP_DRM_CORRUPT_BACKUP: Windows Media Player cannot restore your media usage rights because it could not find any backed up rights on your computer.", message, args);
			case NS_E_WMP_DRM_LICENSE_SERVER_UNAVAILABLE:
				throw new COMStatus("NS_E_WMP_DRM_LICENSE_SERVER_UNAVAILABLE: Windows Media Player cannot download media usage rights because the server is not available (for example, the server might be busy or not online).", message, args);
			case NS_E_WMP_NETWORK_FIREWALL:
				throw new COMStatus("NS_E_WMP_NETWORK_FIREWALL: Windows Media Player cannot play the file. A network firewall might be preventing the Player from opening the file by using the UDP transport protocol. If you typed a URL in the Open URL dialog box, try using a different transport protocol (for example, \"http:\").", message, args);
			case NS_E_WMP_NO_REMOVABLE_MEDIA:
				throw new COMStatus("NS_E_WMP_NO_REMOVABLE_MEDIA: Insert the removable media, and then try again.", message, args);
			case NS_E_WMP_PROXY_CONNECT_TIMEOUT:
				throw new COMStatus("NS_E_WMP_PROXY_CONNECT_TIMEOUT: Windows Media Player cannot play the file because the proxy server is not responding. The proxy server might be temporarily unavailable or your Player proxy settings might not be valid.", message, args);
			case NS_E_WMP_NEED_UPGRADE:
				throw new COMStatus("NS_E_WMP_NEED_UPGRADE: To play the file, you might need to install a later version of Windows Media Player. On the Help menu, click Check for Updates, and then follow the instructions. For additional assistance, click Web Help.", message, args);
			case NS_E_WMP_AUDIO_HW_PROBLEM:
				throw new COMStatus("NS_E_WMP_AUDIO_HW_PROBLEM: Windows Media Player cannot play the file because there is a problem with your sound device. There might not be a sound device installed on your computer, it might be in use by another program, or it might not be functioning properly.", message, args);
			case NS_E_WMP_INVALID_PROTOCOL:
				throw new COMStatus("NS_E_WMP_INVALID_PROTOCOL: Windows Media Player cannot play the file because the specified protocol is not supported. If you typed a URL in the Open URL dialog box, try using a different transport protocol (for example, \"http:\" or \"rtsp:\").", message, args);
			case NS_E_WMP_INVALID_LIBRARY_ADD:
				throw new COMStatus("NS_E_WMP_INVALID_LIBRARY_ADD: Windows Media Player cannot add the file to the library because the file format is not supported.", message, args);
			case NS_E_WMP_MMS_NOT_SUPPORTED:
				throw new COMStatus("NS_E_WMP_MMS_NOT_SUPPORTED: Windows Media Player cannot play the file because the specified protocol is not supported. If you typed a URL in the Open URL dialog box, try using a different transport protocol (for example, \"mms:\").", message, args);
			case NS_E_WMP_NO_PROTOCOLS_SELECTED:
				throw new COMStatus("NS_E_WMP_NO_PROTOCOLS_SELECTED: Windows Media Player cannot play the file because there are no streaming protocols selected. Select one or more protocols, and then try again.", message, args);
			case NS_E_WMP_GOFULLSCREEN_FAILED:
				throw new COMStatus("NS_E_WMP_GOFULLSCREEN_FAILED: Windows Media Player cannot switch to Full Screen. You might need to adjust your Windows display settings. Open display settings in Control Panel, and then try setting Hardware acceleration to Full.", message, args);
			case NS_E_WMP_NETWORK_ERROR:
				throw new COMStatus("NS_E_WMP_NETWORK_ERROR: Windows Media Player cannot play the file because a network error occurred. The server might not be available (for example, the server is busy or not online) or you might not be connected to the network.", message, args);
			case NS_E_WMP_CONNECT_TIMEOUT:
				throw new COMStatus("NS_E_WMP_CONNECT_TIMEOUT: Windows Media Player cannot play the file because the server is not responding. Verify that you are connected to the network, and then try again later.", message, args);
			case NS_E_WMP_MULTICAST_DISABLED:
				throw new COMStatus("NS_E_WMP_MULTICAST_DISABLED: Windows Media Player cannot play the file because the multicast protocol is not enabled. On the Tools menu, click Options, click the Network tab, and then select the Multicast check box. For additional assistance, click Web Help.", message, args);
			case NS_E_WMP_SERVER_DNS_TIMEOUT:
				throw new COMStatus("NS_E_WMP_SERVER_DNS_TIMEOUT: Windows Media Player cannot play the file because a network problem occurred. Verify that you are connected to the network, and then try again later.", message, args);
			case NS_E_WMP_PROXY_NOT_FOUND:
				throw new COMStatus("NS_E_WMP_PROXY_NOT_FOUND: Windows Media Player cannot play the file because the network proxy server cannot be found. Verify that your proxy settings are correct, and then try again.", message, args);
			case NS_E_WMP_TAMPERED_CONTENT:
				throw new COMStatus("NS_E_WMP_TAMPERED_CONTENT: Windows Media Player cannot play the file because it is corrupted.", message, args);
			case NS_E_WMP_OUTOFMEMORY:
				throw new COMStatus("NS_E_WMP_OUTOFMEMORY: Your computer is running low on memory. Quit other programs, and then try again.", message, args);
			case NS_E_WMP_AUDIO_CODEC_NOT_INSTALLED:
				throw new COMStatus("NS_E_WMP_AUDIO_CODEC_NOT_INSTALLED: Windows Media Player cannot play, burn, rip, or sync the file because a required audio codec is not installed on your computer.", message, args);
			case NS_E_WMP_VIDEO_CODEC_NOT_INSTALLED:
				throw new COMStatus("NS_E_WMP_VIDEO_CODEC_NOT_INSTALLED: Windows Media Player cannot play the file because the required video codec is not installed on your computer.", message, args);
			case NS_E_WMP_IMAPI_DEVICE_INVALIDTYPE:
				throw new COMStatus("NS_E_WMP_IMAPI_DEVICE_INVALIDTYPE: Windows Media Player cannot burn the files. If the burner is busy, wait for the current task to finish. If necessary, verify that the burner is connected properly and that you have installed the latest device driver.", message, args);
			case NS_E_WMP_DRM_DRIVER_AUTH_FAILURE:
				throw new COMStatus("NS_E_WMP_DRM_DRIVER_AUTH_FAILURE: Windows Media Player cannot play the protected file because there is a problem with your sound device. Try installing a new device driver or use a different sound device.", message, args);
			case NS_E_WMP_NETWORK_RESOURCE_FAILURE:
				throw new COMStatus("NS_E_WMP_NETWORK_RESOURCE_FAILURE: Windows Media Player encountered a network error. Restart the Player.", message, args);
			case NS_E_WMP_UPGRADE_APPLICATION:
				throw new COMStatus("NS_E_WMP_UPGRADE_APPLICATION: Windows Media Player is not installed properly. Reinstall the Player.", message, args);
			case NS_E_WMP_UNKNOWN_ERROR:
				throw new COMStatus("NS_E_WMP_UNKNOWN_ERROR: Windows Media Player encountered an unknown error. For additional assistance, click Web Help.", message, args);
			case NS_E_WMP_INVALID_KEY:
				throw new COMStatus("NS_E_WMP_INVALID_KEY: Windows Media Player cannot play the file because the required codec is not valid.", message, args);
			case NS_E_WMP_CD_ANOTHER_USER:
				throw new COMStatus("NS_E_WMP_CD_ANOTHER_USER: The CD drive is in use by another user. Wait for the task to complete, and then try again.", message, args);
			case NS_E_WMP_DRM_NEEDS_AUTHORIZATION:
				throw new COMStatus("NS_E_WMP_DRM_NEEDS_AUTHORIZATION: Windows Media Player cannot play, sync, or burn the protected file because a problem occurred with the Windows Media Digital Rights Management (DRM) system. You might need to connect to the Internet to update your DRM components. For additional assistance, click Web Help.", message, args);
			case NS_E_WMP_BAD_DRIVER:
				throw new COMStatus("NS_E_WMP_BAD_DRIVER: Windows Media Player cannot play the file because there might be a problem with your sound or video device. Try installing an updated device driver.", message, args);
			case NS_E_WMP_ACCESS_DENIED:
				throw new COMStatus("NS_E_WMP_ACCESS_DENIED: Windows Media Player cannot access the file. The file might be in use, you might not have access to the computer where the file is stored, or your proxy settings might not be correct.", message, args);
			case NS_E_WMP_LICENSE_RESTRICTS:
				throw new COMStatus("NS_E_WMP_LICENSE_RESTRICTS: The content provider prohibits this action. Go to the content provider's online store to get new media usage rights.", message, args);
			case NS_E_WMP_INVALID_REQUEST:
				throw new COMStatus("NS_E_WMP_INVALID_REQUEST: Windows Media Player cannot perform the requested action at this time.", message, args);
			case NS_E_WMP_CD_STASH_NO_SPACE:
				throw new COMStatus("NS_E_WMP_CD_STASH_NO_SPACE: Windows Media Player cannot burn the files because there is not enough free disk space to store the temporary files. Delete some unneeded files on your hard disk, and then try again.", message, args);
			case NS_E_WMP_DRM_NEW_HARDWARE:
				throw new COMStatus("NS_E_WMP_DRM_NEW_HARDWARE: Your media usage rights have become corrupted or are no longer valid. This might happen if you have replaced hardware components in your computer.", message, args);
			case NS_E_WMP_DRM_INVALID_SIG:
				throw new COMStatus("NS_E_WMP_DRM_INVALID_SIG: The required Windows Media Digital Rights Management (DRM) component cannot be validated. You might be able resolve the problem by reinstalling the Player.", message, args);
			case NS_E_WMP_DRM_CANNOT_RESTORE:
				throw new COMStatus("NS_E_WMP_DRM_CANNOT_RESTORE: You have exceeded your restore limit for the day. Try restoring your media usage rights tomorrow.", message, args);
			case NS_E_WMP_BURN_DISC_OVERFLOW:
				throw new COMStatus("NS_E_WMP_BURN_DISC_OVERFLOW: Some files might not fit on the CD. The required space cannot be calculated accurately because some files might be missing duration information. To ensure the calculation is accurate, play the files that are missing duration information.", message, args);
			case NS_E_WMP_DRM_GENERIC_LICENSE_FAILURE:
				throw new COMStatus("NS_E_WMP_DRM_GENERIC_LICENSE_FAILURE: Windows Media Player cannot verify the file's media usage rights. If you obtained this file from an online store, go to the online store to get the necessary rights.", message, args);
			case NS_E_WMP_DRM_NO_SECURE_CLOCK:
				throw new COMStatus("NS_E_WMP_DRM_NO_SECURE_CLOCK: It is not possible to sync because this device's internal clock is not set correctly. To set the clock, select the option to set the device clock on the Privacy tab of the Options dialog box, connect to the Internet, and then sync the device again. For additional assistance, click Web Help.", message, args);
			case NS_E_WMP_DRM_NO_RIGHTS:
				throw new COMStatus("NS_E_WMP_DRM_NO_RIGHTS: Windows Media Player cannot play, burn, rip, or sync the protected file because you do not have the appropriate rights.", message, args);
			case NS_E_WMP_DRM_INDIV_FAILED:
				throw new COMStatus("NS_E_WMP_DRM_INDIV_FAILED: Windows Media Player encountered an error during upgrade.", message, args);
			case NS_E_WMP_SERVER_NONEWCONNECTIONS:
				throw new COMStatus("NS_E_WMP_SERVER_NONEWCONNECTIONS: Windows Media Player cannot connect to the server because it is not accepting any new connections. This could be because it has reached its maximum connection limit. Please try again later.", message, args);
			case NS_E_WMP_MULTIPLE_ERROR_IN_PLAYLIST:
				throw new COMStatus("NS_E_WMP_MULTIPLE_ERROR_IN_PLAYLIST: A number of queued files cannot be played. To find information about the problem, click the Now Playing tab, and then click the icon next to each file in the List pane.", message, args);
			case NS_E_WMP_IMAPI2_ERASE_FAIL:
				throw new COMStatus("NS_E_WMP_IMAPI2_ERASE_FAIL: Windows Media Player encountered an error while erasing the rewritable CD or DVD. Verify that the CD or DVD burner is connected properly and that the disc is clean and not damaged.", message, args);
			case NS_E_WMP_IMAPI2_ERASE_DEVICE_BUSY:
				throw new COMStatus("NS_E_WMP_IMAPI2_ERASE_DEVICE_BUSY: Windows Media Player cannot erase the rewritable CD or DVD. Verify that the CD or DVD burner is connected properly and that the disc is clean and not damaged. If the burner is already in use, wait until the current task finishes or quit other programs that might be using the burner.", message, args);
			case NS_E_WMP_DRM_COMPONENT_FAILURE:
				throw new COMStatus("NS_E_WMP_DRM_COMPONENT_FAILURE: A Windows Media Digital Rights Management (DRM) component encountered a problem. If you are trying to use a file that you obtained from an online store, try going to the online store and getting the appropriate usage rights.", message, args);
			case NS_E_WMP_DRM_NO_DEVICE_CERT:
				throw new COMStatus("NS_E_WMP_DRM_NO_DEVICE_CERT: It is not possible to obtain device's certificate. Please contact the device manufacturer for a firmware update or for other steps to resolve this problem.", message, args);
			case NS_E_WMP_SERVER_SECURITY_ERROR:
				throw new COMStatus("NS_E_WMP_SERVER_SECURITY_ERROR: Windows Media Player encountered an error when connecting to the server. The security information from the server could not be validated.", message, args);
			case NS_E_WMP_AUDIO_DEVICE_LOST:
				throw new COMStatus("NS_E_WMP_AUDIO_DEVICE_LOST: An audio device was disconnected or reconfigured. Verify that the audio device is connected, and then try to play the item again.", message, args);
			case NS_E_WMP_IMAPI_MEDIA_INCOMPATIBLE:
				throw new COMStatus("NS_E_WMP_IMAPI_MEDIA_INCOMPATIBLE: Windows Media Player could not complete burning because the disc is not compatible with your drive. Try inserting a different kind of recordable media or use a disc that supports a write speed that is compatible with your drive.", message, args);
			case NS_E_SYNCWIZ_DEVICE_FULL:
				throw new COMStatus("NS_E_SYNCWIZ_DEVICE_FULL: Windows Media Player cannot save the sync settings because your device is full. Delete some unneeded files on your device and then try again.", message, args);
			case NS_E_SYNCWIZ_CANNOT_CHANGE_SETTINGS:
				throw new COMStatus("NS_E_SYNCWIZ_CANNOT_CHANGE_SETTINGS: It is not possible to change sync settings at this time. Try again later.", message, args);
			case NS_E_TRANSCODE_DELETECACHEERROR:
				throw new COMStatus("NS_E_TRANSCODE_DELETECACHEERROR: Windows Media Player cannot delete these files currently. If the Player is synchronizing, wait until it is complete and then try again.", message, args);
			case NS_E_CD_NO_BUFFERS_READ:
				throw new COMStatus("NS_E_CD_NO_BUFFERS_READ: Windows Media Player could not use digital mode to read the CD. The Player has automatically switched the CD drive to analog mode. To switch back to digital mode, use the Devices tab. For additional assistance, click Web Help.", message, args);
			case NS_E_CD_EMPTY_TRACK_QUEUE:
				throw new COMStatus("NS_E_CD_EMPTY_TRACK_QUEUE: No CD track was specified for playback.", message, args);
			case NS_E_CD_NO_READER:
				throw new COMStatus("NS_E_CD_NO_READER: The CD filter was not able to create the CD reader.", message, args);
			case NS_E_CD_ISRC_INVALID:
				throw new COMStatus("NS_E_CD_ISRC_INVALID: Invalid ISRC code.", message, args);
			case NS_E_CD_MEDIA_CATALOG_NUMBER_INVALID:
				throw new COMStatus("NS_E_CD_MEDIA_CATALOG_NUMBER_INVALID: Invalid Media Catalog Number.", message, args);
			case NS_E_SLOW_READ_DIGITAL_WITH_ERRORCORRECTION:
				throw new COMStatus("NS_E_SLOW_READ_DIGITAL_WITH_ERRORCORRECTION: Windows Media Player cannot play audio CDs correctly because the CD drive is slow and error correction is turned on. To increase performance, turn off playback error correction for this drive.", message, args);
			case NS_E_CD_SPEEDDETECT_NOT_ENOUGH_READS:
				throw new COMStatus("NS_E_CD_SPEEDDETECT_NOT_ENOUGH_READS: Windows Media Player cannot estimate the CD drive's playback speed because the CD track is too short.", message, args);
			case NS_E_CD_QUEUEING_DISABLED:
				throw new COMStatus("NS_E_CD_QUEUEING_DISABLED: Cannot queue the CD track because queuing is not enabled.", message, args);
			case NS_E_WMP_DRM_ACQUIRING_LICENSE:
				throw new COMStatus("NS_E_WMP_DRM_ACQUIRING_LICENSE: Windows Media Player cannot download additional media usage rights until the current download is complete.", message, args);
			case NS_E_WMP_DRM_LICENSE_EXPIRED:
				throw new COMStatus("NS_E_WMP_DRM_LICENSE_EXPIRED: The media usage rights for this file have expired or are no longer valid. If you obtained the file from an online store, sign in to the store, and then try again.", message, args);
			case NS_E_WMP_DRM_LICENSE_NOTACQUIRED:
				throw new COMStatus("NS_E_WMP_DRM_LICENSE_NOTACQUIRED: Windows Media Player cannot download the media usage rights for the file. If you obtained the file from an online store, sign in to the store, and then try again.", message, args);
			case NS_E_WMP_DRM_LICENSE_NOTENABLED:
				throw new COMStatus("NS_E_WMP_DRM_LICENSE_NOTENABLED: The media usage rights for this file are not yet valid. To see when they will become valid, right-click the file in the library, click Properties, and then click the Media Usage Rights tab.", message, args);
			case NS_E_WMP_DRM_LICENSE_UNUSABLE:
				throw new COMStatus("NS_E_WMP_DRM_LICENSE_UNUSABLE: The media usage rights for this file are not valid. If you obtained this file from an online store, contact the store for assistance.", message, args);
			case NS_E_WMP_DRM_LICENSE_CONTENT_REVOKED:
				throw new COMStatus("NS_E_WMP_DRM_LICENSE_CONTENT_REVOKED: The content provider has revoked the media usage rights for this file. If you obtained this file from an online store, ask the store if a new version of the file is available.", message, args);
			case NS_E_WMP_DRM_LICENSE_NOSAP:
				throw new COMStatus("NS_E_WMP_DRM_LICENSE_NOSAP: The media usage rights for this file require a feature that is not supported in your current version of Windows Media Player or your current version of Windows. Try installing the latest version of the Player. If you obtained this file from an online store, contact the store for further assistance.", message, args);
			case NS_E_WMP_DRM_UNABLE_TO_ACQUIRE_LICENSE:
				throw new COMStatus("NS_E_WMP_DRM_UNABLE_TO_ACQUIRE_LICENSE: Windows Media Player cannot download media usage rights at this time. Try again later.", message, args);
			case NS_E_WMP_LICENSE_REQUIRED:
				throw new COMStatus("NS_E_WMP_LICENSE_REQUIRED: Windows Media Player cannot play, burn, or sync the file because the media usage rights are missing. If you obtained the file from an online store, sign in to the store, and then try again.", message, args);
			case NS_E_WMP_PROTECTED_CONTENT:
				throw new COMStatus("NS_E_WMP_PROTECTED_CONTENT: Windows Media Player cannot play, burn, or sync the file because the media usage rights are missing. If you obtained the file from an online store, sign in to the store, and then try again.", message, args);
			case NS_E_WMP_POLICY_VALUE_NOT_CONFIGURED:
				throw new COMStatus("NS_E_WMP_POLICY_VALUE_NOT_CONFIGURED: Windows Media Player cannot read a policy. This can occur when the policy does not exist in the registry or when the registry cannot be read.", message, args);
			case NS_E_PDA_CANNOT_SYNC_FROM_INTERNET:
				throw new COMStatus("NS_E_PDA_CANNOT_SYNC_FROM_INTERNET: Windows Media Player cannot sync content streamed directly from the Internet. If possible, download the file to your computer, and then try to sync the file.", message, args);
			case NS_E_PDA_CANNOT_SYNC_INVALID_PLAYLIST:
				throw new COMStatus("NS_E_PDA_CANNOT_SYNC_INVALID_PLAYLIST: This playlist is not valid or is corrupted. Create a new playlist using Windows Media Player, then sync the new playlist instead.", message, args);
			case NS_E_PDA_FAILED_TO_SYNCHRONIZE_FILE:
				throw new COMStatus("NS_E_PDA_FAILED_TO_SYNCHRONIZE_FILE: Windows Media Player encountered a problem while synchronizing the file to the device. For additional assistance, click Web Help.", message, args);
			case NS_E_PDA_SYNC_FAILED:
				throw new COMStatus("NS_E_PDA_SYNC_FAILED: Windows Media Player encountered an error while synchronizing to the device.", message, args);
			case NS_E_PDA_DELETE_FAILED:
				throw new COMStatus("NS_E_PDA_DELETE_FAILED: Windows Media Player cannot delete a file from the device.", message, args);
			case NS_E_PDA_FAILED_TO_RETRIEVE_FILE:
				throw new COMStatus("NS_E_PDA_FAILED_TO_RETRIEVE_FILE: Windows Media Player cannot copy a file from the device to your library.", message, args);
			case NS_E_PDA_DEVICE_NOT_RESPONDING:
				throw new COMStatus("NS_E_PDA_DEVICE_NOT_RESPONDING: Windows Media Player cannot communicate with the device because the device is not responding. Try reconnecting the device, resetting the device, or contacting the device manufacturer for updated firmware.", message, args);
			case NS_E_PDA_FAILED_TO_TRANSCODE_PHOTO:
				throw new COMStatus("NS_E_PDA_FAILED_TO_TRANSCODE_PHOTO: Windows Media Player cannot sync the picture to the device because a problem occurred while converting the file to another quality level or format. The original file might be damaged or corrupted.", message, args);
			case NS_E_PDA_FAILED_TO_ENCRYPT_TRANSCODED_FILE:
				throw new COMStatus("NS_E_PDA_FAILED_TO_ENCRYPT_TRANSCODED_FILE: Windows Media Player cannot convert the file. The file might have been encrypted by the Encrypted File System (EFS). Try decrypting the file first and then synchronizing it. For information about how to decrypt a file, see Windows Help and Support.", message, args);
			case NS_E_PDA_CANNOT_TRANSCODE_TO_AUDIO:
				throw new COMStatus("NS_E_PDA_CANNOT_TRANSCODE_TO_AUDIO: Your device requires that this file be converted in order to play on the device. However, the device either does not support playing audio, or Windows Media Player cannot convert the file to an audio format that is supported by the device.", message, args);
			case NS_E_PDA_CANNOT_TRANSCODE_TO_VIDEO:
				throw new COMStatus("NS_E_PDA_CANNOT_TRANSCODE_TO_VIDEO: Your device requires that this file be converted in order to play on the device. However, the device either does not support playing video, or Windows Media Player cannot convert the file to a video format that is supported by the device.", message, args);
			case NS_E_PDA_CANNOT_TRANSCODE_TO_IMAGE:
				throw new COMStatus("NS_E_PDA_CANNOT_TRANSCODE_TO_IMAGE: Your device requires that this file be converted in order to play on the device. However, the device either does not support displaying pictures, or Windows Media Player cannot convert the file to a picture format that is supported by the device.", message, args);
			case NS_E_PDA_RETRIEVED_FILE_FILENAME_TOO_LONG:
				throw new COMStatus("NS_E_PDA_RETRIEVED_FILE_FILENAME_TOO_LONG: Windows Media Player cannot sync the file to your computer because the file name is too long. Try renaming the file on the device.", message, args);
			case NS_E_PDA_CEWMDM_DRM_ERROR:
				throw new COMStatus("NS_E_PDA_CEWMDM_DRM_ERROR: Windows Media Player cannot sync the file because the device is not responding. This typically occurs when there is a problem with the device firmware. For additional assistance, click Web Help.", message, args);
			case NS_E_INCOMPLETE_PLAYLIST:
				throw new COMStatus("NS_E_INCOMPLETE_PLAYLIST: Incomplete playlist.", message, args);
			case NS_E_PDA_SYNC_RUNNING:
				throw new COMStatus("NS_E_PDA_SYNC_RUNNING: It is not possible to perform the requested action because sync is in progress. You can either stop sync or wait for it to complete, and then try again.", message, args);
			case NS_E_PDA_SYNC_LOGIN_ERROR:
				throw new COMStatus("NS_E_PDA_SYNC_LOGIN_ERROR: Windows Media Player cannot sync the subscription content because you are not signed in to the online store that provided it. Sign in to the online store, and then try again.", message, args);
			case NS_E_PDA_TRANSCODE_CODEC_NOT_FOUND:
				throw new COMStatus("NS_E_PDA_TRANSCODE_CODEC_NOT_FOUND: Windows Media Player cannot convert the file to the format required by the device. One or more codecs required to convert the file could not be found.", message, args);
			case NS_E_CANNOT_SYNC_DRM_TO_NON_JANUS_DEVICE:
				throw new COMStatus("NS_E_CANNOT_SYNC_DRM_TO_NON_JANUS_DEVICE: It is not possible to sync subscription files to this device.", message, args);
			case NS_E_CANNOT_SYNC_PREVIOUS_SYNC_RUNNING:
				throw new COMStatus("NS_E_CANNOT_SYNC_PREVIOUS_SYNC_RUNNING: Your device is operating slowly or is not responding. Until the device responds, it is not possible to sync again. To return the device to normal operation, try disconnecting it from the computer or resetting it.", message, args);
			case NS_E_WMP_HWND_NOTFOUND:
				throw new COMStatus("NS_E_WMP_HWND_NOTFOUND: The Windows Media Player download manager cannot function properly because the Player main window cannot be found. Try restarting the Player.", message, args);
			case NS_E_BKGDOWNLOAD_WRONG_NO_FILES:
				throw new COMStatus("NS_E_BKGDOWNLOAD_WRONG_NO_FILES: Windows Media Player encountered a download that has the wrong number of files. This might occur if another program is trying to create jobs with the same signature as the Player.", message, args);
			case NS_E_BKGDOWNLOAD_COMPLETECANCELLEDJOB:
				throw new COMStatus("NS_E_BKGDOWNLOAD_COMPLETECANCELLEDJOB: Windows Media Player tried to complete a download that was already canceled. The file will not be available.", message, args);
			case NS_E_BKGDOWNLOAD_CANCELCOMPLETEDJOB:
				throw new COMStatus("NS_E_BKGDOWNLOAD_CANCELCOMPLETEDJOB: Windows Media Player tried to cancel a download that was already completed. The file will not be removed.", message, args);
			case NS_E_BKGDOWNLOAD_NOJOBPOINTER:
				throw new COMStatus("NS_E_BKGDOWNLOAD_NOJOBPOINTER: Windows Media Player is trying to access a download that is not valid.", message, args);
			case NS_E_BKGDOWNLOAD_INVALIDJOBSIGNATURE:
				throw new COMStatus("NS_E_BKGDOWNLOAD_INVALIDJOBSIGNATURE: This download was not created by Windows Media Player.", message, args);
			case NS_E_BKGDOWNLOAD_FAILED_TO_CREATE_TEMPFILE:
				throw new COMStatus("NS_E_BKGDOWNLOAD_FAILED_TO_CREATE_TEMPFILE: The Windows Media Player download manager cannot create a temporary file name. This might occur if the path is not valid or if the disk is full.", message, args);
			case NS_E_BKGDOWNLOAD_PLUGIN_FAILEDINITIALIZE:
				throw new COMStatus("NS_E_BKGDOWNLOAD_PLUGIN_FAILEDINITIALIZE: The Windows Media Player download manager plug-in cannot start. This might occur if the system is out of resources.", message, args);
			case NS_E_BKGDOWNLOAD_PLUGIN_FAILEDTOMOVEFILE:
				throw new COMStatus("NS_E_BKGDOWNLOAD_PLUGIN_FAILEDTOMOVEFILE: The Windows Media Player download manager cannot move the file.", message, args);
			case NS_E_BKGDOWNLOAD_CALLFUNCFAILED:
				throw new COMStatus("NS_E_BKGDOWNLOAD_CALLFUNCFAILED: The Windows Media Player download manager cannot perform a task because the system has no resources to allocate.", message, args);
			case NS_E_BKGDOWNLOAD_CALLFUNCTIMEOUT:
				throw new COMStatus("NS_E_BKGDOWNLOAD_CALLFUNCTIMEOUT: The Windows Media Player download manager cannot perform a task because the task took too long to run.", message, args);
			case NS_E_BKGDOWNLOAD_CALLFUNCENDED:
				throw new COMStatus("NS_E_BKGDOWNLOAD_CALLFUNCENDED: The Windows Media Player download manager cannot perform a task because the Player is terminating the service. The task will be recovered when the Player restarts.", message, args);
			case NS_E_BKGDOWNLOAD_WMDUNPACKFAILED:
				throw new COMStatus("NS_E_BKGDOWNLOAD_WMDUNPACKFAILED: The Windows Media Player download manager cannot expand a WMD file. The file will be deleted and the operation will not be completed successfully.", message, args);
			case NS_E_BKGDOWNLOAD_FAILEDINITIALIZE:
				throw new COMStatus("NS_E_BKGDOWNLOAD_FAILEDINITIALIZE: The Windows Media Player download manager cannot start. This might occur if the system is out of resources.", message, args);
			case NS_E_INTERFACE_NOT_REGISTERED_IN_GIT:
				throw new COMStatus("NS_E_INTERFACE_NOT_REGISTERED_IN_GIT: Windows Media Player cannot access a required functionality. This might occur if the wrong system files or Player DLLs are loaded.", message, args);
			case NS_E_BKGDOWNLOAD_INVALID_FILE_NAME:
				throw new COMStatus("NS_E_BKGDOWNLOAD_INVALID_FILE_NAME: Windows Media Player cannot get the file name of the requested download. The requested download will be canceled.", message, args);
			case NS_E_IMAGE_DOWNLOAD_FAILED:
				throw new COMStatus("NS_E_IMAGE_DOWNLOAD_FAILED: Windows Media Player encountered an error while downloading an image.", message, args);
			case NS_E_WMP_UDRM_NOUSERLIST:
				throw new COMStatus("NS_E_WMP_UDRM_NOUSERLIST: Windows Media Player cannot update your media usage rights because the Player cannot verify the list of activated users of this computer.", message, args);
			case NS_E_WMP_DRM_NOT_ACQUIRING:
				throw new COMStatus("NS_E_WMP_DRM_NOT_ACQUIRING: Windows Media Player is trying to acquire media usage rights for a file that is no longer being used. Rights acquisition will stop.", message, args);
			case NS_E_WMP_BSTR_TOO_LONG:
				throw new COMStatus("NS_E_WMP_BSTR_TOO_LONG: The parameter is not valid.", message, args);
			case NS_E_WMP_AUTOPLAY_INVALID_STATE:
				throw new COMStatus("NS_E_WMP_AUTOPLAY_INVALID_STATE: The state is not valid for this request.", message, args);
			case NS_E_WMP_COMPONENT_REVOKED:
				throw new COMStatus("NS_E_WMP_COMPONENT_REVOKED: Windows Media Player cannot play this file until you complete the software component upgrade. After the component has been upgraded, try to play the file again.", message, args);
			case NS_E_CURL_NOTSAFE:
				throw new COMStatus("NS_E_CURL_NOTSAFE: The URL is not safe for the operation specified.", message, args);
			case NS_E_CURL_INVALIDCHAR:
				throw new COMStatus("NS_E_CURL_INVALIDCHAR: The URL contains one or more characters that are not valid.", message, args);
			case NS_E_CURL_INVALIDHOSTNAME:
				throw new COMStatus("NS_E_CURL_INVALIDHOSTNAME: The URL contains a host name that is not valid.", message, args);
			case NS_E_CURL_INVALIDPATH:
				throw new COMStatus("NS_E_CURL_INVALIDPATH: The URL contains a path that is not valid.", message, args);
			case NS_E_CURL_INVALIDSCHEME:
				throw new COMStatus("NS_E_CURL_INVALIDSCHEME: The URL contains a scheme that is not valid.", message, args);
			case NS_E_CURL_INVALIDURL:
				throw new COMStatus("NS_E_CURL_INVALIDURL: The URL is not valid.", message, args);
			case NS_E_CURL_CANTWALK:
				throw new COMStatus("NS_E_CURL_CANTWALK: Windows Media Player cannot play the file. If you clicked a link on a web page, the link might not be valid.", message, args);
			case NS_E_CURL_INVALIDPORT:
				throw new COMStatus("NS_E_CURL_INVALIDPORT: The URL port is not valid.", message, args);
			case NS_E_CURLHELPER_NOTADIRECTORY:
				throw new COMStatus("NS_E_CURLHELPER_NOTADIRECTORY: The URL is not a directory.", message, args);
			case NS_E_CURLHELPER_NOTAFILE:
				throw new COMStatus("NS_E_CURLHELPER_NOTAFILE: The URL is not a file.", message, args);
			case NS_E_CURL_CANTDECODE:
				throw new COMStatus("NS_E_CURL_CANTDECODE: The URL contains characters that cannot be decoded. The URL might be truncated or incomplete.", message, args);
			case NS_E_CURLHELPER_NOTRELATIVE:
				throw new COMStatus("NS_E_CURLHELPER_NOTRELATIVE: The specified URL is not a relative URL.", message, args);
			case NS_E_CURL_INVALIDBUFFERSIZE:
				throw new COMStatus("NS_E_CURL_INVALIDBUFFERSIZE: The buffer is smaller than the size specified.", message, args);
			case NS_E_SUBSCRIPTIONSERVICE_PLAYBACK_DISALLOWED:
				throw new COMStatus("NS_E_SUBSCRIPTIONSERVICE_PLAYBACK_DISALLOWED: The content provider has not granted you the right to play this file. Go to the content provider's online store to get play rights.", message, args);
			case NS_E_CANNOT_BUY_OR_DOWNLOAD_FROM_MULTIPLE_SERVICES:
				throw new COMStatus("NS_E_CANNOT_BUY_OR_DOWNLOAD_FROM_MULTIPLE_SERVICES: Windows Media Player cannot purchase or download content from multiple online stores.", message, args);
			case NS_E_CANNOT_BUY_OR_DOWNLOAD_CONTENT:
				throw new COMStatus("NS_E_CANNOT_BUY_OR_DOWNLOAD_CONTENT: The file cannot be purchased or downloaded. The file might not be available from the online store.", message, args);
			case NS_E_NOT_CONTENT_PARTNER_TRACK:
				throw new COMStatus("NS_E_NOT_CONTENT_PARTNER_TRACK: The provider of this file cannot be identified.", message, args);
			case NS_E_TRACK_DOWNLOAD_REQUIRES_ALBUM_PURCHASE:
				throw new COMStatus("NS_E_TRACK_DOWNLOAD_REQUIRES_ALBUM_PURCHASE: The file is only available for download when you buy the entire album.", message, args);
			case NS_E_TRACK_DOWNLOAD_REQUIRES_PURCHASE:
				throw new COMStatus("NS_E_TRACK_DOWNLOAD_REQUIRES_PURCHASE: You must buy the file before you can download it.", message, args);
			case NS_E_TRACK_PURCHASE_MAXIMUM_EXCEEDED:
				throw new COMStatus("NS_E_TRACK_PURCHASE_MAXIMUM_EXCEEDED: You have exceeded the maximum number of files that can be purchased in a single transaction.", message, args);
			case NS_E_SUBSCRIPTIONSERVICE_LOGIN_FAILED:
				throw new COMStatus("NS_E_SUBSCRIPTIONSERVICE_LOGIN_FAILED: Windows Media Player cannot sign in to the online store. Verify that you are using the correct user name and password. If the problem persists, the store may be temporarily unavailable.", message, args);
			case NS_E_SUBSCRIPTIONSERVICE_DOWNLOAD_TIMEOUT:
				throw new COMStatus("NS_E_SUBSCRIPTIONSERVICE_DOWNLOAD_TIMEOUT: Windows Media Player cannot download this item because the server is not responding. The server might be temporarily unavailable or you may have lost your Internet connection.", message, args);
			case NS_E_CONTENT_PARTNER_STILL_INITIALIZING:
				throw new COMStatus("NS_E_CONTENT_PARTNER_STILL_INITIALIZING: Content Partner still initializing.", message, args);
			case NS_E_OPEN_CONTAINING_FOLDER_FAILED:
				throw new COMStatus("NS_E_OPEN_CONTAINING_FOLDER_FAILED: The folder could not be opened. The folder may have been moved or deleted.", message, args);
			case NS_E_ADVANCEDEDIT_TOO_MANY_PICTURES:
				throw new COMStatus("NS_E_ADVANCEDEDIT_TOO_MANY_PICTURES: Windows Media Player could not add all of the images to the file because the images exceeded the 7 megabyte (MB) limit.", message, args);
			case NS_E_REDIRECT:
				throw new COMStatus("NS_E_REDIRECT: The client redirected to another server.", message, args);
			case NS_E_STALE_PRESENTATION:
				throw new COMStatus("NS_E_STALE_PRESENTATION: The streaming media description is no longer current.", message, args);
			case NS_E_NAMESPACE_WRONG_PERSIST:
				throw new COMStatus("NS_E_NAMESPACE_WRONG_PERSIST: It is not possible to create a persistent namespace node under a transient parent node.", message, args);
			case NS_E_NAMESPACE_WRONG_TYPE:
				throw new COMStatus("NS_E_NAMESPACE_WRONG_TYPE: It is not possible to store a value in a namespace node that has a different value type.", message, args);
			case NS_E_NAMESPACE_NODE_CONFLICT:
				throw new COMStatus("NS_E_NAMESPACE_NODE_CONFLICT: It is not possible to remove the root namespace node.", message, args);
			case NS_E_NAMESPACE_NODE_NOT_FOUND:
				throw new COMStatus("NS_E_NAMESPACE_NODE_NOT_FOUND: The specified namespace node could not be found.", message, args);
			case NS_E_NAMESPACE_BUFFER_TOO_SMALL:
				throw new COMStatus("NS_E_NAMESPACE_BUFFER_TOO_SMALL: The buffer supplied to hold namespace node string is too small.", message, args);
			case NS_E_NAMESPACE_TOO_MANY_CALLBACKS:
				throw new COMStatus("NS_E_NAMESPACE_TOO_MANY_CALLBACKS: The callback list on a namespace node is at the maximum size.", message, args);
			case NS_E_NAMESPACE_DUPLICATE_CALLBACK:
				throw new COMStatus("NS_E_NAMESPACE_DUPLICATE_CALLBACK: It is not possible to register an already-registered callback on a namespace node.", message, args);
			case NS_E_NAMESPACE_CALLBACK_NOT_FOUND:
				throw new COMStatus("NS_E_NAMESPACE_CALLBACK_NOT_FOUND: Cannot find the callback in the namespace when attempting to remove the callback.", message, args);
			case NS_E_NAMESPACE_NAME_TOO_LONG:
				throw new COMStatus("NS_E_NAMESPACE_NAME_TOO_LONG: The namespace node name exceeds the allowed maximum length.", message, args);
			case NS_E_NAMESPACE_DUPLICATE_NAME:
				throw new COMStatus("NS_E_NAMESPACE_DUPLICATE_NAME: Cannot create a namespace node that already exists.", message, args);
			case NS_E_NAMESPACE_EMPTY_NAME:
				throw new COMStatus("NS_E_NAMESPACE_EMPTY_NAME: The namespace node name cannot be a null string.", message, args);
			case NS_E_NAMESPACE_INDEX_TOO_LARGE:
				throw new COMStatus("NS_E_NAMESPACE_INDEX_TOO_LARGE: Finding a child namespace node by index failed because the index exceeded the number of children.", message, args);
			case NS_E_NAMESPACE_BAD_NAME:
				throw new COMStatus("NS_E_NAMESPACE_BAD_NAME: The namespace node name is invalid.", message, args);
			case NS_E_NAMESPACE_WRONG_SECURITY:
				throw new COMStatus("NS_E_NAMESPACE_WRONG_SECURITY: It is not possible to store a value in a namespace node that has a different security type.", message, args);
			case NS_E_CACHE_ARCHIVE_CONFLICT:
				throw new COMStatus("NS_E_CACHE_ARCHIVE_CONFLICT: The archive request conflicts with other requests in progress.", message, args);
			case NS_E_CACHE_ORIGIN_SERVER_NOT_FOUND:
				throw new COMStatus("NS_E_CACHE_ORIGIN_SERVER_NOT_FOUND: The specified origin server cannot be found.", message, args);
			case NS_E_CACHE_ORIGIN_SERVER_TIMEOUT:
				throw new COMStatus("NS_E_CACHE_ORIGIN_SERVER_TIMEOUT: The specified origin server is not responding.", message, args);
			case NS_E_CACHE_NOT_BROADCAST:
				throw new COMStatus("NS_E_CACHE_NOT_BROADCAST: The internal code for HTTP status code 412 Precondition Failed due to not broadcast type.", message, args);
			case NS_E_CACHE_CANNOT_BE_CACHED:
				throw new COMStatus("NS_E_CACHE_CANNOT_BE_CACHED: The internal code for HTTP status code 403 Forbidden due to not cacheable.", message, args);
			case NS_E_CACHE_NOT_MODIFIED:
				throw new COMStatus("NS_E_CACHE_NOT_MODIFIED: The internal code for HTTP status code 304 Not Modified.", message, args);
			case NS_E_CANNOT_REMOVE_PUBLISHING_POINT:
				throw new COMStatus("NS_E_CANNOT_REMOVE_PUBLISHING_POINT: It is not possible to remove a cache or proxy publishing point.", message, args);
			case NS_E_CANNOT_REMOVE_PLUGIN:
				throw new COMStatus("NS_E_CANNOT_REMOVE_PLUGIN: It is not possible to remove the last instance of a type of plug-in.", message, args);
			case NS_E_WRONG_PUBLISHING_POINT_TYPE:
				throw new COMStatus("NS_E_WRONG_PUBLISHING_POINT_TYPE: Cache and proxy publishing points do not support this property or method.", message, args);
			case NS_E_UNSUPPORTED_LOAD_TYPE:
				throw new COMStatus("NS_E_UNSUPPORTED_LOAD_TYPE: The plug-in does not support the specified load type.", message, args);
			case NS_E_INVALID_PLUGIN_LOAD_TYPE_CONFIGURATION:
				throw new COMStatus("NS_E_INVALID_PLUGIN_LOAD_TYPE_CONFIGURATION: The plug-in does not support any load types. The plug-in must support at least one load type.", message, args);
			case NS_E_INVALID_PUBLISHING_POINT_NAME:
				throw new COMStatus("NS_E_INVALID_PUBLISHING_POINT_NAME: The publishing point name is invalid.", message, args);
			case NS_E_TOO_MANY_MULTICAST_SINKS:
				throw new COMStatus("NS_E_TOO_MANY_MULTICAST_SINKS: Only one multicast data writer plug-in can be enabled for a publishing point.", message, args);
			case NS_E_PUBLISHING_POINT_INVALID_REQUEST_WHILE_STARTED:
				throw new COMStatus("NS_E_PUBLISHING_POINT_INVALID_REQUEST_WHILE_STARTED: The requested operation cannot be completed while the publishing point is started.", message, args);
			case NS_E_MULTICAST_PLUGIN_NOT_ENABLED:
				throw new COMStatus("NS_E_MULTICAST_PLUGIN_NOT_ENABLED: A multicast data writer plug-in must be enabled in order for this operation to be completed.", message, args);
			case NS_E_INVALID_OPERATING_SYSTEM_VERSION:
				throw new COMStatus("NS_E_INVALID_OPERATING_SYSTEM_VERSION: This feature requires Windows Server 2003, Enterprise Edition.", message, args);
			case NS_E_PUBLISHING_POINT_REMOVED:
				throw new COMStatus("NS_E_PUBLISHING_POINT_REMOVED: The requested operation cannot be completed because the specified publishing point has been removed.", message, args);
			case NS_E_INVALID_PUSH_PUBLISHING_POINT_START_REQUEST:
				throw new COMStatus("NS_E_INVALID_PUSH_PUBLISHING_POINT_START_REQUEST: Push publishing points are started when the encoder starts pushing the stream. This publishing point cannot be started by the server administrator.", message, args);
			case NS_E_UNSUPPORTED_LANGUAGE:
				throw new COMStatus("NS_E_UNSUPPORTED_LANGUAGE: The specified language is not supported.", message, args);
			case NS_E_WRONG_OS_VERSION:
				throw new COMStatus("NS_E_WRONG_OS_VERSION: Windows Media Services will only run on Windows Server 2003, Standard Edition and Windows Server 2003, Enterprise Edition.", message, args);
			case NS_E_PUBLISHING_POINT_STOPPED:
				throw new COMStatus("NS_E_PUBLISHING_POINT_STOPPED: The operation cannot be completed because the publishing point has been stopped.", message, args);
			case NS_E_PLAYLIST_ENTRY_ALREADY_PLAYING:
				throw new COMStatus("NS_E_PLAYLIST_ENTRY_ALREADY_PLAYING: The playlist entry is already playing.", message, args);
			case NS_E_EMPTY_PLAYLIST:
				throw new COMStatus("NS_E_EMPTY_PLAYLIST: The playlist or directory you are requesting does not contain content.", message, args);
			case NS_E_PLAYLIST_PARSE_FAILURE:
				throw new COMStatus("NS_E_PLAYLIST_PARSE_FAILURE: The server was unable to parse the requested playlist file.", message, args);
			case NS_E_PLAYLIST_UNSUPPORTED_ENTRY:
				throw new COMStatus("NS_E_PLAYLIST_UNSUPPORTED_ENTRY: The requested operation is not supported for this type of playlist entry.", message, args);
			case NS_E_PLAYLIST_ENTRY_NOT_IN_PLAYLIST:
				throw new COMStatus("NS_E_PLAYLIST_ENTRY_NOT_IN_PLAYLIST: Cannot jump to a playlist entry that is not inserted in the playlist.", message, args);
			case NS_E_PLAYLIST_ENTRY_SEEK:
				throw new COMStatus("NS_E_PLAYLIST_ENTRY_SEEK: Cannot seek to the desired playlist entry.", message, args);
			case NS_E_PLAYLIST_RECURSIVE_PLAYLISTS:
				throw new COMStatus("NS_E_PLAYLIST_RECURSIVE_PLAYLISTS: Cannot play recursive playlist.", message, args);
			case NS_E_PLAYLIST_TOO_MANY_NESTED_PLAYLISTS:
				throw new COMStatus("NS_E_PLAYLIST_TOO_MANY_NESTED_PLAYLISTS: The number of nested playlists exceeded the limit the server can handle.", message, args);
			case NS_E_PLAYLIST_SHUTDOWN:
				throw new COMStatus("NS_E_PLAYLIST_SHUTDOWN: Cannot execute the requested operation because the playlist has been shut down by the Media Server.", message, args);
			case NS_E_PLAYLIST_END_RECEDING:
				throw new COMStatus("NS_E_PLAYLIST_END_RECEDING: The playlist has ended while receding.", message, args);
			case NS_E_DATAPATH_NO_SINK:
				throw new COMStatus("NS_E_DATAPATH_NO_SINK: The data path does not have an associated data writer plug-in.", message, args);
			case NS_E_INVALID_PUSH_TEMPLATE:
				throw new COMStatus("NS_E_INVALID_PUSH_TEMPLATE: The specified push template is invalid.", message, args);
			case NS_E_INVALID_PUSH_PUBLISHING_POINT:
				throw new COMStatus("NS_E_INVALID_PUSH_PUBLISHING_POINT: The specified push publishing point is invalid.", message, args);
			case NS_E_CRITICAL_ERROR:
				throw new COMStatus("NS_E_CRITICAL_ERROR: The requested operation cannot be performed because the server or publishing point is in a critical error state.", message, args);
			case NS_E_NO_NEW_CONNECTIONS:
				throw new COMStatus("NS_E_NO_NEW_CONNECTIONS: The content cannot be played because the server is not currently accepting connections. Try connecting at a later time.", message, args);
			case NS_E_WSX_INVALID_VERSION:
				throw new COMStatus("NS_E_WSX_INVALID_VERSION: The version of this playlist is not supported by the server.", message, args);
			case NS_E_HEADER_MISMATCH:
				throw new COMStatus("NS_E_HEADER_MISMATCH: The command does not apply to the current media header user by a server component.", message, args);
			case NS_E_PUSH_DUPLICATE_PUBLISHING_POINT_NAME:
				throw new COMStatus("NS_E_PUSH_DUPLICATE_PUBLISHING_POINT_NAME: The specified publishing point name is already in use.", message, args);
			case NS_E_NO_SCRIPT_ENGINE:
				throw new COMStatus("NS_E_NO_SCRIPT_ENGINE: There is no script engine available for this file.", message, args);
			case NS_E_PLUGIN_ERROR_REPORTED:
				throw new COMStatus("NS_E_PLUGIN_ERROR_REPORTED: The plug-in has reported an error. See the Troubleshooting tab or the NT Application Event Log for details.", message, args);
			case NS_E_SOURCE_PLUGIN_NOT_FOUND:
				throw new COMStatus("NS_E_SOURCE_PLUGIN_NOT_FOUND: No enabled data source plug-in is available to access the requested content.", message, args);
			case NS_E_PLAYLIST_PLUGIN_NOT_FOUND:
				throw new COMStatus("NS_E_PLAYLIST_PLUGIN_NOT_FOUND: No enabled playlist parser plug-in is available to access the requested content.", message, args);
			case NS_E_DATA_SOURCE_ENUMERATION_NOT_SUPPORTED:
				throw new COMStatus("NS_E_DATA_SOURCE_ENUMERATION_NOT_SUPPORTED: The data source plug-in does not support enumeration.", message, args);
			case NS_E_MEDIA_PARSER_INVALID_FORMAT:
				throw new COMStatus("NS_E_MEDIA_PARSER_INVALID_FORMAT: The server cannot stream the selected file because it is either damaged or corrupt. Select a different file.", message, args);
			case NS_E_SCRIPT_DEBUGGER_NOT_INSTALLED:
				throw new COMStatus("NS_E_SCRIPT_DEBUGGER_NOT_INSTALLED: The plug-in cannot be enabled because a compatible script debugger is not installed on this system. Install a script debugger, or disable the script debugger option on the general tab of the plug-in's properties page and try again.", message, args);
			case NS_E_FEATURE_REQUIRES_ENTERPRISE_SERVER:
				throw new COMStatus("NS_E_FEATURE_REQUIRES_ENTERPRISE_SERVER: The plug-in cannot be loaded because it requires Windows Server 2003, Enterprise Edition.", message, args);
			case NS_E_WIZARD_RUNNING:
				throw new COMStatus("NS_E_WIZARD_RUNNING: Another wizard is currently running. Please close the other wizard or wait until it finishes before attempting to run this wizard again.", message, args);
			case NS_E_INVALID_LOG_URL:
				throw new COMStatus("NS_E_INVALID_LOG_URL: Invalid log URL. Multicast logging URL must look like \"http://servername/isapibackend.dll\".", message, args);
			case NS_E_INVALID_MTU_RANGE:
				throw new COMStatus("NS_E_INVALID_MTU_RANGE: Invalid MTU specified. The valid range for maximum packet size is between 36 and 65507 bytes.", message, args);
			case NS_E_INVALID_PLAY_STATISTICS:
				throw new COMStatus("NS_E_INVALID_PLAY_STATISTICS: Invalid play statistics for logging.", message, args);
			case NS_E_LOG_NEED_TO_BE_SKIPPED:
				throw new COMStatus("NS_E_LOG_NEED_TO_BE_SKIPPED: The log needs to be skipped.", message, args);
			case NS_E_HTTP_TEXT_DATACONTAINER_SIZE_LIMIT_EXCEEDED:
				throw new COMStatus("NS_E_HTTP_TEXT_DATACONTAINER_SIZE_LIMIT_EXCEEDED: The size of the data exceeded the limit the WMS HTTP Download Data Source plugin can handle.", message, args);
			case NS_E_PORT_IN_USE:
				throw new COMStatus("NS_E_PORT_IN_USE: One usage of each socket address (protocol/network address/port) is permitted. Verify that other services or applications are not attempting to use the same port and then try to enable the plug-in again.", message, args);
			case NS_E_PORT_IN_USE_HTTP:
				throw new COMStatus("NS_E_PORT_IN_USE_HTTP: One usage of each socket address (protocol/network address/port) is permitted. Verify that other services (such as IIS) or applications are not attempting to use the same port and then try to enable the plug-in again.", message, args);
			case NS_E_HTTP_TEXT_DATACONTAINER_INVALID_SERVER_RESPONSE:
				throw new COMStatus("NS_E_HTTP_TEXT_DATACONTAINER_INVALID_SERVER_RESPONSE: The WMS HTTP Download Data Source plugin was unable to receive the remote server's response.", message, args);
			case NS_E_ARCHIVE_REACH_QUOTA:
				throw new COMStatus("NS_E_ARCHIVE_REACH_QUOTA: The archive plug-in has reached its quota.", message, args);
			case NS_E_ARCHIVE_ABORT_DUE_TO_BCAST:
				throw new COMStatus("NS_E_ARCHIVE_ABORT_DUE_TO_BCAST: The archive plug-in aborted because the source was from broadcast.", message, args);
			case NS_E_ARCHIVE_GAP_DETECTED:
				throw new COMStatus("NS_E_ARCHIVE_GAP_DETECTED: The archive plug-in detected an interrupt in the source.", message, args);
			case NS_E_AUTHORIZATION_FILE_NOT_FOUND:
				throw new COMStatus("NS_E_AUTHORIZATION_FILE_NOT_FOUND: The system cannot find the file specified.", message, args);
			case NS_E_BAD_MARKIN:
				throw new COMStatus("NS_E_BAD_MARKIN: The mark-in time should be greater than 0 and less than the mark-out time.", message, args);
			case NS_E_BAD_MARKOUT:
				throw new COMStatus("NS_E_BAD_MARKOUT: The mark-out time should be greater than the mark-in time and less than the file duration.", message, args);
			case NS_E_NOMATCHING_MEDIASOURCE:
				throw new COMStatus("NS_E_NOMATCHING_MEDIASOURCE: No matching media type is found in the source %1.", message, args);
			case NS_E_UNSUPPORTED_SOURCETYPE:
				throw new COMStatus("NS_E_UNSUPPORTED_SOURCETYPE: The specified source type is not supported.", message, args);
			case NS_E_TOO_MANY_AUDIO:
				throw new COMStatus("NS_E_TOO_MANY_AUDIO: It is not possible to specify more than one audio input.", message, args);
			case NS_E_TOO_MANY_VIDEO:
				throw new COMStatus("NS_E_TOO_MANY_VIDEO: It is not possible to specify more than two video inputs.", message, args);
			case NS_E_NOMATCHING_ELEMENT:
				throw new COMStatus("NS_E_NOMATCHING_ELEMENT: No matching element is found in the list.", message, args);
			case NS_E_MISMATCHED_MEDIACONTENT:
				throw new COMStatus("NS_E_MISMATCHED_MEDIACONTENT: The profile's media types must match the media types defined for the session.", message, args);
			case NS_E_CANNOT_DELETE_ACTIVE_SOURCEGROUP:
				throw new COMStatus("NS_E_CANNOT_DELETE_ACTIVE_SOURCEGROUP: It is not possible to remove an active source while encoding.", message, args);
			case NS_E_AUDIODEVICE_BUSY:
				throw new COMStatus("NS_E_AUDIODEVICE_BUSY: It is not possible to open the specified audio capture device because it is currently in use.", message, args);
			case NS_E_AUDIODEVICE_UNEXPECTED:
				throw new COMStatus("NS_E_AUDIODEVICE_UNEXPECTED: It is not possible to open the specified audio capture device because an unexpected error has occurred.", message, args);
			case NS_E_AUDIODEVICE_BADFORMAT:
				throw new COMStatus("NS_E_AUDIODEVICE_BADFORMAT: The audio capture device does not support the specified audio format.", message, args);
			case NS_E_VIDEODEVICE_BUSY:
				throw new COMStatus("NS_E_VIDEODEVICE_BUSY: It is not possible to open the specified video capture device because it is currently in use.", message, args);
			case NS_E_VIDEODEVICE_UNEXPECTED:
				throw new COMStatus("NS_E_VIDEODEVICE_UNEXPECTED: It is not possible to open the specified video capture device because an unexpected error has occurred.", message, args);
			case NS_E_INVALIDCALL_WHILE_ENCODER_RUNNING:
				throw new COMStatus("NS_E_INVALIDCALL_WHILE_ENCODER_RUNNING: This operation is not allowed while encoding.", message, args);
			case NS_E_NO_PROFILE_IN_SOURCEGROUP:
				throw new COMStatus("NS_E_NO_PROFILE_IN_SOURCEGROUP: No profile is set for the source.", message, args);
			case NS_E_VIDEODRIVER_UNSTABLE:
				throw new COMStatus("NS_E_VIDEODRIVER_UNSTABLE: The video capture driver returned an unrecoverable error. It is now in an unstable state.", message, args);
			case NS_E_VIDCAPSTARTFAILED:
				throw new COMStatus("NS_E_VIDCAPSTARTFAILED: It was not possible to start the video device.", message, args);
			case NS_E_VIDSOURCECOMPRESSION:
				throw new COMStatus("NS_E_VIDSOURCECOMPRESSION: The video source does not support the requested output format or color depth.", message, args);
			case NS_E_VIDSOURCESIZE:
				throw new COMStatus("NS_E_VIDSOURCESIZE: The video source does not support the requested capture size.", message, args);
			case NS_E_ICMQUERYFORMAT:
				throw new COMStatus("NS_E_ICMQUERYFORMAT: It was not possible to obtain output information from the video compressor.", message, args);
			case NS_E_VIDCAPCREATEWINDOW:
				throw new COMStatus("NS_E_VIDCAPCREATEWINDOW: It was not possible to create a video capture window.", message, args);
			case NS_E_VIDCAPDRVINUSE:
				throw new COMStatus("NS_E_VIDCAPDRVINUSE: There is already a stream active on this video device.", message, args);
			case NS_E_NO_MEDIAFORMAT_IN_SOURCE:
				throw new COMStatus("NS_E_NO_MEDIAFORMAT_IN_SOURCE: No media format is set in source.", message, args);
			case NS_E_NO_VALID_OUTPUT_STREAM:
				throw new COMStatus("NS_E_NO_VALID_OUTPUT_STREAM: Cannot find a valid output stream from the source.", message, args);
			case NS_E_NO_VALID_SOURCE_PLUGIN:
				throw new COMStatus("NS_E_NO_VALID_SOURCE_PLUGIN: It was not possible to find a valid source plug-in for the specified source.", message, args);
			case NS_E_NO_ACTIVE_SOURCEGROUP:
				throw new COMStatus("NS_E_NO_ACTIVE_SOURCEGROUP: No source is currently active.", message, args);
			case NS_E_NO_SCRIPT_STREAM:
				throw new COMStatus("NS_E_NO_SCRIPT_STREAM: No script stream is set in the current source.", message, args);
			case NS_E_INVALIDCALL_WHILE_ARCHIVAL_RUNNING:
				throw new COMStatus("NS_E_INVALIDCALL_WHILE_ARCHIVAL_RUNNING: This operation is not allowed while archiving.", message, args);
			case NS_E_INVALIDPACKETSIZE:
				throw new COMStatus("NS_E_INVALIDPACKETSIZE: The setting for the maximum packet size is not valid.", message, args);
			case NS_E_PLUGIN_CLSID_INVALID:
				throw new COMStatus("NS_E_PLUGIN_CLSID_INVALID: The plug-in CLSID specified is not valid.", message, args);
			case NS_E_UNSUPPORTED_ARCHIVETYPE:
				throw new COMStatus("NS_E_UNSUPPORTED_ARCHIVETYPE: This archive type is not supported.", message, args);
			case NS_E_UNSUPPORTED_ARCHIVEOPERATION:
				throw new COMStatus("NS_E_UNSUPPORTED_ARCHIVEOPERATION: This archive operation is not supported.", message, args);
			case NS_E_ARCHIVE_FILENAME_NOTSET:
				throw new COMStatus("NS_E_ARCHIVE_FILENAME_NOTSET: The local archive file name was not set.", message, args);
			case NS_E_SOURCEGROUP_NOTPREPARED:
				throw new COMStatus("NS_E_SOURCEGROUP_NOTPREPARED: The source is not yet prepared.", message, args);
			case NS_E_PROFILE_MISMATCH:
				throw new COMStatus("NS_E_PROFILE_MISMATCH: Profiles on the sources do not match.", message, args);
			case NS_E_INCORRECTCLIPSETTINGS:
				throw new COMStatus("NS_E_INCORRECTCLIPSETTINGS: The specified crop values are not valid.", message, args);
			case NS_E_NOSTATSAVAILABLE:
				throw new COMStatus("NS_E_NOSTATSAVAILABLE: No statistics are available at this time.", message, args);
			case NS_E_NOTARCHIVING:
				throw new COMStatus("NS_E_NOTARCHIVING: The encoder is not archiving.", message, args);
			case NS_E_INVALIDCALL_WHILE_ENCODER_STOPPED:
				throw new COMStatus("NS_E_INVALIDCALL_WHILE_ENCODER_STOPPED: This operation is only allowed during encoding.", message, args);
			case NS_E_NOSOURCEGROUPS:
				throw new COMStatus("NS_E_NOSOURCEGROUPS: This SourceGroupCollection doesn't contain any SourceGroups.", message, args);
			case NS_E_INVALIDINPUTFPS:
				throw new COMStatus("NS_E_INVALIDINPUTFPS: This source does not have a frame rate of 30 fps. Therefore, it is not possible to apply the inverse telecine filter to the source.", message, args);
			case NS_E_NO_DATAVIEW_SUPPORT:
				throw new COMStatus("NS_E_NO_DATAVIEW_SUPPORT: It is not possible to display your source or output video in the Video panel.", message, args);
			case NS_E_CODEC_UNAVAILABLE:
				throw new COMStatus("NS_E_CODEC_UNAVAILABLE: One or more codecs required to open this content could not be found.", message, args);
			case NS_E_ARCHIVE_SAME_AS_INPUT:
				throw new COMStatus("NS_E_ARCHIVE_SAME_AS_INPUT: The archive file has the same name as an input file. Change one of the names before continuing.", message, args);
			case NS_E_SOURCE_NOTSPECIFIED:
				throw new COMStatus("NS_E_SOURCE_NOTSPECIFIED: The source has not been set up completely.", message, args);
			case NS_E_NO_REALTIME_TIMECOMPRESSION:
				throw new COMStatus("NS_E_NO_REALTIME_TIMECOMPRESSION: It is not possible to apply time compression to a broadcast session.", message, args);
			case NS_E_UNSUPPORTED_ENCODER_DEVICE:
				throw new COMStatus("NS_E_UNSUPPORTED_ENCODER_DEVICE: It is not possible to open this device.", message, args);
			case NS_E_UNEXPECTED_DISPLAY_SETTINGS:
				throw new COMStatus("NS_E_UNEXPECTED_DISPLAY_SETTINGS: It is not possible to start encoding because the display size or color has changed since the current session was defined. Restore the previous settings or create a new session.", message, args);
			case NS_E_NO_AUDIODATA:
				throw new COMStatus("NS_E_NO_AUDIODATA: No audio data has been received for several seconds. Check the audio source and restart the encoder.", message, args);
			case NS_E_INPUTSOURCE_PROBLEM:
				throw new COMStatus("NS_E_INPUTSOURCE_PROBLEM: One or all of the specified sources are not working properly. Check that the sources are configured correctly.", message, args);
			case NS_E_WME_VERSION_MISMATCH:
				throw new COMStatus("NS_E_WME_VERSION_MISMATCH: The supplied configuration file is not supported by this version of the encoder.", message, args);
			case NS_E_NO_REALTIME_PREPROCESS:
				throw new COMStatus("NS_E_NO_REALTIME_PREPROCESS: It is not possible to use image preprocessing with live encoding.", message, args);
			case NS_E_NO_REPEAT_PREPROCESS:
				throw new COMStatus("NS_E_NO_REPEAT_PREPROCESS: It is not possible to use two-pass encoding when the source is set to loop.", message, args);
			case NS_E_CANNOT_PAUSE_LIVEBROADCAST:
				throw new COMStatus("NS_E_CANNOT_PAUSE_LIVEBROADCAST: It is not possible to pause encoding during a broadcast.", message, args);
			case NS_E_DRM_PROFILE_NOT_SET:
				throw new COMStatus("NS_E_DRM_PROFILE_NOT_SET: A DRM profile has not been set for the current session.", message, args);
			case NS_E_DUPLICATE_DRMPROFILE:
				throw new COMStatus("NS_E_DUPLICATE_DRMPROFILE: The profile ID is already used by a DRM profile. Specify a different profile ID.", message, args);
			case NS_E_INVALID_DEVICE:
				throw new COMStatus("NS_E_INVALID_DEVICE: The setting of the selected device does not support control for playing back tapes.", message, args);
			case NS_E_SPEECHEDL_ON_NON_MIXEDMODE:
				throw new COMStatus("NS_E_SPEECHEDL_ON_NON_MIXEDMODE: You must specify a mixed voice and audio mode in order to use an optimization definition file.", message, args);
			case NS_E_DRM_PASSWORD_TOO_LONG:
				throw new COMStatus("NS_E_DRM_PASSWORD_TOO_LONG: The specified password is too long. Type a password with fewer than 8 characters.", message, args);
			case NS_E_DEVCONTROL_FAILED_SEEK:
				throw new COMStatus("NS_E_DEVCONTROL_FAILED_SEEK: It is not possible to seek to the specified mark-in point.", message, args);
			case NS_E_INTERLACE_REQUIRE_SAMESIZE:
				throw new COMStatus("NS_E_INTERLACE_REQUIRE_SAMESIZE: When you choose to maintain the interlacing in your video, the output video size must match the input video size.", message, args);
			case NS_E_TOO_MANY_DEVICECONTROL:
				throw new COMStatus("NS_E_TOO_MANY_DEVICECONTROL: Only one device control plug-in can control a device.", message, args);
			case NS_E_NO_MULTIPASS_FOR_LIVEDEVICE:
				throw new COMStatus("NS_E_NO_MULTIPASS_FOR_LIVEDEVICE: You must also enable storing content to hard disk temporarily in order to use two-pass encoding with the input device.", message, args);
			case NS_E_MISSING_AUDIENCE:
				throw new COMStatus("NS_E_MISSING_AUDIENCE: An audience is missing from the output stream configuration.", message, args);
			case NS_E_AUDIENCE_CONTENTTYPE_MISMATCH:
				throw new COMStatus("NS_E_AUDIENCE_CONTENTTYPE_MISMATCH: All audiences in the output tree must have the same content type.", message, args);
			case NS_E_MISSING_SOURCE_INDEX:
				throw new COMStatus("NS_E_MISSING_SOURCE_INDEX: A source index is missing from the output stream configuration.", message, args);
			case NS_E_NUM_LANGUAGE_MISMATCH:
				throw new COMStatus("NS_E_NUM_LANGUAGE_MISMATCH: The same source index in different audiences should have the same number of languages.", message, args);
			case NS_E_LANGUAGE_MISMATCH:
				throw new COMStatus("NS_E_LANGUAGE_MISMATCH: The same source index in different audiences should have the same languages.", message, args);
			case NS_E_VBRMODE_MISMATCH:
				throw new COMStatus("NS_E_VBRMODE_MISMATCH: The same source index in different audiences should use the same VBR encoding mode.", message, args);
			case NS_E_INVALID_INPUT_AUDIENCE_INDEX:
				throw new COMStatus("NS_E_INVALID_INPUT_AUDIENCE_INDEX: The bit rate index specified is not valid.", message, args);
			case NS_E_INVALID_INPUT_LANGUAGE:
				throw new COMStatus("NS_E_INVALID_INPUT_LANGUAGE: The specified language is not valid.", message, args);
			case NS_E_INVALID_INPUT_STREAM:
				throw new COMStatus("NS_E_INVALID_INPUT_STREAM: The specified source type is not valid.", message, args);
			case NS_E_EXPECT_MONO_WAV_INPUT:
				throw new COMStatus("NS_E_EXPECT_MONO_WAV_INPUT: The source must be a mono channel .wav file.", message, args);
			case NS_E_INPUT_WAVFORMAT_MISMATCH:
				throw new COMStatus("NS_E_INPUT_WAVFORMAT_MISMATCH: All the source .wav files must have the same format.", message, args);
			case NS_E_RECORDQ_DISK_FULL:
				throw new COMStatus("NS_E_RECORDQ_DISK_FULL: The hard disk being used for temporary storage of content has reached the minimum allowed disk space. Create more space on the hard disk and restart encoding.", message, args);
			case NS_E_NO_PAL_INVERSE_TELECINE:
				throw new COMStatus("NS_E_NO_PAL_INVERSE_TELECINE: It is not possible to apply the inverse telecine feature to PAL content.", message, args);
			case NS_E_ACTIVE_SG_DEVICE_DISCONNECTED:
				throw new COMStatus("NS_E_ACTIVE_SG_DEVICE_DISCONNECTED: A capture device in the current active source is no longer available.", message, args);
			case NS_E_ACTIVE_SG_DEVICE_CONTROL_DISCONNECTED:
				throw new COMStatus("NS_E_ACTIVE_SG_DEVICE_CONTROL_DISCONNECTED: A device used in the current active source for device control is no longer available.", message, args);
			case NS_E_NO_FRAMES_SUBMITTED_TO_ANALYZER:
				throw new COMStatus("NS_E_NO_FRAMES_SUBMITTED_TO_ANALYZER: No frames have been submitted to the analyzer for analysis.", message, args);
			case NS_E_INPUT_DOESNOT_SUPPORT_SMPTE:
				throw new COMStatus("NS_E_INPUT_DOESNOT_SUPPORT_SMPTE: The source video does not support time codes.", message, args);
			case NS_E_NO_SMPTE_WITH_MULTIPLE_SOURCEGROUPS:
				throw new COMStatus("NS_E_NO_SMPTE_WITH_MULTIPLE_SOURCEGROUPS: It is not possible to generate a time code when there are multiple sources in a session.", message, args);
			case NS_E_BAD_CONTENTEDL:
				throw new COMStatus("NS_E_BAD_CONTENTEDL: The voice codec optimization definition file cannot be found or is corrupted.", message, args);
			case NS_E_INTERLACEMODE_MISMATCH:
				throw new COMStatus("NS_E_INTERLACEMODE_MISMATCH: The same source index in different audiences should have the same interlace mode.", message, args);
			case NS_E_NONSQUAREPIXELMODE_MISMATCH:
				throw new COMStatus("NS_E_NONSQUAREPIXELMODE_MISMATCH: The same source index in different audiences should have the same nonsquare pixel mode.", message, args);
			case NS_E_SMPTEMODE_MISMATCH:
				throw new COMStatus("NS_E_SMPTEMODE_MISMATCH: The same source index in different audiences should have the same time code mode.", message, args);
			case NS_E_END_OF_TAPE:
				throw new COMStatus("NS_E_END_OF_TAPE: Either the end of the tape has been reached or there is no tape. Check the device and tape.", message, args);
			case NS_E_NO_MEDIA_IN_AUDIENCE:
				throw new COMStatus("NS_E_NO_MEDIA_IN_AUDIENCE: No audio or video input has been specified.", message, args);
			case NS_E_NO_AUDIENCES:
				throw new COMStatus("NS_E_NO_AUDIENCES: The profile must contain a bit rate.", message, args);
			case NS_E_NO_AUDIO_COMPAT:
				throw new COMStatus("NS_E_NO_AUDIO_COMPAT: You must specify at least one audio stream to be compatible with Windows Media Player 7.1.", message, args);
			case NS_E_INVALID_VBR_COMPAT:
				throw new COMStatus("NS_E_INVALID_VBR_COMPAT: Using a VBR encoding mode is not compatible with Windows Media Player 7.1.", message, args);
			case NS_E_NO_PROFILE_NAME:
				throw new COMStatus("NS_E_NO_PROFILE_NAME: You must specify a profile name.", message, args);
			case NS_E_INVALID_VBR_WITH_UNCOMP:
				throw new COMStatus("NS_E_INVALID_VBR_WITH_UNCOMP: It is not possible to use a VBR encoding mode with uncompressed audio or video.", message, args);
			case NS_E_MULTIPLE_VBR_AUDIENCES:
				throw new COMStatus("NS_E_MULTIPLE_VBR_AUDIENCES: It is not possible to use MBR encoding with VBR encoding.", message, args);
			case NS_E_UNCOMP_COMP_COMBINATION:
				throw new COMStatus("NS_E_UNCOMP_COMP_COMBINATION: It is not possible to mix uncompressed and compressed content in a session.", message, args);
			case NS_E_MULTIPLE_AUDIO_CODECS:
				throw new COMStatus("NS_E_MULTIPLE_AUDIO_CODECS: All audiences must use the same audio codec.", message, args);
			case NS_E_MULTIPLE_AUDIO_FORMATS:
				throw new COMStatus("NS_E_MULTIPLE_AUDIO_FORMATS: All audiences should use the same audio format to be compatible with Windows Media Player 7.1.", message, args);
			case NS_E_AUDIO_BITRATE_STEPDOWN:
				throw new COMStatus("NS_E_AUDIO_BITRATE_STEPDOWN: The audio bit rate for an audience with a higher total bit rate must be greater than one with a lower total bit rate.", message, args);
			case NS_E_INVALID_AUDIO_PEAKRATE:
				throw new COMStatus("NS_E_INVALID_AUDIO_PEAKRATE: The audio peak bit rate setting is not valid.", message, args);
			case NS_E_INVALID_AUDIO_PEAKRATE_2:
				throw new COMStatus("NS_E_INVALID_AUDIO_PEAKRATE_2: The audio peak bit rate setting must be greater than the audio bit rate setting.", message, args);
			case NS_E_INVALID_AUDIO_BUFFERMAX:
				throw new COMStatus("NS_E_INVALID_AUDIO_BUFFERMAX: The setting for the maximum buffer size for audio is not valid.", message, args);
			case NS_E_MULTIPLE_VIDEO_CODECS:
				throw new COMStatus("NS_E_MULTIPLE_VIDEO_CODECS: All audiences must use the same video codec.", message, args);
			case NS_E_MULTIPLE_VIDEO_SIZES:
				throw new COMStatus("NS_E_MULTIPLE_VIDEO_SIZES: All audiences should use the same video size to be compatible with Windows Media Player 7.1.", message, args);
			case NS_E_INVALID_VIDEO_BITRATE:
				throw new COMStatus("NS_E_INVALID_VIDEO_BITRATE: The video bit rate setting is not valid.", message, args);
			case NS_E_VIDEO_BITRATE_STEPDOWN:
				throw new COMStatus("NS_E_VIDEO_BITRATE_STEPDOWN: The video bit rate for an audience with a higher total bit rate must be greater than one with a lower total bit rate.", message, args);
			case NS_E_INVALID_VIDEO_PEAKRATE:
				throw new COMStatus("NS_E_INVALID_VIDEO_PEAKRATE: The video peak bit rate setting is not valid.", message, args);
			case NS_E_INVALID_VIDEO_PEAKRATE_2:
				throw new COMStatus("NS_E_INVALID_VIDEO_PEAKRATE_2: The video peak bit rate setting must be greater than the video bit rate setting.", message, args);
			case NS_E_INVALID_VIDEO_WIDTH:
				throw new COMStatus("NS_E_INVALID_VIDEO_WIDTH: The video width setting is not valid.", message, args);
			case NS_E_INVALID_VIDEO_HEIGHT:
				throw new COMStatus("NS_E_INVALID_VIDEO_HEIGHT: The video height setting is not valid.", message, args);
			case NS_E_INVALID_VIDEO_FPS:
				throw new COMStatus("NS_E_INVALID_VIDEO_FPS: The video frame rate setting is not valid.", message, args);
			case NS_E_INVALID_VIDEO_KEYFRAME:
				throw new COMStatus("NS_E_INVALID_VIDEO_KEYFRAME: The video key frame setting is not valid.", message, args);
			case NS_E_INVALID_VIDEO_IQUALITY:
				throw new COMStatus("NS_E_INVALID_VIDEO_IQUALITY: The video image quality setting is not valid.", message, args);
			case NS_E_INVALID_VIDEO_CQUALITY:
				throw new COMStatus("NS_E_INVALID_VIDEO_CQUALITY: The video codec quality setting is not valid.", message, args);
			case NS_E_INVALID_VIDEO_BUFFER:
				throw new COMStatus("NS_E_INVALID_VIDEO_BUFFER: The video buffer setting is not valid.", message, args);
			case NS_E_INVALID_VIDEO_BUFFERMAX:
				throw new COMStatus("NS_E_INVALID_VIDEO_BUFFERMAX: The setting for the maximum buffer size for video is not valid.", message, args);
			case NS_E_INVALID_VIDEO_BUFFERMAX_2:
				throw new COMStatus("NS_E_INVALID_VIDEO_BUFFERMAX_2: The value of the video maximum buffer size setting must be greater than the video buffer size setting.", message, args);
			case NS_E_INVALID_VIDEO_WIDTH_ALIGN:
				throw new COMStatus("NS_E_INVALID_VIDEO_WIDTH_ALIGN: The alignment of the video width is not valid.", message, args);
			case NS_E_INVALID_VIDEO_HEIGHT_ALIGN:
				throw new COMStatus("NS_E_INVALID_VIDEO_HEIGHT_ALIGN: The alignment of the video height is not valid.", message, args);
			case NS_E_MULTIPLE_SCRIPT_BITRATES:
				throw new COMStatus("NS_E_MULTIPLE_SCRIPT_BITRATES: All bit rates must have the same script bit rate.", message, args);
			case NS_E_INVALID_SCRIPT_BITRATE:
				throw new COMStatus("NS_E_INVALID_SCRIPT_BITRATE: The script bit rate specified is not valid.", message, args);
			case NS_E_MULTIPLE_FILE_BITRATES:
				throw new COMStatus("NS_E_MULTIPLE_FILE_BITRATES: All bit rates must have the same file transfer bit rate.", message, args);
			case NS_E_INVALID_FILE_BITRATE:
				throw new COMStatus("NS_E_INVALID_FILE_BITRATE: The file transfer bit rate is not valid.", message, args);
			case NS_E_SAME_AS_INPUT_COMBINATION:
				throw new COMStatus("NS_E_SAME_AS_INPUT_COMBINATION: All audiences in a profile should either be same as input or have video width and height specified.", message, args);
			case NS_E_SOURCE_CANNOT_LOOP:
				throw new COMStatus("NS_E_SOURCE_CANNOT_LOOP: This source type does not support looping.", message, args);
			case NS_E_INVALID_FOLDDOWN_COEFFICIENTS:
				throw new COMStatus("NS_E_INVALID_FOLDDOWN_COEFFICIENTS: The fold-down value needs to be between -144 and 0.", message, args);
			case NS_E_DRMPROFILE_NOTFOUND:
				throw new COMStatus("NS_E_DRMPROFILE_NOTFOUND: The specified DRM profile does not exist in the system.", message, args);
			case NS_E_INVALID_TIMECODE:
				throw new COMStatus("NS_E_INVALID_TIMECODE: The specified time code is not valid.", message, args);
			case NS_E_NO_AUDIO_TIMECOMPRESSION:
				throw new COMStatus("NS_E_NO_AUDIO_TIMECOMPRESSION: It is not possible to apply time compression to a video-only session.", message, args);
			case NS_E_NO_TWOPASS_TIMECOMPRESSION:
				throw new COMStatus("NS_E_NO_TWOPASS_TIMECOMPRESSION: It is not possible to apply time compression to a session that is using two-pass encoding.", message, args);
			case NS_E_TIMECODE_REQUIRES_VIDEOSTREAM:
				throw new COMStatus("NS_E_TIMECODE_REQUIRES_VIDEOSTREAM: It is not possible to generate a time code for an audio-only session.", message, args);
			case NS_E_NO_MBR_WITH_TIMECODE:
				throw new COMStatus("NS_E_NO_MBR_WITH_TIMECODE: It is not possible to generate a time code when you are encoding content at multiple bit rates.", message, args);
			case NS_E_INVALID_INTERLACEMODE:
				throw new COMStatus("NS_E_INVALID_INTERLACEMODE: The video codec selected does not support maintaining interlacing in video.", message, args);
			case NS_E_INVALID_INTERLACE_COMPAT:
				throw new COMStatus("NS_E_INVALID_INTERLACE_COMPAT: Maintaining interlacing in video is not compatible with Windows Media Player 7.1.", message, args);
			case NS_E_INVALID_NONSQUAREPIXEL_COMPAT:
				throw new COMStatus("NS_E_INVALID_NONSQUAREPIXEL_COMPAT: Allowing nonsquare pixel output is not compatible with Windows Media Player 7.1.", message, args);
			case NS_E_INVALID_SOURCE_WITH_DEVICE_CONTROL:
				throw new COMStatus("NS_E_INVALID_SOURCE_WITH_DEVICE_CONTROL: Only capture devices can be used with device control.", message, args);
			case NS_E_CANNOT_GENERATE_BROADCAST_INFO_FOR_QUALITYVBR:
				throw new COMStatus("NS_E_CANNOT_GENERATE_BROADCAST_INFO_FOR_QUALITYVBR: It is not possible to generate the stream format file if you are using quality-based VBR encoding for the audio or video stream. Instead use the Windows Media file generated after encoding to create the announcement file.", message, args);
			case NS_E_EXCEED_MAX_DRM_PROFILE_LIMIT:
				throw new COMStatus("NS_E_EXCEED_MAX_DRM_PROFILE_LIMIT: It is not possible to create a DRM profile because the maximum number of profiles has been reached. You must delete some DRM profiles before creating new ones.", message, args);
			case NS_E_DEVICECONTROL_UNSTABLE:
				throw new COMStatus("NS_E_DEVICECONTROL_UNSTABLE: The device is in an unstable state. Check that the device is functioning properly and a tape is in place.", message, args);
			case NS_E_INVALID_PIXEL_ASPECT_RATIO:
				throw new COMStatus("NS_E_INVALID_PIXEL_ASPECT_RATIO: The pixel aspect ratio value must be between 1 and 255.", message, args);
			case NS_E_AUDIENCE__LANGUAGE_CONTENTTYPE_MISMATCH:
				throw new COMStatus("NS_E_AUDIENCE__LANGUAGE_CONTENTTYPE_MISMATCH: All streams with different languages in the same audience must have same properties.", message, args);
			case NS_E_INVALID_PROFILE_CONTENTTYPE:
				throw new COMStatus("NS_E_INVALID_PROFILE_CONTENTTYPE: The profile must contain at least one audio or video stream.", message, args);
			case NS_E_TRANSFORM_PLUGIN_NOT_FOUND:
				throw new COMStatus("NS_E_TRANSFORM_PLUGIN_NOT_FOUND: The transform plug-in could not be found.", message, args);
			case NS_E_TRANSFORM_PLUGIN_INVALID:
				throw new COMStatus("NS_E_TRANSFORM_PLUGIN_INVALID: The transform plug-in is not valid. It may be damaged or you may not have the required permissions to access the plug-in.", message, args);
			case NS_E_EDL_REQUIRED_FOR_DEVICE_MULTIPASS:
				throw new COMStatus("NS_E_EDL_REQUIRED_FOR_DEVICE_MULTIPASS: To use two-pass encoding, you must enable device control and setup an edit decision list (EDL) that has at least one entry.", message, args);
			case NS_E_INVALID_VIDEO_WIDTH_FOR_INTERLACED_ENCODING:
				throw new COMStatus("NS_E_INVALID_VIDEO_WIDTH_FOR_INTERLACED_ENCODING: When you choose to maintain the interlacing in your video, the output video size must be a multiple of 4.", message, args);
			case NS_E_MARKIN_UNSUPPORTED:
				throw new COMStatus("NS_E_MARKIN_UNSUPPORTED: Markin/Markout is unsupported with this source type.", message, args);
			case NS_E_DRM_INVALID_APPLICATION:
				throw new COMStatus("NS_E_DRM_INVALID_APPLICATION: A problem has occurred in the Digital Rights Management component. Contact product support for this application.", message, args);
			case NS_E_DRM_LICENSE_STORE_ERROR:
				throw new COMStatus("NS_E_DRM_LICENSE_STORE_ERROR: License storage is not working. Contact Microsoft product support.", message, args);
			case NS_E_DRM_SECURE_STORE_ERROR:
				throw new COMStatus("NS_E_DRM_SECURE_STORE_ERROR: Secure storage is not working. Contact Microsoft product support.", message, args);
			case NS_E_DRM_LICENSE_STORE_SAVE_ERROR:
				throw new COMStatus("NS_E_DRM_LICENSE_STORE_SAVE_ERROR: License acquisition did not work. Acquire a new license or contact the content provider for further assistance.", message, args);
			case NS_E_DRM_SECURE_STORE_UNLOCK_ERROR:
				throw new COMStatus("NS_E_DRM_SECURE_STORE_UNLOCK_ERROR: A problem has occurred in the Digital Rights Management component. Contact Microsoft product support.", message, args);
			case NS_E_DRM_INVALID_CONTENT:
				throw new COMStatus("NS_E_DRM_INVALID_CONTENT: The media file is corrupted. Contact the content provider to get a new file.", message, args);
			case NS_E_DRM_UNABLE_TO_OPEN_LICENSE:
				throw new COMStatus("NS_E_DRM_UNABLE_TO_OPEN_LICENSE: The license is corrupted. Acquire a new license.", message, args);
			case NS_E_DRM_INVALID_LICENSE:
				throw new COMStatus("NS_E_DRM_INVALID_LICENSE: The license is corrupted or invalid. Acquire a new license", message, args);
			case NS_E_DRM_INVALID_MACHINE:
				throw new COMStatus("NS_E_DRM_INVALID_MACHINE: Licenses cannot be copied from one computer to another. Use License Management to transfer licenses, or get a new license for the media file.", message, args);
			case NS_E_DRM_ENUM_LICENSE_FAILED:
				throw new COMStatus("NS_E_DRM_ENUM_LICENSE_FAILED: License storage is not working. Contact Microsoft product support.", message, args);
			case NS_E_DRM_INVALID_LICENSE_REQUEST:
				throw new COMStatus("NS_E_DRM_INVALID_LICENSE_REQUEST: The media file is corrupted. Contact the content provider to get a new file.", message, args);
			case NS_E_DRM_UNABLE_TO_INITIALIZE:
				throw new COMStatus("NS_E_DRM_UNABLE_TO_INITIALIZE: A problem has occurred in the Digital Rights Management component. Contact Microsoft product support.", message, args);
			case NS_E_DRM_UNABLE_TO_ACQUIRE_LICENSE:
				throw new COMStatus("NS_E_DRM_UNABLE_TO_ACQUIRE_LICENSE: The license could not be acquired. Try again later.", message, args);
			case NS_E_DRM_INVALID_LICENSE_ACQUIRED:
				throw new COMStatus("NS_E_DRM_INVALID_LICENSE_ACQUIRED: License acquisition did not work. Acquire a new license or contact the content provider for further assistance.", message, args);
			case NS_E_DRM_NO_RIGHTS:
				throw new COMStatus("NS_E_DRM_NO_RIGHTS: The requested operation cannot be performed on this file.", message, args);
			case NS_E_DRM_KEY_ERROR:
				throw new COMStatus("NS_E_DRM_KEY_ERROR: The requested action cannot be performed because a problem occurred with the Windows Media Digital Rights Management (DRM) components on your computer.", message, args);
			case NS_E_DRM_ENCRYPT_ERROR:
				throw new COMStatus("NS_E_DRM_ENCRYPT_ERROR: A problem has occurred in the Digital Rights Management component. Contact Microsoft product support.", message, args);
			case NS_E_DRM_DECRYPT_ERROR:
				throw new COMStatus("NS_E_DRM_DECRYPT_ERROR: The media file is corrupted. Contact the content provider to get a new file.", message, args);
			case NS_E_DRM_LICENSE_INVALID_XML:
				throw new COMStatus("NS_E_DRM_LICENSE_INVALID_XML: The license is corrupted. Acquire a new license.", message, args);
			case NS_E_DRM_NEEDS_INDIVIDUALIZATION:
				throw new COMStatus("NS_E_DRM_NEEDS_INDIVIDUALIZATION: A security upgrade is required to perform the operation on this media file.", message, args);
			case NS_E_DRM_ALREADY_INDIVIDUALIZED:
				throw new COMStatus("NS_E_DRM_ALREADY_INDIVIDUALIZED: You already have the latest security components. No upgrade is necessary at this time.", message, args);
			case NS_E_DRM_ACTION_NOT_QUERIED:
				throw new COMStatus("NS_E_DRM_ACTION_NOT_QUERIED: The application cannot perform this action. Contact product support for this application.", message, args);
			case NS_E_DRM_ACQUIRING_LICENSE:
				throw new COMStatus("NS_E_DRM_ACQUIRING_LICENSE: You cannot begin a new license acquisition process until the current one has been completed.", message, args);
			case NS_E_DRM_INDIVIDUALIZING:
				throw new COMStatus("NS_E_DRM_INDIVIDUALIZING: You cannot begin a new security upgrade until the current one has been completed.", message, args);
			case NS_E_BACKUP_RESTORE_FAILURE:
				throw new COMStatus("NS_E_BACKUP_RESTORE_FAILURE: Failure in Backup-Restore.", message, args);
			case NS_E_BACKUP_RESTORE_BAD_REQUEST_ID:
				throw new COMStatus("NS_E_BACKUP_RESTORE_BAD_REQUEST_ID: Bad Request ID in Backup-Restore.", message, args);
			case NS_E_DRM_PARAMETERS_MISMATCHED:
				throw new COMStatus("NS_E_DRM_PARAMETERS_MISMATCHED: A problem has occurred in the Digital Rights Management component. Contact Microsoft product support.", message, args);
			case NS_E_DRM_UNABLE_TO_CREATE_LICENSE_OBJECT:
				throw new COMStatus("NS_E_DRM_UNABLE_TO_CREATE_LICENSE_OBJECT: A license cannot be created for this media file. Reinstall the application.", message, args);
			case NS_E_DRM_UNABLE_TO_CREATE_INDI_OBJECT:
				throw new COMStatus("NS_E_DRM_UNABLE_TO_CREATE_INDI_OBJECT: A problem has occurred in the Digital Rights Management component. Contact Microsoft product support.", message, args);
			case NS_E_DRM_UNABLE_TO_CREATE_ENCRYPT_OBJECT:
				throw new COMStatus("NS_E_DRM_UNABLE_TO_CREATE_ENCRYPT_OBJECT: A problem has occurred in the Digital Rights Management component. Contact Microsoft product support.", message, args);
			case NS_E_DRM_UNABLE_TO_CREATE_DECRYPT_OBJECT:
				throw new COMStatus("NS_E_DRM_UNABLE_TO_CREATE_DECRYPT_OBJECT: A problem has occurred in the Digital Rights Management component. Contact Microsoft product support.", message, args);
			case NS_E_DRM_UNABLE_TO_CREATE_PROPERTIES_OBJECT:
				throw new COMStatus("NS_E_DRM_UNABLE_TO_CREATE_PROPERTIES_OBJECT: A problem has occurred in the Digital Rights Management component. Contact Microsoft product support.", message, args);
			case NS_E_DRM_UNABLE_TO_CREATE_BACKUP_OBJECT:
				throw new COMStatus("NS_E_DRM_UNABLE_TO_CREATE_BACKUP_OBJECT: A problem has occurred in the Digital Rights Management component. Contact Microsoft product support.", message, args);
			case NS_E_DRM_INDIVIDUALIZE_ERROR:
				throw new COMStatus("NS_E_DRM_INDIVIDUALIZE_ERROR: The security upgrade failed. Try again later.", message, args);
			case NS_E_DRM_LICENSE_OPEN_ERROR:
				throw new COMStatus("NS_E_DRM_LICENSE_OPEN_ERROR: License storage is not working. Contact Microsoft product support.", message, args);
			case NS_E_DRM_LICENSE_CLOSE_ERROR:
				throw new COMStatus("NS_E_DRM_LICENSE_CLOSE_ERROR: License storage is not working. Contact Microsoft product support.", message, args);
			case NS_E_DRM_GET_LICENSE_ERROR:
				throw new COMStatus("NS_E_DRM_GET_LICENSE_ERROR: License storage is not working. Contact Microsoft product support.", message, args);
			case NS_E_DRM_QUERY_ERROR:
				throw new COMStatus("NS_E_DRM_QUERY_ERROR: A problem has occurred in the Digital Rights Management component. Contact Microsoft product support.", message, args);
			case NS_E_DRM_REPORT_ERROR:
				throw new COMStatus("NS_E_DRM_REPORT_ERROR: A problem has occurred in the Digital Rights Management component. Contact product support for this application.", message, args);
			case NS_E_DRM_GET_LICENSESTRING_ERROR:
				throw new COMStatus("NS_E_DRM_GET_LICENSESTRING_ERROR: License storage is not working. Contact Microsoft product support.", message, args);
			case NS_E_DRM_GET_CONTENTSTRING_ERROR:
				throw new COMStatus("NS_E_DRM_GET_CONTENTSTRING_ERROR: The media file is corrupted. Contact the content provider to get a new file.", message, args);
			case NS_E_DRM_MONITOR_ERROR:
				throw new COMStatus("NS_E_DRM_MONITOR_ERROR: A problem has occurred in the Digital Rights Management component. Try again later.", message, args);
			case NS_E_DRM_UNABLE_TO_SET_PARAMETER:
				throw new COMStatus("NS_E_DRM_UNABLE_TO_SET_PARAMETER: The application has made an invalid call to the Digital Rights Management component. Contact product support for this application.", message, args);
			case NS_E_DRM_INVALID_APPDATA:
				throw new COMStatus("NS_E_DRM_INVALID_APPDATA: A problem has occurred in the Digital Rights Management component. Contact Microsoft product support.", message, args);
			case NS_E_DRM_INVALID_APPDATA_VERSION:
				throw new COMStatus("NS_E_DRM_INVALID_APPDATA_VERSION: A problem has occurred in the Digital Rights Management component. Contact product support for this application.", message, args);
			case NS_E_DRM_BACKUP_EXISTS:
				throw new COMStatus("NS_E_DRM_BACKUP_EXISTS: Licenses are already backed up in this location.", message, args);
			case NS_E_DRM_BACKUP_CORRUPT:
				throw new COMStatus("NS_E_DRM_BACKUP_CORRUPT: One or more backed-up licenses are missing or corrupt.", message, args);
			case NS_E_DRM_BACKUPRESTORE_BUSY:
				throw new COMStatus("NS_E_DRM_BACKUPRESTORE_BUSY: You cannot begin a new backup process until the current process has been completed.", message, args);
			case NS_E_BACKUP_RESTORE_BAD_DATA:
				throw new COMStatus("NS_E_BACKUP_RESTORE_BAD_DATA: Bad Data sent to Backup-Restore.", message, args);
			case NS_E_DRM_LICENSE_UNUSABLE:
				throw new COMStatus("NS_E_DRM_LICENSE_UNUSABLE: The license is invalid. Contact the content provider for further assistance.", message, args);
			case NS_E_DRM_INVALID_PROPERTY:
				throw new COMStatus("NS_E_DRM_INVALID_PROPERTY: A required property was not set by the application. Contact product support for this application.", message, args);
			case NS_E_DRM_SECURE_STORE_NOT_FOUND:
				throw new COMStatus("NS_E_DRM_SECURE_STORE_NOT_FOUND: A problem has occurred in the Digital Rights Management component of this application. Try to acquire a license again.", message, args);
			case NS_E_DRM_CACHED_CONTENT_ERROR:
				throw new COMStatus("NS_E_DRM_CACHED_CONTENT_ERROR: A license cannot be found for this media file. Use License Management to transfer a license for this file from the original computer, or acquire a new license.", message, args);
			case NS_E_DRM_INDIVIDUALIZATION_INCOMPLETE:
				throw new COMStatus("NS_E_DRM_INDIVIDUALIZATION_INCOMPLETE: A problem occurred during the security upgrade. Try again later.", message, args);
			case NS_E_DRM_DRIVER_AUTH_FAILURE:
				throw new COMStatus("NS_E_DRM_DRIVER_AUTH_FAILURE: Certified driver components are required to play this media file. Contact Windows Update to see whether updated drivers are available for your hardware.", message, args);
			case NS_E_DRM_NEED_UPGRADE_MSSAP:
				throw new COMStatus("NS_E_DRM_NEED_UPGRADE_MSSAP: One or more of the Secure Audio Path components were not found or an entry point in those components was not found.", message, args);
			case NS_E_DRM_REOPEN_CONTENT:
				throw new COMStatus("NS_E_DRM_REOPEN_CONTENT: Status message: Reopen the file.", message, args);
			case NS_E_DRM_DRIVER_DIGIOUT_FAILURE:
				throw new COMStatus("NS_E_DRM_DRIVER_DIGIOUT_FAILURE: Certain driver functionality is required to play this media file. Contact Windows Update to see whether updated drivers are available for your hardware.", message, args);
			case NS_E_DRM_INVALID_SECURESTORE_PASSWORD:
				throw new COMStatus("NS_E_DRM_INVALID_SECURESTORE_PASSWORD: A problem has occurred in the Digital Rights Management component. Contact Microsoft product support.", message, args);
			case NS_E_DRM_APPCERT_REVOKED:
				throw new COMStatus("NS_E_DRM_APPCERT_REVOKED: A problem has occurred in the Digital Rights Management component. Contact Microsoft product support.", message, args);
			case NS_E_DRM_RESTORE_FRAUD:
				throw new COMStatus("NS_E_DRM_RESTORE_FRAUD: You cannot restore your license(s).", message, args);
			case NS_E_DRM_HARDWARE_INCONSISTENT:
				throw new COMStatus("NS_E_DRM_HARDWARE_INCONSISTENT: The licenses for your media files are corrupted. Contact Microsoft product support.", message, args);
			case NS_E_DRM_SDMI_TRIGGER:
				throw new COMStatus("NS_E_DRM_SDMI_TRIGGER: To transfer this media file, you must upgrade the application.", message, args);
			case NS_E_DRM_SDMI_NOMORECOPIES:
				throw new COMStatus("NS_E_DRM_SDMI_NOMORECOPIES: You cannot make any more copies of this media file.", message, args);
			case NS_E_DRM_UNABLE_TO_CREATE_HEADER_OBJECT:
				throw new COMStatus("NS_E_DRM_UNABLE_TO_CREATE_HEADER_OBJECT: A problem has occurred in the Digital Rights Management component. Contact Microsoft product support.", message, args);
			case NS_E_DRM_UNABLE_TO_CREATE_KEYS_OBJECT:
				throw new COMStatus("NS_E_DRM_UNABLE_TO_CREATE_KEYS_OBJECT: A problem has occurred in the Digital Rights Management component. Contact Microsoft product support.", message, args);
			case NS_E_DRM_LICENSE_NOTACQUIRED:
				throw new COMStatus("NS_E_DRM_LICENSE_NOTACQUIRED: Unable to obtain license.", message, args);
			case NS_E_DRM_UNABLE_TO_CREATE_CODING_OBJECT:
				throw new COMStatus("NS_E_DRM_UNABLE_TO_CREATE_CODING_OBJECT: A problem has occurred in the Digital Rights Management component. Contact Microsoft product support.", message, args);
			case NS_E_DRM_UNABLE_TO_CREATE_STATE_DATA_OBJECT:
				throw new COMStatus("NS_E_DRM_UNABLE_TO_CREATE_STATE_DATA_OBJECT: A problem has occurred in the Digital Rights Management component. Contact Microsoft product support.", message, args);
			case NS_E_DRM_BUFFER_TOO_SMALL:
				throw new COMStatus("NS_E_DRM_BUFFER_TOO_SMALL: The buffer supplied is not sufficient.", message, args);
			case NS_E_DRM_UNSUPPORTED_PROPERTY:
				throw new COMStatus("NS_E_DRM_UNSUPPORTED_PROPERTY: The property requested is not supported.", message, args);
			case NS_E_DRM_ERROR_BAD_NET_RESP:
				throw new COMStatus("NS_E_DRM_ERROR_BAD_NET_RESP: The specified server cannot perform the requested operation.", message, args);
			case NS_E_DRM_STORE_NOTALLSTORED:
				throw new COMStatus("NS_E_DRM_STORE_NOTALLSTORED: Some of the licenses could not be stored.", message, args);
			case NS_E_DRM_SECURITY_COMPONENT_SIGNATURE_INVALID:
				throw new COMStatus("NS_E_DRM_SECURITY_COMPONENT_SIGNATURE_INVALID: The Digital Rights Management security upgrade component could not be validated. Contact Microsoft product support.", message, args);
			case NS_E_DRM_INVALID_DATA:
				throw new COMStatus("NS_E_DRM_INVALID_DATA: Invalid or corrupt data was encountered.", message, args);
			case NS_E_DRM_POLICY_DISABLE_ONLINE:
				throw new COMStatus("NS_E_DRM_POLICY_DISABLE_ONLINE: The Windows Media Digital Rights Management system cannot perform the requested action because your computer or network administrator has enabled the group policy Prevent Windows Media DRM Internet Access. For assistance, contact your administrator.", message, args);
			case NS_E_DRM_UNABLE_TO_CREATE_AUTHENTICATION_OBJECT:
				throw new COMStatus("NS_E_DRM_UNABLE_TO_CREATE_AUTHENTICATION_OBJECT: A problem has occurred in the Digital Rights Management component. Contact Microsoft product support.", message, args);
			case NS_E_DRM_NOT_CONFIGURED:
				throw new COMStatus("NS_E_DRM_NOT_CONFIGURED: Not all of the necessary properties for DRM have been set.", message, args);
			case NS_E_DRM_DEVICE_ACTIVATION_CANCELED:
				throw new COMStatus("NS_E_DRM_DEVICE_ACTIVATION_CANCELED: The portable device does not have the security required to copy protected files to it. To obtain the additional security, try to copy the file to your portable device again. When a message appears, click OK.", message, args);
			case NS_E_BACKUP_RESTORE_TOO_MANY_RESETS:
				throw new COMStatus("NS_E_BACKUP_RESTORE_TOO_MANY_RESETS: Too many resets in Backup-Restore.", message, args);
			case NS_E_DRM_DEBUGGING_NOT_ALLOWED:
				throw new COMStatus("NS_E_DRM_DEBUGGING_NOT_ALLOWED: Running this process under a debugger while using DRM content is not allowed.", message, args);
			case NS_E_DRM_OPERATION_CANCELED:
				throw new COMStatus("NS_E_DRM_OPERATION_CANCELED: The user canceled the DRM operation.", message, args);
			case NS_E_DRM_RESTRICTIONS_NOT_RETRIEVED:
				throw new COMStatus("NS_E_DRM_RESTRICTIONS_NOT_RETRIEVED: The license you are using has assocaited output restrictions. This license is unusable until these restrictions are queried.", message, args);
			case NS_E_DRM_UNABLE_TO_CREATE_PLAYLIST_OBJECT:
				throw new COMStatus("NS_E_DRM_UNABLE_TO_CREATE_PLAYLIST_OBJECT: A problem has occurred in the Digital Rights Management component. Contact Microsoft product support.", message, args);
			case NS_E_DRM_UNABLE_TO_CREATE_PLAYLIST_BURN_OBJECT:
				throw new COMStatus("NS_E_DRM_UNABLE_TO_CREATE_PLAYLIST_BURN_OBJECT: A problem has occurred in the Digital Rights Management component. Contact Microsoft product support.", message, args);
			case NS_E_DRM_UNABLE_TO_CREATE_DEVICE_REGISTRATION_OBJECT:
				throw new COMStatus("NS_E_DRM_UNABLE_TO_CREATE_DEVICE_REGISTRATION_OBJECT: A problem has occurred in the Digital Rights Management component. Contact Microsoft product support.", message, args);
			case NS_E_DRM_UNABLE_TO_CREATE_METERING_OBJECT:
				throw new COMStatus("NS_E_DRM_UNABLE_TO_CREATE_METERING_OBJECT: A problem has occurred in the Digital Rights Management component. Contact Microsoft product support.", message, args);
			case NS_E_DRM_TRACK_EXCEEDED_PLAYLIST_RESTICTION:
				throw new COMStatus("NS_E_DRM_TRACK_EXCEEDED_PLAYLIST_RESTICTION: The specified track has exceeded it's specified playlist burn limit in this playlist.", message, args);
			case NS_E_DRM_TRACK_EXCEEDED_TRACKBURN_RESTRICTION:
				throw new COMStatus("NS_E_DRM_TRACK_EXCEEDED_TRACKBURN_RESTRICTION: The specified track has exceeded it's track burn limit.", message, args);
			case NS_E_DRM_UNABLE_TO_GET_DEVICE_CERT:
				throw new COMStatus("NS_E_DRM_UNABLE_TO_GET_DEVICE_CERT: A problem has occurred in obtaining the device's certificate. Contact Microsoft product support.", message, args);
			case NS_E_DRM_UNABLE_TO_GET_SECURE_CLOCK:
				throw new COMStatus("NS_E_DRM_UNABLE_TO_GET_SECURE_CLOCK: A problem has occurred in obtaining the device's secure clock. Contact Microsoft product support.", message, args);
			case NS_E_DRM_UNABLE_TO_SET_SECURE_CLOCK:
				throw new COMStatus("NS_E_DRM_UNABLE_TO_SET_SECURE_CLOCK: A problem has occurred in setting the device's secure clock. Contact Microsoft product support.", message, args);
			case NS_E_DRM_UNABLE_TO_GET_SECURE_CLOCK_FROM_SERVER:
				throw new COMStatus("NS_E_DRM_UNABLE_TO_GET_SECURE_CLOCK_FROM_SERVER: A problem has occurred in obtaining the secure clock from server. Contact Microsoft product support.", message, args);
			case NS_E_DRM_POLICY_METERING_DISABLED:
				throw new COMStatus("NS_E_DRM_POLICY_METERING_DISABLED: This content requires the metering policy to be enabled.", message, args);
			case NS_E_DRM_TRANSFER_CHAINED_LICENSES_UNSUPPORTED:
				throw new COMStatus("NS_E_DRM_TRANSFER_CHAINED_LICENSES_UNSUPPORTED: Transfer of chained licenses unsupported.", message, args);
			case NS_E_DRM_SDK_VERSIONMISMATCH:
				throw new COMStatus("NS_E_DRM_SDK_VERSIONMISMATCH: The Digital Rights Management component is not installed properly. Reinstall the Player.", message, args);
			case NS_E_DRM_LIC_NEEDS_DEVICE_CLOCK_SET:
				throw new COMStatus("NS_E_DRM_LIC_NEEDS_DEVICE_CLOCK_SET: The file could not be transferred because the device clock is not set.", message, args);
			case NS_E_LICENSE_HEADER_MISSING_URL:
				throw new COMStatus("NS_E_LICENSE_HEADER_MISSING_URL: The content header is missing an acquisition URL.", message, args);
			case NS_E_DEVICE_NOT_WMDRM_DEVICE:
				throw new COMStatus("NS_E_DEVICE_NOT_WMDRM_DEVICE: The current attached device does not support WMDRM.", message, args);
			case NS_E_DRM_INVALID_APPCERT:
				throw new COMStatus("NS_E_DRM_INVALID_APPCERT: A problem has occurred in the Digital Rights Management component. Contact Microsoft product support.", message, args);
			case NS_E_DRM_PROTOCOL_FORCEFUL_TERMINATION_ON_PETITION:
				throw new COMStatus("NS_E_DRM_PROTOCOL_FORCEFUL_TERMINATION_ON_PETITION: The client application has been forcefully terminated during a DRM petition.", message, args);
			case NS_E_DRM_PROTOCOL_FORCEFUL_TERMINATION_ON_CHALLENGE:
				throw new COMStatus("NS_E_DRM_PROTOCOL_FORCEFUL_TERMINATION_ON_CHALLENGE: The client application has been forcefully terminated during a DRM challenge.", message, args);
			case NS_E_DRM_CHECKPOINT_FAILED:
				throw new COMStatus("NS_E_DRM_CHECKPOINT_FAILED: Secure storage protection error. Restore your licenses from a previous backup and try again.", message, args);
			case NS_E_DRM_BB_UNABLE_TO_INITIALIZE:
				throw new COMStatus("NS_E_DRM_BB_UNABLE_TO_INITIALIZE: A problem has occurred in the Digital Rights Management root of trust. Contact Microsoft product support.", message, args);
			case NS_E_DRM_UNABLE_TO_LOAD_HARDWARE_ID:
				throw new COMStatus("NS_E_DRM_UNABLE_TO_LOAD_HARDWARE_ID: A problem has occurred in retrieving the Digital Rights Management machine identification. Contact Microsoft product support.", message, args);
			case NS_E_DRM_UNABLE_TO_OPEN_DATA_STORE:
				throw new COMStatus("NS_E_DRM_UNABLE_TO_OPEN_DATA_STORE: A problem has occurred in opening the Digital Rights Management data storage file. Contact Microsoft product.", message, args);
			case NS_E_DRM_DATASTORE_CORRUPT:
				throw new COMStatus("NS_E_DRM_DATASTORE_CORRUPT: The Digital Rights Management data storage is not functioning properly. Contact Microsoft product support.", message, args);
			case NS_E_DRM_UNABLE_TO_CREATE_INMEMORYSTORE_OBJECT:
				throw new COMStatus("NS_E_DRM_UNABLE_TO_CREATE_INMEMORYSTORE_OBJECT: A problem has occurred in the Digital Rights Management component. Contact Microsoft product support.", message, args);
			case NS_E_DRM_STUBLIB_REQUIRED:
				throw new COMStatus("NS_E_DRM_STUBLIB_REQUIRED: A secured library is required to access the requested functionality.", message, args);
			case NS_E_DRM_UNABLE_TO_CREATE_CERTIFICATE_OBJECT:
				throw new COMStatus("NS_E_DRM_UNABLE_TO_CREATE_CERTIFICATE_OBJECT: A problem has occurred in the Digital Rights Management component. Contact Microsoft product support.", message, args);
			case NS_E_DRM_MIGRATION_TARGET_NOT_ONLINE:
				throw new COMStatus("NS_E_DRM_MIGRATION_TARGET_NOT_ONLINE: A problem has occurred in the Digital Rights Management component during license migration. Contact Microsoft product support.", message, args);
			case NS_E_DRM_INVALID_MIGRATION_IMAGE:
				throw new COMStatus("NS_E_DRM_INVALID_MIGRATION_IMAGE: A problem has occurred in the Digital Rights Management component during license migration. Contact Microsoft product support.", message, args);
			case NS_E_DRM_MIGRATION_TARGET_STATES_CORRUPTED:
				throw new COMStatus("NS_E_DRM_MIGRATION_TARGET_STATES_CORRUPTED: A problem has occurred in the Digital Rights Management component during license migration. Contact Microsoft product support.", message, args);
			case NS_E_DRM_MIGRATION_IMPORTER_NOT_AVAILABLE:
				throw new COMStatus("NS_E_DRM_MIGRATION_IMPORTER_NOT_AVAILABLE: A problem has occurred in the Digital Rights Management component during license migration. Contact Microsoft product support.", message, args);
			case NS_DRM_E_MIGRATION_UPGRADE_WITH_DIFF_SID:
				throw new COMStatus("NS_DRM_E_MIGRATION_UPGRADE_WITH_DIFF_SID: A problem has occurred in the Digital Rights Management component during license migration. Contact Microsoft product support.", message, args);
			case NS_DRM_E_MIGRATION_SOURCE_MACHINE_IN_USE:
				throw new COMStatus("NS_DRM_E_MIGRATION_SOURCE_MACHINE_IN_USE: The Digital Rights Management component is in use during license migration. Contact Microsoft product support.", message, args);
			case NS_DRM_E_MIGRATION_TARGET_MACHINE_LESS_THAN_LH:
				throw new COMStatus("NS_DRM_E_MIGRATION_TARGET_MACHINE_LESS_THAN_LH: Licenses are being migrated to a machine running XP or downlevel OS. This operation can only be performed on Windows Vista or a later OS. Contact Microsoft product support.", message, args);
			case NS_DRM_E_MIGRATION_IMAGE_ALREADY_EXISTS:
				throw new COMStatus("NS_DRM_E_MIGRATION_IMAGE_ALREADY_EXISTS: Migration Image already exists. Contact Microsoft product support.", message, args);
			case NS_E_DRM_HARDWAREID_MISMATCH:
				throw new COMStatus("NS_E_DRM_HARDWAREID_MISMATCH: The requested action cannot be performed because a hardware configuration change has been detected by the Windows Media Digital Rights Management (DRM) components on your computer.", message, args);
			case NS_E_INVALID_DRMV2CLT_STUBLIB:
				throw new COMStatus("NS_E_INVALID_DRMV2CLT_STUBLIB: The wrong stublib has been linked to an application or DLL using drmv2clt.dll.", message, args);
			case NS_E_DRM_MIGRATION_INVALID_LEGACYV2_DATA:
				throw new COMStatus("NS_E_DRM_MIGRATION_INVALID_LEGACYV2_DATA: The legacy V2 data being imported is invalid.", message, args);
			case NS_E_DRM_MIGRATION_LICENSE_ALREADY_EXISTS:
				throw new COMStatus("NS_E_DRM_MIGRATION_LICENSE_ALREADY_EXISTS: The license being imported already exists.", message, args);
			case NS_E_DRM_MIGRATION_INVALID_LEGACYV2_SST_PASSWORD:
				throw new COMStatus("NS_E_DRM_MIGRATION_INVALID_LEGACYV2_SST_PASSWORD: The password of the Legacy V2 SST entry being imported is incorrect.", message, args);
			case NS_E_DRM_MIGRATION_NOT_SUPPORTED:
				throw new COMStatus("NS_E_DRM_MIGRATION_NOT_SUPPORTED: Migration is not supported by the plugin.", message, args);
			case NS_E_DRM_UNABLE_TO_CREATE_MIGRATION_IMPORTER_OBJECT:
				throw new COMStatus("NS_E_DRM_UNABLE_TO_CREATE_MIGRATION_IMPORTER_OBJECT: A migration importer cannot be created for this media file. Reinstall the application.", message, args);
			case NS_E_DRM_CHECKPOINT_MISMATCH:
				throw new COMStatus("NS_E_DRM_CHECKPOINT_MISMATCH: The requested action cannot be performed because a problem occurred with the Windows Media Digital Rights Management (DRM) components on your computer.", message, args);
			case NS_E_DRM_CHECKPOINT_CORRUPT:
				throw new COMStatus("NS_E_DRM_CHECKPOINT_CORRUPT: The requested action cannot be performed because a problem occurred with the Windows Media Digital Rights Management (DRM) components on your computer.", message, args);
			case NS_E_REG_FLUSH_FAILURE:
				throw new COMStatus("NS_E_REG_FLUSH_FAILURE: The requested action cannot be performed because a problem occurred with the Windows Media Digital Rights Management (DRM) components on your computer.", message, args);
			case NS_E_HDS_KEY_MISMATCH:
				throw new COMStatus("NS_E_HDS_KEY_MISMATCH: The requested action cannot be performed because a problem occurred with the Windows Media Digital Rights Management (DRM) components on your computer.", message, args);
			case NS_E_DRM_MIGRATION_OPERATION_CANCELLED:
				throw new COMStatus("NS_E_DRM_MIGRATION_OPERATION_CANCELLED: Migration was canceled by the user.", message, args);
			case NS_E_DRM_MIGRATION_OBJECT_IN_USE:
				throw new COMStatus("NS_E_DRM_MIGRATION_OBJECT_IN_USE: Migration object is already in use and cannot be called until the current operation completes.", message, args);
			case NS_E_DRM_MALFORMED_CONTENT_HEADER:
				throw new COMStatus("NS_E_DRM_MALFORMED_CONTENT_HEADER: The content header does not comply with DRM requirements and cannot be used.", message, args);
			case NS_E_DRM_LICENSE_EXPIRED:
				throw new COMStatus("NS_E_DRM_LICENSE_EXPIRED: The license for this file has expired and is no longer valid. Contact your content provider for further assistance.", message, args);
			case NS_E_DRM_LICENSE_NOTENABLED:
				throw new COMStatus("NS_E_DRM_LICENSE_NOTENABLED: The license for this file is not valid yet, but will be at a future date.", message, args);
			case NS_E_DRM_LICENSE_APPSECLOW:
				throw new COMStatus("NS_E_DRM_LICENSE_APPSECLOW: The license for this file requires a higher level of security than the player you are currently using has. Try using a different player or download a newer version of your current player.", message, args);
			case NS_E_DRM_STORE_NEEDINDI:
				throw new COMStatus("NS_E_DRM_STORE_NEEDINDI: The license cannot be stored as it requires security upgrade of Digital Rights Management component.", message, args);
			case NS_E_DRM_STORE_NOTALLOWED:
				throw new COMStatus("NS_E_DRM_STORE_NOTALLOWED: Your machine does not meet the requirements for storing the license.", message, args);
			case NS_E_DRM_LICENSE_APP_NOTALLOWED:
				throw new COMStatus("NS_E_DRM_LICENSE_APP_NOTALLOWED: The license for this file requires an upgraded version of your player or a different player.", message, args);
			case NS_E_DRM_LICENSE_CERT_EXPIRED:
				throw new COMStatus("NS_E_DRM_LICENSE_CERT_EXPIRED: The license server's certificate expired. Make sure your system clock is set correctly. Contact your content provider for further assistance.", message, args);
			case NS_E_DRM_LICENSE_SECLOW:
				throw new COMStatus("NS_E_DRM_LICENSE_SECLOW: The license for this file requires a higher level of security than the player you are currently using has. Try using a different player or download a newer version of your current player.", message, args);
			case NS_E_DRM_LICENSE_CONTENT_REVOKED:
				throw new COMStatus("NS_E_DRM_LICENSE_CONTENT_REVOKED: The content owner for the license you just acquired is no longer supporting their content. Contact the content owner for a newer version of the content.", message, args);
			case NS_E_DRM_DEVICE_NOT_REGISTERED:
				throw new COMStatus("NS_E_DRM_DEVICE_NOT_REGISTERED: The content owner for the license you just acquired requires your device to register to the current machine.", message, args);
			case NS_E_DRM_LICENSE_NOSAP:
				throw new COMStatus("NS_E_DRM_LICENSE_NOSAP: The license for this file requires a feature that is not supported in your current player or operating system. You can try with newer version of your current player or contact your content provider for further assistance.", message, args);
			case NS_E_DRM_LICENSE_NOSVP:
				throw new COMStatus("NS_E_DRM_LICENSE_NOSVP: The license for this file requires a feature that is not supported in your current player or operating system. You can try with newer version of your current player or contact your content provider for further assistance.", message, args);
			case NS_E_DRM_LICENSE_NOWDM:
				throw new COMStatus("NS_E_DRM_LICENSE_NOWDM: The license for this file requires Windows Driver Model (WDM) audio drivers. Contact your sound card manufacturer for further assistance.", message, args);
			case NS_E_DRM_LICENSE_NOTRUSTEDCODEC:
				throw new COMStatus("NS_E_DRM_LICENSE_NOTRUSTEDCODEC: The license for this file requires a higher level of security than the player you are currently using has. Try using a different player or download a newer version of your current player.", message, args);
			case NS_E_DRM_SOURCEID_NOT_SUPPORTED:
				throw new COMStatus("NS_E_DRM_SOURCEID_NOT_SUPPORTED: The license for this file is not supported by your current player. You can try with newer version of your current player or contact your content provider for further assistance.", message, args);
			case NS_E_DRM_NEEDS_UPGRADE_TEMPFILE:
				throw new COMStatus("NS_E_DRM_NEEDS_UPGRADE_TEMPFILE: An updated version of your media player is required to play the selected content.", message, args);
			case NS_E_DRM_NEED_UPGRADE_PD:
				throw new COMStatus("NS_E_DRM_NEED_UPGRADE_PD: A new version of the Digital Rights Management component is required. Contact product support for this application to get the latest version.", message, args);
			case NS_E_DRM_SIGNATURE_FAILURE:
				throw new COMStatus("NS_E_DRM_SIGNATURE_FAILURE: Failed to either create or verify the content header.", message, args);
			case NS_E_DRM_LICENSE_SERVER_INFO_MISSING:
				throw new COMStatus("NS_E_DRM_LICENSE_SERVER_INFO_MISSING: Could not read the necessary information from the system registry.", message, args);
			case NS_E_DRM_BUSY:
				throw new COMStatus("NS_E_DRM_BUSY: The DRM subsystem is currently locked by another application or user. Try again later.", message, args);
			case NS_E_DRM_PD_TOO_MANY_DEVICES:
				throw new COMStatus("NS_E_DRM_PD_TOO_MANY_DEVICES: There are too many target devices registered on the portable media.", message, args);
			case NS_E_DRM_INDIV_FRAUD:
				throw new COMStatus("NS_E_DRM_INDIV_FRAUD: The security upgrade cannot be completed because the allowed number of daily upgrades has been exceeded. Try again tomorrow.", message, args);
			case NS_E_DRM_INDIV_NO_CABS:
				throw new COMStatus("NS_E_DRM_INDIV_NO_CABS: The security upgrade cannot be completed because the server is unable to perform the operation. Try again later.", message, args);
			case NS_E_DRM_INDIV_SERVICE_UNAVAILABLE:
				throw new COMStatus("NS_E_DRM_INDIV_SERVICE_UNAVAILABLE: The security upgrade cannot be performed because the server is not available. Try again later.", message, args);
			case NS_E_DRM_RESTORE_SERVICE_UNAVAILABLE:
				throw new COMStatus("NS_E_DRM_RESTORE_SERVICE_UNAVAILABLE: Windows Media Player cannot restore your licenses because the server is not available. Try again later.", message, args);
			case NS_E_DRM_CLIENT_CODE_EXPIRED:
				throw new COMStatus("NS_E_DRM_CLIENT_CODE_EXPIRED: Windows Media Player cannot play the protected file. Verify that your computer's date is set correctly. If it is correct, on the Help menu, click Check for Player Updates to install the latest version of the Player.", message, args);
			case NS_E_DRM_NO_UPLINK_LICENSE:
				throw new COMStatus("NS_E_DRM_NO_UPLINK_LICENSE: The chained license cannot be created because the referenced uplink license does not exist.", message, args);
			case NS_E_DRM_INVALID_KID:
				throw new COMStatus("NS_E_DRM_INVALID_KID: The specified KID is invalid.", message, args);
			case NS_E_DRM_LICENSE_INITIALIZATION_ERROR:
				throw new COMStatus("NS_E_DRM_LICENSE_INITIALIZATION_ERROR: License initialization did not work. Contact Microsoft product support.", message, args);
			case NS_E_DRM_CHAIN_TOO_LONG:
				throw new COMStatus("NS_E_DRM_CHAIN_TOO_LONG: The uplink license of a chained license cannot itself be a chained license.", message, args);
			case NS_E_DRM_UNSUPPORTED_ALGORITHM:
				throw new COMStatus("NS_E_DRM_UNSUPPORTED_ALGORITHM: The specified encryption algorithm is unsupported.", message, args);
			case NS_E_DRM_LICENSE_DELETION_ERROR:
				throw new COMStatus("NS_E_DRM_LICENSE_DELETION_ERROR: License deletion did not work. Contact Microsoft product support.", message, args);
			case NS_E_DRM_INVALID_CERTIFICATE:
				throw new COMStatus("NS_E_DRM_INVALID_CERTIFICATE: The client's certificate is corrupted or the signature cannot be verified.", message, args);
			case NS_E_DRM_CERTIFICATE_REVOKED:
				throw new COMStatus("NS_E_DRM_CERTIFICATE_REVOKED: The client's certificate has been revoked.", message, args);
			case NS_E_DRM_LICENSE_UNAVAILABLE:
				throw new COMStatus("NS_E_DRM_LICENSE_UNAVAILABLE: There is no license available for the requested action.", message, args);
			case NS_E_DRM_DEVICE_LIMIT_REACHED:
				throw new COMStatus("NS_E_DRM_DEVICE_LIMIT_REACHED: The maximum number of devices in use has been reached. Unable to open additional devices.", message, args);
			case NS_E_DRM_UNABLE_TO_VERIFY_PROXIMITY:
				throw new COMStatus("NS_E_DRM_UNABLE_TO_VERIFY_PROXIMITY: The proximity detection procedure could not confirm that the receiver is near the transmitter in the network.", message, args);
			case NS_E_DRM_MUST_REGISTER:
				throw new COMStatus("NS_E_DRM_MUST_REGISTER: The client must be registered before executing the intended operation.", message, args);
			case NS_E_DRM_MUST_APPROVE:
				throw new COMStatus("NS_E_DRM_MUST_APPROVE: The client must be approved before executing the intended operation.", message, args);
			case NS_E_DRM_MUST_REVALIDATE:
				throw new COMStatus("NS_E_DRM_MUST_REVALIDATE: The client must be revalidated before executing the intended operation.", message, args);
			case NS_E_DRM_INVALID_PROXIMITY_RESPONSE:
				throw new COMStatus("NS_E_DRM_INVALID_PROXIMITY_RESPONSE: The response to the proximity detection challenge is invalid.", message, args);
			case NS_E_DRM_INVALID_SESSION:
				throw new COMStatus("NS_E_DRM_INVALID_SESSION: The requested session is invalid.", message, args);
			case NS_E_DRM_DEVICE_NOT_OPEN:
				throw new COMStatus("NS_E_DRM_DEVICE_NOT_OPEN: The device must be opened before it can be used to receive content.", message, args);
			case NS_E_DRM_DEVICE_ALREADY_REGISTERED:
				throw new COMStatus("NS_E_DRM_DEVICE_ALREADY_REGISTERED: Device registration failed because the device is already registered.", message, args);
			case NS_E_DRM_UNSUPPORTED_PROTOCOL_VERSION:
				throw new COMStatus("NS_E_DRM_UNSUPPORTED_PROTOCOL_VERSION: Unsupported WMDRM-ND protocol version.", message, args);
			case NS_E_DRM_UNSUPPORTED_ACTION:
				throw new COMStatus("NS_E_DRM_UNSUPPORTED_ACTION: The requested action is not supported.", message, args);
			case NS_E_DRM_CERTIFICATE_SECURITY_LEVEL_INADEQUATE:
				throw new COMStatus("NS_E_DRM_CERTIFICATE_SECURITY_LEVEL_INADEQUATE: The certificate does not have an adequate security level for the requested action.", message, args);
			case NS_E_DRM_UNABLE_TO_OPEN_PORT:
				throw new COMStatus("NS_E_DRM_UNABLE_TO_OPEN_PORT: Unable to open the specified port for receiving Proximity messages.", message, args);
			case NS_E_DRM_BAD_REQUEST:
				throw new COMStatus("NS_E_DRM_BAD_REQUEST: The message format is invalid.", message, args);
			case NS_E_DRM_INVALID_CRL:
				throw new COMStatus("NS_E_DRM_INVALID_CRL: The Certificate Revocation List is invalid or corrupted.", message, args);
			case NS_E_DRM_ATTRIBUTE_TOO_LONG:
				throw new COMStatus("NS_E_DRM_ATTRIBUTE_TOO_LONG: The length of the attribute name or value is too long.", message, args);
			case NS_E_DRM_EXPIRED_LICENSEBLOB:
				throw new COMStatus("NS_E_DRM_EXPIRED_LICENSEBLOB: The license blob passed in the cardea request is expired.", message, args);
			case NS_E_DRM_INVALID_LICENSEBLOB:
				throw new COMStatus("NS_E_DRM_INVALID_LICENSEBLOB: The license blob passed in the cardea request is invalid. Contact Microsoft product support.", message, args);
			case NS_E_DRM_INCLUSION_LIST_REQUIRED:
				throw new COMStatus("NS_E_DRM_INCLUSION_LIST_REQUIRED: The requested operation cannot be performed because the license does not contain an inclusion list.", message, args);
			case NS_E_DRM_DRMV2CLT_REVOKED:
				throw new COMStatus("NS_E_DRM_DRMV2CLT_REVOKED: A problem has occurred in the Digital Rights Management component. Contact Microsoft product support.", message, args);
			case NS_E_DRM_RIV_TOO_SMALL:
				throw new COMStatus("NS_E_DRM_RIV_TOO_SMALL: A problem has occurred in the Digital Rights Management component. Contact Microsoft product support.", message, args);
			case NS_E_OUTPUT_PROTECTION_LEVEL_UNSUPPORTED:
				throw new COMStatus("NS_E_OUTPUT_PROTECTION_LEVEL_UNSUPPORTED: Windows Media Player does not support the level of output protection required by the content.", message, args);
			case NS_E_COMPRESSED_DIGITAL_VIDEO_PROTECTION_LEVEL_UNSUPPORTED:
				throw new COMStatus("NS_E_COMPRESSED_DIGITAL_VIDEO_PROTECTION_LEVEL_UNSUPPORTED: Windows Media Player does not support the level of protection required for compressed digital video.", message, args);
			case NS_E_UNCOMPRESSED_DIGITAL_VIDEO_PROTECTION_LEVEL_UNSUPPORTED:
				throw new COMStatus("NS_E_UNCOMPRESSED_DIGITAL_VIDEO_PROTECTION_LEVEL_UNSUPPORTED: Windows Media Player does not support the level of protection required for uncompressed digital video.", message, args);
			case NS_E_ANALOG_VIDEO_PROTECTION_LEVEL_UNSUPPORTED:
				throw new COMStatus("NS_E_ANALOG_VIDEO_PROTECTION_LEVEL_UNSUPPORTED: Windows Media Player does not support the level of protection required for analog video.", message, args);
			case NS_E_COMPRESSED_DIGITAL_AUDIO_PROTECTION_LEVEL_UNSUPPORTED:
				throw new COMStatus("NS_E_COMPRESSED_DIGITAL_AUDIO_PROTECTION_LEVEL_UNSUPPORTED: Windows Media Player does not support the level of protection required for compressed digital audio.", message, args);
			case NS_E_UNCOMPRESSED_DIGITAL_AUDIO_PROTECTION_LEVEL_UNSUPPORTED:
				throw new COMStatus("NS_E_UNCOMPRESSED_DIGITAL_AUDIO_PROTECTION_LEVEL_UNSUPPORTED: Windows Media Player does not support the level of protection required for uncompressed digital audio.", message, args);
			case NS_E_OUTPUT_PROTECTION_SCHEME_UNSUPPORTED:
				throw new COMStatus("NS_E_OUTPUT_PROTECTION_SCHEME_UNSUPPORTED: Windows Media Player does not support the scheme of output protection required by the content.", message, args);
			case NS_E_REBOOT_RECOMMENDED:
				throw new COMStatus("NS_E_REBOOT_RECOMMENDED: Installation was not successful and some file cleanup is not complete. For best results, restart your computer.", message, args);
			case NS_E_REBOOT_REQUIRED:
				throw new COMStatus("NS_E_REBOOT_REQUIRED: Installation was not successful. To continue, you must restart your computer.", message, args);
			case NS_E_SETUP_INCOMPLETE:
				throw new COMStatus("NS_E_SETUP_INCOMPLETE: Installation was not successful.", message, args);
			case NS_E_SETUP_DRM_MIGRATION_FAILED:
				throw new COMStatus("NS_E_SETUP_DRM_MIGRATION_FAILED: Setup cannot migrate the Windows Media Digital Rights Management (DRM) components.", message, args);
			case NS_E_SETUP_IGNORABLE_FAILURE:
				throw new COMStatus("NS_E_SETUP_IGNORABLE_FAILURE: Some skin or playlist components cannot be installed.", message, args);
			case NS_E_SETUP_DRM_MIGRATION_FAILED_AND_IGNORABLE_FAILURE:
				throw new COMStatus("NS_E_SETUP_DRM_MIGRATION_FAILED_AND_IGNORABLE_FAILURE: Setup cannot migrate the Windows Media Digital Rights Management (DRM) components. In addition, some skin or playlist components cannot be installed.", message, args);
			case NS_E_SETUP_BLOCKED:
				throw new COMStatus("NS_E_SETUP_BLOCKED: Installation is blocked because your computer does not meet one or more of the setup requirements.", message, args);
			case NS_E_UNKNOWN_PROTOCOL:
				throw new COMStatus("NS_E_UNKNOWN_PROTOCOL: The specified protocol is not supported.", message, args);
			case NS_E_REDIRECT_TO_PROXY:
				throw new COMStatus("NS_E_REDIRECT_TO_PROXY: The client is redirected to a proxy server.", message, args);
			case NS_E_INTERNAL_SERVER_ERROR:
				throw new COMStatus("NS_E_INTERNAL_SERVER_ERROR: The server encountered an unexpected condition which prevented it from fulfilling the request.", message, args);
			case NS_E_BAD_REQUEST:
				throw new COMStatus("NS_E_BAD_REQUEST: The request could not be understood by the server.", message, args);
			case NS_E_ERROR_FROM_PROXY:
				throw new COMStatus("NS_E_ERROR_FROM_PROXY: The proxy experienced an error while attempting to contact the media server.", message, args);
			case NS_E_PROXY_TIMEOUT:
				throw new COMStatus("NS_E_PROXY_TIMEOUT: The proxy did not receive a timely response while attempting to contact the media server.", message, args);
			case NS_E_SERVER_UNAVAILABLE:
				throw new COMStatus("NS_E_SERVER_UNAVAILABLE: The server is currently unable to handle the request due to a temporary overloading or maintenance of the server.", message, args);
			case NS_E_REFUSED_BY_SERVER:
				throw new COMStatus("NS_E_REFUSED_BY_SERVER: The server is refusing to fulfill the requested operation.", message, args);
			case NS_E_INCOMPATIBLE_SERVER:
				throw new COMStatus("NS_E_INCOMPATIBLE_SERVER: The server is not a compatible streaming media server.", message, args);
			case NS_E_MULTICAST_DISABLED:
				throw new COMStatus("NS_E_MULTICAST_DISABLED: The content cannot be streamed because the Multicast protocol has been disabled.", message, args);
			case NS_E_INVALID_REDIRECT:
				throw new COMStatus("NS_E_INVALID_REDIRECT: The server redirected the player to an invalid location.", message, args);
			case NS_E_ALL_PROTOCOLS_DISABLED:
				throw new COMStatus("NS_E_ALL_PROTOCOLS_DISABLED: The content cannot be streamed because all protocols have been disabled.", message, args);
			case NS_E_MSBD_NO_LONGER_SUPPORTED:
				throw new COMStatus("NS_E_MSBD_NO_LONGER_SUPPORTED: The MSBD protocol is no longer supported. Please use HTTP to connect to the Windows Media stream.", message, args);
			case NS_E_PROXY_NOT_FOUND:
				throw new COMStatus("NS_E_PROXY_NOT_FOUND: The proxy server could not be located. Please check your proxy server configuration.", message, args);
			case NS_E_CANNOT_CONNECT_TO_PROXY:
				throw new COMStatus("NS_E_CANNOT_CONNECT_TO_PROXY: Unable to establish a connection to the proxy server. Please check your proxy server configuration.", message, args);
			case NS_E_SERVER_DNS_TIMEOUT:
				throw new COMStatus("NS_E_SERVER_DNS_TIMEOUT: Unable to locate the media server. The operation timed out.", message, args);
			case NS_E_PROXY_DNS_TIMEOUT:
				throw new COMStatus("NS_E_PROXY_DNS_TIMEOUT: Unable to locate the proxy server. The operation timed out.", message, args);
			case NS_E_CLOSED_ON_SUSPEND:
				throw new COMStatus("NS_E_CLOSED_ON_SUSPEND: Media closed because Windows was shut down.", message, args);
			case NS_E_CANNOT_READ_PLAYLIST_FROM_MEDIASERVER:
				throw new COMStatus("NS_E_CANNOT_READ_PLAYLIST_FROM_MEDIASERVER: Unable to read the contents of a playlist file from a media server.", message, args);
			case NS_E_SESSION_NOT_FOUND:
				throw new COMStatus("NS_E_SESSION_NOT_FOUND: Session not found.", message, args);
			case NS_E_REQUIRE_STREAMING_CLIENT:
				throw new COMStatus("NS_E_REQUIRE_STREAMING_CLIENT: Content requires a streaming media client.", message, args);
			case NS_E_PLAYLIST_ENTRY_HAS_CHANGED:
				throw new COMStatus("NS_E_PLAYLIST_ENTRY_HAS_CHANGED: A command applies to a previous playlist entry.", message, args);
			case NS_E_PROXY_ACCESSDENIED:
				throw new COMStatus("NS_E_PROXY_ACCESSDENIED: The proxy server is denying access. The username and/or password might be incorrect.", message, args);
			case NS_E_PROXY_SOURCE_ACCESSDENIED:
				throw new COMStatus("NS_E_PROXY_SOURCE_ACCESSDENIED: The proxy could not provide valid authentication credentials to the media server.", message, args);
			case NS_E_NETWORK_SINK_WRITE:
				throw new COMStatus("NS_E_NETWORK_SINK_WRITE: The network sink failed to write data to the network.", message, args);
			case NS_E_FIREWALL:
				throw new COMStatus("NS_E_FIREWALL: Packets are not being received from the server. The packets might be blocked by a filtering device, such as a network firewall.", message, args);
			case NS_E_MMS_NOT_SUPPORTED:
				throw new COMStatus("NS_E_MMS_NOT_SUPPORTED: The MMS protocol is not supported. Please use HTTP or RTSP to connect to the Windows Media stream.", message, args);
			case NS_E_SERVER_ACCESSDENIED:
				throw new COMStatus("NS_E_SERVER_ACCESSDENIED: The Windows Media server is denying access. The username and/or password might be incorrect.", message, args);
			case NS_E_RESOURCE_GONE:
				throw new COMStatus("NS_E_RESOURCE_GONE: The Publishing Point or file on the Windows Media Server is no longer available.", message, args);
			case NS_E_NO_EXISTING_PACKETIZER:
				throw new COMStatus("NS_E_NO_EXISTING_PACKETIZER: There is no existing packetizer plugin for a stream.", message, args);
			case NS_E_BAD_SYNTAX_IN_SERVER_RESPONSE:
				throw new COMStatus("NS_E_BAD_SYNTAX_IN_SERVER_RESPONSE: The response from the media server could not be understood. This might be caused by an incompatible proxy server or media server.", message, args);
			case NS_E_RESET_SOCKET_CONNECTION:
				throw new COMStatus("NS_E_RESET_SOCKET_CONNECTION: The Windows Media Server reset the network connection.", message, args);
			case NS_E_TOO_MANY_HOPS:
				throw new COMStatus("NS_E_TOO_MANY_HOPS: The request could not reach the media server (too many hops).", message, args);
			case NS_E_TOO_MUCH_DATA_FROM_SERVER:
				throw new COMStatus("NS_E_TOO_MUCH_DATA_FROM_SERVER: The server is sending too much data. The connection has been terminated.", message, args);
			case NS_E_CONNECT_TIMEOUT:
				throw new COMStatus("NS_E_CONNECT_TIMEOUT: It was not possible to establish a connection to the media server in a timely manner. The media server may be down for maintenance, or it may be necessary to use a proxy server to access this media server.", message, args);
			case NS_E_PROXY_CONNECT_TIMEOUT:
				throw new COMStatus("NS_E_PROXY_CONNECT_TIMEOUT: It was not possible to establish a connection to the proxy server in a timely manner. Please check your proxy server configuration.", message, args);
			case NS_E_SESSION_INVALID:
				throw new COMStatus("NS_E_SESSION_INVALID: Session not found.", message, args);
			case NS_E_PACKETSINK_UNKNOWN_FEC_STREAM:
				throw new COMStatus("NS_E_PACKETSINK_UNKNOWN_FEC_STREAM: Unknown packet sink stream.", message, args);
			case NS_E_PUSH_CANNOTCONNECT:
				throw new COMStatus("NS_E_PUSH_CANNOTCONNECT: Unable to establish a connection to the server. Ensure Windows Media Services is started and the HTTP Server control protocol is properly enabled.", message, args);
			case NS_E_INCOMPATIBLE_PUSH_SERVER:
				throw new COMStatus("NS_E_INCOMPATIBLE_PUSH_SERVER: The Server service that received the HTTP push request is not a compatible version of Windows Media Services (WMS). This error may indicate the push request was received by IIS instead of WMS. Ensure WMS is started and has the HTTP Server control protocol properly enabled and try again.", message, args);
			case NS_E_END_OF_PLAYLIST:
				throw new COMStatus("NS_E_END_OF_PLAYLIST: The playlist has reached its end.", message, args);
			case NS_E_USE_FILE_SOURCE:
				throw new COMStatus("NS_E_USE_FILE_SOURCE: Use file source.", message, args);
			case NS_E_PROPERTY_NOT_FOUND:
				throw new COMStatus("NS_E_PROPERTY_NOT_FOUND: The property was not found.", message, args);
			case NS_E_PROPERTY_READ_ONLY:
				throw new COMStatus("NS_E_PROPERTY_READ_ONLY: The property is read only.", message, args);
			case NS_E_TABLE_KEY_NOT_FOUND:
				throw new COMStatus("NS_E_TABLE_KEY_NOT_FOUND: The table key was not found.", message, args);
			case NS_E_INVALID_QUERY_OPERATOR:
				throw new COMStatus("NS_E_INVALID_QUERY_OPERATOR: Invalid query operator.", message, args);
			case NS_E_INVALID_QUERY_PROPERTY:
				throw new COMStatus("NS_E_INVALID_QUERY_PROPERTY: Invalid query property.", message, args);
			case NS_E_PROPERTY_NOT_SUPPORTED:
				throw new COMStatus("NS_E_PROPERTY_NOT_SUPPORTED: The property is not supported.", message, args);
			case NS_E_SCHEMA_CLASSIFY_FAILURE:
				throw new COMStatus("NS_E_SCHEMA_CLASSIFY_FAILURE: Schema classification failure.", message, args);
			case NS_E_METADATA_FORMAT_NOT_SUPPORTED:
				throw new COMStatus("NS_E_METADATA_FORMAT_NOT_SUPPORTED: The metadata format is not supported.", message, args);
			case NS_E_METADATA_NO_EDITING_CAPABILITY:
				throw new COMStatus("NS_E_METADATA_NO_EDITING_CAPABILITY: Cannot edit the metadata.", message, args);
			case NS_E_METADATA_CANNOT_SET_LOCALE:
				throw new COMStatus("NS_E_METADATA_CANNOT_SET_LOCALE: Cannot set the locale id.", message, args);
			case NS_E_METADATA_LANGUAGE_NOT_SUPORTED:
				throw new COMStatus("NS_E_METADATA_LANGUAGE_NOT_SUPORTED: The language is not supported in the format.", message, args);
			case NS_E_METADATA_NO_RFC1766_NAME_FOR_LOCALE:
				throw new COMStatus("NS_E_METADATA_NO_RFC1766_NAME_FOR_LOCALE: There is no RFC1766 name translation for the supplied locale id.", message, args);
			case NS_E_METADATA_NOT_AVAILABLE:
				throw new COMStatus("NS_E_METADATA_NOT_AVAILABLE: The metadata (or metadata item) is not available.", message, args);
			case NS_E_METADATA_CACHE_DATA_NOT_AVAILABLE:
				throw new COMStatus("NS_E_METADATA_CACHE_DATA_NOT_AVAILABLE: The cached metadata (or metadata item) is not available.", message, args);
			case NS_E_METADATA_INVALID_DOCUMENT_TYPE:
				throw new COMStatus("NS_E_METADATA_INVALID_DOCUMENT_TYPE: The metadata document is invalid.", message, args);
			case NS_E_METADATA_IDENTIFIER_NOT_AVAILABLE:
				throw new COMStatus("NS_E_METADATA_IDENTIFIER_NOT_AVAILABLE: The metadata content identifier is not available.", message, args);
			case NS_E_METADATA_CANNOT_RETRIEVE_FROM_OFFLINE_CACHE:
				throw new COMStatus("NS_E_METADATA_CANNOT_RETRIEVE_FROM_OFFLINE_CACHE: Cannot retrieve metadata from the offline metadata cache.", message, args);
			case ERROR_MONITOR_INVALID_DESCRIPTOR_CHECKSUM:
				throw new COMStatus("ERROR_MONITOR_INVALID_DESCRIPTOR_CHECKSUM: Checksum of the obtained monitor descriptor is invalid.", message, args);
			case ERROR_MONITOR_INVALID_STANDARD_TIMING_BLOCK:
				throw new COMStatus("ERROR_MONITOR_INVALID_STANDARD_TIMING_BLOCK: Monitor descriptor contains an invalid standard timing block.", message, args);
			case ERROR_MONITOR_WMI_DATABLOCK_REGISTRATION_FAILED:
				throw new COMStatus("ERROR_MONITOR_WMI_DATABLOCK_REGISTRATION_FAILED: Windows Management Instrumentation (WMI) data block registration failed for one of the MSMonitorClass WMI subclasses.", message, args);
			case ERROR_MONITOR_INVALID_SERIAL_NUMBER_MONDSC_BLOCK:
				throw new COMStatus("ERROR_MONITOR_INVALID_SERIAL_NUMBER_MONDSC_BLOCK: Provided monitor descriptor block is either corrupted or does not contain the monitor's detailed serial number.", message, args);
			case ERROR_MONITOR_INVALID_USER_FRIENDLY_MONDSC_BLOCK:
				throw new COMStatus("ERROR_MONITOR_INVALID_USER_FRIENDLY_MONDSC_BLOCK: Provided monitor descriptor block is either corrupted or does not contain the monitor's user-friendly name.", message, args);
			case ERROR_MONITOR_NO_MORE_DESCRIPTOR_DATA:
				throw new COMStatus("ERROR_MONITOR_NO_MORE_DESCRIPTOR_DATA: There is no monitor descriptor data at the specified (offset, size) region.", message, args);
			case ERROR_MONITOR_INVALID_DETAILED_TIMING_BLOCK:
				throw new COMStatus("ERROR_MONITOR_INVALID_DETAILED_TIMING_BLOCK: Monitor descriptor contains an invalid detailed timing block.", message, args);
			case ERROR_GRAPHICS_NOT_EXCLUSIVE_MODE_OWNER:
				throw new COMStatus("ERROR_GRAPHICS_NOT_EXCLUSIVE_MODE_OWNER: Exclusive mode ownership is needed to create unmanaged primary allocation.", message, args);
			case ERROR_GRAPHICS_INSUFFICIENT_DMA_BUFFER:
				throw new COMStatus("ERROR_GRAPHICS_INSUFFICIENT_DMA_BUFFER: The driver needs more direct memory access (DMA) buffer space to complete the requested operation.", message, args);
			case ERROR_GRAPHICS_INVALID_DISPLAY_ADAPTER:
				throw new COMStatus("ERROR_GRAPHICS_INVALID_DISPLAY_ADAPTER: Specified display adapter handle is invalid.", message, args);
			case ERROR_GRAPHICS_ADAPTER_WAS_RESET:
				throw new COMStatus("ERROR_GRAPHICS_ADAPTER_WAS_RESET: Specified display adapter and all of its state has been reset.", message, args);
			case ERROR_GRAPHICS_INVALID_DRIVER_MODEL:
				throw new COMStatus("ERROR_GRAPHICS_INVALID_DRIVER_MODEL: The driver stack does not match the expected driver model.", message, args);
			case ERROR_GRAPHICS_PRESENT_MODE_CHANGED:
				throw new COMStatus("ERROR_GRAPHICS_PRESENT_MODE_CHANGED: Present happened but ended up into the changed desktop mode.", message, args);
			case ERROR_GRAPHICS_PRESENT_OCCLUDED:
				throw new COMStatus("ERROR_GRAPHICS_PRESENT_OCCLUDED: Nothing to present due to desktop occlusion.", message, args);
			case ERROR_GRAPHICS_PRESENT_DENIED:
				throw new COMStatus("ERROR_GRAPHICS_PRESENT_DENIED: Not able to present due to denial of desktop access.", message, args);
			case ERROR_GRAPHICS_CANNOTCOLORCONVERT:
				throw new COMStatus("ERROR_GRAPHICS_CANNOTCOLORCONVERT: Not able to present with color conversion.", message, args);
			case ERROR_GRAPHICS_NO_VIDEO_MEMORY:
				throw new COMStatus("ERROR_GRAPHICS_NO_VIDEO_MEMORY: Not enough video memory available to complete the operation.", message, args);
			case ERROR_GRAPHICS_CANT_LOCK_MEMORY:
				throw new COMStatus("ERROR_GRAPHICS_CANT_LOCK_MEMORY: Could not probe and lock the underlying memory of an allocation.", message, args);
			case ERROR_GRAPHICS_ALLOCATION_BUSY:
				throw new COMStatus("ERROR_GRAPHICS_ALLOCATION_BUSY: The allocation is currently busy.", message, args);
			case ERROR_GRAPHICS_TOO_MANY_REFERENCES:
				throw new COMStatus("ERROR_GRAPHICS_TOO_MANY_REFERENCES: An object being referenced has reach the maximum reference count already and cannot be referenced further.", message, args);
			case ERROR_GRAPHICS_TRY_AGAIN_LATER:
				throw new COMStatus("ERROR_GRAPHICS_TRY_AGAIN_LATER: A problem could not be solved due to some currently existing condition. The problem should be tried again later.", message, args);
			case ERROR_GRAPHICS_TRY_AGAIN_NOW:
				throw new COMStatus("ERROR_GRAPHICS_TRY_AGAIN_NOW: A problem could not be solved due to some currently existing condition. The problem should be tried again immediately.", message, args);
			case ERROR_GRAPHICS_ALLOCATION_INVALID:
				throw new COMStatus("ERROR_GRAPHICS_ALLOCATION_INVALID: The allocation is invalid.", message, args);
			case ERROR_GRAPHICS_UNSWIZZLING_APERTURE_UNAVAILABLE:
				throw new COMStatus("ERROR_GRAPHICS_UNSWIZZLING_APERTURE_UNAVAILABLE: No more unswizzling apertures are currently available.", message, args);
			case ERROR_GRAPHICS_UNSWIZZLING_APERTURE_UNSUPPORTED:
				throw new COMStatus("ERROR_GRAPHICS_UNSWIZZLING_APERTURE_UNSUPPORTED: The current allocation cannot be unswizzled by an aperture.", message, args);
			case ERROR_GRAPHICS_CANT_EVICT_PINNED_ALLOCATION:
				throw new COMStatus("ERROR_GRAPHICS_CANT_EVICT_PINNED_ALLOCATION: The request failed because a pinned allocation cannot be evicted.", message, args);
			case ERROR_GRAPHICS_INVALID_ALLOCATION_USAGE:
				throw new COMStatus("ERROR_GRAPHICS_INVALID_ALLOCATION_USAGE: The allocation cannot be used from its current segment location for the specified operation.", message, args);
			case ERROR_GRAPHICS_CANT_RENDER_LOCKED_ALLOCATION:
				throw new COMStatus("ERROR_GRAPHICS_CANT_RENDER_LOCKED_ALLOCATION: A locked allocation cannot be used in the current command buffer.", message, args);
			case ERROR_GRAPHICS_ALLOCATION_CLOSED:
				throw new COMStatus("ERROR_GRAPHICS_ALLOCATION_CLOSED: The allocation being referenced has been closed permanently.", message, args);
			case ERROR_GRAPHICS_INVALID_ALLOCATION_INSTANCE:
				throw new COMStatus("ERROR_GRAPHICS_INVALID_ALLOCATION_INSTANCE: An invalid allocation instance is being referenced.", message, args);
			case ERROR_GRAPHICS_INVALID_ALLOCATION_HANDLE:
				throw new COMStatus("ERROR_GRAPHICS_INVALID_ALLOCATION_HANDLE: An invalid allocation handle is being referenced.", message, args);
			case ERROR_GRAPHICS_WRONG_ALLOCATION_DEVICE:
				throw new COMStatus("ERROR_GRAPHICS_WRONG_ALLOCATION_DEVICE: The allocation being referenced does not belong to the current device.", message, args);
			case ERROR_GRAPHICS_ALLOCATION_CONTENT_LOST:
				throw new COMStatus("ERROR_GRAPHICS_ALLOCATION_CONTENT_LOST: The specified allocation lost its content.", message, args);
			case ERROR_GRAPHICS_GPU_EXCEPTION_ON_DEVICE:
				throw new COMStatus("ERROR_GRAPHICS_GPU_EXCEPTION_ON_DEVICE: Graphics processing unit (GPU) exception is detected on the given device. The device is not able to be scheduled.", message, args);
			case ERROR_GRAPHICS_INVALID_VIDPN_TOPOLOGY:
				throw new COMStatus("ERROR_GRAPHICS_INVALID_VIDPN_TOPOLOGY: Specified video present network (VidPN) topology is invalid.", message, args);
			case ERROR_GRAPHICS_VIDPN_TOPOLOGY_NOT_SUPPORTED:
				throw new COMStatus("ERROR_GRAPHICS_VIDPN_TOPOLOGY_NOT_SUPPORTED: Specified VidPN topology is valid but is not supported by this model of the display adapter.", message, args);
			case ERROR_GRAPHICS_VIDPN_TOPOLOGY_CURRENTLY_NOT_SUPPORTED:
				throw new COMStatus("ERROR_GRAPHICS_VIDPN_TOPOLOGY_CURRENTLY_NOT_SUPPORTED: Specified VidPN topology is valid but is not supported by the display adapter at this time, due to current allocation of its resources.", message, args);
			case ERROR_GRAPHICS_INVALID_VIDPN:
				throw new COMStatus("ERROR_GRAPHICS_INVALID_VIDPN: Specified VidPN handle is invalid.", message, args);
			case ERROR_GRAPHICS_INVALID_VIDEO_PRESENT_SOURCE:
				throw new COMStatus("ERROR_GRAPHICS_INVALID_VIDEO_PRESENT_SOURCE: Specified video present source is invalid.", message, args);
			case ERROR_GRAPHICS_INVALID_VIDEO_PRESENT_TARGET:
				throw new COMStatus("ERROR_GRAPHICS_INVALID_VIDEO_PRESENT_TARGET: Specified video present target is invalid.", message, args);
			case ERROR_GRAPHICS_VIDPN_MODALITY_NOT_SUPPORTED:
				throw new COMStatus("ERROR_GRAPHICS_VIDPN_MODALITY_NOT_SUPPORTED: Specified VidPN modality is not supported (for example, at least two of the pinned modes are not cofunctional).", message, args);
			case ERROR_GRAPHICS_INVALID_VIDPN_SOURCEMODESET:
				throw new COMStatus("ERROR_GRAPHICS_INVALID_VIDPN_SOURCEMODESET: Specified VidPN source mode set is invalid.", message, args);
			case ERROR_GRAPHICS_INVALID_VIDPN_TARGETMODESET:
				throw new COMStatus("ERROR_GRAPHICS_INVALID_VIDPN_TARGETMODESET: Specified VidPN target mode set is invalid.", message, args);
			case ERROR_GRAPHICS_INVALID_FREQUENCY:
				throw new COMStatus("ERROR_GRAPHICS_INVALID_FREQUENCY: Specified video signal frequency is invalid.", message, args);
			case ERROR_GRAPHICS_INVALID_ACTIVE_REGION:
				throw new COMStatus("ERROR_GRAPHICS_INVALID_ACTIVE_REGION: Specified video signal active region is invalid.", message, args);
			case ERROR_GRAPHICS_INVALID_TOTAL_REGION:
				throw new COMStatus("ERROR_GRAPHICS_INVALID_TOTAL_REGION: Specified video signal total region is invalid.", message, args);
			case ERROR_GRAPHICS_INVALID_VIDEO_PRESENT_SOURCE_MODE:
				throw new COMStatus("ERROR_GRAPHICS_INVALID_VIDEO_PRESENT_SOURCE_MODE: Specified video present source mode is invalid.", message, args);
			case ERROR_GRAPHICS_INVALID_VIDEO_PRESENT_TARGET_MODE:
				throw new COMStatus("ERROR_GRAPHICS_INVALID_VIDEO_PRESENT_TARGET_MODE: Specified video present target mode is invalid.", message, args);
			case ERROR_GRAPHICS_PINNED_MODE_MUST_REMAIN_IN_SET:
				throw new COMStatus("ERROR_GRAPHICS_PINNED_MODE_MUST_REMAIN_IN_SET: Pinned mode must remain in the set on VidPN's cofunctional modality enumeration.", message, args);
			case ERROR_GRAPHICS_PATH_ALREADY_IN_TOPOLOGY:
				throw new COMStatus("ERROR_GRAPHICS_PATH_ALREADY_IN_TOPOLOGY: Specified video present path is already in the VidPN topology.", message, args);
			case ERROR_GRAPHICS_MODE_ALREADY_IN_MODESET:
				throw new COMStatus("ERROR_GRAPHICS_MODE_ALREADY_IN_MODESET: Specified mode is already in the mode set.", message, args);
			case ERROR_GRAPHICS_INVALID_VIDEOPRESENTSOURCESET:
				throw new COMStatus("ERROR_GRAPHICS_INVALID_VIDEOPRESENTSOURCESET: Specified video present source set is invalid.", message, args);
			case ERROR_GRAPHICS_INVALID_VIDEOPRESENTTARGETSET:
				throw new COMStatus("ERROR_GRAPHICS_INVALID_VIDEOPRESENTTARGETSET: Specified video present target set is invalid.", message, args);
			case ERROR_GRAPHICS_SOURCE_ALREADY_IN_SET:
				throw new COMStatus("ERROR_GRAPHICS_SOURCE_ALREADY_IN_SET: Specified video present source is already in the video present source set.", message, args);
			case ERROR_GRAPHICS_TARGET_ALREADY_IN_SET:
				throw new COMStatus("ERROR_GRAPHICS_TARGET_ALREADY_IN_SET: Specified video present target is already in the video present target set.", message, args);
			case ERROR_GRAPHICS_INVALID_VIDPN_PRESENT_PATH:
				throw new COMStatus("ERROR_GRAPHICS_INVALID_VIDPN_PRESENT_PATH: Specified VidPN present path is invalid.", message, args);
			case ERROR_GRAPHICS_NO_RECOMMENDED_VIDPN_TOPOLOGY:
				throw new COMStatus("ERROR_GRAPHICS_NO_RECOMMENDED_VIDPN_TOPOLOGY: Miniport has no recommendation for augmentation of the specified VidPN topology.", message, args);
			case ERROR_GRAPHICS_INVALID_MONITOR_FREQUENCYRANGESET:
				throw new COMStatus("ERROR_GRAPHICS_INVALID_MONITOR_FREQUENCYRANGESET: Specified monitor frequency range set is invalid.", message, args);
			case ERROR_GRAPHICS_INVALID_MONITOR_FREQUENCYRANGE:
				throw new COMStatus("ERROR_GRAPHICS_INVALID_MONITOR_FREQUENCYRANGE: Specified monitor frequency range is invalid.", message, args);
			case ERROR_GRAPHICS_FREQUENCYRANGE_NOT_IN_SET:
				throw new COMStatus("ERROR_GRAPHICS_FREQUENCYRANGE_NOT_IN_SET: Specified frequency range is not in the specified monitor frequency range set.", message, args);
			case ERROR_GRAPHICS_FREQUENCYRANGE_ALREADY_IN_SET:
				throw new COMStatus("ERROR_GRAPHICS_FREQUENCYRANGE_ALREADY_IN_SET: Specified frequency range is already in the specified monitor frequency range set.", message, args);
			case ERROR_GRAPHICS_STALE_MODESET:
				throw new COMStatus("ERROR_GRAPHICS_STALE_MODESET: Specified mode set is stale. Reacquire the new mode set.", message, args);
			case ERROR_GRAPHICS_INVALID_MONITOR_SOURCEMODESET:
				throw new COMStatus("ERROR_GRAPHICS_INVALID_MONITOR_SOURCEMODESET: Specified monitor source mode set is invalid.", message, args);
			case ERROR_GRAPHICS_INVALID_MONITOR_SOURCE_MODE:
				throw new COMStatus("ERROR_GRAPHICS_INVALID_MONITOR_SOURCE_MODE: Specified monitor source mode is invalid.", message, args);
			case ERROR_GRAPHICS_NO_RECOMMENDED_FUNCTIONAL_VIDPN:
				throw new COMStatus("ERROR_GRAPHICS_NO_RECOMMENDED_FUNCTIONAL_VIDPN: Miniport does not have any recommendation regarding the request to provide a functional VidPN given the current display adapter configuration.", message, args);
			case ERROR_GRAPHICS_MODE_ID_MUST_BE_UNIQUE:
				throw new COMStatus("ERROR_GRAPHICS_MODE_ID_MUST_BE_UNIQUE: ID of the specified mode is already used by another mode in the set.", message, args);
			case ERROR_GRAPHICS_EMPTY_ADAPTER_MONITOR_MODE_SUPPORT_INTERSECTION:
				throw new COMStatus("ERROR_GRAPHICS_EMPTY_ADAPTER_MONITOR_MODE_SUPPORT_INTERSECTION: System failed to determine a mode that is supported by both the display adapter and the monitor connected to it.", message, args);
			case ERROR_GRAPHICS_VIDEO_PRESENT_TARGETS_LESS_THAN_SOURCES:
				throw new COMStatus("ERROR_GRAPHICS_VIDEO_PRESENT_TARGETS_LESS_THAN_SOURCES: Number of video present targets must be greater than or equal to the number of video present sources.", message, args);
			case ERROR_GRAPHICS_PATH_NOT_IN_TOPOLOGY:
				throw new COMStatus("ERROR_GRAPHICS_PATH_NOT_IN_TOPOLOGY: Specified present path is not in the VidPN topology.", message, args);
			case ERROR_GRAPHICS_ADAPTER_MUST_HAVE_AT_LEAST_ONE_SOURCE:
				throw new COMStatus("ERROR_GRAPHICS_ADAPTER_MUST_HAVE_AT_LEAST_ONE_SOURCE: Display adapter must have at least one video present source.", message, args);
			case ERROR_GRAPHICS_ADAPTER_MUST_HAVE_AT_LEAST_ONE_TARGET:
				throw new COMStatus("ERROR_GRAPHICS_ADAPTER_MUST_HAVE_AT_LEAST_ONE_TARGET: Display adapter must have at least one video present target.", message, args);
			case ERROR_GRAPHICS_INVALID_MONITORDESCRIPTORSET:
				throw new COMStatus("ERROR_GRAPHICS_INVALID_MONITORDESCRIPTORSET: Specified monitor descriptor set is invalid.", message, args);
			case ERROR_GRAPHICS_INVALID_MONITORDESCRIPTOR:
				throw new COMStatus("ERROR_GRAPHICS_INVALID_MONITORDESCRIPTOR: Specified monitor descriptor is invalid.", message, args);
			case ERROR_GRAPHICS_MONITORDESCRIPTOR_NOT_IN_SET:
				throw new COMStatus("ERROR_GRAPHICS_MONITORDESCRIPTOR_NOT_IN_SET: Specified descriptor is not in the specified monitor descriptor set.", message, args);
			case ERROR_GRAPHICS_MONITORDESCRIPTOR_ALREADY_IN_SET:
				throw new COMStatus("ERROR_GRAPHICS_MONITORDESCRIPTOR_ALREADY_IN_SET: Specified descriptor is already in the specified monitor descriptor set.", message, args);
			case ERROR_GRAPHICS_MONITORDESCRIPTOR_ID_MUST_BE_UNIQUE:
				throw new COMStatus("ERROR_GRAPHICS_MONITORDESCRIPTOR_ID_MUST_BE_UNIQUE: ID of the specified monitor descriptor is already used by another descriptor in the set.", message, args);
			case ERROR_GRAPHICS_INVALID_VIDPN_TARGET_SUBSET_TYPE:
				throw new COMStatus("ERROR_GRAPHICS_INVALID_VIDPN_TARGET_SUBSET_TYPE: Specified video present target subset type is invalid.", message, args);
			case ERROR_GRAPHICS_RESOURCES_NOT_RELATED:
				throw new COMStatus("ERROR_GRAPHICS_RESOURCES_NOT_RELATED: Two or more of the specified resources are not related to each other, as defined by the interface semantics.", message, args);
			case ERROR_GRAPHICS_SOURCE_ID_MUST_BE_UNIQUE:
				throw new COMStatus("ERROR_GRAPHICS_SOURCE_ID_MUST_BE_UNIQUE: ID of the specified video present source is already used by another source in the set.", message, args);
			case ERROR_GRAPHICS_TARGET_ID_MUST_BE_UNIQUE:
				throw new COMStatus("ERROR_GRAPHICS_TARGET_ID_MUST_BE_UNIQUE: ID of the specified video present target is already used by another target in the set.", message, args);
			case ERROR_GRAPHICS_NO_AVAILABLE_VIDPN_TARGET:
				throw new COMStatus("ERROR_GRAPHICS_NO_AVAILABLE_VIDPN_TARGET: Specified VidPN source cannot be used because there is no available VidPN target to connect it to.", message, args);
			case ERROR_GRAPHICS_MONITOR_COULD_NOT_BE_ASSOCIATED_WITH_ADAPTER:
				throw new COMStatus("ERROR_GRAPHICS_MONITOR_COULD_NOT_BE_ASSOCIATED_WITH_ADAPTER: Newly arrived monitor could not be associated with a display adapter.", message, args);
			case ERROR_GRAPHICS_NO_VIDPNMGR:
				throw new COMStatus("ERROR_GRAPHICS_NO_VIDPNMGR: Display adapter in question does not have an associated VidPN manager.", message, args);
			case ERROR_GRAPHICS_NO_ACTIVE_VIDPN:
				throw new COMStatus("ERROR_GRAPHICS_NO_ACTIVE_VIDPN: VidPN manager of the display adapter in question does not have an active VidPN.", message, args);
			case ERROR_GRAPHICS_STALE_VIDPN_TOPOLOGY:
				throw new COMStatus("ERROR_GRAPHICS_STALE_VIDPN_TOPOLOGY: Specified VidPN topology is stale. Re-acquire the new topology.", message, args);
			case ERROR_GRAPHICS_MONITOR_NOT_CONNECTED:
				throw new COMStatus("ERROR_GRAPHICS_MONITOR_NOT_CONNECTED: There is no monitor connected on the specified video present target.", message, args);
			case ERROR_GRAPHICS_SOURCE_NOT_IN_TOPOLOGY:
				throw new COMStatus("ERROR_GRAPHICS_SOURCE_NOT_IN_TOPOLOGY: Specified source is not part of the specified VidPN topology.", message, args);
			case ERROR_GRAPHICS_INVALID_PRIMARYSURFACE_SIZE:
				throw new COMStatus("ERROR_GRAPHICS_INVALID_PRIMARYSURFACE_SIZE: Specified primary surface size is invalid.", message, args);
			case ERROR_GRAPHICS_INVALID_VISIBLEREGION_SIZE:
				throw new COMStatus("ERROR_GRAPHICS_INVALID_VISIBLEREGION_SIZE: Specified visible region size is invalid.", message, args);
			case ERROR_GRAPHICS_INVALID_STRIDE:
				throw new COMStatus("ERROR_GRAPHICS_INVALID_STRIDE: Specified stride is invalid.", message, args);
			case ERROR_GRAPHICS_INVALID_PIXELFORMAT:
				throw new COMStatus("ERROR_GRAPHICS_INVALID_PIXELFORMAT: Specified pixel format is invalid.", message, args);
			case ERROR_GRAPHICS_INVALID_COLORBASIS:
				throw new COMStatus("ERROR_GRAPHICS_INVALID_COLORBASIS: Specified color basis is invalid.", message, args);
			case ERROR_GRAPHICS_INVALID_PIXELVALUEACCESSMODE:
				throw new COMStatus("ERROR_GRAPHICS_INVALID_PIXELVALUEACCESSMODE: Specified pixel value access mode is invalid.", message, args);
			case ERROR_GRAPHICS_TARGET_NOT_IN_TOPOLOGY:
				throw new COMStatus("ERROR_GRAPHICS_TARGET_NOT_IN_TOPOLOGY: Specified target is not part of the specified VidPN topology.", message, args);
			case ERROR_GRAPHICS_NO_DISPLAY_MODE_MANAGEMENT_SUPPORT:
				throw new COMStatus("ERROR_GRAPHICS_NO_DISPLAY_MODE_MANAGEMENT_SUPPORT: Failed to acquire display mode management interface.", message, args);
			case ERROR_GRAPHICS_VIDPN_SOURCE_IN_USE:
				throw new COMStatus("ERROR_GRAPHICS_VIDPN_SOURCE_IN_USE: Specified VidPN source is already owned by a display mode manager (DMM) client and cannot be used until that client releases it.", message, args);
			case ERROR_GRAPHICS_CANT_ACCESS_ACTIVE_VIDPN:
				throw new COMStatus("ERROR_GRAPHICS_CANT_ACCESS_ACTIVE_VIDPN: Specified VidPN is active and cannot be accessed.", message, args);
			case ERROR_GRAPHICS_INVALID_PATH_IMPORTANCE_ORDINAL:
				throw new COMStatus("ERROR_GRAPHICS_INVALID_PATH_IMPORTANCE_ORDINAL: Specified VidPN present path importance ordinal is invalid.", message, args);
			case ERROR_GRAPHICS_INVALID_PATH_CONTENT_GEOMETRY_TRANSFORMATION:
				throw new COMStatus("ERROR_GRAPHICS_INVALID_PATH_CONTENT_GEOMETRY_TRANSFORMATION: Specified VidPN present path content geometry transformation is invalid.", message, args);
			case ERROR_GRAPHICS_PATH_CONTENT_GEOMETRY_TRANSFORMATION_NOT_SUPPORTED:
				throw new COMStatus("ERROR_GRAPHICS_PATH_CONTENT_GEOMETRY_TRANSFORMATION_NOT_SUPPORTED: Specified content geometry transformation is not supported on the respective VidPN present path.", message, args);
			case ERROR_GRAPHICS_INVALID_GAMMA_RAMP:
				throw new COMStatus("ERROR_GRAPHICS_INVALID_GAMMA_RAMP: Specified gamma ramp is invalid.", message, args);
			case ERROR_GRAPHICS_GAMMA_RAMP_NOT_SUPPORTED:
				throw new COMStatus("ERROR_GRAPHICS_GAMMA_RAMP_NOT_SUPPORTED: Specified gamma ramp is not supported on the respective VidPN present path.", message, args);
			case ERROR_GRAPHICS_MULTISAMPLING_NOT_SUPPORTED:
				throw new COMStatus("ERROR_GRAPHICS_MULTISAMPLING_NOT_SUPPORTED: Multisampling is not supported on the respective VidPN present path.", message, args);
			case ERROR_GRAPHICS_MODE_NOT_IN_MODESET:
				throw new COMStatus("ERROR_GRAPHICS_MODE_NOT_IN_MODESET: Specified mode is not in the specified mode set.", message, args);
			case ERROR_GRAPHICS_INVALID_VIDPN_TOPOLOGY_RECOMMENDATION_REASON:
				throw new COMStatus("ERROR_GRAPHICS_INVALID_VIDPN_TOPOLOGY_RECOMMENDATION_REASON: Specified VidPN topology recommendation reason is invalid.", message, args);
			case ERROR_GRAPHICS_INVALID_PATH_CONTENT_TYPE:
				throw new COMStatus("ERROR_GRAPHICS_INVALID_PATH_CONTENT_TYPE: Specified VidPN present path content type is invalid.", message, args);
			case ERROR_GRAPHICS_INVALID_COPYPROTECTION_TYPE:
				throw new COMStatus("ERROR_GRAPHICS_INVALID_COPYPROTECTION_TYPE: Specified VidPN present path copy protection type is invalid.", message, args);
			case ERROR_GRAPHICS_UNASSIGNED_MODESET_ALREADY_EXISTS:
				throw new COMStatus("ERROR_GRAPHICS_UNASSIGNED_MODESET_ALREADY_EXISTS: No more than one unassigned mode set can exist at any given time for a given VidPN source or target.", message, args);
			case ERROR_GRAPHICS_INVALID_SCANLINE_ORDERING:
				throw new COMStatus("ERROR_GRAPHICS_INVALID_SCANLINE_ORDERING: The specified scan line ordering type is invalid.", message, args);
			case ERROR_GRAPHICS_TOPOLOGY_CHANGES_NOT_ALLOWED:
				throw new COMStatus("ERROR_GRAPHICS_TOPOLOGY_CHANGES_NOT_ALLOWED: Topology changes are not allowed for the specified VidPN.", message, args);
			case ERROR_GRAPHICS_NO_AVAILABLE_IMPORTANCE_ORDINALS:
				throw new COMStatus("ERROR_GRAPHICS_NO_AVAILABLE_IMPORTANCE_ORDINALS: All available importance ordinals are already used in the specified topology.", message, args);
			case ERROR_GRAPHICS_INCOMPATIBLE_PRIVATE_FORMAT:
				throw new COMStatus("ERROR_GRAPHICS_INCOMPATIBLE_PRIVATE_FORMAT: Specified primary surface has a different private format attribute than the current primary surface.", message, args);
			case ERROR_GRAPHICS_INVALID_MODE_PRUNING_ALGORITHM:
				throw new COMStatus("ERROR_GRAPHICS_INVALID_MODE_PRUNING_ALGORITHM: Specified mode pruning algorithm is invalid.", message, args);
			case ERROR_GRAPHICS_SPECIFIED_CHILD_ALREADY_CONNECTED:
				throw new COMStatus("ERROR_GRAPHICS_SPECIFIED_CHILD_ALREADY_CONNECTED: Specified display adapter child device already has an external device connected to it.", message, args);
			case ERROR_GRAPHICS_CHILD_DESCRIPTOR_NOT_SUPPORTED:
				throw new COMStatus("ERROR_GRAPHICS_CHILD_DESCRIPTOR_NOT_SUPPORTED: The display adapter child device does not support reporting a descriptor.", message, args);
			case ERROR_GRAPHICS_NOT_A_LINKED_ADAPTER:
				throw new COMStatus("ERROR_GRAPHICS_NOT_A_LINKED_ADAPTER: The display adapter is not linked to any other adapters.", message, args);
			case ERROR_GRAPHICS_LEADLINK_NOT_ENUMERATED:
				throw new COMStatus("ERROR_GRAPHICS_LEADLINK_NOT_ENUMERATED: Lead adapter in a linked configuration was not enumerated yet.", message, args);
			case ERROR_GRAPHICS_CHAINLINKS_NOT_ENUMERATED:
				throw new COMStatus("ERROR_GRAPHICS_CHAINLINKS_NOT_ENUMERATED: Some chain adapters in a linked configuration were not enumerated yet.", message, args);
			case ERROR_GRAPHICS_ADAPTER_CHAIN_NOT_READY:
				throw new COMStatus("ERROR_GRAPHICS_ADAPTER_CHAIN_NOT_READY: The chain of linked adapters is not ready to start because of an unknown failure.", message, args);
			case ERROR_GRAPHICS_CHAINLINKS_NOT_STARTED:
				throw new COMStatus("ERROR_GRAPHICS_CHAINLINKS_NOT_STARTED: An attempt was made to start a lead link display adapter when the chain links were not started yet.", message, args);
			case ERROR_GRAPHICS_CHAINLINKS_NOT_POWERED_ON:
				throw new COMStatus("ERROR_GRAPHICS_CHAINLINKS_NOT_POWERED_ON: An attempt was made to turn on a lead link display adapter when the chain links were turned off.", message, args);
			case ERROR_GRAPHICS_INCONSISTENT_DEVICE_LINK_STATE:
				throw new COMStatus("ERROR_GRAPHICS_INCONSISTENT_DEVICE_LINK_STATE: The adapter link was found to be in an inconsistent state. Not all adapters are in an expected PNP or power state.", message, args);
			case ERROR_GRAPHICS_NOT_POST_DEVICE_DRIVER:
				throw new COMStatus("ERROR_GRAPHICS_NOT_POST_DEVICE_DRIVER: The driver trying to start is not the same as the driver for the posted display adapter.", message, args);
			case ERROR_GRAPHICS_OPM_NOT_SUPPORTED:
				throw new COMStatus("ERROR_GRAPHICS_OPM_NOT_SUPPORTED: The driver does not support Output Protection Manager (OPM).", message, args);
			case ERROR_GRAPHICS_COPP_NOT_SUPPORTED:
				throw new COMStatus("ERROR_GRAPHICS_COPP_NOT_SUPPORTED: The driver does not support Certified Output Protection Protocol (COPP).", message, args);
			case ERROR_GRAPHICS_UAB_NOT_SUPPORTED:
				throw new COMStatus("ERROR_GRAPHICS_UAB_NOT_SUPPORTED: The driver does not support a user-accessible bus (UAB).", message, args);
			case ERROR_GRAPHICS_OPM_INVALID_ENCRYPTED_PARAMETERS:
				throw new COMStatus("ERROR_GRAPHICS_OPM_INVALID_ENCRYPTED_PARAMETERS: The specified encrypted parameters are invalid.", message, args);
			case ERROR_GRAPHICS_OPM_PARAMETER_ARRAY_TOO_SMALL:
				throw new COMStatus("ERROR_GRAPHICS_OPM_PARAMETER_ARRAY_TOO_SMALL: An array passed to a function cannot hold all of the data that the function wants to put in it.", message, args);
			case ERROR_GRAPHICS_OPM_NO_VIDEO_OUTPUTS_EXIST:
				throw new COMStatus("ERROR_GRAPHICS_OPM_NO_VIDEO_OUTPUTS_EXIST: The GDI display device passed to this function does not have any active video outputs.", message, args);
			case ERROR_GRAPHICS_PVP_NO_DISPLAY_DEVICE_CORRESPONDS_TO_NAME:
				throw new COMStatus("ERROR_GRAPHICS_PVP_NO_DISPLAY_DEVICE_CORRESPONDS_TO_NAME: The protected video path (PVP) cannot find an actual GDI display device that corresponds to the passed-in GDI display device name.", message, args);
			case ERROR_GRAPHICS_PVP_DISPLAY_DEVICE_NOT_ATTACHED_TO_DESKTOP:
				throw new COMStatus("ERROR_GRAPHICS_PVP_DISPLAY_DEVICE_NOT_ATTACHED_TO_DESKTOP: This function failed because the GDI display device passed to it was not attached to the Windows desktop.", message, args);
			case ERROR_GRAPHICS_PVP_MIRRORING_DEVICES_NOT_SUPPORTED:
				throw new COMStatus("ERROR_GRAPHICS_PVP_MIRRORING_DEVICES_NOT_SUPPORTED: The PVP does not support mirroring display devices because they do not have video outputs.", message, args);
			case ERROR_GRAPHICS_OPM_INVALID_POINTER:
				throw new COMStatus("ERROR_GRAPHICS_OPM_INVALID_POINTER: The function failed because an invalid pointer parameter was passed to it. A pointer parameter is invalid if it is null, it points to an invalid address, it points to a kernel mode address, or it is not correctly aligned.", message, args);
			case ERROR_GRAPHICS_OPM_INTERNAL_ERROR:
				throw new COMStatus("ERROR_GRAPHICS_OPM_INTERNAL_ERROR: An internal error caused this operation to fail.", message, args);
			case ERROR_GRAPHICS_OPM_INVALID_HANDLE:
				throw new COMStatus("ERROR_GRAPHICS_OPM_INVALID_HANDLE: The function failed because the caller passed in an invalid OPM user mode handle.", message, args);
			case ERROR_GRAPHICS_PVP_NO_MONITORS_CORRESPOND_TO_DISPLAY_DEVICE:
				throw new COMStatus("ERROR_GRAPHICS_PVP_NO_MONITORS_CORRESPOND_TO_DISPLAY_DEVICE: This function failed because the GDI device passed to it did not have any monitors associated with it.", message, args);
			case ERROR_GRAPHICS_PVP_INVALID_CERTIFICATE_LENGTH:
				throw new COMStatus("ERROR_GRAPHICS_PVP_INVALID_CERTIFICATE_LENGTH: A certificate could not be returned because the certificate buffer passed to the function was too small.", message, args);
			case ERROR_GRAPHICS_OPM_SPANNING_MODE_ENABLED:
				throw new COMStatus("ERROR_GRAPHICS_OPM_SPANNING_MODE_ENABLED: A video output could not be created because the frame buffer is in spanning mode.", message, args);
			case ERROR_GRAPHICS_OPM_THEATER_MODE_ENABLED:
				throw new COMStatus("ERROR_GRAPHICS_OPM_THEATER_MODE_ENABLED: A video output could not be created because the frame buffer is in theater mode.", message, args);
			case ERROR_GRAPHICS_PVP_HFS_FAILED:
				throw new COMStatus("ERROR_GRAPHICS_PVP_HFS_FAILED: The function call failed because the display adapter's hardware functionality scan failed to validate the graphics hardware.", message, args);
			case ERROR_GRAPHICS_OPM_INVALID_SRM:
				throw new COMStatus("ERROR_GRAPHICS_OPM_INVALID_SRM: The High-Bandwidth Digital Content Protection (HDCP) System Renewability Message (SRM) passed to this function did not comply with section 5 of the HDCP 1.1 specification.", message, args);
			case ERROR_GRAPHICS_OPM_OUTPUT_DOES_NOT_SUPPORT_HDCP:
				throw new COMStatus("ERROR_GRAPHICS_OPM_OUTPUT_DOES_NOT_SUPPORT_HDCP: The video output cannot enable the HDCP system because it does not support it.", message, args);
			case ERROR_GRAPHICS_OPM_OUTPUT_DOES_NOT_SUPPORT_ACP:
				throw new COMStatus("ERROR_GRAPHICS_OPM_OUTPUT_DOES_NOT_SUPPORT_ACP: The video output cannot enable analog copy protection because it does not support it.", message, args);
			case ERROR_GRAPHICS_OPM_OUTPUT_DOES_NOT_SUPPORT_CGMSA:
				throw new COMStatus("ERROR_GRAPHICS_OPM_OUTPUT_DOES_NOT_SUPPORT_CGMSA: The video output cannot enable the Content Generation Management System Analog (CGMS-A) protection technology because it does not support it.", message, args);
			case ERROR_GRAPHICS_OPM_HDCP_SRM_NEVER_SET:
				throw new COMStatus("ERROR_GRAPHICS_OPM_HDCP_SRM_NEVER_SET: IOPMVideoOutput's GetInformation() method cannot return the version of the SRM being used because the application never successfully passed an SRM to the video output.", message, args);
			case ERROR_GRAPHICS_OPM_RESOLUTION_TOO_HIGH:
				throw new COMStatus("ERROR_GRAPHICS_OPM_RESOLUTION_TOO_HIGH: IOPMVideoOutput's Configure() method cannot enable the specified output protection technology because the output's screen resolution is too high.", message, args);
			case ERROR_GRAPHICS_OPM_ALL_HDCP_HARDWARE_ALREADY_IN_USE:
				throw new COMStatus("ERROR_GRAPHICS_OPM_ALL_HDCP_HARDWARE_ALREADY_IN_USE: IOPMVideoOutput's Configure() method cannot enable HDCP because the display adapter's HDCP hardware is already being used by other physical outputs.", message, args);
			case ERROR_GRAPHICS_OPM_VIDEO_OUTPUT_NO_LONGER_EXISTS:
				throw new COMStatus("ERROR_GRAPHICS_OPM_VIDEO_OUTPUT_NO_LONGER_EXISTS: The operating system asynchronously destroyed this OPM video output because the operating system's state changed. This error typically occurs because the monitor physical device object (PDO) associated with this video output was removed, the monitor PDO associated with this video output was stopped, the video output's session became a nonconsole session or the video output's desktop became an inactive desktop.", message, args);
			case ERROR_GRAPHICS_OPM_SESSION_TYPE_CHANGE_IN_PROGRESS:
				throw new COMStatus("ERROR_GRAPHICS_OPM_SESSION_TYPE_CHANGE_IN_PROGRESS: IOPMVideoOutput's methods cannot be called when a session is changing its type. There are currently three types of sessions: console, disconnected and remote (remote desktop protocol [RDP] or Independent Computing Architecture [ICA]).", message, args);
			case ERROR_GRAPHICS_I2C_NOT_SUPPORTED:
				throw new COMStatus("ERROR_GRAPHICS_I2C_NOT_SUPPORTED: The monitor connected to the specified video output does not have an I2C bus.", message, args);
			case ERROR_GRAPHICS_I2C_DEVICE_DOES_NOT_EXIST:
				throw new COMStatus("ERROR_GRAPHICS_I2C_DEVICE_DOES_NOT_EXIST: No device on the I2C bus has the specified address.", message, args);
			case ERROR_GRAPHICS_I2C_ERROR_TRANSMITTING_DATA:
				throw new COMStatus("ERROR_GRAPHICS_I2C_ERROR_TRANSMITTING_DATA: An error occurred while transmitting data to the device on the I2C bus.", message, args);
			case ERROR_GRAPHICS_I2C_ERROR_RECEIVING_DATA:
				throw new COMStatus("ERROR_GRAPHICS_I2C_ERROR_RECEIVING_DATA: An error occurred while receiving data from the device on the I2C bus.", message, args);
			case ERROR_GRAPHICS_DDCCI_VCP_NOT_SUPPORTED:
				throw new COMStatus("ERROR_GRAPHICS_DDCCI_VCP_NOT_SUPPORTED: The monitor does not support the specified Virtual Control Panel (VCP) code.", message, args);
			case ERROR_GRAPHICS_DDCCI_INVALID_DATA:
				throw new COMStatus("ERROR_GRAPHICS_DDCCI_INVALID_DATA: The data received from the monitor is invalid.", message, args);
			case ERROR_GRAPHICS_DDCCI_MONITOR_RETURNED_INVALID_TIMING_STATUS_BYTE:
				throw new COMStatus("ERROR_GRAPHICS_DDCCI_MONITOR_RETURNED_INVALID_TIMING_STATUS_BYTE: A function call failed because a monitor returned an invalid Timing Status byte when the operating system used the Display Data Channel Command Interface (DDC/CI) Get Timing Report and Timing Message command to get a timing report from a monitor.", message, args);
			case ERROR_GRAPHICS_MCA_INVALID_CAPABILITIES_STRING:
				throw new COMStatus("ERROR_GRAPHICS_MCA_INVALID_CAPABILITIES_STRING: The monitor returned a DDC/CI capabilities string that did not comply with the ACCESS.bus 3.0, DDC/CI 1.1 or MCCS 2 Revision 1 specification.", message, args);
			case ERROR_GRAPHICS_MCA_INTERNAL_ERROR:
				throw new COMStatus("ERROR_GRAPHICS_MCA_INTERNAL_ERROR: An internal Monitor Configuration API error occurred.", message, args);
			case ERROR_GRAPHICS_DDCCI_INVALID_MESSAGE_COMMAND:
				throw new COMStatus("ERROR_GRAPHICS_DDCCI_INVALID_MESSAGE_COMMAND: An operation failed because a DDC/CI message had an invalid value in its command field.", message, args);
			case ERROR_GRAPHICS_DDCCI_INVALID_MESSAGE_LENGTH:
				throw new COMStatus("ERROR_GRAPHICS_DDCCI_INVALID_MESSAGE_LENGTH: This error occurred because a DDC/CI message length field contained an invalid value.", message, args);
			case ERROR_GRAPHICS_DDCCI_INVALID_MESSAGE_CHECKSUM:
				throw new COMStatus("ERROR_GRAPHICS_DDCCI_INVALID_MESSAGE_CHECKSUM: This error occurred because the value in a DDC/CI message checksum field did not match the message's computed checksum value. This error implies that the data was corrupted while it was being transmitted from a monitor to a computer.", message, args);
			case ERROR_GRAPHICS_PMEA_INVALID_MONITOR:
				throw new COMStatus("ERROR_GRAPHICS_PMEA_INVALID_MONITOR: The HMONITOR no longer exists, is not attached to the desktop, or corresponds to a mirroring device.", message, args);
			case ERROR_GRAPHICS_PMEA_INVALID_D3D_DEVICE:
				throw new COMStatus("ERROR_GRAPHICS_PMEA_INVALID_D3D_DEVICE: The Direct3D (D3D) device's GDI display device no longer exists, is not attached to the desktop, or is a mirroring display device.", message, args);
			case ERROR_GRAPHICS_DDCCI_CURRENT_CURRENT_VALUE_GREATER_THAN_MAXIMUM_VALUE:
				throw new COMStatus("ERROR_GRAPHICS_DDCCI_CURRENT_CURRENT_VALUE_GREATER_THAN_MAXIMUM_VALUE: A continuous VCP code's current value is greater than its maximum value. This error code indicates that a monitor returned an invalid value.", message, args);
			case ERROR_GRAPHICS_MCA_INVALID_VCP_VERSION:
				throw new COMStatus("ERROR_GRAPHICS_MCA_INVALID_VCP_VERSION: The monitor's VCP Version (0xDF) VCP code returned an invalid version value.", message, args);
			case ERROR_GRAPHICS_MCA_MONITOR_VIOLATES_MCCS_SPECIFICATION:
				throw new COMStatus("ERROR_GRAPHICS_MCA_MONITOR_VIOLATES_MCCS_SPECIFICATION: The monitor does not comply with the Monitor Control Command Set (MCCS) specification it claims to support.", message, args);
			case ERROR_GRAPHICS_MCA_MCCS_VERSION_MISMATCH:
				throw new COMStatus("ERROR_GRAPHICS_MCA_MCCS_VERSION_MISMATCH: The MCCS version in a monitor's mccs_ver capability does not match the MCCS version the monitor reports when the VCP Version (0xDF) VCP code is used.", message, args);
			case ERROR_GRAPHICS_MCA_UNSUPPORTED_MCCS_VERSION:
				throw new COMStatus("ERROR_GRAPHICS_MCA_UNSUPPORTED_MCCS_VERSION: The Monitor Configuration API only works with monitors that support the MCCS 1.0 specification, the MCCS 2.0 specification, or the MCCS 2.0 Revision 1 specification.", message, args);
			case ERROR_GRAPHICS_MCA_INVALID_TECHNOLOGY_TYPE_RETURNED:
				throw new COMStatus("ERROR_GRAPHICS_MCA_INVALID_TECHNOLOGY_TYPE_RETURNED: The monitor returned an invalid monitor technology type. CRT, plasma, and LCD (TFT) are examples of monitor technology types. This error implies that the monitor violated the MCCS 2.0 or MCCS 2.0 Revision 1 specification.", message, args);
			case ERROR_GRAPHICS_MCA_UNSUPPORTED_COLOR_TEMPERATURE:
				throw new COMStatus("ERROR_GRAPHICS_MCA_UNSUPPORTED_COLOR_TEMPERATURE: The SetMonitorColorTemperature() caller passed a color temperature to it that the current monitor did not support. CRT, plasma, and LCD (TFT) are examples of monitor technology types. This error implies that the monitor violated the MCCS 2.0 or MCCS 2.0 Revision 1 specification.", message, args);
			case ERROR_GRAPHICS_ONLY_CONSOLE_SESSION_SUPPORTED:
				throw new COMStatus("ERROR_GRAPHICS_ONLY_CONSOLE_SESSION_SUPPORTED: This function can be used only if a program is running in the local console session. It cannot be used if the program is running on a remote desktop session or on a terminal server session.", message, args);
			default:
				throw new COMStatus("Unkown<" + Integer.toHexString(hResult) + ">", message, args);
		}
	}

	private COMStatus(String id, String message, Object... args) {
		super(message == null ? id : (id + " - " + String.format(message, args)));
	}
}
