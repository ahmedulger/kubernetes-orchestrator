var DO = (function(jQuery) {

    var baseUrl = "";

    var listDeployments = function() {
        var deployments;

        jQuery.ajax({
            url: baseUrl + "/deployment/v1",
            type: 'GET',
            dataType: 'json',
            async: false,
            success: function(response, status, jqXHR) {
                deployments = response;
            }
        });

        return deployments;
    };

    return {
        description: 'Makes operations on deployments',
        setBaseUrl: function(baseUrl) {
            this.baseUrl = baseUrl;
        },
        getBaseUrl: function() {
            return baseUrl;
        },
        listDeployments: function() {
            return listDeployments();
        }
    };
})(jQuery);